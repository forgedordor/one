package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coms implements conc {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final eosc g;
    public final ateg h;

    public coms(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, eosc eoscVar, ateg ategVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = eoscVar;
        this.h = ategVar;
    }

    public static coqg a(evqs evqsVar) throws cond {
        try {
            return (coqg) evsn.parseFrom(coqg.a, evqsVar, evrr.a());
        } catch (evtj e) {
            throw new cond(false, "Failed to parse file download extras.", coid.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, (Throwable) e);
        }
    }
}
