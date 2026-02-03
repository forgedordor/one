package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aonp;
import defpackage.bvbz;
import defpackage.bvcb;
import defpackage.bvcc;
import defpackage.bvcm;
import defpackage.bvcn;
import defpackage.bvco;
import defpackage.bvct;
import defpackage.bvcx;
import defpackage.bvcy;
import defpackage.bvdb;
import defpackage.bvdc;
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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class VmtTable extends dqsi {
    public static final String[] a = {"vmt.part_id", "vmt.vmt_status", "vmt.text", "vmt.locale"};
    public static final ekgp b = new ekgi().c();
    public static final bvcm c;
    public static final int[] d;

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<bvco, bvcx, bvcy, BindData, bvcn> implements Parcelable, dqpf {
        public static final Parcelable.Creator<BindData> CREATOR = new bvbz();
        public String a;
        public aonp b = aonp.VMT_STATUS_UNKNOWN;
        public String c;
        public String d;

        protected BindData() {
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "VmtTable [part_id: %s,\n  vmt_status: %s,\n  text: %s,\n  locale: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            dqru.v(contentValues, "part_id", this.a);
            aonp aonpVar = this.b;
            if (aonpVar == null) {
                contentValues.putNull("vmt_status");
            } else {
                contentValues.put("vmt_status", Integer.valueOf(aonpVar.a()));
            }
            dqru.v(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.c);
            dqru.v(contentValues, "locale", this.d);
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            bvct bvctVar = (bvct) ((bvco) dqqjVar);
            aC();
            this.cN = bvctVar.cV();
            if (bvctVar.dj(0)) {
                this.a = bvctVar.c();
                fN(0);
            }
            if (bvctVar.dj(1)) {
                this.b = bvctVar.e();
                fN(1);
            }
            if (bvctVar.dj(2)) {
                this.c = bvctVar.g();
                fN(2);
            }
            if (bvctVar.dj(3)) {
                this.d = bvctVar.f();
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
            return super.aE(bindData.cN) && Objects.equals(this.a, bindData.a) && this.b == bindData.b && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d);
        }

        @Override // defpackage.dqpf
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "vmt", dqru.m(new String[]{"part_id", "vmt_status", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "locale"}));
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            this.a = parcel.readString();
            this.b = aonp.b(parcel.readInt());
            this.c = parcel.readString();
            this.d = parcel.readString();
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeString(this.a);
            aonp aonpVar = this.b;
            parcel.writeInt(aonpVar == null ? -1 : aonpVar.a());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }

        @Override // defpackage.dqpf
        public final String g() {
            return null;
        }

        @Override // defpackage.dqpf
        public final String h() {
            return "vmt";
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        @Override // defpackage.dqpf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(java.lang.StringBuilder r8, java.util.List r9) {
            /*
                r7 = this;
                java.lang.String r0 = r7.a
                aonp r1 = r7.b
                r2 = 0
                if (r1 != 0) goto Lc
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                goto L14
            Lc:
                int r1 = r1.a()
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L14:
                java.lang.String r3 = r7.c
                java.lang.String r4 = r7.d
                r5 = 4
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r6[r2] = r0
                r0 = 1
                r6[r0] = r1
                r0 = 2
                r6[r0] = r3
                r0 = 3
                r6[r0] = r4
                r0 = 40
                r8.append(r0)
            L2b:
                if (r2 >= r5) goto L62
                r0 = r6[r2]
                boolean r1 = r0 instanceof java.lang.Number
                if (r1 == 0) goto L3b
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r8.append(r0)
                goto L5a
            L3b:
                boolean r1 = r0 instanceof java.lang.String
                if (r1 == 0) goto L52
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                int r3 = r1.length()
                r4 = 12
                if (r3 >= r4) goto L52
                java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
                r8.append(r0)
                goto L5a
            L52:
                r9.add(r0)
                r0 = 63
                r8.append(r0)
            L5a:
                r0 = 44
                r8.append(r0)
                int r2 = r2 + 1
                goto L2b
            L62:
                int r9 = r8.length()
                int r9 = r9 + (-1)
                r8.setLength(r9)
                r9 = 41
                r8.append(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable.BindData.i(java.lang.StringBuilder, java.util.List):void");
        }

        @Override // defpackage.dqpf
        public final /* bridge */ /* synthetic */ Object j() {
            throw null;
        }

        public final aonp k() {
            aA(1, "vmt_status");
            return this.b;
        }

        public final String m() {
            aA(3, "locale");
            return this.d;
        }

        public final String n() {
            aA(0, "part_id");
            return this.a;
        }

        public final String o() {
            aA(2, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            return this.c;
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "VmtTable -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            aB(parcel);
        }
    }

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("part_id", "index_vmt_part_id");
        ekgiVar.c();
        c = new bvcm();
        d = new int[]{58990};
    }

    public static BindData a(String str) {
        bvcy bvcyVar = new bvcy(a);
        bvcyVar.A("vmt.queryOnPartId");
        bvcyVar.q();
        bvdc bvdcVar = new bvdc();
        bvdcVar.b(str);
        bvcyVar.k(new bvdb(bvdcVar));
        return (BindData) dqru.c(bvcyVar.b());
    }

    public static bvcb b() {
        bvcc bvccVar = new bvcc();
        bvccVar.aF();
        return bvccVar;
    }

    public static dqsy c() {
        return dqru.e("$primary");
    }

    public static dqxa d() {
        return c().M();
    }

    public static void e(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("part_id INTEGER REFERENCES parts(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("vmt_status INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("locale TEXT");
        sb.insert(0, "CREATE TABLE vmt (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_vmt_part_id");
        arrayList.add("CREATE UNIQUE INDEX index_vmt_part_id ON vmt(part_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
