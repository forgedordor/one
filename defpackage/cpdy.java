package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdy {
    public static final cqce a = cqce.g("BugleNetwork", "ChatContentDecoratorGrpc");
    private final cepb b;
    private eyzs c;

    public cpdy(cepb cepbVar) {
        this.b = cepbVar;
    }

    public final synchronized eyzs a() {
        fbqm fbqmVarA;
        if (this.c == null) {
            try {
                cepb cepbVar = this.b;
                synchronized (cepbVar.l) {
                    fbqmVarA = cepbVar.k;
                    if (fbqmVarA == null) {
                        ekrw ekrwVarE = cepb.a.e();
                        ekrwVarE.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getSmartTachyonGrpcChannel", 234, "GrpcChannelManager.java")).q("Creating Tachyon gRPC Channel");
                        fbqmVarA = cepbVar.a((String) cepb.c.e(), cepbVar.g(5));
                        cepbVar.k = fbqmVarA;
                    }
                }
                this.c = (eyzs) eyzt.a(fbqmVarA).m(new fcrz(this.b.e()));
            } catch (Exception e) {
                a.s("ChatContentDecoratorGrpc: Exception in creating a new stub: ", e);
                this.c = null;
            }
        }
        return this.c;
    }
}
