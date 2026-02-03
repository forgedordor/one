package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erah {
    public static final erah a = new erah("SHA1");
    public static final erah b = new erah("SHA224");
    public static final erah c = new erah("SHA256");
    public static final erah d = new erah("SHA384");
    public static final erah e = new erah("SHA512");
    private final String f;

    private erah(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
