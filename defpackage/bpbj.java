package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpbj extends dqpd implements dqpf {
    public String b;
    public wry c;
    public String d;
    public String f;
    public ConversationIdType a = barn.a;
    public boolean e = false;
    public boolean g = false;

    protected bpbj() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "DraftsTable [conversation_id: %s,\n  text: %s,\n  attachments: %s,\n  subject: %s,\n  is_urgent: %s,\n  replied_to_message_id: %s,\n  is_encrypted: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bpcy.c().intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.a)));
        }
        dqru.v(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.b);
        if (iIntValue >= 59420) {
            wry wryVar = this.c;
            if (wryVar == null) {
                contentValues.putNull("attachments");
            } else {
                contentValues.put("attachments", wryVar.toByteArray());
            }
        }
        if (iIntValue >= 59170) {
            dqru.v(contentValues, "subject", this.d);
        }
        if (iIntValue >= 59170) {
            contentValues.put("is_urgent", Boolean.valueOf(this.e));
        }
        if (iIntValue >= 59540) {
            dqru.v(contentValues, "replied_to_message_id", this.f);
        }
        if (iIntValue >= 59720) {
            contentValues.put("is_encrypted", Boolean.valueOf(this.g));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpcm bpcmVar = (bpcm) ((bpce) dqqjVar);
        aC();
        this.cN = bpcmVar.cV();
        if (bpcmVar.dj(0)) {
            this.a = bpcmVar.e();
            fN(0);
        }
        if (bpcmVar.dj(1)) {
            this.b = bpcmVar.h();
            fN(1);
        }
        if (bpcmVar.dj(2)) {
            this.c = bpcmVar.c();
            fN(2);
        }
        if (bpcmVar.dj(3)) {
            this.d = bpcmVar.g();
            fN(3);
        }
        if (bpcmVar.dj(4)) {
            this.e = bpcmVar.j();
            fN(4);
        }
        if (bpcmVar.dj(5)) {
            this.f = bpcmVar.f();
            fN(5);
        }
        if (bpcmVar.dj(6)) {
            this.g = bpcmVar.i();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpbj)) {
            return false;
        }
        bpbj bpbjVar = (bpbj) obj;
        return super.aE(bpbjVar.cN) && Objects.equals(this.a, bpbjVar.a) && Objects.equals(this.b, bpbjVar.b) && Objects.equals(this.c, bpbjVar.c) && Objects.equals(this.d, bpbjVar.d) && this.e == bpbjVar.e && Objects.equals(this.f, bpbjVar.f) && this.g == bpbjVar.g;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "drafts", dqru.m(new String[]{"conversation_id", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "attachments", "subject", "is_urgent", "replied_to_message_id", "is_encrypted"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "drafts";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r11, java.util.List r12) {
        /*
            r10 = this;
            bpbi r0 = new bpbi
            r0.<init>(r10)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r10.b
            wry r2 = r10.c
            if (r2 != 0) goto L11
            r2 = 0
            goto L15
        L11:
            byte[] r2 = r2.toByteArray()
        L15:
            java.lang.String r3 = r10.d
            boolean r4 = r10.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = r10.f
            boolean r6 = r10.g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 7
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r5
            r0 = 6
            r8[r0] = r6
            r0 = 40
            r11.append(r0)
        L42:
            if (r9 >= r7) goto L79
            r0 = r8[r9]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L52
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.append(r0)
            goto L71
        L52:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L69
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L69
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r11.append(r0)
            goto L71
        L69:
            r12.add(r0)
            r0 = 63
            r11.append(r0)
        L71:
            r0 = 44
            r11.append(r0)
            int r9 = r9 + 1
            goto L42
        L79:
            int r12 = r11.length()
            int r12 = r12 + (-1)
            r11.setLength(r12)
            r12 = 41
            r11.append(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpbj.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        return k(5);
    }

    public final Long k(final int i) {
        final dqsy dqsyVarB = bpcy.b();
        return Long.valueOf(dqru.b(bpcy.b(), "drafts", this, new Function() { // from class: bpbe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.Q("drafts", (dqst) obj, i));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bpbf
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final /* synthetic */ eiju m() {
        return eijx.g(new Callable() { // from class: dqpe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.j();
            }
        }, (Executor) ((dqoj) dqru.c).h.get());
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "DraftsTable -- REDACTED") : a();
    }
}
