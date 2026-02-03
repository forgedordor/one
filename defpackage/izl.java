package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izl {
    public final izo a;
    public iwy b;
    public final fdat c;
    public final fdat d;
    public final fdat e;

    public izl(izo izoVar) {
        this.a = izoVar;
        this.c = new izk(this);
        this.d = new izi(this);
        this.e = new izj(this);
    }

    public final iwy a() {
        iwy iwyVar = this.b;
        if (iwyVar != null) {
            return iwyVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public izl() {
        this(ixw.a);
    }
}
