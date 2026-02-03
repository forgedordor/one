package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dak extends fdbr implements fdap {
    final /* synthetic */ dao a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dak(dao daoVar, long j) {
        super(1);
        this.a = daoVar;
        this.b = j;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        int iOrdinal;
        dao daoVar = this.a;
        cze czeVar = (cze) obj;
        long jC = 0;
        if (daoVar.h != null && daoVar.a() != null && !fdbq.f(daoVar.h, daoVar.a()) && (iOrdinal = czeVar.ordinal()) != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            cyo cyoVar = daoVar.f.b().c;
            if (cyoVar != null) {
                long j = this.b;
                long j2 = ((kjg) cyoVar.b.invoke(new kjg(j))).a;
                iby ibyVarA = daoVar.a();
                ibyVarA.getClass();
                kji kjiVar = kji.a;
                long jA = ibyVarA.a(j, j2, kjiVar);
                iby ibyVar = daoVar.h;
                ibyVar.getClass();
                jC = kjb.c(jA, ibyVar.a(j, j2, kjiVar));
            }
        }
        return new kjb(jC);
    }
}
