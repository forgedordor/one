package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvfl extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvfm b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvfl(cvfm cvfmVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvfmVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvfl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            csei cseiVar = (csei) this.b.f.b();
            boolean zBooleanValue = ((Boolean) this.c).booleanValue();
            this.a = 1;
            if (cseiVar.c(zBooleanValue, this) == fcylVar) {
                return fcylVar;
            }
        }
        if (crtr.d()) {
            if (((Boolean) this.c).booleanValue()) {
                ((aise) this.b.j.b()).e(2, 3);
            } else {
                ((aise) this.b.j.b()).f(2);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvfl(this.b, this.c, fcxyVar);
    }
}
