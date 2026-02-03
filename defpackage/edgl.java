package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edgl {
    private final Activity a;
    private final ejwi b;

    public edgl(Activity activity, ejwi ejwiVar) {
        this.a = activity;
        this.b = ejwiVar;
    }

    private final FeedbackOptions c() {
        Activity activity = this.a;
        dcwj dcwjVar = new dcwj(activity.getApplicationContext());
        dcwjVar.d = "com.google.android.libraries.user.profile.photopicker.USER_INITIATED_FEEDBACK_REPORT";
        dcwjVar.a = dcwi.a(activity);
        return dcwjVar.a();
    }

    public final void a() {
        Context applicationContext = this.a.getApplicationContext();
        dcfd dcfdVar = dcwe.a;
        new dcwi(applicationContext).c(c());
    }

    public final void b(String str) {
        GoogleHelp googleHelp = new GoogleHelp(str);
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 3;
        googleHelp.s = themeSettings;
        FeedbackOptions feedbackOptionsC = c();
        Activity activity = this.a;
        googleHelp.c(feedbackOptionsC, activity.getCacheDir());
        ejwi ejwiVar = this.b;
        if (!ejwiVar.g()) {
            new ddci(activity).c(googleHelp.a());
        } else {
            InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
            inProductHelp.c = (String) ejwiVar.c();
            new ddci(activity).d(inProductHelp);
        }
    }
}
