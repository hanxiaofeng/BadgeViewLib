<h2>Android BadgeViewLib</h2>

This library is an extension of badgeview.

<a href="https://github.com/jgilfelt/android-viewbadger">View BadgeView links</a>

A simple way to "badge" any given Android view at runtime without having to cater for it in layout.

![image](https://github.com/hanxiaofeng/BadgeViewLib/blob/master/app/src/main/res/drawable/device-2016-07-14-210846.png?raw=true)

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

The code in this project is licensed under the Apache Software License 2.0. 
Copyright (c) 2016 readyState Software Ltd.
