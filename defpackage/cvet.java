package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvet extends fcyz implements fdat {
    int a;
    final /* synthetic */ cveu b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvet(cveu cveuVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cveuVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvet) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            csei cseiVar = (csei) this.b.d.b();
            boolean zBooleanValue = ((Boolean) this.c).booleanValue();
            this.a = 1;
            if (cseiVar.c(zBooleanValue, this) == fcylVar) {
                return fcylVar;
            }
        }
        if (crtr.d()) {
            if (((Boolean) this.c).booleanValue()) {
                ((aise) this.b.h.b()).e(2, 3);
            } else {
                ((aise) this.b.h.b()).f(2);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvet(this.b, this.c, fcxyVar);
    }
}
