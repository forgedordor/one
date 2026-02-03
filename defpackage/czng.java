package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewPager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czng implements eind {
    final /* synthetic */ czmx a;

    public czng(czmx czmxVar) {
        this.a = czmxVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) throws Resources.NotFoundException {
        int i = true != ((czou) einbVar).a ? 2 : 3;
        czmx czmxVar = this.a;
        czmxVar.A(i);
        if (czmxVar.t != null) {
            cg cgVar = new cg(czmxVar.H.I());
            cgVar.o(czmxVar.t);
            cgVar.c();
            czmxVar.t = null;
        }
        if (czmxVar.Q) {
            einf.g(czmxVar.s.d(), czmxVar.H.Q);
            return eine.a;
        }
        if (czmxVar.E != null) {
            ((MediaViewPager) czmxVar.D.b()).v(true);
        }
        if (le.m(czmxVar.N.h())) {
            ea eaVar = czmxVar.O;
            if (eaVar instanceof czln) {
                czly czlyVarH = ((czln) eaVar).H();
                if (czlyVarH.g()) {
                    czlyVarH.d.e(0, 0, 0, 0);
                    czlyVarH.d.d(0);
                    czlyVarH.d.c();
                }
            }
        }
        czmxVar.C.setVisibility(true != czmxVar.aa ? 0 : 8);
        czmxVar.c().setVisibility(0);
        czmxVar.c.h(czmxVar);
        czmxVar.H.Q.setSystemUiVisibility(0);
        czmxVar.s(czmxVar.o);
        if (czmxVar.aa) {
            czmxVar.G.setVisibility(czmxVar.o == null ? 8 : 0);
        } else {
            czmxVar.y.setVisibility(czmxVar.o == null ? 8 : 0);
        }
        czmxVar.t(czmxVar.p);
        return eine.a;
    }
}
