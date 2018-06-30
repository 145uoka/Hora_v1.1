package com.olympus.hora.constants;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

public class SystemCodeConstants {

    /** エンコード */
    public static final String CHARACTER_ENCODING = "UTF-8";

    public static final String PLEASE_SELECT_MSG = "－－－－";

    public static final String ENABLED = "有効";
    public static final String DISABLE = "無効";

    public static class PATTERN {
        public static final String NUMERIC = "0-9";
        public static final String ALPHABET_LOWERCASE = "a-z";
        public static final String ALPHABET_UPPERCASE = "A-Z";
    }    /**
     * 有効終了日が設定されていない場合の定数
     */
    public static class EffectiveEndDateCode {
        public static final String EFFECTIVE_END_DATE = "-";
    }

    /** 営業日詳細定義レコード定数 */
    public static final Integer WOKING_DETAIL_RECORD_NUM = 10;

    /** 営業日マスタ 登録期間定数（ｘか月先） */
    public static final Integer WOKING_STORE_MONTHS_NUM = 1;



    /**
     * フラグ関連定数。
     */
    public enum Flag {
        ON("1", 1, true),
        OFF("0", 0, false);

        private final String stringValue;
        private final Integer integerValue;
        private final boolean boolValue;
        Flag(String stringValue, Integer integerValue, boolean boolValue) {
            this.stringValue = stringValue;
            this.integerValue = integerValue;
            this.boolValue = boolValue;
        }

        /**
         * 数値からフラグからフラグ定数に変換
         * @param value 数値
         * @return フラグ定数
         */
        public static Optional<Flag> fromInteger(Integer value) {
            return findFirst(flag -> flag.integerValue.equals(value));
        }

        /**
         * 文字列フラグからフラグ定数に変換
         * @param value 文字列
         * @return フラグ定数
         */
        public static Optional<Flag> fromString(String value) {
            return findFirst(flag -> flag.stringValue.equals(value));
        }

        /**
         * 真偽値からフラグ定数に変換
         * @param value 真偽値
         * @return フラグ定数
         */
        public static Optional<Flag> getFlagByBooleanValue(Boolean value) {
            return findFirst(flag -> flag.boolValue == value.booleanValue());
        }

        private static Optional<Flag> findFirst(Predicate<? super Flag> predicate) {
            return Arrays.stream(values()).filter(predicate).findFirst();
        }

        /**
         * 文字列形式を取得。
         * @return 文字列形式
         */
        public String string() {
            return stringValue;
        }
        /**
         * 数値形式を取得。
         * @return 数値形式
         */
        public Integer integer() {
            return integerValue;
        }
        /**
         * 真偽値を取得。
         * @return 真偽値
         */
        public boolean bool() {
            return boolValue;
        }
    }

    /**
     * メッセージタイプ。
     */
    public static class MessageType {
        /** 成功 */
        public static final String SUCCESS = "successMessages";
        /** 通知 */
        public static final String INFO = "infoMessages";
        /** 警告 */
        public static final String WARN = "warnMessages";
        /** エラー */
        public static final String ERROR = "errorMessages";
    }
}
