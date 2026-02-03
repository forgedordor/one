package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qak {
    public static final ListenableFuture a(final Executor executor, final String str, final fdae fdaeVar) {
        executor.getClass();
        return kol.a(new koi() { // from class: qae
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                kogVar.a(new Runnable() { // from class: qag
                    @Override // java.lang.Runnable
                    public final void run() {
                        atomicBoolean.set(true);
                    }
                }, pzx.a);
                final fdae fdaeVar2 = fdaeVar;
                executor.execute(new Runnable() { // from class: qah
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
                return str;
            }
        });
    }

    public static /* synthetic */ ListenableFuture b(final fcyh fcyhVar, final fdat fdatVar) {
        final fdjz fdjzVar = fdjz.a;
        fcyhVar.getClass();
        fdjzVar.getClass();
        return kol.a(new koi() { // from class: qaf
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                fcyh fcyhVar2 = fcyhVar;
                final fdlr fdlrVar = (fdlr) fcyhVar2.get(fdlr.c);
                kogVar.a(new Runnable() { // from class: qai
                    @Override // java.lang.Runnable
                    public final void run() {
                        fdlr fdlrVar2 = fdlrVar;
                        if (fdlrVar2 != null) {
                            fdlrVar2.t(null);
                        }
                    }
                }, pzx.a);
                return fdil.d(fdjy.b(fcyhVar2), null, fdjzVar, new qaj(fdatVar, kogVar, null), 1);
            }
        });
    }
}
