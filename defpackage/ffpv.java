package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffpv {
    static void a(byte[] bArr, ffil ffilVar) {
        ffilVar.e(bArr, 0, bArr.length);
    }

    static void b(short s, ffil ffilVar) {
        ffilVar.d((byte) (s >>> 8));
        ffilVar.d((byte) s);
    }

    static void c(int i, ffil ffilVar) {
        ffilVar.d((byte) (i >> 24));
        ffilVar.d((byte) (i >>> 16));
        ffilVar.d((byte) (i >>> 8));
        ffilVar.d((byte) i);
    }
}
