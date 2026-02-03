package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eoay implements evst {
    DIFFERENCE_TYPE_UNKNOWN(0),
    DIFFERENCE_TYPE_SUBSCRIPTION_ADDED(1),
    DIFFERENCE_TYPE_SUBSCRIPTION_REMOVED(2),
    DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_NON_PII_FIELDS(3),
    DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_SIM_ID(4),
    DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_IMSI(5),
    DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_PHONE_NUMBER(6),
    DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_ICCID(7),
    DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_FORMATTED_PHONE_MSISDN(8),
    UNRECOGNIZED(-1);

    private final int l;

    eoay(int i) {
        this.l = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
