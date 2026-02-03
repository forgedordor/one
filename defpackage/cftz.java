package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cftz implements fbso {
    public static final cftz a = new cftz();

    private cftz() {
    }

    @Override // defpackage.fbso
    public final fbsl a(fbsm fbsmVar, fbrg fbrgVar, fbsn fbsnVar) {
        fbsnVar.getClass();
        try {
            fbod fbodVar = cfsg.a;
            fbog fbogVarK = fbog.k();
            fbod fbodVar2 = cfsg.a;
            fbqx fbqxVar = fbrg.c;
            int i = fbrb.d;
            Iterable iterableB = fbrgVar.b(new fbqw("EndpointUrl", fbqxVar));
            if (iterableB == null) {
                throw new IllegalArgumentException("Tachyon endpoint url is missing in the Metadata.");
            }
            Object objW = fcva.W(iterableB);
            objW.getClass();
            cfse cfseVar = new cfse((String) objW);
            Iterable iterableB2 = fbrgVar.b(new fbqy("ReceiverIdentity-bin", fbrg.b));
            if (iterableB2 == null) {
                throw new IllegalArgumentException("Receiver identity is missing in the Metadata");
            }
            ezol ezolVar = (ezol) evsn.parseFrom(ezol.a, (byte[]) fcva.W(iterableB2));
            ezolVar.getClass();
            return fboi.a(fbogVarK.l(fbodVar2, new cfsf(cfseVar, ezolVar, fbrgVar)), fbsmVar, fbrgVar, fbsnVar);
        } catch (IllegalArgumentException unused) {
            fbsmVar.a(Status.e, fbrgVar);
            return new cfty();
        }
    }
}
