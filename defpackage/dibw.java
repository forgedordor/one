package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibw {
    private static volatile ecjl a;

    public static synchronized ecjl a(Context context) {
        ecev ecevVar;
        ecevVar = new ecev(Collections.singletonList(new ecey(new ecex(context))));
        ddmw ddmwVar = ddmx.a;
        return b(ecevVar, ddmw.d(4));
    }

    public static synchronized ecjl b(ecev ecevVar, Executor executor) {
        if (a == null) {
            eclv eclvVar = eclv.a;
            HashMap map = new HashMap();
            ecjm.a(eckx.a, map);
            a = new ecjl(executor, ecevVar, eclvVar, map);
        }
        return a;
    }
}
