package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euni extends ActionMode.Callback2 {
    final ActionMode.Callback a;
    private final eund b;
    private final boolean c;

    public euni(eund eundVar, ActionMode.Callback callback, boolean z) {
        this.b = eundVar;
        this.a = callback;
        this.c = z;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ActionMode.Callback callback = this.a;
        return callback != null && callback.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode.getType() != 1) {
            return this.a.onCreateActionMode(actionMode, menu);
        }
        if (!this.c) {
            ActionMode.Callback callback = this.a;
            boolean z = callback == null;
            if (callback == null || callback.onCreateActionMode(actionMode, menu)) {
                StringBuilder sb = new StringBuilder("ActionModeCallback: Dismissing toolbar. hasCallback=");
                sb.append(!z);
                eunn.c(sb.toString());
                eunn.b(this.b);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ActionMode.Callback callback = this.a;
        if (callback != null) {
            callback.onDestroyActionMode(actionMode);
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        ActionMode.Callback callback = this.a;
        if (callback instanceof ActionMode.Callback2) {
            ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        this.b.c();
        ActionMode.Callback callback = this.a;
        return callback == null || callback.onPrepareActionMode(actionMode, menu);
    }
}
