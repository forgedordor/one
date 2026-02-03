package defpackage;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efre extends IntentService {
    public static final ekrg a = ekrg.c("com/google/android/search/verification/client/SearchActionVerificationClientService");
    public final boolean b;
    private final long c;
    private final Intent d;
    private final Intent e;
    private efrd f;
    private efrd g;

    public efre() {
        super("SearchActionVerificationClientService");
        this.d = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.e = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.b = e();
        this.c = 1000L;
    }

    private final boolean b(String str) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                if (packageInfo.applicationInfo.enabled) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "SAVerificationClientS");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "isPackageInstalled", 197, "SearchActionVerificationClientService.java")).t("Couldn't find package name %s", str);
            return false;
        }
    }

    private final boolean c(String str) {
        if (b(str)) {
            return e() || efrf.a(this, str);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean d(java.lang.String r21, android.content.Intent r22, defpackage.efrd r23) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efre.d(java.lang.String, android.content.Intent, efrd):boolean");
    }

    private static final boolean e() {
        return !"user".equals(Build.TYPE);
    }

    public abstract void a(Intent intent, boolean z);

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (this.b) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "SAVerificationClientS");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onCreate", 323, "SearchActionVerificationClientService.java")).q("onCreate");
        }
        super.onCreate();
        this.f = new efrd(this);
        if (c("com.google.android.googlequicksearchbox")) {
            bindService(this.d, this.f, 1);
        }
        this.g = new efrd(this);
        if (c("com.google.android.apps.assistant")) {
            bindService(this.e, this.g, 1);
        }
        NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(R.string.google_assistant_verification_channel_name), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        kvq kvqVar = new kvq(getApplicationContext(), "Assistant_verifier");
        kvqVar.u = "Assistant_verifier";
        kvqVar.i(getApplicationContext().getResources().getString(R.string.google_assistant_verification_notification_title));
        kvqVar.r(android.R.drawable.ic_dialog_email);
        kvqVar.l = -2;
        kvqVar.D = 1;
        startForeground(10000, kvqVar.a());
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        if (this.b) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "SAVerificationClientS");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onDestroy", 350, "SearchActionVerificationClientService.java")).q("onDestroy");
        }
        super.onDestroy();
        if (this.f.a()) {
            unbindService(this.f);
        }
        if (this.g.a()) {
            unbindService(this.g);
        }
        stopForeground(true);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) throws InterruptedException, PackageManager.NameNotFoundException {
        boolean z;
        if (intent == null) {
            if (this.b) {
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "SAVerificationClientS");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 282, "SearchActionVerificationClientService.java")).q("Unable to verify null intent");
                return;
            }
            return;
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            boolean zB = b("com.google.android.googlequicksearchbox");
            boolean z2 = !zB || this.f.a();
            boolean z3 = this.b;
            if (z3) {
                ekrw ekrwVarE2 = a.e();
                ekrwVarE2.X(eksq.a, "SAVerificationClientS");
                z = z2;
                ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "installedServicesConnected", 171, "SearchActionVerificationClientService.java")).I("GSA app %s installed: %b connected %b", "com.google.android.googlequicksearchbox", Boolean.valueOf(zB), Boolean.valueOf(this.f.a()));
            } else {
                z = z2;
            }
            boolean zB2 = b("com.google.android.apps.assistant");
            boolean z4 = !zB2 || this.g.a();
            if (z3) {
                ekrw ekrwVarE3 = a.e();
                ekrwVarE3.X(eksq.a, "SAVerificationClientS");
                ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "installedServicesConnected", 182, "SearchActionVerificationClientService.java")).I("AssistantGo app %s installed: %b connected %b", "com.google.android.apps.assistant", Boolean.valueOf(zB2), Boolean.valueOf(this.g.a()));
            }
            if ((z && z4) || System.nanoTime() - jNanoTime >= this.c * 1000000) {
                break;
            }
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                if (this.b) {
                    ekrw ekrwVarE4 = a.e();
                    ekrwVarE4.X(eksq.a, "SAVerificationClientS");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarE4).g(e)).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", (char) 294, "SearchActionVerificationClientService.java")).q("Unexpected InterruptedException");
                }
            }
        }
        if (d("com.google.android.googlequicksearchbox", intent, this.f)) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "SAVerificationClientS");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 305, "SearchActionVerificationClientService.java")).q("Verified the intent with GSA.");
            return;
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH2.X(ekrzVar, "SAVerificationClientS");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 308, "SearchActionVerificationClientService.java")).q("Unable to verify the intent with GSA.");
        if (d("com.google.android.apps.assistant", intent, this.g)) {
            ekrw ekrwVarH3 = ekrgVar.h();
            ekrwVarH3.X(ekrzVar, "SAVerificationClientS");
            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 313, "SearchActionVerificationClientService.java")).q("Verified the intent with Assistant Go.");
        } else {
            ekrw ekrwVarH4 = ekrgVar.h();
            ekrwVarH4.X(ekrzVar, "SAVerificationClientS");
            ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 315, "SearchActionVerificationClientService.java")).q("Unable to verify the intent with Assistant Go.");
        }
    }
}
