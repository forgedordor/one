package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pje {
    public static final pjb a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            pjb pjbVar = tag instanceof pjb ? (pjb) tag : null;
            if (pjbVar != null) {
                return pjbVar;
            }
            Object objA = lib.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, pjb pjbVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, pjbVar);
    }
}
