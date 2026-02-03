package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bkkx;
import defpackage.bkor;
import defpackage.bkos;
import defpackage.bkot;
import defpackage.bkov;
import defpackage.bkox;
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
public final class ParticipantIdsQuery {
    public static final String[] a = {"participants._id"};
    public static final bkor b;

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<bkot, bkov, bkox, BindData, bkos> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new bkkx();
        private String a;

        protected BindData() {
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "ParticipantIdsQuery [participants.participants__id: %s\n]\n", String.valueOf(this.a));
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            bkot bkotVar = (bkot) dqqjVar;
            aC();
            this.cN = bkotVar.cV();
            if (bkotVar.dj(0)) {
                this.a = bkotVar.c();
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
            this.a = parcel.readString();
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeString(this.a);
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, null);
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ParticipantIdsQuery -- REDACTED") : a();
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
        b = new bkor();
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }
}
