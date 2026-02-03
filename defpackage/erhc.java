package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhc {
    public static final erhc a = new erhc("SHA1");
    public static final erhc b = new erhc("SHA224");
    public static final erhc c = new erhc("SHA256");
    public static final erhc d = new erhc("SHA384");
    public static final erhc e = new erhc("SHA512");
    private final String f;

    private erhc(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
