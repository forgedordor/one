package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tbm extends fcyz implements fdat {
    final /* synthetic */ tbn a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbm(tbn tbnVar, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = tbnVar;
        this.b = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tbm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        tcd tcdVar = (tcd) this.a.a.b();
        auvw.k(tcdVar.b, null, null, new tcb(tcdVar, this.b, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tbm(this.a, this.b, fcxyVar);
    }
}
