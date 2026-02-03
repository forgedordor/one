package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcc {
    public static final ListenableFuture a(final Executor executor, final fdae fdaeVar) {
        return kol.a(new koi() { // from class: qcb
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                kogVar.a(new Runnable() { // from class: qbz
                    @Override // java.lang.Runnable
                    public final void run() {
                        atomicBoolean.set(true);
                    }
                }, pzx.a);
                final fdae fdaeVar2 = fdaeVar;
                executor.execute(new Runnable() { // from class: qca
                    @Override // java.lang.Runnable
                    public final void run() {
                        kog kogVar2 = kogVar;
                        fdae fdaeVar3 = fdaeVar2;
                        if (atomicBoolean.get()) {
                            return;
                        }
                        try {
                            kogVar2.b(fdaeVar3.invoke());
                        } catch (Throwable th) {
                            kogVar2.c(th);
                        }
                    }
                });
                return fctx.a;
            }
        });
    }
}
