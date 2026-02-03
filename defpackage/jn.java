package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jn extends lfp {
    final /* synthetic */ jo a;

    public jn(jo joVar) {
        this.a = joVar;
    }

    @Override // defpackage.lfp, defpackage.lfo
    public final void a() {
        jz jzVar = this.a.a;
        jzVar.s.setVisibility(8);
        PopupWindow popupWindow = jzVar.t;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (jzVar.s.getParent() instanceof View) {
            View view = (View) jzVar.s.getParent();
            int[] iArr = ley.a;
            lel.c(view);
        }
        jzVar.s.i();
        jzVar.v.d(null);
        jzVar.v = null;
        ViewGroup viewGroup = jzVar.y;
        int[] iArr2 = ley.a;
        lel.c(viewGroup);
    }
}
