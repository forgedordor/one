package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmxf extends dqpd implements dqpf {
    public long a;
    public long b;
    public String c;
    public String d;
    public epjl e = epjl.CMS_DATA_PROVIDER_UNSPECIFIED;
    public byte[] f;
    public long g;

    protected bmxf() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        byte[] bArr = this.f;
        return String.format(locale, "CmsRestoreDependencyCacheTable [_id: %s,\n  dependent_id: %s,\n  dependent_cms_id: %s,\n  dependency_cms_id: %s,\n  cms_data_provider_type: %s,\n  payload: %s,\n  inserted_at_timestamp: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bmyr.c().intValue();
        contentValues.put("dependent_id", Long.valueOf(this.b));
        dqru.v(contentValues, "dependent_cms_id", this.c);
        dqru.v(contentValues, "dependency_cms_id", this.d);
        if (iIntValue >= 59660) {
            epjl epjlVar = this.e;
            if (epjlVar == null) {
                contentValues.putNull("cms_data_provider_type");
            } else {
                contentValues.put("cms_data_provider_type", Integer.valueOf(epjlVar.a()));
            }
        }
        contentValues.put("payload", this.f);
        contentValues.put("inserted_at_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmyh bmyhVar = (bmyh) ((bmxz) dqqjVar);
        aC();
        this.cN = bmyhVar.cV();
        if (bmyhVar.dj(0)) {
            this.a = bmyhVar.e();
            fN(0);
        }
        if (bmyhVar.dj(1)) {
            this.b = bmyhVar.c();
            fN(1);
        }
        if (bmyhVar.dj(2)) {
            this.c = bmyhVar.i();
            fN(2);
        }
        if (bmyhVar.dj(3)) {
            this.d = bmyhVar.h();
            fN(3);
        }
        if (bmyhVar.dj(4)) {
            this.e = bmyhVar.g();
            fN(4);
        }
        if (bmyhVar.dj(5)) {
            this.f = bmyhVar.j();
            fN(5);
        }
        if (bmyhVar.dj(6)) {
            this.g = bmyhVar.f();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmxf)) {
            return false;
        }
        bmxf bmxfVar = (bmxf) obj;
        return super.aE(bmxfVar.cN) && this.a == bmxfVar.a && this.b == bmxfVar.b && Objects.equals(this.c, bmxfVar.c) && Objects.equals(this.d, bmxfVar.d) && this.e == bmxfVar.e && Arrays.equals(this.f, bmxfVar.f) && this.g == bmxfVar.g;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_restore_dependency_cache_table", dqru.m(new String[]{"dependent_id", "dependent_cms_id", "dependency_cms_id", "cms_data_provider_type", "payload", "inserted_at_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms_restore_dependency_cache_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.g), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            long r0 = r9.b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r9.c
            java.lang.String r2 = r9.d
            epjl r3 = r9.e
            r4 = 0
            if (r3 != 0) goto L14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L1c
        L14:
            int r3 = r3.a()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L1c:
            byte[] r5 = r9.f
            long r6 = r9.g
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r4] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r5
            r0 = 5
            r8[r0] = r6
            r0 = 40
            r10.append(r0)
        L3d:
            if (r4 >= r7) goto L74
            r0 = r8[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L4d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L6c
        L4d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L64
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L64
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L6c
        L64:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L6c:
            r0 = 44
            r10.append(r0)
            int r4 = r4 + 1
            goto L3d
        L74:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmxf.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(1, "dependent_id");
        return this.b;
    }

    public final epjl m() {
        aA(4, "cms_data_provider_type");
        return this.e;
    }

    public final String n() {
        aA(2, "dependent_cms_id");
        return this.c;
    }

    public final byte[] o() {
        aA(5, "payload");
        return this.f;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsRestoreDependencyCacheTable -- REDACTED") : a();
    }
}
