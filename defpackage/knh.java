package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knh extends lfs {
    final /* synthetic */ knj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knh(knj knjVar) {
        super(1);
        this.a = knjVar;
    }

    @Override // defpackage.lfs
    public final lfr b(lgb lgbVar, lfr lfrVar) {
        knj knjVar = this.a;
        if (!knjVar.c) {
            int i = 0;
            View childAt = knjVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, knjVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, knjVar.getHeight() - childAt.getBottom());
            if (iMax != 0) {
                i = iMax;
            } else if (iMax2 == 0) {
                if (iMax3 != 0) {
                    iMax2 = 0;
                } else if (iMax4 != 0) {
                    iMax2 = 0;
                    iMax3 = 0;
                }
            }
            kzc kzcVar = lfrVar.a;
            kzc kzcVarD = kzc.d(i, iMax2, iMax3, iMax4);
            int i2 = kzcVarD.b;
            int i3 = kzcVarD.c;
            int i4 = kzcVarD.d;
            int i5 = kzcVarD.e;
            return new lfr(lgt.i(kzcVar, i2, i3, i4, i5), lgt.i(lfrVar.b, i2, i3, i4, i5));
        }
        return lfrVar;
    }

    @Override // defpackage.lfs
    public final lgt c(lgt lgtVar, List list) {
        knj knjVar = this.a;
        if (knjVar.c) {
            return lgtVar;
        }
        int i = 0;
        View childAt = knjVar.getChildAt(0);
        int iMax = Math.max(0, childAt.getLeft());
        int iMax2 = Math.max(0, childAt.getTop());
        int iMax3 = Math.max(0, knjVar.getWidth() - childAt.getRight());
        int iMax4 = Math.max(0, knjVar.getHeight() - childAt.getBottom());
        if (iMax != 0) {
            i = iMax;
        } else if (iMax2 == 0) {
            if (iMax3 != 0) {
                iMax2 = 0;
            } else {
                if (iMax4 == 0) {
                    return lgtVar;
                }
                iMax2 = 0;
                iMax3 = 0;
            }
        }
        return lgtVar.n(i, iMax2, iMax3, iMax4);
    }
}
