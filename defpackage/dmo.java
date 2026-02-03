package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmo extends icr implements jgg {
    public static final dmn a = new dmn();
    private final fdap b;
    private final Object c = a;

    public dmo(fdap fdapVar) {
        this.b = fdapVar;
    }

    public final void a(ivy ivyVar) {
        this.b.invoke(ivyVar);
        dmo dmoVar = (dmo) jgh.a(this);
        if (dmoVar != null) {
            dmoVar.a(ivyVar);
        }
    }

    @Override // defpackage.jgg
    public final Object dZ() {
        return this.c;
    }
}
