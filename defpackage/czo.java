package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czo extends fdbr implements fdap {
    final /* synthetic */ ikz a;
    final /* synthetic */ dap b;
    final /* synthetic */ dar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czo(ikz ikzVar, dap dapVar, dar darVar) {
        super(1);
        this.a = ikzVar;
        this.b = dapVar;
        this.c = darVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        ikz ikzVar;
        int iOrdinal = ((cze) obj).ordinal();
        ikz ikzVar2 = null;
        if (iOrdinal == 0) {
            daz dazVar = this.b.b().d;
            if (dazVar != null) {
                ikzVar = new ikz(dazVar.b);
            } else {
                daz dazVar2 = this.c.b().d;
                if (dazVar2 != null) {
                    ikzVar = new ikz(dazVar2.b);
                }
            }
            ikzVar2 = ikzVar;
        } else if (iOrdinal == 1) {
            ikzVar2 = this.a;
        } else {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            daz dazVar3 = this.c.b().d;
            if (dazVar3 != null) {
                ikzVar = new ikz(dazVar3.b);
            } else {
                daz dazVar4 = this.b.b().d;
                if (dazVar4 != null) {
                    ikzVar = new ikz(dazVar4.b);
                }
            }
            ikzVar2 = ikzVar;
        }
        return new ikz(ikzVar2 != null ? ikzVar2.b : ikz.a);
    }
}
