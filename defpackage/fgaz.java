package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgaz {
    private final Object a;

    public fgaz(Object obj) {
        this.a = obj;
    }

    private final void g(int i) {
        int iF = f();
        if (i == iF) {
            return;
        }
        throw new IllegalStateException("Attempted to access flag value as " + fgay.a(i) + ", but actual type is " + fgay.a(iF));
    }

    public final float a() {
        g(3);
        return ((Float) this.a).floatValue();
    }

    public final long b() {
        g(2);
        return ((Long) this.a).longValue();
    }

    public final evqs c() {
        g(5);
        return (evqs) this.a;
    }

    public final String d() {
        g(4);
        return (String) this.a;
    }

    public final boolean e() {
        g(1);
        return ((Boolean) this.a).booleanValue();
    }

    public final int f() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 2;
        }
        if (obj instanceof Float) {
            return 3;
        }
        if (obj instanceof String) {
            return 4;
        }
        if (obj instanceof evqs) {
            return 5;
        }
        throw new IllegalStateException("Unexpected flag value type: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public final String toString() {
        return this.a.toString();
    }

    public fgaz(float f) {
        this.a = Float.valueOf(f);
    }

    public fgaz(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public fgaz(long j) {
        this.a = Long.valueOf(j);
    }
}
