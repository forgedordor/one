package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bple extends dqpd implements dqpf {
    public long a;
    public bvdo c;
    public long d;
    public MessageIdType b = bary.a;
    public boolean e = false;
    public Duration f = barr.b(0);

    protected bple() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "FlaggedMessagesTable [_id: %s,\n  flagged_message_id: %s,\n  flagging_reason: %s,\n  flagged_message_timestamp: %s,\n  flagged_message_notified: %s,\n  flagged_message_delay: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bpmq.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("flagged_message_id");
        } else {
            contentValues.put("flagged_message_id", Long.valueOf(bary.a(this.b)));
        }
        bvdo bvdoVar = this.c;
        if (bvdoVar == null) {
            contentValues.putNull("flagging_reason");
        } else {
            contentValues.put("flagging_reason", Integer.valueOf(bvdoVar.ordinal()));
        }
        if (iIntValue >= 39030) {
            contentValues.put("flagged_message_timestamp", Long.valueOf(this.d));
        }
        if (iIntValue >= 46030) {
            contentValues.put("flagged_message_notified", Boolean.valueOf(this.e));
        }
        if (iIntValue >= 60710) {
            Duration duration = this.f;
            if (duration == null) {
                contentValues.putNull("flagged_message_delay");
            } else {
                contentValues.put("flagged_message_delay", Long.valueOf(barr.a(duration)));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpme bpmeVar = (bpme) ((bplx) dqqjVar);
        aC();
        this.cN = bpmeVar.cV();
        if (bpmeVar.dj(0)) {
            this.a = bpmeVar.e();
            fN(0);
        }
        if (bpmeVar.dj(1)) {
            this.b = bpmeVar.f();
            fN(1);
        }
        if (bpmeVar.dj(2)) {
            this.c = bpmeVar.g();
            fN(2);
        }
        if (bpmeVar.dj(3)) {
            this.d = bpmeVar.c();
            fN(3);
        }
        if (bpmeVar.dj(4)) {
            this.e = bpmeVar.i();
            fN(4);
        }
        if (bpmeVar.dj(5)) {
            this.f = bpmeVar.h();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bple)) {
            return false;
        }
        bple bpleVar = (bple) obj;
        return super.aE(bpleVar.cN) && this.a == bpleVar.a && Objects.equals(this.b, bpleVar.b) && this.c == bpleVar.c && this.d == bpleVar.d && this.e == bpleVar.e && Objects.equals(this.f, bpleVar.f);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "flagged_messages", dqru.m(new String[]{"flagged_message_id", "flagging_reason", "flagged_message_timestamp", "flagged_message_notified", "flagged_message_delay"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "flagged_messages";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        Long lValueOf = Long.valueOf(this.a);
        MessageIdType messageIdType = this.b;
        bvdo bvdoVar = this.c;
        return Objects.hash(dqqeVar2, lValueOf, messageIdType, Integer.valueOf(bvdoVar == null ? 0 : bvdoVar.ordinal()), Long.valueOf(this.d), Boolean.valueOf(this.e), this.f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            bpld r0 = new bpld
            r0.<init>(r8)
            java.lang.Object r0 = r0.get()
            bvdo r1 = r8.c
            r2 = 0
            if (r1 != 0) goto L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L1b
        L13:
            int r1 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1b:
            long r3 = r8.d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r4 = r8.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            j$.time.Duration r5 = r8.f
            long r5 = defpackage.barr.a(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            r0 = 2
            r7[r0] = r3
            r0 = 3
            r7[r0] = r4
            r0 = 4
            r7[r0] = r5
            r0 = 40
            r9.append(r0)
        L47:
            if (r2 >= r6) goto L7e
            r0 = r7[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L57
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L76
        L57:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L6e
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r4 = 12
            if (r3 >= r4) goto L6e
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L76
        L6e:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L76:
            r0 = 44
            r9.append(r0)
            int r2 = r2 + 1
            goto L47
        L7e:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bple.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(3, "flagged_message_timestamp");
        return this.d;
    }

    public final MessageIdType m() {
        aA(1, "flagged_message_id");
        return this.b;
    }

    public final bvdo n() {
        aA(2, "flagging_reason");
        return this.c;
    }

    public final Duration o() {
        aA(5, "flagged_message_delay");
        return this.f;
    }

    @Deprecated
    public final Long p() {
        final dqsy dqsyVarB = bpmq.b();
        return Long.valueOf(dqru.b(bpmq.b(), "flagged_messages", this, new Function() { // from class: bplb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.O("flagged_messages", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bplc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bple bpleVar = this.a;
                    bpleVar.a = l.longValue();
                    bpleVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final boolean q() {
        aA(4, "flagged_message_notified");
        return this.e;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "FlaggedMessagesTable -- REDACTED") : a();
    }
}
