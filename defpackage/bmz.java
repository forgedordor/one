package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmz implements bcl {
    private final bcl b;

    public bmz(bcl bclVar) {
        lcg.b(true, "Timeout must be non-negative.");
        this.b = bclVar;
    }

    @Override // defpackage.bcl
    public final bck a(biv bivVar) {
        bck bckVarA = this.b.a(bivVar);
        return bivVar.b >= 6000 - bckVarA.d ? bck.a : bckVarA;
    }
}
