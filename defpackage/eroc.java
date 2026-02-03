package defpackage;

import java.security.spec.ECParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eroc {
    public static final eroc a = new eroc("NIST_P256", erdw.a);
    public static final eroc b = new eroc("NIST_P384", erdw.b);
    public static final eroc c = new eroc("NIST_P521", erdw.c);
    public final String d;
    public final ECParameterSpec e;

    private eroc(String str, ECParameterSpec eCParameterSpec) {
        this.d = str;
        this.e = eCParameterSpec;
    }

    public final String toString() {
        return this.d;
    }
}
