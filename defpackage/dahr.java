package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.resultsview.conversation.SearchConversationResultItemView;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dahr {
    public static final cqce a = cqce.g("Bugle", "SearchConversationResultItemViewPeer");
    public final Map b;
    private final fcsu c;
    private final fcsu d;

    public dahr(SearchConversationResultItemView searchConversationResultItemView, Map map, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = map;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        if (!((asgw) fcsuVar2.b()).a()) {
            int paddingLeft = searchConversationResultItemView.getPaddingLeft();
            int paddingTop = searchConversationResultItemView.getPaddingTop();
            int paddingRight = searchConversationResultItemView.getPaddingRight();
            int paddingBottom = searchConversationResultItemView.getPaddingBottom();
            if (((asgt) fcsuVar.b()).a()) {
                searchConversationResultItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_coolranch);
            } else {
                searchConversationResultItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_gm3);
            }
            searchConversationResultItemView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        Iterator<E> it = ((ekgp) map).values().iterator();
        while (it.hasNext()) {
            ((adaq) it.next()).c(searchConversationResultItemView);
        }
    }

    public final void a(adao adaoVar) {
        Iterator<E> it = ((ekgp) this.b).values().iterator();
        while (it.hasNext()) {
            ((adaq) it.next()).b(adaoVar, false);
        }
    }
}
