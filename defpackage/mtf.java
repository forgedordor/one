package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mtf extends nec {
    private final mck c;

    public mtf(mcl mclVar) {
        super(mclVar);
        this.c = new mck();
    }

    @Override // defpackage.nec, defpackage.mcl
    public final mcj d(int i, mcj mcjVar, boolean z) {
        mcj mcjVarD = super.d(i, mcjVar, z);
        if (super.p(mcjVarD.c, this.c).c()) {
            mcjVarD.l(mcjVar.a, mcjVar.b, mcjVar.c, mcjVar.d, mcjVar.e, lzz.a, true);
            return mcjVarD;
        }
        mcjVarD.f = true;
        return mcjVarD;
    }
}
