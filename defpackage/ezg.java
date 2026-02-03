package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezg implements fdap {
    final /* synthetic */ faj a;
    final /* synthetic */ fmx b;

    public ezg(faj fajVar, fmx fmxVar) {
        this.a = fajVar;
        this.b = fmxVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        KeyEvent keyEvent = ((iqh) obj).a;
        boolean z = false;
        if (this.a.c() == ezm.b && keyEvent.getKeyCode() == 4 && iqi.a(iqj.a(keyEvent), 1)) {
            this.b.i(null);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
