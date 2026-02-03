package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzwb extends dzwd {
    private final Random b;
    private final long c;
    private final dzvm d;
    private final eony e;

    public dzwb(fehf fehfVar, Random random, dzvm dzvmVar, eony eonyVar) {
        super(fehfVar);
        this.b = random;
        this.c = fehfVar.c;
        this.d = dzvmVar;
        this.e = eonyVar;
    }

    @Override // defpackage.dzwd
    public final long a(String str) {
        long jSqrt;
        if (ejwk.c(str)) {
            jSqrt = this.c;
        } else {
            dzvm dzvmVar = this.d;
            long epochMilli = this.e.a().toEpochMilli() - dzvmVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long jMin = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = dzvmVar.a;
                    int i2 = (int) jMin;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = dzvmVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                dzvmVar.d += j * 14400000;
            }
            int iHashCode = str.hashCode() * dzvmVar.c;
            char cCharAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = iHashCode >>> 24;
            int length = (iHashCode >>> 16) + str.length();
            short[] sArr3 = dzvmVar.a;
            short[] sArr4 = dzvmVar.b;
            int i4 = (i3 + cCharAt) & 255;
            int i5 = length & 255;
            int iMin = Math.min((int) sArr3[i4], (int) sArr4[i5]);
            int i6 = iMin + 1;
            short sMin = (short) Math.min(32767, i6);
            if (sArr3[i4] == iMin) {
                sArr3[i4] = sMin;
            }
            if (sArr4[i5] == iMin) {
                sArr4[i5] = sMin;
            }
            jSqrt = (int) (this.c / (i6 < 50 ? Math.sqrt(i6) : i6));
        }
        if (this.b.nextDouble() * 1000.0d < jSqrt) {
            return jSqrt;
        }
        return -1L;
    }

    @Override // defpackage.dzwd
    public final fehf b(Long l) {
        if (l != null) {
            fehf fehfVar = this.a;
            if (l.longValue() != fehfVar.c) {
                fehc fehcVar = (fehc) fehf.a.createBuilder();
                int iA = fehe.a(fehfVar.d);
                if (iA == 0) {
                    iA = 1;
                }
                fehcVar.copyOnWrite();
                fehf fehfVar2 = (fehf) fehcVar.instance;
                fehfVar2.d = iA - 1;
                fehfVar2.b |= 4;
                long jLongValue = l.longValue();
                fehcVar.copyOnWrite();
                fehf fehfVar3 = (fehf) fehcVar.instance;
                fehfVar3.b |= 2;
                fehfVar3.c = jLongValue;
                return fehcVar.build();
            }
        }
        return this.a;
    }

    @Override // defpackage.dzwd
    public final fehf c(Long l) {
        return d() ? b(l) : e();
    }

    @Override // defpackage.dzwd
    public final boolean d() {
        return this.c > 0;
    }
}
