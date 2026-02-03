package defpackage;

import android.view.View;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufd implements eyif {
    public static BadgesRecyclerView a(View view) {
        if (!(view instanceof BadgesRecyclerView)) {
            throw new IllegalStateException(a.L(view, ufa.class, "Attempt to inject a View wrapper of type "));
        }
        BadgesRecyclerView badgesRecyclerView = (BadgesRecyclerView) view;
        badgesRecyclerView.getClass();
        return badgesRecyclerView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
