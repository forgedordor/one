package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ur implements Runnable {
    final /* synthetic */ us a;

    public ur(us usVar) {
        this.a = usVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        us usVar = this.a;
        tm tmVar = usVar.e;
        if (tmVar == null || !tmVar.isAttachedToWindow() || usVar.e.getCount() <= usVar.e.getChildCount() || usVar.e.getChildCount() > usVar.k) {
            return;
        }
        usVar.r.setInputMethodMode(2);
        usVar.v();
    }
}
