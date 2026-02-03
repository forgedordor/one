package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahzi b;
    final /* synthetic */ UUID c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyk(fcxy fcxyVar, ahzi ahziVar, UUID uuid) {
        super(2, fcxyVar);
        this.b = ahziVar;
        this.c = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ahzi ahziVar = this.b;
            UUID uuid = this.c;
            ayrq ayrqVar = ayrq.a;
            ahyi ahyiVar = new ahyi(ahziVar, uuid, null);
            this.a = 1;
            obj = ayrqVar.a("RestoreAnytimeCompatibleRestoreWorkflowSteps#doBugleDbRestoreInternal", ahyiVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        long j = ((fdhi) obj).c;
        ahzi ahziVar2 = this.b;
        auvw.k(ahziVar2.j, null, null, new ahyj(ahziVar2, this.c, j, null), 3);
        return obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahyk ahykVar = new ahyk(fcxyVar, this.b, this.c);
        ahykVar.d = obj;
        return ahykVar;
    }
}
