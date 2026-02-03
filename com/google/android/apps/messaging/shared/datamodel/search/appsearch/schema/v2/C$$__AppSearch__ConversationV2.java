package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.afb;
import defpackage.afe;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.$$__AppSearch__ConversationV2, reason: invalid class name */
/* loaded from: classes7.dex */
public final class C$$__AppSearch__ConversationV2 implements afq<ConversationV2> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("Conversation");
        afe afeVar = new afe("g3attrinfo", "G3AttributionInfo");
        afeVar.b(2);
        afeVar.a = true;
        afbVar.c(afeVar.a());
        afm afmVar = new afm("conversationId");
        afmVar.b(2);
        afmVar.e(1);
        afmVar.c(2);
        afmVar.d(0);
        afbVar.c(afmVar.a());
        afm afmVar2 = new afm("name");
        afmVar2.b(2);
        afmVar2.e(1);
        afmVar2.c(2);
        afmVar2.d(0);
        afbVar.c(afmVar2.a());
        afm afmVar3 = new afm("keywords");
        afmVar3.b(1);
        afmVar3.e(1);
        afmVar3.c(2);
        afmVar3.d(0);
        afbVar.c(afmVar3.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        ConversationV2 conversationV2 = (ConversationV2) obj;
        afu afuVar = new afu(conversationV2.a, conversationV2.b, "Conversation");
        afuVar.a("g3attrinfo", afv.f(conversationV2.c));
        afuVar.b("conversationId", conversationV2.d);
        afuVar.b("name", conversationV2.e);
        afuVar.b("keywords", (String[]) conversationV2.f.toArray(new String[0]));
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String strL = afvVar.l();
        String strK = afvVar.k();
        afv afvVarG = afvVar.g("g3attrinfo");
        String str = null;
        G3AttributionInfo g3AttributionInfo = afvVarG != null ? (G3AttributionInfo) afvVarG.j(G3AttributionInfo.class, afsVar) : null;
        String[] strArrU = afvVar.u("conversationId");
        String str2 = (strArrU == null || strArrU.length == 0) ? null : strArrU[0];
        String[] strArrU2 = afvVar.u("name");
        if (strArrU2 != null && strArrU2.length != 0) {
            str = strArrU2[0];
        }
        String str3 = str;
        String[] strArrU3 = afvVar.u("keywords");
        List listAsList = Collections.EMPTY_LIST;
        if (strArrU3 != null) {
            listAsList = Arrays.asList(strArrU3);
        }
        return new ConversationV2(strL, strK, g3AttributionInfo, str2, str3, listAsList);
    }

    @Override // defpackage.afq
    public final String d() {
        return "Conversation";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        return arrayList;
    }
}
