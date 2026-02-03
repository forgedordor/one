package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azlg extends dqpd implements dqpf {
    public long a;
    public String c;
    public String e;
    public double h;
    public double i;
    public String j;
    public byte[] k;
    public byte[] l;
    public String m;
    public String n;
    public long o;
    public MessageIdType b = bary.a;
    public int d = 13;
    public int f = -1;
    public int g = -1;

    protected azlg() {
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
        String strValueOf8 = String.valueOf(this.h);
        String strValueOf9 = String.valueOf(this.i);
        String strValueOf10 = String.valueOf(this.j);
        byte[] bArr = this.k;
        String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.l;
        return String.format(locale, "BackupPartsTable [_id: %s,\n  message_id: %s,\n  content_type: %s,\n  source: %s,\n  text: %s,\n  width: %s,\n  height: %s,\n  longitude: %s,\n  latitude: %s,\n  cms_full_size_blob_id: %s,\n  cms_media_encryption_key: %s,\n  cms_compressed_media_encryption_key: %s,\n  cms_compressed_blob_id: %s,\n  file_name: %s,\n  duration: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strConcat, "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL")), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = azns.c().intValue();
        contentValues.put("_id", Long.valueOf(this.a));
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        dqru.v(contentValues, "content_type", this.c);
        if (iIntValue >= 10) {
            contentValues.put("source", Integer.valueOf(this.d));
        }
        dqru.v(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.e);
        contentValues.put("width", Integer.valueOf(this.f));
        contentValues.put("height", Integer.valueOf(this.g));
        contentValues.put("longitude", Double.valueOf(this.h));
        contentValues.put("latitude", Double.valueOf(this.i));
        dqru.v(contentValues, "cms_full_size_blob_id", this.j);
        contentValues.put("cms_media_encryption_key", this.k);
        contentValues.put("cms_compressed_media_encryption_key", this.l);
        dqru.v(contentValues, "cms_compressed_blob_id", this.m);
        if (iIntValue >= 100) {
            dqru.v(contentValues, "file_name", this.n);
        }
        if (iIntValue >= 130) {
            contentValues.put("duration", Long.valueOf(this.o));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        aznh aznhVar = (aznh) ((azmr) dqqjVar);
        aC();
        this.cN = aznhVar.cV();
        if (aznhVar.dj(0)) {
            this.a = aznhVar.j();
            fN(0);
        }
        if (aznhVar.dj(1)) {
            this.b = aznhVar.k();
            fN(1);
        }
        if (aznhVar.dj(2)) {
            this.c = aznhVar.n();
            fN(2);
        }
        if (aznhVar.dj(3)) {
            this.d = aznhVar.g();
            fN(3);
        }
        if (aznhVar.dj(4)) {
            this.e = aznhVar.p();
            fN(4);
        }
        if (aznhVar.dj(5)) {
            this.f = aznhVar.h();
            fN(5);
        }
        if (aznhVar.dj(6)) {
            this.g = aznhVar.f();
            fN(6);
        }
        if (aznhVar.dj(7)) {
            this.h = aznhVar.e();
            fN(7);
        }
        if (aznhVar.dj(8)) {
            this.i = aznhVar.c();
            fN(8);
        }
        if (aznhVar.dj(9)) {
            this.j = aznhVar.m();
            fN(9);
        }
        if (aznhVar.dj(10)) {
            this.k = aznhVar.r();
            fN(10);
        }
        if (aznhVar.dj(11)) {
            this.l = aznhVar.q();
            fN(11);
        }
        if (aznhVar.dj(12)) {
            this.m = aznhVar.l();
            fN(12);
        }
        if (aznhVar.dj(13)) {
            this.n = aznhVar.o();
            fN(13);
        }
        if (aznhVar.dj(14)) {
            this.o = aznhVar.i();
            fN(14);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azlg)) {
            return false;
        }
        azlg azlgVar = (azlg) obj;
        return super.aE(azlgVar.cN) && this.a == azlgVar.a && Objects.equals(this.b, azlgVar.b) && Objects.equals(this.c, azlgVar.c) && this.d == azlgVar.d && Objects.equals(this.e, azlgVar.e) && this.f == azlgVar.f && this.g == azlgVar.g && this.h == azlgVar.h && this.i == azlgVar.i && Objects.equals(this.j, azlgVar.j) && Arrays.equals(this.k, azlgVar.k) && Arrays.equals(this.l, azlgVar.l) && Objects.equals(this.m, azlgVar.m) && Objects.equals(this.n, azlgVar.n) && this.o == azlgVar.o;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "parts_backup", dqru.m(new String[]{"_id", "message_id", "content_type", "source", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "width", "height", "longitude", "latitude", "cms_full_size_blob_id", "cms_media_encryption_key", "cms_compressed_media_encryption_key", "cms_compressed_blob_id", "file_name", "duration"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "parts_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), Double.valueOf(this.h), Double.valueOf(this.i), this.j, Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, Long.valueOf(this.o), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.a), new azlf(this).get(), this.c, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), Double.valueOf(this.h), Double.valueOf(this.i), this.j, this.k, this.l, this.m, this.n, Long.valueOf(this.o)};
        sb.append('(');
        for (int i = 0; i < 15; i++) {
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

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupPartsTable -- REDACTED") : a();
    }
}
