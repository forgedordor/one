package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkb extends ebkj {
    public ebkb(String str, String str2) {
        super(str, str2);
    }

    public static ebkb a(String str) {
        Pair pairE = e(ebkk.c(str, "a="));
        return new ebkb((String) pairE.first, (String) pairE.second);
    }

    @Override // defpackage.ebkh
    public final void b(StringBuilder sb) {
        sb.append("a=");
        g(sb);
    }

    @Override // defpackage.ebkj
    public final String c() {
        return this.a;
    }

    @Override // defpackage.ebkj
    public final String d() {
        return this.b;
    }
}
