package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddcz extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ dcwa c;

    public ddcz(Intent intent, WeakReference weakReference, dcwa dcwaVar) {
        this.a = intent;
        this.b = weakReference;
        this.c = dcwaVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onGoogleHelpProcessed(GoogleHelp googleHelp) {
        Intent intent = this.a;
        long jNanoTime = System.nanoTime();
        intent.putExtra("EXTRA_START_TICK", jNanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            return;
        }
        dcwa dcwaVar = this.c;
        if (dcwaVar != null) {
            dddn.b(activity.getApplicationContext(), dcwaVar, jNanoTime, googleHelp);
        }
        googleHelp.z = dcdt.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            togglingData.c = dddl.a(activity);
        }
        dddg.b(activity, intent, googleHelp);
    }
}
