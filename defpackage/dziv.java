package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dziv {
    public int a = 1;

    public abstract void i(dzfh dzfhVar);

    public abstract void j(dzfh dzfhVar);

    public final void k(dzfh dzfhVar) {
        if (this.a == 3) {
            ((ekrd) ((ekrd) dzfq.a.g()).h("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeBackgroundSignal", 42, "AbstractForegroundSignalAdapter.java")).q("Already in the background, not transitioning");
        } else {
            this.a = 3;
            i(dzfhVar);
        }
    }

    public final void l(dzfh dzfhVar) {
        if (this.a == 2) {
            ((ekrd) ((ekrd) dzfq.a.g()).h("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeForegroundSignal", 31, "AbstractForegroundSignalAdapter.java")).q("Already in the foreground, not transitioning");
        } else {
            this.a = 2;
            j(dzfhVar);
        }
    }
}
