package defpackage;

import android.os.Trace;
import internal.J.N;
import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.CronetUrlRequestContext;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdw implements Runnable {
    final /* synthetic */ fgea a;
    final /* synthetic */ CronetUrlRequestContext b;

    public fgdw(CronetUrlRequestContext cronetUrlRequestContext, fgea fgeaVar) {
        this.a = fgeaVar;
        this.b = cronetUrlRequestContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetUrlRequestContext cronetUrlRequestContext = this.b;
        synchronized (cronetUrlRequestContext.b) {
            new ffyu("CronetUrlRequestContext#CronetUrlRequestContext initializing request context");
            try {
                N.M6Dz0nZ5(cronetUrlRequestContext.c, cronetUrlRequestContext);
                Trace.endSection();
            } finally {
            }
        }
        fgea fgeaVar = this.a;
        if (fgeaVar != null) {
            fgct fgctVar = CronetLibraryLoader.e;
            int i = fgctVar.a;
            fgcx fgcxVar = fgeaVar.a;
            fgcxVar.d = i;
            fgcxVar.e = fgctVar.b;
            fgcxVar.f = fgctVar.c;
            fgcxVar.g = fgctVar.d;
            int iA = fgeaVar.a();
            synchronized (fgcxVar) {
                fgcxVar.c = iA;
                fgeaVar.b();
            }
        }
    }
}
