package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuq {
    private static eeuq e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new eeuo(this));
    public eeup c;
    public eeup d;

    private eeuq() {
    }

    public static eeuq a() {
        if (e == null) {
            e = new eeuq();
        }
        return e;
    }

    public final void b(eeup eeupVar) {
        int i = eeupVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(eeupVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, eeupVar), i);
    }

    public final void c() {
        eeup eeupVar = this.d;
        if (eeupVar != null) {
            this.c = eeupVar;
            this.d = null;
            eeud eeudVar = (eeud) eeupVar.a.get();
            if (eeudVar == null) {
                this.c = null;
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = eeudVar.a;
            Handler handler = BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(0, baseTransientBottomBar));
        }
    }

    public final boolean d(eeup eeupVar, int i) {
        eeud eeudVar = (eeud) eeupVar.a.get();
        if (eeudVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(eeupVar);
        BaseTransientBottomBar baseTransientBottomBar = eeudVar.a;
        Handler handler = BaseTransientBottomBar.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, baseTransientBottomBar));
        return true;
    }

    public final void e(eeud eeudVar) {
        synchronized (this.a) {
            if (g(eeudVar)) {
                eeup eeupVar = this.c;
                if (!eeupVar.c) {
                    eeupVar.c = true;
                    this.b.removeCallbacksAndMessages(eeupVar);
                }
            }
        }
    }

    public final void f(eeud eeudVar) {
        synchronized (this.a) {
            if (g(eeudVar)) {
                eeup eeupVar = this.c;
                if (eeupVar.c) {
                    eeupVar.c = false;
                    b(eeupVar);
                }
            }
        }
    }

    public final boolean g(eeud eeudVar) {
        eeup eeupVar = this.c;
        return eeupVar != null && eeupVar.a(eeudVar);
    }

    public final boolean h(eeud eeudVar) {
        eeup eeupVar = this.d;
        return eeupVar != null && eeupVar.a(eeudVar);
    }
}
