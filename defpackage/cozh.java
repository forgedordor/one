package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cozh extends fcyz implements fdat {
    int a;
    final /* synthetic */ cozm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cozh(cozm cozmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cozmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cozh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cozm cozmVar = this.b;
            this.a = 1;
            Map mapA = ((cozx) cozmVar.c.b()).a();
            ((cozw) cozmVar.d.b()).b(mapA);
            Object objA = fdjy.a(new cozl(cozmVar, mapA, null), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        ekrw ekrwVarE = cozm.a.e();
        ekrwVarE.X(eksq.a, "BugleTransport");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl$kickOffUpdateTransportRegistration$1$1", "invokeSuspend", 215, "ChatTransportControllerImpl.kt")).q("Update transport registration finished successfully.");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cozh(this.b, fcxyVar);
    }
}
