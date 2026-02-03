package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcqi {
    public final Context a;
    public final dcri b;

    public dcqi(Context context, dcri dcriVar) {
        this.a = context;
        this.b = dcriVar;
    }

    public static dcrk a(DroidGuardResultsRequest droidGuardResultsRequest) {
        Duration duration = dcrk.e;
        dcrg dcrgVar = new dcrg();
        Duration duration2 = dcrk.e;
        dcrgVar.a(duration2);
        dcrgVar.c(duration2);
        dcrgVar.b(true);
        dcrgVar.d = new Bundle();
        dcrgVar.b(false);
        if (droidGuardResultsRequest != null) {
            Bundle bundle = new Bundle(droidGuardResultsRequest.a);
            bundle.remove("clientVersion");
            bundle.remove("appArchitecture");
            dcrgVar.a(Duration.ofMillis(droidGuardResultsRequest.a()));
            dcrgVar.c(Duration.ofMillis(droidGuardResultsRequest.a()));
            bundle.remove("timeoutMs");
            if (!bundle.isEmpty()) {
                dcrgVar.d = bundle;
            }
        }
        if (dcrgVar.e == 1 && dcrgVar.a != null && dcrgVar.b != null && dcrgVar.d != null) {
            return new dcrh(dcrgVar.a, dcrgVar.b, dcrgVar.c, dcrgVar.d);
        }
        StringBuilder sb = new StringBuilder();
        if (dcrgVar.a == null) {
            sb.append(" initTimeout");
        }
        if (dcrgVar.b == null) {
            sb.append(" snapshotTimeout");
        }
        if (dcrgVar.e == 0) {
            sb.append(" reinitializeHandleOnGetSnapshot");
        }
        if (dcrgVar.d == null) {
            sb.append(" extras");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static String b(Context context, Throwable th) {
        boolean z = th instanceof dcff;
        String string = th.toString();
        if (z) {
            Status status = ((dcff) th).a;
            String name = th.getClass().getName();
            String strA = dcfi.a(status.g);
            String str = status.h;
            ConnectionResult connectionResult = status.j;
            string = String.format("%s: %s: %s%s", name, strA, str, connectionResult == null ? "" : ", ".concat(connectionResult.toString()));
        }
        return dcrd.a(dcrb.b(dcrb.a(context, dcrd.c(string, th), ejbn.a)));
    }
}
