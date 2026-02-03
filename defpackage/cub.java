package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cub {
    public final cwg a;
    public final cwf b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public cub(int i) {
        this.c = i;
        if (i <= 0) {
            cwh.a("maxSize <= 0");
        }
        this.a = new cwg(0);
        this.b = new cwf();
    }

    private static final void a(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    protected static final void g(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    protected Object b(Object obj) {
        return null;
    }

    public final Object c(Object obj) {
        Object objA;
        obj.getClass();
        synchronized (this.b) {
            Object obj2 = this.a.a.get(obj);
            if (obj2 != null) {
                this.h++;
                return obj2;
            }
            this.i++;
            Object objB = b(obj);
            if (objB == null) {
                return null;
            }
            synchronized (this.b) {
                this.f++;
                cwg cwgVar = this.a;
                objA = cwgVar.a(obj, objB);
                if (objA != null) {
                    cwgVar.a(obj, objA);
                } else {
                    int i = this.d;
                    a(obj, objB);
                    this.d = i + 1;
                }
            }
            if (objA != null) {
                g(obj, objB);
                return objA;
            }
            f(this.c);
            return objB;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objA;
        obj.getClass();
        obj2.getClass();
        synchronized (this.b) {
            this.e++;
            int i = this.d;
            a(obj, obj2);
            this.d = i + 1;
            objA = this.a.a(obj, obj2);
            if (objA != null) {
                int i2 = this.d;
                a(obj, objA);
                this.d = i2 - 1;
            }
        }
        if (objA != null) {
            g(obj, objA);
        }
        f(this.c);
        return objA;
    }

    public final Object e(Object obj) {
        Object objB;
        synchronized (this.b) {
            objB = this.a.b(obj);
            if (objB != null) {
                int i = this.d;
                a(obj, objB);
                this.d = i - 1;
            }
        }
        if (objB != null) {
            g(obj, objB);
        }
        return objB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r5) {
        /*
            r4 = this;
        L0:
            cwf r0 = r4.b
            monitor-enter(r0)
            int r1 = r4.d     // Catch: java.lang.Throwable -> L54
            if (r1 < 0) goto L13
            cwg r1 = r4.a     // Catch: java.lang.Throwable -> L54
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L18
            int r1 = r4.d     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L18
        L13:
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            defpackage.cwh.b(r1)     // Catch: java.lang.Throwable -> L54
        L18:
            int r1 = r4.d     // Catch: java.lang.Throwable -> L54
            if (r1 <= r5) goto L52
            cwg r1 = r4.a     // Catch: java.lang.Throwable -> L54
            boolean r2 = r1.d()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L25
            goto L52
        L25:
            java.util.Set r2 = r1.c()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = defpackage.fcva.O(r2)     // Catch: java.lang.Throwable -> L54
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L33
            monitor-exit(r0)
            return
        L33:
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L54
            r1.b(r3)     // Catch: java.lang.Throwable -> L54
            int r1 = r4.d     // Catch: java.lang.Throwable -> L54
            a(r3, r2)     // Catch: java.lang.Throwable -> L54
            int r1 = r1 + (-1)
            r4.d = r1     // Catch: java.lang.Throwable -> L54
            int r1 = r4.g     // Catch: java.lang.Throwable -> L54
            int r1 = r1 + 1
            r4.g = r1     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)
            g(r3, r2)
            goto L0
        L52:
            monitor-exit(r0)
            return
        L54:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cub.f(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            int i = this.h;
            int i2 = this.i + i;
            str = "LruCache[maxSize=" + this.c + ",hits=" + this.h + ",misses=" + this.i + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
