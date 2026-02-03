package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchActivity;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daav implements daau {
    private final eygg a;
    private final fcsu b;
    private final fcsu c;

    public daav(eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = eyggVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    private final void e(Context context, Intent intent, int i) {
        ((ajfo) this.c.b()).d(dadd.a);
        ((dabl) this.b.b()).d(i);
        context.startActivity(intent, null);
    }

    @Override // defpackage.daau
    public final void a(efwo efwoVar, Context context) {
        Intent intent = new Intent(context, (Class<?>) ZeroStateSearchActivity.class);
        efyp.c(intent, efwoVar);
        e(context, intent, 10);
    }

    @Override // defpackage.daau
    public final void b(efwo efwoVar, Context context, int i, ConversationIdType conversationIdType, boolean z) {
        Intent intentD = d(context, i, conversationIdType, z);
        efyp.c(intentD, efwoVar);
        e(context, intentD, i);
    }

    @Override // defpackage.daau
    public final void c(efwo efwoVar, Context context, ConversationIdType conversationIdType) {
        Intent intentD = d(context, 19, conversationIdType, false);
        efyp.c(intentD, efwoVar);
        intentD.putExtra("search_filter_data_item", ((dach) this.a.b()).b(new SearchQuery.ContentSearchFilter(2)));
        intentD.putExtra("skip_back_press", true);
        e(context, intentD, 19);
    }

    public final Intent d(Context context, int i, ConversationIdType conversationIdType, boolean z) {
        SearchQuery.ConversationSearchFilter conversationSearchFilter = new SearchQuery.ConversationSearchFilter(conversationIdType);
        eygg eyggVar = this.a;
        ConversationFilterDataItem conversationFilterDataItemC = ((dach) eyggVar.b()).c(conversationSearchFilter);
        Intent intent = new Intent(context, (Class<?>) ZeroStateSearchActivity.class);
        intent.putExtra("base_search_filter_data_item", conversationFilterDataItemC);
        boolean z2 = true;
        intent.putExtra("conversation_contain_message", true);
        intent.putExtra("is_bubble_activity", false);
        if (z) {
            if (i != 18 && i != 15) {
                z2 = false;
            }
            intent.putExtra("search_filter_data_item", ((dach) eyggVar.b()).f(z2));
        }
        return intent;
    }
}
