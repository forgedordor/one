package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awvq extends dqpd implements dqpf {
    public String c;
    public awxl e;
    public String f;
    public String g;
    public axcm a = null;
    public axcm b = null;
    public boolean d = false;

    protected awvq() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MyIdentitiesTable [token: %s,\n  canonical_token: %s,\n  provisioning_id_v2: %s,\n  is_verified_v2: %s,\n  address_type: %s,\n  phone_number: %s,\n  display_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = awxh.c().intValue();
        axcm axcmVar = this.a;
        if (axcmVar == null) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", axcn.b(axcmVar));
        }
        if (iIntValue >= 60530) {
            axcm axcmVar2 = this.b;
            if (axcmVar2 == null || axcmVar2.equals(null)) {
                contentValues.putNull("canonical_token");
            } else {
                contentValues.put("canonical_token", axcn.b(this.b));
            }
        }
        if (iIntValue >= 60810) {
            dqru.v(contentValues, "provisioning_id_v2", this.c);
        }
        if (iIntValue >= 60810) {
            contentValues.put("is_verified_v2", Boolean.valueOf(this.d));
        }
        if (iIntValue >= 59980) {
            awxl awxlVar = this.e;
            if (awxlVar == null) {
                contentValues.putNull("address_type");
            } else {
                contentValues.put("address_type", Integer.valueOf(awxlVar.ordinal()));
            }
        }
        dqru.v(contentValues, "phone_number", this.f);
        if (iIntValue >= 60120) {
            dqru.v(contentValues, "display_name", this.g);
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        awwv awwvVar = (awwv) ((awwn) dqqjVar);
        aC();
        this.cN = awwvVar.cV();
        if (awwvVar.dj(0)) {
            this.a = awwvVar.g();
            fN(0);
        }
        if (awwvVar.dj(1)) {
            this.b = awwvVar.f();
            fN(1);
        }
        if (awwvVar.dj(2)) {
            this.c = awwvVar.j();
            fN(2);
        }
        if (awwvVar.dj(3)) {
            this.d = awwvVar.k();
            fN(3);
        }
        if (awwvVar.dj(4)) {
            this.e = awwvVar.e();
            fN(4);
        }
        if (awwvVar.dj(5)) {
            this.f = awwvVar.h();
            fN(5);
        }
        if (awwvVar.dj(6)) {
            this.g = awwvVar.i();
            fN(6);
        }
    }

    public final axcm d() {
        aA(0, "token");
        return this.a;
    }

    public final String e() {
        aA(5, "phone_number");
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awvq)) {
            return false;
        }
        awvq awvqVar = (awvq) obj;
        return super.aE(awvqVar.cN) && Objects.equals(this.a, awvqVar.a) && Objects.equals(this.b, awvqVar.b) && Objects.equals(this.c, awvqVar.c) && this.d == awvqVar.d && this.e == awvqVar.e && Objects.equals(this.f, awvqVar.f) && Objects.equals(this.g, awvqVar.g);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "my_identities", dqru.m(new String[]{"token", "canonical_token", "provisioning_id_v2", "is_verified_v2", "address_type", "phone_number", "display_name"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "my_identities";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        axcm axcmVar = this.a;
        axcm axcmVar2 = this.b;
        String str = this.c;
        Boolean boolValueOf = Boolean.valueOf(this.d);
        awxl awxlVar = this.e;
        return Objects.hash(dqqeVar2, axcmVar, axcmVar2, str, boolValueOf, Integer.valueOf(awxlVar == null ? 0 : awxlVar.ordinal()), this.f, this.g, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r11, java.util.List r12) {
        /*
            r10 = this;
            axcm r0 = r10.a
            java.lang.String r0 = defpackage.axcn.b(r0)
            awvp r1 = new awvp
            r1.<init>(r10)
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = r10.c
            boolean r3 = r10.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            awxl r4 = r10.e
            r5 = 0
            if (r4 != 0) goto L21
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L29
        L21:
            int r4 = r4.ordinal()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L29:
            java.lang.String r6 = r10.f
            java.lang.String r7 = r10.g
            r8 = 7
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r5] = r0
            r0 = 1
            r9[r0] = r1
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r3
            r0 = 4
            r9[r0] = r4
            r0 = 5
            r9[r0] = r6
            r0 = 6
            r9[r0] = r7
            r0 = 40
            r11.append(r0)
        L49:
            if (r5 >= r8) goto L80
            r0 = r9[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L59
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.append(r0)
            goto L78
        L59:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L70
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L70
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r11.append(r0)
            goto L78
        L70:
            r12.add(r0)
            r0 = 63
            r11.append(r0)
        L78:
            r0 = 44
            r11.append(r0)
            int r5 = r5 + 1
            goto L49
        L80:
            int r12 = r11.length()
            int r12 = r12 + (-1)
            r11.setLength(r12)
            r12 = 41
            r11.append(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awvq.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final void k() {
        final dqsy dqsyVarB = awxh.b();
        dqru.b(awxh.b(), "my_identities", this, new Function() { // from class: awvn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.P("my_identities", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: awvo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MyIdentitiesTable -- REDACTED") : a();
    }
}
