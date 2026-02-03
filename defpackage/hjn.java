package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjn extends icr implements jgg, jfy {
    public fdap a;
    public boolean b;
    private final Object c = hjo.a;

    public hjn(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        if (this.b) {
            return;
        }
        this.a.invoke(jtoVar);
    }

    @Override // defpackage.jgg
    public final Object dZ() {
        return this.c;
    }

    @Override // defpackage.jfy
    public final boolean u() {
        return true;
    }
}
