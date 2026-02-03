package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzs extends fcyz implements fdat {
    int a;
    final /* synthetic */ xac b;
    final /* synthetic */ vvw c;
    final /* synthetic */ ekgp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzs(xac xacVar, vvw vvwVar, ekgp ekgpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xacVar;
        this.c = vvwVar;
        this.d = ekgpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wzs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                xac xacVar = this.b;
                fdlr fdlrVarK = auvw.k(xacVar.e, null, null, new wzr(xacVar, this.c, this.d, null), 3);
                this.a = 1;
                if (fdlrVarK.o(this) == fcylVar) {
                    return fcylVar;
                }
            }
            this.b.o.f(false);
            ekrw ekrwVarF = xac.a.f();
            ekrwVarF.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl$onSend$1$2", "invokeSuspend", 179, "SendButtonUiAdapterImpl.kt")).t("Ending SendButtonUiAdapterImpl.onSend for %s", this.c);
            return fctx.a;
        } catch (Throwable th) {
            this.b.o.f(false);
            ekrw ekrwVarF2 = xac.a.f();
            ekrwVarF2.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarF2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl$onSend$1$2", "invokeSuspend", 179, "SendButtonUiAdapterImpl.kt")).t("Ending SendButtonUiAdapterImpl.onSend for %s", this.c);
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wzs(this.b, this.c, this.d, fcxyVar);
    }
}
