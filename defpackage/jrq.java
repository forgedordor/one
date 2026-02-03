package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrq extends icr implements jfy {
    public boolean a;
    public fdap b;
    private final boolean c;

    public jrq(boolean z, boolean z2, fdap fdapVar) {
        this.a = z;
        this.c = z2;
        this.b = fdapVar;
    }

    @Override // defpackage.jfy
    public final boolean dP() {
        return this.c;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        this.b.invoke(jtoVar);
    }

    @Override // defpackage.jfy
    public final boolean u() {
        return this.a;
    }
}
