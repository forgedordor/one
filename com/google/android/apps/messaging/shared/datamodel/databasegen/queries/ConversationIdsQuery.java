package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.barn;
import defpackage.bbmt;
import defpackage.bbsz;
import defpackage.bbta;
import defpackage.bbtb;
import defpackage.bbtc;
import defpackage.bbtd;
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
public final class ConversationIdsQuery {
    public static final String[] a = {"conversations._id"};
    public static final bbsz b;

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<bbtb, bbtc, bbtd, BindData, bbta> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new bbmt();
        private ConversationIdType a = barn.a;

        protected BindData() {
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "ConversationIdsQuery [conversations.conversations__id: %s\n]\n", String.valueOf(this.a));
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            bbtb bbtbVar = (bbtb) dqqjVar;
            aC();
            this.cN = bbtbVar.cV();
            if (bbtbVar.dj(0)) {
                this.a = bbtbVar.c();
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
            this.a = new ConversationIdType(parcel.readLong());
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeLong(barn.a(this.a));
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, null);
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationIdsQuery -- REDACTED") : a();
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
        new ekgi().c();
        b = new bbsz();
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }
}
