package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzbh {
    public static ListenableFuture a(final dcfs dcfsVar, final ejvr ejvrVar, final Executor executor) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        dcfsVar.h(new dcfy() { // from class: dzbe
            @Override // defpackage.dcfy
            public final void a(final dcfx dcfxVar) {
                Status statusA = dcfxVar.a();
                if (statusA.g == 14) {
                    throw new AssertionError("We never use the blocking API for these calls: ".concat(String.valueOf(String.valueOf(dcfxVar))));
                }
                final SettableFuture settableFuture = settableFutureCreate;
                if (statusA.d()) {
                    final ejvr ejvrVar2 = ejvrVar;
                    executor.execute(new Runnable() { // from class: dzbd
                        @Override // java.lang.Runnable
                        public final void run() {
                            ejvr ejvrVar3 = ejvrVar2;
                            SettableFuture settableFuture2 = settableFuture;
                            dcfx dcfxVar2 = dcfxVar;
                            try {
                                try {
                                    settableFuture2.set(ejvrVar3.apply(dcfxVar2));
                                } catch (RuntimeException e) {
                                    settableFuture2.setException(e);
                                }
                            } finally {
                                dzbh.b(dcfxVar2);
                            }
                        }
                    });
                } else {
                    settableFuture.setException(new dzau(dcfxVar, statusA));
                    dzbh.b(dcfxVar);
                }
            }
        }, TimeUnit.SECONDS);
        settableFutureCreate.b(eiid.k(new Runnable() { // from class: dzbf
            @Override // java.lang.Runnable
            public final void run() {
                if (settableFutureCreate.isCancelled()) {
                    dcfsVar.f();
                }
            }
        }), eoqg.a);
        return settableFutureCreate;
    }

    public static void b(dcfx dcfxVar) {
        if (dcfxVar instanceof dcfu) {
            ((dcfu) dcfxVar).b();
        }
    }
}
