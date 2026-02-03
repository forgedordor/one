package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dai extends fdbr implements fdap {
    final /* synthetic */ dao a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dai(dao daoVar, long j) {
        super(1);
        this.a = daoVar;
        this.b = j;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        int iOrdinal = ((cze) obj).ordinal();
        long j = this.b;
        dao daoVar = this.a;
        if (iOrdinal == 0) {
            cyo cyoVar = daoVar.e.b().c;
            if (cyoVar != null) {
                j = ((kjg) cyoVar.b.invoke(new kjg(j))).a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            cyo cyoVar2 = daoVar.f.b().c;
            if (cyoVar2 != null) {
                j = ((kjg) cyoVar2.b.invoke(new kjg(j))).a;
            }
        }
        return new kjg(j);
    }
}
