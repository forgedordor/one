package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rqy implements Handler.Callback {
    final /* synthetic */ rqz a;

    public rqy(rqz rqzVar) {
        this.a = rqzVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.c((rqw) message.obj);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        this.a.c.l((rqw) message.obj);
        return false;
    }
}
