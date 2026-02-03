package androidx.appsearch.builtintypes;

import defpackage.afb;
import defpackage.afe;
import defpackage.afj;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import defpackage.ahd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__AlarmInstance, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__AlarmInstance implements afq<AlarmInstance> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:AlarmInstance");
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
        afm afmVar6 = new afm("scheduledTime");
        afmVar6.b(2);
        afmVar6.e(0);
        afmVar6.c(0);
        afmVar6.d(0);
        afbVar.c(afmVar6.a());
        afj afjVar = new afj("status");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afj afjVar2 = new afj("snoozeDurationMillis");
        afjVar2.b(2);
        afjVar2.c(0);
        afbVar.c(afjVar2.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        AlarmInstance alarmInstance = (AlarmInstance) obj;
        afu afuVar = new afu(alarmInstance.v, alarmInstance.w, "builtin:AlarmInstance");
        afuVar.c(alarmInstance.x);
        afuVar.g(alarmInstance.y);
        afuVar.d(alarmInstance.z);
        String str = alarmInstance.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = alarmInstance.B;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = alarmInstance.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = alarmInstance.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = alarmInstance.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = alarmInstance.F;
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
        afuVar.b("scheduledTime", alarmInstance.a);
        afuVar.k("status", alarmInstance.b);
        afuVar.k("snoozeDurationMillis", alarmInstance.c);
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
        String[] strArrU6 = afvVar.u("scheduledTime");
        String str6 = (strArrU6 == null || strArrU6.length == 0) ? null : strArrU6[c];
        int iD = (int) afvVar.d("status");
        long jD = afvVar.d("snoozeDurationMillis");
        ahd ahdVar = new ahd(strL, strK, str6);
        ahdVar.d(iB);
        ahdVar.b(jC);
        ahdVar.e(jE);
        ahdVar.g(str2);
        ahdVar.a(listAsList);
        ahdVar.c(str3);
        ahdVar.f(str4);
        ahdVar.i(str);
        ahdVar.h(arrayList);
        return new AlarmInstance(ahdVar.s, ahdVar.t, ahdVar.u, ahdVar.v, ahdVar.w, ahdVar.x, ahdVar.y, ahdVar.z, ahdVar.A, ahdVar.B, ahdVar.C, ahdVar.a, iD, jD);
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:AlarmInstance";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        return arrayList;
    }
}
