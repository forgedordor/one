package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqfr extends dqpd implements dqpf {
    public String a;
    public int c;
    public bqhg d;
    public bqhh e;
    public MessageIdType b = bary.a;
    public String f = "";
    public String g = "";

    protected bqfr() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageLabelsTable [_id: %s,\n  message_id: %s,\n  label: %s,\n  confidence: %s,\n  source: %s,\n  intent: %s,\n  model_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bqhf.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        contentValues.put(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, Integer.valueOf(this.c));
        if (iIntValue >= 53060) {
            bqhg bqhgVar = this.d;
            if (bqhgVar == null) {
                contentValues.putNull("confidence");
            } else {
                contentValues.put("confidence", Integer.valueOf(bqhgVar.ordinal()));
            }
        }
        bqhh bqhhVar = this.e;
        if (bqhhVar == null) {
            contentValues.putNull("source");
        } else {
            contentValues.put("source", Integer.valueOf(bqhhVar.ordinal()));
        }
        if (iIntValue >= 58590) {
            dqru.v(contentValues, "intent", this.f);
        }
        dqru.v(contentValues, "model_id", this.g);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bqgv bqgvVar = (bqgv) ((bqgn) dqqjVar);
        aC();
        this.cN = bqgvVar.cV();
        if (bqgvVar.dj(0)) {
            this.a = bqgvVar.i();
            fN(0);
        }
        if (bqgvVar.dj(1)) {
            this.b = bqgvVar.f();
            fN(1);
        }
        if (bqgvVar.dj(2)) {
            this.c = bqgvVar.e();
            fN(2);
        }
        if (bqgvVar.dj(3)) {
            this.d = bqgvVar.g();
            fN(3);
        }
        if (bqgvVar.dj(4)) {
            this.e = bqgvVar.h();
            fN(4);
        }
        if (bqgvVar.dj(5)) {
            this.f = bqgvVar.j();
            fN(5);
        }
        if (bqgvVar.dj(6)) {
            this.g = bqgvVar.k();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqfr)) {
            return false;
        }
        bqfr bqfrVar = (bqfr) obj;
        return super.aE(bqfrVar.cN) && Objects.equals(this.a, bqfrVar.a) && Objects.equals(this.b, bqfrVar.b) && this.c == bqfrVar.c && this.d == bqfrVar.d && this.e == bqfrVar.e && Objects.equals(this.f, bqfrVar.f) && Objects.equals(this.g, bqfrVar.g);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_labels", dqru.m(new String[]{"message_id", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, "confidence", "source", "intent", "model_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_labels";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        MessageIdType messageIdType = this.b;
        Integer numValueOf = Integer.valueOf(this.c);
        bqhg bqhgVar = this.d;
        Integer numValueOf2 = Integer.valueOf(bqhgVar == null ? 0 : bqhgVar.ordinal());
        bqhh bqhhVar = this.e;
        return Objects.hash(dqqeVar2, str, messageIdType, numValueOf, numValueOf2, Integer.valueOf(bqhhVar == null ? 0 : bqhhVar.ordinal()), this.f, this.g, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            bqfq r0 = new bqfq
            r0.<init>(r9)
            java.lang.Object r0 = r0.get()
            int r1 = r9.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            bqhg r2 = r9.d
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r2 != 0) goto L1a
            r2 = r4
            goto L22
        L1a:
            int r2 = r2.ordinal()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L22:
            bqhh r5 = r9.e
            if (r5 != 0) goto L27
            goto L2f
        L27:
            int r4 = r5.ordinal()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L2f:
            java.lang.String r5 = r9.f
            java.lang.String r6 = r9.g
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r3] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r4
            r0 = 4
            r8[r0] = r5
            r0 = 5
            r8[r0] = r6
            r0 = 40
            r10.append(r0)
        L4c:
            if (r3 >= r7) goto L83
            r0 = r8[r3]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L5c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L7b
        L5c:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L73
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r4 = 12
            if (r2 >= r4) goto L73
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L7b
        L73:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L7b:
            r0 = 44
            r10.append(r0)
            int r3 = r3 + 1
            goto L4c
        L83:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqfr.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageLabelsTable -- REDACTED") : a();
    }
}
