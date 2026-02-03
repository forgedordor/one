package defpackage;

import java.io.IOException;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etcf extends esyv {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    @Override // defpackage.esyv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.etdb r16) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            r15 = this;
            int r0 = r16.t()
            r1 = 9
            if (r0 != r1) goto Ld
            r16.p()
            r0 = 0
            return r0
        Ld:
            r16.m()
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L17:
            int r1 = r16.t()
            r8 = 4
            if (r1 == r8) goto L88
            java.lang.String r1 = r16.h()
            int r9 = r16.c()
            int r10 = r1.hashCode()
            r11 = 5
            r12 = 3
            r13 = 2
            r14 = 1
            switch(r10) {
                case -1181204563: goto L64;
                case -1074026988: goto L5a;
                case -906279820: goto L50;
                case 3704893: goto L46;
                case 104080000: goto L3c;
                case 985252545: goto L32;
                default: goto L31;
            }
        L31:
            goto L6e
        L32:
            java.lang.String r10 = "hourOfDay"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L6e
            r1 = r12
            goto L6f
        L3c:
            java.lang.String r10 = "month"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L6e
            r1 = r14
            goto L6f
        L46:
            java.lang.String r10 = "year"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L6e
            r1 = r0
            goto L6f
        L50:
            java.lang.String r10 = "second"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L6e
            r1 = r11
            goto L6f
        L5a:
            java.lang.String r10 = "minute"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L6e
            r1 = r8
            goto L6f
        L64:
            java.lang.String r10 = "dayOfMonth"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L6e
            r1 = r13
            goto L6f
        L6e:
            r1 = -1
        L6f:
            if (r1 == 0) goto L86
            if (r1 == r14) goto L84
            if (r1 == r13) goto L82
            if (r1 == r12) goto L80
            if (r1 == r8) goto L7e
            if (r1 == r11) goto L7c
            goto L17
        L7c:
            r7 = r9
            goto L17
        L7e:
            r6 = r9
            goto L17
        L80:
            r5 = r9
            goto L17
        L82:
            r4 = r9
            goto L17
        L84:
            r3 = r9
            goto L17
        L86:
            r2 = r9
            goto L17
        L88:
            r16.o()
            java.util.GregorianCalendar r1 = new java.util.GregorianCalendar
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etcf.a(etdb):java.lang.Object");
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            etddVar.j();
            return;
        }
        etddVar.f();
        etddVar.i("year");
        etddVar.k(r4.get(1));
        etddVar.i("month");
        etddVar.k(r4.get(2));
        etddVar.i("dayOfMonth");
        etddVar.k(r4.get(5));
        etddVar.i("hourOfDay");
        etddVar.k(r4.get(11));
        etddVar.i("minute");
        etddVar.k(r4.get(12));
        etddVar.i("second");
        etddVar.k(r4.get(13));
        etddVar.h();
    }
}
