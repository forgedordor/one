package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecye {
    public static final hpt a = new hsg(new fdae() { // from class: ecya
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = ecye.a;
            throw new IllegalStateException("please provide LocalVisualElements CompositionLocal from your top-level composable");
        }
    });
    public static final hpt b = new hsg(new fdae() { // from class: ecyb
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = ecye.a;
            throw new IllegalStateException("please provide LocalInteractionLogger CompositionLocal from your top-level composable");
        }
    });

    public static final void a(int i, final fdau fdauVar, hml hmlVar, final int i2) {
        int i3;
        final int i4;
        fdauVar.getClass();
        int i5 = i2 & 6;
        hml hmlVarC = hmlVar.c(1236634007);
        if (i5 == 0) {
            i3 = (true != hmlVarC.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            i4 = i;
        } else {
            i4 = i;
            ((dswt) hmlVarC.e(a)).b(i4, null, null, null, hxe.d(417555649, new ecyd(fdauVar, (dsvh) hmlVarC.e(b)), hmlVarC), hmlVarC, (i3 & 14) | 12582912, 126);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ecyc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i2;
                    int i7 = i4;
                    int iA = hpy.a(i6 | 1);
                    ecye.a(i7, fdauVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }
}
