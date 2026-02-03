package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeic extends vx {
    final /* synthetic */ eeih a;
    private final Calendar b = eejd.e();
    private final Calendar c = eejd.e();

    public eeic(eeih eeihVar) {
        this.a = eeihVar;
    }

    @Override // defpackage.vx
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Object obj;
        vo voVar = recyclerView.n;
        if (voVar instanceof eejg) {
            wb wbVar = recyclerView.o;
            if (wbVar instanceof GridLayoutManager) {
                eejg eejgVar = (eejg) voVar;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) wbVar;
                eeih eeihVar = this.a;
                for (lcb lcbVar : eeihVar.a.b()) {
                    Object obj2 = lcbVar.a;
                    if (obj2 != null && (obj = lcbVar.b) != null) {
                        Calendar calendar = this.b;
                        calendar.setTimeInMillis(((Long) obj2).longValue());
                        Calendar calendar2 = this.c;
                        calendar2.setTimeInMillis(((Long) obj).longValue());
                        int iL = eejgVar.l(calendar.get(1));
                        int iL2 = eejgVar.l(calendar2.get(1));
                        View viewT = gridLayoutManager.T(iL);
                        View viewT2 = gridLayoutManager.T(iL2);
                        int i = gridLayoutManager.b;
                        int i2 = iL / i;
                        int i3 = iL2 / i;
                        int i4 = i2;
                        while (i4 <= i3) {
                            View viewT3 = gridLayoutManager.T(gridLayoutManager.b * i4);
                            if (viewT3 != null) {
                                int top = viewT3.getTop() + eeihVar.d.d.b();
                                int bottom = viewT3.getBottom() - eeihVar.d.d.a();
                                int left = 0;
                                if (i4 == i2 && viewT != null) {
                                    left = viewT.getLeft() + (viewT.getWidth() / 2);
                                }
                                canvas.drawRect(left, top, (i4 != i3 || viewT2 == null) ? recyclerView.getWidth() : viewT2.getLeft() + (viewT2.getWidth() / 2), bottom, eeihVar.d.h);
                            }
                            i4++;
                        }
                    }
                }
            }
        }
    }
}
