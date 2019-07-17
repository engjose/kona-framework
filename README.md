# kona-framework
## 模块划分
我这里将整个项目分为以下几个模块划分,具体每个模块做什么事情以及为什么要这么划分,后面会一一介绍:
- kona-framework-common(基础模块)
- kona-framework-config(配置模块)
- kona-framework-model(模型模块)
- kona-framework-integration(集成模块)
- kona-framework-dao(持久层模块)
- kona-framework-service(service模块)
- kona-framework-web(web层模块)
- kona-framework-facade(facade模块)

## 为什么要这么划分
- 职责清晰: 我们每个Moudle只做自己的事情
- 便于管理: 大的Moudle拆解成小的Moudle, 每个Moudle便于管理
- 降低耦合: 将强依赖拆解成插件形式

## 模块功能
### kona-framework-common
管理一些公共的东西,以及引入了公共base:
- base-bundle-message的引入,错误码的生成模块
- util工具类的模块
- 引入基础的jar包 kona-base-lib, kona-framework-model(自己的model模块)...

### kona-framework-model
模型模块,我们将模型分为bo, po, dto, vo
- 模型模块引入了基础模型包依赖 kona-base-model

### kona-framework-config
配置模块, 配置模块主要做一些配置文件的引入, 和配置中心接入等等..., 有java配置和yml等两种配置方式, 引入了kona-framework-common模块

### kona-framework-integration
集成模块, 主要对接一些消息, rpc外部调用接口对接的模块, 依赖 kona-framework-config

### kona-framework-service
业务模块,依赖了kona-framework-dao(持久层) 和 kona-framework-integration 集成模块

### kona-framework-facade
这个是给外部提供api调用的模块, 只依赖kona-framework-common, && spring-cloud-starter-openfeign

## 说明
上面的这套划分是在企业中的摸索和总结, 当然每个公司有自己的一套规范和规则, 上面这个划分只是自己认为的比较好的一种方式, 具体的详情见代码中

