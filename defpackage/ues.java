package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ues extends vx {
    private final cssf a;
    private final int b;
    private final int c;
    private final int d;

    public ues(Context context, cssf cssfVar) {
        this.a = cssfVar;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.badge_in_group_margin);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.badge_between_groups_margin);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.badge_edge_margin);
    }

    private static boolean c(RecyclerView recyclerView, int i, int i2) {
        vo voVar = recyclerView.n;
        wb wbVar = recyclerView.o;
        if (voVar != null && wbVar != null && voVar.a() > i2) {
            View viewT = wbVar.T(i);
            View viewT2 = wbVar.T(i2);
            return viewT == null || viewT2 == null || ((ufe) recyclerView.j(viewT)).a().h == ((ufe) recyclerView.j(viewT2)).a().h;
        }
        return true;
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        wb wbVar = recyclerView.o;
        int iD = recyclerView.d(view);
        if (this.a.e()) {
            if (wbVar != null && iD == wbVar.au() - 1) {
                rect.left = this.d;
            }
            if (iD == 0) {
                rect.right = this.d;
                return;
            } else {
                rect.right = c(recyclerView, iD, iD + (-1)) ? this.b : this.c;
                return;
            }
        }
        if (wbVar != null && iD == wbVar.au() - 1) {
            rect.right = this.d;
        }
        if (iD == 0) {
            rect.left = this.d;
        } else {
            rect.left = c(recyclerView, iD + (-1), iD) ? this.b : this.c;
        }
    }
}
