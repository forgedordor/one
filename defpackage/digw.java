package defpackage;

import android.content.Context;
import com.google.android.libraries.communications.mobileconfiguration.sync.SyncWorker;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class digw {
    private static final ekrg a = ekrg.c("com/google/android/libraries/communications/mobileconfiguration/sync/SyncScheduler");
    private final Context b;
    private final ceao c;

    public digw(Context context, ceao ceaoVar) {
        this.b = context;
        this.c = ceaoVar;
    }

    private final void d(Duration duration, pzz pzzVar, boolean z) {
        int i;
        ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncScheduler", "scheduleNextSync", 72, "SyncScheduler.java")).A("scheduling sync for %d seconds later, policy = %s", duration.toSeconds(), pzzVar);
        ewzv ewzvVar = (ewzv) ewzw.a.createBuilder();
        exab exabVar = (exab) exac.a.createBuilder();
        evrj evrjVarA = evwz.a(duration);
        exabVar.copyOnWrite();
        exac exacVar = (exac) exabVar.instance;
        evrjVarA.getClass();
        exacVar.c = evrjVarA;
        exacVar.b |= 1;
        int iOrdinal = pzzVar.ordinal();
        if (iOrdinal == 0) {
            i = 6;
        } else if (iOrdinal != 1) {
            i = 3;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(pzzVar))));
                }
                i = 4;
            }
        } else {
            i = 5;
        }
        exabVar.copyOnWrite();
        exac exacVar2 = (exac) exabVar.instance;
        exacVar2.d = i - 2;
        exacVar2.b |= 2;
        ewzvVar.copyOnWrite();
        ewzw ewzwVar = (ewzw) ewzvVar.instance;
        exac exacVar3 = (exac) exabVar.build();
        exacVar3.getClass();
        ewzwVar.c = exacVar3;
        ewzwVar.b = 2;
        this.c.a((ewzw) ewzvVar.build());
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        pzj pzjVarA = pzhVar.a();
        qau qauVar = new qau(SyncWorker.class);
        qauVar.i(duration);
        qauVar.g(pzjVarA);
        pza pzaVar = pza.a;
        fbgd fbgdVar = fbgc.a.get();
        Context context = this.b;
        qauVar.f(pzaVar, fbgdVar.e(context), TimeUnit.SECONDS);
        qauVar.d("SYNC");
        if (z) {
            qauVar.d("FORCE_SYNC");
        }
        qbq.a(context).g("SYNC", pzzVar, (qav) qauVar.b());
    }

    public final void a() {
        d(Duration.ZERO, pzz.a, true);
    }

    public final void b(pzz pzzVar) {
        d(Duration.ZERO, pzzVar, false);
    }

    public final void c(Map map) {
        Duration durationOfSeconds;
        Iterator<E> it = ((ekgp) map).values().iterator();
        long jMin = Long.MAX_VALUE;
        while (true) {
            if (!it.hasNext()) {
                durationOfSeconds = Duration.ofSeconds(Math.min(fbgc.a.get().c(this.b), jMin));
                break;
            }
            digh dighVar = (digh) it.next();
            etsc etscVar = dighVar.d;
            if (etscVar == null) {
                etscVar = etsc.a;
            }
            if ((etscVar.b & 1) == 0) {
                durationOfSeconds = Duration.ZERO;
                break;
            }
            Context context = this.b;
            if (fbgc.c(context)) {
                evvp evvpVar = dighVar.e;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                Duration durationBetween = Duration.between(evwz.d(evvpVar), Instant.now());
                etsc etscVar2 = dighVar.d;
                if (etscVar2 == null) {
                    etscVar2 = etsc.a;
                }
                evrj evrjVar = etscVar2.f;
                if (evrjVar == null) {
                    evrjVar = evrj.a;
                }
                jMin = Math.min(jMin, Math.max(fbgc.a(context), evwz.c(evrjVar).minus(durationBetween).toSeconds()));
            } else {
                long jA = fbgc.a(context);
                etsc etscVar3 = dighVar.d;
                if (etscVar3 == null) {
                    etscVar3 = etsc.a;
                }
                evrj evrjVar2 = etscVar3.f;
                if (evrjVar2 == null) {
                    evrjVar2 = evrj.a;
                }
                jMin = Math.min(jMin, Math.max(jA, evwy.b(evrjVar2) / 1000));
            }
        }
        d(durationOfSeconds, pzz.c, false);
    }
}
