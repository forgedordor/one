package defpackage;

import android.view.View;
import com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionSelectionDialogRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unq implements eyif {
    public static ReactionSelectionDialogRecyclerView a(View view) {
        if (!(view instanceof ReactionSelectionDialogRecyclerView)) {
            throw new IllegalStateException(a.L(view, unn.class, "Attempt to inject a View wrapper of type "));
        }
        ReactionSelectionDialogRecyclerView reactionSelectionDialogRecyclerView = (ReactionSelectionDialogRecyclerView) view;
        reactionSelectionDialogRecyclerView.getClass();
        return reactionSelectionDialogRecyclerView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
