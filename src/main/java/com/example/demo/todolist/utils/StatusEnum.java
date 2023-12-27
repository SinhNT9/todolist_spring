package com.example.demo.todolist.utils;

import lombok.Getter;

@Getter
public enum StatusEnum {
    NYS(1), PENDING(2), IN_PROCESS(3), DONE(4);
    private int i;

    StatusEnum(int i) {
        this.i = i;
    }
    public static StatusEnum getStatusEnumByValue(int value) {
        // Lấy tất cả các giá trị của enum
        StatusEnum[] values = StatusEnum.values();

        // Kiểm tra mỗi giá trị và trả về giá trị enum tương ứng với giá trị int
        for (StatusEnum status : values) {
            if (status.ordinal() == value) {
                return status;
            }
        }

        // Nếu không tìm thấy, có thể xử lý hoặc trả về giá trị mặc định
        throw new IllegalArgumentException("Invalid enum value: " + value);
    }
}
