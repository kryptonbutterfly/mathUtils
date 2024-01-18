# mathUtils [![Maven Package](https://github.com/kryptonbutterfly/mathUtils/actions/workflows/maven-publish.yml/badge.svg)](https://github.com/kryptonbutterfly/mathUtils/actions/workflows/maven-publish.yml)

## Contents

Utility           | Description
:---------------: | :----------
Limit.clamp       | takes 3 numbers. A lower bound an upper bound and a value to be restricted to be between the lower and upper bound
Limit.inRange     | takes 3 numbers. A lower bound an upper bound and a value to be checked to be between the lower and upper bound
Limit.assertLimit | takes 3 numbers. A lower bound an upper bound and a value to be asserted to be between the lower and upper bound. If this condition is not met an exception will get thrown
Range   | an iterable that either supplies an index, an element or both (see example)
Min     | contains min functions for every primitive (see java.lang.Math#min)
Max     | contains max functions for every primitive (see java.lang.Math#max)

## Getting the latest release

```xml
<repository>
  <id>github</id>
  <url>https://maven.pkg.github.com/kryptonbutterfly/maven-repo</url>
</repository>
```

```xml
<dependency>
  <groupId>kryptonbutterfly</groupId>
  <artifactId>math_utils</artifactId>
  <version>2.0.0</version>
</dependency>
```

## Download

java version | library version | Download
:----------: | :-------------: | :-------
18+          | 2.0.0           | [**math_utils-2.0.0.jar**](https://github-registry-files.githubusercontent.com/731108692/9a730e80-b64e-11ee-8b97-bfec54dcfa3c?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240118%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240118T211359Z&X-Amz-Expires=300&X-Amz-Signature=17114c480a45c11304243cac13aa23d089732674bae44fdb1222f3cbf0781aba&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=731108692&response-content-disposition=filename%3Dmath_utils-2.0.0.jar&response-content-type=application%2Foctet-stream)
18+          | 1.1.0           | [**math_utils-1.1.0.jar**](https://github-registry-files.githubusercontent.com/731108692/1d98cb80-a59f-11ee-9d01-4b7c029b5d47?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20231228%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20231228T153553Z&X-Amz-Expires=300&X-Amz-Signature=d6816090c74473726c78e3778509ef60c9a8c703937cf1bbf9ac6a0ccff2f41d&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=731108692&response-content-disposition=filename%3Dmath_utils-1.1.0.jar&response-content-type=application%2Foctet-stream)
18+          | 1.0.0           | [**MathUtils.jar**](https://github.com/kryptonbutterfly/mathUtils/releases/download/v1.0.0/MathUtils.jar)

## Examples
#### Range
```java
String[] array = { "Hello,", "Range!" };
for (var ie : Range.range(array))
    System.out.println(ie.index() + " -- " + ie.element());
```
Output:
```bash
0 -- Hello,
1 -- Range!
```
#### Range.index()
```java
String[] array = { "Hello,", "Range!" };
for (int index : Range.range(array).index())
    System.out.println(index);
```
Output:
```bash
0
1
```
#### Range.element()
```java
String[] array = { "Hello,", "Range!" };
for (String element : Range.range(array).element())
    System.out.println(element);
```
Output:
```bash
Hello,
Range!
```
#### int Range
```java
int start = 1, stop = 5;
for (int i : Range.range(start, stop))
    System.out.println(i);
```
Output:
```bash
1
2
3
4
```
#### String Range
```java
for (char c : Range.range("AbC").reverse().element())
    System.out.println(c);
```
Output:
```bash
C
b
A
```
#### Min.min
```java
System.out.println(Min.min(5, -10, 2));
```
Output:
```bash
-10
```
#### Max.max
```java
System.out.println(Max.max(5, -10, 2));
```
Output:
```bash
5
```