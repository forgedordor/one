package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eucc implements esob {
    public final ekgb N;
    public final ekhx O;
    private final ekgp R;
    public static final dzfh a = new dzfh("google.internal.myphonenumbers.v1.MyPhoneNumbers.");
    private static final dzfh P = new dzfh("google.internal.myphonenumbers.v1.MyPhoneNumbers/");
    public static final esoa b = new eubb();
    public static final esoa c = new eubm();
    public static final esoa d = new eubv();
    public static final esoa e = new eubw();
    public static final esoa f = new eubx();
    public static final esoa g = new euby();
    public static final esoa h = new eubz();
    public static final esoa i = new euca();
    public static final esoa j = new eucb();
    public static final esoa k = new euar();
    public static final esoa l = new euas();
    public static final esoa m = new euat();
    public static final esoa n = new euau();
    public static final esoa o = new euav();
    public static final esoa p = new euaw();
    public static final esoa q = new euax();
    public static final esoa r = new euay();
    public static final esoa s = new euaz();
    public static final esoa t = new euba();
    public static final esoa u = new eubc();
    public static final esoa v = new eubd();
    public static final esoa w = new eube();
    public static final esoa x = new eubf();
    public static final esoa y = new eubg();
    public static final esoa z = new eubh();
    public static final esoa A = new eubi();
    public static final esoa B = new eubj();
    public static final esoa C = new eubk();
    public static final esoa D = new eubl();
    public static final esoa E = new eubn();
    public static final esoa F = new eubo();
    public static final esoa G = new eubp();
    public static final esoa H = new eubq();
    public static final esoa I = new eubr();
    public static final esoa J = new eubs();
    public static final esoa K = new eubt();
    public static final esoa L = new eubu();
    public static final eucc M = new eucc();
    private static final dzfh Q = new dzfh("myphonenumbers-pa.googleapis.com");

    private eucc() {
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h("myphonenumbers-pa.mtls.googleapis.com");
        ekfwVar.h("staging-myphonenumbers-pa.mtls.sandbox.googleapis.com");
        ekfwVar.h("staging-myphonenumbers-pa.sandbox.googleapis.com");
        ekfwVar.h("myphonenumbers-pa.googleapis.com");
        this.N = ekfwVar.g();
        this.O = new ekhv().g();
        esoa esoaVar = b;
        esoa esoaVar2 = c;
        esoa esoaVar3 = d;
        esoa esoaVar4 = e;
        esoa esoaVar5 = f;
        esoa esoaVar6 = g;
        esoa esoaVar7 = h;
        esoa esoaVar8 = i;
        esoa esoaVar9 = j;
        esoa esoaVar10 = k;
        esoa esoaVar11 = l;
        esoa esoaVar12 = m;
        esoa esoaVar13 = n;
        esoa esoaVar14 = o;
        esoa esoaVar15 = p;
        esoa esoaVar16 = q;
        esoa esoaVar17 = r;
        esoa esoaVar18 = s;
        esoa esoaVar19 = t;
        esoa esoaVar20 = u;
        esoa esoaVar21 = v;
        esoa esoaVar22 = w;
        esoa esoaVar23 = x;
        esoa esoaVar24 = y;
        esoa esoaVar25 = z;
        esoa esoaVar26 = A;
        esoa esoaVar27 = B;
        esoa esoaVar28 = C;
        esoa esoaVar29 = D;
        esoa esoaVar30 = E;
        esoa esoaVar31 = F;
        esoa esoaVar32 = G;
        esoa esoaVar33 = H;
        esoa esoaVar34 = I;
        esoa esoaVar35 = J;
        esoa esoaVar36 = K;
        esoa esoaVar37 = L;
        ekhx.v(esoaVar, esoaVar2, esoaVar3, esoaVar4, esoaVar5, esoaVar6, esoaVar7, esoaVar8, esoaVar9, esoaVar10, esoaVar11, esoaVar12, esoaVar13, esoaVar14, esoaVar15, esoaVar16, esoaVar17, esoaVar18, esoaVar19, esoaVar20, esoaVar21, esoaVar22, esoaVar23, esoaVar24, esoaVar25, esoaVar26, esoaVar27, esoaVar28, esoaVar29, esoaVar30, esoaVar31, esoaVar32, esoaVar33, esoaVar34, esoaVar35, esoaVar36, esoaVar37);
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("ListPhoneNumbers", esoaVar);
        ekgiVar.i("CreatePhoneNumber", esoaVar2);
        ekgiVar.i("DeletePhoneNumber", esoaVar3);
        ekgiVar.i("UpdatePhoneNumber", esoaVar4);
        ekgiVar.i("StartVerification", esoaVar5);
        ekgiVar.i("FinishVerification", esoaVar6);
        ekgiVar.i("AnonymousStartVerification", esoaVar7);
        ekgiVar.i("AnonymousFinishVerification", esoaVar8);
        ekgiVar.i("GetPhoneConsent", esoaVar9);
        ekgiVar.i("UpdatePhoneFreshness", esoaVar10);
        ekgiVar.i("ListPhoneNumberAccountAssociations", esoaVar11);
        ekgiVar.i("RevokeBroadUseConsent", esoaVar12);
        ekgiVar.i("ReplacePhoneNumber", esoaVar13);
        ekgiVar.i("RevokePhoneSharingConsent", esoaVar14);
        ekgiVar.i("ListPhoneNumbersWithoutMint", esoaVar15);
        ekgiVar.i("CreateVerifiedPhoneNumber", esoaVar16);
        ekgiVar.i("ListPhoneNumberUsers", esoaVar17);
        ekgiVar.i("ListTimestampedPhoneNumbers", esoaVar18);
        ekgiVar.i("UpdateVerification", esoaVar19);
        ekgiVar.i("HandleRecycleSignal", esoaVar20);
        ekgiVar.i("ListDevicePhoneNumbers", esoaVar21);
        ekgiVar.i("SetAccountManagementPhoneNumber", esoaVar22);
        ekgiVar.i("AddAccountManagementPhoneNumber", esoaVar23);
        ekgiVar.i("DeleteAccountManagementPhoneNumber", esoaVar24);
        ekgiVar.i("ReplaceAccountManagementPhoneNumber", esoaVar25);
        ekgiVar.i("SetDeviceConsentPhoneNumber", esoaVar26);
        ekgiVar.i("SetDeviceConsent", esoaVar27);
        ekgiVar.i("UpdateDeviceConsent", esoaVar28);
        ekgiVar.i("UpdateDeviceVerification", esoaVar29);
        ekgiVar.i("SyncDevicePhoneNumbers", esoaVar30);
        ekgiVar.i("WipeoutDevicePhoneNumbers", esoaVar31);
        ekgiVar.i("ListAppReachability", esoaVar32);
        ekgiVar.i("GetAppReachability", esoaVar33);
        ekgiVar.i("UpdateAppReachability", esoaVar34);
        ekgiVar.i("HandleDeviceReachabilityData", esoaVar35);
        ekgiVar.i("ReadPhoneData", esoaVar36);
        ekgiVar.i("RenumberPhoneNumber", esoaVar37);
        this.R = ekgiVar.c();
        new ekgi().c();
    }

    @Override // defpackage.esob
    public final dzfh a() {
        return Q;
    }

    @Override // defpackage.esob
    public final esoa b(String str) {
        String str2 = P.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ekgp ekgpVar = this.R;
        if (ekgpVar.containsKey(strSubstring)) {
            return (esoa) ekgpVar.get(strSubstring);
        }
        return null;
    }
}
