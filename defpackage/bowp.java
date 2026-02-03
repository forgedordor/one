package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bowp extends dqpd implements dqpf {
    public long a;
    public String b;
    public byte[] h;
    public byte[] l;
    public byte[] m;
    public bveb n;
    public byte[] t;
    public String u;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public String f = "";
    public boolean g = false;
    public String i = "";
    public String j = "";
    public int k = 0;
    public boolean o = false;
    public String p = "";
    public boolean q = false;
    public bvdm r = bvdm.WEB;
    public bvdu s = bvdu.ANONYMOUS;
    public long v = 0;
    public long w = 0;

    protected bowp() {
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
        String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        String strValueOf8 = String.valueOf(this.i);
        String strValueOf9 = String.valueOf(this.j);
        String strValueOf10 = String.valueOf(this.k);
        byte[] bArr2 = this.l;
        String strConcat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        byte[] bArr3 = this.m;
        String strConcat3 = "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL"));
        String strValueOf11 = String.valueOf(this.n);
        String strValueOf12 = String.valueOf(this.o);
        String strValueOf13 = String.valueOf(this.p);
        String strValueOf14 = String.valueOf(this.q);
        String strValueOf15 = String.valueOf(this.r);
        String strValueOf16 = String.valueOf(this.s);
        byte[] bArr4 = this.t;
        return String.format(locale, "DeskTopTable [_id: %s,\n  desktop_id: %s,\n  last_connection_time: %s,\n  last_wakeup_time: %s,\n  wakeup_attempts_count: %s,\n  fingerprint: %s,\n  force_refresh: %s,\n  client_info: %s,\n  operating_system: %s,\n  operating_system_version: %s,\n  browser_type: %s,\n  encryption_key: %s,\n  hmac_key: %s,\n  backend_type: %s,\n  is_active: %s,\n  request_id: %s,\n  is_persistent: %s,\n  desktop_type: %s,\n  pairing_type: %s,\n  destination_registration_id: %s,\n  gaia_email: %s,\n  creation_time: %s,\n  get_updates_request_time_millis: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strConcat, strValueOf8, strValueOf9, strValueOf10, strConcat2, strConcat3, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, "BLOB".concat(String.valueOf(bArr4 != null ? String.valueOf(bArr4.length) : "NULL")), "REDACTED", String.valueOf(this.v), String.valueOf(this.w));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bpab.c().intValue();
        dqru.v(contentValues, "desktop_id", this.b);
        contentValues.put("last_connection_time", Long.valueOf(this.c));
        contentValues.put("last_wakeup_time", Long.valueOf(this.d));
        contentValues.put("wakeup_attempts_count", Long.valueOf(this.e));
        dqru.v(contentValues, "fingerprint", this.f);
        contentValues.put("force_refresh", Boolean.valueOf(this.g));
        contentValues.put("client_info", this.h);
        if (iIntValue >= 22040) {
            dqru.v(contentValues, "operating_system", this.i);
        }
        if (iIntValue >= 22040) {
            dqru.v(contentValues, "operating_system_version", this.j);
        }
        if (iIntValue >= 18020) {
            contentValues.put("browser_type", Integer.valueOf(this.k));
        }
        if (iIntValue >= 21030) {
            contentValues.put("encryption_key", this.l);
        }
        if (iIntValue >= 21030) {
            contentValues.put("hmac_key", this.m);
        }
        if (iIntValue >= 41010) {
            bveb bvebVar = this.n;
            if (bvebVar == null) {
                contentValues.putNull("backend_type");
            } else {
                contentValues.put("backend_type", Integer.valueOf(bvebVar.ordinal()));
            }
        }
        if (iIntValue >= 58010) {
            contentValues.put("is_active", Boolean.valueOf(this.o));
        }
        if (iIntValue >= 58010) {
            dqru.v(contentValues, "request_id", this.p);
        }
        if (iIntValue >= 58010) {
            contentValues.put("is_persistent", Boolean.valueOf(this.q));
        }
        if (iIntValue >= 58010) {
            bvdm bvdmVar = this.r;
            if (bvdmVar == null) {
                contentValues.putNull("desktop_type");
            } else {
                contentValues.put("desktop_type", Integer.valueOf(bvdmVar.ordinal()));
            }
        }
        if (iIntValue >= 58960) {
            bvdu bvduVar = this.s;
            if (bvduVar == null) {
                contentValues.putNull("pairing_type");
            } else {
                contentValues.put("pairing_type", Integer.valueOf(bvduVar.ordinal()));
            }
        }
        if (iIntValue >= 59290) {
            contentValues.put("destination_registration_id", this.t);
        }
        if (iIntValue >= 59560) {
            dqru.v(contentValues, "gaia_email", this.u);
        }
        if (iIntValue >= 59870) {
            contentValues.put("creation_time", Long.valueOf(this.v));
        }
        if (iIntValue >= 60540) {
            contentValues.put("get_updates_request_time_millis", Long.valueOf(this.w));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bozn boznVar = (bozn) ((boyp) dqqjVar);
        aC();
        this.cN = boznVar.cV();
        if (boznVar.dj(0)) {
            this.a = boznVar.q();
            fN(0);
        }
        if (boznVar.dj(1)) {
            this.b = boznVar.i();
            fN(1);
        }
        if (boznVar.dj(2)) {
            this.c = boznVar.e();
            fN(2);
        }
        if (boznVar.dj(3)) {
            this.d = boznVar.f();
            fN(3);
        }
        if (boznVar.dj(4)) {
            this.e = boznVar.r();
            fN(4);
        }
        if (boznVar.dj(5)) {
            this.f = boznVar.u();
            fN(5);
        }
        if (boznVar.dj(6)) {
            this.g = boznVar.x();
            fN(6);
        }
        if (boznVar.dj(7)) {
            this.h = boznVar.z();
            fN(7);
        }
        if (boznVar.dj(8)) {
            this.i = boznVar.v();
            fN(8);
        }
        if (boznVar.dj(9)) {
            this.j = boznVar.w();
            fN(9);
        }
        if (boznVar.dj(10)) {
            this.k = boznVar.o();
            fN(10);
        }
        if (boznVar.dj(11)) {
            this.l = boznVar.m();
            fN(11);
        }
        if (boznVar.dj(12)) {
            this.m = boznVar.n();
            fN(12);
        }
        if (boznVar.dj(13)) {
            this.n = boznVar.t();
            fN(13);
        }
        if (boznVar.dj(14)) {
            this.o = boznVar.y();
            fN(14);
        }
        if (boznVar.dj(15)) {
            this.p = boznVar.k();
            fN(15);
        }
        if (boznVar.dj(16)) {
            this.q = boznVar.l();
            fN(16);
        }
        if (boznVar.dj(17)) {
            this.r = boznVar.g();
            fN(17);
        }
        if (boznVar.dj(18)) {
            this.s = boznVar.s();
            fN(18);
        }
        if (boznVar.dj(19)) {
            this.t = boznVar.A();
            fN(19);
        }
        if (boznVar.dj(20)) {
            this.u = boznVar.j();
            fN(20);
        }
        if (boznVar.dj(21)) {
            this.v = boznVar.p();
            fN(21);
        }
        if (boznVar.dj(22)) {
            this.w = boznVar.c();
            fN(22);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bowp)) {
            return false;
        }
        bowp bowpVar = (bowp) obj;
        return super.aE(bowpVar.cN) && this.a == bowpVar.a && Objects.equals(this.b, bowpVar.b) && this.c == bowpVar.c && this.d == bowpVar.d && this.e == bowpVar.e && Objects.equals(this.f, bowpVar.f) && this.g == bowpVar.g && Arrays.equals(this.h, bowpVar.h) && Objects.equals(this.i, bowpVar.i) && Objects.equals(this.j, bowpVar.j) && this.k == bowpVar.k && Arrays.equals(this.l, bowpVar.l) && Arrays.equals(this.m, bowpVar.m) && this.n == bowpVar.n && this.o == bowpVar.o && Objects.equals(this.p, bowpVar.p) && this.q == bowpVar.q && this.r == bowpVar.r && this.s == bowpVar.s && Arrays.equals(this.t, bowpVar.t) && Objects.equals(this.u, bowpVar.u) && this.v == bowpVar.v && this.w == bowpVar.w;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "desktop", dqru.m(new String[]{"desktop_id", "last_connection_time", "last_wakeup_time", "wakeup_attempts_count", "fingerprint", "force_refresh", "client_info", "operating_system", "operating_system_version", "browser_type", "encryption_key", "hmac_key", "backend_type", "is_active", "request_id", "is_persistent", "desktop_type", "pairing_type", "destination_registration_id", "gaia_email", "creation_time", "get_updates_request_time_millis"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "desktop";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        String str = this.b;
        Long lValueOf2 = Long.valueOf(this.c);
        Long lValueOf3 = Long.valueOf(this.d);
        Long lValueOf4 = Long.valueOf(this.e);
        String str2 = this.f;
        Boolean boolValueOf = Boolean.valueOf(this.g);
        Integer numValueOf = Integer.valueOf(Arrays.hashCode(this.h));
        String str3 = this.i;
        String str4 = this.j;
        Integer numValueOf2 = Integer.valueOf(this.k);
        Integer numValueOf3 = Integer.valueOf(Arrays.hashCode(this.l));
        Integer numValueOf4 = Integer.valueOf(Arrays.hashCode(this.m));
        bveb bvebVar = this.n;
        Integer numValueOf5 = Integer.valueOf(bvebVar == null ? 0 : bvebVar.ordinal());
        dqqe dqqeVar3 = dqqeVar2;
        Boolean boolValueOf2 = Boolean.valueOf(this.o);
        String str5 = this.p;
        Boolean boolValueOf3 = Boolean.valueOf(this.q);
        bvdm bvdmVar = this.r;
        Integer numValueOf6 = Integer.valueOf(bvdmVar == null ? 0 : bvdmVar.ordinal());
        bvdu bvduVar = this.s;
        return Objects.hash(dqqeVar3, lValueOf, str, lValueOf2, lValueOf3, lValueOf4, str2, boolValueOf, numValueOf, str3, str4, numValueOf2, numValueOf3, numValueOf4, numValueOf5, boolValueOf2, str5, boolValueOf3, numValueOf6, Integer.valueOf(bvduVar == null ? 0 : bvduVar.ordinal()), Integer.valueOf(Arrays.hashCode(this.t)), this.u, Long.valueOf(this.v), Long.valueOf(this.w), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        String str = this.b;
        Long lValueOf = Long.valueOf(this.c);
        Long lValueOf2 = Long.valueOf(this.d);
        Long lValueOf3 = Long.valueOf(this.e);
        String str2 = this.f;
        Integer numValueOf = Integer.valueOf(this.g ? 1 : 0);
        byte[] bArr = this.h;
        String str3 = this.i;
        String str4 = this.j;
        Integer numValueOf2 = Integer.valueOf(this.k);
        byte[] bArr2 = this.l;
        byte[] bArr3 = this.m;
        bveb bvebVar = this.n;
        Object objValueOf = bvebVar == null ? 0 : String.valueOf(bvebVar.ordinal());
        Integer numValueOf3 = Integer.valueOf(this.o ? 1 : 0);
        String str5 = this.p;
        Integer numValueOf4 = Integer.valueOf(this.q ? 1 : 0);
        bvdm bvdmVar = this.r;
        Object objValueOf2 = bvdmVar == null ? 0 : String.valueOf(bvdmVar.ordinal());
        bvdu bvduVar = this.s;
        Object[] objArr = {str, lValueOf, lValueOf2, lValueOf3, str2, numValueOf, bArr, str3, str4, numValueOf2, bArr2, bArr3, objValueOf, numValueOf3, str5, numValueOf4, objValueOf2, bvduVar != null ? String.valueOf(bvduVar.ordinal()) : 0, this.t, this.u, Long.valueOf(this.v), Long.valueOf(this.w)};
        sb.append('(');
        for (int i = 0; i < 22; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str6 = (String) obj;
                    if (str6.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str6));
                    }
                }
                list.add(obj);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final int k() {
        aA(10, "browser_type");
        return this.k;
    }

    public final long m() {
        aA(0, "_id");
        return this.a;
    }

    public final long n() {
        aA(2, "last_connection_time");
        return this.c;
    }

    public final bvdm o() {
        aA(17, "desktop_type");
        return this.r;
    }

    public final bvdu p() {
        aA(18, "pairing_type");
        return this.s;
    }

    public final String q() {
        aA(1, "desktop_id");
        return this.b;
    }

    public final String r() {
        aA(20, "gaia_email");
        return this.u;
    }

    public final String s() {
        aA(8, "operating_system");
        return this.i;
    }

    public final String t() {
        aA(9, "operating_system_version");
        return this.j;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "DeskTopTable -- REDACTED") : a();
    }

    public final byte[] u() {
        aA(19, "destination_registration_id");
        return this.t;
    }

    public final void v() {
        final dqsy dqsyVarB = bpab.b();
        dqru.b(bpab.b(), "desktop", this, new Function() { // from class: bown
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.Q("desktop", (dqst) obj, 5));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bowo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bowp bowpVar = this.a;
                    bowpVar.a = l.longValue();
                    bowpVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
