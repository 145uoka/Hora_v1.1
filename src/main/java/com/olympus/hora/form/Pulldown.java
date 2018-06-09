package com.olympus.hora.form;

import java.util.List;

public class Pulldown {
    private List<Record> list;

    public List<Record> getList() {
        return list;
    }

    public void setList(List<Record> list) {
        this.list = list;
    }
    public static final class Record {
        private Integer code;
        private String name;
        /**
         * @return code
         */
        public Integer getCode() {
            return code;
        }
        /**
         * @param code セットする code
         */
        public void setCode(Integer code) {
            this.code = code;
        }
        /**
         * @return name
         */
        public String getName() {
            return name;
        }
        /**
         * @param name セットする name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
}
