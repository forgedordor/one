package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeim implements ldn {
    final /* synthetic */ int a;
    final /* synthetic */ View b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    public eeim(int i, View view, int i2, int i3, int i4) {
        this.a = i;
        this.b = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        int i = this.a;
        kzc kzcVarF = lgtVar.f(519);
        if (i >= 0) {
            View view2 = this.b;
            view2.getLayoutParams().height = i + kzcVarF.c;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.b;
        view3.setPadding(this.c + kzcVarF.b, this.d + kzcVarF.c, this.e + kzcVarF.d, view3.getPaddingBottom());
        return lgtVar;
    }
}
