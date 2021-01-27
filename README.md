# Python语法

## 一、基本数据类型:

1. 一般来讲就是没有数据类型，只有name，object。
2. 标准讲则是： 数字类型Numbers，布尔值，字符串str，列表list，元组tuple， 字典Dictionry，集合set。

### Numbers

1. 科学技术法使用e表示：178 = 1.78e2

### Boolean

1. 使用True/False表示（大写），也就是0和1。

### String

1. 三引号/双引号/单引号交错使用

   > '<a style = "color : red">哈哈哈< /a>'。
   >
   >  三引号可以多行表示。

2. 转译字符  

   > 用特殊的方法表示出一系列不方便写出的内容，使用反斜杠 \

3. 字符串的格式化

   > 把字符串按照一定的格式打印或者填充
   >
   > 1. 利用百分号
   > 2. 使用format函数 "".format()

## 二、重要的运算符

### 算数运算符

* "+" "-" "*" "/" "%" "//" "**"   python没有自增自减运算符

### 逻辑运算符

* 对布尔值进行运算   and逻辑与  or逻辑或  not逻辑非     python的逻辑运算中没有异或运算

### 成员运算符

* 用来检测某一个变量是否是另一个变量的成员。 

* 使用 in  ； not in

### 身份运算符

* is 用来检测两个变量是否是同一个变量(是否指向同一个内存)
* is not 不是 

## 三、程序结构

### 分支

``` python
if 条件表达式:
	语句1
	语句2
	...
elif elseif表达式:
	语句1
	...
else:
	语句1
	...
```

如果if后面出现的语句，属于同一个if语句，则必须在同一个缩紧中。

python中没有 switch-case

### 循环

```python
for循环 -->
    for 变量 in 序列:
        语句1
        语句2
        ...
for-else --> 当for循环结束的时候，会执行else语句。
```

```python
while循环 -->
	while 条件表达式:
		语句快
	else:
		print("while执行完后执行该语句")
```

### range

```python
1.生成一个数字序列 range(0,10)
2.在python中由表示数字范围的两个数，都是包含左边不包含右边。randint是特列，它左右都包含。
```

## 四、函数

```python
定义一个函数：
	def 函数名(参数名):
		语句块
		...
		return 返回值
调用函数:
	函数名(参数名)
example-->
	def person(name):
    	return "你好,{0}".format(name)
    	#python变态的缩进
	print(person("sank"))
```

### 参数类型

* 普通参数： 一个形参对应一个实参
* 默认参数：定义方法参数时为参数赋上默认值
* 关键字参数：形参与实参都采用等号赋值的形式

```python
收集参数：将参数放入一个特定的数据结构中,收集参数可以与其他参数并存。
example-->
	def func(*args):
		func_body
		#按照list方式访问args得到参数
	调用-->
	func(p1,p2,p3,p4...)
关键字收集参数：   
	def func(**kwargs):	#访问kwargs时需要使用字典形式进行访问
		func_body
	调用-->
	func(p1=v1,p2=v2,p3=v3....)
```

> 参数混合调用优先级：普通参数>默认参数>关键字参数>收集参数tuple>收集参数list

```python
收集参数混合调用案例-->
	def person(name, age, weight, *args, cengyongming="无", **kwargs):
    	print("大家好,我是{0},我今年{1}岁,我的体重是{2},我的曾用名{3}".format(name, age, weight, 				cengyongming))
    	print("*" * 20)
    	for i in args:
        	print(i)
    	print("#" * 20)
    	for k, v in kwargs.items():
        	print(k, "----", v)

	person("sank", 22, 120, "sank", cengyongming="Sank", q="zha", z="zhan")
```

> list/dict放入args中，如果想要分开每一个参数，则需要解包，即在实参前加上星号，dict需要加上两个星号。

### 变量作用域

```python
全局(global)：在函数外部定义的变量
局部(local)：在函数内部定义的变量
```

> 提升局部变量为全局变量，使用global关键字

### 内建函数

```python
globals()，locals()函数可以找到所有的全局变量与局部变量
eval()函数可以将字符串当成表达式来执行，有返回结果
exec()函数也可以将字符串当成代码来执行，但是没有返回结果
```

## 五、python内置的数据结构

### list	>>	一组有顺序的数据的集合

```python
对列表的访问 --> for循环便利。使用索引进行访问
list中最后一个元素的下标值也可以为-1，依次往前推，-1，-2，-3...
对列表的分片操作 --> listName[x:y:z]，访问list中下标x到下标y-1的元素，增长幅度为z，x和y都可以超出list的	 最大限制，x超出后则x默认为0，y超出后则y的默认值为list.__len__()。z如果为负数则
```

```python
del 删除元素命令
	del list[x]  -->	删除指定下标为x的元素，删除原地址中的元素
+	列表相加
	list1 + list2	--> 	将list1中的元素依次放入list2中
*	列表相乘
	list1 * n	-->		相当于将n个list1列表拼接在一起
in	成员资格运算	not in
	a in list1	-->		判断list1中是否有a这个元素，返回值是一个布尔值。
```

```python
# 双层嵌套列表
a = [[1, 2, 3], [2, 4, 5], ["sank", True, "s"]]
for x, y, z in a:
	print(x, y, z)
```

```python
# 列表内涵(list content)-->通过简单方法创建列表
a = [1, 2, 3]
b = [i for i in a]
print(b)    # b --> [1, 2, 3]
print(id(b) == id(a))   # 结果为False，地址不一样
---------------------------------------------------------------------------------------------
# 将a中的所有偶数复制到b中
a = [x for x in range(1, 20)]
b = [m for m in a if m % 2 == 0]
print(b)
---------------------------------------------------------------------------------------------
# 列表内涵可以嵌套
a = [x for x in range(1, 3)]
b = [y for y in range(3, 6)]
c = [m+n for m in a for n in b]		# 依次相加
print(c)    # [4, 5, 6, 5, 6, 7]
```

```python
list的常用函数
len(l)	返回list的大小
max(l)	返回list中的最大值
min(l)	返回list中的最小值
list(type)	将字符串中的每一个字符转换成list中的每一个元素,形成一个list。要求type必须是可迭代的类型。
```

```python
list自带的函数
list.append(x)	在末尾添加一个元素x
list.insert(index,data)	在list中下标为index的位置上插入元素data
list.pop(index)	删除list中下标为index的元素，如果不传index则默认删除最后一个元素。
list.remove(data) 删除list中第一个出现的data元素。
list.count(x) 返回list中x元素出现的次数。
list.clear() 清空list中的所有元素。
list1.extend(list2) 将list2中的元素全部添加到list1中。
```

### set	>>	一堆确定的无序的唯一的数据

```python
集合的定义：
	s = set()
	s = {1, 2, 3, 4, 5}		{}中必须有值才是set()，否则是dict
```

```python
集合的特征:
	无序，无法使用索引，分片
	唯一性，没有重复的元素
	内部只能放可哈希的数据
```

```python
集合的操作:
	成员检测:in  not in
```

```python
集合的基本函数和集合的内涵与list大致相同
remove()与discard()的区别是:如果要移除的元素不存在，remove会报错而discard不会报错。
集合独有的函数:
	intersection():交集
	difference():差集
	union():并集
	issubset():检查一个集合是否为另一个集合的子集
```

```python
frozenset:冰冻集合
	s = frozenset()
	不可以进行任何修改的集合
```

### dict	>>	一组没有顺序的组合数据，以键值对的形式出现

```python
字典的创建:
	d = {}	#空字典
	d = {"one":1, "two":2, "three":3}		#创建带值的字典
	d = dict(one=1, two=2, three=3)			#使用dict创建
```

```python
字典的特征:
	key必须可哈希，如int,string,float,tuple，但是list,set,dict不行。
	value:任何值。
```

```python
字典的操作:
	d = {key1:value1, key2:value2, key2:value2}
	1、访问数据:
		print(d[key])
	2、删除数据:
		del d[key]
	3、成员检测:
		in / not in
		检测的是key而不是value
```

### tuple	>>	可以看成一个不可更改的list

```python
创建一个空元组		 -->   	t = ()
创建一个值的元组	-->		t = (1,) 或者 t = 1,
创建多个值的元组	-->		t = (1,2,3,4,5) 或者 t = 1,2,3,4,5
使用tuple函数创建   -->	tuple(type)	: type必须是可迭代的类型。
```

```python
元组的特性：
	1.元组是有序的
	2.元组可以访问，但不可以修改
	3.元组数据可以是任意类型
	4.list的所有特性，除了可修改之外，元组都具有。
```

## 六、OOP

```python
定义一个类:
	class Student():
		name = None
		def func(self):
			print(self.name)
			psss
			return None
定义一个对象:
	sank = Student()
```

```
一个类中的属性既可以由对象调用，也可以使用类名调用。 
```

### self参数

```python
self不是一个关键字，只是一个用于接受对象的普通参数，可以用其他字母代替。
在一个类中，带self参数的方法称为非绑定方法，可以通过对象和类名调用，不带self参数的方法称为绑定方法，只能使用类		名进行调用。
在一个类中，如果想要在不带self参数的方法中，访问类的成员变量，可以使用__class__进行访问。
```

### 类的构造函数

```python
使用__init__方法作为类的构造方法。
	class Person:
        name = None
        age = None
        def __init__(self):
            self.name = "sank"
            self.age = 23
        def doWork(self):
            print(self.name, self.age)
	p = Person()
	p.doWork()
构造函数只能通过对象进行访问，不能直接通过类名进行访问，可以使用Person.doWorl(p)进行访问。
```

### OOP的三大特性

```python
封装：
	public		-->	一个变量/函数默认是公有的
	protected	-->	使用_变量名/_函数名命名的变量/函数是受保护的变量/函数。
	private 	-->	使用__变量名/__函数名命名的变量/函数是私有变量/函数，python中的私有不是真的私有，而是			更改了变量名，可以通过（对象名._类名__变量名）进行访问。
继承,多态：			# python支持多继承
	class Person(object):
		name = "sank"
		age = 23
		def sleep(self):
			print("sleeping")
		def work(self):
			print("工作")
			
	class Sank(Person):
		name = "jack"
		age = 230
		def sleep(self):
			print(super().name)		# 输出sank，也可以使用Person.name来调用父类的成员
		def student(self):
			print("学习")
		def	work(self):		# 子类重写父类的方法。
			self.student()
			Person.work(self)
```

### 抽象

```Python
# 定义一个抽象类:
# 首先导入abc类
import abc


class Person(object):
    name = None
    age = None

    @abc.abstractmethod
    def eat(self):
        pass


class Man(Person):
    def eat(self):
        print("eat meat")


class Woman(Person):
    def eat(self):
        print("eat fruits")
```

## 七、包

```python
导入包:
	import package_name		# 可以直接使用__init__.py模块中的内容
导入模块:
    import package_name.module.name		# 直接导入包下的模块
起别名:
    import module_name/package_name as m		# m则是导入的模块/包名的别名
无前缀导入：
	from module_name import module_funcation	# 可以直接使用模块中的方法
同一包下:
    from package_name import module_name	# 在同一个包下使用
    from package_name import *			#只导入__init__模块下的所有内容
```

```python
系统常用的模块
	1、calendar
	2、time			# 主要	time.time()
	3、datetime
	4、timeit
	5、os
	6、shutil
	7、zip
	8、math
```

## 八、异常

```python
定义异常:
    try:
        代码块
    except 异常类型1 as e:
    	针对异常1的解决方案。
    except 异常类型2 as e:
        针对异常2的解决方案。
    else:
        如果没有异常，则执行这段代码块
    finally:
        无论有没有异常，都执行这段代码块。
```

```
手动抛异常:
	使用raise关键字
```

```python
自定义异常:		# 必须继承系统自带的异常
    class SankError(ValueError):
        pass
```

## 九、 Python高级

### 函数式编程	>>	基于lambda演算的一种编程方式,程序中只有函数。

```python
s = lambda x, y: x * y
s(1, 4)
```

### 高阶函数	>>	将函数作为参数使用的函数

```python
# map()	
    l1 = [1, 2, 3, 4, 5, 6]
    l2 = map(lambda x: x * 10, l1)
    print(list(l2))
# reduce()	合并
	from functools import reduce
    l1 = [1, 2, 3, 4, 5, 6]
    l2 = reduce(lambda x, y: x * y, l1)
    print(l2)
# filter()	对一组数据进行过滤，符合条件的数据会返回生成一个新的列表
	l0 = [1, 3, 53, 3443, 3434232, 323, 323, 67888, 8]
    l1 = filter(lambda x: x % 2 == 0, l0)
    print(type(l1))		# <class 'filter'>
    print(list(l1))		# [3434232, 67888, 8]
# sorted()	对一个可迭代对象进行排序
	l0 = [1, 3, 53, 3443, 3434232, 323, 323, 67888, 8]
    l1 = sorted(l0, reverse=True)		# reverse=False时，正序
    print(l1)		# [3434232, 67888, 3443, 323, 323, 53, 8, 3, 1]
# zip()	把两个可迭代内容生成一个可迭代的tuple元素类型组成的内容
	l1 = [i for i in range(1, 6)]
    l2 = [i for i in range(1, 60) if i % 10 == 0]
    z = zip(l1, l2)
    print(list(z))		# [(1, 10), (2, 20), (3, 30), (4, 40), (5, 50)]
# enumerate()	# 为可迭代的对象中每一个元素配上索引，以tuple类型返回
	l1 = [i for i in range(1, 6)]
    e = enumerate(l1, start=0)		#start=x,索引的下标从x开始
    for i in e:
    	print(i, end="\t")		# (0, 1)	(1, 2)	(2, 3)	(3, 4)	(4, 5)
```

### 返回函数	>>	函数返回一个函数

```python
def lazy_sum(*args):
    def sum():
        ax = 0
        for arg in args:
            ax += arg
        return ax
    return sum

f = lazy_sum(1, 2, 3)
print(f)
print(f())
```

### 闭包

```python
定义：
	在一个函数的内部再次定义一个函数，并且内部的函数应用了外部函数的参数或者局部变量，当内部函数被当作返回值时，相关参数和变量保存在返回的函数中，这种结果叫做闭包。
重要：
	返回闭包时，建议不要引用任何的循环变量,如果引用了，可以放在另一个函数中。
```

```python
def a():
    def f(j):		# 将闭包放在另一个函数中。
        def g():
            return j * j
        return g
    fs = []
    for i in range(1, 4):
        fs.append(f(i))
    return fs

c1, c2, c3 = a()
print(c1())
print(c2())
print(c3())
```

### 装饰器	>>	在不改动代码的前提下，无限制扩展函数功能

```python
使用:
	在需要扩展的函数定义前加上-->@函数名
    import time
    def printTime(f):	# 传入一个函数
        def wrapper(*args, **kwargs):	# 再定义一个函数
            print(time.time(), end="\t")	
            return f(*args, **kwargs)	# 返回传入的函数,并调用该函数
        return wrapper	# 返回函数

    @printTime
    def sayHello():
        print("hello")

    sayHello()	#Fri Feb 15 16:51:03 2019	hello

上面代码是按照系统的规定的语法糖进行调用的，必须按照这个格式。
```

### 偏函数

```python
1、使用funcools模块
2、将一个函数的某些参数固定
    import functools

    int16 = functools.partial(int, base=16)
    print(int16("12345"))
```

## 十、文件操作

```python
操作文件的函数:
	open(path, mode)
		1、path:文件的路径
		2、mode参数：
			r:只读	w:写入(覆盖之前的内容,如果文件不存在则创建)	x:创建	a:追加的方式进行写入
			b:二进制的方式写入	t:文本方式打开	+:可读写
# with语句自动判断文件的作用域，自动关闭不再使用的文件句柄
with open(r"text.txt", "w") as f:
    pass    # 开始对文件f进行操作
# 读取
with open(r"text.txt", "r") as f:
    strLine = f.readline()  # 按行读取
    while strLine:      # 标准的的读取文件结构，也可以用list
        print(strLine)
        strLine = f.readline()
```

##十一、多线程

```python
使用:
	使用threading.Thread生成Thread实例。
		t = threading.Thread(target=func_name, args=(xxx,))	
        t.start() 	# 启动多线程
        t.join()	# 等待多线程执行完成
常用属性:
    threading.currentThread		# 返回当前线程变量
    threading.enumerate			# 返回一个当前正在运行的线程的list(里面是线程实例)
    threading.activeCount		# 返回正在运行的线程数量
    t.setName	
    t.getName
锁:
    生成一把锁:
        lock = threading.Lock()
        lock.acquire()	# 加锁
        lock.release()	# 解锁
```

### 守护线程

```python
	一个非守护线程在主线程执行完成后还会继续执行，但是一个守护线程会伴随主线程的死亡而死亡。
设置一个线程为守护线程:
	t = threading.Thread(target=func_name, args=(xxx,))	
	t.daemon = True		# 设置守护线程
	t.start()
```

## 十二、协程

### 可迭代、迭代器、生成器

```python
可迭代(iterable):可以直接作为for循环的变量
迭代器(iterator):可以作为for循环变量，也可以使用next()访问。
	1、使用isinstance来判断是否为一个迭代器/可迭代对象
	2、可以使用iter()函数将一个iterable转换为iterator
生成器(generator):函数中包含yield关键字
    def Person():
    yield 1
    yield 2
    
    p = Person()
    print(next(p))  # 1
    print(next(p))  # 2
    # print(next(p))  报错
```

### 协程

```python
3.4引入协程，3.5引入协程语法，使用yield实现。协程的包:asyncio、tornado、gevent
实现：
	# yield返回	send调用	yield from通道
	def simple1(a):
    print("start")
    x = yield a 
    print("end", x)
    
    try:
        s = simple1(1)    # 生成一个协程
        print("----")
        print(next(s))  # 1
        print("----")
        s.send(10)      # 将10负值给x
    except StopIteration as s:
        print(s.value)  # None
```

## 十三、正则表达式

```python
RE使用步骤:
	1、使用compile将表示正则的字符串编译成一个pattern对象
	2、通过pattern对象提供的属性/方法对文本进行查找匹配，匹配结果为一个Match对象
    3、使用Match对象提供的属性和方法获得信息，根据需要进行操作。
RE常用函数:
    group()
    start()
    end()
    span()
RE代码示例:
    import re

    p = re.compile(r"\d*")
    m = p.match("12334455a22",3,6)	#表示在字符串中查找的范围,match只会查找一次，找到后不会在继续找。
    print(m)				# <_sre.SRE_Match object; span=(3, 6), match='344'>
    print(m[0])				# 344
    print(m.start())		# 3
    print(m.end())			# 6
    print(m.span())			# (3, 6)
```

```python
- .(点号):表示任意一个字符，除了\n，查找所有字符的一个字符\.
- []	:匹配括号中列举的任意字符,比如[L,Y,O]。	# 对:LLYO 错:YIO
- \d	:表示任意一个数字
- \D	:除了数字都可以
- \s	:表示空格键、tab键
- \S	:除了空格键都行
- \w	:单词字符	# a-z A-Z 0-9 _
- \W	:除了 a-z A-Z 0-9 _ 都可以
- *		:表示前面内容重复零次或多次	# \w* 表示(a-z A-Z 0-9 _)出现多次都可以
- +		:表示前面内容至少出现一次
- ?		:前面出现的内容零次或者一次
- {m,n}	:允许前面字符出现最少m次，最多n次
- ^		:匹配字符串的开始
- $		:匹配字符串的结尾
- \b	:匹配单词的边界
```



























