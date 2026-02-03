package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmkv extends dqpd implements dqpf {
    public long a;
    public int d;
    public long f;
    public ConversationIdType b = barn.a;
    public aslb c = aslb.b(0);
    public asqe e = asqe.b(0);

    protected bmkv() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BusinessConversationsMetadataTable [_id: %s,\n  conversation_id: %s,\n  chatbot_directory_conversation_state: %s,\n  conversation_stop_state: %s,\n  conversation_toolstone_state: %s,\n  conversation_toolstone_timestamp_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bmmf.c().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
        }
        aslb aslbVar = this.c;
        if (aslbVar == null) {
            contentValues.putNull("chatbot_directory_conversation_state");
        } else {
            contentValues.put("chatbot_directory_conversation_state", Integer.valueOf(aslbVar.a()));
        }
        if (iIntValue >= 59010) {
            contentValues.put("conversation_stop_state", Integer.valueOf(this.d));
        }
        if (iIntValue >= 59050) {
            asqe asqeVar = this.e;
            if (asqeVar == null) {
                contentValues.putNull("conversation_toolstone_state");
            } else {
                contentValues.put("conversation_toolstone_state", Integer.valueOf(asqeVar.a()));
            }
        }
        if (iIntValue >= 59050) {
            contentValues.put("conversation_toolstone_timestamp_ms", Long.valueOf(this.f));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmlv bmlvVar = (bmlv) ((bmlo) dqqjVar);
        aC();
        this.cN = bmlvVar.cV();
        if (bmlvVar.dj(0)) {
            this.a = bmlvVar.f();
            fN(0);
        }
        if (bmlvVar.dj(1)) {
            this.b = bmlvVar.i();
            fN(1);
        }
        if (bmlvVar.dj(2)) {
            this.c = bmlvVar.g();
            fN(2);
        }
        if (bmlvVar.dj(3)) {
            this.d = bmlvVar.c();
            fN(3);
        }
        if (bmlvVar.dj(4)) {
            this.e = bmlvVar.h();
            fN(4);
        }
        if (bmlvVar.dj(5)) {
            this.f = bmlvVar.e();
            fN(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmkv)) {
            return false;
        }
        bmkv bmkvVar = (bmkv) obj;
        return super.aE(bmkvVar.cN) && this.a == bmkvVar.a && Objects.equals(this.b, bmkvVar.b) && this.c == bmkvVar.c && this.d == bmkvVar.d && this.e == bmkvVar.e && this.f == bmkvVar.f;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "business_conversations_metadata", dqru.m(new String[]{"conversation_id", "chatbot_directory_conversation_state", "conversation_stop_state", "conversation_toolstone_state", "conversation_toolstone_timestamp_ms"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "business_conversations_metadata";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), this.e, Long.valueOf(this.f), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            bmku r0 = new bmku
            r0.<init>(r8)
            java.lang.Object r0 = r0.get()
            aslb r1 = r8.c
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r1 != 0) goto L14
            r1 = r3
            goto L1c
        L14:
            int r1 = r1.a()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1c:
            int r4 = r8.d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            asqe r5 = r8.e
            if (r5 != 0) goto L27
            goto L2f
        L27:
            int r3 = r5.a()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L2f:
            long r5 = r8.f
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            r0 = 2
            r7[r0] = r4
            r0 = 3
            r7[r0] = r3
            r0 = 4
            r7[r0] = r5
            r0 = 40
            r9.append(r0)
        L4b:
            if (r2 >= r6) goto L82
            r0 = r7[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L5b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L7a
        L5b:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L72
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r4 = 12
            if (r3 >= r4) goto L72
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L7a
        L72:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L7a:
            r0 = 44
            r9.append(r0)
            int r2 = r2 + 1
            goto L4b
        L82:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmkv.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(5, "conversation_toolstone_timestamp_ms");
        return this.f;
    }

    public final asqe l() {
        aA(4, "conversation_toolstone_state");
        return this.e;
    }

    public final void m(Function function) {
        String[] strArr = bmmf.a;
        final bmmd bmmdVar = new bmmd((bmme) function.apply(new bmme()));
        final dqsy dqsyVarB = bmmf.b();
        ((Boolean) dqsyVarB.o(new ejxr() { // from class: bmkp
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = bmmf.a;
                bmmc bmmcVar = new bmmc();
                final bmkv bmkvVar = this.a;
                bmkvVar.aA(1, "conversation_id");
                ConversationIdType conversationIdType = bmkvVar.b;
                if (conversationIdType == null || conversationIdType.equals(barn.a)) {
                    bmmcVar.a.putNull("conversation_id");
                } else {
                    bmmcVar.a.put("conversation_id", Long.valueOf(barn.a(conversationIdType)));
                }
                bmkvVar.aA(2, "chatbot_directory_conversation_state");
                bmmcVar.c(bmkvVar.c);
                bmkvVar.aA(3, "conversation_stop_state");
                int i = bmkvVar.d;
                int iIntValue = bmmf.c().intValue();
                int iIntValue2 = bmmf.c().intValue();
                if (iIntValue2 < 59010) {
                    dqru.x("conversation_stop_state", iIntValue2);
                }
                if (iIntValue >= 59010) {
                    bmmcVar.a.put("conversation_stop_state", Integer.valueOf(i));
                }
                asqe asqeVarL = bmkvVar.l();
                int iIntValue3 = bmmf.c().intValue();
                int iIntValue4 = bmmf.c().intValue();
                if (iIntValue4 < 59050) {
                    dqru.x("conversation_toolstone_state", iIntValue4);
                }
                if (iIntValue3 >= 59050) {
                    if (asqeVarL == null) {
                        bmmcVar.a.putNull("conversation_toolstone_state");
                    } else {
                        bmmcVar.a.put("conversation_toolstone_state", Integer.valueOf(asqeVarL.a()));
                    }
                }
                long jK = bmkvVar.k();
                int iIntValue5 = bmmf.c().intValue();
                int iIntValue6 = bmmf.c().intValue();
                if (iIntValue6 < 59050) {
                    dqru.x("conversation_toolstone_timestamp_ms", iIntValue6);
                }
                if (iIntValue5 >= 59050) {
                    bmmcVar.a.put("conversation_toolstone_timestamp_ms", Long.valueOf(jK));
                }
                bmmd bmmdVar2 = bmmdVar;
                bmmcVar.al();
                bmmcVar.af(bmmdVar2);
                bmmcVar.an(new dqsb("business_conversations_metadata", "-updateOrInsert-update"));
                if (bmmcVar.a().e() != 0) {
                    return true;
                }
                final dqsy dqsyVar = dqsyVarB;
                return Boolean.valueOf(dqru.b(bmmf.b(), "business_conversations_metadata", bmkvVar, new Function() { // from class: bmks
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVar.O("business_conversations_metadata", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Consumer() { // from class: bmkt
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            bmkv bmkvVar2 = bmkvVar;
                            bmkvVar2.a = l.longValue();
                            bmkvVar2.fN(0);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BusinessConversationsMetadataTable -- REDACTED") : a();
    }
}
