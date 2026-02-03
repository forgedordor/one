package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dxuo extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evgp evgpVar = (evgp) obj;
        int iOrdinal = evgpVar.ordinal();
        if (iOrdinal == 0) {
            return dxug.a;
        }
        if (iOrdinal == 1) {
            return dxug.b;
        }
        if (iOrdinal == 2) {
            return dxug.c;
        }
        if (iOrdinal == 3) {
            return dxug.d;
        }
        if (iOrdinal == 4) {
            return dxug.e;
        }
        if (iOrdinal == 5) {
            return dxug.f;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evgpVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        dxug dxugVar = (dxug) obj;
        int iOrdinal = dxugVar.ordinal();
        if (iOrdinal == 0) {
            return evgp.DEFAULT;
        }
        if (iOrdinal == 1) {
            return evgp.TV;
        }
        if (iOrdinal == 2) {
            return evgp.WEARABLE;
        }
        if (iOrdinal == 3) {
            return evgp.AUTOMOTIVE;
        }
        if (iOrdinal == 4) {
            return evgp.BATTLESTAR;
        }
        if (iOrdinal == 5) {
            return evgp.CHROME_OS;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(dxugVar.toString()));
    }
}
