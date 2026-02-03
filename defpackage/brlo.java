package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brlo extends dqpd implements dqpf {
    public String a;
    public ezgi d;
    public MessageIdType b = bary.a;
    public long c = 0;
    public ezan e = ezan.UNKNOWN_SUGGESTION_TYPE;
    public ezai f = ezai.UNKNOWN_STATUS;
    public ezaj g = ezaj.UNCONSUMED;

    protected brlo() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "P2pSuggestionsTable [_id: %s,\n  target_message_id: %s,\n  generated_timestamp: %s,\n  suggestion: %s,\n  smart_suggestion_type: %s,\n  suggestion_status: %s,\n  consumption_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = brnk.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("target_message_id");
        } else {
            contentValues.put("target_message_id", Long.valueOf(bary.a(this.b)));
        }
        contentValues.put("generated_timestamp", Long.valueOf(this.c));
        ezgi ezgiVar = this.d;
        contentValues.put("suggestion", ezgiVar == null ? null : ezgiVar.toByteArray());
        ezan ezanVar = this.e;
        if (ezanVar == null) {
            contentValues.putNull("smart_suggestion_type");
        } else {
            contentValues.put("smart_suggestion_type", Integer.valueOf(ezanVar.a()));
        }
        ezai ezaiVar = this.f;
        if (ezaiVar == null) {
            contentValues.putNull("suggestion_status");
        } else {
            contentValues.put("suggestion_status", Integer.valueOf(ezaiVar.a()));
        }
        if (iIntValue >= 53080) {
            ezaj ezajVar = this.g;
            if (ezajVar == null) {
                contentValues.putNull("consumption_state");
            } else {
                contentValues.put("consumption_state", Integer.valueOf(ezajVar.a()));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        brmt brmtVar = (brmt) ((brml) dqqjVar);
        aC();
        this.cN = brmtVar.cV();
        if (brmtVar.dj(0)) {
            this.a = brmtVar.j();
            fN(0);
        }
        if (brmtVar.dj(1)) {
            this.b = brmtVar.e();
            fN(1);
        }
        if (brmtVar.dj(2)) {
            this.c = brmtVar.c();
            fN(2);
        }
        if (brmtVar.dj(3)) {
            this.d = brmtVar.i();
            fN(3);
        }
        if (brmtVar.dj(4)) {
            this.e = brmtVar.h();
            fN(4);
        }
        if (brmtVar.dj(5)) {
            this.f = brmtVar.f();
            fN(5);
        }
        if (brmtVar.dj(6)) {
            this.g = brmtVar.g();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brlo)) {
            return false;
        }
        brlo brloVar = (brlo) obj;
        return super.aE(brloVar.cN) && Objects.equals(this.a, brloVar.a) && Objects.equals(this.b, brloVar.b) && this.c == brloVar.c && Objects.equals(this.d, brloVar.d) && this.e == brloVar.e && this.f == brloVar.f && this.g == brloVar.g;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "p2p_suggestions", dqru.m(new String[]{"target_message_id", "generated_timestamp", "suggestion", "smart_suggestion_type", "suggestion_status", "consumption_state"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "p2p_suggestions";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            brln r0 = new brln
            r0.<init>(r9)
            java.lang.Object r0 = r0.get()
            long r1 = r9.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            ezgi r2 = r9.d
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            byte[] r2 = r2.toByteArray()
        L19:
            ezan r3 = r9.e
            r4 = 0
            if (r3 != 0) goto L23
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L2b
        L23:
            int r3 = r3.a()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L2b:
            ezai r5 = r9.f
            if (r5 != 0) goto L34
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            goto L3c
        L34:
            int r5 = r5.a()
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L3c:
            ezaj r6 = r9.g
            if (r6 != 0) goto L45
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            goto L4d
        L45:
            int r6 = r6.a()
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L4d:
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r4] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r5
            r0 = 5
            r8[r0] = r6
            r0 = 40
            r10.append(r0)
        L66:
            if (r4 >= r7) goto L9d
            r0 = r8[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L76
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L95
        L76:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L8d
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L8d
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L95
        L8d:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L95:
            r0 = 44
            r10.append(r0)
            int r4 = r4 + 1
            goto L66
        L9d:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brlo.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final MessageIdType k() {
        aA(1, "target_message_id");
        return this.b;
    }

    public final ezai m() {
        aA(5, "suggestion_status");
        return this.f;
    }

    public final ezaj n() {
        aA(6, "consumption_state");
        return this.g;
    }

    public final ezan o() {
        aA(4, "smart_suggestion_type");
        return this.e;
    }

    public final ezgi p() {
        aA(3, "suggestion");
        return this.d;
    }

    public final String q() {
        aA(0, "_id");
        return this.a;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "P2pSuggestionsTable -- REDACTED") : a();
    }
}
