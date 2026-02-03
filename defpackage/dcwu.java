package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.internal.IFeedbackService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwu implements Runnable {
    private final Context a;
    private final dcwa b;
    private final long c;

    public dcwu(Context context, dcwa dcwaVar, long j) {
        this.a = context;
        this.b = dcwaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listSingletonList;
        try {
            dcww dcwwVar = new dcww();
            dcwwVar.c();
            listSingletonList = this.b.b();
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
            Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            listSingletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        Context context = this.a;
        dcfd dcfdVar = dcwe.a;
        dcwi dcwiVar = new dcwi(context);
        final long j = this.c;
        final Bundle bundleA = dcwv.a(listSingletonList);
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dcwf
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                Bundle bundle = bundleA;
                long j2 = j;
                dcws dcwsVar = (dcws) obj;
                try {
                    dcwv.c(bundle);
                    ((IFeedbackService) dcwsVar.w()).saveAsyncFeedbackPsd(bundle, j2);
                    ((defr) obj2).b(null);
                } catch (Exception e2) {
                    Log.e("gF_FeedbackClient", "Requesting to save the async feedback psd failed!", e2);
                    ((defr) obj2).a(new RemoteException("Internall Error: Failed to start feedback"));
                }
            }
        };
        dcizVar.c = 6010;
        dcwiVar.m(dcizVar.a());
    }
}
