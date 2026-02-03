package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huc {
    public static final void a(hre hreVar, hlw hlwVar, int i) {
        while (true) {
            int i2 = hreVar.s;
            if (i > i2 && i < hreVar.r) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            hreVar.K();
            if (hreVar.T(hreVar.s)) {
                hlwVar.h();
            }
            hreVar.X();
        }
    }
}
