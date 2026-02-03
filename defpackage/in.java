package defpackage;

import android.os.Message;
import android.support.v7.app.AlertController;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class in implements View.OnClickListener {
    final /* synthetic */ AlertController a;

    public in(AlertController alertController) {
        this.a = alertController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        AlertController alertController = this.a;
        Message messageObtain = (view != alertController.j || (message3 = alertController.l) == null) ? (view != alertController.m || (message2 = alertController.o) == null) ? (view != alertController.p || (message = alertController.r) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        alertController.I.obtainMessage(1, alertController.b).sendToTarget();
    }
}
