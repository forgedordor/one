package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ved extends fcyz implements fdat {
    final /* synthetic */ boolean[] a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ved(boolean[] zArr, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = zArr;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ved) c(obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a[this.b] = true;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ved(this.a, this.b, fcxyVar);
    }
}
