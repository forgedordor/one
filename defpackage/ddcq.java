package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddcq implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final dcwa c;
    private final long d;

    public ddcq(Context context, GoogleHelp googleHelp, dcwa dcwaVar, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = dcwaVar;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listSingletonList;
        try {
            dcww dcwwVar = new dcww();
            dcwwVar.c();
            listSingletonList = this.c.b();
            if (listSingletonList == null) {
                listSingletonList = new ArrayList(1);
            }
            try {
                listSingletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(dcwwVar.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList = new ArrayList(listSingletonList);
                arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(dcwwVar.a())));
                listSingletonList = arrayList;
            }
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            listSingletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        Context context = this.a;
        dcfd dcfdVar = ddck.a;
        dddj dddjVar = new dddj(context);
        GoogleHelp googleHelp = this.b;
        long j = this.d;
        dcfq dcfqVar = dddjVar.k;
        ddcu ddcuVar = new ddcu(dcfqVar, dcwv.a(listSingletonList), j, googleHelp);
        dcfqVar.b(ddcuVar);
        dclg.b(ddcuVar);
    }
}
