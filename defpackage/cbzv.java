package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbzv {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/MlsMessagingServiceGrpcProxy");
    private final eyxc b;
    private final ceqc c;
    private final fcsu d;
    private final fcsu e;
    private final String f;

    public cbzv(eyxc eyxcVar, ceqc ceqcVar, fcsu fcsuVar, fcsu fcsuVar2, String str) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = eyxcVar;
        this.c = ceqcVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = str;
    }

    public final eyxc a() throws IOException {
        ceog ceogVarA = ((cepu) this.d.b()).a(((dggl) this.e.b()).a(this.f));
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/MlsMessagingServiceGrpcProxy", "getConfiguredStub", 59, "MlsMessagingServiceGrpcProxy.kt");
        String str = ceogVarA.b;
        ekrdVar.t("MLS Messaging service URL: %s", str);
        fcrn fcrnVarD = ceqb.d(this.b, this.c.b(), str);
        fcrnVarD.getClass();
        return (eyxc) fcrnVarD;
    }
}
