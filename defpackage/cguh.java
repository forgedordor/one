package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cguh extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ efwo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cguh(efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cguh) c((cgtd) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgta cgtaVar = (cgta) ((cgtd) this.a).toBuilder();
        cgtaVar.getClass();
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cgtd) cgtaVar.instance).c)).getClass();
        int iA = this.b.a();
        cgtaVar.copyOnWrite();
        ((cgtd) cgtaVar.instance).a().put(Integer.valueOf(iA), true);
        return cgun.a(cgtaVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cguh cguhVar = new cguh(this.b, fcxyVar);
        cguhVar.a = obj;
        return cguhVar;
    }
}
