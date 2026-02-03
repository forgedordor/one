package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import com.google.android.gms.droidguard.internal.IDroidGuardService;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcqg implements Runnable, dcgy, dcii {
    private static dcqg b;
    private final dcko d;
    private final Handler e;
    private final LinkedBlockingQueue c = new LinkedBlockingQueue();
    public int a = 0;

    private dcqg(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        ddmy ddmyVar = new ddmy(handlerThread.getLooper());
        this.e = ddmyVar;
        this.d = new dcpz(context, ddmyVar.getLooper(), this, this);
    }

    static synchronized dcqg a(Context context) {
        if (b == null) {
            b = new dcqg(context);
        }
        return b;
    }

    private final void f(String str) {
        while (true) {
            dcqe dcqeVar = (dcqe) this.c.poll();
            if (dcqeVar == null) {
                return;
            }
            dcko dckoVar = this.d;
            dcqeVar.e(new dcqd(dckoVar.c, this, str, dcqeVar.g));
        }
    }

    private final void g() {
        dcqg dcqgVar;
        dcqd dcqdVar;
        dcko dckoVar;
        IDroidGuardHandle iDroidGuardHandleCreateDroidGuardHandle;
        DroidGuardResultsRequest droidGuardResultsRequest;
        dcqw dcqwVarA;
        while (true) {
            dcqe dcqeVar = (dcqe) this.c.poll();
            if (dcqeVar == null) {
                c();
                return;
            }
            if (!dcqeVar.f) {
                dcrf dcrfVar = dcqeVar.g;
                dcre dcreVar = dcre.FINE;
                dcrfVar.c(3, dcreVar);
                try {
                    dckoVar = this.d;
                    iDroidGuardHandleCreateDroidGuardHandle = ((IDroidGuardService) dckoVar.w()).createDroidGuardHandle();
                    dcrfVar.c(4, dcreVar);
                    droidGuardResultsRequest = dcqeVar.e;
                    droidGuardResultsRequest.b(this.a);
                    String str = dcqeVar.d;
                    DroidGuardInitReply droidGuardInitReplyInitWithExtras = iDroidGuardHandleCreateDroidGuardHandle.initWithExtras(str, droidGuardResultsRequest);
                    if (droidGuardInitReplyInitWithExtras == null) {
                        iDroidGuardHandleCreateDroidGuardHandle.init(str);
                    }
                    dcrfVar.c(5, dcreVar);
                    dcqwVarA = droidGuardInitReplyInitWithExtras != null ? dcqj.a(dckoVar.c, dcrfVar, droidGuardInitReplyInitWithExtras) : null;
                    this.a++;
                    dcqgVar = this;
                } catch (Exception e) {
                    e = e;
                    dcqgVar = this;
                }
                try {
                    dcqdVar = new dcqd(dckoVar.c, dcqgVar, iDroidGuardHandleCreateDroidGuardHandle, dcqwVarA, droidGuardResultsRequest.a(), dcrfVar);
                } catch (Exception e2) {
                    e = e2;
                    dcrfVar = dcrfVar;
                    Exception exc = e;
                    dcqdVar = new dcqd(dcqgVar.d.c, dcqgVar, "Initialization failed: ".concat(exc.toString()), dcrfVar, exc);
                    dcqeVar.g.c(13, dcre.COARSE);
                    dcqeVar.e(dcqdVar);
                }
                dcqeVar.g.c(13, dcre.COARSE);
                dcqeVar.e(dcqdVar);
            }
        }
    }

    public final void b(dcqe dcqeVar) {
        dcqeVar.g.c(2, dcre.COARSE);
        this.c.offer(dcqeVar);
        this.e.post(this);
    }

    public final void c() {
        if (this.c.isEmpty() && this.a == 0) {
            dcko dckoVar = this.d;
            if (dckoVar.p()) {
                dckoVar.m();
            }
        }
    }

    final void d(Runnable runnable) {
        Handler handler = this.e;
        if (Looper.myLooper() == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    final boolean e() {
        return this.e.getLooper().getThread().isAlive();
    }

    @Override // defpackage.dcgy
    public final void onConnected(Bundle bundle) {
        dclh.d(this.e);
        g();
    }

    @Override // defpackage.dcii
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        dclh.d(this.e);
        f("Connection failed: ".concat(connectionResult.toString()));
    }

    @Override // defpackage.dcgy
    public final void onConnectionSuspended(int i) {
        dclh.d(this.e);
        f(a.g(i, "Disconnected: "));
    }

    @Override // java.lang.Runnable
    public final void run() {
        dclh.d(this.e);
        dcko dckoVar = this.d;
        if (dckoVar.p()) {
            g();
        } else {
            if (dckoVar.q() || this.c.isEmpty()) {
                return;
            }
            dckoVar.A();
        }
    }
}
