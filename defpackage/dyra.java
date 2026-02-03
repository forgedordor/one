package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyra {
    public static void a(RecyclerView recyclerView, vo voVar) {
        dyqz dyqzVar = new dyqz(recyclerView, voVar);
        int[] iArr = ley.a;
        if (recyclerView.isAttachedToWindow()) {
            dyqzVar.onViewAttachedToWindow(recyclerView);
        }
        recyclerView.addOnAttachStateChangeListener(dyqzVar);
    }
}
