package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpu implements ikp {
    public static final dpu a = new dpu();

    private dpu() {
    }

    @Override // defpackage.ikp
    public final ijz a(long j, kji kjiVar, kio kioVar) {
        float fEp = kioVar.ep(30.0f);
        return new ijx(new ihu(-fEp, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fEp, Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
