package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqd implements lqc {
    public int a = -1;
    public int b = -1;
    private final int c;

    public lqd(int i) {
        this.c = i;
    }

    @Override // defpackage.lqc
    public final boolean b(CharSequence charSequence, int i, int i2, lqq lqqVar) {
        int i3 = this.c;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.a = i;
        this.b = i2;
        return false;
    }

    @Override // defpackage.lqc
    public final /* bridge */ /* synthetic */ Object a() {
        return this;
    }
}
