package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsdr extends fcyz implements fdat {
    Object a;
    long b;
    long c;
    int d;
    final /* synthetic */ dsdu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdr(dsdu dsduVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = dsduVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsdr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.d
            r2 = 0
            java.lang.String r4 = "GNP_JOBS_SCHEDULED_TIMESTAMP_MS"
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L24
            if (r1 == r5) goto L19
            long r0 = r13.b
            java.lang.Object r2 = r13.a
            defpackage.fctl.b(r14)
            goto La2
        L19:
            long r5 = r13.c
            long r7 = r13.b
            java.lang.Object r1 = r13.a
            defpackage.fctl.b(r14)
            r14 = r1
            goto L82
        L24:
            defpackage.fctl.b(r14)
            goto L4b
        L28:
            defpackage.fctl.b(r14)
            eksp r14 = defpackage.dsdu.a
            ekrw r14 = r14.o()
            java.lang.String r1 = "Scheduling jobs on startup"
            r14.q(r1)
            dsdu r14 = r13.e
            eygg r14 = r14.c
            java.lang.Object r14 = r14.b()
            r14.getClass()
            com.google.common.util.concurrent.ListenableFuture r14 = (com.google.common.util.concurrent.ListenableFuture) r14
            r13.d = r6
            java.lang.Object r14 = defpackage.fdxs.c(r14, r13)
            if (r14 == r0) goto Ld2
        L4b:
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14
            long r7 = r14.getLong(r4, r2)
            dsdu r1 = r13.e
            diep r6 = r1.e
            j$.time.Instant r6 = r6.f()
            long r9 = r6.toEpochMilli()
            r11 = -86400000(0xfffffffffad9a400, double:NaN)
            long r11 = r11 + r9
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            eksp r14 = defpackage.dsdu.a
            ekrw r14 = r14.o()
            java.lang.String r0 = "Rescheduling startup job interval did not pass, not re-scheduling."
            r14.q(r0)
            fctx r14 = defpackage.fctx.a
            return r14
        L73:
            r13.a = r14
            r13.b = r7
            r13.c = r9
            r13.d = r5
            java.lang.Object r1 = r1.d(r13)
            if (r1 == r0) goto Ld2
            r5 = r9
        L82:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 != 0) goto Lc5
            eksp r1 = defpackage.dsdu.a
            ekrw r1 = r1.o()
            java.lang.String r2 = "Scheduling one-off sync job and canceling migrated jobs"
            r1.q(r2)
            dsdu r1 = r13.e
            r13.a = r14
            r13.b = r5
            r2 = 3
            r13.d = r2
            java.lang.Object r1 = r1.c(r13)
            if (r1 == r0) goto Ld2
            r2 = r14
            r0 = r5
        La2:
            dsdu r14 = r13.e
            android.content.Context r14 = r14.d
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r14 = r14.getSystemService(r3)
            r14.getClass()
            android.app.job.JobScheduler r14 = (android.app.job.JobScheduler) r14
            r3 = 1573857706(0x5dcf29aa, float:1.86595617E18)
            r14.cancel(r3)
            r3 = 1573857705(0x5dcf29a9, float:1.86595603E18)
            r14.cancel(r3)
            r3 = 1573857707(0x5dcf29ab, float:1.86595631E18)
            r14.cancel(r3)
            r5 = r0
            r14 = r2
        Lc5:
            android.content.SharedPreferences$Editor r14 = r14.edit()
            r14.putLong(r4, r5)
            r14.apply()
            fctx r14 = defpackage.fctx.a
            return r14
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsdr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsdr(this.e, fcxyVar);
    }
}
