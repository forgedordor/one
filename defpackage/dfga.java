package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfga extends Thread {
    final /* synthetic */ dfgb a;

    public dfga(dfgb dfgbVar) {
        this.a = dfgbVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.b.abort();
    }
}
