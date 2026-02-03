package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euvd implements esob {
    public final ekgb h;
    public final ekhx i;
    private final ekgp l;
    public static final dzfh a = new dzfh("google.maps.places.v1.Places.");
    private static final dzfh j = new dzfh("google.maps.places.v1.Places/");
    public static final esoa b = new euuy();
    public static final esoa c = new euuz();
    public static final esoa d = new euva();
    public static final esoa e = new euvb();
    public static final esoa f = new euvc();
    public static final euvd g = new euvd();
    private static final dzfh k = new dzfh("places.googleapis.com");

    private euvd() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h("autopush-places.mtls.sandbox.googleapis.com");
        ekfwVar.h("autopush-places.sandbox.googleapis.com");
        ekfwVar.h("localenterpriseloadtest-places.mtls.sandbox.googleapis.com");
        ekfwVar.h("localenterpriseloadtest-places.sandbox.googleapis.com");
        ekfwVar.h("places.mtls.googleapis.com");
        ekfwVar.h("prodenterpriseloadtest-places.googleapis.com");
        ekfwVar.h("prodenterpriseloadtest-places.mtls.googleapis.com");
        ekfwVar.h("prodlocal-places.mtls.sandbox.googleapis.com");
        ekfwVar.h("prodlocal-places.sandbox.googleapis.com");
        ekfwVar.h("staging-places.mtls.sandbox.googleapis.com");
        ekfwVar.h("staging-places.sandbox.googleapis.com");
        ekfwVar.h("places.googleapis.com");
        this.h = ekfwVar.g();
        this.i = new ekhv().g();
        esoa esoaVar = b;
        esoa esoaVar2 = c;
        esoa esoaVar3 = d;
        esoa esoaVar4 = e;
        esoa esoaVar5 = f;
        ekhx.u(esoaVar, esoaVar2, esoaVar3, esoaVar4, esoaVar5);
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("SearchNearby", esoaVar);
        ekgiVar.i("SearchText", esoaVar2);
        ekgiVar.i("GetPhotoMedia", esoaVar3);
        ekgiVar.i("GetPlace", esoaVar4);
        ekgiVar.i("AutocompletePlaces", esoaVar5);
        this.l = ekgiVar.c();
        new ekgi().c();
    }

    @Override // defpackage.esob
    public final dzfh a() {
        return k;
    }

    @Override // defpackage.esob
    public final esoa b(String str) {
        String str2 = j.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ekgp ekgpVar = this.l;
        if (ekgpVar.containsKey(strSubstring)) {
            return (esoa) ekgpVar.get(strSubstring);
        }
        return null;
    }
}
