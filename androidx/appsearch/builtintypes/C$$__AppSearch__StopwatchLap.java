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
import defpackage.ahs;
import defpackage.lcg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__StopwatchLap, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__StopwatchLap implements afq<StopwatchLap> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:StopwatchLap");
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
        afj afjVar = new afj("lapNumber");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afj afjVar2 = new afj("lapDurationMillis");
        afjVar2.b(2);
        afjVar2.c(0);
        afbVar.c(afjVar2.a());
        afj afjVar3 = new afj("accumulatedLapDurationMillis");
        afjVar3.b(2);
        afjVar3.c(0);
        afbVar.c(afjVar3.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        StopwatchLap stopwatchLap = (StopwatchLap) obj;
        afu afuVar = new afu(stopwatchLap.v, stopwatchLap.w, "builtin:StopwatchLap");
        afuVar.c(stopwatchLap.x);
        afuVar.g(stopwatchLap.y);
        afuVar.d(stopwatchLap.z);
        String str = stopwatchLap.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = stopwatchLap.B;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = stopwatchLap.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = stopwatchLap.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = stopwatchLap.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = stopwatchLap.F;
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
        afuVar.k("lapNumber", stopwatchLap.a);
        afuVar.k("lapDurationMillis", stopwatchLap.b);
        afuVar.k("accumulatedLapDurationMillis", stopwatchLap.c);
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String str;
        String strL = afvVar.l();
        String strK = afvVar.k();
        int iB = afvVar.b();
        long jC = afvVar.c();
        long jE = afvVar.e();
        String[] strArrU = afvVar.u("name");
        ArrayList arrayList = null;
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
            arrayList = new ArrayList(afvVarArrT.length);
            str = str5;
            int i = 0;
            while (i < afvVarArrT.length) {
                arrayList.add((PotentialAction) afvVarArrT[i].j(PotentialAction.class, afsVar));
                i++;
                afvVarArrT = afvVarArrT;
            }
        } else {
            str = str5;
        }
        int iD = (int) afvVar.d("lapNumber");
        long jD = afvVar.d("lapDurationMillis");
        long jD2 = afvVar.d("accumulatedLapDurationMillis");
        ahs ahsVar = new ahs(strL, strK);
        ahsVar.d(iB);
        ahsVar.b(jC);
        ahsVar.e(jE);
        ahsVar.g(str2);
        ahsVar.a(listAsList);
        ahsVar.c(str3);
        ahsVar.f(str4);
        ahsVar.i(str);
        ahsVar.h(arrayList);
        lcg.b(iD > 0, "Lap number must start at 1");
        return new StopwatchLap(ahsVar.s, ahsVar.t, ahsVar.u, ahsVar.v, ahsVar.w, ahsVar.x, ahsVar.y, ahsVar.z, ahsVar.A, ahsVar.B, ahsVar.C, iD, jD, jD2);
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:StopwatchLap";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        return arrayList;
    }
}
