package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdrg extends fcyz implements fdav {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ fdat e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdrg(long j, fdat fdatVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = j;
        this.e = fdatVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        fdrg fdrgVar = new fdrg(this.d, this.e, (fcxy) obj4);
        fdrgVar.b = (Throwable) obj2;
        fdrgVar.c = jLongValue;
        return fdrgVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            z = ((Boolean) obj).booleanValue();
        } else {
            Object obj2 = this.b;
            if (this.c < this.d) {
                fdat fdatVar = this.e;
                this.a = 1;
                obj = fdatVar.a(obj2, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
