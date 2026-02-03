package androidx.appsearch.builtintypes;

import defpackage.aez;
import defpackage.afb;
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
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Timer, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__Timer implements afq<Timer> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:Timer");
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
        afj afjVar = new afj("durationMillis");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afj afjVar2 = new afj("originalDurationMillis");
        afjVar2.b(2);
        afjVar2.c(0);
        afbVar.c(afjVar2.a());
        afj afjVar3 = new afj("startTimeMillis");
        afjVar3.b(2);
        afjVar3.c(0);
        afbVar.c(afjVar3.a());
        afj afjVar4 = new afj("baseTimeMillis");
        afjVar4.b(2);
        afjVar4.c(0);
        afbVar.c(afjVar4.a());
        afj afjVar5 = new afj("baseTimeMillisInElapsedRealtime");
        afjVar5.b(2);
        afjVar5.c(0);
        afbVar.c(afjVar5.a());
        afj afjVar6 = new afj("bootCount");
        afjVar6.b(2);
        afjVar6.c(0);
        afbVar.c(afjVar6.a());
        afj afjVar7 = new afj("remainingDurationMillis");
        afjVar7.b(2);
        afjVar7.c(0);
        afbVar.c(afjVar7.a());
        afm afmVar6 = new afm("ringtone");
        afmVar6.b(2);
        afmVar6.e(0);
        afmVar6.c(0);
        afmVar6.d(0);
        afbVar.c(afmVar6.a());
        afj afjVar8 = new afj("status");
        afjVar8.b(2);
        afjVar8.c(0);
        afbVar.c(afjVar8.a());
        aez aezVar = new aez("shouldVibrate");
        aezVar.b(2);
        afbVar.c(aezVar.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        Timer timer = (Timer) obj;
        afu afuVar = new afu(timer.v, timer.w, "builtin:Timer");
        afuVar.c(timer.x);
        afuVar.g(timer.y);
        afuVar.d(timer.z);
        String str = timer.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = timer.B;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = timer.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = timer.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = timer.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = timer.F;
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
        afuVar.k("durationMillis", timer.a);
        afuVar.k("originalDurationMillis", timer.b);
        afuVar.k("startTimeMillis", timer.c);
        afuVar.k("baseTimeMillis", timer.d);
        afuVar.k("baseTimeMillisInElapsedRealtime", timer.e);
        afuVar.k("bootCount", timer.f);
        afuVar.k("remainingDurationMillis", timer.g);
        String str5 = timer.h;
        if (str5 != null) {
            afuVar.b("ringtone", str5);
        }
        afuVar.k("status", timer.i);
        afuVar.h("shouldVibrate", timer.j);
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String str;
        char c;
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
        String str6 = strK;
        int i2 = iB;
        long jD = afvVar.d("durationMillis");
        long jD2 = afvVar.d("originalDurationMillis");
        long jD3 = afvVar.d("startTimeMillis");
        long jD4 = afvVar.d("baseTimeMillis");
        long jD5 = afvVar.d("baseTimeMillisInElapsedRealtime");
        int iD = (int) afvVar.d("bootCount");
        long jD6 = afvVar.d("remainingDurationMillis");
        String[] strArrU6 = afvVar.u("ringtone");
        return new Timer(str, str6, i2, jC, jE, str2, listAsList, str3, str4, str5, arrayList, jD, jD2, jD3, jD4, jD5, iD, jD6, (strArrU6 == null || strArrU6.length == 0) ? null : strArrU6[c], (int) afvVar.d("status"), afvVar.r("shouldVibrate"));
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:Timer";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        return arrayList;
    }
}
