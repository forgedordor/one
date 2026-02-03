package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcgt implements Runnable {
    final /* synthetic */ dcgu a;
    private final dcgr b;

    public dcgt(dcgu dcguVar, dcgr dcgrVar) {
        this.a = dcguVar;
        this.b = dcgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dcgu dcguVar = this.a;
        if (dcguVar.a) {
            dcgr dcgrVar = this.b;
            ConnectionResult connectionResult = dcgrVar.b;
            if (connectionResult.b()) {
                dchu dchuVar = dcguVar.f;
                Activity activityL = dcguVar.l();
                PendingIntent pendingIntent = connectionResult.d;
                dclh.m(pendingIntent);
                dchuVar.startActivityForResult(GoogleApiActivity.a(activityL, pendingIntent, dcgrVar.a, false), 1);
                return;
            }
            dcdt dcdtVar = dcguVar.d;
            Activity activityL2 = dcguVar.l();
            int i = connectionResult.c;
            if (dcdtVar.i(activityL2, i, null) != null) {
                Activity activityL3 = dcguVar.l();
                Dialog dialogE = dcdtVar.e(activityL3, i, new dckj(dcdtVar.i(activityL3, i, "d"), dcguVar.f), dcguVar);
                if (dialogE != null) {
                    dcdtVar.a(activityL3, dialogE, "GooglePlayServicesErrorDialog", dcguVar);
                    return;
                }
                return;
            }
            if (i != 18) {
                dcguVar.a(connectionResult, dcgrVar.a);
                return;
            }
            Activity activityL4 = dcguVar.l();
            ProgressBar progressBar = new ProgressBar(activityL4, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityL4);
            builder.setView(progressBar);
            builder.setMessage(dckf.c(activityL4, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            dcdtVar.a(activityL4, alertDialogCreate, "GooglePlayServicesUpdatingDialog", dcguVar);
            Context applicationContext = dcguVar.l().getApplicationContext();
            dcgs dcgsVar = new dcgs(this, alertDialogCreate);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            dchs dchsVar = new dchs(dcgsVar);
            kxj.g(applicationContext, dchsVar, intentFilter);
            dchsVar.a = applicationContext;
            if (dceq.h(applicationContext)) {
                return;
            }
            dcgsVar.a();
            dchsVar.a();
        }
    }
}
