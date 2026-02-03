package androidx.appsearch.builtintypes;

import defpackage.afb;
import defpackage.afe;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afu;
import defpackage.afv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Organization, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__Organization implements afq<Organization> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:Organization");
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
        afe afeVar2 = new afe("logo", "builtin:ImageObject");
        afeVar2.b(2);
        afeVar2.a = false;
        afbVar.c(afeVar2.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        Organization organization = (Organization) obj;
        afu afuVar = new afu(organization.v, organization.w, "builtin:Organization");
        afuVar.c(organization.x);
        afuVar.g(organization.y);
        afuVar.d(organization.z);
        String str = organization.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List listA = organization.a();
        if (listA != null) {
            afuVar.b("alternateNames", (String[]) listA.toArray(new String[0]));
        }
        String str2 = organization.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = organization.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = organization.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list = organization.F;
        if (list != null) {
            afv[] afvVarArr = new afv[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                afvVarArr[i] = afv.f((PotentialAction) it.next());
                i++;
            }
            afuVar.a("potentialActions", afvVarArr);
        }
        ImageObject imageObject = organization.a;
        if (imageObject != null) {
            afuVar.a("logo", afv.f(imageObject));
        }
        return afuVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    @Override // defpackage.afq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object c(defpackage.afv r28, defpackage.afs r29) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.builtintypes.C$$__AppSearch__Organization.c(afv, afs):java.lang.Object");
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:Organization";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        arrayList.add(ImageObject.class);
        return arrayList;
    }
}
