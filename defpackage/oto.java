package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oto extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ ots b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oto(ots otsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = otsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oto) c((oxh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        oxh oxhVar = (oxh) this.a;
        int i = -oxhVar.c;
        int i2 = this.b.b.f;
        boolean z = true;
        if (i <= i2 && (-oxhVar.d) <= i2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        oto otoVar = new oto(this.b, fcxyVar);
        otoVar.a = obj;
        return otoVar;
    }
}
