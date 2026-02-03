package androidx.appsearch.builtintypes;

import androidx.appsearch.builtintypes.properties.Keyword;
import defpackage.afb;
import defpackage.afc;
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
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__ImageObject, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__ImageObject implements afq<ImageObject> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:ImageObject");
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
        afe afeVar2 = new afe("keywords", "Keyword");
        afeVar2.b(1);
        afeVar2.a = true;
        afbVar.c(afeVar2.a());
        afm afmVar6 = new afm("sha256");
        afmVar6.b(2);
        afmVar6.e(0);
        afmVar6.c(0);
        afmVar6.d(0);
        afbVar.c(afmVar6.a());
        afm afmVar7 = new afm("thumbnailSha256");
        afmVar7.b(2);
        afmVar7.e(0);
        afmVar7.c(0);
        afmVar7.d(0);
        afbVar.c(afmVar7.a());
        afc afcVar = new afc("bytes");
        afcVar.b(2);
        afbVar.c(afcVar.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        ImageObject imageObject = (ImageObject) obj;
        afu afuVar = new afu(imageObject.v, imageObject.w, "builtin:ImageObject");
        afuVar.c(imageObject.x);
        afuVar.g(imageObject.y);
        afuVar.d(imageObject.z);
        String str = imageObject.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = imageObject.B;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = imageObject.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = imageObject.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = imageObject.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = imageObject.F;
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
        List list3 = imageObject.a;
        afv[] afvVarArr2 = new afv[list3.size()];
        Iterator it2 = list3.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            afvVarArr2[i2] = afv.f((Keyword) it2.next());
            i2++;
        }
        afuVar.a("keywords", afvVarArr2);
        String str5 = imageObject.b;
        if (str5 != null) {
            afuVar.b("sha256", str5);
        }
        String str6 = imageObject.c;
        if (str6 != null) {
            afuVar.b("thumbnailSha256", str6);
        }
        byte[] bArr = imageObject.d;
        if (bArr != null) {
            afuVar.i("bytes", bArr);
        }
        return afuVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    @Override // defpackage.afq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object c(defpackage.afv r23, defpackage.afs r24) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.builtintypes.C$$__AppSearch__ImageObject.c(afv, afs):java.lang.Object");
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:ImageObject";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        arrayList.add(Keyword.class);
        return arrayList;
    }
}
