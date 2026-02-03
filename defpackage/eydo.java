package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eydo implements Runnable {
    private final eycz a;
    private final eycv b;

    public eydo(eycz eyczVar, eycv eycvVar) {
        this.a = eyczVar;
        this.b = eycvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
