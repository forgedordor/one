package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agqv extends fcyz implements fdat {
    int a;
    final /* synthetic */ agqy b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agqv(fcxy fcxyVar, agqy agqyVar) {
        super(2, fcxyVar);
        this.b = agqyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agqv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarC = ((cdte) this.b.b.b()).c();
            eijuVarC.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarC, this) != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        agqy agqyVar = this.b;
        eiju eijuVarB = ((cdte) agqyVar.b.b()).b((String) agqyVar.c.b());
        eijuVarB.getClass();
        this.a = 2;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agqv agqvVar = new agqv(fcxyVar, this.b);
        agqvVar.c = obj;
        return agqvVar;
    }
}
