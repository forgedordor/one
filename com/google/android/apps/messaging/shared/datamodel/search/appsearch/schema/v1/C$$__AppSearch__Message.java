package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v1;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.afb;
import defpackage.afj;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v1.$$__AppSearch__Message, reason: invalid class name */
/* loaded from: classes7.dex */
public final class C$$__AppSearch__Message implements afq<Message> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("Message");
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
        Message message = (Message) obj;
        afu afuVar = new afu(message.a, message.b, "Message");
        afuVar.b("conversationId", message.c);
        afuVar.b("participantId", message.d);
        afuVar.k("receivedTimestamp", message.e);
        String str = message.f;
        if (str != null) {
            afuVar.b(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, str);
        }
        afuVar.b("transcriptions", (String[]) message.g.toArray(new String[0]));
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String strL = afvVar.l();
        String strK = afvVar.k();
        String[] strArrU = afvVar.u("conversationId");
        String str = null;
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
        return new Message(strL, strK, str2, str3, jD, str4, listAsList);
    }

    @Override // defpackage.afq
    public final String d() {
        return "Message";
    }

    @Override // defpackage.afq
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
