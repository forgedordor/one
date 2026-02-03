package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgl {
    public final dcfe a;
    private final int b;
    private final dcfa c;
    private final String d;

    public dcgl(dcfe dcfeVar, dcfa dcfaVar, String str) {
        this.a = dcfeVar;
        this.c = dcfaVar;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{dcfeVar, dcfaVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dcgl)) {
            return false;
        }
        dcgl dcglVar = (dcgl) obj;
        return dclc.a(this.a, dcglVar.a) && dclc.a(this.c, dcglVar.c) && dclc.a(this.d, dcglVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
