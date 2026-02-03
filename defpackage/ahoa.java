package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahoa implements xad {
    final /* synthetic */ ahoh a;

    public ahoa(ahoh ahohVar) {
        this.a = ahohVar;
    }

    @Override // defpackage.xad
    public final xac a(fcsu fcsuVar) {
        ahoh ahohVar = this.a;
        ahkn ahknVar = ahohVar.a;
        Context context = (Context) ahknVar.t.b();
        fcyh fcyhVar = (fcyh) ahknVar.bM.b();
        fdjx fdjxVar = (fdjx) ahknVar.a.m.b();
        ahoi ahoiVar = ahohVar.c;
        fdjx fdjxVar2 = (fdjx) ahoiVar.e.b();
        ahjr ahjrVar = ahohVar.b;
        return new xac(context, fcyhVar, fdjxVar, fdjxVar2, (eigp) ahjrVar.ac.b(), (wre) ahoiVar.z.b(), (wqf) ahoiVar.cb.b(), (fduj) ahoiVar.aA.b(), (ConversationId) ahoiVar.j.b(), Optional.of((vwi) ahoiVar.cc.b()), new wwx((aisp) ahoiVar.a.a.zF.b()), Optional.of((ahdx) ahoiVar.ce.b()), ahjrVar.gh, ahoiVar.l(), ahknVar.b.af(), fcsuVar);
    }
}
