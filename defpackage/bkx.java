package defpackage;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkx extends bjz {
    private final Surface a;

    public bkx(Surface surface) {
        super(bjz.b, 0);
        this.a = surface;
    }

    @Override // defpackage.bjz
    public final ListenableFuture a() {
        return bqk.b(this.a);
    }

    public bkx(Surface surface, Size size, int i) {
        super(size, i);
        this.a = surface;
    }
}
