package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmou extends dqpd implements dqpf {
    public String a;
    public String b;
    public bmra c;
    public bmqz d;
    public byiv h;
    public int i;
    public emcn e = emcn.b(0);
    public int f = -1;
    public String g = "-1";
    public int j = -1;
    public String k = "-1";

    protected bmou() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "CmsDeadLetterQueueTable [_id: %s,\n  cms_id: %s,\n  cms_data_type: %s,\n  abandoned_action: %s,\n  failure_reason: %s,\n  bugle_table_type: %s,\n  bugle_id: %s,\n  cms_backup_parameters: %s,\n  backup_flags: %s,\n  backup_dependency_table_type: %s,\n  backup_dependency_bugle_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bmqy.c().intValue();
        dqru.v(contentValues, "cms_id", this.b);
        bmra bmraVar = this.c;
        if (bmraVar == null) {
            contentValues.putNull("cms_data_type");
        } else {
            contentValues.put("cms_data_type", Integer.valueOf(bmraVar.ordinal()));
        }
        bmqz bmqzVar = this.d;
        if (bmqzVar == null) {
            contentValues.putNull("abandoned_action");
        } else {
            contentValues.put("abandoned_action", Integer.valueOf(bmqzVar.ordinal()));
        }
        emcn emcnVar = this.e;
        if (emcnVar == null) {
            contentValues.putNull("failure_reason");
        } else {
            contentValues.put("failure_reason", Integer.valueOf(emcnVar.bs));
        }
        if (iIntValue >= 57090) {
            contentValues.put("bugle_table_type", Integer.valueOf(this.f));
        }
        if (iIntValue >= 57090) {
            dqru.v(contentValues, "bugle_id", this.g);
        }
        if (iIntValue >= 57090) {
            byiv byivVar = this.h;
            if (byivVar == null) {
                contentValues.putNull("cms_backup_parameters");
            } else {
                contentValues.put("cms_backup_parameters", byivVar.toByteArray());
            }
        }
        if (iIntValue >= 57090) {
            contentValues.put("backup_flags", Integer.valueOf(this.i));
        }
        if (iIntValue >= 57090) {
            contentValues.put("backup_dependency_table_type", Integer.valueOf(this.j));
        }
        if (iIntValue >= 57090) {
            dqru.v(contentValues, "backup_dependency_bugle_id", this.k);
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmqk bmqkVar = (bmqk) ((bmpy) dqqjVar);
        aC();
        this.cN = bmqkVar.cV();
        if (bmqkVar.dj(0)) {
            this.a = bmqkVar.n();
            super.fN(0);
        }
        if (bmqkVar.dj(1)) {
            this.b = bmqkVar.m();
            super.fN(1);
        }
        if (bmqkVar.dj(2)) {
            this.c = bmqkVar.h();
            super.fN(2);
        }
        if (bmqkVar.dj(3)) {
            this.d = bmqkVar.g();
            super.fN(3);
        }
        if (bmqkVar.dj(4)) {
            this.e = bmqkVar.j();
            super.fN(4);
        }
        if (bmqkVar.dj(5)) {
            this.f = bmqkVar.f();
            super.fN(5);
        }
        if (bmqkVar.dj(6)) {
            this.g = bmqkVar.l();
            super.fN(6);
        }
        if (bmqkVar.dj(7)) {
            this.h = bmqkVar.i();
            super.fN(7);
        }
        if (bmqkVar.dj(8)) {
            this.i = bmqkVar.e();
            super.fN(8);
        }
        if (bmqkVar.dj(9)) {
            this.j = bmqkVar.c();
            super.fN(9);
        }
        if (bmqkVar.dj(10)) {
            this.k = bmqkVar.k();
            super.fN(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmou)) {
            return false;
        }
        bmou bmouVar = (bmou) obj;
        return super.aE(bmouVar.cN) && Objects.equals(this.a, bmouVar.a) && Objects.equals(this.b, bmouVar.b) && this.c == bmouVar.c && this.d == bmouVar.d && this.e == bmouVar.e && this.f == bmouVar.f && Objects.equals(this.g, bmouVar.g) && Objects.equals(this.h, bmouVar.h) && this.i == bmouVar.i && this.j == bmouVar.j && Objects.equals(this.k, bmouVar.k);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_dead_letter_queue", dqru.m(new String[]{"cms_id", "cms_data_type", "abandoned_action", "failure_reason", "bugle_table_type", "bugle_id", "cms_backup_parameters", "backup_flags", "backup_dependency_table_type", "backup_dependency_bugle_id"}));
    }

    @Override // defpackage.dqpd
    public final void fN(int i) {
        super.fN(0);
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms_dead_letter_queue";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        String str2 = this.b;
        bmra bmraVar = this.c;
        Integer numValueOf = Integer.valueOf(bmraVar == null ? 0 : bmraVar.ordinal());
        bmqz bmqzVar = this.d;
        return Objects.hash(dqqeVar2, str, str2, numValueOf, Integer.valueOf(bmqzVar == null ? 0 : bmqzVar.ordinal()), this.e, Integer.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i), Integer.valueOf(this.j), this.k, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r14, java.util.List r15) {
        /*
            r13 = this;
            java.lang.String r0 = r13.b
            bmra r1 = r13.c
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r1 != 0) goto Ld
            r1 = r3
            goto L15
        Ld:
            int r1 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L15:
            bmqz r4 = r13.d
            if (r4 != 0) goto L1b
            r4 = r3
            goto L23
        L1b:
            int r4 = r4.ordinal()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L23:
            emcn r5 = r13.e
            if (r5 != 0) goto L28
            goto L2e
        L28:
            int r3 = r5.bs
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L2e:
            int r5 = r13.f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = r13.g
            byiv r7 = r13.h
            if (r7 != 0) goto L3c
            r7 = 0
            goto L40
        L3c:
            byte[] r7 = r7.toByteArray()
        L40:
            int r8 = r13.i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r13.j
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = r13.k
            r11 = 10
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r2] = r0
            r0 = 1
            r12[r0] = r1
            r0 = 2
            r12[r0] = r4
            r0 = 3
            r12[r0] = r3
            r0 = 4
            r12[r0] = r5
            r0 = 5
            r12[r0] = r6
            r0 = 6
            r12[r0] = r7
            r0 = 7
            r12[r0] = r8
            r0 = 8
            r12[r0] = r9
            r0 = 9
            r12[r0] = r10
            r0 = 40
            r14.append(r0)
        L76:
            if (r2 >= r11) goto Lad
            r0 = r12[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L86
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r14.append(r0)
            goto La5
        L86:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L9d
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r4 = 12
            if (r3 >= r4) goto L9d
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r14.append(r0)
            goto La5
        L9d:
            r15.add(r0)
            r0 = 63
            r14.append(r0)
        La5:
            r0 = 44
            r14.append(r0)
            int r2 = r2 + 1
            goto L76
        Lad:
            int r15 = r14.length()
            int r15 = r15 + (-1)
            r14.setLength(r15)
            r15 = 41
            r14.append(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmou.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final /* synthetic */ void k(Long l) {
        if (l.longValue() >= 0) {
            this.a = String.valueOf(l);
            super.fN(0);
        }
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsDeadLetterQueueTable -- REDACTED") : a();
    }
}
