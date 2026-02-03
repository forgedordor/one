package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecm implements ecj {
    @Override // defpackage.eci
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.eci
    public final void b(kio kioVar, int i, int[] iArr, kji kjiVar, int[] iArr2) {
        if (kjiVar == kji.a) {
            ecr.f(i, iArr, iArr2, false);
        } else {
            ecr.f(i, iArr, iArr2, true);
        }
    }

    public final String toString() {
        return "Arrangement#SpaceEvenly";
    }

    @Override // defpackage.ecq
    public final void b(kio kioVar, int i, int[] iArr, int[] iArr2) {
        ecr.f(i, iArr, iArr2, false);
    }
}
