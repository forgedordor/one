package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbag extends fcyz implements fdat {
    final /* synthetic */ cbai a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbag(cbai cbaiVar, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cbaiVar;
        this.b = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbag) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.b.b(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbag(this.a, this.b, fcxyVar);
    }
}
