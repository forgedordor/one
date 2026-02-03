package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpfv extends dqpd implements dqpf {
    public byte[] b;
    public byte[] c;
    public int d;
    public byte[] e;
    public byte[] f;
    public int g;
    public Uri i;
    public String j;
    public byte[] k;
    public byte[] l;
    public String m;
    public String o;
    public String p;
    public String q;
    public epwa r;
    public basd a = basd.a;
    public Instant h = bart.b(0);
    public Instant n = Instant.EPOCH;

    protected bpfv() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        byte[] bArr = this.b;
        String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.c;
        String strConcat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        String strValueOf2 = String.valueOf(this.d);
        byte[] bArr3 = this.e;
        String strConcat3 = "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL"));
        byte[] bArr4 = this.f;
        String strConcat4 = "BLOB".concat(String.valueOf(bArr4 != null ? String.valueOf(bArr4.length) : "NULL"));
        String strValueOf3 = String.valueOf(this.g);
        String strValueOf4 = String.valueOf(this.h);
        String strValueOf5 = String.valueOf(this.i);
        String strValueOf6 = String.valueOf(this.j);
        byte[] bArr5 = this.k;
        String strConcat5 = "BLOB".concat(String.valueOf(bArr5 != null ? String.valueOf(bArr5.length) : "NULL"));
        byte[] bArr6 = this.l;
        return String.format(locale, "EtouffeeRcsMetadataTable [rcs_message_id: %s,\n  preview_etouffee: %s,\n  preview_summary: %s,\n  preview_version: %s,\n  attachment_etouffee: %s,\n  attachment_summary: %s,\n  attachment_version: %s,\n  creation_timestamp: %s,\n  attachment_uri: %s,\n  custom_delivery_receipt_mime_type: %s,\n  custom_delivery_receipt_content: %s,\n  file_uploaded_xml_from_content_server: %s,\n  file_uploaded_fallback_uri: %s,\n  file_uploaded_expiry: %s,\n  plaintext_attachment_name: %s,\n  plaintext_attachment_content_type: %s,\n  plaintext_thumbnail_content_type: %s,\n  mls_file_info: %s\n]\n", strValueOf, strConcat, strConcat2, strValueOf2, strConcat3, strConcat4, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strConcat5, "BLOB".concat(String.valueOf(bArr6 != null ? String.valueOf(bArr6.length) : "NULL")), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bpio.c().intValue();
        basd basdVar = this.a;
        if (basdVar == null || basdVar.equals(basd.a)) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", basd.d(this.a));
        }
        contentValues.put("preview_etouffee", this.b);
        contentValues.put("preview_summary", this.c);
        contentValues.put("preview_version", Integer.valueOf(this.d));
        contentValues.put("attachment_etouffee", this.e);
        contentValues.put("attachment_summary", this.f);
        contentValues.put("attachment_version", Integer.valueOf(this.g));
        Instant instant = this.h;
        if (instant == null) {
            contentValues.putNull("creation_timestamp");
        } else {
            contentValues.put("creation_timestamp", Long.valueOf(bart.a(instant)));
        }
        if (iIntValue >= 35060) {
            Uri uri = this.i;
            if (uri == null) {
                contentValues.putNull("attachment_uri");
            } else {
                contentValues.put("attachment_uri", uri.toString());
            }
        }
        if (iIntValue >= 37020) {
            dqru.v(contentValues, "custom_delivery_receipt_mime_type", this.j);
        }
        if (iIntValue >= 37020) {
            contentValues.put("custom_delivery_receipt_content", this.k);
        }
        if (iIntValue >= 48010) {
            contentValues.put("file_uploaded_xml_from_content_server", this.l);
        }
        if (iIntValue >= 48010) {
            dqru.v(contentValues, "file_uploaded_fallback_uri", this.m);
        }
        if (iIntValue >= 48010) {
            Instant instant2 = this.n;
            if (instant2 == null) {
                contentValues.putNull("file_uploaded_expiry");
            } else {
                contentValues.put("file_uploaded_expiry", Long.valueOf(bart.a(instant2)));
            }
        }
        if (iIntValue >= 56020) {
            dqru.v(contentValues, "plaintext_attachment_name", this.o);
        }
        if (iIntValue >= 56020) {
            dqru.v(contentValues, "plaintext_attachment_content_type", this.p);
        }
        if (iIntValue >= 56020) {
            dqru.v(contentValues, "plaintext_thumbnail_content_type", this.q);
        }
        if (iIntValue >= 60700) {
            epwa epwaVar = this.r;
            if (epwaVar == null) {
                contentValues.putNull("mls_file_info");
            } else {
                contentValues.put("mls_file_info", epwaVar.toByteArray());
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpig bpigVar = (bpig) ((bphn) dqqjVar);
        aC();
        this.cN = bpigVar.cV();
        if (bpigVar.dj(0)) {
            this.a = bpigVar.f();
            fN(0);
        }
        if (bpigVar.dj(1)) {
            this.b = bpigVar.n();
            fN(1);
        }
        if (bpigVar.dj(2)) {
            this.c = bpigVar.m();
            fN(2);
        }
        if (bpigVar.dj(3)) {
            this.d = bpigVar.e();
            fN(3);
        }
        if (bpigVar.dj(4)) {
            this.e = bpigVar.l();
            fN(4);
        }
        if (bpigVar.dj(5)) {
            this.f = bpigVar.k();
            fN(5);
        }
        if (bpigVar.dj(6)) {
            this.g = bpigVar.c();
            fN(6);
        }
        if (bpigVar.dj(7)) {
            this.h = bpigVar.p();
            fN(7);
        }
        if (bpigVar.dj(8)) {
            this.i = bpigVar.o();
            fN(8);
        }
        if (bpigVar.dj(9)) {
            this.j = bpigVar.r();
            fN(9);
        }
        if (bpigVar.dj(10)) {
            this.k = bpigVar.t();
            fN(10);
        }
        if (bpigVar.dj(11)) {
            this.l = bpigVar.u();
            fN(11);
        }
        if (bpigVar.dj(12)) {
            this.m = bpigVar.s();
            fN(12);
        }
        if (bpigVar.dj(13)) {
            this.n = bpigVar.q();
            fN(13);
        }
        if (bpigVar.dj(14)) {
            this.o = bpigVar.i();
            fN(14);
        }
        if (bpigVar.dj(15)) {
            this.p = bpigVar.h();
            fN(15);
        }
        if (bpigVar.dj(16)) {
            this.q = bpigVar.j();
            fN(16);
        }
        if (bpigVar.dj(17)) {
            this.r = bpigVar.g();
            fN(17);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpfv)) {
            return false;
        }
        bpfv bpfvVar = (bpfv) obj;
        return super.aE(bpfvVar.cN) && Objects.equals(this.a, bpfvVar.a) && Arrays.equals(this.b, bpfvVar.b) && Arrays.equals(this.c, bpfvVar.c) && this.d == bpfvVar.d && Arrays.equals(this.e, bpfvVar.e) && Arrays.equals(this.f, bpfvVar.f) && this.g == bpfvVar.g && Objects.equals(this.h, bpfvVar.h) && Objects.equals(this.i, bpfvVar.i) && Objects.equals(this.j, bpfvVar.j) && Arrays.equals(this.k, bpfvVar.k) && Arrays.equals(this.l, bpfvVar.l) && Objects.equals(this.m, bpfvVar.m) && Objects.equals(this.n, bpfvVar.n) && Objects.equals(this.o, bpfvVar.o) && Objects.equals(this.p, bpfvVar.p) && Objects.equals(this.q, bpfvVar.q) && Objects.equals(this.r, bpfvVar.r);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "etouffee_rcs_metadata", dqru.m(new String[]{"rcs_message_id", "preview_etouffee", "preview_summary", "preview_version", "attachment_etouffee", "attachment_summary", "attachment_version", "creation_timestamp", "attachment_uri", "custom_delivery_receipt_mime_type", "custom_delivery_receipt_content", "file_uploaded_xml_from_content_server", "file_uploaded_fallback_uri", "file_uploaded_expiry", "plaintext_attachment_name", "plaintext_attachment_content_type", "plaintext_thumbnail_content_type", "mls_file_info"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "etouffee_rcs_metadata";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, this.o, this.p, this.q, this.r, null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object obj = new bpfu(this).get();
        byte[] bArr = this.b;
        byte[] bArr2 = this.c;
        Integer numValueOf = Integer.valueOf(this.d);
        byte[] bArr3 = this.e;
        byte[] bArr4 = this.f;
        Integer numValueOf2 = Integer.valueOf(this.g);
        Long lValueOf = Long.valueOf(bart.a(this.h));
        Uri uri = this.i;
        String string = uri == null ? null : uri.toString();
        String str = this.j;
        byte[] bArr5 = this.k;
        byte[] bArr6 = this.l;
        String str2 = this.m;
        Long lValueOf2 = Long.valueOf(bart.a(this.n));
        String str3 = this.o;
        String str4 = this.p;
        String str5 = this.q;
        epwa epwaVar = this.r;
        Object[] objArr = {obj, bArr, bArr2, numValueOf, bArr3, bArr4, numValueOf2, lValueOf, string, str, bArr5, bArr6, str2, lValueOf2, str3, str4, str5, epwaVar == null ? null : epwaVar.toByteArray()};
        sb.append('(');
        for (int i = 0; i < 18; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str6 = (String) obj2;
                    if (str6.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str6));
                    }
                }
                list.add(obj2);
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

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "EtouffeeRcsMetadataTable -- REDACTED") : a();
    }
}
