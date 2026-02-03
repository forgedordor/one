package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqh extends noe {
    final /* synthetic */ noq a;
    final /* synthetic */ nqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqh(nqi nqiVar, noq noqVar, noq noqVar2) {
        super(noqVar);
        this.a = noqVar2;
        this.b = nqiVar;
    }

    @Override // defpackage.noe, defpackage.noq
    public final noo b(long j) {
        noo nooVarB = this.a.b(j);
        nor norVar = nooVarB.a;
        long j2 = norVar.c;
        long j3 = norVar.b;
        long j4 = this.b.a;
        nor norVar2 = new nor(j3, j2 + j4);
        nor norVar3 = nooVarB.b;
        return new noo(norVar2, new nor(norVar3.b, norVar3.c + j4));
    }
}
