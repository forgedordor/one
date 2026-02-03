package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxr {
    public static final lvj a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            lvj lvjVar = tag instanceof lvj ? (lvj) tag : null;
            if (lvjVar != null) {
                return lvjVar;
            }
            Object objA = lib.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, lvj lvjVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, lvjVar);
    }
}
