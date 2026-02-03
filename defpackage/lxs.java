package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxs {
    public static final lxq a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            lxq lxqVar = tag instanceof lxq ? (lxq) tag : null;
            if (lxqVar != null) {
                return lxqVar;
            }
            Object objA = lib.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, lxq lxqVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, lxqVar);
    }
}
