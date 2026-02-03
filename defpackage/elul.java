package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum elul implements evst {
    UNKNOWN_EVENT_AGE(0),
    EVENT_AGE_WITHIN_1_DAY(1),
    EVENT_AGE_1_TO_7_DAYS(2),
    EVENT_AGE_7_TO_28_DAYS(3),
    EVENT_AGE_MORE_THAN_28_DAYS(4);

    public final int f;

    elul(int i) {
        this.f = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
