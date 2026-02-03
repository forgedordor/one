package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehul {
    public static final ehul a = new ehul(new ehuk());
    public final ekgb b;
    public final ekgb c;
    private final String d;

    private ehul(ehuk ehukVar) {
        this.d = ehukVar.a;
        this.b = ehukVar.b.g();
        this.c = ehukVar.c.g();
    }

    public final String toString() {
        return this.d + "@" + Integer.toHexString(hashCode());
    }
}
