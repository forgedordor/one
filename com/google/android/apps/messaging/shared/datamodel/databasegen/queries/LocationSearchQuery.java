package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.barn;
import defpackage.bary;
import defpackage.bhkx;
import defpackage.bibl;
import defpackage.bibm;
import defpackage.bibn;
import defpackage.bibp;
import defpackage.bibr;
import defpackage.cssb;
import defpackage.cssq;
import defpackage.dqpd;
import defpackage.dqqe;
import defpackage.dqqj;
import defpackage.dqru;
import defpackage.dqsy;
import defpackage.ehli;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekgi;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.ezds;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class LocationSearchQuery {
    public static final String[] a = {"messages_annotations._id", "messages_annotations.message_id", "messages_annotations.annotation_details", "messages._id", "messages.conversation_id", "messages.received_timestamp", "participants.sub_id", "participants.normalized_destination", "participants.full_name", "message_star._id", "parent_disallowed_conversations.conversation_id", "conversations.participant_normalized_destination", "conversations.has_ea2p_bot_recipient"};
    public static final bibl b;

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<bibn, bibp, bibr, BindData, bibm> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new bhkx();
        public String a;
        public ConversationIdType b;
        public long c;
        public int d;
        public String e;
        public long f;
        public boolean g;
        private MessageIdType h;
        private ezds i;
        private MessageIdType j;
        private String k;
        private ConversationIdType l;
        private String m;

        protected BindData() {
            MessageIdType messageIdType = bary.a;
            this.h = messageIdType;
            this.j = messageIdType;
            ConversationIdType conversationIdType = barn.a;
            this.b = conversationIdType;
            this.c = 0L;
            this.d = -2;
            this.l = conversationIdType;
            this.g = false;
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "LocationSearchQuery [messages_annotations.messages_annotations__id: %s,\n  messages_annotations.messages_annotations_message_id: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_full_name: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s\n]\n", String.valueOf(this.a), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.k), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.g));
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            LocationSearchQuery.c().intValue();
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            ezds ezdsVar;
            bibn bibnVar = (bibn) dqqjVar;
            aC();
            this.cN = bibnVar.cV();
            if (bibnVar.dj(0)) {
                this.a = bibnVar.getString(bibnVar.cO(0, LocationSearchQuery.a));
                fN(0);
            }
            if (bibnVar.dj(1)) {
                this.h = new MessageIdType(bibnVar.getLong(bibnVar.cO(1, LocationSearchQuery.a)));
                fN(1);
            }
            if (bibnVar.dj(2)) {
                byte[] blob = bibnVar.getBlob(bibnVar.cO(2, LocationSearchQuery.a));
                if (blob == null) {
                    ezdsVar = null;
                } else {
                    try {
                        ezdsVar = (ezds) evsn.parseFrom(ezds.a, blob, evrr.a());
                    } catch (Throwable unused) {
                        ezdsVar = ezds.a;
                    }
                }
                this.i = ezdsVar;
                fN(2);
            }
            if (bibnVar.dj(3)) {
                this.j = new MessageIdType(bibnVar.getLong(bibnVar.cO(3, LocationSearchQuery.a)));
                fN(3);
            }
            if (bibnVar.dj(4)) {
                this.b = new ConversationIdType(bibnVar.getLong(bibnVar.cO(4, LocationSearchQuery.a)));
                fN(4);
            }
            if (bibnVar.dj(5)) {
                this.c = bibnVar.getLong(bibnVar.cO(5, LocationSearchQuery.a));
                fN(5);
            }
            if (bibnVar.dj(6)) {
                this.d = bibnVar.getInt(bibnVar.cO(6, LocationSearchQuery.a));
                fN(6);
            }
            if (bibnVar.dj(7)) {
                this.k = cssb.a(bibnVar.getString(bibnVar.cO(7, LocationSearchQuery.a)));
                fN(7);
            }
            if (bibnVar.dj(8)) {
                this.e = cssq.a(bibnVar.getString(bibnVar.cO(8, LocationSearchQuery.a)));
                fN(8);
            }
            if (bibnVar.dj(9)) {
                this.f = bibnVar.getLong(bibnVar.cO(9, LocationSearchQuery.a));
                fN(9);
            }
            if (bibnVar.dj(10)) {
                this.l = new ConversationIdType(bibnVar.getLong(bibnVar.cO(10, LocationSearchQuery.a)));
                fN(10);
            }
            if (bibnVar.dj(11)) {
                this.m = bibnVar.getString(bibnVar.cO(11, LocationSearchQuery.a));
                fN(11);
            }
            if (bibnVar.dj(12)) {
                this.g = bibnVar.getInt(bibnVar.cO(12, LocationSearchQuery.a)) == 1;
                fN(12);
            }
        }

        public int describeContents() {
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
            return super.aE(bindData.cN) && Objects.equals(this.a, bindData.a) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && Objects.equals(this.j, bindData.j) && Objects.equals(this.b, bindData.b) && this.c == bindData.c && this.d == bindData.d && Objects.equals(this.k, bindData.k) && Objects.equals(this.e, bindData.e) && this.f == bindData.f && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && this.g == bindData.g;
        }

        public final MessageIdType f() {
            aA(1, "message_id");
            return this.h;
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            ezds ezdsVar;
            this.a = parcel.readString();
            this.h = new MessageIdType(parcel.readLong());
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                ezdsVar = null;
            } else {
                try {
                    ezdsVar = (ezds) evsn.parseFrom(ezds.a, bArrCreateByteArray, evrr.a());
                } catch (Throwable unused) {
                    this.i = null;
                }
            }
            this.i = ezdsVar;
            this.j = new MessageIdType(parcel.readLong());
            this.b = new ConversationIdType(parcel.readLong());
            this.c = parcel.readLong();
            this.d = parcel.readInt();
            this.k = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readLong();
            this.l = new ConversationIdType(parcel.readLong());
            this.m = parcel.readString();
            this.g = parcel.readInt() == 1;
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeLong(bary.a(this.h));
            ezds ezdsVar = this.i;
            parcel.writeByteArray(ezdsVar == null ? null : ezdsVar.toByteArray());
            parcel.writeLong(bary.a(this.j));
            parcel.writeLong(barn.a(this.b));
            parcel.writeLong(this.c);
            parcel.writeInt(this.d);
            parcel.writeString(this.k);
            parcel.writeString(this.e);
            parcel.writeLong(this.f);
            parcel.writeLong(barn.a(this.l));
            parcel.writeString(this.m);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public final ezds g() {
            aA(2, "annotation_details");
            return this.i;
        }

        public final String h() {
            aA(7, "normalized_destination");
            return this.k;
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.h, this.i, this.j, this.b, Long.valueOf(this.c), Integer.valueOf(this.d), this.k, this.e, Long.valueOf(this.f), this.l, this.m, Boolean.valueOf(this.g), null);
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "LocationSearchQuery -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            MessageIdType messageIdType = bary.a;
            this.h = messageIdType;
            this.j = messageIdType;
            ConversationIdType conversationIdType = barn.a;
            this.b = conversationIdType;
            this.c = 0L;
            this.d = -2;
            this.l = conversationIdType;
            this.g = false;
            aB(parcel);
        }
    }

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("messages_annotations.message_id", 20040);
        ekgiVar.i("conversations.has_ea2p_bot_recipient", 12001);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_null_message_id");
        ekgiVar2.c();
        b = new bibl();
    }

    public static final bibr a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("messages_annotations._id");
            if (numC.intValue() >= 20040) {
                ekfwVar.h("messages_annotations.message_id");
            }
            ekfwVar.h("messages_annotations.annotation_details");
            ekfwVar.h("messages._id");
            ekfwVar.h("messages.conversation_id");
            ekfwVar.h("messages.received_timestamp");
            ekfwVar.h("participants.sub_id");
            ekfwVar.h("participants.normalized_destination");
            ekfwVar.h("participants.full_name");
            ekfwVar.h("message_star._id");
            ekfwVar.h("parent_disallowed_conversations.conversation_id");
            ekfwVar.h("conversations.participant_normalized_destination");
            if (numC.intValue() >= 12001) {
                ekfwVar.h("conversations.has_ea2p_bot_recipient");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bibr(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
