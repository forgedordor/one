package defpackage;

import j$.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsf {
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/PersistenceDraftObserver");
    public final fdjx a;
    public final fcyh b;
    public final wsb c;
    public final Duration d;
    public final wre e;
    private final AtomicReference g;

    public wsf(fdjx fdjxVar, fcyh fcyhVar, wre wreVar, wsb wsbVar, Duration duration) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        wreVar.getClass();
        this.a = fdjxVar;
        this.b = fcyhVar;
        this.e = wreVar;
        this.c = wsbVar;
        this.d = duration;
        this.g = new AtomicReference();
    }

    public final Object a(fdlr fdlrVar, fcxy fcxyVar) {
        Object objA;
        fdlr fdlrVar2 = (fdlr) this.g.getAndSet(fdlrVar);
        ekrw ekrwVarF = f.f();
        ekrwVarF.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/PersistenceDraftObserver", "replaceSubscription", 50, "PersistenceDraftObserver.kt")).D("Replacing draft persistence subscription %s with %s", fdlrVar2, fdlrVar);
        return (fdlrVar2 == null || (objA = fdlw.a(fdlrVar2, fcxyVar)) != fcyl.a) ? fctx.a : objA;
    }
}
