# ScreenReceiver
特殊广播接收者，接收屏幕解锁和锁屏广播，清单文件配置无效，需要代码中注册。在Activity中注册屏幕解锁和锁屏广播接收者，则应用退出无效，需在服务中注册才能永久生效。