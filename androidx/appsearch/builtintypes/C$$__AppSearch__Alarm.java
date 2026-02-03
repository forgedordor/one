package androidx.appsearch.builtintypes;

import defpackage.aez;
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
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Alarm, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__Alarm implements afq<Alarm> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:Alarm");
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
        aez aezVar = new aez("enabled");
        aezVar.b(2);
        afbVar.c(aezVar.a());
        afj afjVar = new afj("daysOfWeek");
        afjVar.b(1);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afj afjVar2 = new afj("hour");
        afjVar2.b(2);
        afjVar2.c(0);
        afbVar.c(afjVar2.a());
        afj afjVar3 = new afj("minute");
        afjVar3.b(2);
        afjVar3.c(0);
        afbVar.c(afjVar3.a());
        afm afmVar6 = new afm("blackoutPeriodStartDate");
        afmVar6.b(2);
        afmVar6.e(0);
        afmVar6.c(0);
        afmVar6.d(0);
        afbVar.c(afmVar6.a());
        afm afmVar7 = new afm("blackoutPeriodEndDate");
        afmVar7.b(2);
        afmVar7.e(0);
        afmVar7.c(0);
        afmVar7.d(0);
        afbVar.c(afmVar7.a());
        afm afmVar8 = new afm("ringtone");
        afmVar8.b(2);
        afmVar8.e(0);
        afmVar8.c(0);
        afmVar8.d(0);
        afbVar.c(afmVar8.a());
        aez aezVar2 = new aez("shouldVibrate");
        aezVar2.b(2);
        afbVar.c(aezVar2.a());
        afe afeVar2 = new afe("previousInstance", "builtin:AlarmInstance");
        afeVar2.b(2);
        afeVar2.a = false;
        afbVar.c(afeVar2.a());
        afe afeVar3 = new afe("nextInstance", "builtin:AlarmInstance");
        afeVar3.b(2);
        afeVar3.a = false;
        afbVar.c(afeVar3.a());
        afj afjVar4 = new afj("computingDevice");
        afjVar4.b(2);
        afjVar4.c(0);
        afbVar.c(afjVar4.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        Alarm alarm = (Alarm) obj;
        afu afuVar = new afu(alarm.v, alarm.w, "builtin:Alarm");
        afuVar.c(alarm.x);
        afuVar.g(alarm.y);
        afuVar.d(alarm.z);
        String str = alarm.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = alarm.B;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = alarm.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = alarm.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = alarm.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = alarm.F;
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
        afuVar.h("enabled", alarm.a);
        int[] iArr = alarm.b;
        if (iArr != null) {
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            afuVar.k("daysOfWeek", jArr);
        }
        afuVar.k("hour", alarm.c);
        afuVar.k("minute", alarm.d);
        String str5 = alarm.e;
        if (str5 != null) {
            afuVar.b("blackoutPeriodStartDate", str5);
        }
        String str6 = alarm.f;
        if (str6 != null) {
            afuVar.b("blackoutPeriodEndDate", str6);
        }
        String str7 = alarm.g;
        if (str7 != null) {
            afuVar.b("ringtone", str7);
        }
        afuVar.h("shouldVibrate", alarm.h);
        AlarmInstance alarmInstance = alarm.i;
        if (alarmInstance != null) {
            afuVar.a("previousInstance", afv.f(alarmInstance));
        }
        AlarmInstance alarmInstance2 = alarm.j;
        if (alarmInstance2 != null) {
            afuVar.a("nextInstance", afv.f(alarmInstance2));
        }
        afuVar.k("computingDevice", alarm.k);
        return afuVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b4  */
    @Override // defpackage.afq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object c(defpackage.afv r53, defpackage.afs r54) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.builtintypes.C$$__AppSearch__Alarm.c(afv, afs):java.lang.Object");
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:Alarm";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        arrayList.add(AlarmInstance.class);
        return arrayList;
    }
}
