package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class extv implements Comparable {
    static int c(byte b) {
        return (b >> 5) & 7;
    }

    private final extv g(Class cls) throws extu {
        if (cls.isInstance(this)) {
            return (extv) cls.cast(this);
        }
        throw new extu("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    protected abstract int a();

    protected int b() {
        return 0;
    }

    public final exto d() {
        return (exto) g(exto.class);
    }

    public final extq e() {
        return (extq) g(extq.class);
    }

    public final exts f() {
        return (exts) g(exts.class);
    }
}
