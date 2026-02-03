package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rtp implements rua {
    private final int a;
    private final int b;
    public rte c;

    public rtp() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.rua
    public final void d(rtz rtzVar) {
        rtzVar.g(this.a, this.b);
    }

    @Override // defpackage.rua
    public final rte eW() {
        return this.c;
    }

    @Override // defpackage.rua
    public final void h(rte rteVar) {
        this.c = rteVar;
    }

    public rtp(int i, int i2) {
        if (!rvk.p(i, i2)) {
            throw new IllegalArgumentException(a.s(i2, i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.rrx
    public final void m() {
    }

    @Override // defpackage.rrx
    public final void n() {
    }

    @Override // defpackage.rrx
    public final void o() {
    }

    @Override // defpackage.rua
    public void a(Drawable drawable) {
    }

    @Override // defpackage.rua
    public void f(Drawable drawable) {
    }

    @Override // defpackage.rua
    public final void g(rtz rtzVar) {
    }
}
