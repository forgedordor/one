package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rof extends rok {
    @Override // defpackage.rok
    public final float a(int i, int i2, int i3, int i4) {
        int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
        return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
    }

    @Override // defpackage.rok
    public final int b(int i, int i2, int i3, int i4) {
        return 1;
    }
}
