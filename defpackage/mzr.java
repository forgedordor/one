package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzr extends Handler {
    final /* synthetic */ mzz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzr(mzz mzzVar, Looper looper) {
        super(looper);
        this.a = mzzVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (mzp mzpVar : this.a.c) {
            mzpVar.k();
            if (Arrays.equals(mzpVar.f, bArr)) {
                if (message.what == 2 && mzpVar.e == 4) {
                    String str = mgb.a;
                    mzpVar.f(false);
                    return;
                }
                return;
            }
        }
    }
}
