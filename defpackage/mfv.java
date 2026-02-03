package defpackage;

import android.os.Message;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfv {
    public Message a;

    public final void a() {
        this.a = null;
        List list = mfw.a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.a;
        mee.f(message);
        message.sendToTarget();
        a();
    }
}
