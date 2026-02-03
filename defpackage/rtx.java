package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtx extends rtp {
    private static final Handler b = new Handler(Looper.getMainLooper(), new rtw());
    public final rbv a;

    public rtx(rbv rbvVar) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = rbvVar;
    }

    @Override // defpackage.rua
    public final void b(Object obj, ruk rukVar) {
        rte rteVar = this.c;
        if (rteVar == null || !rteVar.l()) {
            return;
        }
        b.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.rua
    public final void e(Drawable drawable) {
    }
}
