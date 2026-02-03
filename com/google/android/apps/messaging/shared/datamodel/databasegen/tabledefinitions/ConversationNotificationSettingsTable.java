package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.barn;
import defpackage.bart;
import defpackage.bnxn;
import defpackage.bnyb;
import defpackage.bnyc;
import defpackage.bnyd;
import defpackage.bnyi;
import defpackage.bnyo;
import defpackage.bnyp;
import defpackage.cgra;
import defpackage.cgrc;
import defpackage.dqpd;
import defpackage.dqpf;
import defpackage.dqqe;
import defpackage.dqqj;
import defpackage.dqru;
import defpackage.dqsi;
import defpackage.dqsy;
import defpackage.dqxa;
import defpackage.ehli;
import defpackage.ekgi;
import defpackage.ekgp;
import j$.time.Instant;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ConversationNotificationSettingsTable extends dqsi {
    public static final String[] a = {"conversation_notification_settings_table.conversation_id", "conversation_notification_settings_table.muted_until_timestamp", "conversation_notification_settings_table.muted_duration", "conversation_notification_settings_table.muted_threshold"};
    public static final ekgp b = new ekgi().c();
    public static final bnyb c;
    public static final int[] d;

    static {
        new ekgi().c();
        c = new bnyb();
        d = new int[]{60720};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static dqxa b() {
        return a().M();
    }

    public static void c(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER PRIMARY KEY NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("muted_until_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("muted_duration INT DEFAULT(4)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("muted_threshold INT DEFAULT(4)");
        sb.insert(0, "CREATE TABLE conversation_notification_settings_table (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<bnyd, bnyo, bnyp, BindData, bnyc> implements Parcelable, dqpf {
        public static final Parcelable.Creator<BindData> CREATOR = new bnxn();
        public ConversationIdType a = barn.a;
        public Instant b = bart.b(0);
        public cgra c = cgra.e;
        public cgrc d = cgrc.e;

        protected BindData() {
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "ConversationNotificationSettingsTable [conversation_id: %s,\n  muted_until_timestamp: %s,\n  muted_duration: %s,\n  muted_threshold: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            ConversationIdType conversationIdType = this.a;
            if (conversationIdType == null || conversationIdType.equals(barn.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(barn.a(this.a)));
            }
            Instant instant = this.b;
            if (instant == null) {
                contentValues.putNull("muted_until_timestamp");
            } else {
                contentValues.put("muted_until_timestamp", Long.valueOf(bart.a(instant)));
            }
            cgra cgraVar = this.c;
            if (cgraVar == null) {
                contentValues.putNull("muted_duration");
            } else {
                contentValues.put("muted_duration", Integer.valueOf(cgraVar.ordinal()));
            }
            cgrc cgrcVar = this.d;
            if (cgrcVar == null) {
                contentValues.putNull("muted_threshold");
            } else {
                contentValues.put("muted_threshold", Integer.valueOf(cgrcVar.ordinal()));
            }
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            bnyi bnyiVar = (bnyi) ((bnyd) dqqjVar);
            aC();
            this.cN = bnyiVar.cV();
            if (bnyiVar.dj(0)) {
                this.a = bnyiVar.c();
                fN(0);
            }
            if (bnyiVar.dj(1)) {
                this.b = bnyiVar.g();
                fN(1);
            }
            if (bnyiVar.dj(2)) {
                this.c = bnyiVar.e();
                fN(2);
            }
            if (bnyiVar.dj(3)) {
                this.d = bnyiVar.f();
                fN(3);
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
            return super.aE(bindData.cN) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && this.c == bindData.c && this.d == bindData.d;
        }

        @Override // defpackage.dqpf
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_notification_settings_table", dqru.m(new String[]{"conversation_id", "muted_until_timestamp", "muted_duration", "muted_threshold"}));
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            this.a = new ConversationIdType(parcel.readLong());
            this.b = bart.b(parcel.readLong());
            cgra[] cgraVarArrValues = cgra.values();
            int i = parcel.readInt();
            if (i >= 0) {
                if (i >= cgraVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.c = cgraVarArrValues[i];
            }
            cgrc[] cgrcVarArrValues = cgrc.values();
            int i2 = parcel.readInt();
            if (i2 >= 0) {
                if (i2 >= cgrcVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.d = cgrcVarArrValues[i2];
            }
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeLong(barn.a(this.a));
            parcel.writeLong(bart.a(this.b));
            cgra cgraVar = this.c;
            parcel.writeInt(cgraVar == null ? -1 : cgraVar.ordinal());
            cgrc cgrcVar = this.d;
            parcel.writeInt(cgrcVar != null ? cgrcVar.ordinal() : -1);
        }

        @Override // defpackage.dqpf
        public final String g() {
            return null;
        }

        @Override // defpackage.dqpf
        public final String h() {
            return "conversation_notification_settings_table";
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
            ConversationIdType conversationIdType = this.a;
            Instant instant = this.b;
            cgra cgraVar = this.c;
            Integer numValueOf = Integer.valueOf(cgraVar == null ? 0 : cgraVar.ordinal());
            cgrc cgrcVar = this.d;
            return Objects.hash(dqqeVar2, conversationIdType, instant, numValueOf, Integer.valueOf(cgrcVar == null ? 0 : cgrcVar.ordinal()), null);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
        @Override // defpackage.dqpf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(java.lang.StringBuilder r8, java.util.List r9) {
            /*
                r7 = this;
                bnxo r0 = new bnxo
                r0.<init>(r7)
                java.lang.Object r0 = r0.get()
                j$.time.Instant r1 = r7.b
                long r1 = defpackage.bart.a(r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                cgra r2 = r7.c
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                if (r2 != 0) goto L1e
                r2 = r4
                goto L26
            L1e:
                int r2 = r2.ordinal()
                java.lang.String r2 = java.lang.String.valueOf(r2)
            L26:
                cgrc r5 = r7.d
                if (r5 != 0) goto L2b
                goto L33
            L2b:
                int r4 = r5.ordinal()
                java.lang.String r4 = java.lang.String.valueOf(r4)
            L33:
                r5 = 4
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r6[r3] = r0
                r0 = 1
                r6[r0] = r1
                r0 = 2
                r6[r0] = r2
                r0 = 3
                r6[r0] = r4
                r0 = 40
                r8.append(r0)
            L46:
                if (r3 >= r5) goto L7d
                r0 = r6[r3]
                boolean r1 = r0 instanceof java.lang.Number
                if (r1 == 0) goto L56
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r8.append(r0)
                goto L75
            L56:
                boolean r1 = r0 instanceof java.lang.String
                if (r1 == 0) goto L6d
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r1.length()
                r4 = 12
                if (r2 >= r4) goto L6d
                java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
                r8.append(r0)
                goto L75
            L6d:
                r9.add(r0)
                r0 = 63
                r8.append(r0)
            L75:
                r0 = 44
                r8.append(r0)
                int r3 = r3 + 1
                goto L46
            L7d:
                int r9 = r8.length()
                int r9 = r9 + (-1)
                r8.setLength(r9)
                r9 = 41
                r8.append(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable.BindData.i(java.lang.StringBuilder, java.util.List):void");
        }

        @Override // defpackage.dqpf
        public final /* bridge */ /* synthetic */ Object j() {
            throw null;
        }

        public final cgra k() {
            aA(2, "muted_duration");
            return this.c;
        }

        public final cgrc m() {
            aA(3, "muted_threshold");
            return this.d;
        }

        public final Instant n() {
            aA(1, "muted_until_timestamp");
            return this.b;
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationNotificationSettingsTable -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            aB(parcel);
        }
    }
}
