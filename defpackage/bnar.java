package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bnar extends dqpd implements dqpf {
    public byte[] b;
    public String d;
    public String e;
    public int a = 0;
    public int c = 0;

    protected bnar() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        byte[] bArr = this.b;
        return String.format(locale, "CmsTable [key_index: %s,\n  encryption_key: %s,\n  key_type: %s,\n  cms_correlation_id: %s,\n  cms_id: %s\n]\n", strValueOf, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bncb.c().intValue();
        contentValues.put("key_index", Integer.valueOf(this.a));
        contentValues.put("encryption_key", this.b);
        contentValues.put("key_type", Integer.valueOf(this.c));
        if (iIntValue >= 42060) {
            dqru.v(contentValues, "cms_correlation_id", this.d);
        }
        if (iIntValue >= 35020) {
            dqru.v(contentValues, "cms_id", this.e);
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bnbn bnbnVar = (bnbn) ((bnbh) dqqjVar);
        aC();
        this.cN = bnbnVar.cV();
        if (bnbnVar.dj(0)) {
            this.a = bnbnVar.g();
            fN(0);
        }
        if (bnbnVar.dj(1)) {
            this.b = bnbnVar.f();
            fN(1);
        }
        if (bnbnVar.dj(2)) {
            this.c = bnbnVar.h();
            fN(2);
        }
        if (bnbnVar.dj(3)) {
            this.d = bnbnVar.c();
            fN(3);
        }
        if (bnbnVar.dj(4)) {
            this.e = bnbnVar.e();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnar)) {
            return false;
        }
        bnar bnarVar = (bnar) obj;
        return super.aE(bnarVar.cN) && this.a == bnarVar.a && Arrays.equals(this.b, bnarVar.b) && this.c == bnarVar.c && Objects.equals(this.d, bnarVar.d) && Objects.equals(this.e, bnarVar.e);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms", dqru.m(new String[]{"key_index", "encryption_key", "key_type", "cms_correlation_id", "cms_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "cms";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c), this.d, this.e, null);
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
            int r0 = r8.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            byte[] r1 = r8.b
            int r2 = r8.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = r8.d
            java.lang.String r4 = r8.e
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnar.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final int k() {
        aA(0, "key_index");
        return this.a;
    }

    public final int m() {
        aA(2, "key_type");
        return this.c;
    }

    public final Long n() {
        final dqsy dqsyVarB = bncb.b();
        return Long.valueOf(dqru.b(bncb.b(), "cms", this, new Function() { // from class: bnan
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.P("cms", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bnao
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final String o() {
        aA(3, "cms_correlation_id");
        return this.d;
    }

    public final String p() {
        aA(4, "cms_id");
        return this.e;
    }

    public final byte[] q() {
        aA(1, "encryption_key");
        return this.b;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "CmsTable -- REDACTED") : a();
    }
}
