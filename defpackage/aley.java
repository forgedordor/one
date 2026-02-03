package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aley implements ales {
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/SuggestionRepositoryImpl");
    public final fcyh a;
    public final fcsu b;
    public final fcsu c;
    public final BugleConversationId d;
    private final fdjx f;
    private final ajlu g;
    private final anpj h;
    private final anpj i;
    private final anpj j;
    private anpj k;
    private final anpj l;

    public aley(aled aledVar, aler alerVar, fcyh fcyhVar, aldh aldhVar, albm albmVar, albv albvVar, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, BugleConversationId bugleConversationId, anpj anpjVar, anpj anpjVar2, anpj anpjVar3, ajlu ajluVar) {
        this.a = fcyhVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = fdjxVar;
        this.d = bugleConversationId;
        this.g = ajluVar;
        if (((Boolean) ((cczi) crbf.bv.get()).e()).booleanValue()) {
            fdjx fdjxVar2 = (fdjx) alerVar.a.b();
            fdjxVar2.getClass();
            fdjx fdjxVar3 = (fdjx) alerVar.b.b();
            fdjxVar3.getClass();
            cqtp cqtpVar = (cqtp) alerVar.c.b();
            cqtpVar.getClass();
            aldh aldhVar2 = (aldh) alerVar.d.b();
            aldhVar2.getClass();
            alba albaVar = (alba) alerVar.e.b();
            albaVar.getClass();
            alaf alafVar = (alaf) alerVar.f.b();
            alafVar.getClass();
            this.k = new aleq(fdjxVar2, fdjxVar3, cqtpVar, aldhVar2, albaVar, alafVar, anpjVar3, anpjVar, anpjVar2, bugleConversationId);
        }
        fdjx fdjxVar4 = (fdjx) aledVar.a.b();
        fdjxVar4.getClass();
        fdjx fdjxVar5 = (fdjx) aledVar.b.b();
        fdjxVar5.getClass();
        cqtp cqtpVar2 = (cqtp) aledVar.c.b();
        cqtpVar2.getClass();
        alcn alcnVar = (alcn) aledVar.d.b();
        alcnVar.getClass();
        alaq alaqVar = (alaq) aledVar.e.b();
        alaqVar.getClass();
        akzu akzuVar = (akzu) aledVar.f.b();
        akzuVar.getClass();
        this.j = new alec(fdjxVar4, fdjxVar5, cqtpVar2, alcnVar, alaqVar, akzuVar, anpjVar3, anpjVar, anpjVar2, bugleConversationId);
        this.l = aldhVar.a(bugleConversationId, anpjVar, anpjVar2, anpjVar3, null);
        fdjx fdjxVar6 = (fdjx) albmVar.a.b();
        fdjxVar6.getClass();
        cqtp cqtpVar3 = (cqtp) albmVar.b.b();
        cqtpVar3.getClass();
        bbmo bbmoVar = (bbmo) albmVar.c.b();
        bbmoVar.getClass();
        this.h = new albl(fdjxVar6, cqtpVar3, bbmoVar, albmVar.d, bugleConversationId);
        fdjx fdjxVar7 = (fdjx) albvVar.a.b();
        fdjxVar7.getClass();
        cqtp cqtpVar4 = (cqtp) albvVar.b.b();
        cqtpVar4.getClass();
        bbmo bbmoVar2 = (bbmo) albvVar.c.b();
        bbmoVar2.getClass();
        this.i = new albu(fdjxVar7, cqtpVar4, bbmoVar2, albvVar.d, bugleConversationId);
    }

    @Override // defpackage.ales
    public final anpj a() {
        return this.h;
    }

    @Override // defpackage.ales
    public final anpj b() {
        return this.i;
    }

    @Override // defpackage.ales
    public final anpj c() {
        return this.j;
    }

    @Override // defpackage.ales
    public final anpj d() {
        anpj anpjVar = this.k;
        return anpjVar == null ? this.l : anpjVar;
    }

    @Override // defpackage.ales
    public final eiju e(aldp aldpVar) {
        ajna ajnaVar = ajna.BEST_AVAILABLE;
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        elny elnyVar = elny.RBM_SUGGESTION_REPLY;
        eiju eijuVarK = this.g.k(ajnaVar, ((RbmSuggestionData) aldpVar).d, ekgbVar, null, null, null, elnyVar, null, null);
        eijuVarK.getClass();
        return eijuVarK;
    }

    @Override // defpackage.ales
    public final eiju f(String str, amwf amwfVar, elny elnyVar, boolean z, boolean z2) {
        auvw.m(this.f, null, new alew(str, this, z, null), 3);
        if (amwfVar == null || elnyVar == null) {
            ((ekrd) e.j().h("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/SuggestionRepositoryImpl", "acceptSuggestion", 196, "SuggestionRepositoryImpl.kt")).q("Accept suggestion without text or source. Returning without sending message.");
            eiju eijuVarE = eijx.e(null);
            eijuVarE.getClass();
            return eijuVarE;
        }
        ajlu ajluVar = this.g;
        ajna ajnaVar = ajna.BEST_AVAILABLE;
        int i = ekgb.d;
        eiju eijuVarK = ajluVar.k(ajnaVar, amwfVar, ekoe.a, null, null, null, elnyVar, null, null);
        eijuVarK.getClass();
        return eijuVarK;
    }

    @Override // defpackage.ales
    public final eiju g(alff alffVar) {
        return auvw.c(this.f, fcyi.a, fdjz.a, new alex(alffVar, this, null));
    }
}
