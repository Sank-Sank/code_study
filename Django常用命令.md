# Django常用命令
## 创建一个django项目
```python
先配置django-admin为环境变量，进入到指定目录下:
	django-admin startproject project_name
```
## 启动django
```
进入创建的django项目目录下:
	python manage.py runserver
```
## 退出django服务(cmd)
```
	ctrl + pause(break)
```
## 创建APP
```
	python manage.py startapp app_name
```

# urls与views的简单案例

```python
首先新建立一个app x
在urls.py中添加：
	from x import x_urls	# 导入app的urls文件
	url(r'^x/', include(x_urls)),
# 在app目录下创建x_urls.py文件，将所有关于x的路由导入x的app模块中
在x_urls文件中编写：
	from django.conf.urls import include, url
    from . import views	# 导入views文件
    urlpatterns = [
        url(r'sank/',views.sank),
    ]
views中编写函数：
	def sank(request):
		return HttpResponse("is sank?")
启动Django，在网页输入：
	http://127.0.0.1:8000/x/sank
返回成功
```

### 反向解析

```python
url(r'sank/',views.sank, name="sss"),
加上name之后可以在views中使用reverse("sss")，改过正则之也不会改变(大致意思)
views中加入：
	from django.core.urlresolvers import reverse
```

### 小细节

```
1、如果想要在异常情况下直接抛出404，可以使用:
	raise Http404(需要导入包)
2、在setting中关闭Debug，不会返回异常信息。
```

### request参数

```python
rst = ""
for k, v in request.GET.items():
	rst += k + '--' + v
	rst += ","
print(rst)	# 打印出请求的参数
```

### Django后台常驻
```
nohup python manage.py runserver 0.0.0.0:5008 &
appending output to nohup.out  # 指定输出文件
```

### 强制结束端口
```
fuser -k -n tcp 8000
```
