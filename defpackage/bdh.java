package defpackage;

import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdh extends bjz {
    final /* synthetic */ bdp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdh(bdp bdpVar, Size size) {
        super(size, 34);
        this.a = bdpVar;
    }

    @Override // defpackage.bjz
    protected final ListenableFuture a() {
        return this.a.i;
    }
}
