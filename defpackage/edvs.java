package defpackage;

import android.app.Activity;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edvs {
    public final Activity a;

    public edvs(Activity activity) {
        this.a = activity;
    }

    public final FeedbackOptions a() {
        Activity activity = this.a;
        dcwj dcwjVar = new dcwj(activity.getApplicationContext());
        dcwjVar.d = "com.google.android.libraries.user.profile.quickeditor.USER_INITIATED_FEEDBACK_REPORT";
        dcwjVar.a = dcwi.a(activity);
        return dcwjVar.a();
    }
}
