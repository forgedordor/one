package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgw extends ddmy {
    public dcgw() {
        super(Looper.getMainLooper());
    }

    public final void a(dcfy dcfyVar, dcfx dcfxVar) {
        ThreadLocal threadLocal = BasePendingResult.b;
        sendMessage(obtainMessage(1, new Pair(dcfyVar, dcfxVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).k(Status.d);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        dcfy dcfyVar = (dcfy) pair.first;
        dcfx dcfxVar = (dcfx) pair.second;
        try {
            dcfyVar.a(dcfxVar);
        } catch (RuntimeException e) {
            BasePendingResult.l(dcfxVar);
            throw e;
        }
    }

    public dcgw(Looper looper) {
        super(looper);
    }
}
