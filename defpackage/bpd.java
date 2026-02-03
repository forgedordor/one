package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpd extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return bpn.a();
        }
        if (Looper.myLooper() == null) {
            return null;
        }
        return new bpi(new Handler(Looper.myLooper()));
    }
}
