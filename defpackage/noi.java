package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noi implements noq {
    public final mfg a;
    public final mfg b;
    public final long c;

    public noi(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        mee.a(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.a = new mfg(length2);
            this.b = new mfg(length2);
        } else {
            int i = length2 + 1;
            mfg mfgVar = new mfg(i);
            this.a = mfgVar;
            mfg mfgVar2 = new mfg(i);
            this.b = mfgVar2;
            mfgVar.b(0L);
            mfgVar2.b(0L);
        }
        this.a.c(jArr);
        this.b.c(jArr2);
        this.c = j;
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        mfg mfgVar = this.b;
        if (mfgVar.a == 0) {
            nor norVar = nor.a;
            return new noo(norVar, norVar);
        }
        String str = mgb.a;
        int i = mfgVar.a - 1;
        int i2 = 0;
        int i3 = 0;
        while (i3 <= i) {
            int i4 = (i3 + i) >>> 1;
            if (mfgVar.a(i4) < j) {
                i3 = i4 + 1;
            } else {
                i = i4 - 1;
            }
        }
        int i5 = i + 1;
        if (i5 < mfgVar.a && mfgVar.a(i5) == j) {
            i2 = i5;
        } else if (i != -1) {
            i2 = i;
        }
        long jA = mfgVar.a(i2);
        mfg mfgVar2 = this.a;
        nor norVar2 = new nor(jA, mfgVar2.a(i2));
        if (norVar2.b == j || i2 == mfgVar.a - 1) {
            return new noo(norVar2, norVar2);
        }
        int i6 = i2 + 1;
        return new noo(norVar2, new nor(mfgVar.a(i6), mfgVar2.a(i6)));
    }

    @Override // defpackage.noq
    public final long w() {
        return this.c;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return this.b.a > 0;
    }
}
