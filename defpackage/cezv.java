package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cezv {
    public final Optional b;
    public final cepr c;
    public final fcsu d;
    private final cepf f;
    private final cepv g;
    private final cepv h;
    private final fcsu i;
    private static final cqce e = cqce.f("BugleNetwork", cezv.class);
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/grpcproxies/GrpcProxies");

    public cezv(fcsu fcsuVar, cepf cepfVar, cepf cepfVar2, Optional optional, cepr ceprVar, cepv cepvVar, cepv cepvVar2, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = optional;
        this.d = fcsuVar3;
        this.f = true == ((cdio) fcsuVar.b()).a() ? cepfVar2 : cepfVar;
        this.c = ceprVar;
        this.g = cepvVar;
        this.h = cepvVar2;
        this.i = fcsuVar2;
    }

    public final cepf a() {
        e.q("Getting messaging grpc for Ditto.");
        return this.f;
    }

    public final cepv b() {
        e.m("Anonymous registration grpc is used.");
        return this.g;
    }

    @Deprecated
    public final cepv c() {
        e.m("Phone registration grpc is used.");
        return this.h;
    }

    public final cepy d(ezol ezolVar) {
        eieu eieuVarK = eiiy.k("GrpcProxies#getPhoneRegistrationGrpcProxy(identity)");
        try {
            e.m("Phone channel bound registration grpc is used.");
            cepx cepxVar = (cepx) this.i.b();
            ezolVar.getClass();
            cepy cepyVar = (cepy) ((cepe) cepxVar.a.b()).a(ezolVar, cepw.a);
            eieuVarK.close();
            return cepyVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
