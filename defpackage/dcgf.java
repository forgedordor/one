package defpackage;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgf extends dcgj {
    protected final dcgp a;

    public dcgf(int i, dcgp dcgpVar) {
        super(i);
        this.a = dcgpVar;
    }

    @Override // defpackage.dcgj
    public final void d(Status status) {
        try {
            this.a.j(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.dcgj
    public final void e(Exception exc) {
        try {
            this.a.j(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.dcgj
    public final void f(dchl dchlVar) throws DeadObjectException {
        try {
            this.a.i(dchlVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    @Override // defpackage.dcgj
    public final void g(dchb dchbVar, boolean z) {
        dcgp dcgpVar = this.a;
        dchbVar.a.put(dcgpVar, Boolean.valueOf(z));
        dcgpVar.e(new dcgz(dchbVar, dcgpVar));
    }
}
