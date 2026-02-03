package androidx.appsearch.builtintypes;

import android.graphics.Color;
import defpackage.afb;
import defpackage.afe;
import defpackage.afj;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afu;
import defpackage.afv;
import defpackage.akc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__SportsTeam, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__SportsTeam implements afq<SportsTeam> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:SportsTeam");
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
        afm afmVar6 = new afm("sport");
        afmVar6.b(2);
        afmVar6.e(0);
        afmVar6.c(0);
        afmVar6.d(0);
        afbVar.c(afmVar6.a());
        afj afjVar = new afj("accentColor");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afj afjVar2 = new afj("wins");
        afjVar2.b(2);
        afjVar2.c(0);
        afbVar.c(afjVar2.a());
        afj afjVar3 = new afj("losses");
        afjVar3.b(2);
        afjVar3.c(0);
        afbVar.c(afjVar3.a());
        afj afjVar4 = new afj("ties");
        afjVar4.b(2);
        afjVar4.c(0);
        afbVar.c(afjVar4.a());
        afj afjVar5 = new afj("overtimeLosses");
        afjVar5.b(2);
        afjVar5.c(0);
        afbVar.c(afjVar5.a());
        afj afjVar6 = new afj("overtimeWins");
        afjVar6.b(2);
        afjVar6.c(0);
        afbVar.c(afjVar6.a());
        afm afmVar7 = new afm("formattedRecord");
        afmVar7.b(2);
        afmVar7.e(0);
        afmVar7.c(0);
        afmVar7.d(0);
        afbVar.c(afmVar7.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        SportsTeam sportsTeam = (SportsTeam) obj;
        afu afuVar = new afu(sportsTeam.v, sportsTeam.w, "builtin:SportsTeam");
        afuVar.c(sportsTeam.x);
        afuVar.g(sportsTeam.y);
        afuVar.d(sportsTeam.z);
        String str = sportsTeam.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = sportsTeam.B;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = sportsTeam.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = sportsTeam.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = sportsTeam.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = sportsTeam.F;
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
        ImageObject imageObject = sportsTeam.a;
        if (imageObject != null) {
            afuVar.a("logo", afv.f(imageObject));
        }
        afuVar.b("sport", sportsTeam.b);
        Color color = sportsTeam.c;
        if (color != null) {
            afuVar.k("accentColor", akc.a(color));
        }
        afuVar.k("wins", sportsTeam.d);
        afuVar.k("losses", sportsTeam.e);
        afuVar.k("ties", sportsTeam.f);
        afuVar.k("overtimeLosses", sportsTeam.g);
        afuVar.k("overtimeWins", sportsTeam.h);
        String str5 = sportsTeam.i;
        if (str5 != null) {
            afuVar.b("formattedRecord", str5);
        }
        return afuVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    @Override // defpackage.afq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object c(defpackage.afv r48, defpackage.afs r49) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.builtintypes.C$$__AppSearch__SportsTeam.c(afv, afs):java.lang.Object");
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:SportsTeam";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        arrayList.add(ImageObject.class);
        return arrayList;
    }
}
