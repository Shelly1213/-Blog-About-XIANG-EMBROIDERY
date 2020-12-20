# Blog-About-XIANG-EMBROIDERY
  大三上期和本校外国语学院做的网站项目，适配移动端、PC端、可以用HBuilder打包成APP，适合入门,main分支为前端vue代码，后端代码在另一个分支

## 后端技术栈<br>
  Springboot框架、MyBatis。考虑到实际，网站只用到了部分功能，登录注册、Token验证等功能并没有实际放在项目中，但后端代码中有写。

## Build Setup <br>
  1、mysql数据库名为vueblog,一个表表名为likenum，表两列为id（int 11）和num(int 11)（用于点赞功能)：<br>
 `
create table likenum(id,num) values(1,1);
 `<br>
  2、修改JDBC.properties中username,password,url可用本机localhost<br>

## 注意:
  后端代码在本项目中用到的文件为:<br>
  Controller目录下的outhController.java<br>
  Dao目录下的outh.java<br>
  Serive目录下的Outh目录的两个文件<br>
  Vo目录下的LikeResult.java<br>
