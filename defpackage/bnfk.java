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
public class bnfk extends dqpd implements dqpf {
    public long a;
    public String e;
    public ConversationIdType b = barn.a;
    public aukf c = aukf.CONVERSATION_CLASSIFICATION_TYPE_UNSPECIFIED;
    public aukd d = aukd.CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED;
    public long f = 0;
    public long g = 0;

    protected bnfk() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationClassificationsTable [_id: %s,\n  conversation_id: %s,\n  classification_type: %s,\n  classification_state: %s,\n  date: %s,\n  impression_count: %s,\n  generated_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bngz.c().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
        }
        aukf aukfVar = this.c;
        if (aukfVar == null) {
            contentValues.putNull("classification_type");
        } else {
            contentValues.put("classification_type", Integer.valueOf(aukfVar.a()));
        }
        if (iIntValue >= 58690) {
            aukd aukdVar = this.d;
            if (aukdVar == null) {
                contentValues.putNull("classification_state");
            } else {
                contentValues.put("classification_state", Integer.valueOf(aukdVar.a()));
            }
        }
        dqru.v(contentValues, "date", this.e);
        if (iIntValue >= 58840) {
            contentValues.put("impression_count", Long.valueOf(this.f));
        }
        if (iIntValue >= 58840) {
            contentValues.put("generated_timestamp", Long.valueOf(this.g));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bngn bngnVar = (bngn) ((bngf) dqqjVar);
        aC();
        this.cN = bngnVar.cV();
        if (bngnVar.dj(0)) {
            this.a = bngnVar.f();
            fN(0);
        }
        if (bngnVar.dj(1)) {
            this.b = bngnVar.j();
            fN(1);
        }
        if (bngnVar.dj(2)) {
            this.c = bngnVar.i();
            fN(2);
        }
        if (bngnVar.dj(3)) {
            this.d = bngnVar.h();
            fN(3);
        }
        if (bngnVar.dj(4)) {
            this.e = bngnVar.k();
            fN(4);
        }
        if (bngnVar.dj(5)) {
            this.f = bngnVar.g();
            fN(5);
        }
        if (bngnVar.dj(6)) {
            this.g = bngnVar.e();
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnfk)) {
            return false;
        }
        bnfk bnfkVar = (bnfk) obj;
        return super.aE(bnfkVar.cN) && this.a == bnfkVar.a && Objects.equals(this.b, bnfkVar.b) && this.c == bnfkVar.c && this.d == bnfkVar.d && Objects.equals(this.e, bnfkVar.e) && this.f == bnfkVar.f && this.g == bnfkVar.g;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_classifications_table", dqru.m(new String[]{"conversation_id", "classification_type", "classification_state", "date", "impression_count", "generated_timestamp"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_classifications_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, this.e, Long.valueOf(this.f), Long.valueOf(this.g), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r10, java.util.List r11) {
        /*
            r9 = this;
            bnfj r0 = new bnfj
            r0.<init>(r9)
            java.lang.Object r0 = r0.get()
            aukf r1 = r9.c
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r1 != 0) goto L14
            r1 = r3
            goto L1c
        L14:
            int r1 = r1.a()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1c:
            aukd r4 = r9.d
            if (r4 != 0) goto L21
            goto L29
        L21:
            int r3 = r4.a()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L29:
            java.lang.String r4 = r9.e
            long r5 = r9.f
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r6 = r9.g
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r2] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r3
            r0 = 3
            r8[r0] = r4
            r0 = 4
            r8[r0] = r5
            r0 = 5
            r8[r0] = r6
            r0 = 40
            r10.append(r0)
        L50:
            if (r2 >= r7) goto L87
            r0 = r8[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L60
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.append(r0)
            goto L7f
        L60:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L77
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r4 = 12
            if (r3 >= r4) goto L77
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r10.append(r0)
            goto L7f
        L77:
            r11.add(r0)
            r0 = 63
            r10.append(r0)
        L7f:
            r0 = 44
            r10.append(r0)
            int r2 = r2 + 1
            goto L50
        L87:
            int r11 = r10.length()
            int r11 = r11 + (-1)
            r10.setLength(r11)
            r11 = 41
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnfk.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(5, "impression_count");
        return this.f;
    }

    public final aukd m() {
        aA(3, "classification_state");
        return this.d;
    }

    public final aukf n() {
        aA(2, "classification_type");
        return this.c;
    }

    public final String o() {
        aA(4, "date");
        return this.e;
    }

    public final boolean p(final bngx bngxVar) {
        final dqsy dqsyVarB = bngz.b();
        return ((Boolean) dqsyVarB.o(new ejxr() { // from class: bnfh
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr = bngz.a;
                bngw bngwVar = new bngw();
                final bnfk bnfkVar = this.a;
                bnfkVar.aA(1, "conversation_id");
                ConversationIdType conversationIdType = bnfkVar.b;
                if (conversationIdType == null || conversationIdType.equals(barn.a)) {
                    bngwVar.a.putNull("conversation_id");
                } else {
                    bngwVar.a.put("conversation_id", Long.valueOf(barn.a(conversationIdType)));
                }
                bngwVar.d(bnfkVar.n());
                bngwVar.c(bnfkVar.m());
                String strO = bnfkVar.o();
                ContentValues contentValues = bngwVar.a;
                dqru.v(contentValues, "date", strO);
                bngwVar.e(bnfkVar.k());
                bnfkVar.aA(6, "generated_timestamp");
                long j = bnfkVar.g;
                int iIntValue = bngz.c().intValue();
                int iIntValue2 = bngz.c().intValue();
                if (iIntValue2 < 58840) {
                    dqru.x("generated_timestamp", iIntValue2);
                }
                if (iIntValue >= 58840) {
                    contentValues.put("generated_timestamp", Long.valueOf(j));
                }
                bngx bngxVar2 = bngxVar;
                bngwVar.al();
                bngwVar.af(bngxVar2);
                bngwVar.an(new dqsb("conversation_classifications_table", "-updateOrInsert-update"));
                if (bngwVar.a().e() != 0) {
                    return true;
                }
                final dqsy dqsyVar = dqsyVarB;
                return Boolean.valueOf(dqru.b(bngz.b(), "conversation_classifications_table", bnfkVar, new Function() { // from class: bnfi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVar.O("conversation_classifications_table", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: bnfg
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            bnfk bnfkVar2 = bnfkVar;
                            bnfkVar2.a = l.longValue();
                            bnfkVar2.fN(0);
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
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationClassificationsTable -- REDACTED") : a();
    }
}
