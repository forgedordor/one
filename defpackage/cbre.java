package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbre extends dqpd implements dqpf {
    public String c;
    public ConversationIdType a = barn.a;
    public awjl b = null;
    public int d = 0;
    public cbqz e = cbqz.a;
    public cbqx f = null;
    public Optional g = basb.b(0);
    public Optional h = basb.b(0);
    public Optional i = basb.b(0);
    public long j = 0;

    protected cbre() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationEncryptionTable [conversation_id: %s,\n  destination_token: %s,\n  self_id: %s,\n  conv_type: %s,\n  encryption_protocol: %s,\n  encryption_id: %s,\n  last_updated_timestamp: %s,\n  added_to_mls_group_timestamp: %s,\n  mls_last_unexpected_downgrade_timestamp: %s,\n  mls_reupgrade_after_unexpected_downgrade_attempt_count: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = cbtb.c().intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.a)));
        }
        if (iIntValue >= 61010) {
            awjl awjlVar = this.b;
            if (awjlVar == null || awjlVar.equals(null)) {
                contentValues.putNull("destination_token");
            } else {
                contentValues.put("destination_token", awjm.b(this.b));
            }
        }
        dqru.v(contentValues, "self_id", this.c);
        if (iIntValue >= 60890) {
            contentValues.put("conv_type", Integer.valueOf(this.d));
        }
        cbqz cbqzVar = this.e;
        if (cbqzVar == null) {
            contentValues.putNull("encryption_protocol");
        } else {
            contentValues.put("encryption_protocol", Long.valueOf(cbqy.a(cbqzVar)));
        }
        cbqx cbqxVar = this.f;
        if (cbqxVar == null) {
            contentValues.putNull("encryption_id");
        } else {
            contentValues.put("encryption_id", cbqx.a(cbqxVar));
        }
        Optional optional = this.g;
        if (optional == null) {
            contentValues.putNull("last_updated_timestamp");
        } else {
            contentValues.put("last_updated_timestamp", Long.valueOf(basb.a(optional)));
        }
        if (iIntValue >= 60920) {
            Optional optional2 = this.h;
            if (optional2 == null) {
                contentValues.putNull("added_to_mls_group_timestamp");
            } else {
                contentValues.put("added_to_mls_group_timestamp", Long.valueOf(basb.a(optional2)));
            }
        }
        if (iIntValue >= 60920) {
            Optional optional3 = this.i;
            if (optional3 == null) {
                contentValues.putNull("mls_last_unexpected_downgrade_timestamp");
            } else {
                contentValues.put("mls_last_unexpected_downgrade_timestamp", Long.valueOf(basb.a(optional3)));
            }
        }
        if (iIntValue >= 60920) {
            contentValues.put("mls_reupgrade_after_unexpected_downgrade_attempt_count", Long.valueOf(this.j));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        cbsr cbsrVar = (cbsr) ((cbsg) dqqjVar);
        aC();
        this.cN = cbsrVar.cV();
        if (cbsrVar.dj(0)) {
            this.a = cbsrVar.h();
            fN(0);
        }
        if (cbsrVar.dj(1)) {
            this.b = cbsrVar.g();
            fN(1);
        }
        if (cbsrVar.dj(2)) {
            this.c = cbsrVar.n();
            fN(2);
        }
        if (cbsrVar.dj(3)) {
            this.d = cbsrVar.e();
            fN(3);
        }
        if (cbsrVar.dj(4)) {
            this.e = cbsrVar.j();
            fN(4);
        }
        if (cbsrVar.dj(5)) {
            this.f = cbsrVar.i();
            fN(5);
        }
        if (cbsrVar.dj(6)) {
            this.g = cbsrVar.l();
            fN(6);
        }
        if (cbsrVar.dj(7)) {
            this.h = cbsrVar.k();
            fN(7);
        }
        if (cbsrVar.dj(8)) {
            this.i = cbsrVar.m();
            fN(8);
        }
        if (cbsrVar.dj(9)) {
            this.j = cbsrVar.f();
            fN(9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cbre)) {
            return false;
        }
        cbre cbreVar = (cbre) obj;
        return super.aE(cbreVar.cN) && Objects.equals(this.a, cbreVar.a) && Objects.equals(this.b, cbreVar.b) && Objects.equals(this.c, cbreVar.c) && this.d == cbreVar.d && Objects.equals(this.e, cbreVar.e) && Objects.equals(this.f, cbreVar.f) && Objects.equals(this.g, cbreVar.g) && Objects.equals(this.h, cbreVar.h) && Objects.equals(this.i, cbreVar.i) && this.j == cbreVar.j;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_encryption", dqru.m(new String[]{"conversation_id", "destination_token", "self_id", "conv_type", "encryption_protocol", "encryption_id", "last_updated_timestamp", "added_to_mls_group_timestamp", "mls_last_unexpected_downgrade_timestamp", "mls_reupgrade_after_unexpected_downgrade_attempt_count"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_encryption";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, Integer.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r14, java.util.List r15) {
        /*
            r13 = this;
            cbrc r0 = new cbrc
            r0.<init>(r13)
            java.lang.Object r0 = r0.get()
            cbrd r1 = new cbrd
            r1.<init>(r13)
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = r13.c
            int r3 = r13.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            cbqz r4 = r13.e
            cbqz r5 = defpackage.cbqz.a
            long r4 = defpackage.cbqy.a(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            cbqx r5 = r13.f
            java.lang.String r5 = defpackage.cbqx.a(r5)
            j$.util.Optional r6 = r13.g
            long r6 = defpackage.basb.a(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            j$.util.Optional r7 = r13.h
            long r7 = defpackage.basb.a(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            j$.util.Optional r8 = r13.i
            long r8 = defpackage.basb.a(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            long r9 = r13.j
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 10
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            r11[r12] = r0
            r0 = 1
            r11[r0] = r1
            r0 = 2
            r11[r0] = r2
            r0 = 3
            r11[r0] = r3
            r0 = 4
            r11[r0] = r4
            r0 = 5
            r11[r0] = r5
            r0 = 6
            r11[r0] = r6
            r0 = 7
            r11[r0] = r7
            r0 = 8
            r11[r0] = r8
            r0 = 9
            r11[r0] = r9
            r0 = 40
            r14.append(r0)
        L79:
            if (r12 >= r10) goto Lb0
            r0 = r11[r12]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L89
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r14.append(r0)
            goto La8
        L89:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto La0
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto La0
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r14.append(r0)
            goto La8
        La0:
            r15.add(r0)
            r0 = 63
            r14.append(r0)
        La8:
            r0 = 44
            r14.append(r0)
            int r12 = r12 + 1
            goto L79
        Lb0:
            int r15 = r14.length()
            int r15 = r15 + (-1)
            r14.setLength(r15)
            r15 = 41
            r14.append(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbre.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final cbqx k() {
        aA(5, "encryption_id");
        return this.f;
    }

    public final cbqz m() {
        aA(4, "encryption_protocol");
        return this.e;
    }

    public final Long n() {
        final dqsy dqsyVarB = cbtb.b();
        return Long.valueOf(dqru.b(cbtb.b(), "conversation_encryption", this, new Function() { // from class: cbra
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.P("conversation_encryption", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: cbrb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationEncryptionTable -- REDACTED") : a();
    }
}
