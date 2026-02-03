package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.internal.IFeedbackService;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwt implements Runnable {
    private final Context a;
    private final dcwa b;
    private final long c;

    public dcwt(Context context, dcwa dcwaVar, long j) {
        this.a = context;
        this.b = dcwaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listA;
        final Bundle bundle = new Bundle(1);
        try {
            dcww dcwwVar = new dcww();
            dcwwVar.c();
            listA = this.b.a();
            File cacheDir = this.a.getCacheDir();
            if (listA != null && !listA.isEmpty() && cacheDir != null) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((FileTeleporter) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(dcwwVar.a()));
        } catch (Exception e) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            listA = null;
        }
        final long j = this.c;
        Context context = this.a;
        final FeedbackOptions feedbackOptionsA = FeedbackOptions.a(listA);
        dcfd dcfdVar = dcwe.a;
        dcwi dcwiVar = new dcwi(context);
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dcwg
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                FeedbackOptions feedbackOptions = feedbackOptionsA;
                Bundle bundle2 = bundle;
                long j2 = j;
                dcws dcwsVar = (dcws) obj;
                try {
                    dcwv.c(bundle2);
                    dcwv.d(feedbackOptions);
                    ((IFeedbackService) dcwsVar.w()).saveAsyncFeedbackPsbd(feedbackOptions, bundle2, j2);
                    ((defr) obj2).b(null);
                } catch (Exception e2) {
                    Log.e("gF_FeedbackClient", "Requesting to save the async feedback psbd failed!", e2);
                    ((defr) obj2).a(new RemoteException("Internall Error: Failed to start feedback"));
                }
            }
        };
        dcizVar.c = 6011;
        dcwiVar.m(dcizVar.a());
    }
}
