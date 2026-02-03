package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqit extends dqpd implements dqpf {
    public long a;
    public MessageIdType b;
    public cklv c;
    public MessageIdType d;
    public ckml e;
    public ckmb f;
    public ckmb g;

    protected bqit() {
        MessageIdType messageIdType = bary.a;
        this.b = messageIdType;
        this.d = messageIdType;
        this.e = ckml.b(0);
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageReactionsTable [_id: %s,\n  message_id: %s,\n  reactions_data: %s,\n  reacted_message_id: %s,\n  reaction: %s,\n  applied_reaction: %s,\n  animation_effect: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bqkl.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        cklv cklvVar = this.c;
        if (cklvVar == null) {
            contentValues.putNull("reactions_data");
        } else {
            contentValues.put("reactions_data", cklvVar.toByteArray());
        }
        if (iIntValue >= 46020) {
            MessageIdType messageIdType2 = this.d;
            if (messageIdType2 == null || messageIdType2.equals(bary.a)) {
                contentValues.putNull("reacted_message_id");
            } else {
                contentValues.put("reacted_message_id", Long.valueOf(bary.a(this.d)));
            }
        }
        if (iIntValue >= 48000) {
            ckml ckmlVar = this.e;
            if (ckmlVar == null) {
                contentValues.putNull("reaction");
            } else {
                contentValues.put("reaction", Integer.valueOf(ckmlVar.a()));
            }
        }
        if (iIntValue >= 59060) {
            ckmb ckmbVar = this.f;
            if (ckmbVar == null) {
                contentValues.putNull("applied_reaction");
            } else {
                contentValues.put("applied_reaction", ckmbVar.toByteArray());
            }
        }
        if (iIntValue >= 59520) {
            ckmb ckmbVar2 = this.g;
            if (ckmbVar2 == null) {
                contentValues.putNull("animation_effect");
            } else {
                contentValues.put("animation_effect", ckmbVar2.toByteArray());
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bqjz bqjzVar = (bqjz) ((bqjr) dqqjVar);
        aC();
        this.cN = bqjzVar.cV();
        if (bqjzVar.dj(0)) {
            this.a = bqjzVar.f();
            super.fN(0);
        }
        if (bqjzVar.dj(1)) {
            this.b = bqjzVar.g();
            super.fN(1);
        }
        if (bqjzVar.dj(2)) {
            this.c = bqjzVar.h();
            super.fN(2);
        }
        if (bqjzVar.dj(3)) {
            this.d = bqjzVar.c();
            super.fN(3);
        }
        if (bqjzVar.dj(4)) {
            this.e = bqjzVar.k();
            super.fN(4);
        }
        if (bqjzVar.dj(5)) {
            this.f = bqjzVar.j();
            super.fN(5);
        }
        if (bqjzVar.dj(6)) {
            this.g = bqjzVar.i();
            super.fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqit)) {
            return false;
        }
        bqit bqitVar = (bqit) obj;
        return super.aE(bqitVar.cN) && this.a == bqitVar.a && Objects.equals(this.b, bqitVar.b) && Objects.equals(this.c, bqitVar.c) && Objects.equals(this.d, bqitVar.d) && this.e == bqitVar.e && Objects.equals(this.f, bqitVar.f) && Objects.equals(this.g, bqitVar.g);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_reactions", dqru.m(new String[]{"message_id", "reactions_data", "reacted_message_id", "reaction", "applied_reaction", "animation_effect"}));
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
        return "message_reactions";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            bqir r0 = new bqir
            r0.<init>(r9)
            java.lang.Object r0 = r0.get()
            cklv r1 = r9.c
            r2 = 0
            if (r1 != 0) goto L10
            r1 = r2
            goto L14
        L10:
            byte[] r1 = r1.toByteArray()
        L14:
            bqis r3 = new bqis
            r3.<init>(r9)
            java.lang.Object r3 = r3.get()
            ckml r4 = r9.e
            r5 = 0
            if (r4 != 0) goto L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L2f
        L27:
            int r4 = r4.a()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L2f:
            ckmb r6 = r9.f
            if (r6 != 0) goto L35
            r6 = r2
            goto L39
        L35:
            byte[] r6 = r6.toByteArray()
        L39:
            ckmb r7 = r9.g
            if (r7 != 0) goto L3e
            goto L42
        L3e:
            byte[] r2 = r7.toByteArray()
        L42:
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r5] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r3
            r0 = 3
            r8[r0] = r4
            r0 = 4
            r8[r0] = r6
            r0 = 5
            r8[r0] = r2
            r0 = 40
            r10.append(r0)
        L5b:
            if (r5 >= r7) goto L92
            r0 = r8[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L6b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L8a
        L6b:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L82
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L82
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L8a
        L82:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L8a:
            r0 = 44
            r10.append(r0)
            int r5 = r5 + 1
            goto L5b
        L92:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqit.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final MessageIdType k() {
        aA(1, "message_id");
        return this.b;
    }

    public final MessageIdType m() {
        aA(3, "reacted_message_id");
        return this.d;
    }

    public final cklv n() {
        aA(2, "reactions_data");
        return this.c;
    }

    public final ckmb o() {
        aA(5, "applied_reaction");
        return this.f;
    }

    public final ckml p() {
        aA(4, "reaction");
        return this.e;
    }

    public final /* synthetic */ void q(Long l) {
        if (l.longValue() >= 0) {
            this.a = l.longValue();
            super.fN(0);
        }
    }

    public final /* synthetic */ void r(Long l) {
        if (l.longValue() >= 0) {
            this.a = l.longValue();
            super.fN(0);
        }
    }

    public final void s() {
        final dqsy dqsyVarB = bqkl.b();
        dqru.b(bqkl.b(), "message_reactions", this, new Function() { // from class: bqip
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.P("message_reactions", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bqiq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.a.q((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageReactionsTable -- REDACTED") : a();
    }
}
