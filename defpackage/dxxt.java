package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxt {
    public static void a(TextView textView) {
        ley.p(textView, new dxxs());
    }

    public static String b(Object obj, dxxk dxxkVar) {
        boolean z = ((dxxq) dxxr.a(obj, dxxkVar)).a;
        String strB = ejwk.b(dxxkVar.e(obj));
        String strB2 = z ? "" : ejwk.b(dxxkVar.c(obj));
        return (strB.isEmpty() && strB2.isEmpty()) ? dxxkVar.b(obj) : strB.isEmpty() ? strB2 : (strB2.isEmpty() || strB.equals(strB2)) ? strB : a.q(strB2, strB, " ");
    }
}
