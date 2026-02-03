package defpackage;

import com.google.android.gms.time.trustedtime.dto.ParcelableClockAdjustmentPeriod;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deir implements degx {
    private final deib a;

    public deir(deib deibVar) {
        deibVar.getClass();
        this.a = deibVar;
    }

    static long[] b(List list, long j) {
        boolean z;
        Iterator it;
        if (list.isEmpty()) {
            return new long[]{0, 0};
        }
        long jC = 0;
        boolean z2 = true;
        long[] jArr = {0, 0};
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ParcelableClockAdjustmentPeriod parcelableClockAdjustmentPeriod = (ParcelableClockAdjustmentPeriod) it2.next();
            if (Math.abs(jC) >= Math.abs(j)) {
                break;
            }
            long jA = parcelableClockAdjustmentPeriod.a.a();
            if (Math.abs(jC) < Math.abs(jA)) {
                if (Math.abs(jA) >= Math.abs(j)) {
                    break;
                }
                jC = jA;
            }
            long jA2 = parcelableClockAdjustmentPeriod.c.a();
            long jA3 = parcelableClockAdjustmentPeriod.d.a();
            long jA4 = parcelableClockAdjustmentPeriod.b.a();
            long jA5 = dejc.a(jC, jA4);
            if (Math.abs(jA5) > Math.abs(j)) {
                z = z2;
                it = it2;
                jC = dejc.c(j, jC);
                double d = jC / jA4;
                jArr[0] = jArr[0] + ((int) (jA2 * d));
                jArr[z ? 1 : 0] = jArr[z ? 1 : 0] + ((int) (jA3 * d));
            } else {
                z = z2;
                it = it2;
                jArr[0] = jArr[0] + jA2;
                jArr[z ? 1 : 0] = jArr[z ? 1 : 0] + jA3;
                jC = jA5;
            }
            it2 = it;
            z2 = z;
        }
        return jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    @Override // defpackage.degx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.degv a() {
        /*
            r15 = this;
            deib r0 = r15.a
            degq r1 = r0.c
            deia r2 = r1.a
            long r3 = android.os.SystemClock.elapsedRealtime()
            degq r10 = new degq
            r10.<init>(r2, r3)
            long r3 = r2.a(r1, r10)
            com.google.android.gms.time.dto.ParcelableInstant r5 = r0.b
            long r6 = r5.a
            int r5 = r5.b
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r12 = 1000000(0xf4240, float:1.401298E-39)
            int r5 = r5 / r12
            if (r11 >= 0) goto L2a
            if (r5 <= 0) goto L2a
            r11 = 1
            long r6 = r6 + r11
            int r5 = r5 + (-1000)
        L2a:
            r11 = 1000(0x3e8, double:4.94E-321)
            long r6 = defpackage.dejc.b(r6, r11)
            long r11 = (long) r5
            long r6 = r6 + r11
            long r5 = defpackage.dejc.a(r6, r3)
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            r11 = 1
            r12 = 0
            if (r7 <= 0) goto L43
            ekgb r7 = r0.d
            long[] r3 = b(r7, r3)
            goto L53
        L43:
            if (r7 >= 0) goto L4c
            ekgb r7 = r0.e
            long[] r3 = b(r7, r3)
            goto L53
        L4c:
            r3 = 2
            long[] r3 = new long[r3]
            r3[r12] = r8
            r3[r11] = r8
        L53:
            r7 = r3[r12]
            r11 = r3[r11]
            long r7 = defpackage.dejc.a(r5, r7)
            deia r3 = r10.a
            if (r2 != r3) goto Lb4
            r3 = r2
            dehs r3 = (defpackage.dehs) r3
            java.lang.Long r4 = r3.a
            r5 = 0
            if (r4 != 0) goto L69
        L67:
            r1 = r5
            goto L8d
        L69:
            long r1 = r2.a(r1, r10)
            long r1 = java.lang.Math.abs(r1)
            int r3 = r3.b
            if (r3 != 0) goto L7d
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 <= 0) goto L7d
            goto L67
        L7d:
            long r3 = r4.longValue()
            long r1 = defpackage.dejc.b(r3, r1)
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L8d:
            if (r1 == 0) goto Lac
            com.google.android.gms.time.dto.ParcelableDuration r0 = r0.a
            long r2 = r0.a()
            long r0 = r1.longValue()
            long r0 = defpackage.dejc.a(r0, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r2.getClass()
            long r0 = defpackage.dejc.a(r0, r11)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        Lac:
            r9 = r5
            degv r5 = new degv
            r6 = r15
            r5.<init>(r6, r7, r9, r10)
            return r5
        Lb4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Ticks must be from the same origin"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deir.a():degv");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((deir) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "TimeSignalAdapter{internalTimeSignal=" + this.a.toString() + "}";
    }
}
