package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ngw implements ngr {
    private final ArrayList a = new ArrayList();

    private final int g(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((nut) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.ngr
    public final long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((nut) arrayList.get(0)).b) {
            return ((nut) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((nut) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((nut) arrayList.get(i - 1)).d;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((nut) ekis.j(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // defpackage.ngr
    public final long b(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((nut) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((nut) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                nut nutVar = (nut) arrayList.get(i - 1);
                long j3 = nutVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? nutVar.b : j3;
            }
        }
        nut nutVar2 = (nut) ekis.j(arrayList);
        long j4 = nutVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? nutVar2.b : j4;
    }

    @Override // defpackage.ngr
    public final ekgb c(long j) {
        int iG = g(j);
        if (iG == 0) {
            int i = ekgb.d;
            return ekoe.a;
        }
        nut nutVar = (nut) this.a.get(iG - 1);
        long j2 = nutVar.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return nutVar.a;
        }
        int i2 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.ngr
    public final void d() {
        this.a.clear();
    }

    @Override // defpackage.ngr
    public final void e(long j) {
        int iG = g(j);
        if (iG == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        int i = iG - 1;
        long j2 = ((nut) arrayList.get(i)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iG = i;
        }
        arrayList.subList(0, iG).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // defpackage.ngr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.nut r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto Lf
            r4 = r5
            goto L10
        Lf:
            r4 = r6
        L10:
            defpackage.mee.a(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r5
            goto L24
        L23:
            r2 = r6
        L24:
            java.util.ArrayList r3 = r9.a
            int r4 = r3.size()
        L2a:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L50
            java.lang.Object r7 = r3.get(r4)
            nut r7 = (defpackage.nut) r7
            long r7 = r7.b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3f
            int r4 = r4 + r5
            r3.add(r4, r10)
            return r2
        L3f:
            java.lang.Object r7 = r3.get(r4)
            nut r7 = (defpackage.nut) r7
            long r7 = r7.b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4d
            r7 = r6
            goto L4e
        L4d:
            r7 = r5
        L4e:
            r2 = r2 & r7
            goto L2a
        L50:
            r3.add(r6, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngw.f(nut, long):boolean");
    }
}
