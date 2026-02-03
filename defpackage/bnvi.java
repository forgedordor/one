package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bnvi extends dqpd implements dqpf {
    public long a;
    public int c;
    public String e;
    public Uri f;
    public String g;
    public ConversationIdType b = barn.a;
    public MessageIdType d = bary.a;
    public int h = 0;
    public boolean i = false;
    public long j = 0;
    public int k = 0;
    public int l = 0;

    protected bnvi() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationLabelsTable [_id: %s,\n  conversation_id: %s,\n  label: %s,\n  message_id: %s,\n  snippet_text: %s,\n  preview_uri: %s,\n  preview_content_type: %s,\n  message_status: %s,\n  read: %s,\n  received_timestamp: %s,\n  message_protocol: %s,\n  raw_telephony_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bnxi.b().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
        }
        if (iIntValue >= 53020) {
            contentValues.put(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, Integer.valueOf(this.c));
        }
        MessageIdType messageIdType = this.d;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.d)));
        }
        if (iIntValue >= 53010) {
            dqru.v(contentValues, "snippet_text", this.e);
        }
        if (iIntValue >= 55040) {
            Uri uri = this.f;
            if (uri == null) {
                contentValues.putNull("preview_uri");
            } else {
                contentValues.put("preview_uri", uri.toString());
            }
        }
        if (iIntValue >= 55040) {
            dqru.v(contentValues, "preview_content_type", this.g);
        }
        if (iIntValue >= 57050) {
            contentValues.put("message_status", Integer.valueOf(this.h));
        }
        if (iIntValue >= 57050) {
            contentValues.put("read", Boolean.valueOf(this.i));
        }
        if (iIntValue >= 57050) {
            contentValues.put("received_timestamp", Long.valueOf(this.j));
        }
        if (iIntValue >= 57050) {
            contentValues.put("message_protocol", Integer.valueOf(this.k));
        }
        if (iIntValue >= 57050) {
            contentValues.put("raw_telephony_status", Integer.valueOf(this.l));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bnxc bnxcVar = (bnxc) ((bnwp) dqqjVar);
        aC();
        this.cN = bnxcVar.cV();
        if (bnxcVar.dj(0)) {
            this.a = bnxcVar.h();
            fN(0);
        }
        if (bnxcVar.dj(1)) {
            this.b = bnxcVar.k();
            fN(1);
        }
        if (bnxcVar.dj(2)) {
            this.c = bnxcVar.c();
            fN(2);
        }
        if (bnxcVar.dj(3)) {
            this.d = bnxcVar.l();
            fN(3);
        }
        if (bnxcVar.dj(4)) {
            this.e = bnxcVar.n();
            fN(4);
        }
        if (bnxcVar.dj(5)) {
            this.f = bnxcVar.j();
            fN(5);
        }
        if (bnxcVar.dj(6)) {
            this.g = bnxcVar.m();
            fN(6);
        }
        if (bnxcVar.dj(7)) {
            this.h = bnxcVar.g();
            fN(7);
        }
        if (bnxcVar.dj(8)) {
            this.i = bnxcVar.o();
            fN(8);
        }
        if (bnxcVar.dj(9)) {
            this.j = bnxcVar.i();
            fN(9);
        }
        if (bnxcVar.dj(10)) {
            this.k = bnxcVar.e();
            fN(10);
        }
        if (bnxcVar.dj(11)) {
            this.l = bnxcVar.f();
            fN(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnvi)) {
            return false;
        }
        bnvi bnviVar = (bnvi) obj;
        return super.aE(bnviVar.cN) && this.a == bnviVar.a && Objects.equals(this.b, bnviVar.b) && this.c == bnviVar.c && Objects.equals(this.d, bnviVar.d) && Objects.equals(this.e, bnviVar.e) && Objects.equals(this.f, bnviVar.f) && Objects.equals(this.g, bnviVar.g) && this.h == bnviVar.h && this.i == bnviVar.i && this.j == bnviVar.j && this.k == bnviVar.k && this.l == bnviVar.l;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_labels", dqru.m(new String[]{"conversation_id", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, "message_id", "snippet_text", "preview_uri", "preview_content_type", "message_status", "read", "received_timestamp", "message_protocol", "raw_telephony_status"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_labels";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), Boolean.valueOf(this.i), Long.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Object obj = new bnvg(this).get();
        Integer numValueOf = Integer.valueOf(this.c);
        Object obj2 = new bnvh(this).get();
        String str = this.e;
        Uri uri = this.f;
        Object[] objArr = {obj, numValueOf, obj2, str, uri == null ? null : uri.toString(), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i ? 1 : 0), Long.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)};
        sb.append('(');
        for (int i = 0; i < 11; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str2 = (String) obj3;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
                    }
                }
                list.add(obj3);
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
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationLabelsTable -- REDACTED") : a();
    }
}
