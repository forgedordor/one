package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsh implements cepf {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/proxy/client/PersistentMessagingGrpcProxy");
    private final eywd b;
    private final eywc c;
    private final cepb d;
    private final ceog e;
    private final ezol f;
    private final cepf g;

    public cfsh(eywd eywdVar, eywc eywcVar, cepb cepbVar, ceog ceogVar, ezol ezolVar, cepf cepfVar) {
        this.b = eywdVar;
        this.c = eywcVar;
        this.d = cepbVar;
        this.e = ceogVar;
        this.f = ezolVar;
        this.g = cepfVar;
    }

    private final eywc g() {
        return (eywc) ((eywc) ((eywc) ceqb.b(this.c, false)).j(null)).m(new fcrz(h()));
    }

    private final fbrg h() {
        fbod fbodVar = cfsg.a;
        String str = this.e.b;
        fbrg fbrgVarE = this.d.e();
        if (true == fdgn.H(str)) {
            str = null;
        }
        if (str == null) {
            Object objE = ceog.a.e();
            if (objE == null) {
                throw new IllegalArgumentException("Unable to resolve Tachyon host and port.");
            }
            str = (String) objE;
        }
        ezol ezolVar = this.f;
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        fbrgVarE.h(new fbqw("EndpointUrl", fbqxVar), str);
        fbrgVarE.h(new fbqy("ReceiverIdentity-bin", fbrg.b), ezolVar.toByteArray());
        return fbrgVarE;
    }

    @Override // defpackage.cepf
    public final eiju a(ezho ezhoVar) {
        ezhoVar.getClass();
        eiju eijuVarG = eiju.g(g().b(ezhoVar));
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.cepf
    public final eiju b(ezim ezimVar) {
        return this.g.b(ezimVar);
    }

    @Override // defpackage.cepf
    public final eiju c(ezkf ezkfVar) {
        ezkfVar.getClass();
        eiju eijuVarG = eiju.g(g().d(ezkfVar));
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.cepf
    public final eiju d(ezlz ezlzVar) {
        return this.g.d(ezlzVar);
    }

    @Override // defpackage.cepf
    public final eiju e(ezjl ezjlVar) {
        return this.g.e(ezjlVar);
    }

    @Override // defpackage.cepf
    public final void f(ezkl ezklVar, fcsf fcsfVar) {
        ezklVar.getClass();
        fcsfVar.getClass();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleBindChannelProxy");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/proxy/client/PersistentMessagingGrpcProxy", "receiveMessages", 49, "PersistentMessagingGrpcProxy.kt")).q("Establishing bind channel via persistent proxy.");
        ((eywd) ((eywd) ((eywd) ceqb.b(this.b, true)).j(null)).m(new fcrz(h()))).b(ezklVar, fcsfVar);
    }
}
