package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcor implements fcmj {
    @Override // defpackage.fcmj
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(fcdy.k("grpc-okhttp-%d"));
    }

    @Override // defpackage.fcmj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
