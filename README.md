# KeepChunksLoaded - Bukkit plugin to keep all chunks loaded

A simple plugin to prevent chunks from unloaded.  This is (usually) a bad idea, so outside of a few rare situations this plugin should never be used.  

If you do choose to use this plugin (or another like it), you MUST set a world border at a reasonable size AND have an extremely large amount of memory available and ALLOCATED to the JVM.  It is not enough to just have the memory installed in the system, you must allow the JVM to use it with the -Xmx parameter.  Use of this plugin is not advised with less than 16GB of ram allocated to the JVM, unless you have a very small world border.
