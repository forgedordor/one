package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bspj extends dqpd implements dqpf {
    public String c;
    public cgzv f;
    public String g;
    public byte[] h;
    public cgzx a = null;
    public cgxy b = cgxy.a;
    public Instant d = Instant.EPOCH;
    public long e = 0;
    public Instant i = Instant.EPOCH;

    protected bspj() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        byte[] bArr = this.h;
        return String.format(locale, "PipelineWorkTable [work_id: %s,\n  pipeline_type: %s,\n  sequencing_key: %s,\n  insertion_timestamp: %s,\n  execution_attempt_count: %s,\n  execution_state: %s,\n  client_supplied_id: %s,\n  payload: %s,\n  execute_after_timestamp: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bsrg.c().intValue();
        cgzx cgzxVar = this.a;
        if (cgzxVar == null || cgzxVar.equals(null)) {
            contentValues.putNull("work_id");
        } else {
            contentValues.put("work_id", chbt.b(this.a));
        }
        cgxy cgxyVar = this.b;
        if (cgxyVar == null) {
            contentValues.putNull("pipeline_type");
        } else {
            contentValues.put("pipeline_type", Long.valueOf(chaj.a(cgxyVar)));
        }
        dqru.v(contentValues, "sequencing_key", this.c);
        Instant instant = this.d;
        if (instant == null) {
            contentValues.putNull("insertion_timestamp");
        } else {
            contentValues.put("insertion_timestamp", Long.valueOf(bart.a(instant)));
        }
        contentValues.put("execution_attempt_count", Long.valueOf(this.e));
        cgzv cgzvVar = this.f;
        if (cgzvVar == null) {
            contentValues.putNull("execution_state");
        } else {
            contentValues.put("execution_state", Integer.valueOf(cgzvVar.ordinal()));
        }
        dqru.v(contentValues, "client_supplied_id", this.g);
        contentValues.put("payload", this.h);
        if (iIntValue >= 60840) {
            Instant instant2 = this.i;
            if (instant2 == null) {
                contentValues.putNull("execute_after_timestamp");
            } else {
                contentValues.put("execute_after_timestamp", Long.valueOf(bart.a(instant2)));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bsqt bsqtVar = (bsqt) ((bsqj) dqqjVar);
        aC();
        this.cN = bsqtVar.cV();
        if (bsqtVar.dj(0)) {
            this.a = bsqtVar.g();
            fN(0);
        }
        if (bsqtVar.dj(1)) {
            this.b = bsqtVar.e();
            fN(1);
        }
        if (bsqtVar.dj(2)) {
            this.c = bsqtVar.k();
            fN(2);
        }
        if (bsqtVar.dj(3)) {
            this.d = bsqtVar.i();
            fN(3);
        }
        if (bsqtVar.dj(4)) {
            this.e = bsqtVar.c();
            fN(4);
        }
        if (bsqtVar.dj(5)) {
            this.f = bsqtVar.f();
            fN(5);
        }
        if (bsqtVar.dj(6)) {
            this.g = bsqtVar.j();
            fN(6);
        }
        if (bsqtVar.dj(7)) {
            this.h = bsqtVar.l();
            fN(7);
        }
        if (bsqtVar.dj(8)) {
            this.i = bsqtVar.h();
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bspj)) {
            return false;
        }
        bspj bspjVar = (bspj) obj;
        return super.aE(bspjVar.cN) && Objects.equals(this.a, bspjVar.a) && Objects.equals(this.b, bspjVar.b) && Objects.equals(this.c, bspjVar.c) && Objects.equals(this.d, bspjVar.d) && this.e == bspjVar.e && this.f == bspjVar.f && Objects.equals(this.g, bspjVar.g) && Arrays.equals(this.h, bspjVar.h) && Objects.equals(this.i, bspjVar.i);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "pipeline_work", dqru.m(new String[]{"work_id", "pipeline_type", "sequencing_key", "insertion_timestamp", "execution_attempt_count", "execution_state", "client_supplied_id", "payload", "execute_after_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "pipeline_work";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        cgzx cgzxVar = this.a;
        cgxy cgxyVar = this.b;
        String str = this.c;
        Instant instant = this.d;
        Long lValueOf = Long.valueOf(this.e);
        cgzv cgzvVar = this.f;
        return Objects.hash(dqqeVar2, cgzxVar, cgxyVar, str, instant, lValueOf, Integer.valueOf(cgzvVar == null ? 0 : cgzvVar.ordinal()), this.g, Integer.valueOf(Arrays.hashCode(this.h)), this.i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r13, java.util.List r14) {
        /*
            r12 = this;
            bspi r0 = new bspi
            r0.<init>(r12)
            java.lang.Object r0 = r0.get()
            cgxy r1 = r12.b
            long r1 = defpackage.chaj.a(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = r12.c
            j$.time.Instant r3 = r12.d
            long r3 = defpackage.bart.a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r12.e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            cgzv r5 = r12.f
            r6 = 0
            if (r5 != 0) goto L2f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            goto L37
        L2f:
            int r5 = r5.ordinal()
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L37:
            java.lang.String r7 = r12.g
            byte[] r8 = r12.h
            j$.time.Instant r9 = r12.i
            long r9 = defpackage.bart.a(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 9
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r6] = r0
            r0 = 1
            r11[r0] = r1
            r0 = 2
            r11[r0] = r2
            r0 = 3
            r11[r0] = r3
            r0 = 4
            r11[r0] = r4
            r0 = 5
            r11[r0] = r5
            r0 = 6
            r11[r0] = r7
            r0 = 7
            r11[r0] = r8
            r0 = 8
            r11[r0] = r9
            r0 = 40
            r13.append(r0)
        L69:
            if (r6 >= r10) goto La0
            r0 = r11[r6]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L79
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.append(r0)
            goto L98
        L79:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L90
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L90
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r13.append(r0)
            goto L98
        L90:
            r14.add(r0)
            r0 = 63
            r13.append(r0)
        L98:
            r0 = 44
            r13.append(r0)
            int r6 = r6 + 1
            goto L69
        La0:
            int r14 = r13.length()
            int r14 = r14 + (-1)
            r13.setLength(r14)
            r14 = 41
            r13.append(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bspj.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "PipelineWorkTable -- REDACTED") : a();
    }
}
