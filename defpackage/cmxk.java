package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmxk {
    public final long a;
    public final ainn b;
    final /* synthetic */ cmxn c;
    private final dzub d;
    private final Set e = ekpg.i();
    private final int f;

    public cmxk(cmxn cmxnVar) {
        this.c = cmxnVar;
        this.d = cmxnVar.q.d();
        this.a = cmxnVar.r.a();
        this.f = cmxnVar.u.incrementAndGet();
        this.b = ainm.a(cmxnVar.r);
    }

    public final void a(dzfh dzfhVar) {
        b(dzfhVar, null);
    }

    final void b(dzfh dzfhVar, feeg feegVar) {
        if (((Boolean) cmxn.l.e()).booleanValue()) {
            Set set = this.e;
            String str = dzfhVar.a;
            if (!set.add(str)) {
                ((ekrd) ((ekrd) cmxn.b.g()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics$MessageSendingTracker", "logTimer", 994, "MessageLatencyAnalytics.java")).t("Timer was already logged, timer_name=%s", new esvh(esvg.NO_USER_DATA, str));
                return;
            }
            ekrd ekrdVar = (ekrd) ((ekrd) cmxn.b.e()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics$MessageSendingTracker", "logTimer", 1000, "MessageLatencyAnalytics.java");
            int i = this.f;
            cmxn cmxnVar = this.c;
            ekrdVar.I("Timer%d[ms] %s=%d", Integer.valueOf(i), dzfhVar, Long.valueOf(cmxnVar.r.a() - this.a));
            cmxnVar.q.f(new dzub(this.d.b.a), dzfhVar, feegVar, dzua.SUCCESS);
        }
    }
}
