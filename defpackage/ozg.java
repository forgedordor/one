package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozg extends Handler {
    final /* synthetic */ ozm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozg(ozm ozmVar, Looper looper) {
        super(looper);
        this.a = ozmVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.gi();
    }
}
