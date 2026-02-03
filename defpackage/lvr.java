package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lvr implements Runnable {
    final /* synthetic */ lvv a;

    public lvr(lvv lvvVar) {
        this.a = lvvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        lvv lvvVar = this.a;
        synchronized (lvvVar.c) {
            obj = lvvVar.f;
            lvvVar.f = lvv.b;
        }
        this.a.m(obj);
    }
}
