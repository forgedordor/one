package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahig implements drzh {
    private final ahkn a;

    public ahig(ahkn ahknVar) {
        this.a = ahknVar;
    }

    @Override // defpackage.drzh
    public final /* synthetic */ void a(ea eaVar) {
        dsqh dsqhVar = (dsqh) eaVar;
        etni etniVar = etni.UITYPE_GM_DIALOG;
        ahkn ahknVar = this.a;
        ahng ahngVar = ahknVar.b;
        dsqhVar.ai = ekgp.m(etniVar, ahngVar.gf, etni.UITYPE_PERMISSION, ahngVar.gg);
        ahnh ahnhVar = ahknVar.a;
        dsqhVar.aj = (dsoq) ahnhVar.vQ.b();
        dsqhVar.ak = ahknVar.dP();
        dsqhVar.al = (Context) ahknVar.t.b();
        dsqhVar.ap = (dsom) ahnhVar.wj.b();
        dsqhVar.aq = (ahnd) ahngVar.gh.b();
    }
}
