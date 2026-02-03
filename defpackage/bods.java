package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bods extends dqpd implements dqpf {
    public long a;
    public MessageIdType b = bary.a;
    public int c = 0;
    public String d;
    public String e;
    public String f;
    public basd g;
    public basd h;
    public boolean i;
    public long j;

    protected bods() {
        basd basdVar = basd.a;
        this.g = basdVar;
        this.h = basdVar;
        this.i = false;
        this.j = 0L;
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationSuggestionsTable [_id: %s,\n  message_id: %s,\n  conversation_suggestion_type: %s,\n  properties: %s,\n  post_back_data: %s,\n  post_back_encoding: %s,\n  rcs_message_id: %s,\n  target_rcs_message_id: %s,\n  read: %s,\n  received_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bofr.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        contentValues.put("conversation_suggestion_type", Integer.valueOf(this.c));
        dqru.v(contentValues, "properties", this.d);
        dqru.v(contentValues, "post_back_data", this.e);
        dqru.v(contentValues, "post_back_encoding", this.f);
        if (iIntValue >= 11001) {
            basd basdVar = this.g;
            if (basdVar == null) {
                contentValues.putNull("rcs_message_id");
            } else {
                contentValues.put("rcs_message_id", basd.d(basdVar));
            }
        }
        if (iIntValue >= 12000) {
            basd basdVar2 = this.h;
            if (basdVar2 == null) {
                contentValues.putNull("target_rcs_message_id");
            } else {
                contentValues.put("target_rcs_message_id", basd.d(basdVar2));
            }
        }
        if (iIntValue >= 12000) {
            contentValues.put("read", Boolean.valueOf(this.i));
        }
        if (iIntValue >= 12000) {
            contentValues.put("received_timestamp", Long.valueOf(this.j));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bofe bofeVar = (bofe) ((boet) dqqjVar);
        aC();
        this.cN = bofeVar.cV();
        if (bofeVar.dj(0)) {
            this.a = bofeVar.e();
            fN(0);
        }
        if (bofeVar.dj(1)) {
            this.b = bofeVar.g();
            fN(1);
        }
        if (bofeVar.dj(2)) {
            this.c = bofeVar.c();
            fN(2);
        }
        if (bofeVar.dj(3)) {
            this.d = bofeVar.l();
            fN(3);
        }
        if (bofeVar.dj(4)) {
            this.e = bofeVar.j();
            fN(4);
        }
        if (bofeVar.dj(5)) {
            this.f = bofeVar.k();
            fN(5);
        }
        if (bofeVar.dj(6)) {
            this.g = bofeVar.h();
            fN(6);
        }
        if (bofeVar.dj(7)) {
            this.h = bofeVar.i();
            fN(7);
        }
        if (bofeVar.dj(8)) {
            this.i = bofeVar.m();
            fN(8);
        }
        if (bofeVar.dj(9)) {
            this.j = bofeVar.f();
            fN(9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bods)) {
            return false;
        }
        bods bodsVar = (bods) obj;
        return super.aE(bodsVar.cN) && this.a == bodsVar.a && Objects.equals(this.b, bodsVar.b) && this.c == bodsVar.c && Objects.equals(this.d, bodsVar.d) && Objects.equals(this.e, bodsVar.e) && Objects.equals(this.f, bodsVar.f) && Objects.equals(this.g, bodsVar.g) && Objects.equals(this.h, bodsVar.h) && this.i == bodsVar.i && this.j == bodsVar.j;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_suggestions", dqru.m(new String[]{"message_id", "conversation_suggestion_type", "properties", "post_back_data", "post_back_encoding", "rcs_message_id", "target_rcs_message_id", "read", "received_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_suggestions";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r13, java.util.List r14) {
        /*
            r12 = this;
            bodr r0 = new bodr
            r0.<init>(r12)
            java.lang.Object r0 = r0.get()
            int r1 = r12.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r12.d
            java.lang.String r3 = r12.e
            java.lang.String r4 = r12.f
            basd r5 = r12.g
            java.lang.String r5 = defpackage.basd.d(r5)
            basd r6 = r12.h
            java.lang.String r6 = defpackage.basd.d(r6)
            boolean r7 = r12.i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            long r8 = r12.j
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 9
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r0
            r0 = 1
            r10[r0] = r1
            r0 = 2
            r10[r0] = r2
            r0 = 3
            r10[r0] = r3
            r0 = 4
            r10[r0] = r4
            r0 = 5
            r10[r0] = r5
            r0 = 6
            r10[r0] = r6
            r0 = 7
            r10[r0] = r7
            r0 = 8
            r10[r0] = r8
            r0 = 40
            r13.append(r0)
        L52:
            if (r11 >= r9) goto L89
            r0 = r10[r11]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L62
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.append(r0)
            goto L81
        L62:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L79
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L79
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r13.append(r0)
            goto L81
        L79:
            r14.add(r0)
            r0 = 63
            r13.append(r0)
        L81:
            r0 = 44
            r13.append(r0)
            int r11 = r11 + 1
            goto L52
        L89:
            int r14 = r13.length()
            int r14 = r14 + (-1)
            r13.setLength(r14)
            r14 = 41
            r13.append(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bods.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final int k() {
        aA(2, "conversation_suggestion_type");
        return this.c;
    }

    public final MessageIdType m() {
        aA(1, "message_id");
        return this.b;
    }

    public final basd n() {
        aA(6, "rcs_message_id");
        return this.g;
    }

    public final basd o() {
        aA(7, "target_rcs_message_id");
        return this.h;
    }

    public final String p() {
        aA(4, "post_back_data");
        return this.e;
    }

    public final String q() {
        aA(5, "post_back_encoding");
        return this.f;
    }

    public final String r() {
        aA(3, "properties");
        return this.d;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationSuggestionsTable -- REDACTED") : a();
    }
}
