package androidx.appsearch.builtintypes;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.afb;
import defpackage.afe;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import defpackage.ahf;
import defpackage.lcg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__ContactPoint, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__ContactPoint implements afq<ContactPoint> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:ContactPoint");
        afm afmVar = new afm("name");
        afmVar.b(2);
        afmVar.e(1);
        afmVar.c(2);
        afmVar.d(0);
        afbVar.c(afmVar.a());
        afm afmVar2 = new afm("alternateNames");
        afmVar2.b(1);
        afmVar2.e(0);
        afmVar2.c(0);
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
        afm afmVar6 = new afm(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
        afmVar6.b(2);
        afmVar6.e(1);
        afmVar6.c(2);
        afmVar6.d(0);
        afbVar.c(afmVar6.a());
        afm afmVar7 = new afm("address");
        afmVar7.b(1);
        afmVar7.e(1);
        afmVar7.c(2);
        afmVar7.d(0);
        afbVar.c(afmVar7.a());
        afm afmVar8 = new afm("email");
        afmVar8.b(1);
        afmVar8.e(1);
        afmVar8.c(2);
        afmVar8.d(0);
        afbVar.c(afmVar8.a());
        afm afmVar9 = new afm("telephone");
        afmVar9.b(1);
        afmVar9.e(1);
        afmVar9.c(2);
        afmVar9.d(0);
        afbVar.c(afmVar9.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        ContactPoint contactPoint = (ContactPoint) obj;
        afu afuVar = new afu(contactPoint.v, contactPoint.w, "builtin:ContactPoint");
        afuVar.c(contactPoint.x);
        afuVar.g(contactPoint.y);
        afuVar.d(contactPoint.z);
        String str = contactPoint.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = contactPoint.B;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = contactPoint.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = contactPoint.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = contactPoint.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = contactPoint.F;
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
        afuVar.b(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, contactPoint.a);
        List list3 = contactPoint.b;
        if (list3 != null) {
            afuVar.b("address", (String[]) list3.toArray(new String[0]));
        }
        List list4 = contactPoint.c;
        if (list4 != null) {
            afuVar.b("email", (String[]) list4.toArray(new String[0]));
        }
        List list5 = contactPoint.d;
        if (list5 != null) {
            afuVar.b("telephone", (String[]) list5.toArray(new String[0]));
        }
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        char c;
        String str;
        ArrayList arrayList;
        String strL = afvVar.l();
        String strK = afvVar.k();
        int iB = afvVar.b();
        long jC = afvVar.c();
        long jE = afvVar.e();
        String[] strArrU = afvVar.u("name");
        String str2 = (strArrU == null || strArrU.length == 0) ? null : strArrU[0];
        String[] strArrU2 = afvVar.u("alternateNames");
        List listAsList = strArrU2 != null ? Arrays.asList(strArrU2) : null;
        String[] strArrU3 = afvVar.u("description");
        String str3 = (strArrU3 == null || strArrU3.length == 0) ? null : strArrU3[0];
        String[] strArrU4 = afvVar.u("image");
        String str4 = (strArrU4 == null || strArrU4.length == 0) ? null : strArrU4[0];
        String[] strArrU5 = afvVar.u("url");
        String str5 = (strArrU5 == null || strArrU5.length == 0) ? null : strArrU5[0];
        afv[] afvVarArrT = afvVar.t("potentialActions");
        if (afvVarArrT != null) {
            c = 0;
            arrayList = new ArrayList(afvVarArrT.length);
            str = str5;
            int i = 0;
            while (i < afvVarArrT.length) {
                arrayList.add((PotentialAction) afvVarArrT[i].j(PotentialAction.class, afsVar));
                i++;
                afvVarArrT = afvVarArrT;
            }
        } else {
            c = 0;
            str = str5;
            arrayList = null;
        }
        String[] strArrU6 = afvVar.u(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
        String str6 = (strArrU6 == null || strArrU6.length == 0) ? null : strArrU6[c];
        String[] strArrU7 = afvVar.u("address");
        List listAsList2 = strArrU7 != null ? Arrays.asList(strArrU7) : null;
        String[] strArrU8 = afvVar.u("email");
        List listAsList3 = strArrU8 != null ? Arrays.asList(strArrU8) : null;
        String[] strArrU9 = afvVar.u("telephone");
        List listAsList4 = strArrU9 != null ? Arrays.asList(strArrU9) : null;
        ahf ahfVar = new ahf(strL, strK, str6);
        ahfVar.d(iB);
        ahfVar.b(jC);
        ahfVar.e(jE);
        ahfVar.g(str2);
        ahfVar.a(listAsList);
        ahfVar.c(str3);
        ahfVar.f(str4);
        ahfVar.i(str);
        ahfVar.h(arrayList);
        lcg.i(listAsList2);
        ahfVar.b = listAsList2;
        lcg.i(listAsList3);
        ahfVar.c = listAsList3;
        lcg.i(listAsList4);
        ahfVar.d = listAsList4;
        return new ContactPoint(ahfVar.s, ahfVar.t, ahfVar.u, ahfVar.v, ahfVar.w, ahfVar.x, ahfVar.y, ahfVar.z, ahfVar.A, ahfVar.B, ahfVar.C, ahfVar.a, new ArrayList(ahfVar.b), new ArrayList(ahfVar.c), new ArrayList(ahfVar.d));
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:ContactPoint";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        return arrayList;
    }
}
