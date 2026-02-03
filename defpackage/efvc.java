package defpackage;

import android.content.Context;
import android.graphics.PointF;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efvc extends uk {
    final /* synthetic */ SpannedGridLayoutManager f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efvc(SpannedGridLayoutManager spannedGridLayoutManager, Context context) {
        super(context);
        this.f = spannedGridLayoutManager;
    }

    @Override // defpackage.wr
    public final PointF l(int i) {
        SpannedGridLayoutManager spannedGridLayoutManager = this.f;
        return new PointF(0.0f, spannedGridLayoutManager.a.d(i) - spannedGridLayoutManager.f);
    }
}
