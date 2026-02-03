package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aszl implements aszp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/onlinestatus/OnlineStatusLoggingInterceptor");
    private final aszp b;
    private final eosc c;

    public aszl(aszp aszpVar, eosc eoscVar) {
        this.b = aszpVar;
        this.c = eoscVar;
    }

    @Override // defpackage.aszp
    public final eiju d(aubq aubqVar) {
        eiju eijuVarD = this.b.d(aubqVar);
        eijuVarD.k(new aszk(aubqVar), this.c);
        return eijuVarD;
    }
}
