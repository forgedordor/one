package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfj {
    private static final dzfj b;
    private static volatile boolean c;
    private static volatile dzfj d;
    public final dzfk a;

    static {
        dzfj dzfjVar = new dzfj(new dzfi());
        b = dzfjVar;
        c = true;
        d = dzfjVar;
    }

    public dzfj(dzfk dzfkVar) {
        dzfkVar.getClass();
        this.a = dzfkVar;
    }

    public static dzfj a() {
        if (d == b && c) {
            c = false;
            ekrd ekrdVar = (ekrd) dzfq.a.j();
            ekrdVar.Z(Math.random() < 0.01d ? eksk.FULL : eksk.NONE);
            ((ekrd) ekrdVar.h("com/google/android/libraries/performance/primes/Primes", "get", 179, "Primes.java")).q("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return d;
    }

    static synchronized void d(dzfj dzfjVar) {
        if (d != b) {
            ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/Primes", "cache", 139, "Primes.java")).q("Primes cached more than once. This call will be ignored.");
        } else {
            d = dzfjVar;
        }
    }

    public static boolean i() {
        return d != b;
    }

    public final dzqg b() {
        return this.a.a();
    }

    public final dzub c() {
        return this.a.b();
    }

    public final void e(dzfh dzfhVar) {
        f(dzfhVar, null);
    }

    public final void f(dzfh dzfhVar, feeg feegVar) {
        this.a.e(dzfhVar, feegVar);
    }

    public final void g(dzrm dzrmVar) {
        this.a.f(dzrmVar);
    }

    public final void h(dzub dzubVar, dzfh dzfhVar, dzua dzuaVar) {
        this.a.i(dzubVar, dzfhVar, null, dzuaVar);
    }
}
