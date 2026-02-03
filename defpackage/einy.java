package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einy {
    public static ListenableFuture a(ListenableFuture listenableFuture, ejvr ejvrVar, Executor executor) {
        SettableFuture settableFutureCreate = SettableFuture.create();
        eork.r(listenableFuture, new eint(new einu(settableFutureCreate), new einv(ejvrVar, settableFutureCreate)), new einx(executor, settableFutureCreate));
        return settableFutureCreate;
    }
}
