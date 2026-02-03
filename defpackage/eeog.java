package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeog implements Runnable {
    final /* synthetic */ eeoj a;

    public eeog(eeoj eeojVar) {
        this.a = eeojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eeoj eeojVar = this.a;
        ((eepe) eeojVar.getCurrentDrawable()).l(false, false, true);
        if ((eeojVar.getProgressDrawable() == null || !eeojVar.getProgressDrawable().isVisible()) && (eeojVar.getIndeterminateDrawable() == null || !eeojVar.getIndeterminateDrawable().isVisible())) {
            eeojVar.setVisibility(4);
        }
        eeojVar.e = -1L;
    }
}
