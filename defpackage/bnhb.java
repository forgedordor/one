package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bnhb extends dqpd {
    private Uri d;
    private String e;
    private Uri f;
    private String h;
    private String i;
    private ConversationIdType a = barn.a;
    private long b = 0;
    private int c = 0;
    private bvdq g = bvdq.DEFAULT_NO_VERDICT;

    protected bnhb() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationImagePartsView [messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_status: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_image_display_state: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bnvf.b().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bnuy bnuyVar = (bnuy) dqqjVar;
        aC();
        this.cN = bnuyVar.cV();
        if (bnuyVar.dj(0)) {
            this.a = new ConversationIdType(bnuyVar.getLong(bnuyVar.cO(0, bnvf.a)));
            fN(0);
        }
        if (bnuyVar.dj(1)) {
            this.b = bnuyVar.getLong(bnuyVar.cO(1, bnvf.a));
            fN(1);
        }
        if (bnuyVar.dj(2)) {
            this.c = bnuyVar.getInt(bnuyVar.cO(2, bnvf.a));
            fN(2);
        }
        if (bnuyVar.dj(3)) {
            String string = bnuyVar.getString(bnuyVar.cO(3, bnvf.a));
            this.d = string == null ? null : Uri.parse(string);
            fN(3);
        }
        if (bnuyVar.dj(4)) {
            this.e = bnuyVar.getString(bnuyVar.cO(4, bnvf.a));
            fN(4);
        }
        if (bnuyVar.dj(5)) {
            String string2 = bnuyVar.getString(bnuyVar.cO(5, bnvf.a));
            this.f = string2 != null ? Uri.parse(string2) : null;
            fN(5);
        }
        if (bnuyVar.dj(6)) {
            bvdq[] bvdqVarArrValues = bvdq.values();
            int i = bnuyVar.getInt(bnuyVar.cO(6, bnvf.a));
            if (i >= bvdqVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.g = bvdqVarArrValues[i];
            fN(6);
        }
        if (bnuyVar.dj(7)) {
            this.h = cssb.a(bnuyVar.getString(bnuyVar.cO(7, bnvf.a)));
            fN(7);
        }
        if (bnuyVar.dj(8)) {
            this.i = cssq.a(bnuyVar.getString(bnuyVar.cO(8, bnvf.a)));
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnhb)) {
            return false;
        }
        bnhb bnhbVar = (bnhb) obj;
        return super.aE(bnhbVar.cN) && Objects.equals(this.a, bnhbVar.a) && this.b == bnhbVar.b && this.c == bnhbVar.c && Objects.equals(this.d, bnhbVar.d) && Objects.equals(this.e, bnhbVar.e) && Objects.equals(this.f, bnhbVar.f) && this.g == bnhbVar.g && Objects.equals(this.h, bnhbVar.h) && Objects.equals(this.i, bnhbVar.i);
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        ConversationIdType conversationIdType = this.a;
        Long lValueOf = Long.valueOf(this.b);
        Integer numValueOf = Integer.valueOf(this.c);
        Uri uri = this.d;
        String str = this.e;
        Uri uri2 = this.f;
        bvdq bvdqVar = this.g;
        return Objects.hash(dqqeVar2, conversationIdType, lValueOf, numValueOf, uri, str, uri2, Integer.valueOf(bvdqVar == null ? 0 : bvdqVar.ordinal()), this.h, this.i, null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationImagePartsView -- REDACTED") : a();
    }
}
