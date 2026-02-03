package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diry implements ikp {
    @Override // defpackage.ikp
    public final /* bridge */ /* synthetic */ ijz a(long j, kji kjiVar, kio kioVar) {
        kjiVar.getClass();
        kioVar.getClass();
        int i = (int) (4294967295L & j);
        float fIntBitsToFloat = Float.intBitsToFloat(i) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / 4.0f;
        kji kjiVar2 = kji.a;
        float fIntBitsToFloat3 = kjiVar == kjiVar2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (j >> 32)) - fIntBitsToFloat;
        float fIntBitsToFloat4 = kjiVar == kjiVar2 ? (Float.intBitsToFloat((int) (j >> 32)) - dlss.a(8)) - fIntBitsToFloat : dlss.a(8) + fIntBitsToFloat;
        float fIntBitsToFloat5 = kjiVar == kji.b ? fIntBitsToFloat2 : Float.intBitsToFloat((int) (j >> 32)) - fIntBitsToFloat2;
        iik iikVar = new iik((byte[]) null);
        iikVar.k();
        float f = fIntBitsToFloat + fIntBitsToFloat;
        ikc.a(iikVar, new ihu(fIntBitsToFloat3 - fIntBitsToFloat, 0.0f, fIntBitsToFloat3 + fIntBitsToFloat, f));
        ikc.a(iikVar, new ihu(fIntBitsToFloat4 - fIntBitsToFloat, 0.0f, fIntBitsToFloat + fIntBitsToFloat4, f));
        iikVar.s(new ihu(Math.min(fIntBitsToFloat3, fIntBitsToFloat4), 0.0f, Math.max(fIntBitsToFloat3, fIntBitsToFloat4), Float.intBitsToFloat(i)));
        ikc.a(iikVar, new ihu(fIntBitsToFloat5 - fIntBitsToFloat2, 0.0f, fIntBitsToFloat5 + fIntBitsToFloat2, fIntBitsToFloat2 + fIntBitsToFloat2));
        iikVar.c();
        return new ijw(iikVar);
    }
}
