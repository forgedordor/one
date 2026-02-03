package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqaj extends fcyz implements fdat {
    /* synthetic */ int a;
    final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqaj(Integer num, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = num;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqaj) c(Integer.valueOf(((Number) obj).intValue()), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int i = this.a;
        Integer num = this.b;
        boolean z = false;
        if (num != null && i == num.intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dqaj dqajVar = new dqaj(this.b, fcxyVar);
        dqajVar.a = ((Number) obj).intValue();
        return dqajVar;
    }
}
