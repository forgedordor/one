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
/* renamed from: androidx.appsearch.usagereporting.$$__AppSearch__DismissAction, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__DismissAction implements afq<DismissAction> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:DismissAction");
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
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        DismissAction dismissAction = (DismissAction) obj;
        afu afuVar = new afu(dismissAction.f, dismissAction.g, "builtin:DismissAction");
        afuVar.d(dismissAction.h);
        afuVar.g(dismissAction.i);
        afuVar.k("actionType", dismissAction.j);
        String str = dismissAction.a;
        if (str != null) {
            afuVar.b(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, str);
        }
        String str2 = dismissAction.b;
        if (str2 != null) {
            afuVar.b("referencedQualifiedId", str2);
        }
        afuVar.k("resultRankInBlock", dismissAction.c);
        afuVar.k("resultRankGlobal", dismissAction.d);
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
        return new DismissAction(strL, strK, jE, jC, iD, str2, str, (int) afvVar.d("resultRankInBlock"), (int) afvVar.d("resultRankGlobal"));
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:DismissAction";
    }

    @Override // defpackage.afq
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
