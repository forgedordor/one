package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xjh extends fcyz implements fdat {
    int a;
    final /* synthetic */ xjo b;
    final /* synthetic */ String c = "Location";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjh(xjo xjoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xjoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xjh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        xjh xjhVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            xjhVar = this;
        } else {
            xjo xjoVar = this.b;
            String str = this.c;
            fdae fdaeVar = new fdae() { // from class: xjg
                @Override // defpackage.fdae
                public final Object invoke() {
                    ekrw ekrwVarE = xjo.a.e();
                    ekrwVarE.X(eksq.a, "BugleComposeRow2");
                    ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl$checkForAndHandlePendingResult$1", "invokeSuspend$lambda$0", 179, "LocationHandlerImpl.kt")).q("Location picker opened flag detected, attempting to recover result");
                    return fctx.a;
                }
            };
            this.a = 1;
            xjhVar = this;
            obj = xhm.b(xjoVar.f, "location_saved_state_pending_result", xjoVar.d, str, fdaeVar, xjhVar);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        adh adhVar = (adh) obj;
        if (adhVar == null) {
            return fctx.a;
        }
        xjhVar.b.e(adhVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xjh(this.b, fcxyVar);
    }
}
