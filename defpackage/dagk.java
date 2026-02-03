package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.resultsview.StarredMessagesResultItemView;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dagk {
    public static final cqce a = cqce.g("Bugle", "StarredMessagesResultItemViewPeer");
    public final Map b;
    private final fcsu c;
    private final fcsu d;

    public dagk(StarredMessagesResultItemView starredMessagesResultItemView, Map map, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = map;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        if (!((asgw) fcsuVar2.b()).a()) {
            int paddingLeft = starredMessagesResultItemView.getPaddingLeft();
            int paddingTop = starredMessagesResultItemView.getPaddingTop();
            int paddingRight = starredMessagesResultItemView.getPaddingRight();
            int paddingBottom = starredMessagesResultItemView.getPaddingBottom();
            if (((asgt) fcsuVar.b()).a()) {
                starredMessagesResultItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_coolranch);
            } else {
                starredMessagesResultItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_gm3);
            }
            starredMessagesResultItemView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        Iterator<E> it = ((ekgp) map).values().iterator();
        while (it.hasNext()) {
            ((adaq) it.next()).c(starredMessagesResultItemView);
        }
    }

    public final void a(adao adaoVar) {
        Iterator<E> it = ((ekgp) this.b).values().iterator();
        while (it.hasNext()) {
            ((adaq) it.next()).b(adaoVar, false);
        }
    }
}
