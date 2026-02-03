package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.Arrays;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyip extends fcyz implements fdat {
    final /* synthetic */ cyir a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyip(fcxy fcxyVar, cyir cyirVar) {
        super(2, fcxyVar);
        this.a = cyirVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyip) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dqsy dqsyVar = this.a.a;
        dqsyVar.v("ANALYZE");
        String[] strArr = buei.a;
        new bued().d();
        budl[] budlVarArr = (budl[]) fcva.ah(fcva.ah(fcva.ah(fcva.ah(fcva.ah(fcva.ah(fcva.ah(fcva.ah(fcva.ah(fcva.ah(fcva.ah(fcva.ah(fcva.ah(cyir.b("participants", new fdap() { // from class: cyia
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_participants_my_identity_token_foreign_key", "2520, 2520");
                cyioVar.a("index_participants_my_identity_token", "2520 630");
                cyioVar.a("index_participants_sub_id", "2520 630");
                cyioVar.a("index_participants_blocked_is_one", "1 1");
                cyioVar.a("index_participants_recipient_id", "2520 2520");
                cyioVar.a("index_participants_comparable_destination", "2520 2520");
                cyioVar.a("index_participants_cms_id", "2520 1");
                cyioVar.a("sqlite_autoindex_participants_1", "2520 1 1");
                return fctx.a;
            }
        }), cyir.b("messages", new fdap() { // from class: cyij
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_messages_my_identity_foreign_key", "182440 182440");
                cyioVar.a("index_messages_rcs_expiry", "182440 182440");
                cyioVar.a("index_messages_my_identity", "182440 182440");
                cyioVar.a("index_messages_original_rcs_message_id", "21 1");
                cyioVar.a("index_messages_satellite_datagram_id", "182440 182440");
                cyioVar.a("index_messages_self_id", "182440 91220");
                cyioVar.a("index_messages_original_message_id", "182440 182440");
                cyioVar.a("index_messages_is_hidden", "182440 91220");
                cyioVar.a("index_messages_cloud_sync_id", "182440 182440");
                cyioVar.a("index_messages_received_timestamp", "182440 1");
                cyioVar.a("index_messages_sent_timestamp", "182440 1");
                cyioVar.a("index_messages_sender_id", "182440 192");
                cyioVar.a("index_messages_sms_message_uri", "182440 2");
                cyioVar.a("index_messages_cms_correlation_id", "182440 1");
                cyioVar.a("rcs_message_id_and_seen_index", "182440 8293 8293");
                cyioVar.a("index_messages_cms_id", "182440 1");
                cyioVar.a("index_messages_web_id", "182440 182440");
                cyioVar.a("index_messages_read_0", "4 4");
                cyioVar.a("index_messages_ui_sort", "182440 73 1");
                cyioVar.a("index_messages_rcs_message_id", "182440 182440 182440");
                cyioVar.a("index_messages_sort", "182440 73 53 1");
                cyioVar.a("index_messages_status_seen", "182440 12163 12163");
                return fctx.a;
            }
        })), cyir.b("parts", new fdap() { // from class: cyik
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_parts_local_cache_path", "40 1");
                cyioVar.a("index_parts_file_size_bytes", "440 220");
                cyioVar.a("index_parts_conversation_id", "200369 80");
                cyioVar.a("index_parts_content_type", "200369 50093");
                cyioVar.a("index_parts_message_id", "200369 1");
                return fctx.a;
            }
        })), cyir.b("conversations", new fdap() { // from class: cyil
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_conversations_destination_token", "2512 2512");
                cyioVar.a("index_conversations_cms_correlation_id", "2512 2512");
                cyioVar.a("index_conversations_current_my_identity_foreign_key", "2512 2512");
                cyioVar.a("index_conversations_participant_normalized_destination", "2512 1");
                cyioVar.a("index_conversations_rcs_group_id", "2 1");
                cyioVar.a("index_conversations_normalized_participant_id_list", "2512 2512");
                cyioVar.a("index_conversations_participant_comparable_destination", "2512 2512");
                cyioVar.a("index_conversations_cms_id", "2512 1");
                cyioVar.a("index_conversations_delete_timestamp", "2512 2512");
                cyioVar.a("index_conversations_rcs_session_id", "2512 2512");
                cyioVar.a("index_conversations_sort_timestamp", "2512 2");
                cyioVar.a("index_conversations_archive_status", "2512 838");
                cyioVar.a("index_conversations_sms_thread_id", "2512 628");
                return fctx.a;
            }
        })), cyir.b("conversation_participants", new fdap() { // from class: cyim
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_conversation_participants_participant_id", "2520 1");
                cyioVar.a("index_conversation_participants_conversation_id", "2520 1");
                cyioVar.a("sqlite_autoindex_conversation_participants_1", "2520 1 1 1");
                return fctx.a;
            }
        })), cyir.b("conversation_to_participants", new fdap() { // from class: cyin
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_conversation_to_participants_participant_id", "2522 1");
                cyioVar.a("index_conversation_to_participants_conversation_id", "2522 1");
                cyioVar.a("sqlite_autoindex_conversation_to_participants_1", "2522 1 1");
                return fctx.a;
            }
        })), cyir.b("contacts", new fdap() { // from class: cyib
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_contacts_phonebook_label", "98 5");
                cyioVar.a("contacts_sort", "98 5 2");
                cyioVar.a("index_contacts_phone_number", "98 1");
                cyioVar.a("index_contacts_lookup_key", "98 2");
                cyioVar.a("index_contacts_contact_id", "98 2");
                cyioVar.a("index_contacts_cp2_id", "98 1");
                return fctx.a;
            }
        })), cyir.b("read_reports", new fdap() { // from class: cyic
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_read_reports_message_id", "6 1");
                cyioVar.a("sqlite_autoindex_read_reports_1", "6 1 1");
                return fctx.a;
            }
        })), cyir.b("subscriptions", new fdap() { // from class: cyid
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_subscriptions_my_identity_token_with_foreign_key", "3 3");
                cyioVar.a("index_subscriptions_my_identity_token", "3 1");
                cyioVar.a("sqlite_autoindex_subscriptions_1", "3 1 1");
                return fctx.a;
            }
        })), cyir.b("recent_expressive_stickers", new fdap() { // from class: cyie
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.a("index_recent_expressive_stickers_last_used_timestamp", "11 1");
                cyioVar.a("sqlite_autoindex_recent_expressive_stickers_1", "11 1");
                return fctx.a;
            }
        })), cyir.b("desktop", new fdap() { // from class: cyif
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.b("2");
                return fctx.a;
            }
        })), cyir.b("events", new fdap() { // from class: cyig
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.b("384");
                return fctx.a;
            }
        })), cyir.b("message_status", new fdap() { // from class: cyih
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.b("300");
                return fctx.a;
            }
        })), cyir.b("self_participants", new fdap() { // from class: cyii
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cyio cyioVar = (cyio) obj2;
                cyioVar.getClass();
                cyioVar.b("3");
                return fctx.a;
            }
        })).toArray(new budl[0]);
        dqru.B(buei.a(), 4, false, new BiConsumer() { // from class: budk
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                String[] strArr2 = buei.a;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, (budl[]) Arrays.copyOf(budlVarArr, budlVarArr.length));
        dqsyVar.v("DROP TABLE IF EXISTS foo_for_testing");
        dqsyVar.v("CREATE TABLE foo_for_testing (foo, bar)");
        dqsyVar.v("ANALYZE foo_for_testing");
        dqsyVar.v("DROP TABLE IF EXISTS foo_for_testing");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cyip cyipVar = new cyip(fcxyVar, this.a);
        cyipVar.b = obj;
        return cyipVar;
    }
}
