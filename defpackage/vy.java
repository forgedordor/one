package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vy implements zo {
    final /* synthetic */ wb a;

    public vy(wb wbVar) {
        this.a = wbVar;
    }

    @Override // defpackage.zo
    public final int a(View view) {
        return wb.bs(view) + ((wc) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.zo
    public final int b(View view) {
        return wb.bp(view) - ((wc) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.zo
    public final int c() {
        wb wbVar = this.a;
        return wbVar.H - wbVar.aA();
    }

    @Override // defpackage.zo
    public final int d() {
        return this.a.az();
    }

    @Override // defpackage.zo
    public final View e(int i) {
        return this.a.aE(i);
    }
}
