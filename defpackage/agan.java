package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agan implements agal {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl");
    private final fdjx b;
    private final AtomicInteger c;
    private final fduf d;

    public agan(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.b = fdjxVar;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.c = atomicInteger;
        this.d = fdvf.a(new agah(atomicInteger.get()));
    }

    private final void h(agaj agajVar, agaj agajVar2) throws Exception {
        ekrg ekrgVar;
        try {
            afzy afzyVarB = agajVar2.b();
            int iA = agajVar2.a();
            ekrgVar = a;
            ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl$Companion", "logTransitioning", 204, "NavigationStateMachineImpl.kt")).M("Transition:\n   from: %s (%s)\n   to: %s (%s)\n   target: %s (%s)\n   requestId: %s", agajVar.c(), new dziu(agajVar.getClass()), agajVar2.c(), new dziu(agajVar2.getClass()), afzyVarB, new dziu(afzyVarB.getClass()), new dziq(iA));
            agajVar2.d(agajVar);
        } catch (Exception e) {
            e = e;
        }
        try {
            boolean zG = this.d.g(agajVar, agajVar2);
            afzy afzyVarB2 = agajVar2.b();
            int iA2 = agajVar2.a();
            dziu dziuVar = new dziu(true != zG ? "failed" : "succeeded");
            Level level = zG ? Level.INFO : Level.WARNING;
            level.getClass();
            ((ekrd) ekrgVar.a(level).h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl$Companion", "logTransitionCompleted", 236, "NavigationStateMachineImpl.kt")).N("Transition completed:\n   from: %s (%s)\n   to: %s (%s)\n   target: %s (%s)\n   requestId: %s\n   update: %s", agajVar.c(), new dziu(agajVar.getClass()), agajVar2.c(), new dziu(agajVar2.getClass()), afzyVarB2, new dziu(afzyVarB2.getClass()), new dziq(iA2), dziuVar);
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            agam.a(agajVar, agajVar.b(), agajVar2.c(), agajVar2.getClass(), agajVar2.b(), agajVar2.a(), exc);
            if (!(exc instanceof agai) || !(agajVar2 instanceof afzz) || (agajVar instanceof agah)) {
                throw exc;
            }
            ((ekrd) a.j().h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl", "executeTransition", 185, "NavigationStateMachineImpl.kt")).q("Disregarding duplicate navigation request due to ongoing navigation.");
        }
    }

    @Override // defpackage.agal
    public final fdvc a() {
        return this.d;
    }

    @Override // defpackage.agal
    public final void b() throws Exception {
        h((agaj) this.d.c(), new agah(this.c.incrementAndGet()));
    }

    @Override // defpackage.agal
    public final void c(int i) throws Exception {
        agaj agajVar = (agaj) this.d.c();
        afzy afzyVarB = agajVar.b();
        if (afzyVarB instanceof afzv) {
            h(agajVar, new agaa(i, (afzv) afzyVarB));
        } else {
            agai agaiVar = new agai(agajVar, "CompletedState", afzyVarB, i);
            agam.a(agajVar, agajVar.b(), agaiVar.a, agaa.class, afzyVarB, i, agaiVar);
            throw agaiVar;
        }
    }

    @Override // defpackage.agal
    public final void d(int i, Object obj) throws Exception {
        agaj agajVar = (agaj) this.d.c();
        afzy afzyVarB = agajVar.b();
        if (afzyVarB instanceof afzx) {
            h(agajVar, new agac(obj, i, (afzx) afzyVarB, this.b));
        } else {
            agai agaiVar = new agai(agajVar, "CompletedWithResultState", afzyVarB, i);
            agam.a(agajVar, agajVar.b(), agaiVar.a, agac.class, afzyVarB, i, agaiVar);
            throw agaiVar;
        }
    }

    @Override // defpackage.agal
    public final void e(int i) throws Exception {
        agaj agagVar;
        agaj agajVar = (agaj) this.d.c();
        afzy afzyVarB = agajVar.b();
        if (agajVar instanceof agaq) {
            agagVar = new agad(i, (afzv) afzyVarB);
        } else {
            if (!(agajVar instanceof agat)) {
                agai agaiVar = new agai(agajVar, "DispatchedState or DispatchedWithResultState", afzyVarB, i);
                agam.a(agajVar, agajVar.b(), agaiVar.a, agad.class, afzyVarB, i, agaiVar);
                throw agaiVar;
            }
            agagVar = new agag(i, (afzx) afzyVarB);
        }
        h(agajVar, agagVar);
    }

    @Override // defpackage.agal
    public final void f(afzv afzvVar) throws Exception {
        h((agaj) this.d.c(), new agaq(this.c.incrementAndGet(), afzvVar));
    }

    @Override // defpackage.agal
    public final void g(afzx afzxVar, fcxy fcxyVar) throws Exception {
        afzxVar.getClass();
        h((agaj) this.d.c(), new agat(this.c.incrementAndGet(), afzxVar, fcxyVar));
    }
}
