package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class ceqc implements cepc {
    private final cepb a;

    public ceqc(cepb cepbVar) {
        this.a = cepbVar;
    }

    @Override // defpackage.cepc
    public final fbqm a() {
        cepb cepbVar = this.a;
        synchronized (cepbVar.n) {
            fbqm fbqmVar = cepbVar.m;
            if (fbqmVar != null) {
                return fbqmVar;
            }
            String strF = cepbVar.f();
            ekrw ekrwVarE = cepb.a.e();
            ekrwVarE.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getTachyonPhoneGrpcChannel", 267, "GrpcChannelManager.java")).q("Creating Tachyon Phone gRPC Channel");
            fbqm fbqmVarC = cepbVar.c(strF);
            cepbVar.m = fbqmVarC;
            return fbqmVarC;
        }
    }

    @Override // defpackage.cepc
    public final fbrg b() {
        return this.a.e();
    }
}
