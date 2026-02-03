package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwr implements ixn {
    final /* synthetic */ iwy a;
    final /* synthetic */ int b;
    final /* synthetic */ ixn c;
    private final /* synthetic */ ixn d;

    public iwr(ixn ixnVar, iwy iwyVar, int i, ixn ixnVar2) {
        this.a = iwyVar;
        this.b = i;
        this.c = ixnVar2;
        this.d = ixnVar;
    }

    @Override // defpackage.ixn
    public final int j() {
        return this.d.j();
    }

    @Override // defpackage.ixn
    public final int k() {
        return this.d.k();
    }

    @Override // defpackage.ixn
    public final Map m() {
        return this.d.m();
    }

    @Override // defpackage.ixn
    public final fdap n() {
        return this.d.n();
    }

    @Override // defpackage.ixn
    public final void o() {
        int i;
        iwy iwyVar = this.a;
        iwyVar.e = this.b;
        this.c.o();
        cuz cuzVar = iwyVar.k;
        long[] jArr = cuzVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = cuzVar.b[i5];
                        izh izhVar = (izh) cuzVar.c[i5];
                        int iA = iwyVar.l.a(obj);
                        if (iA < 0 || iA >= iwyVar.e) {
                            izhVar.b();
                            cuzVar.c(i5);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }
}
