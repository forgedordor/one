package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpmx extends dqpd implements dqpf {
    public ConversationIdType a = barn.a;
    public axcm b = null;
    public String c;

    protected bpmx() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "GeminiConversationIdMappingsTable [conversation_id: %s,\n  my_identity_token: %s,\n  gemini_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.a)));
        }
        axcm axcmVar = this.b;
        if (axcmVar == null || axcmVar.equals(null)) {
            contentValues.putNull("my_identity_token");
        } else {
            contentValues.put("my_identity_token", axcn.b(this.b));
        }
        dqru.v(contentValues, "gemini_conversation_id", this.c);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpnp bpnpVar = (bpnp) ((bpnl) dqqjVar);
        aC();
        this.cN = bpnpVar.cV();
        if (bpnpVar.dj(0)) {
            this.a = bpnpVar.e();
            fN(0);
        }
        if (bpnpVar.dj(1)) {
            this.b = bpnpVar.c();
            fN(1);
        }
        if (bpnpVar.dj(2)) {
            this.c = bpnpVar.f();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpmx)) {
            return false;
        }
        bpmx bpmxVar = (bpmx) obj;
        return super.aE(bpmxVar.cN) && Objects.equals(this.a, bpmxVar.a) && Objects.equals(this.b, bpmxVar.b) && Objects.equals(this.c, bpmxVar.c);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "gemini_conversation_id_mappings", dqru.m(new String[]{"conversation_id", "my_identity_token", "gemini_conversation_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "gemini_conversation_id_mappings";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            bpmv r0 = new bpmv
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            bpmw r1 = new bpmw
            r1.<init>(r7)
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = r7.c
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
        L25:
            if (r5 >= r3) goto L5c
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L35
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L54
        L35:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4c
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L4c
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L54
        L4c:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L54:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L25
        L5c:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpmx.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String k() {
        aA(2, "gemini_conversation_id");
        return this.c;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "GeminiConversationIdMappingsTable -- REDACTED") : a();
    }
}
