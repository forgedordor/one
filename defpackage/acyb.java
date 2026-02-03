package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acyb implements cwtb {
    final /* synthetic */ adao a;
    final /* synthetic */ acyc b;

    public acyb(acyc acycVar, adao adaoVar) {
        this.a = adaoVar;
        this.b = acycVar;
    }

    @Override // defpackage.cwtb
    public final ConversationIdType a() {
        return this.a.k().w();
    }

    @Override // defpackage.cwtb
    public final void b(SuggestionData suggestionData) {
        ((cpez) this.b.b.b()).e(suggestionData, eyzv.CONVERSATIONS_LIST_VIEW);
    }

    @Override // defpackage.cwtb
    public final /* synthetic */ boolean c() {
        return true;
    }

    @Override // defpackage.cwtb
    public final /* synthetic */ boolean d() {
        return true;
    }
}
