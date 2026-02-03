package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eoqx<V> extends eoqy<V> {
    public final ListenableFuture b;

    protected eoqx(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.b = listenableFuture;
    }

    @Override // defpackage.eoqy
    protected final ListenableFuture gM() {
        return this.b;
    }

    @Override // defpackage.eoqy, defpackage.eoqw
    protected final /* synthetic */ Future gN() {
        return this.b;
    }

    @Override // defpackage.eoqw, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.b;
    }
}
