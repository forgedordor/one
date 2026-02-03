package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnp {
    public final String a;
    public final boolean b;
    public final ekjo c;
    public final esno d;
    public final boolean e;
    public final int f;
    public final String g;
    public final Long h;
    public final ekhx i;
    public final Integer j;
    public final Integer k;

    public esnp(esnn esnnVar) {
        this.a = esnnVar.a;
        this.b = esnnVar.g;
        this.c = ekgd.e(esnnVar.b);
        this.d = esnnVar.c;
        this.e = esnnVar.d;
        this.f = esnnVar.e;
        this.g = esnnVar.f;
        this.h = esnnVar.h;
        this.i = ekhx.o(esnnVar.i);
        this.j = esnnVar.j;
        this.k = esnnVar.k;
    }

    public final String toString() {
        esno esnoVar = this.d;
        ekjo ekjoVar = this.c;
        return super.toString() + ": url=" + this.a + ", headers=" + ekjoVar.toString() + ", allowRedirect=" + this.e + ", priority=" + this.f + ", httpMethod=" + this.g + ", postBodyData=" + String.valueOf(esnoVar);
    }
}
