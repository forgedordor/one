package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.SignInCoordinator;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchl implements dcfo, dcfp {
    public final dcfc b;
    public final dcgl c;
    public final int e;
    public boolean f;
    public final /* synthetic */ dchp i;
    private final dchb j;
    private final SignInCoordinator l;
    public final Queue a = new LinkedList();
    private final Set k = new HashSet();
    public final Map d = new HashMap();
    public final List g = new ArrayList();
    private ConnectionResult m = null;
    public int h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public dchl(dchp dchpVar, dcfm dcfmVar) {
        this.i = dchpVar;
        Looper looper = dchpVar.o.getLooper();
        dcke dckeVarA = dcfmVar.h().a();
        dceu dceuVar = dcfmVar.f.a;
        dclh.m(dceuVar);
        dcfc dcfcVarB = dceuVar.b(dcfmVar.c, looper, dckeVarA, dcfmVar.g, this, this);
        dcns dcnsVar = dcfmVar.e;
        if (dcnsVar != null && (dcfcVarB instanceof BaseGmsClient)) {
            ((BaseGmsClient) dcfcVarB).n = dcnsVar;
        } else if (dcnsVar == null || !(dcfcVarB instanceof dcih)) {
            String str = dcfmVar.d;
            if (str != null && (dcfcVarB instanceof BaseGmsClient)) {
                ((BaseGmsClient) dcfcVarB).m = str;
            }
            if (str != null && (dcfcVarB instanceof dcih)) {
            }
        }
        this.b = dcfcVarB;
        this.c = dcfmVar.h;
        this.j = new dchb();
        this.e = dcfmVar.j;
        if (dcfcVarB.h()) {
            this.l = new SignInCoordinator(dchpVar.g, dchpVar.o, dcfmVar.h().a());
        } else {
            this.l = null;
        }
    }

    private final Feature n(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] featureArrS = this.b.s();
            if (featureArrS == null) {
                featureArrS = new Feature[0];
            }
            csq csqVar = new csq(featureArrS.length);
            for (Feature feature : featureArrS) {
                csqVar.put(feature.a, Long.valueOf(feature.a()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) csqVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final Status o(ConnectionResult connectionResult) {
        return dchp.a(this.c, connectionResult);
    }

    private final void p(ConnectionResult connectionResult) {
        Set set = this.k;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            set.clear();
            return;
        }
        if (dclc.a(connectionResult, ConnectionResult.a)) {
            this.b.u();
        }
        throw null;
    }

    private final void q(Status status, Exception exc, boolean z) {
        dclh.d(this.i.o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            dcgj dcgjVar = (dcgj) it.next();
            if (!z || dcgjVar.c == 2) {
                if (status != null) {
                    dcgjVar.d(status);
                } else {
                    dcgjVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void r() {
        dchp dchpVar = this.i;
        Handler handler = dchpVar.o;
        dcgl dcglVar = this.c;
        handler.removeMessages(12, dcglVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, dcglVar), dchpVar.e);
    }

    private final void s(dcgj dcgjVar) {
        dcgjVar.g(this.j, l());
        try {
            dcgjVar.f(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.b.n("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean t(dcgj dcgjVar) {
        if (!(dcgjVar instanceof dcgd)) {
            s(dcgjVar);
            return true;
        }
        dcgd dcgdVar = (dcgd) dcgjVar;
        Feature featureN = n(dcgdVar.b(this));
        if (featureN == null) {
            s(dcgjVar);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + featureN.a + ", " + featureN.a() + ").");
        dchp dchpVar = this.i;
        if (!dchpVar.p || !dcgdVar.a(this)) {
            dcgdVar.e(new dcgc(featureN));
            return true;
        }
        dchm dchmVar = new dchm(this.c, featureN);
        List list = this.g;
        int iIndexOf = list.indexOf(dchmVar);
        if (iIndexOf >= 0) {
            dchm dchmVar2 = (dchm) list.get(iIndexOf);
            Handler handler = dchpVar.o;
            handler.removeMessages(15, dchmVar2);
            handler.sendMessageDelayed(Message.obtain(handler, 15, dchmVar2), 5000L);
            return false;
        }
        list.add(dchmVar);
        Handler handler2 = dchpVar.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, dchmVar), 5000L);
        handler2.sendMessageDelayed(Message.obtain(handler2, 16, dchmVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (u(connectionResult)) {
            return false;
        }
        dchpVar.i(connectionResult, this.e);
        return false;
    }

    private final boolean u(ConnectionResult connectionResult) {
        synchronized (dchp.c) {
            dchp dchpVar = this.i;
            if (dchpVar.m == null || !dchpVar.n.contains(this.c)) {
                return false;
            }
            dchc dchcVar = dchpVar.m;
            dcgr dcgrVar = new dcgr(connectionResult, this.e);
            AtomicReference atomicReference = dchcVar.b;
            while (true) {
                if (atomicReference.compareAndSet(null, dcgrVar)) {
                    dchcVar.c.post(new dcgt(dchcVar, dcgrVar));
                    break;
                }
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return true;
        }
    }

    public final void a() {
        dclh.d(this.i.o);
        this.m = null;
    }

    public final void b() {
        dchp dchpVar = this.i;
        dclh.d(dchpVar.o);
        dcfc dcfcVar = this.b;
        if (dcfcVar.p() || dcfcVar.q()) {
            return;
        }
        try {
            dckx dckxVar = dchpVar.i;
            Context context = dchpVar.g;
            dclh.m(context);
            dclh.m(dcfcVar);
            int iH = 0;
            if (dcfcVar.r()) {
                int iA = dcfcVar.a();
                int iB = dckxVar.b(iA);
                if (iB == -1) {
                    SparseIntArray sparseIntArray = dckxVar.a;
                    synchronized (sparseIntArray) {
                        int i = 0;
                        while (true) {
                            if (i >= sparseIntArray.size()) {
                                iH = -1;
                                break;
                            }
                            int iKeyAt = sparseIntArray.keyAt(i);
                            if (iKeyAt > iA && sparseIntArray.get(iKeyAt) == 0) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (iH == -1) {
                            iH = dckxVar.b.h(context, iA);
                        }
                        sparseIntArray.put(iA, iH);
                    }
                } else {
                    iH = iB;
                }
            }
            if (iH != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iH, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
                onConnectionFailed(connectionResult);
                return;
            }
            dchp dchpVar2 = this.i;
            dcfc dcfcVar2 = this.b;
            dcho dchoVar = new dcho(dchpVar2, dcfcVar2, this.c);
            if (dcfcVar2.h()) {
                SignInCoordinator signInCoordinator = this.l;
                dclh.m(signInCoordinator);
                signInCoordinator.startSignIn(dchoVar);
            }
            try {
                dcfcVar2.l(dchoVar);
            } catch (SecurityException e) {
                g(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            g(new ConnectionResult(10), e2);
        }
    }

    public final void c(dcgj dcgjVar) {
        dclh.d(this.i.o);
        if (this.b.p()) {
            if (t(dcgjVar)) {
                r();
                return;
            } else {
                this.a.add(dcgjVar);
                return;
            }
        }
        this.a.add(dcgjVar);
        ConnectionResult connectionResult = this.m;
        if (connectionResult == null || !connectionResult.b()) {
            b();
        } else {
            onConnectionFailed(connectionResult);
        }
    }

    public final void d(Status status) {
        dclh.d(this.i.o);
        q(status, null, false);
    }

    public final void e() {
        Queue queue = this.a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dcgj dcgjVar = (dcgj) arrayList.get(i);
            if (!this.b.p()) {
                return;
            }
            if (t(dcgjVar)) {
                queue.remove(dcgjVar);
            }
        }
    }

    public final void f() {
        a();
        p(ConnectionResult.a);
        k();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            dcik dcikVar = ((dcil) it.next()).a;
            if (n(dcikVar.b) != null) {
                it.remove();
            } else {
                try {
                    dcikVar.b(this.b, new defr());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.b.n("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        e();
        r();
    }

    public final void g(ConnectionResult connectionResult, Exception exc) {
        dchp dchpVar = this.i;
        Handler handler = dchpVar.o;
        dclh.d(handler);
        SignInCoordinator signInCoordinator = this.l;
        if (signInCoordinator != null) {
            signInCoordinator.stopSignIn();
        }
        a();
        dchpVar.i.a();
        p(connectionResult);
        if ((this.b instanceof dcmb) && connectionResult.c != 24) {
            dchpVar.f = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = connectionResult.c;
        if (i == 4) {
            d(dchp.b);
            return;
        }
        if (i == 25) {
            d(o(connectionResult));
            return;
        }
        Queue queue = this.a;
        if (queue.isEmpty()) {
            this.m = connectionResult;
            return;
        }
        if (exc != null) {
            dclh.d(handler);
            q(null, exc, false);
            return;
        }
        if (!dchpVar.p) {
            d(o(connectionResult));
            return;
        }
        q(o(connectionResult), null, true);
        if (queue.isEmpty() || u(connectionResult) || dchpVar.i(connectionResult, this.e)) {
            return;
        }
        if (i == 18) {
            this.f = true;
        }
        if (this.f) {
            handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        } else {
            d(o(connectionResult));
        }
    }

    public final void h(int i) {
        a();
        this.f = true;
        String strJ = this.b.j();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strJ != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strJ);
        }
        this.j.a(true, new Status(20, sb.toString()));
        dchp dchpVar = this.i;
        dcgl dcglVar = this.c;
        Handler handler = dchpVar.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, dcglVar), 5000L);
        handler.sendMessageDelayed(Message.obtain(handler, 11, dcglVar), 120000L);
        dchpVar.i.a();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Runnable runnable = ((dcil) it.next()).c;
        }
    }

    public final void i(ConnectionResult connectionResult) {
        dclh.d(this.i.o);
        dcfc dcfcVar = this.b;
        dcfcVar.n("onSignInFailed for " + dcfcVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        onConnectionFailed(connectionResult);
    }

    public final void j() {
        dclh.d(this.i.o);
        Status status = dchp.a;
        d(status);
        this.j.a(false, status);
        for (dchz dchzVar : (dchz[]) this.d.keySet().toArray(new dchz[0])) {
            c(new dcgi(dchzVar, new defr()));
        }
        p(new ConnectionResult(4));
        dcfc dcfcVar = this.b;
        if (dcfcVar.p()) {
            dcfcVar.t(new dchk(this));
        }
    }

    public final void k() {
        if (this.f) {
            dchp dchpVar = this.i;
            dcgl dcglVar = this.c;
            Handler handler = dchpVar.o;
            handler.removeMessages(11, dcglVar);
            handler.removeMessages(9, dcglVar);
            this.f = false;
        }
    }

    public final boolean l() {
        return this.b.h();
    }

    public final boolean m(boolean z) {
        dclh.d(this.i.o);
        dcfc dcfcVar = this.b;
        if (!dcfcVar.p() || !this.d.isEmpty()) {
            return false;
        }
        dchb dchbVar = this.j;
        if (dchbVar.a.isEmpty() && dchbVar.b.isEmpty()) {
            dcfcVar.n("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        r();
        return false;
    }

    @Override // defpackage.dcgy
    public final void onConnected(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.i.o;
        if (looperMyLooper == handler.getLooper()) {
            f();
        } else {
            handler.post(new dchh(this));
        }
    }

    @Override // defpackage.dcii
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        g(connectionResult, null);
    }

    @Override // defpackage.dcgy
    public final void onConnectionSuspended(int i) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.i.o;
        if (looperMyLooper == handler.getLooper()) {
            h(i);
        } else {
            handler.post(new dchi(this, i));
        }
    }
}
