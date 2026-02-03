package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wrp extends fcyz implements fdat {
    int a;
    final /* synthetic */ wrt b;
    final /* synthetic */ Duration c;
    final /* synthetic */ fdpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrp(wrt wrtVar, Duration duration, fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wrtVar;
        this.c = duration;
        this.d = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wrp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarE = wrt.a.e();
            ekrwVarE.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            wrt wrtVar = this.b;
            ekrdVar.X(cqnc.t, wrtVar.b);
            ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$subscribe$2", "invokeSuspend", 121, "ConversationDraftPersistence.kt");
            Duration duration = this.c;
            ekrdVar2.t("Persistence subscribing to draft flow with period %s", duration);
            fdci fdciVar = new fdci();
            fdpl fdplVarA = fdqc.a(avbe.a(this.d, duration));
            wro wroVar = new wro(fdciVar, wrtVar);
            this.a = 1;
            if (fdplVarA.a(wroVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wrp(this.b, this.c, this.d, fcxyVar);
    }
}
