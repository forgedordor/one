package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvc {
    public static final eksp a = eksp.c("BugleReactions");
    public final fcyh b;
    public final dqsn c;
    public final cogw d;

    public abvc(fcyh fcyhVar, dqsn dqsnVar, cogw cogwVar) {
        fcyhVar.getClass();
        dqsnVar.getClass();
        cogwVar.getClass();
        this.b = fcyhVar;
        this.c = dqsnVar;
        this.d = cogwVar;
    }

    public static final Uri a(dnwn dnwnVar) {
        dokx dokxVar = dnwnVar.g;
        if (dokxVar == null) {
            dokxVar = dokx.a;
        }
        dltt dlttVar = dokxVar.f;
        if (dlttVar == null) {
            dlttVar = dltt.a;
        }
        return Uri.parse(dlttVar.f);
    }
}
