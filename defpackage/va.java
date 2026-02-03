package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class va extends vc {
    public va(wb wbVar) {
        super(wbVar);
    }

    @Override // defpackage.vc
    public final int a(View view) {
        return wb.bs(view) + ((wc) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.vc
    public final int b(View view) {
        wc wcVar = (wc) view.getLayoutParams();
        return wb.br(view) + wcVar.leftMargin + wcVar.rightMargin;
    }

    @Override // defpackage.vc
    public final int c(View view) {
        wc wcVar = (wc) view.getLayoutParams();
        return wb.bq(view) + wcVar.topMargin + wcVar.bottomMargin;
    }

    @Override // defpackage.vc
    public final int d(View view) {
        return wb.bp(view) - ((wc) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.vc
    public final int e() {
        return this.a.H;
    }

    @Override // defpackage.vc
    public final int f() {
        wb wbVar = this.a;
        return wbVar.H - wbVar.aA();
    }

    @Override // defpackage.vc
    public final int g() {
        return this.a.aA();
    }

    @Override // defpackage.vc
    public final int h() {
        return this.a.F;
    }

    @Override // defpackage.vc
    public final int i() {
        return this.a.G;
    }

    @Override // defpackage.vc
    public final int j() {
        return this.a.az();
    }

    @Override // defpackage.vc
    public final int k() {
        wb wbVar = this.a;
        return (wbVar.H - wbVar.az()) - wbVar.aA();
    }

    @Override // defpackage.vc
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bv(view, rect);
        return rect.right;
    }

    @Override // defpackage.vc
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bv(view, rect);
        return rect.left;
    }

    @Override // defpackage.vc
    public final void n(int i) {
        this.a.aQ(i);
    }
}
