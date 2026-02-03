package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deot extends ddmy {
    final /* synthetic */ deph a;
    private boolean b;
    private final deos c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deot(deph dephVar, Looper looper) {
        super(looper);
        this.a = dephVar;
        this.c = new deos();
    }

    private final synchronized void c() {
        if (this.b) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            Log.v("WearableLS", "bindService: ".concat(String.valueOf(String.valueOf(this.a.E))));
        }
        deph dephVar = this.a;
        dephVar.bindService(dephVar.G, this.c, 1);
        this.b = true;
    }

    public final synchronized void a(String str) {
        if (this.b) {
            if (Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(this.a.E));
            }
            try {
                this.a.unbindService(this.c);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.b = false;
        }
    }

    @Override // defpackage.ddmy
    protected final void b(Message message) {
        c();
        try {
            super.b(message);
            if (hasMessages(0)) {
                return;
            }
            a("dispatch");
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                a("dispatch");
            }
            throw th;
        }
    }
}
