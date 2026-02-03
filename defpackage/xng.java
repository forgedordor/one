package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xng extends fcyz implements fdat {
    int a;
    final /* synthetic */ aoer b;
    final /* synthetic */ xnn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xng(aoer aoerVar, xnn xnnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aoerVar;
        this.c = xnnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xng) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarE = xnn.a.e();
            ekrwVarE.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$onSelect$1", "invokeSuspend", 164, "SimSelectorUiAdapterImpl.kt");
            aoer aoerVar = this.b;
            ekrdVar.t("Selected self identity: %s", aoerVar);
            xnn xnnVar = this.c;
            eiju eijuVarX = xnnVar.e.x(xnnVar.c, aoerVar);
            eijuVarX.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarX, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ekrw ekrwVarE2 = xnn.a.e();
            ekrwVarE2.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$onSelect$1", "invokeSuspend", 168, "SimSelectorUiAdapterImpl.kt")).t("Updated the conversation active self identity: %s", this.b);
        } else {
            ekrw ekrwVarH = xnn.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$onSelect$1", "invokeSuspend", 170, "SimSelectorUiAdapterImpl.kt")).q("Failed to update the conversation active self identity");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xng(this.b, this.c, fcxyVar);
    }
}
