package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozk extends fcyz implements fdat {
    int a;
    final /* synthetic */ Map b;
    final /* synthetic */ dggp c;
    final /* synthetic */ coze d;
    final /* synthetic */ cozm e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cozk(fcxy fcxyVar, Map map, dggp dggpVar, coze cozeVar, cozm cozmVar) {
        super(2, fcxyVar);
        this.b = map;
        this.c = dggpVar;
        this.d = cozeVar;
        this.e = cozmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cozk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cozu cozuVar = (cozu) this.b.get(this.c);
            if (cozuVar != null) {
                ekrw ekrwVarH = cozm.a.h();
                ekrwVarH.X(eksq.a, "BugleTransport");
                ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl$refreshMultiSimTransportRegistration$2$invokeSuspend$lambda$4$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 266, "ChatTransportControllerImpl.kt");
                coze cozeVar = this.d;
                ekrdVar.w("Register SIM with subId: %d on chat transport: %s.", cozuVar.b, cozeVar.name());
                cozo cozoVar = (cozo) this.e.b.get(cozeVar);
                if (cozoVar != null) {
                    this.a = 1;
                    if (cozoVar.b(cozuVar, this) == fcylVar) {
                        return fcylVar;
                    }
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cozk cozkVar = new cozk(fcxyVar, this.b, this.c, this.d, this.e);
        cozkVar.f = obj;
        return cozkVar;
    }
}
