package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehui extends fbou {
    private final SettableFuture a;

    public ehui(fbng fbngVar, SettableFuture settableFuture) {
        super(fbngVar);
        this.a = settableFuture;
    }

    @Override // defpackage.fbrz, defpackage.fbng
    public final void a(Status status, fbrg fbrgVar) {
        try {
            super.a(status, fbrgVar);
        } finally {
            this.a.set(null);
        }
    }
}
