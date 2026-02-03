package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class casl extends egxm {
    final /* synthetic */ casm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public casl(casm casmVar, eigp eigpVar) {
        super(eigpVar, "ContentChangeObserver.Observer#onChange", eoqg.a);
        this.a = casmVar;
    }

    @Override // defpackage.egxm
    public final void a(Uri uri) {
        casp caspVar = (casp) this.a.a.get();
        if (caspVar != null) {
            fcsu fcsuVar = caspVar.a;
            eieu eieuVarK = eiiy.k("WorkerStartupModule#provideGwqWorkerStartupTask#onContentChanged");
            try {
                ((axpa) fcsuVar.b()).b().E(TimeUnit.SECONDS.toMillis(2L));
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
