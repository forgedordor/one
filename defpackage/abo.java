package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class abo extends abn {
    @Override // defpackage.abm, defpackage.abq
    public void a(ack ackVar, ack ackVar2, Window window, View view, boolean z, boolean z2) {
        ackVar.getClass();
        ackVar2.getClass();
        window.getClass();
        view.getClass();
        lfq.a(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        lhb lhbVar = new lhb(window, view);
        lhbVar.b(!z);
        lhbVar.a(true ^ z2);
    }
}
