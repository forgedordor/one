package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxw implements esob {
    public final ekgb p;
    public final ekhx q;
    private final ekgp t;
    public static final dzfh a = new dzfh("google.internal.contactsui.v1.CustardService.");
    private static final dzfh r = new dzfh("google.internal.contactsui.v1.CustardService/");
    public static final esoa b = new etxn();
    public static final esoa c = new etxo();
    public static final esoa d = new etxp();
    public static final esoa e = new etxq();
    public static final esoa f = new etxr();
    public static final esoa g = new etxs();
    public static final esoa h = new etxt();
    public static final esoa i = new etxu();
    public static final esoa j = new etxv();
    public static final esoa k = new etxj();
    public static final esoa l = new etxk();
    public static final esoa m = new etxl();
    public static final esoa n = new etxm();
    public static final etxw o = new etxw();
    private static final dzfh s = new dzfh("contactsui-pa.googleapis.com");

    private etxw() {
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h("autopush-contactsui-pa.sandbox.googleapis.com");
        ekfwVar.h("staging-contactsui-pa.sandbox.googleapis.com");
        ekfwVar.h("contactsui-pa.googleapis.com");
        this.p = ekfwVar.g();
        ekhv ekhvVar = new ekhv();
        ekhvVar.c("https://www.googleapis.com/auth/peopleapi.readonly");
        ekhvVar.c("https://www.googleapis.com/auth/peopleapi.readwrite");
        ekhvVar.c("https://www.googleapis.com/auth/plus.peopleapi.readwrite");
        this.q = ekhvVar.g();
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
        ekhx.v(esoaVar, esoaVar2, esoaVar3, esoaVar4, esoaVar5, esoaVar6, esoaVar7, esoaVar8, esoaVar9, esoaVar10, esoaVar11, esoaVar12, esoaVar13);
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("GetProfileLimitedProfileUiData", esoaVar);
        ekgiVar.i("PatchProfileLimitedProfileUiData", esoaVar2);
        ekgiVar.i("GetProfilePhotoState", esoaVar3);
        ekgiVar.i("ListProfilePhotosPhotoSuggestions", esoaVar4);
        ekgiVar.i("ListProfilePhotosClusterSuggestions", esoaVar5);
        ekgiVar.i("ListArchivedProfilePhotos", esoaVar6);
        ekgiVar.i("GetProfilePhotoArtCollectionImages", esoaVar7);
        ekgiVar.i("GetProfilePhotoArtFullImage", esoaVar8);
        ekgiVar.i("GetProfilePhotoArtHomeSuggestions", esoaVar9);
        ekgiVar.i("GetSearchInterests", esoaVar10);
        ekgiVar.i("SearchProfilePhotoArt", esoaVar11);
        ekgiVar.i("ListProfilePhotoArtSearchSuggestions", esoaVar12);
        ekgiVar.i("ListProfilePhotoArtCollectionsByCategory", esoaVar13);
        this.t = ekgiVar.c();
        new ekgi().c();
    }

    @Override // defpackage.esob
    public final dzfh a() {
        return s;
    }

    @Override // defpackage.esob
    public final esoa b(String str) {
        String str2 = r.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ekgp ekgpVar = this.t;
        if (ekgpVar.containsKey(strSubstring)) {
            return (esoa) ekgpVar.get(strSubstring);
        }
        return null;
    }
}
