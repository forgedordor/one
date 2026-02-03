package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyd extends fcyz implements fdat {
    final /* synthetic */ ahzi a;
    final /* synthetic */ UUID b;
    final /* synthetic */ aiaf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyd(fcxy fcxyVar, ahzi ahziVar, UUID uuid, aiaf aiafVar) {
        super(2, fcxyVar);
        this.a = ahziVar;
        this.b = uuid;
        this.c = aiafVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Integer num = new Integer(5);
        ahzi ahziVar = this.a;
        ahzu ahzuVar = ahziVar.o;
        UUID uuid = this.b;
        ahzuVar.i("Requested restore completed: workflowVersion: [%s] sessionId: [%s]", num, uuid);
        fcsu fcsuVar = ahziVar.c;
        ((aibb) fcsuVar.b()).b(uuid, 5);
        ((aibb) fcsuVar.b()).e(uuid);
        ((aibb) fcsuVar.b()).d(uuid, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahyd ahydVar = new ahyd(fcxyVar, this.a, this.b, this.c);
        ahydVar.d = obj;
        return ahydVar;
    }
}
