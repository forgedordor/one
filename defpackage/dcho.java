package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcho implements dciu, dcjw {
    public final dcfc a;
    public final dcgl b;
    final /* synthetic */ dchp d;
    private IAccountAccessor e = null;
    private Set f = null;
    public boolean c = false;

    public dcho(dchp dchpVar, dcfc dcfcVar, dcgl dcglVar) {
        this.d = dchpVar;
        this.a = dcfcVar;
        this.b = dcglVar;
    }

    @Override // defpackage.dcjw
    public final void a(ConnectionResult connectionResult) {
        this.d.o.post(new dchn(this, connectionResult));
    }

    @Override // defpackage.dciu
    public final void b(ConnectionResult connectionResult) {
        dchl dchlVar = (dchl) this.d.l.get(this.b);
        if (dchlVar != null) {
            dchlVar.i(connectionResult);
        }
    }

    @Override // defpackage.dciu
    public final void c(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
        } else {
            this.e = iAccountAccessor;
            this.f = set;
            e();
        }
    }

    @Override // defpackage.dciu
    public final void d(int i) {
        dchl dchlVar = (dchl) this.d.l.get(this.b);
        if (dchlVar != null) {
            if (dchlVar.f) {
                dchlVar.i(new ConnectionResult(17));
            } else {
                dchlVar.onConnectionSuspended(i);
            }
        }
    }

    public final void e() {
        IAccountAccessor iAccountAccessor;
        if (!this.c || (iAccountAccessor = this.e) == null) {
            return;
        }
        this.a.o(iAccountAccessor, this.f);
    }
}
