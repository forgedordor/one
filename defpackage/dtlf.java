package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtlf implements Runnable {
    final /* synthetic */ dtlg a;

    public dtlf(dtlg dtlgVar) {
        this.a = dtlgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dtli dtliVar = this.a.a;
        if (dtliVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) dtliVar.getParent()).removeView(dtliVar);
        }
    }
}
