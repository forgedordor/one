package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class abm extends abq {
    @Override // defpackage.abq
    public void a(ack ackVar, ack ackVar2, Window window, View view, boolean z, boolean z2) {
        ackVar.getClass();
        ackVar2.getClass();
        window.getClass();
        view.getClass();
        lfq.a(window, false);
        window.setStatusBarColor(ackVar.a(z));
        window.setNavigationBarColor(ackVar2.a(z2));
        lhb lhbVar = new lhb(window, view);
        lhbVar.b(!z);
        lhbVar.a(!z2);
    }
}
