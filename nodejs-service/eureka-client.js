const Eureka = require('eureka-js-client').Eureka;

exports.register = function () {
    const client = new Eureka({
        // application instance information
        instance: {
            app: 'nodejs-service',
            hostName: 'localhost',
            ipAddr: '127.0.0.1',
            statusPageUrl: 'http://localhost:3000',
            vipAddress: 'nodejs-service',
            port: {
                $: 3000,
                '@enabled': 'true',
            },
            dataCenterInfo: {
                '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
                name: 'MyOwn',
            },
        },
        eureka: {
            // eureka server host / port
            host: 'localhost',
            port: 8761,
            servicePath: '/eureka/apps/',
        },
    });
    client.start();
};