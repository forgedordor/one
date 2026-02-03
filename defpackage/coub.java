package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coub {
    private static final cqce a = cqce.g("BugleFileTransfer", "FilePreviewSizeProvider");
    private final awij b;

    public coub(awij awijVar) {
        this.b = awijVar;
    }

    public final int a(ekgb ekgbVar) {
        if (ekgbVar.size() != 1) {
            return ((Integer) dfaq.E().k().a()).intValue();
        }
        alqm alqmVar = (alqm) ekgbVar.get(0);
        assi assiVarA = this.b.a(alqmVar);
        if (assiVarA.f()) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Capabilities are empty for");
            cqbdVarE.k(alqmVar.toString());
            cqbdVarE.I("while trying to determine the file transfer preview size");
            cqbdVarE.r();
            return Math.min(((Integer) dfaq.E().l().a()).intValue(), ((Integer) dfaq.E().k().a()).intValue());
        }
        if (assiVarA.i()) {
            return ((Integer) dfaq.E().k().a()).intValue();
        }
        int iIntValue = ((Integer) dfaq.E().l().a()).intValue();
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Using pre-UP file transfer preview size:");
        cqbdVarC.G(iIntValue);
        cqbdVarC.I("bytes");
        cqbdVarC.r();
        return iIntValue;
    }
}
