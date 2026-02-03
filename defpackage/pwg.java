package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwg {
    public static final pwg a = new pwg(0);
    public static final pwg b = new pwg(1);
    public static final pwg c = new pwg(2);
    private final int d;

    private pwg(int i) {
        this.d = i;
    }

    public final String toString() {
        int i = this.d;
        return i != 0 ? i != 1 ? "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED" : "SplitSupportStatus: UNAVAILABLE" : "SplitSupportStatus: AVAILABLE";
    }
}
