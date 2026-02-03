package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwy extends dpwq {
    public static final /* synthetic */ int k = 0;
    private final fctc l;

    public dpwy(Context context, dpvi dpviVar, Optional optional, fr frVar, final dpux dpuxVar, dpir dpirVar) {
        super(context, dpviVar, frVar, dpuxVar, dpirVar, ((Boolean) fdct.a(optional, false)).booleanValue());
        this.l = fctd.a(new fdae() { // from class: dpwx
            @Override // defpackage.fdae
            public final Object invoke() {
                int i = dpwy.k;
                return new PopupWindow(dpuxVar.c);
            }
        });
    }

    private final PopupWindow n() {
        return (PopupWindow) this.l.a();
    }

    @Override // defpackage.dpwq
    public final void e() {
        super.e();
        n().dismiss();
    }

    @Override // defpackage.dpwq
    public final void i(int i, boolean z) {
        super.i(i, z);
        n().setHeight(i);
    }

    @Override // defpackage.dpwq
    public final void k(int i, int i2) {
        super.k(i, i2);
        n().setHeight(i2);
        ViewGroup.LayoutParams layoutParams = n().getContentView().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new WindowManager.LayoutParams();
        }
        layoutParams.width = -1;
        layoutParams.height = i2;
        n().getContentView().setLayoutParams(layoutParams);
        n().showAtLocation(this.d.c, 80, 0, i);
    }
}
