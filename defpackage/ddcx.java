package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddcx implements ddcr {
    final /* synthetic */ dddk a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ Intent c;
    final /* synthetic */ dcwa d;

    public ddcx(dddk dddkVar, WeakReference weakReference, Intent intent, dcwa dcwaVar) {
        this.a = dddkVar;
        this.b = weakReference;
        this.c = intent;
        this.d = dcwaVar;
    }

    @Override // defpackage.ddcr
    public final void a(GoogleHelp googleHelp) {
        try {
            ((IGoogleHelpService) this.a.w()).processGoogleHelpAndPip(googleHelp, null, new ddcz(this.c, this.b, this.d));
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
        }
    }
}
