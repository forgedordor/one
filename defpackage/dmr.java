package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmr implements ikp {
    public static final dmr a = new dmr();

    private dmr() {
    }

    @Override // defpackage.ikp
    public final ijz a(long j, kji kjiVar, kio kioVar) {
        float fEp = kioVar.ep(30.0f);
        return new ijx(new ihu(0.0f, -fEp, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)) + fEp));
    }
}
