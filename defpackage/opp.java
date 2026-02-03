package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opp {
    public final orr a;
    public final Object b;
    public final int c;
    public final int d;

    public opp(orr orrVar, Object obj, int i, int i2) {
        orrVar.getClass();
        this.a = orrVar;
        this.b = obj;
        this.c = i;
        this.d = i2;
        if (orrVar != orr.a && obj == null) {
            throw new IllegalArgumentException("Key must be non-null for prepend/append");
        }
    }
}
