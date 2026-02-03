package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpei extends dqpd implements dqpf {
    public String a;
    public amrb b;
    public Instant c = Instant.EPOCH;
    public Instant d = Instant.EPOCH;
    public long e;

    protected bpei() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "EmergencySessionsTable [emergency_destination: %s,\n  type: %s,\n  start_timestamp: %s,\n  end_timestamp: %s,\n  refill_duration_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "emergency_destination", this.a);
        amrb amrbVar = this.b;
        if (amrbVar == null) {
            contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        } else {
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(amrbVar.ordinal()));
        }
        Instant instant = this.c;
        if (instant == null) {
            contentValues.putNull("start_timestamp");
        } else {
            contentValues.put("start_timestamp", Long.valueOf(bart.a(instant)));
        }
        Instant instant2 = this.d;
        if (instant2 == null) {
            contentValues.putNull("end_timestamp");
        } else {
            contentValues.put("end_timestamp", Long.valueOf(bart.a(instant2)));
        }
        contentValues.put("refill_duration_ms", Long.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpfe bpfeVar = (bpfe) ((bpey) dqqjVar);
        aC();
        this.cN = bpfeVar.cV();
        if (bpfeVar.dj(0)) {
            this.a = bpfeVar.h();
            fN(0);
        }
        if (bpfeVar.dj(1)) {
            this.b = bpfeVar.e();
            fN(1);
        }
        if (bpfeVar.dj(2)) {
            this.c = bpfeVar.g();
            fN(2);
        }
        if (bpfeVar.dj(3)) {
            this.d = bpfeVar.f();
            fN(3);
        }
        if (bpfeVar.dj(4)) {
            this.e = bpfeVar.c();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpei)) {
            return false;
        }
        bpei bpeiVar = (bpei) obj;
        return super.aE(bpeiVar.cN) && Objects.equals(this.a, bpeiVar.a) && this.b == bpeiVar.b && Objects.equals(this.c, bpeiVar.c) && Objects.equals(this.d, bpeiVar.d) && this.e == bpeiVar.e;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "emergency_sessions", dqru.m(new String[]{"emergency_destination", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "start_timestamp", "end_timestamp", "refill_duration_ms"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "emergency_sessions";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        amrb amrbVar = this.b;
        return Objects.hash(dqqeVar2, str, Integer.valueOf(amrbVar == null ? 0 : amrbVar.ordinal()), this.c, this.d, Long.valueOf(this.e), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r0 = r8.a
            amrb r1 = r8.b
            r2 = 0
            if (r1 != 0) goto Lc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L14
        Lc:
            int r1 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L14:
            j$.time.Instant r3 = r8.c
            long r3 = defpackage.bart.a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            j$.time.Instant r4 = r8.d
            long r4 = defpackage.bart.a(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r5 = r8.e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            r0 = 2
            r7[r0] = r3
            r0 = 3
            r7[r0] = r4
            r0 = 4
            r7[r0] = r5
            r0 = 40
            r9.append(r0)
        L44:
            if (r2 >= r6) goto L7b
            r0 = r7[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L54
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L73
        L54:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L6b
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r4 = 12
            if (r3 >= r4) goto L6b
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L73
        L6b:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L73:
            r0 = 44
            r9.append(r0)
            int r2 = r2 + 1
            goto L44
        L7b:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpei.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(4, "refill_duration_ms");
        return this.e;
    }

    public final amrb m() {
        aA(1, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        return this.b;
    }

    public final Instant n() {
        aA(3, "end_timestamp");
        return this.d;
    }

    public final Instant o() {
        aA(2, "start_timestamp");
        return this.c;
    }

    public final String p() {
        aA(0, "emergency_destination");
        return this.a;
    }

    public final void q(Function function) {
        String[] strArr = bpfo.a;
        final bpfm bpfmVar = new bpfm((bpfn) function.apply(new bpfn()));
        final dqsy dqsyVarA = bpfo.a();
        ((Boolean) dqsyVarA.o(new ejxr() { // from class: bpeh
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = bpfo.a;
                bpfl bpflVar = new bpfl();
                ContentValues contentValues = bpflVar.a;
                bpei bpeiVar = this.a;
                dqru.v(contentValues, "emergency_destination", bpeiVar.p());
                amrb amrbVarM = bpeiVar.m();
                if (amrbVarM == null) {
                    contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                } else {
                    contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(amrbVarM.ordinal()));
                }
                Instant instantO = bpeiVar.o();
                if (instantO == null) {
                    contentValues.putNull("start_timestamp");
                } else {
                    contentValues.put("start_timestamp", Long.valueOf(bart.a(instantO)));
                }
                bpfm bpfmVar2 = bpfmVar;
                bpflVar.c(bpeiVar.n());
                bpflVar.d(bpeiVar.k());
                bpflVar.al();
                bpflVar.af(bpfmVar2);
                bpflVar.an(new dqsb("emergency_sessions", "-updateOrInsert-update"));
                if (bpflVar.a().e() != 0) {
                    return true;
                }
                final dqsy dqsyVar = dqsyVarA;
                return Boolean.valueOf(dqru.b(bpfo.a(), "emergency_sessions", bpeiVar, new Function() { // from class: bpef
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVar.O("emergency_sessions", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Consumer() { // from class: bpeg
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "EmergencySessionsTable -- REDACTED") : a();
    }
}
