package androidx.appsearch.builtintypes;

import defpackage.afb;
import defpackage.afe;
import defpackage.afj;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afu;
import defpackage.afv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Stopwatch, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__Stopwatch implements afq<Stopwatch> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:Stopwatch");
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
        afj afjVar = new afj("baseTimeMillis");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afj afjVar2 = new afj("baseTimeMillisInElapsedRealtime");
        afjVar2.b(2);
        afjVar2.c(0);
        afbVar.c(afjVar2.a());
        afj afjVar3 = new afj("bootCount");
        afjVar3.b(2);
        afjVar3.c(0);
        afbVar.c(afjVar3.a());
        afj afjVar4 = new afj("status");
        afjVar4.b(2);
        afjVar4.c(0);
        afbVar.c(afjVar4.a());
        afj afjVar5 = new afj("accumulatedDurationMillis");
        afjVar5.b(2);
        afjVar5.c(0);
        afbVar.c(afjVar5.a());
        afe afeVar2 = new afe("laps", "builtin:StopwatchLap");
        afeVar2.b(1);
        afeVar2.a = false;
        afbVar.c(afeVar2.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        Stopwatch stopwatch = (Stopwatch) obj;
        afu afuVar = new afu(stopwatch.v, stopwatch.w, "builtin:Stopwatch");
        afuVar.c(stopwatch.x);
        afuVar.g(stopwatch.y);
        afuVar.d(stopwatch.z);
        String str = stopwatch.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = stopwatch.B;
        int i = 0;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = stopwatch.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = stopwatch.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = stopwatch.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = stopwatch.F;
        if (list2 != null) {
            afv[] afvVarArr = new afv[list2.size()];
            Iterator it = list2.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                afvVarArr[i2] = afv.f((PotentialAction) it.next());
                i2++;
            }
            afuVar.a("potentialActions", afvVarArr);
        }
        afuVar.k("baseTimeMillis", stopwatch.a);
        afuVar.k("baseTimeMillisInElapsedRealtime", stopwatch.b);
        afuVar.k("bootCount", stopwatch.c);
        afuVar.k("status", stopwatch.d);
        afuVar.k("accumulatedDurationMillis", stopwatch.e);
        List list3 = stopwatch.f;
        afv[] afvVarArr2 = new afv[list3.size()];
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            afvVarArr2[i] = afv.f((StopwatchLap) it2.next());
            i++;
        }
        afuVar.a("laps", afvVarArr2);
        return afuVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    @Override // defpackage.afq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object c(defpackage.afv r30, defpackage.afs r31) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.builtintypes.C$$__AppSearch__Stopwatch.c(afv, afs):java.lang.Object");
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:Stopwatch";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        arrayList.add(StopwatchLap.class);
        return arrayList;
    }
}
