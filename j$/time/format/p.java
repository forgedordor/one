package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class p extends j {
    public static final LocalDate h = LocalDate.of(2000, 1, 1);
    public final ChronoLocalDate g;

    public p(TemporalField temporalField, int i, int i2, ChronoLocalDate chronoLocalDate, int i3) {
        super(temporalField, i, i2, D.NOT_NEGATIVE, i3);
        this.g = chronoLocalDate;
    }

    @Override // j$.time.format.j
    public final long a(x xVar, long j) {
        long jAbs = Math.abs(j);
        ChronoLocalDate chronoLocalDate = this.g;
        long j2 = chronoLocalDate != null ? Chronology.CC.a(xVar.a).z(chronoLocalDate).get(this.a) : 0;
        long[] jArr = j.f;
        if (j >= j2) {
            long j3 = jArr[this.b];
            if (j < j2 + j3) {
                return jAbs % j3;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        if (vVar.c) {
            return super.b(vVar);
        }
        return false;
    }

    @Override // j$.time.format.j
    public final int c(v vVar, long j, int i, int i2) {
        final p pVar;
        final v vVar2;
        final long j2;
        final int i3;
        final int i4;
        int i5;
        long j3;
        ChronoLocalDate chronoLocalDate = this.g;
        if (chronoLocalDate != null) {
            i5 = vVar.d().z(chronoLocalDate).get(this.a);
            pVar = this;
            vVar2 = vVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            Consumer consumer = new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.c(vVar2, j2, i3, i4);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            if (vVar2.e == null) {
                vVar2.e = new ArrayList();
            }
            vVar2.e.add(consumer);
        } else {
            pVar = this;
            vVar2 = vVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            i5 = 0;
        }
        int i6 = i4 - i3;
        int i7 = pVar.b;
        if (i6 != i7 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = j.f[i7];
            long j5 = i5;
            long j6 = j5 - (j5 % j4);
            long j7 = i5 > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j4 + j7 : j7;
        }
        return vVar2.g(pVar.a, j3, i3, i4);
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new p(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new p(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "ReducedValue(" + String.valueOf(this.a) + "," + this.b + "," + this.c + "," + String.valueOf(Objects.requireNonNullElse(this.g, 0)) + ")";
    }
}
