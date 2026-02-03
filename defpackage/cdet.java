package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdet implements cden, cqay {
    public static final eksp d = eksp.c("Bugle");
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    private final eosc j;
    private final String k = ".PHONE_SILENT_FEEDBACK";

    public cdet(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, eosc eoscVar) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.i = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.j = eoscVar;
    }

    private final eiju e(Throwable th, Throwable th2, boolean z) {
        if (((Boolean) cden.a.e()).booleanValue()) {
            return g(th, th2);
        }
        fcsu fcsuVar = this.h;
        eksl ekslVarA = d.a(((aqmz) fcsuVar.b()).a() ? Level.SEVERE : Level.INFO);
        ekslVarA.Z(((aqmz) fcsuVar.b()).a() ? eksk.SMALL : eksk.NONE);
        ((eksl) ((eksl) ekslVarA.g(th2)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedbackForAssert", 170, "SilentFeedbackManagerImpl.java")).t("SilentFeedbackManager: Messages automatically detected an error. Silent assert uploading disabled. Not reporting %s", th);
        return eijx.e(null);
    }

    private static final Throwable f(Throwable th) {
        try {
            int i = eiip.a;
            eict.b(th);
            eifn eifnVarC = eidc.c();
            eiip eiipVar = new eiip(th, eiip.l(eifnVarC, null));
            eiip.i(eifnVarC, eiipVar);
            throw eiipVar;
        } catch (RuntimeException e) {
            return e;
        }
    }

    private final eiju g(final Throwable th, final Throwable th2) {
        return eijx.h(new eooy() { // from class: cder
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                cdet cdetVar = this.a;
                boolean zBooleanValue = ((Boolean) cdetVar.i.b()).booleanValue();
                Throwable th3 = th2;
                Throwable th4 = th;
                if (!zBooleanValue) {
                    fcsu fcsuVar = cdetVar.h;
                    eksl ekslVarA = cdet.d.a(((aqmz) fcsuVar.b()).a() ? Level.SEVERE : Level.INFO);
                    ekslVarA.Z(((aqmz) fcsuVar.b()).a() ? eksk.SMALL : eksk.NONE);
                    ((eksl) ((eksl) ekslVarA.g(th3)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedback", 103, "SilentFeedbackManagerImpl.java")).t("SilentFeedbackManager: Messages automatically detected an error. SilentFeedback is disabled. Not uploading %s", th4);
                    return eijx.e(null);
                }
                fcsu fcsuVar2 = cdetVar.h;
                eksl ekslVarA2 = cdet.d.a(((aqmz) fcsuVar2.b()).a() ? Level.SEVERE : Level.INFO);
                ekslVarA2.Z(((aqmz) fcsuVar2.b()).a() ? eksk.SMALL : eksk.NONE);
                ((eksl) ((eksl) ekslVarA2.g(th3)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedback", 89, "SilentFeedbackManagerImpl.java")).t("SilentFeedbackManager: Messages automatically detected an error. Sending silent feedback for %s", th4);
                return eijx.e(null);
            }
        }, this.j);
    }

    @Override // defpackage.cden, defpackage.cqay
    public final eiju a(Throwable th) {
        final Throwable thF = (!((aqmz) this.h.b()).a() || (th instanceof eiip)) ? th : f(th);
        return e(th, thF, false).i(new eooz() { // from class: cdes
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.d(thF);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cden
    public final eiju b(Throwable th) {
        final Throwable thF = (!((aqmz) this.h.b()).a() || (th instanceof eiip)) ? th : f(th);
        return g(th, thF).i(new eooz() { // from class: cdeo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.d(thF);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cden
    public final void c(Throwable th) {
        fcsu fcsuVar = this.h;
        Throwable thB = (!((aqmz) fcsuVar.b()).a() || (th instanceof eiip)) ? th : eiip.b(th);
        if (ccze.a(ThreadLocalRandom.current(), ccze.o)) {
            e(th, thB, true);
            return;
        }
        eksl ekslVar = (eksl) d.a(((aqmz) fcsuVar.b()).a() ? Level.SEVERE : Level.FINE).g(thB);
        ekslVar.Z(((aqmz) fcsuVar.b()).a() ? eksk.SMALL : eksk.NONE);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "onSlowCode", 210, "SilentFeedbackManagerImpl.java")).t("SilentFeedbackManager: Messages automatically detected an error. Not uploaded due to throttling %s", th);
        eijx.e(null);
    }

    public final eiju d(final Throwable th) {
        return b.b().i(new eooz() { // from class: cdep
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = cdet.d;
                if (((Boolean) obj).booleanValue()) {
                    return cden.c.b();
                }
                ((eksl) ((eksl) cdet.d.n().g(th)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "postIssueNotification", 123, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Issue notification is disabled. Not notifying");
                return eijx.e(null);
            }
        }, eoqg.a).i(new eooz() { // from class: cdeq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Long l = (Long) obj;
                if (l == null) {
                    ((eksl) cdet.d.n().h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "postIssueNotification", 132, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: backoffTime is null. Not posting issue notification.");
                    return eijx.e(null);
                }
                Throwable th2 = th;
                cdet cdetVar = this.a;
                if (!((apok) cdetVar.g.b()).a() || !(th2 instanceof bzdd)) {
                    return ((cgbn) cdetVar.f.b()).P(th2, l.longValue());
                }
                ((eksl) cdet.d.n().h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "postIssueNotification", 140, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: throwable is CmsBackupItemNotFoundException. Not posting issue notification.");
                return eijx.e(null);
            }
        }, this.j);
    }
}
