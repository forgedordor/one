package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dddn {
    public static final void a(ddcr ddcrVar, GoogleHelp googleHelp) {
        ddcrVar.a(googleHelp);
    }

    public static final void b(Context context, dcwa dcwaVar, long j, GoogleHelp googleHelp) {
        googleHelp.B = true;
        c(new ddcp(context, googleHelp, dcwaVar, j));
        c(new ddcq(context, googleHelp, dcwaVar, j));
    }

    private static final void c(Runnable runnable) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }
}
