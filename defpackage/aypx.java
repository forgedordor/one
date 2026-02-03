package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aypx {
    private static final cqce a = cqce.g("BugleDataModel", "ProcessPendingRevocationsActionScheduler");
    private static final Random b = new Random();
    private static long c = 0;
    private static int d = 0;
    private final cogw e;
    private final axyc f;

    public aypx(cogw cogwVar, axyc axycVar) {
        this.e = cogwVar;
        this.f = axycVar;
    }

    public static synchronized void c() {
        c = 0L;
        d = 0;
    }

    private final synchronized void d(boolean z) {
        long jMax;
        long epochMilli = this.e.f().toEpochMilli();
        long j = c;
        if (epochMilli <= j) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("deferred.");
            cqbdVarC.z("next action remaining seconds", (epochMilli - j) / 1000);
            cqbdVarC.r();
            return;
        }
        if (z) {
            int i = d;
            long jLongValue = ((Long) dfaq.E().h().a()).longValue();
            long jLongValue2 = ((Long) dfaq.E().i().a()).longValue();
            long j2 = jLongValue << i;
            if (j2 <= jLongValue2) {
                d = i + 1;
                jLongValue2 = j2;
            }
            jMax = Math.max((jLongValue2 / 2) + b.nextInt((int) r7), jLongValue);
        } else {
            jMax = 0;
        }
        c = epochMilli + jMax;
        axyc axycVar = this.f;
        aypx aypxVar = (aypx) axycVar.b.b();
        aypxVar.getClass();
        new ProcessPendingRevocationsAction(axycVar.a, aypxVar, axycVar.c, axycVar.d).E(jMax);
        cqbd cqbdVarC2 = a.c();
        cqbdVarC2.I("scheduled next action.");
        cqbdVarC2.z("back off seconds", jMax / 1000);
        cqbdVarC2.r();
    }

    public final void a() {
        d(false);
    }

    public final void b() {
        d(true);
    }
}
