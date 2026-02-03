package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adas implements lun {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/home/log/HomeErrorStateLogger");
    public Instant a;
    public final AtomicBoolean b;
    public final AtomicInteger c;
    private final cogw e;
    private final fcsu f;
    private final eg g;
    private final fcsu h;
    private boolean i;
    private final AtomicInteger j;
    private final AtomicInteger k;
    private boolean l;

    public adas(cogw cogwVar, fcsu fcsuVar, fdjx fdjxVar, fcsu fcsuVar2, eg egVar, fcsu fcsuVar3) {
        cogwVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        egVar.getClass();
        fcsuVar3.getClass();
        this.e = cogwVar;
        this.f = fcsuVar2;
        this.g = egVar;
        this.h = fcsuVar3;
        this.b = new AtomicBoolean();
        this.j = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
        this.k = new AtomicInteger(0);
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        if (this.l || !this.i) {
            return;
        }
        this.l = true;
        AtomicInteger atomicInteger = this.k;
        if (atomicInteger.get() == 2 || Duration.between(g(), this.e.f()).toMillis() <= ((Number) acol.a.e()).longValue()) {
            ekrw ekrwVarH = d.h();
            ekrwVarH.X(eksq.a, "HomeErrorStateLogger");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/home/log/HomeErrorStateLogger", "logToClearcutIfHomeScreenIsInErrorState", 78, "HomeErrorStateLogger.kt")).q("Skipping logging to clearcut since conditions are not met.");
        } else {
            ekrw ekrwVarH2 = d.h();
            ekrwVarH2.X(eksq.a, "HomeErrorStateLogger");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/home/log/HomeErrorStateLogger", "logToClearcutIfHomeScreenIsInErrorState", 81, "HomeErrorStateLogger.kt")).q("About to log HomeScreenBlankError to clearcut");
            ensb ensbVar = (ensb) ensc.a.createBuilder();
            ensbVar.getClass();
            enrz enrzVar = (enrz) ensa.a.createBuilder();
            enrzVar.copyOnWrite();
            ensa ensaVar = (ensa) enrzVar.instance;
            ensaVar.b |= 1;
            ensaVar.c = false;
            evsn evsnVarBuild = enrzVar.build();
            evsnVarBuild.getClass();
            ensbVar.copyOnWrite();
            ensc enscVar = (ensc) ensbVar.instance;
            enscVar.e = (ensa) evsnVarBuild;
            enscVar.b |= 8;
            emob emobVar = (emob) emoc.a.createBuilder();
            emobVar.getClass();
            int iA = emoa.a(this.c.get());
            if (iA == 0) {
                throw null;
            }
            emobVar.copyOnWrite();
            emoc emocVar = (emoc) emobVar.instance;
            emocVar.d = iA - 1;
            emocVar.b |= 2;
            boolean zA = ((abwu) this.f.b()).a(this.g);
            emobVar.copyOnWrite();
            emoc emocVar2 = (emoc) emobVar.instance;
            emocVar2.b |= 1;
            emocVar2.c = zA;
            evsn evsnVarBuild2 = emobVar.build();
            evsnVarBuild2.getClass();
            ensbVar.copyOnWrite();
            ensc enscVar2 = (ensc) ensbVar.instance;
            enscVar2.d = (emoc) evsnVarBuild2;
            enscVar2.b |= 4;
            emod emodVar = (emod) emog.a.createBuilder();
            emodVar.getClass();
            int iA2 = emof.a(this.j.get());
            if (iA2 == 0) {
                throw null;
            }
            emodVar.copyOnWrite();
            emog emogVar = (emog) emodVar.instance;
            emogVar.c = iA2 - 1;
            emogVar.b |= 1;
            evsn evsnVarBuild3 = emodVar.build();
            evsnVarBuild3.getClass();
            ensbVar.copyOnWrite();
            ensc enscVar3 = (ensc) ensbVar.instance;
            enscVar3.c = (emog) evsnVarBuild3;
            enscVar3.b |= 2;
            enrv enrvVar = (enrv) enry.a.createBuilder();
            enrvVar.getClass();
            int iA3 = enrx.a(atomicInteger.get());
            if (iA3 == 0) {
                throw null;
            }
            enrvVar.copyOnWrite();
            enry enryVar = (enry) enrvVar.instance;
            enryVar.c = iA3 - 1;
            enryVar.b |= 1;
            evsn evsnVarBuild4 = enrvVar.build();
            evsnVarBuild4.getClass();
            ensbVar.copyOnWrite();
            ensc enscVar4 = (ensc) ensbVar.instance;
            enscVar4.f = (enry) evsnVarBuild4;
            enscVar4.b |= 16;
            evsn evsnVarBuild5 = ensbVar.build();
            evsnVarBuild5.getClass();
            aill aillVar = (aill) this.h.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.HOME_SCREEN_METRICS_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            ensf ensfVar = (ensf) ensg.a.createBuilder();
            ensfVar.copyOnWrite();
            ensg ensgVar = (ensg) ensfVar.instance;
            ensgVar.c = (ensc) evsnVarBuild5;
            ensgVar.b = 1;
            ensg ensgVar2 = (ensg) ensfVar.build();
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            ensgVar2.getClass();
            ellhVar2.bs = ensgVar2;
            ellhVar2.g |= 2;
            aillVar.k(ellgVar, emxt.HOME_SCREEN_METRICS_EVENT);
        }
        if (this.b.get()) {
            ekrw ekrwVarE = d.e();
            ekrwVarE.X(eksq.a, "HomeErrorStateLogger");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/home/log/HomeErrorStateLogger", "onStop", 152, "HomeErrorStateLogger.kt")).q("Home screen and conversation list show after launch");
        } else {
            long seconds = Duration.between(g(), this.e.f()).getSeconds();
            ekrw ekrwVarH3 = d.h();
            ekrwVarH3.X(eksq.a, "HomeErrorStateLogger");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/home/log/HomeErrorStateLogger", "onStop", 150, "HomeErrorStateLogger.kt")).s("Home screen is blank for %d seconds until user leave the app", seconds);
        }
    }

    public final Instant g() {
        Instant instant = this.a;
        if (instant != null) {
            return instant;
        }
        fdbq.c("startTime");
        return null;
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        if (this.a == null) {
            Instant instantF = this.e.f();
            instantF.getClass();
            this.a = instantF;
        }
    }

    public final void h() {
        this.i = true;
    }

    public final void i(int i) {
        this.k.set(i - 1);
    }

    public final void j(int i) {
        this.j.set(i - 1);
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
