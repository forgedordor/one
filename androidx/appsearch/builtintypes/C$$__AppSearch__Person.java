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
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Person, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__Person implements afq<Person> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:Person");
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
        afm afmVar6 = new afm("givenName");
        afmVar6.b(2);
        afmVar6.e(0);
        afmVar6.c(0);
        afmVar6.d(0);
        afbVar.c(afmVar6.a());
        afm afmVar7 = new afm("middleName");
        afmVar7.b(2);
        afmVar7.e(0);
        afmVar7.c(0);
        afmVar7.d(0);
        afbVar.c(afmVar7.a());
        afm afmVar8 = new afm("familyName");
        afmVar8.b(2);
        afmVar8.e(0);
        afmVar8.c(0);
        afmVar8.d(0);
        afbVar.c(afmVar8.a());
        afm afmVar9 = new afm("externalUri");
        afmVar9.b(2);
        afmVar9.e(0);
        afmVar9.c(0);
        afmVar9.d(0);
        afbVar.c(afmVar9.a());
        afm afmVar10 = new afm("imageUri");
        afmVar10.b(2);
        afmVar10.e(0);
        afmVar10.c(0);
        afmVar10.d(0);
        afbVar.c(afmVar10.a());
        aez aezVar = new aez("isImportant");
        aezVar.b(2);
        afbVar.c(aezVar.a());
        aez aezVar2 = new aez("isBot");
        aezVar2.b(2);
        afbVar.c(aezVar2.a());
        afm afmVar11 = new afm("notes");
        afmVar11.b(1);
        afmVar11.e(1);
        afmVar11.c(2);
        afmVar11.d(0);
        afbVar.c(afmVar11.a());
        afj afjVar = new afj("additionalNameTypes");
        afjVar.b(1);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afm afmVar12 = new afm("additionalNames");
        afmVar12.b(1);
        afmVar12.e(1);
        afmVar12.c(2);
        afmVar12.d(0);
        afbVar.c(afmVar12.a());
        afm afmVar13 = new afm("affiliations");
        afmVar13.b(1);
        afmVar13.e(1);
        afmVar13.c(2);
        afmVar13.d(0);
        afbVar.c(afmVar13.a());
        afm afmVar14 = new afm("relations");
        afmVar14.b(1);
        afmVar14.e(0);
        afmVar14.c(0);
        afmVar14.d(0);
        afbVar.c(afmVar14.a());
        afe afeVar2 = new afe("contactPoints", "builtin:ContactPoint");
        afeVar2.b(1);
        afeVar2.a = true;
        afbVar.c(afeVar2.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        Person person = (Person) obj;
        afu afuVar = new afu(person.v, person.w, "builtin:Person");
        afuVar.c(person.x);
        afuVar.g(person.y);
        afuVar.d(person.z);
        String str = person.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = person.B;
        int i = 0;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = person.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = person.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = person.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = person.F;
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
        String str5 = person.a;
        if (str5 != null) {
            afuVar.b("givenName", str5);
        }
        String str6 = person.b;
        if (str6 != null) {
            afuVar.b("middleName", str6);
        }
        String str7 = person.c;
        if (str7 != null) {
            afuVar.b("familyName", str7);
        }
        String str8 = person.d;
        if (str8 != null) {
            afuVar.b("externalUri", str8);
        }
        String str9 = person.e;
        if (str9 != null) {
            afuVar.b("imageUri", str9);
        }
        afuVar.h("isImportant", person.f);
        afuVar.h("isBot", person.g);
        List list3 = person.h;
        if (list3 != null) {
            afuVar.b("notes", (String[]) list3.toArray(new String[0]));
        }
        List list4 = person.i;
        if (list4 != null) {
            long[] jArr = new long[list4.size()];
            Iterator it2 = list4.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                jArr[i3] = ((Long) it2.next()).longValue();
                i3++;
            }
            afuVar.k("additionalNameTypes", jArr);
        }
        List list5 = person.j;
        if (list5 != null) {
            afuVar.b("additionalNames", (String[]) list5.toArray(new String[0]));
        }
        List list6 = person.k;
        if (list6 != null) {
            afuVar.b("affiliations", (String[]) list6.toArray(new String[0]));
        }
        List list7 = person.l;
        if (list7 != null) {
            afuVar.b("relations", (String[]) list7.toArray(new String[0]));
        }
        List list8 = person.m;
        if (list8 != null) {
            afv[] afvVarArr2 = new afv[list8.size()];
            Iterator it3 = list8.iterator();
            while (it3.hasNext()) {
                afvVarArr2[i] = afv.f((ContactPoint) it3.next());
                i++;
            }
            afuVar.a("contactPoints", afvVarArr2);
        }
        return afuVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016e  */
    @Override // defpackage.afq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object c(defpackage.afv r32, defpackage.afs r33) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.builtintypes.C$$__AppSearch__Person.c(afv, afs):java.lang.Object");
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:Person";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        arrayList.add(ContactPoint.class);
        return arrayList;
    }
}
