package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.barn;
import defpackage.bary;
import defpackage.blmv;
import defpackage.bmei;
import defpackage.bmej;
import defpackage.bmek;
import defpackage.bmem;
import defpackage.bmeo;
import defpackage.cssb;
import defpackage.cssq;
import defpackage.dqpd;
import defpackage.dqqe;
import defpackage.dqqj;
import defpackage.dqru;
import defpackage.dqsy;
import defpackage.dqxa;
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
public final class UrlSearchQuery {
    public static final String[] a = {"messages_annotations._id", "messages_annotations.message_id", "messages_annotations.annotation_details", "messages.conversation_id", "messages.received_timestamp", "participants.sub_id", "participants.normalized_destination", "participants.full_name", "link_preview._id", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_description", "link_preview.link_image_url", "link_preview.link_domain", "link_preview.link_canonical_url", "link_preview.link_preview_prevented", "link_preview.link_preview_failed", "message_star._id", "parent_disallowed_conversations.conversation_id", "conversations.participant_normalized_destination", "conversations.has_ea2p_bot_recipient"};
    public static final bmei b;

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<bmek, bmem, bmeo, BindData, bmej> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new blmv();
        public String a;
        public MessageIdType b = bary.a;
        public ezds c;
        public ConversationIdType d;
        public long e;
        public int f;
        public String g;
        public String h;
        public long i;
        public String j;
        public long k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public boolean q;
        public boolean r;
        public long s;
        public ConversationIdType t;
        public String u;
        public boolean v;

        protected BindData() {
            ConversationIdType conversationIdType = barn.a;
            this.d = conversationIdType;
            this.e = 0L;
            this.f = -2;
            this.k = 0L;
            this.q = false;
            this.r = false;
            this.t = conversationIdType;
            this.v = false;
        }

        @Override // defpackage.dqpd
        public final String a() {
            return String.format(Locale.US, "UrlSearchQuery [messages_annotations.messages_annotations__id: %s,\n  messages_annotations.messages_annotations_message_id: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_full_name: %s,\n  link_preview.link_preview__id: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_description: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_domain: %s,\n  link_preview.link_preview_link_canonical_url: %s,\n  link_preview.link_preview_link_preview_prevented: %s,\n  link_preview.link_preview_link_preview_failed: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v));
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            UrlSearchQuery.c().intValue();
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            ezds ezdsVar;
            bmek bmekVar = (bmek) dqqjVar;
            aC();
            this.cN = bmekVar.cV();
            if (bmekVar.dj(0)) {
                this.a = bmekVar.getString(bmekVar.cO(0, UrlSearchQuery.a));
                fN(0);
            }
            if (bmekVar.dj(1)) {
                this.b = new MessageIdType(bmekVar.getLong(bmekVar.cO(1, UrlSearchQuery.a)));
                fN(1);
            }
            if (bmekVar.dj(2)) {
                byte[] blob = bmekVar.getBlob(bmekVar.cO(2, UrlSearchQuery.a));
                if (blob == null) {
                    ezdsVar = null;
                } else {
                    try {
                        ezdsVar = (ezds) evsn.parseFrom(ezds.a, blob, evrr.a());
                    } catch (Throwable unused) {
                        ezdsVar = ezds.a;
                    }
                }
                this.c = ezdsVar;
                fN(2);
            }
            if (bmekVar.dj(3)) {
                this.d = new ConversationIdType(bmekVar.getLong(bmekVar.cO(3, UrlSearchQuery.a)));
                fN(3);
            }
            if (bmekVar.dj(4)) {
                this.e = bmekVar.getLong(bmekVar.cO(4, UrlSearchQuery.a));
                fN(4);
            }
            if (bmekVar.dj(5)) {
                this.f = bmekVar.getInt(bmekVar.cO(5, UrlSearchQuery.a));
                fN(5);
            }
            if (bmekVar.dj(6)) {
                this.g = cssb.a(bmekVar.getString(bmekVar.cO(6, UrlSearchQuery.a)));
                fN(6);
            }
            if (bmekVar.dj(7)) {
                this.h = cssq.a(bmekVar.getString(bmekVar.cO(7, UrlSearchQuery.a)));
                fN(7);
            }
            if (bmekVar.dj(8)) {
                this.i = bmekVar.getLong(bmekVar.cO(8, UrlSearchQuery.a));
                fN(8);
            }
            if (bmekVar.dj(9)) {
                this.j = bmekVar.getString(bmekVar.cO(9, UrlSearchQuery.a));
                fN(9);
            }
            if (bmekVar.dj(10)) {
                this.k = bmekVar.getLong(bmekVar.cO(10, UrlSearchQuery.a));
                fN(10);
            }
            if (bmekVar.dj(11)) {
                this.l = cssq.a(bmekVar.getString(bmekVar.cO(11, UrlSearchQuery.a)));
                fN(11);
            }
            if (bmekVar.dj(12)) {
                this.m = cssq.a(bmekVar.getString(bmekVar.cO(12, UrlSearchQuery.a)));
                fN(12);
            }
            if (bmekVar.dj(13)) {
                this.n = bmekVar.getString(bmekVar.cO(13, UrlSearchQuery.a));
                fN(13);
            }
            if (bmekVar.dj(14)) {
                this.o = bmekVar.getString(bmekVar.cO(14, UrlSearchQuery.a));
                fN(14);
            }
            if (bmekVar.dj(15)) {
                this.p = bmekVar.getString(bmekVar.cO(15, UrlSearchQuery.a));
                fN(15);
            }
            if (bmekVar.dj(16)) {
                this.q = bmekVar.getInt(bmekVar.cO(16, UrlSearchQuery.a)) == 1;
                fN(16);
            }
            if (bmekVar.dj(17)) {
                this.r = bmekVar.getInt(bmekVar.cO(17, UrlSearchQuery.a)) == 1;
                fN(17);
            }
            if (bmekVar.dj(18)) {
                this.s = bmekVar.getLong(bmekVar.cO(18, UrlSearchQuery.a));
                fN(18);
            }
            if (bmekVar.dj(19)) {
                this.t = new ConversationIdType(bmekVar.getLong(bmekVar.cO(19, UrlSearchQuery.a)));
                fN(19);
            }
            if (bmekVar.dj(20)) {
                this.u = bmekVar.getString(bmekVar.cO(20, UrlSearchQuery.a));
                fN(20);
            }
            if (bmekVar.dj(21)) {
                this.v = bmekVar.getInt(bmekVar.cO(21, UrlSearchQuery.a)) == 1;
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
            return super.aE(bindData.cN) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && this.e == bindData.e && this.f == bindData.f && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && this.i == bindData.i && Objects.equals(this.j, bindData.j) && this.k == bindData.k && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && Objects.equals(this.n, bindData.n) && Objects.equals(this.o, bindData.o) && Objects.equals(this.p, bindData.p) && this.q == bindData.q && this.r == bindData.r && this.s == bindData.s && Objects.equals(this.t, bindData.t) && Objects.equals(this.u, bindData.u) && this.v == bindData.v;
        }

        public final int f() {
            aA(5, "sub_id");
            return this.f;
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            ezds ezdsVar;
            this.a = parcel.readString();
            this.b = new MessageIdType(parcel.readLong());
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                ezdsVar = null;
            } else {
                try {
                    ezdsVar = (ezds) evsn.parseFrom(ezds.a, bArrCreateByteArray, evrr.a());
                } catch (Throwable unused) {
                    this.c = null;
                }
            }
            this.c = ezdsVar;
            this.d = new ConversationIdType(parcel.readLong());
            this.e = parcel.readLong();
            this.f = parcel.readInt();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readLong();
            this.j = parcel.readString();
            this.k = parcel.readLong();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readString();
            this.o = parcel.readString();
            this.p = parcel.readString();
            this.q = parcel.readInt() == 1;
            this.r = parcel.readInt() == 1;
            this.s = parcel.readLong();
            this.t = new ConversationIdType(parcel.readLong());
            this.u = parcel.readString();
            this.v = parcel.readInt() == 1;
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeLong(bary.a(this.b));
            ezds ezdsVar = this.c;
            parcel.writeByteArray(ezdsVar == null ? null : ezdsVar.toByteArray());
            parcel.writeLong(barn.a(this.d));
            parcel.writeLong(this.e);
            parcel.writeInt(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeLong(this.i);
            parcel.writeString(this.j);
            parcel.writeLong(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeString(this.n);
            parcel.writeString(this.o);
            parcel.writeString(this.p);
            parcel.writeInt(this.q ? 1 : 0);
            parcel.writeInt(this.r ? 1 : 0);
            parcel.writeLong(this.s);
            parcel.writeLong(barn.a(this.t));
            parcel.writeString(this.u);
            parcel.writeInt(this.v ? 1 : 0);
        }

        public final long g() {
            aA(10, "expiration_time_millis");
            return this.k;
        }

        public final long h() {
            aA(18, "_id");
            return this.s;
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, Long.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h, Long.valueOf(this.i), this.j, Long.valueOf(this.k), this.l, this.m, this.n, this.o, this.p, Boolean.valueOf(this.q), Boolean.valueOf(this.r), Long.valueOf(this.s), this.t, this.u, Boolean.valueOf(this.v), null);
        }

        public final long i() {
            aA(4, "received_timestamp");
            return this.e;
        }

        public final ConversationIdType j() {
            aA(3, "conversation_id");
            return this.d;
        }

        public final MessageIdType k() {
            aA(1, "message_id");
            return this.b;
        }

        public final ezds l() {
            aA(2, "annotation_details");
            return this.c;
        }

        public final String m() {
            aA(7, "full_name");
            return this.h;
        }

        public final String n() {
            aA(0, "_id");
            return this.a;
        }

        public final String o() {
            aA(15, "link_canonical_url");
            return this.p;
        }

        public final String p() {
            aA(13, "link_image_url");
            return this.n;
        }

        public final String q() {
            aA(11, "link_title");
            return this.l;
        }

        public final String r() {
            aA(6, "normalized_destination");
            return this.g;
        }

        public final String s() {
            aA(9, "trigger_url");
            return this.j;
        }

        public final boolean t() {
            aA(21, "has_ea2p_bot_recipient");
            return this.v;
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "UrlSearchQuery -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            ConversationIdType conversationIdType = barn.a;
            this.d = conversationIdType;
            this.e = 0L;
            this.f = -2;
            this.k = 0L;
            this.q = false;
            this.r = false;
            this.t = conversationIdType;
            this.v = false;
            aB(parcel);
        }
    }

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("messages_annotations.message_id", 20040);
        ekgiVar.i("link_preview.link_preview_prevented", 21010);
        ekgiVar.i("link_preview.link_preview_failed", 22020);
        ekgiVar.i("conversations.has_ea2p_bot_recipient", 12001);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_null_message_id");
        ekgiVar2.c();
        b = new bmei();
    }

    public static final bmeo a() {
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
            ekfwVar.h("messages.conversation_id");
            ekfwVar.h("messages.received_timestamp");
            ekfwVar.h("participants.sub_id");
            ekfwVar.h("participants.normalized_destination");
            ekfwVar.h("participants.full_name");
            ekfwVar.h("link_preview._id");
            ekfwVar.h("link_preview.trigger_url");
            ekfwVar.h("link_preview.expiration_time_millis");
            ekfwVar.h("link_preview.link_title");
            ekfwVar.h("link_preview.link_description");
            ekfwVar.h("link_preview.link_image_url");
            ekfwVar.h("link_preview.link_domain");
            ekfwVar.h("link_preview.link_canonical_url");
            if (numC.intValue() >= 21010) {
                ekfwVar.h("link_preview.link_preview_prevented");
            }
            if (numC.intValue() >= 22020) {
                ekfwVar.h("link_preview.link_preview_failed");
            }
            ekfwVar.h("message_star._id");
            ekfwVar.h("parent_disallowed_conversations.conversation_id");
            ekfwVar.h("conversations.participant_normalized_destination");
            if (numC.intValue() >= 12001) {
                ekfwVar.h("conversations.has_ea2p_bot_recipient");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bmeo(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(d().a());
    }

    public static dqxa d() {
        return b().M();
    }
}
