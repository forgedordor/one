package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llc extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ llo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llc(llo lloVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = lloVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        lmv lmkVar;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        try {
        } catch (Throwable th) {
            lmg lmgVarC = this.c.c();
            this.a = th;
            this.b = 2;
            Object objD = lmgVarC.d();
            if (objD != fcylVar) {
                obj2 = th;
                obj = objD;
            }
        }
        if (i == 0) {
            fctl.b(obj);
            llo lloVar = this.c;
            this.b = 1;
            obj = lloVar.k(true, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        } else {
            if (i != 1) {
                obj2 = this.a;
                fctl.b(obj);
                lmkVar = new lmk((Throwable) obj2, ((Number) obj).intValue());
                return new fcti(lmkVar, true);
            }
            fctl.b(obj);
        }
        lmkVar = (lmv) obj;
        return new fcti(lmkVar, true);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new llc(this.c, (fcxy) obj).b(fctx.a);
    }
}
