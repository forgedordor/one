package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euiw {
    public final String a;
    public final String b;
    public final ekfn c;
    public final ekyb d;
    public final ekfn e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final Float r;
    public final ekfn s;

    public euiw(String str, String str2, ekfn ekfnVar, ekyb ekybVar, ekfn ekfnVar2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Float f, ekfn ekfnVar3) {
        this.a = str;
        this.b = str2;
        this.c = ekfnVar;
        this.d = ekybVar;
        this.e = ekfnVar2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = str14;
        this.r = f;
        this.s = ekfnVar3;
    }

    public static euiw a(euix euixVar) {
        ArrayList parcelableArrayList;
        Bundle bundleDeepCopy = euixVar.c.deepCopy();
        euir euirVar = new euir();
        euirVar.a = bundleDeepCopy.getString("textclassifier.extras.KG_MID");
        euirVar.b = bundleDeepCopy.getString("textclassifier.extras.KG_TITLE");
        euirVar.c = (ekyb) bundleDeepCopy.getSerializable("textclassifier.extras.KG_LAT_LNG");
        euirVar.d = bundleDeepCopy.getString("textclassifier.extras.CONTACT_NAME");
        euirVar.e = bundleDeepCopy.getString("textclassifier.extras.CONTACT_GIVEN_NAME");
        euirVar.f = bundleDeepCopy.getString("textclassifier.extras.CONTACT_FAMILY_NAME");
        euirVar.g = bundleDeepCopy.getString("textclassifier.extras.CONTACT_NICKNAME");
        euirVar.h = bundleDeepCopy.getString("textclassifier.extras.CONTACT_EMAIL_ADDRESS");
        euirVar.i = bundleDeepCopy.getString("textclassifier.extras.CONTACT_PHONE_NUMBER");
        euirVar.j = bundleDeepCopy.getString("textclassifier.extras.CONTACT_ACCOUNT_TYPE");
        euirVar.k = bundleDeepCopy.getString("textclassifier.extras.CONTACT_ACCOUNT_NAME");
        euirVar.l = bundleDeepCopy.getString("textclassifier.extras.CONTACT_ALTERNATE_NAME");
        euirVar.m = bundleDeepCopy.getString("textclassifier.extras.CONTACT_ID");
        euirVar.n = bundleDeepCopy.getString("textclassifier.extras.APP_NAME");
        euirVar.o = bundleDeepCopy.getString("textclassifier.extras.APP_PACKAGE_NAME");
        ArrayList<String> stringArrayList = bundleDeepCopy.getStringArrayList("textclassifier.extras.KG_COLLECTION_HRIDS");
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                euirVar.c(stringArrayList.get(i));
            }
        }
        ArrayList parcelableArrayList2 = bundleDeepCopy.getParcelableArrayList("textclassifier.extras.KG_DEEPLINKS");
        if (parcelableArrayList2 != null) {
            int size2 = parcelableArrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                euirVar.d((euiv) parcelableArrayList2.get(i2));
            }
        }
        if (bundleDeepCopy.containsKey("textclassifier.extras.KG_TOPICALITY_SCORE")) {
            euirVar.p = Float.valueOf(bundleDeepCopy.getFloat("textclassifier.extras.KG_TOPICALITY_SCORE"));
        }
        if (bundleDeepCopy.containsKey("textclassifier.extras.BROADER_USER_INTERESTS") && (parcelableArrayList = bundleDeepCopy.getParcelableArrayList("textclassifier.extras.BROADER_USER_INTERESTS")) != null) {
            int size3 = parcelableArrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                euirVar.b((euiq) parcelableArrayList.get(i3));
            }
        }
        return euirVar.a();
    }
}
