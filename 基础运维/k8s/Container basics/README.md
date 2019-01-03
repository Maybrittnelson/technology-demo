[TOC]

### Container basics

#### Linux Operating System Basic

#### Linux Process Management

#### Cgroups

#### Linux Namespaces

> Namespace技术实际上修改了应用进程看待整个计算机“视图”，
>
> 即它的“视线”被操作系统做了限制，只能“看到”某些指定的内容

* pros
  * **高性能：**用户应用运行在虚拟机里，它对宿主机操作系统的调用就不可避免地要经过虚拟化软件的拦截和处理这本身又是一层性能损耗，尤其对计算资源、网络和磁盘I/O的损耗非常大。而相比之下，容器化后的用户应用，却依然还是一个宿主机上的普通进程，这就意味着这些因为xu

#### Rootfs & Container Image

#### Image Registry





