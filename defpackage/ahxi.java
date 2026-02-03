package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxi extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahxy b;
    final /* synthetic */ UUID c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxi(fcxy fcxyVar, ahxy ahxyVar, UUID uuid) {
        super(2, fcxyVar);
        this.b = ahxyVar;
        this.c = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ahxy ahxyVar = this.b;
            UUID uuid = this.c;
            ayrq ayrqVar = ayrq.a;
            ahxg ahxgVar = new ahxg(ahxyVar, uuid, null);
            this.a = 1;
            obj = ayrqVar.a("BasicRestoreWorkflowSteps#doBugleDbRestoreInternal", ahxgVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        long j = ((fdhi) obj).c;
        ahxy ahxyVar2 = this.b;
        auvw.k(ahxyVar2.j, null, null, new ahxh(ahxyVar2, j, this.c, null), 3);
        return obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahxi ahxiVar = new ahxi(fcxyVar, this.b, this.c);
        ahxiVar.d = obj;
        return ahxiVar;
    }
}
