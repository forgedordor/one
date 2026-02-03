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
public class bpde extends dqpd implements dqpf {
    public MessageIdType a = bary.a;
    public String b;

    protected bpde() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "EmergencyQuestionnaireOptionTable [message_id: %s,\n  option_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.a)));
        }
        dqru.v(contentValues, "option_id", this.b);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpds bpdsVar = (bpds) ((bpdp) dqqjVar);
        aC();
        this.cN = bpdsVar.cV();
        if (bpdsVar.dj(0)) {
            this.a = bpdsVar.e();
            fN(0);
        }
        if (bpdsVar.dj(1)) {
            this.b = bpdsVar.f();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpde)) {
            return false;
        }
        bpde bpdeVar = (bpde) obj;
        return super.aE(bpdeVar.cN) && Objects.equals(this.a, bpdeVar.a) && Objects.equals(this.b, bpdeVar.b);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "emergency_questionnaire_option", dqru.m(new String[]{"message_id", "option_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "emergency_questionnaire_option";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            bpdd r0 = new bpdd
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r7.b
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L19:
            if (r4 >= r2) goto L50
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L29
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L48
        L29:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L40
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L40
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L48
        L40:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L48:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L19
        L50:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpde.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String k() {
        aA(1, "option_id");
        return this.b;
    }

    public final boolean m(Function function) {
        String[] strArr = bped.a;
        final bpeb bpebVar = new bpeb((bpec) function.apply(new bpec()));
        final dqsy dqsyVarB = bped.b();
        return ((Boolean) dqsyVarB.o(new ejxr() { // from class: bpdc
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = bped.a;
                bpea bpeaVar = new bpea();
                bpde bpdeVar = this.a;
                bpdeVar.aA(0, "message_id");
                MessageIdType messageIdType = bpdeVar.a;
                if (messageIdType == null || messageIdType.equals(bary.a)) {
                    bpeaVar.a.putNull("message_id");
                } else {
                    bpeaVar.a.put("message_id", Long.valueOf(bary.a(messageIdType)));
                }
                bpeb bpebVar2 = bpebVar;
                dqru.v(bpeaVar.a, "option_id", bpdeVar.k());
                bpeaVar.al();
                bpeaVar.af(bpebVar2);
                bpeaVar.an(new dqsb("emergency_questionnaire_option", "-updateOrInsert-update"));
                if (bpeaVar.a().e() != 0) {
                    return true;
                }
                final dqsy dqsyVar = dqsyVarB;
                return Boolean.valueOf(dqru.b(bped.b(), "emergency_questionnaire_option", bpdeVar, new Function() { // from class: bpda
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVar.O("emergency_questionnaire_option", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Consumer() { // from class: bpdb
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "EmergencyQuestionnaireOptionTable -- REDACTED") : a();
    }
}
