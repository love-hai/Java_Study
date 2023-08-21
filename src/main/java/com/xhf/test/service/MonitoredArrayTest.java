package com.xhf.test.service;

/**
 * @projectName: test
 * @package: com.xhf.test.service
 * @className: MonitoredArrayTest
 * @descriptions:
 * @author: xiahaifeng
 * @createDate: 2023/8/12 10:35
 * @updateUser: xiahaifeng
 * @updateDate: 2023/8/12 10:35
 * @updateRemark:
 * @version: v1.0
 */

public class MonitoredArrayTest {
    public static void main(String[] args) {
        MonitoredArray monitoredArray = new MonitoredArray();

        ArrayChangeListener arrayChangeListener =newSize-> {
            System.out.println("Array size increased to: " + newSize);
            Thread thread = new Thread(() -> {
                int i = 0;
                while (true) {
                    i++;
                    if(i >=10){
                        break;
                    }
                    System.out.println("I'm running in a separate thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        };

        monitoredArray.addElement("xia"); // This will trigger the listener
        monitoredArray.addElement("hai"); // This will trigger the listener
    }
}
