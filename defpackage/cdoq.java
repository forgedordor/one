package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdoq implements atto {
    public final anty a;
    public final ajln b;
    public final akbs c;
    private final fdjx d;
    private final egzh e;
    private final fcsu f;
    private final aptm g;
    private final cdni h;

    public cdoq(cdni cdniVar, fdjx fdjxVar, anty antyVar, ajln ajlnVar, egzh egzhVar, fcsu fcsuVar, aptm aptmVar, akbs akbsVar, cdmg cdmgVar) {
        cdniVar.getClass();
        fdjxVar.getClass();
        antyVar.getClass();
        ajlnVar.getClass();
        egzhVar.getClass();
        fcsuVar.getClass();
        aptmVar.getClass();
        akbsVar.getClass();
        cdmgVar.getClass();
        this.h = cdniVar;
        this.d = fdjxVar;
        this.a = antyVar;
        this.b = ajlnVar;
        this.e = egzhVar;
        this.f = fcsuVar;
        this.g = aptmVar;
        this.c = akbsVar;
    }

    @Override // defpackage.atto
    public final eiju a(aubq aubqVar, ConversationIdType conversationIdType, auen auenVar) {
        aubqVar.getClass();
        auenVar.getClass();
        if (this.h.b() && auenVar.b.size() + auenVar.c.size() > 0) {
            return this.g.a() ? auvw.c(this.d, fcyi.a, fdjz.a, new cdop(this, conversationIdType, null)) : auvw.c(this.d, fcyi.a, fdjz.a, new cdoo(this, conversationIdType, null));
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    public final void b() {
        this.e.a(eijx.e(null), cdng.a);
        ((bxlc) this.f.b()).c();
    }
}
