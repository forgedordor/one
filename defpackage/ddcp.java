package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddcp implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final dcwa c;
    private final long d;

    public ddcp(Context context, GoogleHelp googleHelp, dcwa dcwaVar, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = dcwaVar;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listA;
        Bundle bundle = new Bundle(1);
        try {
            dcww dcwwVar = new dcww();
            dcwwVar.c();
            listA = this.c.a();
            File cacheDir = this.a.getCacheDir();
            if (listA != null && !listA.isEmpty() && cacheDir != null) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((FileTeleporter) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(dcwwVar.a()));
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            listA = null;
        }
        Context context = this.a;
        FeedbackOptions feedbackOptionsA = FeedbackOptions.a(listA);
        dcfd dcfdVar = ddck.a;
        dddj dddjVar = new dddj(context);
        GoogleHelp googleHelp = this.b;
        long j = this.d;
        dcfq dcfqVar = dddjVar.k;
        ddcw ddcwVar = new ddcw(dcfqVar, feedbackOptionsA, bundle, j, googleHelp);
        dcfqVar.b(ddcwVar);
        dclg.b(ddcwVar);
    }
}
