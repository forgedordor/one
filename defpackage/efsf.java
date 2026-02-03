package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.setupcompat.logging.CustomEvent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsf {
    public static final /* synthetic */ int a = 0;

    static {
        new efte("SetupMetricsLogger");
    }

    public static void a(Context context, CustomEvent customEvent) {
        efrt.c(context, "Context cannot be null.");
        efrw efrwVarA = efrw.a(context);
        Bundle bundle = new Bundle();
        bundle.putParcelable("CustomEvent_bundle", CustomEvent.a(customEvent));
        efrwVarA.d(1, bundle);
    }
}
