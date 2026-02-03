package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum caee implements evst {
    UNSPECIFIED_FLOW(0),
    BNR_OPT_OUT(1),
    MD_OPT_OUT(2),
    BNR_AND_MD_OPT_OUT(3);

    public final int e;

    caee(int i) {
        this.e = i;
    }

    public static caee b(int i) {
        if (i == 0) {
            return UNSPECIFIED_FLOW;
        }
        if (i == 1) {
            return BNR_OPT_OUT;
        }
        if (i == 2) {
            return MD_OPT_OUT;
        }
        if (i != 3) {
            return null;
        }
        return BNR_AND_MD_OPT_OUT;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
