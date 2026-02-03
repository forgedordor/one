package androidx.appsearch.builtintypes;

import defpackage.afb;
import defpackage.afe;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import defpackage.ahu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Thing, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__Thing implements afq<Thing> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:Thing");
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
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        Thing thing = (Thing) obj;
        afu afuVar = new afu(thing.v, thing.w, "builtin:Thing");
        afuVar.c(thing.x);
        afuVar.g(thing.y);
        afuVar.d(thing.z);
        String str = thing.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List listA = thing.a();
        int i = 0;
        if (listA != null) {
            afuVar.b("alternateNames", (String[]) listA.toArray(new String[0]));
        }
        String str2 = thing.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = thing.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = thing.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list = thing.F;
        if (list != null) {
            afv[] afvVarArr = new afv[list.size()];
            Iterator it = list.iterator();
            while (it.hasNext()) {
                afvVarArr[i] = afv.f((PotentialAction) it.next());
                i++;
            }
            afuVar.a("potentialActions", afvVarArr);
        }
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String strL = afvVar.l();
        String strK = afvVar.k();
        int iB = afvVar.b();
        long jC = afvVar.c();
        long jE = afvVar.e();
        String[] strArrU = afvVar.u("name");
        int i = 0;
        ArrayList arrayList = null;
        String str = (strArrU == null || strArrU.length == 0) ? null : strArrU[0];
        String[] strArrU2 = afvVar.u("alternateNames");
        List listAsList = strArrU2 != null ? Arrays.asList(strArrU2) : null;
        String[] strArrU3 = afvVar.u("description");
        String str2 = (strArrU3 == null || strArrU3.length == 0) ? null : strArrU3[0];
        String[] strArrU4 = afvVar.u("image");
        String str3 = (strArrU4 == null || strArrU4.length == 0) ? null : strArrU4[0];
        String[] strArrU5 = afvVar.u("url");
        String str4 = (strArrU5 == null || strArrU5.length == 0) ? null : strArrU5[0];
        afv[] afvVarArrT = afvVar.t("potentialActions");
        if (afvVarArrT != null) {
            arrayList = new ArrayList(afvVarArrT.length);
            while (i < afvVarArrT.length) {
                arrayList.add((PotentialAction) afvVarArrT[i].j(PotentialAction.class, afsVar));
                i++;
                afvVarArrT = afvVarArrT;
            }
        }
        ahu ahuVar = new ahu(strL, strK);
        ahuVar.d(iB);
        ahuVar.b(jC);
        ahuVar.e(jE);
        ahuVar.g(str);
        ahuVar.a(listAsList);
        ahuVar.c(str2);
        ahuVar.f(str3);
        ahuVar.i(str4);
        ahuVar.h(arrayList);
        ahuVar.D = true;
        return new Thing(ahuVar.s, ahuVar.t, ahuVar.u, ahuVar.v, ahuVar.w, ahuVar.x, ahuVar.y, ahuVar.z, ahuVar.A, ahuVar.B, ahuVar.C);
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:Thing";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        return arrayList;
    }
}
