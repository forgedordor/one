package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xnu extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ xnw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnu(xnw xnwVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = xnwVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xnu xnuVar = new xnu(this.c, (fcxy) obj3);
        xnuVar.a = (dlls) obj;
        xnuVar.b = (dlax) obj2;
        return xnuVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        if (((Boolean) ((cczi) anoo.a.get()).e()).booleanValue()) {
            xnw xnwVar = this.c;
            if (xnwVar.d.compareAndSet(false, true)) {
                ((anoo) xnwVar.c.b()).c(6, xnwVar.a);
            }
        }
        return obj3;
    }
}
