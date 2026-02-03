package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jek extends fdbr implements fdap {
    public static final jek a = new jek();

    public jek() {
        super(1);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        jer jerVar = (jer) obj;
        if (jerVar.B() && jer.aG(jerVar)) {
            jcr jcrVar = jerVar.t;
            jcw jcwVar = jcrVar.w;
            if (jcwVar.k > 0) {
                if (jcwVar.j || jcwVar.i) {
                    jcrVar.ac(false);
                }
                jcwVar.o.u();
            }
            jfh jfhVarA = jcv.a(jcrVar);
            ((AndroidComposeView) jfhVarA).p.d(jcrVar);
            jfhVarA.y(jcrVar);
        }
        return fctx.a;
    }
}
