package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edxe extends fcyz implements fdat {
    final /* synthetic */ edxi a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edxe(edxi edxiVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = edxiVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edxe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.h.f(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new edxe(this.a, this.b, fcxyVar);
    }
}
