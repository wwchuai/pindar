### 1. 项目介绍

> 品达物流基于springcloud微服务架构主要包括订单管理、配载作业、调度分配、行车管理、GPS车辆定位系统、车辆管理、线路管理、车次管理、人员管理、数据报表、基本信息维护等模块。
>
> 该系统对车辆、驾驶员、线路等进行全面详细的统计考核，能大大提高运作效率

### 2. 环境依赖

> 品达物流项目开发环境依赖

### 3. 项目结构

> - pindar-common：项目公共工具包
> - pindar-common-db：项目数据库接口层 mapper，接触数据库原始操作层
>   - pindar-dispatch-db：项目智能调度数据库
> - pindar-config：项目公共模块配置
>   - pindar-db-config：项目数据库操作层公共配置
> - pindar-gateway：项目网关入口调用服务
>   - pindar-dispatch-gateway：智能调度网关服务
>
> - pindar-service：项目服务实现层层，实现服务接口，体现具体方法
>   - pindar-dispatch-service：智能调度服务实现
> - pindar-service-api：项目服务接口层，为项目解耦合
>   - pindar-dispatch-service-api：智能调度服务接口
> - pindar-web：项目服务最终调用及第三方服务调用，服务调用

