package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersn {
    public static final ersn a = new ersn("SHA1");
    public static final ersn b = new ersn("SHA256");
    public static final ersn c = new ersn("SHA512");
    private final String d;

    private ersn(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
