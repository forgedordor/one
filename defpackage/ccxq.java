package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxq implements efoj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/emergency/session/IncomingSessionNotificationHandler");
    public final boolean b;
    public final long c;
    public final fcsu d;
    public final fcsu e;
    private final fdjx f;
    private final fcsu g;

    public ccxq(boolean z, long j, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = z;
        this.c = j;
        this.f = fdjxVar;
        this.d = fcsuVar;
        this.g = fcsuVar2;
        this.e = fcsuVar3;
    }

    @Override // defpackage.efoj
    public final /* bridge */ /* synthetic */ void a(evuh evuhVar, efoi efoiVar) {
        epqo epqoVar = (epqo) evuhVar;
        if (!((aquo) this.g.b()).a()) {
            ekrd ekrdVar = (ekrd) a.j();
            ekrdVar.X(cqnc.I, efoiVar.c.j());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/emergency/session/IncomingSessionNotificationHandler", "onMessageReceived", 49, "IncomingSessionNotificationHandler.kt")).q("Received an emergency SessionNotification emergency RCS messaging flag is turned off.");
            return;
        }
        alqm alqmVar = efoiVar.c;
        if (!alqmVar.e().isEmpty()) {
            auvw.k(this.f, null, null, new ccxp(this, efoiVar, epqoVar, null), 3);
            return;
        }
        ekrd ekrdVar2 = (ekrd) a.j();
        ekrdVar2.X(cqnc.I, alqmVar.j());
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/emergency/session/IncomingSessionNotificationHandler", "onMessageReceived", 59, "IncomingSessionNotificationHandler.kt")).q("Received an emergency SessionNotification but messaging identity has no RCS identifier.");
    }
}
