package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enba implements evst {
    UNKNOWN_OPERATION(0),
    MAINTENANCE_SYNCLET(1),
    POSITIVE_DELIVERY_RECEIPT_PROCESSOR(2),
    POSITIVE_DELIVERY_RECEIPT_SENDER(3),
    NEGATIVE_DELIVERY_RECEIPT_PROCESSOR(4),
    NEGATIVE_DELIVERY_RECEIPT_SENDER(5),
    DISPLAY_RECEIPT_PROCESSOR(6),
    DISPLAY_RECEIPT_SENDER(7),
    SENDING_MESSAGE(8),
    RECEIVING_MESSAGE(9),
    DEBUG_MENU(10),
    OPEN_CONVERSATION(11),
    ADD_USER_TO_GROUP(12),
    REMOVE_USER_FROM_GROUP(13),
    UNIT_TEST(14);

    public final int p;

    enba(int i) {
        this.p = i;
    }

    public static enba b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_OPERATION;
            case 1:
                return MAINTENANCE_SYNCLET;
            case 2:
                return POSITIVE_DELIVERY_RECEIPT_PROCESSOR;
            case 3:
                return POSITIVE_DELIVERY_RECEIPT_SENDER;
            case 4:
                return NEGATIVE_DELIVERY_RECEIPT_PROCESSOR;
            case 5:
                return NEGATIVE_DELIVERY_RECEIPT_SENDER;
            case 6:
                return DISPLAY_RECEIPT_PROCESSOR;
            case 7:
                return DISPLAY_RECEIPT_SENDER;
            case 8:
                return SENDING_MESSAGE;
            case 9:
                return RECEIVING_MESSAGE;
            case 10:
                return DEBUG_MENU;
            case 11:
                return OPEN_CONVERSATION;
            case 12:
                return ADD_USER_TO_GROUP;
            case 13:
                return REMOVE_USER_FROM_GROUP;
            case 14:
                return UNIT_TEST;
            default:
                return null;
        }
    }

    @Override // defpackage.evst
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
