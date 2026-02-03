package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgx {
    final /* synthetic */ BasePendingResult a;

    public dcgx(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        ThreadLocal threadLocal = BasePendingResult.b;
        BasePendingResult.l(this.a.e);
        super.finalize();
    }
}
