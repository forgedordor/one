package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbx extends fdbr implements fdae {
    final /* synthetic */ dcf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbx(dcf dcfVar) {
        super(0);
        this.a = dcfVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        cuz cuzVar = this.a.i;
        Object[] objArr = cuzVar.b;
        Object[] objArr2 = cuzVar.c;
        long[] jArr = cuzVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i == length) {
                        break;
                    }
                    i++;
                } else {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 >= i4) {
                            if (i4 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                Object obj = objArr[i5];
                                if (((dbl) objArr2[i5]).l()) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                            i3++;
                        }
                    }
                }
            }
        }
        return fctx.a;
    }
}
