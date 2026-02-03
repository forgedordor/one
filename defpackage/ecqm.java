package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqm {
    private final Context a;

    public ecqm(Context context) {
        this.a = context;
    }

    public final String a() {
        try {
            Context context = this.a;
            dcfd dcfdVar = deaa.a;
            return a.v(((PseudonymousIdToken) degc.g(new deae(context).a(), true != ecse.l(context) ? 1000L : 3000L, TimeUnit.MILLISECONDS)).a, "NID=");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task was interrupted while fetching Zwieback ID.", e);
            return "";
        } catch (ExecutionException e2) {
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task failed while fetching Zwieback ID.", e2);
            return "";
        } catch (TimeoutException e3) {
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task timed out while fetching Zwieback ID.", e3);
            return "";
        }
    }
}
