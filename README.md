<h2>Android BadgeViewLib</h2>

This library is an extension of badgeview.

<a href="https://github.com/jgilfelt/android-viewbadger">View BadgeView links</a>

A simple way to "badge" any given Android view at runtime without having to cater for it in layout.
<br />
<h2>How to use？</h2>

<font size=3>Add the following code in build.gradle.</font>

```javascript
  compile 'com.lib.badge:badgeviewlib:1.0'
```
<br />
<h2>Effect</h2>

![image](https://github.com/hanxiaofeng/BadgeViewLib/blob/master/app/src/main/res/drawable/device-2016-07-14-210846.png?raw=true)
<br />
Simple example:

<font size = 3 color="#583294">
```javascript
tvTextOneBadge = new BadgeView(MainActivity.this);
tvTextOneBadge.setmShowPoint(true);
tvTextOneBadge.setTextSize(16f);
tvTextOneBadge.setBadgeCount(5);
tvTextOneBadge.setBadgeGravity(Gravity.LEFT | Gravity.BOTTOM);
tvTextOneBadge.setBackgroundResource(R.mipmap.badge_orange);
tvTextOneBadge.setTargetView(btnOne);
```
</font>

Author: hanxiaofeng

<font size=4>The code in this project is licensed under the Apache Software License 2.0. </font>
<br />
<font size=4>Copyright (c) 2016 readyState Software Ltd.</font>
