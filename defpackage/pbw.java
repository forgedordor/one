package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pbw {
    public abstract int a();

    public abstract Object b();

    public final boolean c() {
        return b() != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pbw) {
            pbw pbwVar = (pbw) obj;
            Object objB = b();
            if ((objB == null ? pbwVar.b() == null : objB.equals(pbwVar.b())) && a() == pbwVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a() >>> 8;
    }
}
