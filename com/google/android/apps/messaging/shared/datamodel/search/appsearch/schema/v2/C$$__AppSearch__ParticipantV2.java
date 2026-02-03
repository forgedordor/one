package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
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
import java.util.List;

/* compiled from: PG */
/* renamed from: com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.$$__AppSearch__ParticipantV2, reason: invalid class name */
/* loaded from: classes7.dex */
public final class C$$__AppSearch__ParticipantV2 implements afq<ParticipantV2> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("Participant");
        afe afeVar = new afe("g3attrinfo", "G3AttributionInfo");
        afeVar.b(2);
        afeVar.a = true;
        afbVar.c(afeVar.a());
        afm afmVar = new afm("name");
        afmVar.b(2);
        afmVar.e(1);
        afmVar.c(2);
        afmVar.d(0);
        afbVar.c(afmVar.a());
        afj afjVar = new afj("subId");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afm afmVar2 = new afm("displayDestination");
        afmVar2.b(2);
        afmVar2.e(1);
        afmVar2.c(2);
        afmVar2.d(0);
        afbVar.c(afmVar2.a());
        afm afmVar3 = new afm("normalizedDestination");
        afmVar3.b(2);
        afmVar3.e(1);
        afmVar3.c(2);
        afmVar3.d(0);
        afbVar.c(afmVar3.a());
        afm afmVar4 = new afm("rawDestination");
        afmVar4.b(2);
        afmVar4.e(1);
        afmVar4.c(2);
        afmVar4.d(0);
        afbVar.c(afmVar4.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        ParticipantV2 participantV2 = (ParticipantV2) obj;
        afu afuVar = new afu(participantV2.a, participantV2.b, "Participant");
        afuVar.a("g3attrinfo", afv.f(participantV2.c));
        afuVar.b("name", participantV2.d);
        afuVar.k("subId", participantV2.e);
        String str = participantV2.f;
        if (str != null) {
            afuVar.b("displayDestination", str);
        }
        String str2 = participantV2.g;
        if (str2 != null) {
            afuVar.b("normalizedDestination", str2);
        }
        afuVar.b("rawDestination", participantV2.h);
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String strL = afvVar.l();
        String strK = afvVar.k();
        afv afvVarG = afvVar.g("g3attrinfo");
        String str = null;
        G3AttributionInfo g3AttributionInfo = afvVarG != null ? (G3AttributionInfo) afvVarG.j(G3AttributionInfo.class, afsVar) : null;
        String[] strArrU = afvVar.u("name");
        String str2 = (strArrU == null || strArrU.length == 0) ? null : strArrU[0];
        long jD = afvVar.d("subId");
        String[] strArrU2 = afvVar.u("displayDestination");
        String str3 = (strArrU2 == null || strArrU2.length == 0) ? null : strArrU2[0];
        String[] strArrU3 = afvVar.u("normalizedDestination");
        String str4 = (strArrU3 == null || strArrU3.length == 0) ? null : strArrU3[0];
        String[] strArrU4 = afvVar.u("rawDestination");
        if (strArrU4 != null && strArrU4.length != 0) {
            str = strArrU4[0];
        }
        return new ParticipantV2(strL, strK, g3AttributionInfo, str2, jD, str3, str4, str);
    }

    @Override // defpackage.afq
    public final String d() {
        return "Participant";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        return arrayList;
    }
}
