package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class faed implements esob {
    public final ekgb d;
    public final ekhx e;
    private final ekgp h;
    public static final dzfh a = new dzfh("google.internal.communications.mls.KdsCertificate.");
    private static final dzfh f = new dzfh("google.internal.communications.mls.KdsCertificate/");
    public static final esoa b = new faec();
    public static final faed c = new faed();
    private static final dzfh g = new dzfh("keydelivery-pa.googleapis.com");

    private faed() {
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
        this.d = ekfwVar.g();
        this.e = new ekhv().g();
        esoa esoaVar = b;
        new ekph(esoaVar);
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("CreateCertificate", esoaVar);
        this.h = ekgiVar.c();
        new ekgi().c();
    }

    @Override // defpackage.esob
    public final dzfh a() {
        return g;
    }

    @Override // defpackage.esob
    public final esoa b(String str) {
        String str2 = f.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ekgp ekgpVar = this.h;
        if (ekgpVar.containsKey(strSubstring)) {
            return (esoa) ekgpVar.get(strSubstring);
        }
        return null;
    }
}
