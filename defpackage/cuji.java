package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.messaging.ui.ClassZeroActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuji extends Handler {
    final /* synthetic */ ClassZeroActivity a;

    public cuji(ClassZeroActivity classZeroActivity) {
        this.a = classZeroActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            ClassZeroActivity classZeroActivity = this.a;
            classZeroActivity.p = false;
            classZeroActivity.q.dismiss();
            classZeroActivity.G();
            classZeroActivity.F();
        }
    }
}
