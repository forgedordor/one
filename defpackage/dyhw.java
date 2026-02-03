package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhw extends dyhs {
    public Drawable a;
    public View.OnClickListener b;
    public dyhv c;
    public lvv d;
    private int e;
    private int f;
    private String g;
    private int h;
    private boolean i;
    private dyhr j;
    private ejwi k;
    private ejwi l;
    private byte m;

    public dyhw() {
        ejud ejudVar = ejud.a;
        this.k = ejudVar;
        this.l = ejudVar;
    }

    @Override // defpackage.dyhs
    public final dyhu a() {
        String str;
        View.OnClickListener onClickListener;
        dyhr dyhrVar;
        if (this.m == 15 && (str = this.g) != null && (onClickListener = this.b) != null && (dyhrVar = this.j) != null) {
            return new dyhx(this.e, this.a, this.f, str, this.h, onClickListener, this.c, this.d, this.i, dyhrVar, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.m & 1) == 0) {
            sb.append(" id");
        }
        if ((this.m & 2) == 0) {
            sb.append(" iconResId");
        }
        if (this.g == null) {
            sb.append(" label");
        }
        if ((this.m & 4) == 0) {
            sb.append(" veId");
        }
        if (this.b == null) {
            sb.append(" onClickListener");
        }
        if ((this.m & 8) == 0) {
            sb.append(" visibleOnIncognito");
        }
        if (this.j == null) {
            sb.append(" actionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyhs
    public final void c(dyhr dyhrVar) {
        if (dyhrVar == null) {
            throw new NullPointerException("Null actionType");
        }
        this.j = dyhrVar;
    }

    @Override // defpackage.dyhs
    public final void d(ejwi ejwiVar) {
        this.k = ejwiVar;
    }

    @Override // defpackage.dyhs
    public final void e(int i) {
        this.f = i;
        this.m = (byte) (this.m | 2);
    }

    @Override // defpackage.dyhs
    public final void f(int i) {
        this.e = i;
        this.m = (byte) (this.m | 1);
    }

    @Override // defpackage.dyhs
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.g = str;
    }

    @Override // defpackage.dyhs
    public final void h(int i) {
        this.h = i;
        this.m = (byte) (this.m | 4);
    }

    @Override // defpackage.dyhs
    public final void i(boolean z) {
        this.i = z;
        this.m = (byte) (this.m | 8);
    }

    public dyhw(dyhu dyhuVar) {
        ejud ejudVar = ejud.a;
        this.k = ejudVar;
        this.l = ejudVar;
        dyhx dyhxVar = (dyhx) dyhuVar;
        this.e = dyhxVar.a;
        this.a = dyhxVar.b;
        this.f = dyhxVar.c;
        this.g = dyhxVar.d;
        this.h = dyhxVar.e;
        this.b = dyhxVar.f;
        this.c = dyhxVar.g;
        this.d = dyhxVar.h;
        this.i = dyhxVar.i;
        this.j = dyhxVar.j;
        this.k = dyhxVar.k;
        this.l = dyhxVar.l;
        this.m = (byte) 15;
    }
}
