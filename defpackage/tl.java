package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tl implements Runnable {
    final /* synthetic */ tm a;

    public tl(tm tmVar) {
        this.a = tmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tm tmVar = this.a;
        tmVar.b = null;
        tmVar.drawableStateChanged();
    }
}
