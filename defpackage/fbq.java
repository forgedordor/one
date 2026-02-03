package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbq implements fdap {
    final /* synthetic */ iga a;
    final /* synthetic */ faj b;

    public fbq(iga igaVar, faj fajVar) {
        this.a = igaVar;
        this.b = fajVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        KeyEvent keyEvent = ((iqh) obj).a;
        InputDevice device = keyEvent.getDevice();
        boolean zB = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual() && iqi.a(iqj.a(keyEvent), 2) && keyEvent.getSource() != 257) {
            if (fbr.a(keyEvent, 19)) {
                zB = this.a.b(5);
            } else if (fbr.a(keyEvent, 20)) {
                zB = this.a.b(6);
            } else if (fbr.a(keyEvent, 21)) {
                zB = this.a.b(3);
            } else if (fbr.a(keyEvent, 22)) {
                zB = this.a.b(4);
            } else if (fbr.a(keyEvent, 23)) {
                jmj jmjVar = this.b.u;
                zB = true;
                if (jmjVar != null) {
                    jmjVar.b();
                }
            }
        }
        return Boolean.valueOf(zB);
    }
}
