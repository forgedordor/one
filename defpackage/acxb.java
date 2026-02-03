package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.list.ConversationListItemView;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxb {
    public static final cqce a = cqce.g("Bugle", "ConversationListItemViewPeer");
    public final Map b;
    private final fcsu c;

    public acxb(ConversationListItemView conversationListItemView, Map map, fcsu fcsuVar) {
        this.b = map;
        this.c = fcsuVar;
        int paddingLeft = conversationListItemView.getPaddingLeft();
        int paddingTop = conversationListItemView.getPaddingTop();
        int paddingRight = conversationListItemView.getPaddingRight();
        int paddingBottom = conversationListItemView.getPaddingBottom();
        if (((asgt) fcsuVar.b()).a()) {
            conversationListItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_coolranch);
        } else {
            conversationListItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg);
        }
        conversationListItemView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        if (((asgt) fcsuVar.b()).a()) {
            conversationListItemView.setForeground(conversationListItemView.getContext().getDrawable(R.drawable.conversation_list_item_view_fg_coolranch));
        } else {
            conversationListItemView.setForeground(conversationListItemView.getContext().getDrawable(R.drawable.conversation_list_item_view_fg));
        }
        Iterator<E> it = ((ekgp) map).values().iterator();
        while (it.hasNext()) {
            ((adaq) it.next()).c(conversationListItemView);
        }
    }

    public final void a(adao adaoVar, boolean z) {
        Iterator<E> it = ((ekgp) this.b).values().iterator();
        while (it.hasNext()) {
            ((adaq) it.next()).b(adaoVar, z);
        }
    }
}
