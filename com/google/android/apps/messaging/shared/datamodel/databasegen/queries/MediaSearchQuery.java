package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.barn;
import defpackage.bary;
import defpackage.bibu;
import defpackage.biwd;
import defpackage.biwe;
import defpackage.biwf;
import defpackage.biwh;
import defpackage.biwj;
import defpackage.bvdq;
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
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MediaSearchQuery {
    public static final String[] a = {"parts._id", "parts.message_id", "parts.uri", "parts.content_type", "parts.width", "parts.height", "parts.timestamp", "parts.conversation_id", "parts.image_display_state", "messages._id", "messages.sender_id", "messages.received_timestamp", "messages.self_id", "participants._id", "participants.sub_id", "participants.normalized_destination", "participants.full_name", "participants.lookup_key", "message_star._id", "parent_disallowed_conversations.conversation_id", "conversations.participant_normalized_destination", "conversations.has_ea2p_bot_recipient"};
    public static final biwd b;

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<biwf, biwh, biwj, BindData, biwe> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new bibu();
        public int a;
        public int b;
        public long c;
        public long d;
        public boolean e;
        private String f;
        private MessageIdType g;
        private Uri h;
        private String i;
        private ConversationIdType j;
        private bvdq k;
        private MessageIdType l;
        private String m;
        private long n;
        private String o;
        private String p;
        private int q;
        private String r;
        private String s;
        private String t;
        private ConversationIdType u;
        private String v;

        protected BindData() {
            MessageIdType messageIdType = bary.a;
            this.g = messageIdType;
            this.a = -1;
            this.b = -1;
            ConversationIdType conversationIdType = barn.a;
            this.j = conversationIdType;
            this.k = bvdq.DEFAULT_NO_VERDICT;
            this.l = messageIdType;
            this.n = 0L;
            this.q = -2;
            this.u = conversationIdType;
            this.e = false;
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "MediaSearchQuery [parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_image_display_state: %s,\n  messages.messages__id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_self_id: %s,\n  participants.participants__id: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_lookup_key: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s\n]\n", String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.d), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.e));
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            MediaSearchQuery.c().intValue();
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            biwf biwfVar = (biwf) dqqjVar;
            aC();
            this.cN = biwfVar.cV();
            if (biwfVar.dj(0)) {
                this.f = biwfVar.getString(biwfVar.cO(0, MediaSearchQuery.a));
                fN(0);
            }
            if (biwfVar.dj(1)) {
                this.g = new MessageIdType(biwfVar.getLong(biwfVar.cO(1, MediaSearchQuery.a)));
                fN(1);
            }
            if (biwfVar.dj(2)) {
                String string = biwfVar.getString(biwfVar.cO(2, MediaSearchQuery.a));
                this.h = string == null ? null : Uri.parse(string);
                fN(2);
            }
            if (biwfVar.dj(3)) {
                this.i = biwfVar.getString(biwfVar.cO(3, MediaSearchQuery.a));
                fN(3);
            }
            if (biwfVar.dj(4)) {
                this.a = biwfVar.getInt(biwfVar.cO(4, MediaSearchQuery.a));
                fN(4);
            }
            if (biwfVar.dj(5)) {
                this.b = biwfVar.getInt(biwfVar.cO(5, MediaSearchQuery.a));
                fN(5);
            }
            if (biwfVar.dj(6)) {
                this.c = biwfVar.getLong(biwfVar.cO(6, MediaSearchQuery.a));
                fN(6);
            }
            if (biwfVar.dj(7)) {
                this.j = new ConversationIdType(biwfVar.getLong(biwfVar.cO(7, MediaSearchQuery.a)));
                fN(7);
            }
            if (biwfVar.dj(8)) {
                bvdq[] bvdqVarArrValues = bvdq.values();
                int i = biwfVar.getInt(biwfVar.cO(8, MediaSearchQuery.a));
                if (i >= bvdqVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.k = bvdqVarArrValues[i];
                fN(8);
            }
            if (biwfVar.dj(9)) {
                this.l = new MessageIdType(biwfVar.getLong(biwfVar.cO(9, MediaSearchQuery.a)));
                fN(9);
            }
            if (biwfVar.dj(10)) {
                this.m = biwfVar.getString(biwfVar.cO(10, MediaSearchQuery.a));
                fN(10);
            }
            if (biwfVar.dj(11)) {
                this.n = biwfVar.getLong(biwfVar.cO(11, MediaSearchQuery.a));
                fN(11);
            }
            if (biwfVar.dj(12)) {
                this.o = biwfVar.getString(biwfVar.cO(12, MediaSearchQuery.a));
                fN(12);
            }
            if (biwfVar.dj(13)) {
                this.p = biwfVar.getString(biwfVar.cO(13, MediaSearchQuery.a));
                fN(13);
            }
            if (biwfVar.dj(14)) {
                this.q = biwfVar.getInt(biwfVar.cO(14, MediaSearchQuery.a));
                fN(14);
            }
            if (biwfVar.dj(15)) {
                this.r = cssb.a(biwfVar.getString(biwfVar.cO(15, MediaSearchQuery.a)));
                fN(15);
            }
            if (biwfVar.dj(16)) {
                this.s = cssq.a(biwfVar.getString(biwfVar.cO(16, MediaSearchQuery.a)));
                fN(16);
            }
            if (biwfVar.dj(17)) {
                this.t = biwfVar.getString(biwfVar.cO(17, MediaSearchQuery.a));
                fN(17);
            }
            if (biwfVar.dj(18)) {
                this.d = biwfVar.getLong(biwfVar.cO(18, MediaSearchQuery.a));
                fN(18);
            }
            if (biwfVar.dj(19)) {
                this.u = new ConversationIdType(biwfVar.getLong(biwfVar.cO(19, MediaSearchQuery.a)));
                fN(19);
            }
            if (biwfVar.dj(20)) {
                this.v = biwfVar.getString(biwfVar.cO(20, MediaSearchQuery.a));
                fN(20);
            }
            if (biwfVar.dj(21)) {
                this.e = biwfVar.getInt(biwfVar.cO(21, MediaSearchQuery.a)) == 1;
                fN(21);
            }
        }

        @Override // android.os.Parcelable
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
            return super.aE(bindData.cN) && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && this.a == bindData.a && this.b == bindData.b && this.c == bindData.c && Objects.equals(this.j, bindData.j) && this.k == bindData.k && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && this.n == bindData.n && Objects.equals(this.o, bindData.o) && Objects.equals(this.p, bindData.p) && this.q == bindData.q && Objects.equals(this.r, bindData.r) && Objects.equals(this.s, bindData.s) && Objects.equals(this.t, bindData.t) && this.d == bindData.d && Objects.equals(this.u, bindData.u) && Objects.equals(this.v, bindData.v) && this.e == bindData.e;
        }

        public final int f() {
            aA(14, "sub_id");
            return this.q;
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            this.f = parcel.readString();
            this.g = new MessageIdType(parcel.readLong());
            String string = parcel.readString();
            this.h = string == null ? null : Uri.parse(string);
            this.i = parcel.readString();
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readLong();
            this.j = new ConversationIdType(parcel.readLong());
            bvdq[] bvdqVarArrValues = bvdq.values();
            int i = parcel.readInt();
            if (i >= 0) {
                if (i >= bvdqVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.k = bvdqVarArrValues[i];
            }
            this.l = new MessageIdType(parcel.readLong());
            this.m = parcel.readString();
            this.n = parcel.readLong();
            this.o = parcel.readString();
            this.p = parcel.readString();
            this.q = parcel.readInt();
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = parcel.readString();
            this.d = parcel.readLong();
            this.u = new ConversationIdType(parcel.readLong());
            this.v = parcel.readString();
            this.e = parcel.readInt() == 1;
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeString(this.f);
            parcel.writeLong(bary.a(this.g));
            Uri uri = this.h;
            parcel.writeString(uri == null ? null : uri.toString());
            parcel.writeString(this.i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(barn.a(this.j));
            bvdq bvdqVar = this.k;
            parcel.writeInt(bvdqVar == null ? -1 : bvdqVar.ordinal());
            parcel.writeLong(bary.a(this.l));
            parcel.writeString(this.m);
            parcel.writeLong(this.n);
            parcel.writeString(this.o);
            parcel.writeString(this.p);
            parcel.writeInt(this.q);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
            parcel.writeLong(this.d);
            parcel.writeLong(barn.a(this.u));
            parcel.writeString(this.v);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public final long g() {
            aA(11, "received_timestamp");
            return this.n;
        }

        public final Uri h() {
            aA(2, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            return this.h;
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
            String str = this.f;
            MessageIdType messageIdType = this.g;
            Uri uri = this.h;
            String str2 = this.i;
            Integer numValueOf = Integer.valueOf(this.a);
            Integer numValueOf2 = Integer.valueOf(this.b);
            Long lValueOf = Long.valueOf(this.c);
            ConversationIdType conversationIdType = this.j;
            bvdq bvdqVar = this.k;
            return Objects.hash(dqqeVar2, str, messageIdType, uri, str2, numValueOf, numValueOf2, lValueOf, conversationIdType, Integer.valueOf(bvdqVar == null ? 0 : bvdqVar.ordinal()), this.l, this.m, Long.valueOf(this.n), this.o, this.p, Integer.valueOf(this.q), this.r, this.s, this.t, Long.valueOf(this.d), this.u, this.v, Boolean.valueOf(this.e), null);
        }

        public final ConversationIdType i() {
            aA(7, "conversation_id");
            return this.j;
        }

        public final MessageIdType j() {
            aA(1, "message_id");
            return this.g;
        }

        public final String k() {
            aA(3, "content_type");
            return this.i;
        }

        public final String l() {
            aA(16, "full_name");
            return this.s;
        }

        public final String m() {
            aA(0, "_id");
            return this.f;
        }

        public final String n() {
            aA(15, "normalized_destination");
            return this.r;
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MediaSearchQuery -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            MessageIdType messageIdType = bary.a;
            this.g = messageIdType;
            this.a = -1;
            this.b = -1;
            ConversationIdType conversationIdType = barn.a;
            this.j = conversationIdType;
            this.k = bvdq.DEFAULT_NO_VERDICT;
            this.l = messageIdType;
            this.n = 0L;
            this.q = -2;
            this.u = conversationIdType;
            this.e = false;
            aB(parcel);
        }
    }

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("parts.timestamp", 3010);
        ekgiVar.i("parts.image_display_state", 60240);
        ekgiVar.i("conversations.has_ea2p_bot_recipient", 12001);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_null_message_id");
        ekgiVar2.i("content_type", "index_null_content_type");
        ekgiVar2.i("conversation_id", "index_null_conversation_id");
        ekgiVar2.c();
        b = new biwd();
    }

    public static final biwj a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("parts._id");
            ekfwVar.h("parts.message_id");
            ekfwVar.h("parts.uri");
            ekfwVar.h("parts.content_type");
            ekfwVar.h("parts.width");
            ekfwVar.h("parts.height");
            if (numC.intValue() >= 3010) {
                ekfwVar.h("parts.timestamp");
            }
            ekfwVar.h("parts.conversation_id");
            if (numC.intValue() >= 60240) {
                ekfwVar.h("parts.image_display_state");
            }
            ekfwVar.h("messages._id");
            ekfwVar.h("messages.sender_id");
            ekfwVar.h("messages.received_timestamp");
            ekfwVar.h("messages.self_id");
            ekfwVar.h("participants._id");
            ekfwVar.h("participants.sub_id");
            ekfwVar.h("participants.normalized_destination");
            ekfwVar.h("participants.full_name");
            ekfwVar.h("participants.lookup_key");
            ekfwVar.h("message_star._id");
            ekfwVar.h("parent_disallowed_conversations.conversation_id");
            ekfwVar.h("conversations.participant_normalized_destination");
            if (numC.intValue() >= 12001) {
                ekfwVar.h("conversations.has_ea2p_bot_recipient");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new biwj(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
