package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* loaded from: classes9.dex */
public final class x {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(j$.time.temporal.TemporalAccessor r10, j$.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            r9.<init>()
            j$.time.chrono.Chronology r0 = r11.e
            j$.time.ZoneId r1 = r11.f
            if (r0 != 0) goto Ld
            if (r1 != 0) goto Ld
            goto Leb
        Ld:
            j$.desugar.sun.nio.fs.n r2 = j$.time.temporal.k.b
            java.lang.Object r2 = r10.I(r2)
            j$.time.chrono.Chronology r2 = (j$.time.chrono.Chronology) r2
            j$.desugar.sun.nio.fs.n r3 = j$.time.temporal.k.a
            java.lang.Object r3 = r10.I(r3)
            j$.time.ZoneId r3 = (j$.time.ZoneId) r3
            boolean r4 = j$.util.Objects.equals(r0, r2)
            r5 = 0
            if (r4 == 0) goto L25
            r0 = r5
        L25:
            boolean r4 = j$.util.Objects.equals(r1, r3)
            if (r4 == 0) goto L2c
            r1 = r5
        L2c:
            if (r0 != 0) goto L32
            if (r1 != 0) goto L32
            goto Leb
        L32:
            if (r0 == 0) goto L36
            r4 = r0
            goto L37
        L36:
            r4 = r2
        L37:
            if (r1 == 0) goto L9d
            j$.time.temporal.ChronoField r6 = j$.time.temporal.ChronoField.INSTANT_SECONDS
            boolean r6 = r10.c(r6)
            if (r6 == 0) goto L53
            j$.time.chrono.q r0 = j$.time.chrono.q.d
            java.lang.Object r0 = j$.util.Objects.requireNonNullElse(r4, r0)
            j$.time.chrono.Chronology r0 = (j$.time.chrono.Chronology) r0
            j$.time.Instant r10 = j$.time.Instant.K(r10)
            j$.time.chrono.h r10 = r0.H(r10, r1)
            goto Leb
        L53:
            j$.time.zone.ZoneRules r6 = r1.getRules()     // Catch: j$.time.zone.e -> L64
            boolean r7 = r6.g()     // Catch: j$.time.zone.e -> L64
            if (r7 == 0) goto L65
            j$.time.Instant r7 = j$.time.Instant.EPOCH     // Catch: j$.time.zone.e -> L64
            j$.time.ZoneOffset r6 = r6.d(r7)     // Catch: j$.time.zone.e -> L64
            goto L66
        L64:
        L65:
            r6 = r1
        L66:
            boolean r6 = r6 instanceof j$.time.ZoneOffset
            if (r6 == 0) goto L9d
            j$.time.temporal.ChronoField r6 = j$.time.temporal.ChronoField.OFFSET_SECONDS
            boolean r7 = r10.c(r6)
            if (r7 == 0) goto L9d
            int r6 = r10.get(r6)
            j$.time.zone.ZoneRules r7 = r1.getRules()
            j$.time.Instant r8 = j$.time.Instant.EPOCH
            j$.time.ZoneOffset r7 = r7.d(r8)
            int r7 = r7.getTotalSeconds()
            if (r6 != r7) goto L87
            goto L9d
        L87:
            j$.time.DateTimeException r11 = new j$.time.DateTimeException
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "Unable to apply override zone '"
            java.lang.String r2 = "' because the temporal object being formatted has a different offset but does not represent an instant: "
            java.lang.String r10 = j$.time.c.d(r1, r0, r2, r10)
            r11.<init>(r10)
            throw r11
        L9d:
            if (r1 == 0) goto La0
            r3 = r1
        La0:
            if (r0 == 0) goto Le5
            j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.EPOCH_DAY
            boolean r1 = r10.c(r1)
            if (r1 == 0) goto Laf
            j$.time.chrono.ChronoLocalDate r5 = r4.z(r10)
            goto Le5
        Laf:
            j$.time.chrono.q r1 = j$.time.chrono.q.d
            if (r0 != r1) goto Lb5
            if (r2 == 0) goto Le5
        Lb5:
            j$.time.temporal.ChronoField[] r1 = j$.time.temporal.ChronoField.values()
            int r2 = r1.length
            r6 = 0
        Lbb:
            if (r6 >= r2) goto Le5
            r7 = r1[r6]
            boolean r8 = r7.isDateBased()
            if (r8 == 0) goto Le2
            boolean r7 = r10.c(r7)
            if (r7 != 0) goto Lcc
            goto Le2
        Lcc:
            j$.time.DateTimeException r11 = new j$.time.DateTimeException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "Unable to apply override chronology '"
            java.lang.String r2 = "' because the temporal object being formatted contains date fields but does not represent a whole date: "
            java.lang.String r10 = j$.time.c.d(r1, r0, r2, r10)
            r11.<init>(r10)
            throw r11
        Le2:
            int r6 = r6 + 1
            goto Lbb
        Le5:
            j$.time.format.w r0 = new j$.time.format.w
            r0.<init>(r5, r10, r4, r3)
            r10 = r0
        Leb:
            r9.a = r10
            r9.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.x.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    public final Long a(TemporalField temporalField) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.c(temporalField)) {
            return Long.valueOf(temporalAccessor.A(temporalField));
        }
        return null;
    }

    public final Object b(j$.desugar.sun.nio.fs.n nVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object objI = temporalAccessor.I(nVar);
        if (objI == null && this.c == 0) {
            throw new DateTimeException(j$.time.c.d("Unable to extract ", String.valueOf(nVar), " from temporal ", String.valueOf(temporalAccessor)));
        }
        return objI;
    }

    public final String toString() {
        return this.a.toString();
    }
}
