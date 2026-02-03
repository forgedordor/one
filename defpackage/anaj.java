package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anaj extends fcyz implements fdat {
    int a;
    final /* synthetic */ anao b;
    final /* synthetic */ ckwl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anaj(anao anaoVar, ckwl ckwlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anaoVar;
        this.c = ckwlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anaj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            anao anaoVar = this.b;
            ckwl ckwlVar = this.c;
            this.a = 1;
            fcsu fcsuVar = anaoVar.d;
            if (((Optional) fcsuVar.b()).isPresent()) {
                ((ckvy) ((Optional) fcsuVar.b()).get()).a(ckwlVar, bary.a);
                ekrw ekrwVarH = anao.a.h();
                ekrwVarH.X(eksq.a, "BugleDittoRcs");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.X(cqnc.s, ckwlVar.a());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/importmessages/ImportMessageHandlerImpl", "importReactionMessage", 163, "ImportMessageHandlerImpl.kt")).t("ImportReactionMessage: reaction is inserted in bugle db with reactedMessageId: %s.", ckwlVar.b());
            }
            if (fctx.a == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anaj(this.b, this.c, fcxyVar);
    }
}
