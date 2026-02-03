package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class faeg implements esob {
    public final ekgb e;
    public final ekhx f;
    private final ekgp i;
    public static final dzfh a = new dzfh("google.internal.communications.mls.KeyDelivery.");
    private static final dzfh g = new dzfh("google.internal.communications.mls.KeyDelivery/");
    public static final esoa b = new faee();
    public static final esoa c = new faef();
    public static final faeg d = new faeg();
    private static final dzfh h = new dzfh("keydelivery-pa.googleapis.com");

    private faeg() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h("autopush-keydelivery-pa.mtls.sandbox.googleapis.com");
        ekfwVar.h("autopush-keydelivery-pa.sandbox.googleapis.com");
        ekfwVar.h("autopush-rcs-keydelivery-pa.mtls.sandbox.googleapis.com");
        ekfwVar.h("autopush-rcs-keydelivery-pa.sandbox.googleapis.com");
        ekfwVar.h("dev-keydelivery-pa.mtls.sandbox.googleapis.com");
        ekfwVar.h("dev-keydelivery-pa.sandbox.googleapis.com");
        ekfwVar.h("keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("preprod-keydelivery-pa.googleapis.com");
        ekfwVar.h("preprod-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("preprod-rcs-ap-keydelivery-pa.googleapis.com");
        ekfwVar.h("preprod-rcs-ap-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("preprod-rcs-eu-keydelivery-pa.googleapis.com");
        ekfwVar.h("preprod-rcs-eu-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("preprod-rcs-us-keydelivery-pa.googleapis.com");
        ekfwVar.h("preprod-rcs-us-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("prod-rcs-ap-keydelivery-pa.googleapis.com");
        ekfwVar.h("prod-rcs-ap-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("prod-rcs-eu-keydelivery-pa.googleapis.com");
        ekfwVar.h("prod-rcs-eu-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("prod-rcs-us-keydelivery-pa.googleapis.com");
        ekfwVar.h("prod-rcs-us-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("staging-keydelivery-pa.googleapis.com");
        ekfwVar.h("staging-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("staging-rcs-ap-keydelivery-pa.googleapis.com");
        ekfwVar.h("staging-rcs-ap-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("staging-rcs-eu-keydelivery-pa.googleapis.com");
        ekfwVar.h("staging-rcs-eu-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("staging-rcs-us-keydelivery-pa.googleapis.com");
        ekfwVar.h("staging-rcs-us-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("staging-users-rcs-ap-keydelivery-pa.googleapis.com");
        ekfwVar.h("staging-users-rcs-ap-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("staging-users-rcs-eu-keydelivery-pa.googleapis.com");
        ekfwVar.h("staging-users-rcs-eu-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("staging-users-rcs-us-keydelivery-pa.googleapis.com");
        ekfwVar.h("staging-users-rcs-us-keydelivery-pa.mtls.googleapis.com");
        ekfwVar.h("keydelivery-pa.googleapis.com");
        this.e = ekfwVar.g();
        this.f = new ekhv().g();
        esoa esoaVar = b;
        esoa esoaVar2 = c;
        ekhx.r(esoaVar, esoaVar2);
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("UploadKeyPackages", esoaVar);
        ekgiVar.i("ClaimKeyPackages", esoaVar2);
        this.i = ekgiVar.c();
        new ekgi().c();
    }

    @Override // defpackage.esob
    public final dzfh a() {
        return h;
    }

    @Override // defpackage.esob
    public final esoa b(String str) {
        String str2 = g.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ekgp ekgpVar = this.i;
        if (ekgpVar.containsKey(strSubstring)) {
            return (esoa) ekgpVar.get(strSubstring);
        }
        return null;
    }
}
