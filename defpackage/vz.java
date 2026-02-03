package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vz implements zo {
    final /* synthetic */ wb a;

    public vz(wb wbVar) {
        this.a = wbVar;
    }

    @Override // defpackage.zo
    public final int a(View view) {
        return wb.bo(view) + ((wc) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.zo
    public final int b(View view) {
        return wb.bt(view) - ((wc) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.zo
    public final int c() {
        wb wbVar = this.a;
        return wbVar.I - wbVar.ay();
    }

    @Override // defpackage.zo
    public final int d() {
        return this.a.aB();
    }

    @Override // defpackage.zo
    public final View e(int i) {
        return this.a.aE(i);
    }
}
