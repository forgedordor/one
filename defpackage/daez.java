package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daez extends vx {
    private final int a;
    private final int b;

    public daez(Context context) {
        Resources resources = context.getResources();
        this.a = resources.getDimensionPixelSize(R.dimen.zero_state_search_photo_margin);
        this.b = resources.getDimensionPixelSize(R.dimen.zero_state_search_video_margin);
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        vo voVar = recyclerView.n;
        voVar.getClass();
        vo voVar2 = voVar instanceof cvja ? ((cvja) voVar).a : voVar;
        int i = voVar2 instanceof dafd ? this.a : voVar2 instanceof dagz ? this.b : 0;
        wb wbVar = recyclerView.o;
        wbVar.getClass();
        ejwl.a(wbVar instanceof GridLayoutManager);
        int iC = recyclerView.c(view);
        int i2 = ((GridLayoutManager) wbVar).b;
        ejwl.a(i2 > 0);
        int i3 = iC / i2;
        int iA = voVar.a() / i2;
        if (i3 > 0) {
            rect.top = i;
        }
        if (i3 < iA) {
            rect.bottom = i;
        }
        rect.left = i;
        rect.right = i;
    }
}
