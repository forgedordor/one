package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class rty extends rtn {
    private final int a;
    private final int b;

    public rty(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.rua
    public final void d(rtz rtzVar) {
        int i = this.a;
        int i2 = this.b;
        if (!rvk.p(i, i2)) {
            throw new IllegalArgumentException(a.z(i2, i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: ", ", either provide dimensions in the constructor or call override()"));
        }
        rtzVar.g(i, i2);
    }

    @Override // defpackage.rua
    public final void g(rtz rtzVar) {
    }
}
