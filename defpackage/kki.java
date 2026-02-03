package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kki implements ixm {
    final /* synthetic */ kkt a;
    final /* synthetic */ jcr b;

    public kki(kkt kktVar, jcr jcrVar) {
        this.a = kktVar;
        this.b = jcrVar;
    }

    private final int f(int i) {
        kkt kktVar = this.a;
        kktVar.measure(kkt.m(0, i, kktVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return kktVar.getMeasuredHeight();
    }

    private final int g(int i) {
        kkt kktVar = this.a;
        kktVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), kkt.m(0, i, kktVar.getLayoutParams().height));
        return kktVar.getMeasuredWidth();
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        return f(i);
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        return g(i);
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        return f(i);
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        return g(i);
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        kkt kktVar = this.a;
        if (kktVar.getChildCount() == 0) {
            return ixpVar.ej(kil.d(j), kil.c(j), fcvp.a, kkg.a);
        }
        if (kil.d(j) != 0) {
            kktVar.getChildAt(0).setMinimumWidth(kil.d(j));
        }
        if (kil.c(j) != 0) {
            kktVar.getChildAt(0).setMinimumHeight(kil.c(j));
        }
        kktVar.measure(kkt.m(kil.d(j), kil.b(j), kktVar.getLayoutParams().width), kkt.m(kil.c(j), kil.a(j), kktVar.getLayoutParams().height));
        return ixpVar.ej(kktVar.getMeasuredWidth(), kktVar.getMeasuredHeight(), fcvp.a, new kkh(kktVar, this.b));
    }
}
