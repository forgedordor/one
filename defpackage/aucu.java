package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum aucu implements evst {
    CAUSE_UNSPECIFIED(0),
    CAUSE_ONLY_SELF_IN_GROUP(1),
    CAUSE_GROUP_NOT_FOUND(2);

    public final int d;

    aucu(int i) {
        this.d = i;
    }

    public static aucu b(int i) {
        if (i == 0) {
            return CAUSE_UNSPECIFIED;
        }
        if (i == 1) {
            return CAUSE_ONLY_SELF_IN_GROUP;
        }
        if (i != 2) {
            return null;
        }
        return CAUSE_GROUP_NOT_FOUND;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
