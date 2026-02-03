package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atfe extends fcyz implements fdat {
    final /* synthetic */ atfx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atfe(atfx atfxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = atfxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atfe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.h.c());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atfe(this.a, fcxyVar);
    }
}
