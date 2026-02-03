package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cjsc implements egps<evwl<cjsb>, Void> {
    final /* synthetic */ cqce a;

    public cjsc(cqce cqceVar) {
        this.a = cqceVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        evwl evwlVar = (evwl) obj;
        cjsb cjsbVar = cjsb.a;
        cjsa cjsaVarB = cjsa.b(((cjsb) evwlVar.a(cjsbVar, evrr.a())).h);
        if (cjsaVarB == null) {
            cjsaVarB = cjsa.UNRECOGNIZED;
        }
        Integer numValueOf = Integer.valueOf(cjsaVarB.a());
        int iB = cjrz.b(((cjsb) evwlVar.a(cjsbVar, evrr.a())).c);
        if (iB == 0) {
            iB = 1;
        }
        Integer numValueOf2 = Integer.valueOf(cjrz.a(iB));
        int iB2 = cjrx.b(((cjsb) evwlVar.a(cjsbVar, evrr.a())).d);
        if (iB2 == 0) {
            iB2 = 1;
        }
        this.a.m(String.format("Successfully stored PhoneNumberInputUIEvent, UiVariant: %s, Source: %s, EventType: %s", numValueOf, numValueOf2, Integer.valueOf(cjrx.a(iB2))));
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        evwl evwlVar = (evwl) obj;
        cjsb cjsbVar = cjsb.a;
        int iB = cjrz.b(((cjsb) evwlVar.a(cjsbVar, evrr.a())).c);
        if (iB == 0) {
            iB = 1;
        }
        Integer numValueOf = Integer.valueOf(cjrz.a(iB));
        int iB2 = cjrx.b(((cjsb) evwlVar.a(cjsbVar, evrr.a())).d);
        if (iB2 == 0) {
            iB2 = 1;
        }
        this.a.r(String.format("Error while trying to store PhoneNumberInputUIEvent, Source: %s, EventType: %s, Failure: %s", numValueOf, Integer.valueOf(cjrx.a(iB2)), th.getMessage()));
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
