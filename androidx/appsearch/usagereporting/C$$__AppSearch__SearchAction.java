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
/* renamed from: androidx.appsearch.usagereporting.$$__AppSearch__SearchAction, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__SearchAction implements afq<SearchAction> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:SearchAction");
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
        afj afjVar2 = new afj("fetchedResultCount");
        afjVar2.b(2);
        afjVar2.c(0);
        afbVar.c(afjVar2.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        SearchAction searchAction = (SearchAction) obj;
        afu afuVar = new afu(searchAction.f, searchAction.g, "builtin:SearchAction");
        afuVar.d(searchAction.h);
        afuVar.g(searchAction.i);
        afuVar.k("actionType", searchAction.j);
        String str = searchAction.a;
        if (str != null) {
            afuVar.b(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, str);
        }
        afuVar.k("fetchedResultCount", searchAction.b);
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
        if (strArrU != null && strArrU.length != 0) {
            str = strArrU[0];
        }
        return new SearchAction(strL, strK, jE, jC, iD, str, (int) afvVar.d("fetchedResultCount"));
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:SearchAction";
    }

    @Override // defpackage.afq
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
