package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bocm extends dqpd implements dqpf {
    public long a;
    public ConversationIdType b = barn.a;
    public boolean c;

    protected bocm() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationPinTable [_id: %s,\n  conversation_id: %s,\n  pin_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
        }
        contentValues.put("pin_status", Boolean.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bodd boddVar = (bodd) ((bocz) dqqjVar);
        aC();
        this.cN = boddVar.cV();
        if (boddVar.dj(0)) {
            this.a = boddVar.e();
            super.fN(0);
        }
        if (boddVar.dj(1)) {
            this.b = boddVar.f();
            super.fN(1);
        }
        if (boddVar.dj(2)) {
            this.c = boddVar.g();
            super.fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bocm)) {
            return false;
        }
        bocm bocmVar = (bocm) obj;
        return super.aE(bocmVar.cN) && this.a == bocmVar.a && Objects.equals(this.b, bocmVar.b) && this.c == bocmVar.c;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_pin", dqru.m(new String[]{"conversation_id", "pin_status"}));
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
        return "conversation_pin";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Boolean.valueOf(this.c), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            bocl r0 = new bocl
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            boolean r1 = r7.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L1d:
            if (r4 >= r2) goto L54
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L2d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L4c
        L2d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L44
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L44
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L4c
        L44:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L4c:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L1d
        L54:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bocm.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final ConversationIdType k() {
        aA(1, "conversation_id");
        return this.b;
    }

    public final /* synthetic */ void m(Long l) {
        if (l.longValue() >= 0) {
            this.a = l.longValue();
            super.fN(0);
        }
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationPinTable -- REDACTED") : a();
    }
}
