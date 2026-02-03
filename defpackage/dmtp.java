package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.view.PreviewView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmtp extends fdcy {
    final /* synthetic */ dmtr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmtp(dmtr dmtrVar) {
        super(null);
        this.a = dmtrVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dmiu dmiuVar = (dmiu) obj2;
        dmtr dmtrVar = this.a;
        boolean zD = dmtrVar.x.d(dngy.a);
        boolean z = false;
        if (dmiuVar != null && dmiuVar.b && zD) {
            z = true;
        }
        dmtrVar.J(z);
        String str = true != fdbq.f(dmiuVar, dmis.a) ? null : "1:1";
        PreviewView previewView = dmtrVar.B;
        previewView.getClass();
        ViewGroup.LayoutParams layoutParams = previewView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        kte kteVar = (kte) layoutParams;
        kteVar.I = str;
        previewView.setLayoutParams(kteVar);
        int i = str != null ? -2 : -1;
        previewView.getClass();
        fdfr fdfrVar = new fdfr(new fdfs(lfj.a(previewView), new dmto(dmtrVar)));
        while (fdfrVar.hasNext()) {
            Object obj3 = (ViewParent) fdfrVar.next();
            View view = obj3 instanceof View ? (View) obj3 : null;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = i;
                view.setLayoutParams(layoutParams2);
            }
        }
        View view2 = dmtrVar.a;
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = i;
        view2.setLayoutParams(layoutParams3);
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
