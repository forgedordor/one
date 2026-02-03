package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum dbxl implements evst {
    D2D_NOT_SET(0),
    D2D_TEST_APPLICATION(1),
    D2D_GOOGLE_MESSAGES(2),
    D2D_IOS_MESSAGES(3),
    D2D_OS_MIGRATION(4),
    FUTURE_D2D_SOURCE_TYPE1(5),
    FUTURE_D2D_SOURCE_TYPE2(6),
    FUTURE_D2D_SOURCE_TYPE3(7),
    FUTURE_D2D_SOURCE_TYPE4(8),
    FUTURE_D2D_SOURCE_TYPE5(9),
    FUTURE_D2D_SOURCE_TYPE6(10),
    FUTURE_D2D_SOURCE_TYPE7(11),
    FUTURE_D2D_SOURCE_TYPE8(12),
    FUTURE_D2D_SOURCE_TYPE9(13),
    FUTURE_D2D_SOURCE_TYPE10(14),
    UNRECOGNIZED(-1);

    private final int r;

    dbxl(int i) {
        this.r = i;
    }

    public static dbxl b(int i) {
        switch (i) {
            case 0:
                return D2D_NOT_SET;
            case 1:
                return D2D_TEST_APPLICATION;
            case 2:
                return D2D_GOOGLE_MESSAGES;
            case 3:
                return D2D_IOS_MESSAGES;
            case 4:
                return D2D_OS_MIGRATION;
            case 5:
                return FUTURE_D2D_SOURCE_TYPE1;
            case 6:
                return FUTURE_D2D_SOURCE_TYPE2;
            case 7:
                return FUTURE_D2D_SOURCE_TYPE3;
            case 8:
                return FUTURE_D2D_SOURCE_TYPE4;
            case 9:
                return FUTURE_D2D_SOURCE_TYPE5;
            case 10:
                return FUTURE_D2D_SOURCE_TYPE6;
            case 11:
                return FUTURE_D2D_SOURCE_TYPE7;
            case 12:
                return FUTURE_D2D_SOURCE_TYPE8;
            case 13:
                return FUTURE_D2D_SOURCE_TYPE9;
            case 14:
                return FUTURE_D2D_SOURCE_TYPE10;
            default:
                return null;
        }
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
