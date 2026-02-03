package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.bary;
import defpackage.bkgg;
import defpackage.bkko;
import defpackage.bkkp;
import defpackage.bkkq;
import defpackage.bkks;
import defpackage.bkku;
import defpackage.dqpd;
import defpackage.dqqe;
import defpackage.dqqj;
import defpackage.dqru;
import defpackage.dqsy;
import defpackage.ehli;
import defpackage.ekgi;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MessageWithTextIdsQuery {
    public static final String[] a = {"parts.message_id"};
    public static final bkko b;

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<bkkq, bkks, bkku, BindData, bkkp> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new bkgg();
        private MessageIdType a = bary.a;

        protected BindData() {
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "MessageWithTextIdsQuery [parts.parts_message_id: %s\n]\n", String.valueOf(this.a));
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            bkkq bkkqVar = (bkkq) dqqjVar;
            aC();
            this.cN = bkkqVar.cV();
            if (bkkqVar.dj(0)) {
                this.a = bkkqVar.c();
                super.fN(0);
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
            return super.aE(bindData.cN) && Objects.equals(this.a, bindData.a);
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            this.a = new MessageIdType(parcel.readLong());
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeLong(bary.a(this.a));
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, null);
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageWithTextIdsQuery -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            aB(parcel);
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
        }
    }

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_null_message_id");
        ekgiVar.c();
        b = new bkko();
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }
}
