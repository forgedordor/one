package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddda extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ dcwa b;

    public ddda(WeakReference weakReference, dcwa dcwaVar) {
        this.a = weakReference;
        this.b = dcwaVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onInProductHelpProcessed(InProductHelp inProductHelp) {
        long jNanoTime = System.nanoTime();
        GoogleHelp googleHelp = inProductHelp.a;
        Intent intentPutExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_START_TICK", jNanoTime);
        PendingIntent pendingIntent = googleHelp.y;
        if (pendingIntent != null) {
            intentPutExtra.putExtra("EXTRA_CUSTOM_FEEDBACK", pendingIntent);
            googleHelp.y = null;
        }
        dclx.b(inProductHelp, intentPutExtra);
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        dcwa dcwaVar = this.b;
        if (dcwaVar != null) {
            dddn.b(activity.getApplicationContext(), dcwaVar, jNanoTime, googleHelp);
        }
        googleHelp.z = dcdt.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            togglingData.c = dddl.a(activity);
        }
        dddg.b(activity, intentPutExtra, googleHelp);
    }
}
