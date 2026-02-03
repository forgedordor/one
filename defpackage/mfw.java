package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfw implements mew {
    public static final List a = new ArrayList(50);
    public final Handler b;

    public mfw(Handler handler) {
        this.b = handler;
    }

    private static mfv l() {
        mfv mfvVar;
        List list = a;
        synchronized (list) {
            mfvVar = list.isEmpty() ? new mfv() : (mfv) list.remove(list.size() - 1);
        }
        return mfvVar;
    }

    @Override // defpackage.mew
    public final void a(int i) {
        mee.a(true);
        this.b.removeMessages(i);
    }

    @Override // defpackage.mew
    public final boolean b(Runnable runnable) {
        return this.b.post(runnable);
    }

    @Override // defpackage.mew
    public final mfv c(int i) {
        mfv mfvVarL = l();
        mfvVarL.a = this.b.obtainMessage(i);
        return mfvVarL;
    }

    @Override // defpackage.mew
    public final mfv d(int i, Object obj) {
        mfv mfvVarL = l();
        mfvVarL.a = this.b.obtainMessage(i, obj);
        return mfvVarL;
    }

    @Override // defpackage.mew
    public final mfv e(int i, int i2, int i3) {
        mfv mfvVarL = l();
        mfvVarL.a = this.b.obtainMessage(i, i2, i3);
        return mfvVarL;
    }

    @Override // defpackage.mew
    public final boolean f() {
        mee.a(true);
        return this.b.hasMessages(1);
    }

    @Override // defpackage.mew
    public final mfv g(int i, int i2, Object obj) {
        mfv mfvVarL = l();
        mfvVarL.a = this.b.obtainMessage(i, i2, 0, obj);
        return mfvVarL;
    }

    @Override // defpackage.mew
    public final void h(Runnable runnable) {
        this.b.postDelayed(runnable, 10L);
    }

    @Override // defpackage.mew
    public final void i() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.mew
    public final void j(int i) {
        this.b.sendEmptyMessage(i);
    }

    @Override // defpackage.mew
    public final void k(mfv mfvVar) {
        Message message = mfvVar.a;
        mee.f(message);
        this.b.sendMessageAtFrontOfQueue(message);
        mfvVar.a();
    }
}
