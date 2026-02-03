package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsuv extends dqpd implements dqpf {
    public String a;
    public String b;
    public avbl c;
    public String d;
    public String e;
    public String f;

    protected bsuv() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RbmBusinessInfoPropertiesTable [_id: %s,\n  rbm_bot_id: %s,\n  type: %s,\n  header: %s,\n  subheader: %s,\n  property_value: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        if (bswf.c().intValue() >= 51020) {
            dqru.v(contentValues, "rbm_bot_id", this.b);
        }
        avbl avblVar = this.c;
        if (avblVar == null) {
            contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        } else {
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(avblVar.ordinal()));
        }
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, this.d);
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER, this.e);
        dqru.v(contentValues, "property_value", this.f);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bsvv bsvvVar = (bsvv) ((bsvo) dqqjVar);
        aC();
        this.cN = bsvvVar.cV();
        if (bsvvVar.dj(0)) {
            this.a = bsvvVar.f();
            fN(0);
        }
        if (bsvvVar.dj(1)) {
            this.b = bsvvVar.h();
            fN(1);
        }
        if (bsvvVar.dj(2)) {
            this.c = bsvvVar.c();
            fN(2);
        }
        if (bsvvVar.dj(3)) {
            this.d = bsvvVar.e();
            fN(3);
        }
        if (bsvvVar.dj(4)) {
            this.e = bsvvVar.i();
            fN(4);
        }
        if (bsvvVar.dj(5)) {
            this.f = bsvvVar.g();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bsuv)) {
            return false;
        }
        bsuv bsuvVar = (bsuv) obj;
        return super.aE(bsuvVar.cN) && Objects.equals(this.a, bsuvVar.a) && Objects.equals(this.b, bsuvVar.b) && this.c == bsuvVar.c && Objects.equals(this.d, bsuvVar.d) && Objects.equals(this.e, bsuvVar.e) && Objects.equals(this.f, bsuvVar.f);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rbm_business_info_properties", dqru.m(new String[]{"rbm_bot_id", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER, "property_value"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "rbm_business_info_properties";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        String str2 = this.b;
        avbl avblVar = this.c;
        return Objects.hash(dqqeVar2, str, str2, Integer.valueOf(avblVar == null ? 0 : avblVar.ordinal()), this.d, this.e, this.f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r0 = r8.b
            avbl r1 = r8.c
            r2 = 0
            if (r1 != 0) goto Lc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L14
        Lc:
            int r1 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L14:
            java.lang.String r3 = r8.d
            java.lang.String r4 = r8.e
            java.lang.String r5 = r8.f
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
        L30:
            if (r2 >= r6) goto L67
            r0 = r7[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L40
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L5f
        L40:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L57
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r4 = 12
            if (r3 >= r4) goto L57
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L5f
        L57:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L5f:
            r0 = 44
            r9.append(r0)
            int r2 = r2 + 1
            goto L30
        L67:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsuv.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final avbl k() {
        aA(2, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        return this.c;
    }

    public final String m() {
        aA(3, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER);
        return this.d;
    }

    public final String n() {
        aA(5, "property_value");
        return this.f;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RbmBusinessInfoPropertiesTable -- REDACTED") : a();
    }
}
