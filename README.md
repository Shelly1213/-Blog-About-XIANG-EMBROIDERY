# Blog-About-XIANG-EMBROIDERY
大三上期和本校外国语学院做的网站项目，适配移动端、PC端、可以用HBuilder打包成APP，适合入门

##后端技术栈
Springboot框架、MyBatis。考虑到实际，网站只用到了部分功能，登录注册、Token验证等功能并没有实际放在项目中，但后端代码中有写。

##Build Setup<br>
1、mysql数据库名为vueblog,一个表表名为likenum，表两列为id（int 11）和num(int 11)（用于点赞功能：
`
create table likenum(id,num) values(1,1);
`
2、修改JDBC.properties中username,password,url可用本机localhost

##注意:<br>
后端代码在本项目中用到的文件为:
Controller目录下的outhController.java
Dao目录下的outh.java
Serive目录下的Outh目录的两个文件
Vo目录下的LikeResult.java
