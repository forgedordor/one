package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vb extends vc {
    public vb(wb wbVar) {
        super(wbVar);
    }

    @Override // defpackage.vc
    public final int a(View view) {
        return wb.bo(view) + ((wc) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.vc
    public final int b(View view) {
        wc wcVar = (wc) view.getLayoutParams();
        return wb.bq(view) + wcVar.topMargin + wcVar.bottomMargin;
    }

    @Override // defpackage.vc
    public final int c(View view) {
        wc wcVar = (wc) view.getLayoutParams();
        return wb.br(view) + wcVar.leftMargin + wcVar.rightMargin;
    }

    @Override // defpackage.vc
    public final int d(View view) {
        return wb.bt(view) - ((wc) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.vc
    public final int e() {
        return this.a.I;
    }

    @Override // defpackage.vc
    public final int f() {
        wb wbVar = this.a;
        return wbVar.I - wbVar.ay();
    }

    @Override // defpackage.vc
    public final int g() {
        return this.a.ay();
    }

    @Override // defpackage.vc
    public final int h() {
        return this.a.G;
    }

    @Override // defpackage.vc
    public final int i() {
        return this.a.F;
    }

    @Override // defpackage.vc
    public final int j() {
        return this.a.aB();
    }

    @Override // defpackage.vc
    public final int k() {
        wb wbVar = this.a;
        return (wbVar.I - wbVar.aB()) - wbVar.ay();
    }

    @Override // defpackage.vc
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bv(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.vc
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bv(view, rect);
        return rect.top;
    }

    @Override // defpackage.vc
    public final void n(int i) {
        this.a.aR(i);
    }
}
