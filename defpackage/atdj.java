package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atdj implements atde {
    private static final eksp a = eksp.c("BugleFileTransfer");
    private final fcsu b;
    private final fcsu c;
    private final atda d;
    private final fcsu e;

    public atdj(fcsu fcsuVar, fcsu fcsuVar2, atda atdaVar, fcsu fcsuVar3) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = atdaVar;
        this.e = fcsuVar3;
    }

    @Override // defpackage.atde
    public final atdd a() {
        int iA = emwp.a(((Long) this.e.b()).intValue());
        if (iA == 0 || iA == 1) {
            iA = 2;
        }
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/authentication/RcsHttpAuthControllerFactory", "createForType", 61, "RcsHttpAuthControllerFactory.java")).t("Creating controller for %s", iA != 1 ? iA != 2 ? iA != 3 ? iA != 4 ? iA != 5 ? "AUTHENTICATION_TYPE_TACHYON_TOKEN" : "AUTHENTICATION_TYPE_GBA" : "AUTHENTICATION_TYPE_DIGEST" : "AUTHENTICATION_TYPE_BASIC" : "AUTHENTICATION_TYPE_NO_AUTH" : "AUTHENTICATION_TYPE_UNKNOWN");
        int i = iA - 1;
        if (i == 1) {
            return (atdd) this.b.b();
        }
        if (i == 2) {
            return (atdd) this.c.b();
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException(String.format("Unexpected Auth type value received: %s", Integer.valueOf(i)));
            }
            throw new UnsupportedOperationException();
        }
        atda atdaVar = this.d;
        dggz dggzVar = (dggz) atdaVar.a.b();
        dggzVar.getClass();
        ((atcw) atdaVar.b.b()).getClass();
        atdk atdkVar = (atdk) atdaVar.c.b();
        atdkVar.getClass();
        return new atcz(dggzVar, atdkVar);
    }
}
