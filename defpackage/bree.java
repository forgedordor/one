package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bree extends dqpd implements dqpf {
    public long a;
    public long b;
    public long c;
    public String d;
    public String e;
    public String f;

    protected bree() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ModifiedByTable [_id: %s,\n  am_version_code: %s,\n  stack_trace_hash: %s,\n  source: %s,\n  tiktok_trace: %s,\n  stack_trace: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("am_version_code", Long.valueOf(this.b));
        contentValues.put("stack_trace_hash", Long.valueOf(this.c));
        dqru.v(contentValues, "source", this.d);
        dqru.v(contentValues, "tiktok_trace", this.e);
        dqru.v(contentValues, "stack_trace", this.f);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        brfd brfdVar = (brfd) ((brew) dqqjVar);
        aC();
        this.cN = brfdVar.cV();
        if (brfdVar.dj(0)) {
            this.a = brfdVar.e();
            fN(0);
        }
        if (brfdVar.dj(1)) {
            this.b = brfdVar.c();
            fN(1);
        }
        if (brfdVar.dj(2)) {
            this.c = brfdVar.f();
            fN(2);
        }
        if (brfdVar.dj(3)) {
            this.d = brfdVar.g();
            fN(3);
        }
        if (brfdVar.dj(4)) {
            this.e = brfdVar.i();
            fN(4);
        }
        if (brfdVar.dj(5)) {
            this.f = brfdVar.h();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bree)) {
            return false;
        }
        bree breeVar = (bree) obj;
        return super.aE(breeVar.cN) && this.a == breeVar.a && this.b == breeVar.b && this.c == breeVar.c && Objects.equals(this.d, breeVar.d) && Objects.equals(this.e, breeVar.e) && Objects.equals(this.f, breeVar.f);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "modified_by", dqru.m(new String[]{"am_version_code", "stack_trace_hash", "source", "tiktok_trace", "stack_trace"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "modified_by";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, this.f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            long r0 = r8.b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r8.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = r8.d
            java.lang.String r3 = r8.e
            java.lang.String r4 = r8.f
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 40
            r9.append(r0)
        L29:
            if (r7 >= r5) goto L60
            r0 = r6[r7]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L39
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L58
        L39:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L50
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L50
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L58
        L50:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L58:
            r0 = 44
            r9.append(r0)
            int r7 = r7 + 1
            goto L29
        L60:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bree.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ModifiedByTable -- REDACTED") : a();
    }
}
