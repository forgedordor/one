package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class taz extends fcyz implements fdat {
    final /* synthetic */ tbe a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taz(tbe tbeVar, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = tbeVar;
        this.b = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((taz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        tbn tbnVar = (tbn) this.a.h.b();
        auvw.k(tbnVar.b, null, null, new tbm(tbnVar, this.b, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new taz(this.a, this.b, fcxyVar);
    }
}
