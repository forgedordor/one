package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.$$__AppSearch__MessageV2, reason: invalid class name */
/* loaded from: classes7.dex */
public final class C$$__AppSearch__MessageV2 implements afq<MessageV2> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("Message");
        afe afeVar = new afe("g3attrinfo", "G3AttributionInfo");
        afeVar.b(2);
        afeVar.a = true;
        afbVar.c(afeVar.a());
        afm afmVar = new afm("conversationId");
        afmVar.b(2);
        afmVar.e(1);
        afmVar.c(2);
        afmVar.d(1);
        afbVar.c(afmVar.a());
        afm afmVar2 = new afm("participantId");
        afmVar2.b(2);
        afmVar2.e(1);
        afmVar2.c(2);
        afmVar2.d(1);
        afbVar.c(afmVar2.a());
        afj afjVar = new afj("receivedTimestamp");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afm afmVar3 = new afm(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        afmVar3.b(2);
        afmVar3.e(1);
        afmVar3.c(2);
        afmVar3.d(0);
        afbVar.c(afmVar3.a());
        afm afmVar4 = new afm("transcriptions");
        afmVar4.b(1);
        afmVar4.e(1);
        afmVar4.c(2);
        afmVar4.d(0);
        afbVar.c(afmVar4.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        MessageV2 messageV2 = (MessageV2) obj;
        afu afuVar = new afu(messageV2.a, messageV2.b, "Message");
        afuVar.a("g3attrinfo", afv.f(messageV2.c));
        afuVar.b("conversationId", messageV2.d);
        afuVar.b("participantId", messageV2.e);
        afuVar.k("receivedTimestamp", messageV2.f);
        String str = messageV2.g;
        if (str != null) {
            afuVar.b(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, str);
        }
        afuVar.b("transcriptions", (String[]) messageV2.h.toArray(new String[0]));
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
        String[] strArrU2 = afvVar.u("participantId");
        String str3 = (strArrU2 == null || strArrU2.length == 0) ? null : strArrU2[0];
        long jD = afvVar.d("receivedTimestamp");
        String[] strArrU3 = afvVar.u(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        if (strArrU3 != null && strArrU3.length != 0) {
            str = strArrU3[0];
        }
        String str4 = str;
        String[] strArrU4 = afvVar.u("transcriptions");
        List listAsList = Collections.EMPTY_LIST;
        if (strArrU4 != null) {
            listAsList = Arrays.asList(strArrU4);
        }
        return new MessageV2(strL, strK, g3AttributionInfo, str2, str3, jD, str4, listAsList);
    }

    @Override // defpackage.afq
    public final String d() {
        return "Message";
    }

    @Override // defpackage.afq
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        return arrayList;
    }
}
