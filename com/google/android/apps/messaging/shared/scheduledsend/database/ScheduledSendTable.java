package com.google.android.apps.messaging.shared.scheduledsend.database;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.barn;
import defpackage.bart;
import defpackage.bary;
import defpackage.cmbb;
import defpackage.cmbh;
import defpackage.cmbi;
import defpackage.cmbx;
import defpackage.cmby;
import defpackage.cmbz;
import defpackage.cmcg;
import defpackage.cmck;
import defpackage.cmcm;
import defpackage.cmct;
import defpackage.dqpd;
import defpackage.dqpf;
import defpackage.dqqe;
import defpackage.dqqj;
import defpackage.dqru;
import defpackage.dqsi;
import defpackage.dqsy;
import defpackage.dqxa;
import defpackage.ehli;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekgi;
import defpackage.ekgp;
import j$.time.Instant;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ScheduledSendTable extends dqsi {
    public static final String[] a = {"scheduled_send._id", "scheduled_send.message_id", "scheduled_send.conversation_id", "scheduled_send.scheduled_time", "scheduled_send.status", "scheduled_send.creation_time"};
    public static final ekgp b;
    public static final cmbx c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("scheduled_send.creation_time", 58020);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_scheduled_send_conversation_id");
        ekgiVar2.c();
        c = new cmbx();
        d = new int[]{52040, 58020, 58170, 58290};
    }

    public static cmbh a() {
        cmbi cmbiVar = new cmbi();
        cmbiVar.aF();
        return cmbiVar;
    }

    public static final cmcm b() {
        String[] strArr;
        Integer numD = d();
        if (numD.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("scheduled_send._id");
            ekfwVar.h("scheduled_send.message_id");
            ekfwVar.h("scheduled_send.conversation_id");
            ekfwVar.h("scheduled_send.scheduled_time");
            ekfwVar.h("scheduled_send.status");
            if (numD.intValue() >= 58020) {
                ekfwVar.h("scheduled_send.creation_time");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new cmcm(strArr);
    }

    public static dqsy c() {
        return dqru.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(f().a());
    }

    public static void e(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER UNIQUE REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("scheduled_time INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER DEFAULT(0)");
        if (i >= 58020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("creation_time INTEGER DEFAULT(0) NOT NULL");
        }
        sb.insert(0, "CREATE TABLE scheduled_send (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58170) {
            arrayList.add("DROP INDEX IF EXISTS index_scheduled_send_conversation_id");
            arrayList.add("CREATE INDEX index_scheduled_send_conversation_id ON scheduled_send(conversation_id);");
        }
        if (i >= 58290) {
            arrayList.add("DROP INDEX IF EXISTS index_status_time");
            arrayList.add("CREATE INDEX index_status_time ON scheduled_send(status, scheduled_time);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa f() {
        return c().M();
    }

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<cmbz, cmck, cmcm, BindData, cmby> implements Parcelable, dqpf {
        public static final Parcelable.Creator<BindData> CREATOR = new cmbb();
        public String a;
        public MessageIdType b = bary.a;
        public ConversationIdType c = barn.a;
        public Instant d = bart.b(0);
        public cmct e = cmct.SCHEDULED;
        public Instant f = bart.b(0);

        protected BindData() {
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "ScheduledSendTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  scheduled_time: %s,\n  status: %s,\n  creation_time: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            int iIntValue = ScheduledSendTable.d().intValue();
            MessageIdType messageIdType = this.b;
            if (messageIdType == null || messageIdType.equals(bary.a)) {
                contentValues.putNull("message_id");
            } else {
                contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
            }
            ConversationIdType conversationIdType = this.c;
            if (conversationIdType == null || conversationIdType.equals(barn.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(barn.a(this.c)));
            }
            Instant instant = this.d;
            if (instant == null) {
                contentValues.putNull("scheduled_time");
            } else {
                contentValues.put("scheduled_time", Long.valueOf(bart.a(instant)));
            }
            cmct cmctVar = this.e;
            if (cmctVar == null) {
                contentValues.putNull("status");
            } else {
                contentValues.put("status", Integer.valueOf(cmctVar.ordinal()));
            }
            if (iIntValue >= 58020) {
                Instant instant2 = this.f;
                if (instant2 == null) {
                    contentValues.putNull("creation_time");
                } else {
                    contentValues.put("creation_time", Long.valueOf(bart.a(instant2)));
                }
            }
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            cmcg cmcgVar = (cmcg) ((cmbz) dqqjVar);
            aC();
            this.cN = cmcgVar.cV();
            if (cmcgVar.dj(0)) {
                this.a = cmcgVar.i();
                super.fN(0);
            }
            if (cmcgVar.dj(1)) {
                this.b = cmcgVar.e();
                super.fN(1);
            }
            if (cmcgVar.dj(2)) {
                this.c = cmcgVar.c();
                super.fN(2);
            }
            if (cmcgVar.dj(3)) {
                this.d = cmcgVar.h();
                super.fN(3);
            }
            if (cmcgVar.dj(4)) {
                this.e = cmcgVar.f();
                super.fN(4);
            }
            if (cmcgVar.dj(5)) {
                this.f = cmcgVar.g();
                super.fN(5);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData bindData = (BindData) obj;
            return super.aE(bindData.cN) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && this.e == bindData.e && Objects.equals(this.f, bindData.f);
        }

        @Override // defpackage.dqpf
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "scheduled_send", dqru.m(new String[]{"message_id", "conversation_id", "scheduled_time", "status", "creation_time"}));
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            this.a = parcel.readString();
            this.b = new MessageIdType(parcel.readLong());
            this.c = new ConversationIdType(parcel.readLong());
            this.d = bart.b(parcel.readLong());
            cmct[] cmctVarArrValues = cmct.values();
            int i = parcel.readInt();
            if (i >= 0) {
                if (i >= cmctVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.e = cmctVarArrValues[i];
            }
            this.f = bart.b(parcel.readLong());
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeLong(bary.a(this.b));
            parcel.writeLong(barn.a(this.c));
            parcel.writeLong(bart.a(this.d));
            cmct cmctVar = this.e;
            parcel.writeInt(cmctVar == null ? -1 : cmctVar.ordinal());
            parcel.writeLong(bart.a(this.f));
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
            return "scheduled_send";
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
            String str = this.a;
            MessageIdType messageIdType = this.b;
            ConversationIdType conversationIdType = this.c;
            Instant instant = this.d;
            cmct cmctVar = this.e;
            return Objects.hash(dqqeVar2, str, messageIdType, conversationIdType, instant, Integer.valueOf(cmctVar == null ? 0 : cmctVar.ordinal()), this.f, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
        @Override // defpackage.dqpf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(java.lang.StringBuilder r9, java.util.List r10) {
            /*
                r8 = this;
                cmbc r0 = new cmbc
                r0.<init>(r8)
                java.lang.Object r0 = r0.get()
                cmbd r1 = new cmbd
                r1.<init>(r8)
                java.lang.Object r1 = r1.get()
                j$.time.Instant r2 = r8.d
                long r2 = defpackage.bart.a(r2)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                cmct r3 = r8.e
                r4 = 0
                if (r3 != 0) goto L26
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                goto L2e
            L26:
                int r3 = r3.ordinal()
                java.lang.String r3 = java.lang.String.valueOf(r3)
            L2e:
                j$.time.Instant r5 = r8.f
                long r5 = defpackage.bart.a(r5)
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = 5
                java.lang.Object[] r7 = new java.lang.Object[r6]
                r7[r4] = r0
                r0 = 1
                r7[r0] = r1
                r0 = 2
                r7[r0] = r2
                r0 = 3
                r7[r0] = r3
                r0 = 4
                r7[r0] = r5
                r0 = 40
                r9.append(r0)
            L4e:
                if (r4 >= r6) goto L85
                r0 = r7[r4]
                boolean r1 = r0 instanceof java.lang.Number
                if (r1 == 0) goto L5e
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r9.append(r0)
                goto L7d
            L5e:
                boolean r1 = r0 instanceof java.lang.String
                if (r1 == 0) goto L75
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r1.length()
                r3 = 12
                if (r2 >= r3) goto L75
                java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
                r9.append(r0)
                goto L7d
            L75:
                r10.add(r0)
                r0 = 63
                r9.append(r0)
            L7d:
                r0 = 44
                r9.append(r0)
                int r4 = r4 + 1
                goto L4e
            L85:
                int r10 = r9.length()
                int r10 = r10 + (-1)
                r9.setLength(r10)
                r10 = 41
                r9.append(r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable.BindData.i(java.lang.StringBuilder, java.util.List):void");
        }

        @Override // defpackage.dqpf
        public final /* bridge */ /* synthetic */ Object j() {
            throw null;
        }

        public final Instant k() {
            aA(5, "creation_time");
            return this.f;
        }

        public final Instant m() {
            aA(3, "scheduled_time");
            return this.d;
        }

        public final String n() {
            aA(0, "_id");
            return this.a;
        }

        public final /* synthetic */ void o(Long l) {
            if (l.longValue() >= 0) {
                this.a = String.valueOf(l);
                super.fN(0);
            }
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ScheduledSendTable -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            aB(parcel);
        }
    }
}
