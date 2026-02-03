package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.axcm;
import defpackage.axcn;
import defpackage.barn;
import defpackage.baro;
import defpackage.bart;
import defpackage.bary;
import defpackage.basc;
import defpackage.basd;
import defpackage.basg;
import defpackage.bquj;
import defpackage.bquk;
import defpackage.bqul;
import defpackage.bqum;
import defpackage.bqun;
import defpackage.bquo;
import defpackage.bqup;
import defpackage.bquq;
import defpackage.bquu;
import defpackage.bquv;
import defpackage.bran;
import defpackage.brao;
import defpackage.brap;
import defpackage.brdi;
import defpackage.brdp;
import defpackage.brdr;
import defpackage.brec;
import defpackage.bvdn;
import defpackage.bvdx;
import defpackage.bvdz;
import defpackage.bvec;
import defpackage.cbqy;
import defpackage.cbqz;
import defpackage.cgrd;
import defpackage.cjnm;
import defpackage.cpyi;
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
import defpackage.evrr;
import defpackage.evsn;
import defpackage.eyga;
import defpackage.fhaz;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MessagesTable extends dqsi {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sender_send_destination", "messages.msisdn_receiving_rcs_message", "messages.receiving_network_country", "messages.sent_timestamp", "messages.queue_insert_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_transaction_id", "messages.mms_content_location", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.my_identity_foreign_key", "messages.retry_start_timestamp", "messages.cloud_sync_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.rcs_ui_status", "messages.is_hidden", "messages.rcs_remote_instance", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.correlation_id", "messages.cms_id", "messages.cms_last_mod_seq", "messages.web_id", "messages.usage_stats_logging_id", "messages.send_counter", "messages.original_rcs_message_id", "messages.raw_rcs_message_to_send", "messages.custom_delivery_receipt_mime_type", "messages.custom_delivery_receipt_content", "messages.report_attempt_acounter", "messages.custom_headers", "messages.cms_correlation_id", "messages.group_private_participant", "messages.original_message_id", "messages.parent_message_id", "messages.awaiting_reverse_sync", "messages.old_sms_message_uri", "messages.draft_id", "messages.result_code", "messages.cms_life_cycle", "messages.mute_priority", "messages.fallback_reason", "messages.auto_retry_counter", "messages.can_revoke_before_delivered_with_rcs", "messages.trace_id", "messages.outgoing_delivery_report_status", "messages.outgoing_read_report_status", "messages.xms_transport", "messages.message_original_protocol", "messages.satellite_datagram_id", "messages.encryption_protocol", "messages.message_persistence_id"};
    public static final ekgp b;
    public static final bran c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("messages.sender_send_destination", 54040);
        ekgiVar.i("messages.msisdn_receiving_rcs_message", 59340);
        ekgiVar.i("messages.receiving_network_country", 54040);
        ekgiVar.i("messages.queue_insert_timestamp", 17030);
        ekgiVar.i("messages.message_report_status", 13020);
        ekgiVar.i("messages.rcs_expiry", 59890);
        ekgiVar.i("messages.mms_retrieve_text", 9030);
        ekgiVar.i("messages.my_identity_foreign_key", 60160);
        ekgiVar.i("messages.cloud_sync_id", 8500);
        ekgiVar.i("messages.rcs_message_id_with_text_type", 41040);
        ekgiVar.i("messages.etouffee_status", 29060);
        ekgiVar.i("messages.verification_status", 29090);
        ekgiVar.i("messages.rcs_ui_status", 39000);
        ekgiVar.i("messages.is_hidden", 30010);
        ekgiVar.i("messages.rcs_remote_instance", 10002);
        ekgiVar.i("messages.rcs_file_transfer_session_id", 10004);
        ekgiVar.i("messages.sms_error_code", 9000);
        ekgiVar.i("messages.sms_error_desc_map_name", 9000);
        ekgiVar.i("messages.correlation_id", 9010);
        ekgiVar.i("messages.cms_id", 31010);
        ekgiVar.i("messages.cms_last_mod_seq", 37040);
        ekgiVar.i("messages.web_id", 19020);
        ekgiVar.i("messages.usage_stats_logging_id", 29100);
        ekgiVar.i("messages.send_counter", 35030);
        ekgiVar.i("messages.original_rcs_message_id", 35030);
        ekgiVar.i("messages.raw_rcs_message_to_send", 60820);
        ekgiVar.i("messages.custom_delivery_receipt_mime_type", 37020);
        ekgiVar.i("messages.custom_delivery_receipt_content", 37020);
        ekgiVar.i("messages.report_attempt_acounter", 37030);
        ekgiVar.i("messages.custom_headers", 45020);
        ekgiVar.i("messages.cms_correlation_id", 46010);
        ekgiVar.i("messages.group_private_participant", 48030);
        ekgiVar.i("messages.original_message_id", 48030);
        ekgiVar.i("messages.parent_message_id", 60950);
        ekgiVar.i("messages.awaiting_reverse_sync", 49060);
        ekgiVar.i("messages.old_sms_message_uri", 49060);
        ekgiVar.i("messages.draft_id", 56000);
        ekgiVar.i("messages.result_code", 58040);
        ekgiVar.i("messages.cms_life_cycle", 58210);
        ekgiVar.i("messages.mute_priority", 60750);
        ekgiVar.i("messages.fallback_reason", 58710);
        ekgiVar.i("messages.auto_retry_counter", 58230);
        ekgiVar.i("messages.can_revoke_before_delivered_with_rcs", 58280);
        ekgiVar.i("messages.trace_id", 58680);
        ekgiVar.i("messages.outgoing_delivery_report_status", 58720);
        ekgiVar.i("messages.outgoing_read_report_status", 58720);
        ekgiVar.i("messages.xms_transport", 59310);
        ekgiVar.i("messages.message_original_protocol", 59430);
        ekgiVar.i("messages.satellite_datagram_id", 59490);
        ekgiVar.i("messages.encryption_protocol", 60190);
        ekgiVar.i("messages.message_persistence_id", 60370);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("_id", "index_unsent_rcs_report");
        ekgiVar2.i("sender_id", "index_messages_sender_id");
        ekgiVar2.i("sent_timestamp", "index_messages_sent_timestamp");
        ekgiVar2.i("read", "index_messages_read_0");
        ekgiVar2.i("sms_message_uri", "index_messages_sms_message_uri");
        ekgiVar2.i("rcs_expiry", "index_messages_rcs_expiry");
        ekgiVar2.i("self_id", "index_messages_self_id");
        ekgiVar2.i("my_identity", "index_messages_my_identity");
        ekgiVar2.i("my_identity_foreign_key", "index_messages_my_identity_foreign_key");
        ekgiVar2.i("cloud_sync_id", "index_messages_cloud_sync_id");
        ekgiVar2.i(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_messages_verification_status");
        ekgiVar2.i("cms_id", "index_messages_cms_id");
        ekgiVar2.i("web_id", "index_messages_web_id");
        ekgiVar2.i("original_rcs_message_id", "index_messages_original_rcs_message_id");
        ekgiVar2.i("cms_correlation_id", "index_messages_cms_correlation_id");
        ekgiVar2.i("group_private_participant", "index_messages_group_private_participant");
        ekgiVar2.i("original_message_id", "index_messages_original_message_id");
        ekgiVar2.i("parent_message_id", "index_messages_parent_message_id");
        ekgiVar2.i("awaiting_reverse_sync", "index_messages_awaiting_reverse_sync");
        ekgiVar2.i("draft_id", "index_messages_draft_id");
        ekgiVar2.i("satellite_datagram_id", "index_messages_satellite_datagram_id");
        ekgiVar2.i("message_persistence_id", "index_messages_message_persistence_id");
        ekgiVar2.c();
        c = new bran();
        d = new int[]{8500, 9000, 9010, 9030, 10000, 10002, 10004, 13020, 17030, 19020, 22080, 24090, 25010, 29060, 29090, 29100, 30010, 31010, 32050, 35030, 36000, 37020, 37030, 37040, 39000, 41040, 45020, 46010, 48030, 49060, 54040, 54070, 56000, 58040, 58060, 58210, 58230, 58280, 58360, 58680, 58710, 58720, 58740, 59160, 59310, 59340, 59430, 59490, 59510, 59530, 59810, 59890, 60160, 60190, 60370, 60550, 60650, 60750, 60820, 60950};
    }

    public static BindData a(String str) {
        brdr brdrVarD = d();
        brdrVarD.A("messages.queryOnCmsId");
        brdrVarD.q();
        brec brecVar = new brec();
        brecVar.f(str);
        brdrVarD.g(brecVar);
        return (BindData) dqru.c(brdrVarD.b());
    }

    public static BindData b(MessageIdType messageIdType) {
        brdr brdrVarD = d();
        brdrVarD.A("messages.queryOnId");
        brdrVarD.q();
        brec brecVar = new brec();
        brecVar.p(messageIdType);
        brdrVarD.g(brecVar);
        return (BindData) dqru.c(brdrVarD.b());
    }

    public static bquu c() {
        bquv bquvVar = new bquv();
        bquvVar.aF();
        return bquvVar;
    }

    public static final brdr d() {
        String[] strArr;
        Integer numG = g();
        if (numG.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("messages._id");
            ekfwVar.h("messages.conversation_id");
            ekfwVar.h("messages.sender_id");
            if (numG.intValue() >= 54040) {
                ekfwVar.h("messages.sender_send_destination");
            }
            if (numG.intValue() >= 59340) {
                ekfwVar.h("messages.msisdn_receiving_rcs_message");
            }
            if (numG.intValue() >= 54040) {
                ekfwVar.h("messages.receiving_network_country");
            }
            ekfwVar.h("messages.sent_timestamp");
            if (numG.intValue() >= 17030) {
                ekfwVar.h("messages.queue_insert_timestamp");
            }
            ekfwVar.h("messages.received_timestamp");
            ekfwVar.h("messages.message_protocol");
            ekfwVar.h("messages.message_status");
            if (numG.intValue() >= 13020) {
                ekfwVar.h("messages.message_report_status");
            }
            ekfwVar.h("messages.seen");
            ekfwVar.h("messages.read");
            ekfwVar.h("messages.sms_message_uri");
            ekfwVar.h("messages.sms_priority");
            ekfwVar.h("messages.sms_message_size");
            ekfwVar.h("messages.mms_subject");
            ekfwVar.h("messages.mms_transaction_id");
            ekfwVar.h("messages.mms_content_location");
            ekfwVar.h("messages.mms_expiry");
            if (numG.intValue() >= 59890) {
                ekfwVar.h("messages.rcs_expiry");
            }
            if (numG.intValue() >= 9030) {
                ekfwVar.h("messages.mms_retrieve_text");
            }
            ekfwVar.h("messages.raw_status");
            ekfwVar.h("messages.self_id");
            if (numG.intValue() >= 60160) {
                ekfwVar.h("messages.my_identity_foreign_key");
            }
            ekfwVar.h("messages.retry_start_timestamp");
            if (numG.intValue() >= 8500) {
                ekfwVar.h("messages.cloud_sync_id");
            }
            if (numG.intValue() >= 41040) {
                ekfwVar.h("messages.rcs_message_id_with_text_type");
            }
            if (numG.intValue() >= 29060) {
                ekfwVar.h("messages.etouffee_status");
            }
            if (numG.intValue() >= 29090) {
                ekfwVar.h("messages.verification_status");
            }
            if (numG.intValue() >= 39000) {
                ekfwVar.h("messages.rcs_ui_status");
            }
            if (numG.intValue() >= 30010) {
                ekfwVar.h("messages.is_hidden");
            }
            if (numG.intValue() >= 10002) {
                ekfwVar.h("messages.rcs_remote_instance");
            }
            if (numG.intValue() >= 10004) {
                ekfwVar.h("messages.rcs_file_transfer_session_id");
            }
            if (numG.intValue() >= 9000) {
                ekfwVar.h("messages.sms_error_code");
            }
            if (numG.intValue() >= 9000) {
                ekfwVar.h("messages.sms_error_desc_map_name");
            }
            if (numG.intValue() >= 9010) {
                ekfwVar.h("messages.correlation_id");
            }
            if (numG.intValue() >= 31010) {
                ekfwVar.h("messages.cms_id");
            }
            if (numG.intValue() >= 37040) {
                ekfwVar.h("messages.cms_last_mod_seq");
            }
            if (numG.intValue() >= 19020) {
                ekfwVar.h("messages.web_id");
            }
            if (numG.intValue() >= 29100) {
                ekfwVar.h("messages.usage_stats_logging_id");
            }
            if (numG.intValue() >= 35030) {
                ekfwVar.h("messages.send_counter");
            }
            if (numG.intValue() >= 35030) {
                ekfwVar.h("messages.original_rcs_message_id");
            }
            if (numG.intValue() >= 60820) {
                ekfwVar.h("messages.raw_rcs_message_to_send");
            }
            if (numG.intValue() >= 37020) {
                ekfwVar.h("messages.custom_delivery_receipt_mime_type");
            }
            if (numG.intValue() >= 37020) {
                ekfwVar.h("messages.custom_delivery_receipt_content");
            }
            if (numG.intValue() >= 37030) {
                ekfwVar.h("messages.report_attempt_acounter");
            }
            if (numG.intValue() >= 45020) {
                ekfwVar.h("messages.custom_headers");
            }
            if (numG.intValue() >= 46010) {
                ekfwVar.h("messages.cms_correlation_id");
            }
            if (numG.intValue() >= 48030) {
                ekfwVar.h("messages.group_private_participant");
            }
            if (numG.intValue() >= 48030) {
                ekfwVar.h("messages.original_message_id");
            }
            if (numG.intValue() >= 60950) {
                ekfwVar.h("messages.parent_message_id");
            }
            if (numG.intValue() >= 49060) {
                ekfwVar.h("messages.awaiting_reverse_sync");
            }
            if (numG.intValue() >= 49060) {
                ekfwVar.h("messages.old_sms_message_uri");
            }
            if (numG.intValue() >= 56000) {
                ekfwVar.h("messages.draft_id");
            }
            if (numG.intValue() >= 58040) {
                ekfwVar.h("messages.result_code");
            }
            if (numG.intValue() >= 58210) {
                ekfwVar.h("messages.cms_life_cycle");
            }
            if (numG.intValue() >= 60750) {
                ekfwVar.h("messages.mute_priority");
            }
            if (numG.intValue() >= 58710) {
                ekfwVar.h("messages.fallback_reason");
            }
            if (numG.intValue() >= 58230) {
                ekfwVar.h("messages.auto_retry_counter");
            }
            if (numG.intValue() >= 58280) {
                ekfwVar.h("messages.can_revoke_before_delivered_with_rcs");
            }
            if (numG.intValue() >= 58680) {
                ekfwVar.h("messages.trace_id");
            }
            if (numG.intValue() >= 58720) {
                ekfwVar.h("messages.outgoing_delivery_report_status");
            }
            if (numG.intValue() >= 58720) {
                ekfwVar.h("messages.outgoing_read_report_status");
            }
            if (numG.intValue() >= 59310) {
                ekfwVar.h("messages.xms_transport");
            }
            if (numG.intValue() >= 59430) {
                ekfwVar.h("messages.message_original_protocol");
            }
            if (numG.intValue() >= 59490) {
                ekfwVar.h("messages.satellite_datagram_id");
            }
            if (numG.intValue() >= 60190) {
                ekfwVar.h("messages.encryption_protocol");
            }
            if (numG.intValue() >= 60370) {
                ekfwVar.h("messages.message_persistence_id");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new brdr(strArr);
    }

    public static final brdr e(String str) {
        brdr brdrVarD = d();
        brdrVarD.A(str);
        return brdrVarD;
    }

    public static dqsy f() {
        return dqru.e("$primary");
    }

    public static Integer g() {
        return Integer.valueOf(k().a());
    }

    public static Object h(MessageIdType messageIdType, Function function, Supplier supplier) {
        BindData bindDataB = b(messageIdType);
        return bindDataB != null ? function.apply(bindDataB) : supplier.get();
    }

    public static Object i(MessageIdType messageIdType, Function function) {
        BindData bindDataB = b(messageIdType);
        if (bindDataB != null) {
            return function.apply(bindDataB);
        }
        return null;
    }

    public static Object j(MessageIdType messageIdType, Function function, Supplier supplier) {
        BindData bindDataB = b(messageIdType);
        return bindDataB != null ? function.apply(bindDataB) : supplier.get();
    }

    public static dqxa k() {
        return f().M();
    }

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<brap, brdp, brdr, BindData, brao> implements Parcelable, dqpf {
        public static final Parcelable.Creator<BindData> CREATOR = new bquj();
        public long A;
        public String B;
        public basd C;
        public int D;
        public bvdz E;
        public int F;
        public boolean G;
        public String H;
        public long I;
        public int J;
        public String K;
        public String L;
        public String M;
        public long N;
        public String O;
        public long P;
        public long Q;
        public basd R;
        public cjnm S;
        public String T;
        public byte[] U;
        public long V;
        public eyga W;
        public String X;
        public String Y;
        public MessageIdType Z;
        public MessageIdType a;
        public MessageIdType aa;
        public boolean ab;
        public Uri ac;
        public Optional ad;
        public int ae;
        public cpyi af;
        public cgrd ag;
        public bvdn ah;
        public int ai;
        public boolean aj;
        public fhaz ak;
        public bvdx al;
        public bvdx am;
        public bvec an;
        public int ao;
        public baro ap;
        public cbqz aq;
        public Optional ar;
        public ConversationIdType b;
        public String c;
        public String d;
        public String e;
        public String f;
        public long g;
        public Instant h;
        public long i;
        public int j;
        public int k;
        public int l;
        public boolean m;
        public boolean n;
        public Uri o;
        public int p;
        public long q;
        public String r;
        public String s;
        public String t;
        public long u;
        public long v;
        public String w;
        public int x;
        public String y;
        public axcm z;

        protected BindData() {
            MessageIdType messageIdType = bary.a;
            this.a = messageIdType;
            this.b = barn.a;
            this.g = 0L;
            this.h = bart.b(0L);
            this.i = 0L;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = false;
            this.n = false;
            this.p = 0;
            this.q = 0L;
            this.u = 0L;
            this.v = 0L;
            this.x = 0;
            this.z = null;
            this.A = 0L;
            basd basdVar = basd.a;
            this.C = basdVar;
            this.D = 0;
            this.E = bvdz.VERIFICATION_NA;
            this.F = 0;
            this.G = false;
            this.I = -1L;
            this.J = -1;
            this.O = "";
            this.P = 0L;
            this.Q = 1L;
            this.R = basdVar;
            this.V = 0L;
            this.Z = messageIdType;
            this.aa = messageIdType;
            this.ab = false;
            this.ad = basg.a;
            this.ae = -2;
            this.af = cpyi.UNKNOWN;
            this.ag = cgrd.c;
            this.ah = bvdn.UNKNOWN;
            this.ai = 0;
            this.aj = false;
            bvdx bvdxVar = bvdx.UNKNOWN;
            this.al = bvdxVar;
            this.am = bvdxVar;
            this.an = bvec.UNKNOWN;
            this.ao = -1;
            this.ap = baro.a;
            this.aq = new cbqz(0L);
            this.ar = basc.a();
        }

        public final long A() {
            aA(16, "sms_message_size");
            return this.q;
        }

        public final long B() {
            aA(41, "usage_stats_logging_id");
            return this.P;
        }

        public final Uri C() {
            aA(14, "sms_message_uri");
            return this.o;
        }

        public final ConversationIdType D() {
            aA(1, "conversation_id");
            return this.b;
        }

        public final MessageIdType E() {
            aA(0, "_id");
            return this.a;
        }

        public final MessageIdType F() {
            aA(51, "original_message_id");
            return this.Z;
        }

        public final MessageIdType G() {
            final dqsy dqsyVarF = MessagesTable.f();
            return new MessageIdType(dqru.b(MessagesTable.f(), "messages", this, new Function() { // from class: bqui
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarF.P("messages", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bquf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.ae((Long) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final basd H() {
            aA(43, "original_rcs_message_id");
            return this.R;
        }

        public final basd I() {
            aA(28, "rcs_message_id_with_text_type");
            return this.C;
        }

        public final bquu J() {
            bquv bquvVar = new bquv();
            bquvVar.d(this, false, this.cL);
            return bquvVar;
        }

        public final bquu K() {
            bquv bquvVar = new bquv();
            bquvVar.d(this, true, this.cL);
            return bquvVar;
        }

        public final bvdn L() {
            aA(59, "fallback_reason");
            return this.ah;
        }

        public final bvdz M() {
            aA(30, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            return this.E;
        }

        public final bvec N() {
            aA(65, "xms_transport");
            return this.an;
        }

        public final cgrd O() {
            aA(58, "mute_priority");
            return this.ag;
        }

        public final cpyi P() {
            aA(57, "cms_life_cycle");
            return this.af;
        }

        public final eyga Q() {
            aA(48, "custom_headers");
            return this.W;
        }

        public final Optional R() {
            aA(69, "message_persistence_id");
            return this.ar;
        }

        public final String S() {
            aA(27, "cloud_sync_id");
            return this.B;
        }

        public final String T() {
            aA(49, "cms_correlation_id");
            return this.X;
        }

        public final String U() {
            aA(38, "cms_id");
            return this.M;
        }

        public final String V() {
            aA(37, "correlation_id");
            return this.L;
        }

        public final String W() {
            aA(19, "mms_content_location");
            return this.t;
        }

        public final String X() {
            aA(22, "mms_retrieve_text");
            return this.w;
        }

        public final String Y() {
            aA(17, "mms_subject");
            return this.r;
        }

        public final String Z() {
            aA(24, "self_id");
            return this.y;
        }

        @Override // defpackage.dqpd
        public final String a() {
            Locale locale = Locale.US;
            String strValueOf = String.valueOf(this.a);
            String strValueOf2 = String.valueOf(this.b);
            String strValueOf3 = String.valueOf(this.c);
            String strValueOf4 = String.valueOf(this.d);
            String strValueOf5 = String.valueOf(this.e);
            String strValueOf6 = String.valueOf(this.f);
            String strValueOf7 = String.valueOf(this.g);
            String strValueOf8 = String.valueOf(this.h);
            String strValueOf9 = String.valueOf(this.i);
            String strValueOf10 = String.valueOf(this.j);
            String strValueOf11 = String.valueOf(this.k);
            String strValueOf12 = String.valueOf(this.l);
            String strValueOf13 = String.valueOf(this.m);
            String strValueOf14 = String.valueOf(this.n);
            String strValueOf15 = String.valueOf(this.o);
            String strValueOf16 = String.valueOf(this.p);
            String strValueOf17 = String.valueOf(this.q);
            String strValueOf18 = String.valueOf(this.r);
            String strValueOf19 = String.valueOf(this.s);
            String strValueOf20 = String.valueOf(this.t);
            String strValueOf21 = String.valueOf(this.u);
            String strValueOf22 = String.valueOf(this.v);
            String strValueOf23 = String.valueOf(this.w);
            String strValueOf24 = String.valueOf(this.x);
            String strValueOf25 = String.valueOf(this.y);
            String strValueOf26 = String.valueOf(this.z);
            String strValueOf27 = String.valueOf(this.A);
            String strValueOf28 = String.valueOf(this.B);
            String strValueOf29 = String.valueOf(this.C);
            String strValueOf30 = String.valueOf(this.D);
            String strValueOf31 = String.valueOf(this.E);
            String strValueOf32 = String.valueOf(this.F);
            String strValueOf33 = String.valueOf(this.G);
            String strValueOf34 = String.valueOf(this.H);
            String strValueOf35 = String.valueOf(this.I);
            String strValueOf36 = String.valueOf(this.J);
            String strValueOf37 = String.valueOf(this.K);
            String strValueOf38 = String.valueOf(this.L);
            String strValueOf39 = String.valueOf(this.M);
            String strValueOf40 = String.valueOf(this.N);
            String strValueOf41 = String.valueOf(this.O);
            String strValueOf42 = String.valueOf(this.P);
            String strValueOf43 = String.valueOf(this.Q);
            String strValueOf44 = String.valueOf(this.R);
            String strValueOf45 = String.valueOf(this.S);
            String strValueOf46 = String.valueOf(this.T);
            byte[] bArr = this.U;
            return String.format(locale, "MessagesTable [_id: %s,\n  conversation_id: %s,\n  sender_id: %s,\n  sender_send_destination: %s,\n  msisdn_receiving_rcs_message: %s,\n  receiving_network_country: %s,\n  sent_timestamp: %s,\n  queue_insert_timestamp: %s,\n  received_timestamp: %s,\n  message_protocol: %s,\n  message_status: %s,\n  message_report_status: %s,\n  seen: %s,\n  read: %s,\n  sms_message_uri: %s,\n  sms_priority: %s,\n  sms_message_size: %s,\n  mms_subject: %s,\n  mms_transaction_id: %s,\n  mms_content_location: %s,\n  mms_expiry: %s,\n  rcs_expiry: %s,\n  mms_retrieve_text: %s,\n  raw_status: %s,\n  self_id: %s,\n  my_identity_foreign_key: %s,\n  retry_start_timestamp: %s,\n  cloud_sync_id: %s,\n  rcs_message_id_with_text_type: %s,\n  etouffee_status: %s,\n  verification_status: %s,\n  rcs_ui_status: %s,\n  is_hidden: %s,\n  rcs_remote_instance: %s,\n  rcs_file_transfer_session_id: %s,\n  sms_error_code: %s,\n  sms_error_desc_map_name: %s,\n  correlation_id: %s,\n  cms_id: %s,\n  cms_last_mod_seq: %s,\n  web_id: %s,\n  usage_stats_logging_id: %s,\n  send_counter: %s,\n  original_rcs_message_id: %s,\n  raw_rcs_message_to_send: %s,\n  custom_delivery_receipt_mime_type: %s,\n  custom_delivery_receipt_content: %s,\n  report_attempt_acounter: %s,\n  custom_headers: %s,\n  cms_correlation_id: %s,\n  group_private_participant: %s,\n  original_message_id: %s,\n  parent_message_id: %s,\n  awaiting_reverse_sync: %s,\n  old_sms_message_uri: %s,\n  draft_id: %s,\n  result_code: %s,\n  cms_life_cycle: %s,\n  mute_priority: %s,\n  fallback_reason: %s,\n  auto_retry_counter: %s,\n  can_revoke_before_delivered_with_rcs: %s,\n  trace_id: %s,\n  outgoing_delivery_report_status: %s,\n  outgoing_read_report_status: %s,\n  xms_transport: %s,\n  message_original_protocol: %s,\n  satellite_datagram_id: %s,\n  encryption_protocol: %s,\n  message_persistence_id: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, strValueOf37, strValueOf38, strValueOf39, strValueOf40, strValueOf41, strValueOf42, strValueOf43, strValueOf44, strValueOf45, strValueOf46, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar));
        }

        public final String aa() {
            aA(2, "sender_id");
            return this.c;
        }

        public final String ab() {
            aA(36, "sms_error_desc_map_name");
            return this.K;
        }

        public final String ac() {
            aA(40, "web_id");
            return this.O;
        }

        public final fhaz ad() {
            aA(62, "trace_id");
            return this.ak;
        }

        public final /* synthetic */ void ae(Long l) {
            if (l.longValue() >= 0) {
                this.a = new MessageIdType(l.longValue());
                super.fN(0);
            }
        }

        public final /* synthetic */ void af(Long l) {
            if (l.longValue() >= 0) {
                this.a = new MessageIdType(l.longValue());
                super.fN(0);
            }
        }

        public final boolean ag() {
            aA(32, "is_hidden");
            return this.G;
        }

        public final boolean ah() {
            aA(12, "seen");
            return this.m;
        }

        public final boolean ai() {
            aA(13, "read");
            return this.n;
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            int iIntValue = MessagesTable.g().intValue();
            MessageIdType messageIdType = this.a;
            if (messageIdType == null || messageIdType.equals(bary.a)) {
                contentValues.putNull("_id");
            } else {
                contentValues.put("_id", Long.valueOf(bary.a(this.a)));
            }
            ConversationIdType conversationIdType = this.b;
            if (conversationIdType == null || conversationIdType.equals(barn.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
            }
            dqru.v(contentValues, "sender_id", this.c);
            if (iIntValue >= 54040) {
                dqru.v(contentValues, "sender_send_destination", this.d);
            }
            if (iIntValue >= 59340) {
                dqru.v(contentValues, "msisdn_receiving_rcs_message", this.e);
            }
            if (iIntValue >= 54040) {
                dqru.v(contentValues, "receiving_network_country", this.f);
            }
            contentValues.put("sent_timestamp", Long.valueOf(this.g));
            if (iIntValue >= 17030) {
                Instant instant = this.h;
                if (instant == null) {
                    contentValues.putNull("queue_insert_timestamp");
                } else {
                    contentValues.put("queue_insert_timestamp", Long.valueOf(bart.a(instant)));
                }
            }
            contentValues.put("received_timestamp", Long.valueOf(this.i));
            contentValues.put("message_protocol", Integer.valueOf(this.j));
            contentValues.put("message_status", Integer.valueOf(this.k));
            if (iIntValue >= 13020) {
                contentValues.put("message_report_status", Integer.valueOf(this.l));
            }
            contentValues.put("seen", Boolean.valueOf(this.m));
            contentValues.put("read", Boolean.valueOf(this.n));
            Uri uri = this.o;
            if (uri == null) {
                contentValues.putNull("sms_message_uri");
            } else {
                contentValues.put("sms_message_uri", uri.toString());
            }
            contentValues.put("sms_priority", Integer.valueOf(this.p));
            contentValues.put("sms_message_size", Long.valueOf(this.q));
            dqru.v(contentValues, "mms_subject", this.r);
            dqru.v(contentValues, "mms_transaction_id", this.s);
            dqru.v(contentValues, "mms_content_location", this.t);
            contentValues.put("mms_expiry", Long.valueOf(this.u));
            if (iIntValue >= 59890) {
                contentValues.put("rcs_expiry", Long.valueOf(this.v));
            }
            if (iIntValue >= 9030) {
                dqru.v(contentValues, "mms_retrieve_text", this.w);
            }
            contentValues.put("raw_status", Integer.valueOf(this.x));
            dqru.v(contentValues, "self_id", this.y);
            if (iIntValue >= 60160) {
                axcm axcmVar = this.z;
                if (axcmVar == null || axcmVar.equals(null)) {
                    contentValues.putNull("my_identity_foreign_key");
                } else {
                    contentValues.put("my_identity_foreign_key", axcn.b(this.z));
                }
            }
            contentValues.put("retry_start_timestamp", Long.valueOf(this.A));
            if (iIntValue >= 8500) {
                dqru.v(contentValues, "cloud_sync_id", this.B);
            }
            if (iIntValue >= 41040) {
                basd basdVar = this.C;
                if (basdVar == null) {
                    contentValues.putNull("rcs_message_id_with_text_type");
                } else {
                    contentValues.put("rcs_message_id_with_text_type", basd.d(basdVar));
                }
            }
            if (iIntValue >= 29060) {
                contentValues.put("etouffee_status", Integer.valueOf(this.D));
            }
            if (iIntValue >= 29090) {
                bvdz bvdzVar = this.E;
                if (bvdzVar == null) {
                    contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
                } else {
                    contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, Integer.valueOf(bvdzVar.ordinal()));
                }
            }
            if (iIntValue >= 39000) {
                contentValues.put("rcs_ui_status", Integer.valueOf(this.F));
            }
            if (iIntValue >= 30010) {
                contentValues.put("is_hidden", Boolean.valueOf(this.G));
            }
            if (iIntValue >= 10002) {
                dqru.v(contentValues, "rcs_remote_instance", this.H);
            }
            if (iIntValue >= 10004) {
                contentValues.put("rcs_file_transfer_session_id", Long.valueOf(this.I));
            }
            if (iIntValue >= 9000) {
                contentValues.put("sms_error_code", Integer.valueOf(this.J));
            }
            if (iIntValue >= 9000) {
                dqru.v(contentValues, "sms_error_desc_map_name", this.K);
            }
            if (iIntValue >= 9010) {
                dqru.v(contentValues, "correlation_id", this.L);
            }
            if (iIntValue >= 31010) {
                dqru.v(contentValues, "cms_id", this.M);
            }
            if (iIntValue >= 37040) {
                contentValues.put("cms_last_mod_seq", Long.valueOf(this.N));
            }
            if (iIntValue >= 19020) {
                dqru.v(contentValues, "web_id", this.O);
            }
            if (iIntValue >= 29100) {
                contentValues.put("usage_stats_logging_id", Long.valueOf(this.P));
            }
            if (iIntValue >= 35030) {
                contentValues.put("send_counter", Long.valueOf(this.Q));
            }
            if (iIntValue >= 35030) {
                basd basdVar2 = this.R;
                if (basdVar2 == null) {
                    contentValues.putNull("original_rcs_message_id");
                } else {
                    contentValues.put("original_rcs_message_id", basd.d(basdVar2));
                }
            }
            if (iIntValue >= 60820) {
                cjnm cjnmVar = this.S;
                if (cjnmVar == null) {
                    contentValues.putNull("raw_rcs_message_to_send");
                } else {
                    contentValues.put("raw_rcs_message_to_send", cjnmVar.toByteArray());
                }
            }
            if (iIntValue >= 37020) {
                dqru.v(contentValues, "custom_delivery_receipt_mime_type", this.T);
            }
            if (iIntValue >= 37020) {
                contentValues.put("custom_delivery_receipt_content", this.U);
            }
            if (iIntValue >= 37030) {
                contentValues.put("report_attempt_acounter", Long.valueOf(this.V));
            }
            if (iIntValue >= 45020) {
                eyga eygaVar = this.W;
                if (eygaVar == null) {
                    contentValues.putNull("custom_headers");
                } else {
                    contentValues.put("custom_headers", eygaVar.toByteArray());
                }
            }
            if (iIntValue >= 46010) {
                dqru.v(contentValues, "cms_correlation_id", this.X);
            }
            if (iIntValue >= 48030) {
                dqru.v(contentValues, "group_private_participant", this.Y);
            }
            if (iIntValue >= 48030) {
                MessageIdType messageIdType2 = this.Z;
                if (messageIdType2 == null || messageIdType2.equals(bary.a)) {
                    contentValues.putNull("original_message_id");
                } else {
                    contentValues.put("original_message_id", Long.valueOf(bary.a(this.Z)));
                }
            }
            if (iIntValue >= 60950) {
                MessageIdType messageIdType3 = this.aa;
                if (messageIdType3 == null || messageIdType3.equals(bary.a)) {
                    contentValues.putNull("parent_message_id");
                } else {
                    contentValues.put("parent_message_id", Long.valueOf(bary.a(this.aa)));
                }
            }
            if (iIntValue >= 49060) {
                contentValues.put("awaiting_reverse_sync", Boolean.valueOf(this.ab));
            }
            if (iIntValue >= 49060) {
                Uri uri2 = this.ac;
                if (uri2 == null) {
                    contentValues.putNull("old_sms_message_uri");
                } else {
                    contentValues.put("old_sms_message_uri", uri2.toString());
                }
            }
            if (iIntValue >= 56000) {
                Optional optional = this.ad;
                if (optional == null || optional.equals(basg.a)) {
                    contentValues.putNull("draft_id");
                } else {
                    contentValues.put("draft_id", basg.b(this.ad));
                }
            }
            if (iIntValue >= 58040) {
                contentValues.put("result_code", Integer.valueOf(this.ae));
            }
            if (iIntValue >= 58210) {
                cpyi cpyiVar = this.af;
                if (cpyiVar == null) {
                    contentValues.putNull("cms_life_cycle");
                } else {
                    contentValues.put("cms_life_cycle", Integer.valueOf(cpyiVar.ordinal()));
                }
            }
            if (iIntValue >= 60750) {
                cgrd cgrdVar = this.ag;
                if (cgrdVar == null) {
                    contentValues.putNull("mute_priority");
                } else {
                    contentValues.put("mute_priority", Integer.valueOf(cgrdVar.ordinal()));
                }
            }
            if (iIntValue >= 58710) {
                bvdn bvdnVar = this.ah;
                if (bvdnVar == null) {
                    contentValues.putNull("fallback_reason");
                } else {
                    contentValues.put("fallback_reason", Integer.valueOf(bvdnVar.ordinal()));
                }
            }
            if (iIntValue >= 58230) {
                contentValues.put("auto_retry_counter", Integer.valueOf(this.ai));
            }
            if (iIntValue >= 58280) {
                contentValues.put("can_revoke_before_delivered_with_rcs", Boolean.valueOf(this.aj));
            }
            if (iIntValue >= 58680) {
                fhaz fhazVar = this.ak;
                if (fhazVar == null) {
                    contentValues.putNull("trace_id");
                } else {
                    contentValues.put("trace_id", fhazVar.toByteArray());
                }
            }
            if (iIntValue >= 58720) {
                bvdx bvdxVar = this.al;
                if (bvdxVar == null) {
                    contentValues.putNull("outgoing_delivery_report_status");
                } else {
                    contentValues.put("outgoing_delivery_report_status", Integer.valueOf(bvdxVar.ordinal()));
                }
            }
            if (iIntValue >= 58720) {
                bvdx bvdxVar2 = this.am;
                if (bvdxVar2 == null) {
                    contentValues.putNull("outgoing_read_report_status");
                } else {
                    contentValues.put("outgoing_read_report_status", Integer.valueOf(bvdxVar2.ordinal()));
                }
            }
            if (iIntValue >= 59310) {
                bvec bvecVar = this.an;
                if (bvecVar == null) {
                    contentValues.putNull("xms_transport");
                } else {
                    contentValues.put("xms_transport", Integer.valueOf(bvecVar.ordinal()));
                }
            }
            if (iIntValue >= 59430) {
                contentValues.put("message_original_protocol", Integer.valueOf(this.ao));
            }
            if (iIntValue >= 59490) {
                baro baroVar = this.ap;
                if (baroVar == null || baroVar.equals(baro.a)) {
                    contentValues.putNull("satellite_datagram_id");
                } else {
                    contentValues.put("satellite_datagram_id", baro.d(this.ap));
                }
            }
            if (iIntValue >= 60190) {
                cbqz cbqzVar = this.aq;
                if (cbqzVar == null) {
                    contentValues.putNull("encryption_protocol");
                } else {
                    contentValues.put("encryption_protocol", Long.valueOf(cbqy.a(cbqzVar)));
                }
            }
            if (iIntValue >= 60370) {
                Optional optional2 = this.ar;
                if (optional2 == null || optional2.equals(basg.a)) {
                    contentValues.putNull("message_persistence_id");
                } else {
                    contentValues.put("message_persistence_id", basg.b(this.ar));
                }
            }
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            brdi brdiVar = (brdi) ((brap) dqqjVar);
            aC();
            this.cN = brdiVar.cV();
            if (brdiVar.dj(0)) {
                this.a = brdiVar.q();
                super.fN(0);
            }
            if (brdiVar.dj(1)) {
                this.b = brdiVar.p();
                super.fN(1);
            }
            if (brdiVar.dj(2)) {
                this.c = brdiVar.at();
                super.fN(2);
            }
            if (brdiVar.dj(3)) {
                this.d = brdiVar.au();
                super.fN(3);
            }
            if (brdiVar.dj(4)) {
                this.e = brdiVar.J();
                super.fN(4);
            }
            if (brdiVar.dj(5)) {
                this.f = brdiVar.ar();
                super.fN(5);
            }
            if (brdiVar.dj(6)) {
                this.g = brdiVar.m();
                super.fN(6);
            }
            if (brdiVar.dj(7)) {
                this.h = brdiVar.ak();
                super.fN(7);
            }
            if (brdiVar.dj(8)) {
                this.i = brdiVar.l();
                super.fN(8);
            }
            if (brdiVar.dj(9)) {
                this.j = brdiVar.c();
                super.fN(9);
            }
            if (brdiVar.dj(10)) {
                this.k = brdiVar.i();
                super.fN(10);
            }
            if (brdiVar.dj(11)) {
                this.l = brdiVar.N();
                super.fN(11);
            }
            if (brdiVar.dj(12)) {
                this.m = brdiVar.az();
                super.fN(12);
            }
            if (brdiVar.dj(13)) {
                this.n = brdiVar.aA();
                super.fN(13);
            }
            if (brdiVar.dj(14)) {
                this.o = brdiVar.o();
                super.fN(14);
            }
            if (brdiVar.dj(15)) {
                this.p = brdiVar.h();
                super.fN(15);
            }
            if (brdiVar.dj(16)) {
                this.q = brdiVar.W();
                super.fN(16);
            }
            if (brdiVar.dj(17)) {
                this.r = brdiVar.H();
                super.fN(17);
            }
            if (brdiVar.dj(18)) {
                this.s = brdiVar.I();
                super.fN(18);
            }
            if (brdiVar.dj(19)) {
                this.t = brdiVar.F();
                super.fN(19);
            }
            if (brdiVar.dj(20)) {
                this.u = brdiVar.j();
                super.fN(20);
            }
            if (brdiVar.dj(21)) {
                this.v = brdiVar.S();
                super.fN(21);
            }
            if (brdiVar.dj(22)) {
                this.w = brdiVar.G();
                super.fN(22);
            }
            if (brdiVar.dj(23)) {
                this.x = brdiVar.e();
                super.fN(23);
            }
            if (brdiVar.dj(24)) {
                this.y = brdiVar.as();
                super.fN(24);
            }
            if (brdiVar.dj(25)) {
                this.z = brdiVar.Y();
                super.fN(25);
            }
            if (brdiVar.dj(26)) {
                this.A = brdiVar.U();
                super.fN(26);
            }
            if (brdiVar.dj(27)) {
                this.B = brdiVar.D();
                super.fN(27);
            }
            if (brdiVar.dj(28)) {
                this.C = brdiVar.r();
                super.fN(28);
            }
            if (brdiVar.dj(29)) {
                this.D = brdiVar.P();
                super.fN(29);
            }
            if (brdiVar.dj(30)) {
                this.E = brdiVar.ag();
                super.fN(30);
            }
            if (brdiVar.dj(31)) {
                this.F = brdiVar.Q();
                super.fN(31);
            }
            if (brdiVar.dj(32)) {
                this.G = brdiVar.L();
                super.fN(32);
            }
            if (brdiVar.dj(33)) {
                this.H = brdiVar.aq();
                super.fN(33);
            }
            if (brdiVar.dj(34)) {
                this.I = brdiVar.k();
                super.fN(34);
            }
            if (brdiVar.dj(35)) {
                this.J = brdiVar.g();
                super.fN(35);
            }
            if (brdiVar.dj(36)) {
                this.K = brdiVar.av();
                super.fN(36);
            }
            if (brdiVar.dj(37)) {
                this.L = brdiVar.an();
                super.fN(37);
            }
            if (brdiVar.dj(38)) {
                this.M = brdiVar.E();
                super.fN(38);
            }
            if (brdiVar.dj(39)) {
                this.N = brdiVar.R();
                super.fN(39);
            }
            if (brdiVar.dj(40)) {
                this.O = brdiVar.K();
                super.fN(40);
            }
            if (brdiVar.dj(41)) {
                this.P = brdiVar.X();
                super.fN(41);
            }
            if (brdiVar.dj(42)) {
                this.Q = brdiVar.V();
                super.fN(42);
            }
            if (brdiVar.dj(43)) {
                this.R = brdiVar.ac();
                super.fN(43);
            }
            if (brdiVar.dj(44)) {
                this.S = brdiVar.ai();
                super.fN(44);
            }
            if (brdiVar.dj(45)) {
                this.T = brdiVar.ao();
                super.fN(45);
            }
            if (brdiVar.dj(46)) {
                this.U = brdiVar.aB();
                super.fN(46);
            }
            if (brdiVar.dj(47)) {
                this.V = brdiVar.T();
                super.fN(47);
            }
            if (brdiVar.dj(48)) {
                this.W = brdiVar.aj();
                super.fN(48);
            }
            if (brdiVar.dj(49)) {
                this.X = brdiVar.am();
                super.fN(49);
            }
            if (brdiVar.dj(50)) {
                this.Y = brdiVar.ap();
                super.fN(50);
            }
            if (brdiVar.dj(51)) {
                this.Z = brdiVar.aa();
                super.fN(51);
            }
            if (brdiVar.dj(52)) {
                this.aa = brdiVar.ab();
                super.fN(52);
            }
            if (brdiVar.dj(53)) {
                this.ab = brdiVar.ax();
                super.fN(53);
            }
            if (brdiVar.dj(54)) {
                this.ac = brdiVar.n();
                super.fN(54);
            }
            if (brdiVar.dj(55)) {
                this.ad = brdiVar.al();
                super.fN(55);
            }
            if (brdiVar.dj(56)) {
                this.ae = brdiVar.f();
                super.fN(56);
            }
            if (brdiVar.dj(57)) {
                this.af = brdiVar.u();
                super.fN(57);
            }
            if (brdiVar.dj(58)) {
                this.ag = brdiVar.ah();
                super.fN(58);
            }
            if (brdiVar.dj(59)) {
                this.ah = brdiVar.ad();
                super.fN(59);
            }
            if (brdiVar.dj(60)) {
                this.ai = brdiVar.M();
                super.fN(60);
            }
            if (brdiVar.dj(61)) {
                this.aj = brdiVar.ay();
                super.fN(61);
            }
            if (brdiVar.dj(62)) {
                this.ak = brdiVar.aw();
                super.fN(62);
            }
            if (brdiVar.dj(63)) {
                this.al = brdiVar.ae();
                super.fN(63);
            }
            if (brdiVar.dj(64)) {
                this.am = brdiVar.af();
                super.fN(64);
            }
            if (brdiVar.dj(65)) {
                this.an = brdiVar.s();
                super.fN(65);
            }
            if (brdiVar.dj(66)) {
                this.ao = brdiVar.O();
                super.fN(66);
            }
            if (brdiVar.dj(67)) {
                this.ap = brdiVar.Z();
                super.fN(67);
            }
            if (brdiVar.dj(68)) {
                this.aq = brdiVar.t();
                super.fN(68);
            }
            if (brdiVar.dj(69)) {
                this.ar = brdiVar.C();
                super.fN(69);
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
            return super.aE(bindData.cN) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && Objects.equals(this.e, bindData.e) && Objects.equals(this.f, bindData.f) && this.g == bindData.g && Objects.equals(this.h, bindData.h) && this.i == bindData.i && this.j == bindData.j && this.k == bindData.k && this.l == bindData.l && this.m == bindData.m && this.n == bindData.n && Objects.equals(this.o, bindData.o) && this.p == bindData.p && this.q == bindData.q && Objects.equals(this.r, bindData.r) && Objects.equals(this.s, bindData.s) && Objects.equals(this.t, bindData.t) && this.u == bindData.u && this.v == bindData.v && Objects.equals(this.w, bindData.w) && this.x == bindData.x && Objects.equals(this.y, bindData.y) && Objects.equals(this.z, bindData.z) && this.A == bindData.A && Objects.equals(this.B, bindData.B) && Objects.equals(this.C, bindData.C) && this.D == bindData.D && this.E == bindData.E && this.F == bindData.F && this.G == bindData.G && Objects.equals(this.H, bindData.H) && this.I == bindData.I && this.J == bindData.J && Objects.equals(this.K, bindData.K) && Objects.equals(this.L, bindData.L) && Objects.equals(this.M, bindData.M) && this.N == bindData.N && Objects.equals(this.O, bindData.O) && this.P == bindData.P && this.Q == bindData.Q && Objects.equals(this.R, bindData.R) && Objects.equals(this.S, bindData.S) && Objects.equals(this.T, bindData.T) && Arrays.equals(this.U, bindData.U) && this.V == bindData.V && Objects.equals(this.W, bindData.W) && Objects.equals(this.X, bindData.X) && Objects.equals(this.Y, bindData.Y) && Objects.equals(this.Z, bindData.Z) && Objects.equals(this.aa, bindData.aa) && this.ab == bindData.ab && Objects.equals(this.ac, bindData.ac) && Objects.equals(this.ad, bindData.ad) && this.ae == bindData.ae && this.af == bindData.af && this.ag == bindData.ag && this.ah == bindData.ah && this.ai == bindData.ai && this.aj == bindData.aj && Objects.equals(this.ak, bindData.ak) && this.al == bindData.al && this.am == bindData.am && this.an == bindData.an && this.ao == bindData.ao && Objects.equals(this.ap, bindData.ap) && Objects.equals(this.aq, bindData.aq) && Objects.equals(this.ar, bindData.ar);
        }

        @Override // defpackage.dqpf
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "messages", dqru.m(new String[]{"conversation_id", "sender_id", "sender_send_destination", "msisdn_receiving_rcs_message", "receiving_network_country", "sent_timestamp", "queue_insert_timestamp", "received_timestamp", "message_protocol", "message_status", "message_report_status", "seen", "read", "sms_message_uri", "sms_priority", "sms_message_size", "mms_subject", "mms_transaction_id", "mms_content_location", "mms_expiry", "rcs_expiry", "mms_retrieve_text", "raw_status", "self_id", "my_identity_foreign_key", "retry_start_timestamp", "cloud_sync_id", "rcs_message_id_with_text_type", "etouffee_status", BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "rcs_ui_status", "is_hidden", "rcs_remote_instance", "rcs_file_transfer_session_id", "sms_error_code", "sms_error_desc_map_name", "correlation_id", "cms_id", "cms_last_mod_seq", "web_id", "usage_stats_logging_id", "send_counter", "original_rcs_message_id", "raw_rcs_message_to_send", "custom_delivery_receipt_mime_type", "custom_delivery_receipt_content", "report_attempt_acounter", "custom_headers", "cms_correlation_id", "group_private_participant", "original_message_id", "parent_message_id", "awaiting_reverse_sync", "old_sms_message_uri", "draft_id", "result_code", "cms_life_cycle", "mute_priority", "fallback_reason", "auto_retry_counter", "can_revoke_before_delivered_with_rcs", "trace_id", "outgoing_delivery_report_status", "outgoing_read_report_status", "xms_transport", "message_original_protocol", "satellite_datagram_id", "encryption_protocol", "message_persistence_id"}));
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            cjnm cjnmVar;
            eyga eygaVar;
            fhaz fhazVar;
            this.a = new MessageIdType(parcel.readLong());
            this.b = new ConversationIdType(parcel.readLong());
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readLong();
            this.h = bart.b(parcel.readLong());
            this.i = parcel.readLong();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readInt() == 1;
            this.n = parcel.readInt() == 1;
            String string = parcel.readString();
            this.o = string == null ? null : Uri.parse(string);
            this.p = parcel.readInt();
            this.q = parcel.readLong();
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = parcel.readString();
            this.u = parcel.readLong();
            this.v = parcel.readLong();
            this.w = parcel.readString();
            this.x = parcel.readInt();
            this.y = parcel.readString();
            this.z = axcn.a(parcel.readString());
            this.A = parcel.readLong();
            this.B = parcel.readString();
            this.C = basd.a(parcel.readString());
            this.D = parcel.readInt();
            bvdz[] bvdzVarArrValues = bvdz.values();
            int i = parcel.readInt();
            if (i >= 0) {
                if (i >= bvdzVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.E = bvdzVarArrValues[i];
            }
            this.F = parcel.readInt();
            this.G = parcel.readInt() == 1;
            this.H = parcel.readString();
            this.I = parcel.readLong();
            this.J = parcel.readInt();
            this.K = parcel.readString();
            this.L = parcel.readString();
            this.M = parcel.readString();
            this.N = parcel.readLong();
            this.O = parcel.readString();
            this.P = parcel.readLong();
            this.Q = parcel.readLong();
            this.R = basd.a(parcel.readString());
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                cjnmVar = null;
            } else {
                try {
                    cjnmVar = (cjnm) evsn.parseFrom(cjnm.a, bArrCreateByteArray, evrr.a());
                } catch (Throwable unused) {
                    this.S = null;
                }
            }
            this.S = cjnmVar;
            this.T = parcel.readString();
            this.U = parcel.createByteArray();
            this.V = parcel.readLong();
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            if (bArrCreateByteArray2 == null) {
                eygaVar = null;
            } else {
                try {
                    eygaVar = (eyga) evsn.parseFrom(eyga.a, bArrCreateByteArray2, evrr.a());
                } catch (Throwable unused2) {
                    this.W = null;
                }
            }
            this.W = eygaVar;
            this.X = parcel.readString();
            this.Y = parcel.readString();
            this.Z = new MessageIdType(parcel.readLong());
            this.aa = new MessageIdType(parcel.readLong());
            this.ab = parcel.readInt() == 1;
            String string2 = parcel.readString();
            this.ac = string2 == null ? null : Uri.parse(string2);
            this.ad = basg.a(parcel.readString());
            this.ae = parcel.readInt();
            cpyi[] cpyiVarArrValues = cpyi.values();
            int i2 = parcel.readInt();
            if (i2 >= 0) {
                if (i2 >= cpyiVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.af = cpyiVarArrValues[i2];
            }
            cgrd[] cgrdVarArrValues = cgrd.values();
            int i3 = parcel.readInt();
            if (i3 >= 0) {
                if (i3 >= cgrdVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.ag = cgrdVarArrValues[i3];
            }
            bvdn[] bvdnVarArrValues = bvdn.values();
            int i4 = parcel.readInt();
            if (i4 >= 0) {
                if (i4 >= bvdnVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.ah = bvdnVarArrValues[i4];
            }
            this.ai = parcel.readInt();
            this.aj = parcel.readInt() == 1;
            byte[] bArrCreateByteArray3 = parcel.createByteArray();
            if (bArrCreateByteArray3 == null) {
                fhazVar = null;
            } else {
                try {
                    fhazVar = (fhaz) evsn.parseFrom(fhaz.a, bArrCreateByteArray3, evrr.a());
                } catch (Throwable unused3) {
                    this.ak = null;
                }
            }
            this.ak = fhazVar;
            bvdx[] bvdxVarArrValues = bvdx.values();
            int i5 = parcel.readInt();
            if (i5 >= 0) {
                if (i5 >= bvdxVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.al = bvdxVarArrValues[i5];
            }
            bvdx[] bvdxVarArrValues2 = bvdx.values();
            int i6 = parcel.readInt();
            if (i6 >= 0) {
                if (i6 >= bvdxVarArrValues2.length) {
                    throw new IllegalArgumentException();
                }
                this.am = bvdxVarArrValues2[i6];
            }
            bvec[] bvecVarArrValues = bvec.values();
            int i7 = parcel.readInt();
            if (i7 >= 0) {
                if (i7 >= bvecVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.an = bvecVarArrValues[i7];
            }
            this.ao = parcel.readInt();
            this.ap = new baro(parcel.readString());
            this.aq = new cbqz(parcel.readLong());
            this.ar = basg.a(parcel.readString());
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeLong(bary.a(this.a));
            parcel.writeLong(barn.a(this.b));
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeLong(this.g);
            parcel.writeLong(bart.a(this.h));
            parcel.writeLong(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            Uri uri = this.o;
            parcel.writeString(uri == null ? null : uri.toString());
            parcel.writeInt(this.p);
            parcel.writeLong(this.q);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
            parcel.writeLong(this.u);
            parcel.writeLong(this.v);
            parcel.writeString(this.w);
            parcel.writeInt(this.x);
            parcel.writeString(this.y);
            parcel.writeString(axcn.b(this.z));
            parcel.writeLong(this.A);
            parcel.writeString(this.B);
            parcel.writeString(basd.d(this.C));
            parcel.writeInt(this.D);
            bvdz bvdzVar = this.E;
            parcel.writeInt(bvdzVar == null ? -1 : bvdzVar.ordinal());
            parcel.writeInt(this.F);
            parcel.writeInt(this.G ? 1 : 0);
            parcel.writeString(this.H);
            parcel.writeLong(this.I);
            parcel.writeInt(this.J);
            parcel.writeString(this.K);
            parcel.writeString(this.L);
            parcel.writeString(this.M);
            parcel.writeLong(this.N);
            parcel.writeString(this.O);
            parcel.writeLong(this.P);
            parcel.writeLong(this.Q);
            parcel.writeString(basd.d(this.R));
            cjnm cjnmVar = this.S;
            parcel.writeByteArray(cjnmVar == null ? null : cjnmVar.toByteArray());
            parcel.writeString(this.T);
            parcel.writeByteArray(this.U);
            parcel.writeLong(this.V);
            eyga eygaVar = this.W;
            parcel.writeByteArray(eygaVar == null ? null : eygaVar.toByteArray());
            parcel.writeString(this.X);
            parcel.writeString(this.Y);
            parcel.writeLong(bary.a(this.Z));
            parcel.writeLong(bary.a(this.aa));
            parcel.writeInt(this.ab ? 1 : 0);
            Uri uri2 = this.ac;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            parcel.writeString(basg.b(this.ad));
            parcel.writeInt(this.ae);
            cpyi cpyiVar = this.af;
            parcel.writeInt(cpyiVar == null ? -1 : cpyiVar.ordinal());
            cgrd cgrdVar = this.ag;
            parcel.writeInt(cgrdVar == null ? -1 : cgrdVar.ordinal());
            bvdn bvdnVar = this.ah;
            parcel.writeInt(bvdnVar == null ? -1 : bvdnVar.ordinal());
            parcel.writeInt(this.ai);
            parcel.writeInt(this.aj ? 1 : 0);
            fhaz fhazVar = this.ak;
            parcel.writeByteArray(fhazVar != null ? fhazVar.toByteArray() : null);
            bvdx bvdxVar = this.al;
            parcel.writeInt(bvdxVar == null ? -1 : bvdxVar.ordinal());
            bvdx bvdxVar2 = this.am;
            parcel.writeInt(bvdxVar2 == null ? -1 : bvdxVar2.ordinal());
            bvec bvecVar = this.an;
            parcel.writeInt(bvecVar != null ? bvecVar.ordinal() : -1);
            parcel.writeInt(this.ao);
            parcel.writeString(baro.d(this.ap));
            cbqz cbqzVar = this.aq;
            cbqz cbqzVar2 = cbqz.a;
            parcel.writeLong(cbqy.a(cbqzVar));
            parcel.writeString(basg.b(this.ar));
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
            return "messages";
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
            MessageIdType messageIdType = this.a;
            ConversationIdType conversationIdType = this.b;
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            String str4 = this.f;
            Long lValueOf = Long.valueOf(this.g);
            Instant instant = this.h;
            Long lValueOf2 = Long.valueOf(this.i);
            Integer numValueOf = Integer.valueOf(this.j);
            Integer numValueOf2 = Integer.valueOf(this.k);
            Integer numValueOf3 = Integer.valueOf(this.l);
            Boolean boolValueOf = Boolean.valueOf(this.m);
            Boolean boolValueOf2 = Boolean.valueOf(this.n);
            dqqe dqqeVar3 = dqqeVar2;
            Uri uri = this.o;
            Integer numValueOf4 = Integer.valueOf(this.p);
            Long lValueOf3 = Long.valueOf(this.q);
            String str5 = this.r;
            String str6 = this.s;
            String str7 = this.t;
            Long lValueOf4 = Long.valueOf(this.u);
            Long lValueOf5 = Long.valueOf(this.v);
            String str8 = this.w;
            Integer numValueOf5 = Integer.valueOf(this.x);
            String str9 = this.y;
            axcm axcmVar = this.z;
            Long lValueOf6 = Long.valueOf(this.A);
            String str10 = this.B;
            basd basdVar = this.C;
            Integer numValueOf6 = Integer.valueOf(this.D);
            bvdz bvdzVar = this.E;
            Integer numValueOf7 = Integer.valueOf(bvdzVar == null ? 0 : bvdzVar.ordinal());
            Integer numValueOf8 = Integer.valueOf(this.F);
            Boolean boolValueOf3 = Boolean.valueOf(this.G);
            String str11 = this.H;
            Long lValueOf7 = Long.valueOf(this.I);
            Integer numValueOf9 = Integer.valueOf(this.J);
            String str12 = this.K;
            String str13 = this.L;
            String str14 = this.M;
            Long lValueOf8 = Long.valueOf(this.N);
            String str15 = this.O;
            Long lValueOf9 = Long.valueOf(this.P);
            Long lValueOf10 = Long.valueOf(this.Q);
            basd basdVar2 = this.R;
            cjnm cjnmVar = this.S;
            String str16 = this.T;
            Integer numValueOf10 = Integer.valueOf(Arrays.hashCode(this.U));
            Long lValueOf11 = Long.valueOf(this.V);
            eyga eygaVar = this.W;
            String str17 = this.X;
            String str18 = this.Y;
            MessageIdType messageIdType2 = this.Z;
            MessageIdType messageIdType3 = this.aa;
            Boolean boolValueOf4 = Boolean.valueOf(this.ab);
            Uri uri2 = this.ac;
            Optional optional = this.ad;
            Integer numValueOf11 = Integer.valueOf(this.ae);
            cpyi cpyiVar = this.af;
            Integer numValueOf12 = Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal());
            cgrd cgrdVar = this.ag;
            Integer numValueOf13 = Integer.valueOf(cgrdVar == null ? 0 : cgrdVar.ordinal());
            bvdn bvdnVar = this.ah;
            Integer numValueOf14 = Integer.valueOf(bvdnVar == null ? 0 : bvdnVar.ordinal());
            Integer numValueOf15 = Integer.valueOf(this.ai);
            Boolean boolValueOf5 = Boolean.valueOf(this.aj);
            fhaz fhazVar = this.ak;
            bvdx bvdxVar = this.al;
            Integer numValueOf16 = Integer.valueOf(bvdxVar == null ? 0 : bvdxVar.ordinal());
            bvdx bvdxVar2 = this.am;
            Integer numValueOf17 = Integer.valueOf(bvdxVar2 == null ? 0 : bvdxVar2.ordinal());
            bvec bvecVar = this.an;
            return Objects.hash(dqqeVar3, messageIdType, conversationIdType, str, str2, str3, str4, lValueOf, instant, lValueOf2, numValueOf, numValueOf2, numValueOf3, boolValueOf, boolValueOf2, uri, numValueOf4, lValueOf3, str5, str6, str7, lValueOf4, lValueOf5, str8, numValueOf5, str9, axcmVar, lValueOf6, str10, basdVar, numValueOf6, numValueOf7, numValueOf8, boolValueOf3, str11, lValueOf7, numValueOf9, str12, str13, str14, lValueOf8, str15, lValueOf9, lValueOf10, basdVar2, cjnmVar, str16, numValueOf10, lValueOf11, eygaVar, str17, str18, messageIdType2, messageIdType3, boolValueOf4, uri2, optional, numValueOf11, numValueOf12, numValueOf13, numValueOf14, numValueOf15, boolValueOf5, fhazVar, numValueOf16, numValueOf17, Integer.valueOf(bvecVar == null ? 0 : bvecVar.ordinal()), Integer.valueOf(this.ao), this.ap, this.aq, this.ar, null);
        }

        @Override // defpackage.dqpf
        public final void i(StringBuilder sb, List list) {
            Object obj = new bquk(this).get();
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            String str4 = this.f;
            Long lValueOf = Long.valueOf(this.g);
            Long lValueOf2 = Long.valueOf(bart.a(this.h));
            Long lValueOf3 = Long.valueOf(this.i);
            Integer numValueOf = Integer.valueOf(this.j);
            Integer numValueOf2 = Integer.valueOf(this.k);
            Integer numValueOf3 = Integer.valueOf(this.l);
            Integer numValueOf4 = Integer.valueOf(this.m ? 1 : 0);
            Integer numValueOf5 = Integer.valueOf(this.n ? 1 : 0);
            Uri uri = this.o;
            String string = uri == null ? null : uri.toString();
            Integer numValueOf6 = Integer.valueOf(this.p);
            Long lValueOf4 = Long.valueOf(this.q);
            String str5 = this.r;
            String str6 = this.s;
            String str7 = this.t;
            Long lValueOf5 = Long.valueOf(this.u);
            Long lValueOf6 = Long.valueOf(this.v);
            String str8 = this.w;
            Integer numValueOf7 = Integer.valueOf(this.x);
            String str9 = this.y;
            Object obj2 = new bqul(this).get();
            Long lValueOf7 = Long.valueOf(this.A);
            String str10 = this.B;
            String strD = basd.d(this.C);
            Integer numValueOf8 = Integer.valueOf(this.D);
            bvdz bvdzVar = this.E;
            Object objValueOf = bvdzVar == null ? 0 : String.valueOf(bvdzVar.ordinal());
            Integer numValueOf9 = Integer.valueOf(this.F);
            Integer numValueOf10 = Integer.valueOf(this.G ? 1 : 0);
            String str11 = this.H;
            Long lValueOf8 = Long.valueOf(this.I);
            Integer numValueOf11 = Integer.valueOf(this.J);
            String str12 = this.K;
            String str13 = this.L;
            String str14 = this.M;
            Long lValueOf9 = Long.valueOf(this.N);
            String str15 = this.O;
            Long lValueOf10 = Long.valueOf(this.P);
            Long lValueOf11 = Long.valueOf(this.Q);
            String strD2 = basd.d(this.R);
            cjnm cjnmVar = this.S;
            byte[] byteArray = cjnmVar == null ? null : cjnmVar.toByteArray();
            String str16 = this.T;
            byte[] bArr = this.U;
            Long lValueOf12 = Long.valueOf(this.V);
            eyga eygaVar = this.W;
            byte[] byteArray2 = eygaVar == null ? null : eygaVar.toByteArray();
            String str17 = this.X;
            String str18 = this.Y;
            Object obj3 = new bqum(this).get();
            Object obj4 = new bqun(this).get();
            Integer numValueOf12 = Integer.valueOf(this.ab ? 1 : 0);
            Uri uri2 = this.ac;
            String string2 = uri2 == null ? null : uri2.toString();
            Object obj5 = new bquo(this).get();
            Integer numValueOf13 = Integer.valueOf(this.ae);
            cpyi cpyiVar = this.af;
            Object objValueOf2 = cpyiVar == null ? 0 : String.valueOf(cpyiVar.ordinal());
            cgrd cgrdVar = this.ag;
            Object objValueOf3 = cgrdVar == null ? 0 : String.valueOf(cgrdVar.ordinal());
            bvdn bvdnVar = this.ah;
            Object objValueOf4 = bvdnVar == null ? 0 : String.valueOf(bvdnVar.ordinal());
            Integer numValueOf14 = Integer.valueOf(this.ai);
            Integer numValueOf15 = Integer.valueOf(this.aj ? 1 : 0);
            fhaz fhazVar = this.ak;
            byte[] byteArray3 = fhazVar != null ? fhazVar.toByteArray() : null;
            bvdx bvdxVar = this.al;
            Object objValueOf5 = bvdxVar == null ? 0 : String.valueOf(bvdxVar.ordinal());
            bvdx bvdxVar2 = this.am;
            Object objValueOf6 = bvdxVar2 == null ? 0 : String.valueOf(bvdxVar2.ordinal());
            bvec bvecVar = this.an;
            Object objValueOf7 = bvecVar == null ? 0 : String.valueOf(bvecVar.ordinal());
            Integer numValueOf16 = Integer.valueOf(this.ao);
            Object obj6 = new bqup(this).get();
            cbqz cbqzVar = this.aq;
            cbqz cbqzVar2 = cbqz.a;
            Object[] objArr = {obj, str, str2, str3, str4, lValueOf, lValueOf2, lValueOf3, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, string, numValueOf6, lValueOf4, str5, str6, str7, lValueOf5, lValueOf6, str8, numValueOf7, str9, obj2, lValueOf7, str10, strD, numValueOf8, objValueOf, numValueOf9, numValueOf10, str11, lValueOf8, numValueOf11, str12, str13, str14, lValueOf9, str15, lValueOf10, lValueOf11, strD2, byteArray, str16, bArr, lValueOf12, byteArray2, str17, str18, obj3, obj4, numValueOf12, string2, obj5, numValueOf13, objValueOf2, objValueOf3, objValueOf4, numValueOf14, numValueOf15, byteArray3, objValueOf5, objValueOf6, objValueOf7, numValueOf16, obj6, Long.valueOf(cbqy.a(cbqzVar)), new bquq(this).get()};
            sb.append('(');
            for (int i = 0; i < 69; i++) {
                Object obj7 = objArr[i];
                if (obj7 instanceof Number) {
                    sb.append(String.valueOf(obj7));
                } else {
                    if (obj7 instanceof String) {
                        String str19 = (String) obj7;
                        if (str19.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str19));
                        }
                    }
                    list.add(obj7);
                    sb.append('?');
                    sb.append(',');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        @Override // defpackage.dqpf
        public final /* bridge */ /* synthetic */ Object j() {
            throw null;
        }

        public final int k() {
            aA(11, "message_report_status");
            return this.l;
        }

        public final int m() {
            aA(9, "message_protocol");
            return this.j;
        }

        public final int n() {
            aA(23, "raw_status");
            return this.x;
        }

        public final int o() {
            aA(29, "etouffee_status");
            return this.D;
        }

        public final int p() {
            aA(56, "result_code");
            return this.ae;
        }

        public final int q() {
            aA(35, "sms_error_code");
            return this.J;
        }

        public final int r() {
            aA(15, "sms_priority");
            return this.p;
        }

        public final int s() {
            aA(10, "message_status");
            return this.k;
        }

        public final long t() {
            aA(39, "cms_last_mod_seq");
            return this.N;
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessagesTable -- REDACTED") : a();
        }

        public final long u() {
            aA(20, "mms_expiry");
            return this.u;
        }

        public final long v() {
            aA(34, "rcs_file_transfer_session_id");
            return this.I;
        }

        public final long w() {
            aA(8, "received_timestamp");
            return this.i;
        }

        public final long x() {
            aA(26, "retry_start_timestamp");
            return this.A;
        }

        public final long y() {
            aA(42, "send_counter");
            return this.Q;
        }

        public final long z() {
            aA(6, "sent_timestamp");
            return this.g;
        }

        protected BindData(Parcel parcel) {
            MessageIdType messageIdType = bary.a;
            this.a = messageIdType;
            this.b = barn.a;
            this.g = 0L;
            this.h = bart.b(0L);
            this.i = 0L;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = false;
            this.n = false;
            this.p = 0;
            this.q = 0L;
            this.u = 0L;
            this.v = 0L;
            this.x = 0;
            this.z = null;
            this.A = 0L;
            basd basdVar = basd.a;
            this.C = basdVar;
            this.D = 0;
            this.E = bvdz.VERIFICATION_NA;
            this.F = 0;
            this.G = false;
            this.I = -1L;
            this.J = -1;
            this.O = "";
            this.P = 0L;
            this.Q = 1L;
            this.R = basdVar;
            this.V = 0L;
            this.Z = messageIdType;
            this.aa = messageIdType;
            this.ab = false;
            this.ad = basg.a;
            this.ae = -2;
            this.af = cpyi.UNKNOWN;
            this.ag = cgrd.c;
            this.ah = bvdn.UNKNOWN;
            this.ai = 0;
            this.aj = false;
            bvdx bvdxVar = bvdx.UNKNOWN;
            this.al = bvdxVar;
            this.am = bvdxVar;
            this.an = bvec.UNKNOWN;
            this.ao = -1;
            this.ap = baro.a;
            this.aq = new cbqz(0L);
            this.ar = basc.a();
            aB(parcel);
        }
    }
}
