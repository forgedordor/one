package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fal {
    public final ebk a;
    public final hri b = new hph(0);

    public fal(ebk ebkVar) {
        this.a = ebkVar;
    }

    public final boolean a() {
        return (this.b.c() & 1) != 0;
    }

    public final boolean b() {
        return (this.b.c() & 2) != 0;
    }

    public final boolean c() {
        return (this.b.c() & 4) != 0;
    }
}
