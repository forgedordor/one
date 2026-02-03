package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/penpal/transport/grpc/GeminiLocationGrpcImpl");
    public final cepb b;
    private final fcsu c;

    public agyk(cepb cepbVar, fcsu fcsuVar) {
        cepbVar.getClass();
        fcsuVar.getClass();
        this.b = cepbVar;
        this.c = fcsuVar;
    }

    public final eyzs a(ezol ezolVar, fbrg fbrgVar) {
        return (eyzs) ((eyzs) ((cepe) this.c.b()).a(ezolVar, new fdat() { // from class: agyj
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                fbnd fbndVar = (fbnd) obj;
                fbndVar.getClass();
                ((fbrg) obj2).getClass();
                return eyzt.a(fbndVar);
            }
        })).m(new fcrz(fbrgVar));
    }

    public final eyzs b(ezol ezolVar) {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/penpal/transport/grpc/GeminiLocationGrpcImpl", "getSmartMessagingFutureStubTachyonAuth", 47, "GeminiLocationGrpcImpl.kt")).q("Creating Penpal gRPC stub");
        return a(ezolVar, this.b.e());
    }
}
