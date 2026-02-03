package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dal extends fdbr implements fdap {
    final /* synthetic */ dao a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dal(dao daoVar, long j) {
        super(1);
        this.a = daoVar;
        this.b = j;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        long j;
        long j2;
        dao daoVar = this.a;
        cze czeVar = (cze) obj;
        ddf ddfVar = daoVar.e.b().b;
        long j3 = this.b;
        long j4 = 0;
        if (ddfVar != null) {
            j = ((kjb) ddfVar.a.invoke(new kjg(j3))).a;
        } else {
            j = 0;
        }
        ddf ddfVar2 = daoVar.f.b().b;
        if (ddfVar2 != null) {
            j2 = ((kjb) ddfVar2.a.invoke(new kjg(j3))).a;
        } else {
            j2 = 0;
        }
        int iOrdinal = czeVar.ordinal();
        if (iOrdinal == 0) {
            j4 = j;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            j4 = j2;
        }
        return new kjb(j4);
    }
}
