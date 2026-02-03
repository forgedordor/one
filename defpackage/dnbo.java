package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbo extends vo {
    public static final /* synthetic */ fdeh[] a;
    public int d;
    public final fdcz e = new dnbn(this);

    static {
        fdbv fdbvVar = new fdbv(dnbo.class, "view", "getView()Landroid/view/View;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    @Override // defpackage.vo
    public final int a() {
        return this.d;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return 1;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        View view = (View) this.e.c(a[0]);
        if (view == null) {
            throw new IllegalStateException("View must be set before this adapter gets invoked");
        }
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new dnbm(view);
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        wvVar.getClass();
    }
}
