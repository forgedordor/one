package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfu implements mej {
    protected mfu() {
    }

    @Override // defpackage.mej
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.mej
    public final mew b(Looper looper, Handler.Callback callback) {
        return new mfw(new Handler(looper, callback));
    }
}
