package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aswi implements asxy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor");
    private final asxy b;
    private final eosc c;

    public aswi(asxy asxyVar, eosc eoscVar) {
        this.b = asxyVar;
        this.c = eoscVar;
    }

    @Override // defpackage.asxy
    public final eiju a(Iterable iterable) {
        eiju eijuVarA = this.b.a(iterable);
        eijuVarA.k(new aswg(), this.c);
        return eijuVarA;
    }

    @Override // defpackage.asxy
    public final eiju b(aubq aubqVar) {
        eiju eijuVarB = this.b.b(aubqVar);
        eijuVarB.k(new aswh(aubqVar), this.c);
        return eijuVarB;
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }
}
