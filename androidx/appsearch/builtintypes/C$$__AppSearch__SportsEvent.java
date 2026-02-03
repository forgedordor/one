package androidx.appsearch.builtintypes;

import defpackage.aez;
import defpackage.afb;
import defpackage.afe;
import defpackage.afg;
import defpackage.afj;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afu;
import defpackage.afv;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__SportsEvent, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__SportsEvent implements afq<SportsEvent> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:SportsEvent");
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
        afj afjVar = new afj("startDate");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afj afjVar2 = new afj("endDate");
        afjVar2.b(2);
        afjVar2.c(0);
        afbVar.c(afjVar2.a());
        afj afjVar3 = new afj("duration");
        afjVar3.b(2);
        afjVar3.c(0);
        afbVar.c(afjVar3.a());
        afm afmVar6 = new afm("location");
        afmVar6.b(2);
        afmVar6.e(0);
        afmVar6.c(0);
        afmVar6.d(0);
        afbVar.c(afmVar6.a());
        afe afeVar2 = new afe("logo", "builtin:ImageObject");
        afeVar2.b(2);
        afeVar2.a = false;
        afbVar.c(afeVar2.a());
        afm afmVar7 = new afm("sport");
        afmVar7.b(2);
        afmVar7.e(0);
        afmVar7.c(0);
        afmVar7.d(0);
        afbVar.c(afmVar7.a());
        afe afeVar3 = new afe("organizer", "builtin:Organization");
        afeVar3.b(2);
        afeVar3.a = false;
        afbVar.c(afeVar3.a());
        afj afjVar4 = new afj("sportsEventStatus");
        afjVar4.b(2);
        afjVar4.c(0);
        afbVar.c(afjVar4.a());
        afm afmVar8 = new afm("sportsEventStatusLabel");
        afmVar8.b(2);
        afmVar8.e(0);
        afmVar8.c(0);
        afmVar8.d(0);
        afbVar.c(afmVar8.a());
        afm afmVar9 = new afm("gameTemporalState");
        afmVar9.b(2);
        afmVar9.e(0);
        afmVar9.c(0);
        afmVar9.d(0);
        afbVar.c(afmVar9.a());
        afm afmVar10 = new afm("notableDetail");
        afmVar10.b(2);
        afmVar10.e(0);
        afmVar10.c(0);
        afmVar10.d(0);
        afbVar.c(afmVar10.a());
        afe afeVar4 = new afe("homeTeam", "builtin:SportsTeam");
        afeVar4.b(2);
        afeVar4.a = false;
        afbVar.c(afeVar4.a());
        afm afmVar11 = new afm("homeTeamScore");
        afmVar11.b(2);
        afmVar11.e(0);
        afmVar11.c(0);
        afmVar11.d(0);
        afbVar.c(afmVar11.a());
        afm afmVar12 = new afm("homeTeamAccessoryScore");
        afmVar12.b(2);
        afmVar12.e(0);
        afmVar12.c(0);
        afmVar12.d(0);
        afbVar.c(afmVar12.a());
        afg afgVar = new afg("homeTeamWinProbability");
        afgVar.b(2);
        afbVar.c(afgVar.a());
        afe afeVar5 = new afe("awayTeam", "builtin:SportsTeam");
        afeVar5.b(2);
        afeVar5.a = false;
        afbVar.c(afeVar5.a());
        afm afmVar13 = new afm("awayTeamScore");
        afmVar13.b(2);
        afmVar13.e(0);
        afmVar13.c(0);
        afmVar13.d(0);
        afbVar.c(afmVar13.a());
        afm afmVar14 = new afm("awayTeamAccessoryScore");
        afmVar14.b(2);
        afmVar14.e(0);
        afmVar14.c(0);
        afmVar14.d(0);
        afbVar.c(afmVar14.a());
        afg afgVar2 = new afg("awayTeamWinProbability");
        afgVar2.b(2);
        afbVar.c(afgVar2.a());
        aez aezVar = new aez("placeHomeTeamAtStart");
        aezVar.b(2);
        afbVar.c(aezVar.a());
        afj afjVar5 = new afj("result");
        afjVar5.b(2);
        afjVar5.c(0);
        afbVar.c(afjVar5.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        SportsEvent sportsEvent = (SportsEvent) obj;
        afu afuVar = new afu(sportsEvent.v, sportsEvent.w, "builtin:SportsEvent");
        afuVar.c(sportsEvent.x);
        afuVar.g(sportsEvent.y);
        afuVar.d(sportsEvent.z);
        String str = sportsEvent.A;
        if (str != null) {
            afuVar.b("name", str);
        }
        List list = sportsEvent.B;
        if (list != null) {
            afuVar.b("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = sportsEvent.C;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = sportsEvent.D;
        if (str3 != null) {
            afuVar.b("image", str3);
        }
        String str4 = sportsEvent.E;
        if (str4 != null) {
            afuVar.b("url", str4);
        }
        List list2 = sportsEvent.F;
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
        afuVar.k("startDate", sportsEvent.a.toEpochMilli());
        Instant instant = sportsEvent.b;
        if (instant != null) {
            afuVar.k("endDate", instant.toEpochMilli());
        }
        Duration duration = sportsEvent.c;
        if (duration != null) {
            afuVar.k("duration", duration.toMillis());
        }
        String str5 = sportsEvent.d;
        if (str5 != null) {
            afuVar.b("location", str5);
        }
        ImageObject imageObject = sportsEvent.e;
        if (imageObject != null) {
            afuVar.a("logo", afv.f(imageObject));
        }
        afuVar.b("sport", sportsEvent.f);
        Organization organization = sportsEvent.g;
        if (organization != null) {
            afuVar.a("organizer", afv.f(organization));
        }
        afuVar.k("sportsEventStatus", sportsEvent.h);
        String str6 = sportsEvent.i;
        if (str6 != null) {
            afuVar.b("sportsEventStatusLabel", str6);
        }
        String str7 = sportsEvent.j;
        if (str7 != null) {
            afuVar.b("gameTemporalState", str7);
        }
        String str8 = sportsEvent.k;
        if (str8 != null) {
            afuVar.b("notableDetail", str8);
        }
        afuVar.a("homeTeam", afv.f(sportsEvent.l));
        String str9 = sportsEvent.m;
        if (str9 != null) {
            afuVar.b("homeTeamScore", str9);
        }
        String str10 = sportsEvent.n;
        if (str10 != null) {
            afuVar.b("homeTeamAccessoryScore", str10);
        }
        afuVar.j("homeTeamWinProbability", sportsEvent.o);
        afuVar.a("awayTeam", afv.f(sportsEvent.p));
        String str11 = sportsEvent.q;
        if (str11 != null) {
            afuVar.b("awayTeamScore", str11);
        }
        String str12 = sportsEvent.r;
        if (str12 != null) {
            afuVar.b("awayTeamAccessoryScore", str12);
        }
        afuVar.j("awayTeamWinProbability", sportsEvent.s);
        afuVar.h("placeHomeTeamAtStart", sportsEvent.t);
        afuVar.k("result", sportsEvent.u);
        return afuVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0188  */
    @Override // defpackage.afq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object c(defpackage.afv r89, defpackage.afs r90) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.builtintypes.C$$__AppSearch__SportsEvent.c(afv, afs):java.lang.Object");
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:SportsEvent";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PotentialAction.class);
        arrayList.add(ImageObject.class);
        arrayList.add(Organization.class);
        arrayList.add(SportsTeam.class);
        return arrayList;
    }
}
