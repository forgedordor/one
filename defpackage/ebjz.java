package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebjz extends ebkj {
    public ebjz(String str, int i) {
        super(str, Integer.toString(i));
    }

    public static ebjz a(String str) {
        Pair pairE = e(ebkk.c(str, "b="));
        return new ebjz((String) pairE.first, ebkk.a((String) pairE.second));
    }

    @Override // defpackage.ebkh
    public final void b(StringBuilder sb) {
        sb.append("b=");
        g(sb);
    }
}
