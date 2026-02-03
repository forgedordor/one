package androidx.appsearch.builtintypes;

import android.net.Uri;
import defpackage.afb;
import defpackage.afc;
import defpackage.afe;
import defpackage.afj;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__MobileApplication, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__MobileApplication implements afq<MobileApplication> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:MobileApplication");
        afm afmVar = new afm("name");
        afmVar.b(2);
        afmVar.e(1);
        afmVar.c(2);
        afmVar.d(0);
        afbVar.c(afmVar.a());
        afm afmVar2 = new afm("alternateNames");
        afmVar2.b(1);
        afmVar2.e(1);
        afmVar2.c(2);
        afmVar2.d(0);
        afbVar.c(afmVar2.a());
        afm afmVar3 = new afm("description");
        afmVar3.b(2);
        afmVar3.e(0);
        afmVar3.c(0);
        afmVar3.d(0);
        afbVar.c(afmVar3.a());
        afm afmVar4 = new afm("image");
        afmVar4.b(2);
        afmVar4.e(0);
        afmVar4.c(0);
        afmVar4.d(0);
        afbVar.c(afmVar4.a());
        afm afmVar5 = new afm("url");
        afmVar5.b(2);
        afmVar5.e(0);
        afmVar5.c(0);
        afmVar5.d(0);
        afbVar.c(afmVar5.a());
        afe afeVar = new afe("potentialActions", "builtin:PotentialAction");
        afeVar.b(1);
        afeVar.a = false;
        afbVar.c(afeVar.a());
        afm afmVar6 = new afm("packageName");
        afmVar6.b(2);
        afmVar6.e(2);
        afmVar6.c(2);
        afmVar6.d(0);
        afbVar.c(afmVar6.a());
        afm afmVar7 = new afm("displayName");
        afmVar7.b(2);
        afmVar7.e(1);
        afmVar7.c(2);
        afmVar7.d(0);
        afbVar.c(afmVar7.a());
        afm afmVar8 = new afm("iconUri");
        afmVar8.b(2);
        afmVar8.e(0);
        afmVar8.c(0);
        afmVar8.d(0);
        afbVar.c(afmVar8.a());
        afc afcVar = new afc("sha256Certificate");
        afcVar.b(2);
        afbVar.c(afcVar.a());
        afj afjVar = new afj("updatedTimestamp");
        afjVar.b(2);
        afjVar.c(1);
        afbVar.c(afjVar.a());
        afm afmVar9 = new afm("className");
        afmVar9.b(2);
        afmVar9.e(0);
        afmVar9.c(0);
        afmVar9.d(0);
        afbVar.c(afmVar9.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        MobileApplication mobileApplication = (MobileApplication) obj;
        afu afuVar = new afu(mobileApplication.v, mobileApplication.w, "builtin:MobileApplication");
        afuVar.c(mobileApplication.x);
        afuVar.g(mobileApplication.y);
        afuVar.d(mobileApplication.z);
        String str = mobileApplication.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = mobileApplication.c;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = mobileApplication.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = mobileApplication.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = mobileApplication.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = mobileApplication.F;
        if (list2 != null) {
            afv[] afvVarArr = new afv[list2.size()];
            Iterator it = list2.iterator();
            int i = 0;
            while (it.hasNext()) {
                afvVarArr[i] = afv.f((PotentialAction) it.next());
                i++;
            }
            afuVar.a("potentialActions", afvVarArr);
        }
        afuVar.b("packageName", mobileApplication.a);
        String str5 = mobileApplication.b;
        if (str5 != null) {
            afuVar.b("displayName", str5);
        }
        Uri uri = mobileApplication.d;
        if (uri != null) {
            afuVar.b("iconUri", uri.toString());
        }
        afuVar.i("sha256Certificate", mobileApplication.e);
        afuVar.k("updatedTimestamp", mobileApplication.f);
        String str6 = mobileApplication.g;
        if (str6 != null) {
            afuVar.b("className", str6);
        }
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String str;
        char c;
        ArrayList arrayList;
        String str2;
        String str3;
        Uri uri;
        int length;
        String strL = afvVar.l();
        String strK = afvVar.k();
        int iB = afvVar.b();
        long jC = afvVar.c();
        long jE = afvVar.e();
        String[] strArrU = afvVar.u("name");
        String str4 = (strArrU == null || strArrU.length == 0) ? null : strArrU[0];
        String[] strArrU2 = afvVar.u("alternateNames");
        List listAsList = strArrU2 != null ? Arrays.asList(strArrU2) : null;
        String[] strArrU3 = afvVar.u("description");
        String str5 = (strArrU3 == null || strArrU3.length == 0) ? null : strArrU3[0];
        String[] strArrU4 = afvVar.u("image");
        String str6 = (strArrU4 == null || strArrU4.length == 0) ? null : strArrU4[0];
        String[] strArrU5 = afvVar.u("url");
        String str7 = (strArrU5 == null || strArrU5.length == 0) ? null : strArrU5[0];
        afv[] afvVarArrT = afvVar.t("potentialActions");
        if (afvVarArrT != null) {
            c = 0;
            arrayList = new ArrayList(afvVarArrT.length);
            str = strL;
            int i = 0;
            while (i < afvVarArrT.length) {
                arrayList.add((PotentialAction) afvVarArrT[i].j(PotentialAction.class, afsVar));
                i++;
                strK = strK;
                iB = iB;
            }
        } else {
            str = strL;
            c = 0;
            arrayList = null;
        }
        String str8 = strK;
        int i2 = iB;
        String[] strArrU6 = afvVar.u("packageName");
        String str9 = (strArrU6 == null || strArrU6.length == 0) ? null : strArrU6[c];
        String[] strArrU7 = afvVar.u("displayName");
        String str10 = (strArrU7 == null || strArrU7.length == 0) ? null : strArrU7[c];
        String[] strArrU8 = afvVar.u("iconUri");
        if (strArrU8 == null || (length = strArrU8.length) == 0) {
            str2 = str9;
            str3 = null;
        } else {
            str2 = str9;
            afv.q("String", "iconUri", length);
            str3 = strArrU8[c];
        }
        if (str3 != null) {
            try {
                uri = Uri.parse(str3);
            } catch (RuntimeException unused) {
            }
        } else {
            uri = null;
        }
        byte[][] bArrV = afvVar.v("sha256Certificate");
        byte[] bArr = (bArrV == null || bArrV.length == 0) ? null : bArrV[c];
        long jD = afvVar.d("updatedTimestamp");
        String[] strArrU9 = afvVar.u("className");
        return new MobileApplication(str, str8, i2, jC, jE, str4, listAsList, str5, str6, str7, arrayList, str2, str10, uri, bArr, jD, (strArrU9 == null || strArrU9.length == 0) ? null : strArrU9[c]);
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:MobileApplication";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        return arrayList;
    }
}
