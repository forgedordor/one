package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcdt extends dcdu {
    private static final Object e = new Object();
    public static final dcdt a = new dcdt();
    public static final int b = dcdu.c;

    public final void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof eg) {
                fr frVarA = ((eg) activity).a();
                dces dcesVar = new dces();
                dclh.n(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                dcesVar.ag = dialog;
                if (onCancelListener != null) {
                    dcesVar.ah = onCancelListener;
                }
                dcesVar.s(frVarA, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        dcdp dcdpVar = new dcdp();
        dclh.n(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        dcdpVar.a = dialog;
        if (onCancelListener != null) {
            dcdpVar.b = onCancelListener;
        }
        dcdpVar.show(fragmentManager, str);
    }

    public final void b(Context context, int i) throws Resources.NotFoundException {
        f(context, i, j(context, i, "n"));
    }

    public final boolean c(Activity activity, int i, int i2) {
        return d(activity, i, i2, null);
    }

    public final boolean d(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogE = e(activity, i, new dcki(i(activity, i, "d"), activity, i2), onCancelListener);
        if (dialogE == null) {
            return false;
        }
        a(activity, dialogE, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog e(Context context, int i, dckk dckkVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(dckf.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = dckf.b(context, i);
        if (strB != null) {
            builder.setPositiveButton(strB, dckkVar);
        }
        String strD = dckf.d(context, i);
        if (strD != null) {
            builder.setTitle(strD);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i2;
        String strD;
        int i3;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new dcds(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            strD = dckf.f(context, "common_google_play_services_resolution_required_title");
            i2 = 6;
        } else {
            i2 = i;
            strD = dckf.d(context, i);
        }
        if (strD == null) {
            strD = context.getResources().getString(com.google.android.apps.messaging.R.string.common_google_play_services_notification_ticker);
        }
        String strE = (i2 == 6 || i2 == 19) ? dckf.e(context, "common_google_play_services_resolution_required_text", dckf.a(context)) : dckf.c(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        dclh.m(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        kvq kvqVar = new kvq(context, (String) null);
        kvqVar.x = true;
        kvqVar.g(true);
        kvqVar.i(strD);
        kvj kvjVar = new kvj();
        kvjVar.e(strE);
        kvqVar.u(kvjVar);
        boolean zC = dcmz.c(context);
        int i4 = R.drawable.stat_sys_warning;
        if (zC) {
            dclh.h(true);
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            kvqVar.r(i4);
            kvqVar.l = 2;
            if (dcmz.e(context)) {
                kvqVar.d(com.google.android.apps.messaging.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.apps.messaging.R.string.common_open_on_phone), pendingIntent);
            } else {
                kvqVar.g = pendingIntent;
            }
        } else {
            kvqVar.r(R.drawable.stat_sys_warning);
            kvqVar.w(resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_notification_ticker));
            kvqVar.y(System.currentTimeMillis());
            kvqVar.g = pendingIntent;
            kvqVar.h(strE);
        }
        dclh.h(true);
        synchronized (e) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.google.android.apps.messaging.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        kvqVar.F = "com.google.android.gms.availability";
        Notification notificationA = kvqVar.a();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            dceq.c.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationA);
    }
}
