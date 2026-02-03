package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeuo implements Handler.Callback {
    final /* synthetic */ eeuq a;

    public eeuo(eeuq eeuqVar) {
        this.a = eeuqVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        eeuq eeuqVar = this.a;
        eeup eeupVar = (eeup) message.obj;
        synchronized (eeuqVar.a) {
            if (eeuqVar.c == eeupVar || eeuqVar.d == eeupVar) {
                eeuqVar.d(eeupVar, 2);
            }
        }
        return true;
    }
}
