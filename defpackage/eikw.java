package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eikw extends fbox {
    private final SettableFuture a;

    public eikw(fbsm fbsmVar, eieu eieuVar) {
        super(fbsmVar);
        SettableFuture settableFutureCreate = SettableFuture.create();
        eieuVar.b(settableFutureCreate);
        this.a = settableFutureCreate;
    }

    @Override // defpackage.fbsa, defpackage.fbsm
    public final void a(Status status, fbrg fbrgVar) {
        super.a(status, fbrgVar);
        this.a.set(null);
    }
}
