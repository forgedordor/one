package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class evvs {
    private static volatile int a = 100;

    public abstract Object a(Object obj);

    public abstract Object b();

    public abstract void c(Object obj, int i, int i2);

    public abstract void d(Object obj, int i, long j);

    public abstract void e(Object obj, int i, Object obj2);

    public abstract void f(Object obj, int i, evqs evqsVar);

    public abstract void g(Object obj, int i, long j);

    public abstract void h(Object obj);

    final boolean i(Object obj, evut evutVar, int i) throws evtj {
        evra evraVar = (evra) evutVar;
        int i2 = evraVar.b;
        int iA = evwj.a(i2);
        int iB = evwj.b(i2);
        if (iB == 0) {
            g(obj, iA, evutVar.k());
            return true;
        }
        if (iB == 1) {
            d(obj, iA, evutVar.j());
            return true;
        }
        if (iB == 2) {
            f(obj, iA, evutVar.o());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                if (i != 0) {
                    return false;
                }
                throw new evtj("Protocol message end-group tag did not match expected tag.");
            }
            if (iB != 5) {
                throw new evti();
            }
            c(obj, iA, evutVar.e());
            return true;
        }
        Object objB = b();
        int iC = evwj.c(iA, 4);
        int i3 = i + 1;
        if (i3 >= a) {
            throw new evtj("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (evutVar.c() != Integer.MAX_VALUE && i(objB, evutVar, i3)) {
        }
        if (iC != evraVar.b) {
            throw new evtj("Protocol message end-group tag did not match expected tag.");
        }
        j(objB);
        e(obj, iA, objB);
        return true;
    }

    public abstract void j(Object obj);
}
