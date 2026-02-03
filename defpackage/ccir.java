package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dqpd;
import j$.time.Instant;
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
public class ccir extends dqpd implements dqpf {
    public basd a;
    public basd b;
    public byte[] c;
    public byte[] d;
    public Instant e;
    public String f;
    public String g;
    public long h;
    public long i;
    public byte[] j;
    public athh k;

    protected ccir() {
        basd basdVar = basd.a;
        this.a = basdVar;
        this.b = basdVar;
        this.e = Instant.EPOCH;
        this.k = null;
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        byte[] bArr = this.c;
        String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.d;
        String strConcat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        String strValueOf3 = String.valueOf(this.e);
        String strValueOf4 = String.valueOf(this.f);
        String strValueOf5 = String.valueOf(this.g);
        String strValueOf6 = String.valueOf(this.h);
        String strValueOf7 = String.valueOf(this.i);
        byte[] bArr3 = this.j;
        return String.format(locale, "MlsMessagesTable [rcs_message_id: %s,\n  original_rcs_message_id: %s,\n  raw_cpim_content: %s,\n  encrypted_cpim_content: %s,\n  encryption_timestamp: %s,\n  self_identity_id: %s,\n  mls_group_id: %s,\n  mls_epoch_id: %s,\n  mls_era_id: %s,\n  epoch_authenticator: %s,\n  file_processing_id: %s\n]\n", strValueOf, strValueOf2, strConcat, strConcat2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL")), String.valueOf(this.k));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = cckr.c().intValue();
        basd basdVar = this.a;
        if (basdVar == null) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", basd.d(basdVar));
        }
        basd basdVar2 = this.b;
        if (basdVar2 == null) {
            contentValues.putNull("original_rcs_message_id");
        } else {
            contentValues.put("original_rcs_message_id", basd.d(basdVar2));
        }
        contentValues.put("raw_cpim_content", this.c);
        contentValues.put("encrypted_cpim_content", this.d);
        Instant instant = this.e;
        if (instant == null) {
            contentValues.putNull("encryption_timestamp");
        } else {
            contentValues.put("encryption_timestamp", Long.valueOf(bart.a(instant)));
        }
        dqru.v(contentValues, "self_identity_id", this.f);
        dqru.v(contentValues, "mls_group_id", this.g);
        contentValues.put("mls_epoch_id", Long.valueOf(this.h));
        contentValues.put("mls_era_id", Long.valueOf(this.i));
        contentValues.put("epoch_authenticator", this.j);
        if (iIntValue >= 60960) {
            athh athhVar = this.k;
            if (athhVar == null) {
                contentValues.putNull("file_processing_id");
            } else {
                contentValues.put("file_processing_id", athg.b(athhVar));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        cckf cckfVar = (cckf) ((ccjt) dqqjVar);
        aC();
        this.cN = cckfVar.cV();
        if (cckfVar.dj(0)) {
            this.a = cckfVar.i();
            fN(0);
        }
        if (cckfVar.dj(1)) {
            this.b = cckfVar.h();
            fN(1);
        }
        if (cckfVar.dj(2)) {
            this.c = cckfVar.o();
            fN(2);
        }
        if (cckfVar.dj(3)) {
            this.d = cckfVar.m();
            fN(3);
        }
        if (cckfVar.dj(4)) {
            this.e = cckfVar.j();
            fN(4);
        }
        if (cckfVar.dj(5)) {
            this.f = cckfVar.l();
            fN(5);
        }
        if (cckfVar.dj(6)) {
            this.g = cckfVar.k();
            fN(6);
        }
        if (cckfVar.dj(7)) {
            this.h = cckfVar.e();
            fN(7);
        }
        if (cckfVar.dj(8)) {
            this.i = cckfVar.f();
            fN(8);
        }
        if (cckfVar.dj(9)) {
            this.j = cckfVar.n();
            fN(9);
        }
        if (cckfVar.dj(10)) {
            this.k = cckfVar.g();
            fN(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ccir)) {
            return false;
        }
        ccir ccirVar = (ccir) obj;
        return super.aE(ccirVar.cN) && Objects.equals(this.a, ccirVar.a) && Objects.equals(this.b, ccirVar.b) && Arrays.equals(this.c, ccirVar.c) && Arrays.equals(this.d, ccirVar.d) && Objects.equals(this.e, ccirVar.e) && Objects.equals(this.f, ccirVar.f) && Objects.equals(this.g, ccirVar.g) && this.h == ccirVar.h && this.i == ccirVar.i && Arrays.equals(this.j, ccirVar.j) && Objects.equals(this.k, ccirVar.k);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "mls_messages", dqru.m(new String[]{"rcs_message_id", "original_rcs_message_id", "raw_cpim_content", "encrypted_cpim_content", "encryption_timestamp", "self_identity_id", "mls_group_id", "mls_epoch_id", "mls_era_id", "epoch_authenticator", "file_processing_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "mls_messages";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), this.e, this.f, this.g, Long.valueOf(this.h), Long.valueOf(this.i), Integer.valueOf(Arrays.hashCode(this.j)), this.k, null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {basd.d(this.a), basd.d(this.b), this.c, this.d, Long.valueOf(bart.a(this.e)), this.f, this.g, Long.valueOf(this.h), Long.valueOf(this.i), this.j, athg.b(this.k)};
        sb.append('(');
        for (int i = 0; i < 11; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
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

    public final long k() {
        aA(7, "mls_epoch_id");
        return this.h;
    }

    public final athh m() {
        aA(10, "file_processing_id");
        return this.k;
    }

    public final basd n() {
        aA(0, "rcs_message_id");
        return this.a;
    }

    public final String o() {
        aA(6, "mls_group_id");
        return this.g;
    }

    public final String p() {
        aA(5, "self_identity_id");
        return this.f;
    }

    public final byte[] q() {
        aA(3, "encrypted_cpim_content");
        return this.d;
    }

    public final byte[] r() {
        aA(2, "raw_cpim_content");
        return this.c;
    }

    public final void s() {
        final dqsy dqsyVarB = cckr.b();
        dqru.b(cckr.b(), "mls_messages", this, new Function() { // from class: ccip
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.P("mls_messages", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: cciq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MlsMessagesTable -- REDACTED") : a();
    }
}
