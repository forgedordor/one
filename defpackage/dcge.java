package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dcge extends dcgd {
    protected final defr a;

    public dcge(int i, defr defrVar) {
        super(i);
        this.a = defrVar;
    }

    protected abstract void c(dchl dchlVar);

    @Override // defpackage.dcgj
    public final void d(Status status) {
        this.a.c(new dcff(status));
    }

    @Override // defpackage.dcgj
    public final void e(Exception exc) {
        this.a.c(exc);
    }

    @Override // defpackage.dcgj
    public final void f(dchl dchlVar) throws DeadObjectException {
        try {
            c(dchlVar);
        } catch (DeadObjectException e) {
            d(dcgj.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(dcgj.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.dcgj
    public void g(dchb dchbVar, boolean z) {
    }
}
