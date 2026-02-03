package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpvd extends dqpd implements dqpf {
    public long a;
    public String c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public MessageIdType b = bary.a;
    public long d = 0;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;

    protected bpvd() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "LinkPreviewTable [_id: %s,\n  message_id: %s,\n  trigger_url: %s,\n  expiration_time_millis: %s,\n  link_title: %s,\n  link_description: %s,\n  link_image_url: %s,\n  link_domain: %s,\n  link_canonical_url: %s,\n  link_preview_prevented: %s,\n  link_preview_failed: %s,\n  deferred: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bpxj.d().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        dqru.v(contentValues, "trigger_url", this.c);
        contentValues.put("expiration_time_millis", Long.valueOf(this.d));
        dqru.v(contentValues, "link_title", this.e);
        dqru.v(contentValues, "link_description", this.f);
        dqru.v(contentValues, "link_image_url", this.g);
        dqru.v(contentValues, "link_domain", this.h);
        dqru.v(contentValues, "link_canonical_url", this.i);
        if (iIntValue >= 21010) {
            contentValues.put("link_preview_prevented", Boolean.valueOf(this.j));
        }
        if (iIntValue >= 22020) {
            contentValues.put("link_preview_failed", Boolean.valueOf(this.k));
        }
        if (iIntValue >= 61000) {
            contentValues.put("deferred", Boolean.valueOf(this.l));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpwx bpwxVar = (bpwx) ((bpwk) dqqjVar);
        aC();
        this.cN = bpwxVar.cV();
        if (bpwxVar.dj(0)) {
            this.a = bpwxVar.e();
            super.fN(0);
        }
        if (bpwxVar.dj(1)) {
            this.b = bpwxVar.f();
            super.fN(1);
        }
        if (bpwxVar.dj(2)) {
            this.c = bpwxVar.l();
            super.fN(2);
        }
        if (bpwxVar.dj(3)) {
            this.d = bpwxVar.c();
            super.fN(3);
        }
        if (bpwxVar.dj(4)) {
            this.e = bpwxVar.k();
            super.fN(4);
        }
        if (bpwxVar.dj(5)) {
            this.f = bpwxVar.h();
            super.fN(5);
        }
        if (bpwxVar.dj(6)) {
            this.g = bpwxVar.j();
            super.fN(6);
        }
        if (bpwxVar.dj(7)) {
            this.h = bpwxVar.i();
            super.fN(7);
        }
        if (bpwxVar.dj(8)) {
            this.i = bpwxVar.g();
            super.fN(8);
        }
        if (bpwxVar.dj(9)) {
            this.j = bpwxVar.o();
            super.fN(9);
        }
        if (bpwxVar.dj(10)) {
            this.k = bpwxVar.n();
            super.fN(10);
        }
        if (bpwxVar.dj(11)) {
            this.l = bpwxVar.m();
            super.fN(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpvd)) {
            return false;
        }
        bpvd bpvdVar = (bpvd) obj;
        return super.aE(bpvdVar.cN) && this.a == bpvdVar.a && Objects.equals(this.b, bpvdVar.b) && Objects.equals(this.c, bpvdVar.c) && this.d == bpvdVar.d && Objects.equals(this.e, bpvdVar.e) && Objects.equals(this.f, bpvdVar.f) && Objects.equals(this.g, bpvdVar.g) && Objects.equals(this.h, bpvdVar.h) && Objects.equals(this.i, bpvdVar.i) && this.j == bpvdVar.j && this.k == bpvdVar.k && this.l == bpvdVar.l;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "link_preview", dqru.m(new String[]{"message_id", "trigger_url", "expiration_time_millis", "link_title", "link_description", "link_image_url", "link_domain", "link_canonical_url", "link_preview_prevented", "link_preview_failed", "deferred"}));
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
        return "link_preview";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bpvc(this).get(), this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, Integer.valueOf(this.j ? 1 : 0), Integer.valueOf(this.k ? 1 : 0), Integer.valueOf(this.l ? 1 : 0)};
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
        aA(3, "expiration_time_millis");
        return this.d;
    }

    public final MessageIdType m() {
        aA(1, "message_id");
        return this.b;
    }

    public final String n() {
        aA(8, "link_canonical_url");
        return this.i;
    }

    public final String o() {
        aA(5, "link_description");
        return this.f;
    }

    public final String p() {
        aA(7, "link_domain");
        return this.h;
    }

    public final String q() {
        aA(6, "link_image_url");
        return this.g;
    }

    public final String r() {
        aA(4, "link_title");
        return this.e;
    }

    public final String s() {
        aA(2, "trigger_url");
        return this.c;
    }

    public final /* synthetic */ void t(Long l) {
        if (l.longValue() >= 0) {
            this.a = l.longValue();
            super.fN(0);
        }
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "LinkPreviewTable -- REDACTED") : a();
    }

    public final /* synthetic */ void u(Long l) {
        if (l.longValue() >= 0) {
            this.a = l.longValue();
            super.fN(0);
        }
    }

    public final /* synthetic */ void v(Long l) {
        if (l.longValue() >= 0) {
            this.a = l.longValue();
            super.fN(0);
        }
    }

    public final boolean w() {
        aA(11, "deferred");
        return this.l;
    }

    public final boolean x() {
        aA(10, "link_preview_failed");
        return this.k;
    }

    public final boolean y() {
        aA(9, "link_preview_prevented");
        return this.j;
    }
}
