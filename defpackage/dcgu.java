package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcgu extends dcht implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    protected final dcdt d;

    public dcgu(dchu dchuVar, dcdt dcdtVar) {
        super(dchuVar);
        this.b = new AtomicReference(null);
        this.c = new ddmy(Looper.getMainLooper());
        this.d = dcdtVar;
    }

    private static final int k(dcgr dcgrVar) {
        if (dcgrVar == null) {
            return -1;
        }
        return dcgrVar.a;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        e(connectionResult, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.dcht
    public final void c(int i, int i2, Intent intent) {
        dcgr dcgrVar = (dcgr) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int iG = this.d.g(l());
                if (iG == 0) {
                    b();
                    return;
                } else {
                    if (dcgrVar == null) {
                        return;
                    }
                    if (dcgrVar.b.c == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            b();
            return;
        } else if (i2 == 0) {
            if (dcgrVar != null) {
                a(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, dcgrVar.b.toString()), k(dcgrVar));
                return;
            }
            return;
        }
        if (dcgrVar != null) {
            a(dcgrVar.b, dcgrVar.a);
        }
    }

    @Override // defpackage.dcht
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new dcgr(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(ConnectionResult connectionResult, int i);

    protected abstract void f();

    @Override // defpackage.dcht
    public final void g(Bundle bundle) {
        dcgr dcgrVar = (dcgr) this.b.get();
        if (dcgrVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", dcgrVar.a);
        ConnectionResult connectionResult = dcgrVar.b;
        bundle.putInt("failed_status", connectionResult.c);
        bundle.putParcelable("failed_resolution", connectionResult.d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), k((dcgr) this.b.get()));
    }
}
