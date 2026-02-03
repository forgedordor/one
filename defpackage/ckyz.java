package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsPackageChangedReceiver;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import com.google.android.apps.messaging.shared.receiver.SmsReceiver;
import com.google.android.apps.messaging.shared.receiver.SmsRejectedReceiver;
import com.google.android.apps.messaging.shared.receiver.TelephonyChangeReceiver;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckyz {
    private static final cqce a = cqce.g("Bugle", "AppConfigUpdater");
    private final Context b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public ckyz(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
    }

    public final void a() {
        Context context = this.b;
        boolean zI = craf.i(context);
        PackageManager packageManager = context.getPackageManager();
        if (zI) {
            a.q("Enabling SMS message receiving");
            packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) SmsReceiver.class), 1, 1);
        } else {
            a.q("Disabling SMS message receiving");
            packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) SmsReceiver.class), 2, 1);
        }
        cqce cqceVar = a;
        cqceVar.q("Enabling Telephony change receiving");
        packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) TelephonyChangeReceiver.class), 1, 1);
        cqceVar.q("Enabling Default SMS package change receiving");
        packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) DefaultSmsPackageChangedReceiver.class), 1, 1);
        cqbd cqbdVarD = cqceVar.d();
        cqbdVarD.I("Manufacturer:");
        cqbdVarD.I(Build.MANUFACTURER);
        cqbdVarD.r();
        Optional optional = (Optional) ((eyig) this.c).a;
        if (optional.isEmpty()) {
            cqbd cqbdVarD2 = cqceVar.d();
            cqbdVarD2.I("Enabling RestoreReceiver.");
            cqbdVarD2.A("manufacturer", Build.MANUFACTURER);
            cqbdVarD2.r();
            packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) RestoreReceiver.class), 1, 1);
        }
        fcsu fcsuVar = this.d;
        if (fcsuVar.b() != null) {
            cqpz cqpzVar = (cqpz) fcsuVar.b();
            final cldl cldlVar = (cldl) this.e.b();
            cldlVar.getClass();
            cqpzVar.g(new Runnable() { // from class: ckyy
                @Override // java.lang.Runnable
                public final void run() {
                    cldlVar.e();
                }
            });
        } else {
            cqbd cqbdVarB = cqceVar.b();
            cqbdVarB.I("updateSmsReceiveHandler: bugleGservices is null!");
            cqbdVarB.s(new Exception());
        }
        if (!optional.isPresent()) {
            PackageManager packageManager2 = context.getPackageManager();
            if (!((Boolean) SmsRejectedReceiver.a.e()).booleanValue() || craf.i(context)) {
                cqceVar.q("Disabling SMS rejected receiver");
                packageManager2.setComponentEnabledSetting(new ComponentName(context, (Class<?>) SmsRejectedReceiver.class), 2, 1);
            } else {
                cqceVar.q("Enabling SMS rejected receiver");
                packageManager2.setComponentEnabledSetting(new ComponentName(context, (Class<?>) SmsRejectedReceiver.class), 1, 1);
            }
        }
        cqww cqwwVar = (cqww) this.f.b();
        if (cqwwVar.c.isPresent()) {
            return;
        }
        Context context2 = cqwwVar.b;
        PackageManager packageManager3 = context2.getPackageManager();
        ekrg ekrgVar = cqww.a;
        ekrw ekrwVarG = ekrgVar.g();
        ekrz ekrzVar = eksq.a;
        ekrwVarG.X(ekrzVar, "BugleTranscoding");
        boolean zQ = ((ekrd) ekrwVarG).Q();
        if (cqwwVar.d.a()) {
            if (zQ) {
                ekrw ekrwVarG2 = ekrgVar.g();
                ekrwVarG2.X(ekrzVar, "BugleTranscoding");
                ((ekrd) ((ekrd) ekrwVarG2).h("com/google/android/apps/messaging/shared/util/media/video/VideoSharingActivityUtil", "updateVideoSharingActivity", 47, "VideoSharingActivityUtil.java")).q("Enabling Video Sharing Activity");
            }
            packageManager3.setComponentEnabledSetting(new ComponentName(context2, "com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity"), 1, 1);
            return;
        }
        if (zQ) {
            ekrw ekrwVarG3 = ekrgVar.g();
            ekrwVarG3.X(ekrzVar, "BugleTranscoding");
            ((ekrd) ((ekrd) ekrwVarG3).h("com/google/android/apps/messaging/shared/util/media/video/VideoSharingActivityUtil", "updateVideoSharingActivity", 56, "VideoSharingActivityUtil.java")).q("Disabling Video Sharing Activity");
        }
        packageManager3.setComponentEnabledSetting(new ComponentName(context2, "com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity"), 2, 1);
    }
}
