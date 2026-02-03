package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edun extends fy {
    final /* synthetic */ eduo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edun(eduo eduoVar, fr frVar) {
        super(frVar);
        this.a = eduoVar;
    }

    @Override // defpackage.fy
    public final ea b(int i) {
        return (ea) ((edtu) this.a.aq.get(i)).g().b();
    }

    @Override // defpackage.fy, defpackage.pou
    public final void f(ViewGroup viewGroup, int i, Object obj) {
        super.f(viewGroup, i, obj);
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            dsvd dsvdVarC = dsvu.c(childAt);
            if (dsvdVarC != null) {
                if (h(childAt, obj)) {
                    if (dsvdVarC.h() == 2) {
                        dsvdVarC.i(1);
                    }
                } else if (dsvdVarC.h() == 1) {
                    dsvdVarC.i(2);
                }
            }
        }
    }

    @Override // defpackage.pou
    public final int j() {
        return this.a.aq.size();
    }

    @Override // defpackage.pou
    public final CharSequence k(int i) {
        eduo eduoVar = this.a;
        return eduoVar.Y(((edtu) eduoVar.aq.get(i)).a());
    }
}
