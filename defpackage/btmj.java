package defpackage;

import android.content.ContentValues;
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
public class btmj extends dqpd implements dqpf {
    public String a;
    public Instant b = bart.b(0);
    public Instant c = bart.b(0);

    protected btmj() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RemoteUserIdInfoTable [remote_user_id: %s,\n  last_modified_timestamp: %s,\n  guaranteed_fresh_as_of_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "remote_user_id", this.a);
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("last_modified_timestamp");
        } else {
            contentValues.put("last_modified_timestamp", Long.valueOf(bart.a(instant)));
        }
        Instant instant2 = this.c;
        if (instant2 == null) {
            contentValues.putNull("guaranteed_fresh_as_of_timestamp");
        } else {
            contentValues.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(bart.a(instant2)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btmz btmzVar = (btmz) ((btmv) dqqjVar);
        aC();
        this.cN = btmzVar.cV();
        if (btmzVar.dj(0)) {
            this.a = btmzVar.f();
            fN(0);
        }
        if (btmzVar.dj(1)) {
            this.b = btmzVar.e();
            fN(1);
        }
        if (btmzVar.dj(2)) {
            this.c = btmzVar.c();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btmj)) {
            return false;
        }
        btmj btmjVar = (btmj) obj;
        return super.aE(btmjVar.cN) && Objects.equals(this.a, btmjVar.a) && Objects.equals(this.b, btmjVar.b) && Objects.equals(this.c, btmjVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_user_id_info_table", dqru.m(new String[]{"remote_user_id", "last_modified_timestamp", "guaranteed_fresh_as_of_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "remote_user_id_info_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            java.lang.String r0 = r7.a
            j$.time.Instant r1 = r7.b
            long r1 = defpackage.bart.a(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            j$.time.Instant r2 = r7.c
            long r2 = defpackage.bart.a(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 40
            r8.append(r0)
        L27:
            if (r5 >= r3) goto L5e
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L37
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L56
        L37:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4e
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L4e
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L56
        L4e:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L56:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L27
        L5e:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btmj.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final Instant k() {
        aA(2, "guaranteed_fresh_as_of_timestamp");
        return this.c;
    }

    public final String m() {
        aA(0, "remote_user_id");
        return this.a;
    }

    public final void n() {
        final dqsy dqsyVarB = btnj.b();
        dqru.b(btnj.b(), "remote_user_id_info_table", this, new Function() { // from class: btmh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.Q("remote_user_id_info_table", (dqst) obj, 5));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btmi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RemoteUserIdInfoTable -- REDACTED") : a();
    }
}
