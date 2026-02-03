package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvep extends fcyz implements fdat {
    boolean a;
    int b;
    final /* synthetic */ cveu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvep(cveu cveuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cveuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvep) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            z = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            cveu cveuVar = this.c;
            boolean zB = ((crxn) cveuVar.e.b()).b();
            csei cseiVar = (csei) cveuVar.d.b();
            this.a = zB;
            this.b = 1;
            obj = cseiVar.b(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            z = zB;
        }
        return new cveo(z, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvep(this.c, fcxyVar);
    }
}
