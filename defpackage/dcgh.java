package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgh extends dcgd {
    private final dcja a;
    private final defr b;
    private final dciv d;

    public dcgh(int i, dcja dcjaVar, defr defrVar, dciv dcivVar) {
        super(i);
        this.b = defrVar;
        this.a = dcjaVar;
        this.d = dcivVar;
        if (i == 2 && dcjaVar.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.dcgd
    public final boolean a(dchl dchlVar) {
        return this.a.c;
    }

    @Override // defpackage.dcgd
    public final Feature[] b(dchl dchlVar) {
        return this.a.b;
    }

    @Override // defpackage.dcgj
    public final void d(Status status) {
        this.b.c(this.d.a(status));
    }

    @Override // defpackage.dcgj
    public final void e(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.dcgj
    public final void f(dchl dchlVar) throws DeadObjectException {
        try {
            this.a.a(dchlVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(dcgj.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.dcgj
    public final void g(dchb dchbVar, boolean z) {
        Map map = dchbVar.b;
        defr defrVar = this.b;
        map.put(defrVar, Boolean.valueOf(z));
        defrVar.a.s(new dcha(dchbVar, defrVar));
    }
}
