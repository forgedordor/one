package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.resultsview.conversation.SearchConversationResultItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dahu implements eyif {
    public static SearchConversationResultItemView a(View view) {
        if (!(view instanceof SearchConversationResultItemView)) {
            throw new IllegalStateException(a.L(view, dahr.class, "Attempt to inject a View wrapper of type "));
        }
        SearchConversationResultItemView searchConversationResultItemView = (SearchConversationResultItemView) view;
        searchConversationResultItemView.getClass();
        return searchConversationResultItemView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
