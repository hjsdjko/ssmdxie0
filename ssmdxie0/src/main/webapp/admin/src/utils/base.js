const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmdxie0/",
            name: "ssmdxie0",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmdxie0/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "自修室预约系统小程序"
        } 
    }
}
export default base
