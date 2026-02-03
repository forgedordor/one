package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjw {
    public final eeyg a;
    public final eexu b;
    public final int c;

    private adjw(eeyg eeygVar, eexu eexuVar, int i) {
        this.a = eeygVar;
        this.b = eexuVar;
        this.c = i;
    }

    static adjw a(int i, eexu eexuVar) {
        eeyf eeyfVarB = eeyg.b(i);
        eeyfVarB.b();
        return new adjw(eeyfVarB.a(), eexuVar, 0);
    }

    static adjw b(eexu eexuVar, int i) {
        eeyf eeyfVarB = eeyg.b(1);
        eeyfVarB.b();
        return new adjw(eeyfVarB.a(), eexuVar, i);
    }
}
