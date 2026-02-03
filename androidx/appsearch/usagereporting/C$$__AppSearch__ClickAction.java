package androidx.appsearch.usagereporting;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.afb;
import defpackage.afj;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.usagereporting.$$__AppSearch__ClickAction, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__ClickAction implements afq<ClickAction> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:ClickAction");
        afj afjVar = new afj("actionType");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afm afmVar = new afm(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        afmVar.b(2);
        afmVar.e(1);
        afmVar.c(2);
        afmVar.d(0);
        afbVar.c(afmVar.a());
        afm afmVar2 = new afm("referencedQualifiedId");
        afmVar2.b(2);
        afmVar2.e(0);
        afmVar2.c(0);
        afmVar2.d(1);
        afbVar.c(afmVar2.a());
        afj afjVar2 = new afj("resultRankInBlock");
        afjVar2.b(2);
        afjVar2.c(0);
        afbVar.c(afjVar2.a());
        afj afjVar3 = new afj("resultRankGlobal");
        afjVar3.b(2);
        afjVar3.c(0);
        afbVar.c(afjVar3.a());
        afj afjVar4 = new afj("timeStayOnResultMillis");
        afjVar4.b(2);
        afjVar4.c(0);
        afbVar.c(afjVar4.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        ClickAction clickAction = (ClickAction) obj;
        afu afuVar = new afu(clickAction.f, clickAction.g, "builtin:ClickAction");
        afuVar.d(clickAction.h);
        afuVar.g(clickAction.i);
        afuVar.k("actionType", clickAction.j);
        String str = clickAction.a;
        if (str != null) {
            afuVar.b(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, str);
        }
        String str2 = clickAction.b;
        if (str2 != null) {
            afuVar.b("referencedQualifiedId", str2);
        }
        afuVar.k("resultRankInBlock", clickAction.c);
        afuVar.k("resultRankGlobal", clickAction.d);
        afuVar.k("timeStayOnResultMillis", clickAction.e);
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String strL = afvVar.l();
        String strK = afvVar.k();
        long jE = afvVar.e();
        long jC = afvVar.c();
        int iD = (int) afvVar.d("actionType");
        String[] strArrU = afvVar.u(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        String str = null;
        String str2 = (strArrU == null || strArrU.length == 0) ? null : strArrU[0];
        String[] strArrU2 = afvVar.u("referencedQualifiedId");
        if (strArrU2 != null && strArrU2.length != 0) {
            str = strArrU2[0];
        }
        return new ClickAction(strL, strK, jE, jC, iD, str2, str, (int) afvVar.d("resultRankInBlock"), (int) afvVar.d("resultRankGlobal"), afvVar.d("timeStayOnResultMillis"));
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:ClickAction";
    }

    @Override // defpackage.afq
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
