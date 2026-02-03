package androidx.appsearch.builtintypes;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.afb;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__PotentialAction, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__PotentialAction implements afq<PotentialAction> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:PotentialAction");
        afm afmVar = new afm("name");
        afmVar.b(2);
        afmVar.e(0);
        afmVar.c(0);
        afmVar.d(0);
        afbVar.c(afmVar.a());
        afm afmVar2 = new afm("description");
        afmVar2.b(2);
        afmVar2.e(0);
        afmVar2.c(0);
        afmVar2.d(0);
        afbVar.c(afmVar2.a());
        afm afmVar3 = new afm(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        afmVar3.b(2);
        afmVar3.e(0);
        afmVar3.c(0);
        afmVar3.d(0);
        afbVar.c(afmVar3.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        PotentialAction potentialAction = (PotentialAction) obj;
        afu afuVar = new afu(potentialAction.a, potentialAction.b, "builtin:PotentialAction");
        String str = potentialAction.c;
        if (str != null) {
            afuVar.b("name", str);
        }
        String str2 = potentialAction.d;
        if (str2 != null) {
            afuVar.b("description", str2);
        }
        String str3 = potentialAction.e;
        if (str3 != null) {
            afuVar.b(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, str3);
        }
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String strL = afvVar.l();
        String strK = afvVar.k();
        String[] strArrU = afvVar.u("name");
        String str = null;
        String str2 = (strArrU == null || strArrU.length == 0) ? null : strArrU[0];
        String[] strArrU2 = afvVar.u("description");
        String str3 = (strArrU2 == null || strArrU2.length == 0) ? null : strArrU2[0];
        String[] strArrU3 = afvVar.u(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (strArrU3 != null && strArrU3.length != 0) {
            str = strArrU3[0];
        }
        return new PotentialAction(strL, strK, str2, str3, str);
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:PotentialAction";
    }

    @Override // defpackage.afq
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
