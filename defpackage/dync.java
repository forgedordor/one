package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dync extends dxzd {
    private final dyja b;
    private final dxxk c;
    private final ejwi d;

    public dync(dyja dyjaVar, dxxk dxxkVar, Drawable drawable) {
        this.b = dyjaVar;
        this.c = dxxkVar;
        this.d = ejwi.j(new dxyf(drawable, null, dxza.OBAKE));
    }

    @Override // defpackage.dxzd
    protected final void a(Object obj) {
        Object objJ;
        ecem.c();
        if (this.b.a(obj, this.c)) {
            dxyg dxygVar = new dxyg();
            dxygVar.a = this.d;
            objJ = ejwi.j(dxygVar.a());
        } else {
            objJ = ejud.a;
        }
        this.a.m(objJ);
    }
}
