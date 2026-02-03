package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxjj {
    public static final dqxe a;

    static {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.c(MessagesTable.c.a);
        brdrVarD.h(new Function() { // from class: bxji
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                dqxe dqxeVar = bxjj.a;
                brecVar.n(botm.c.a);
                brecVar.O(false);
                brecVar.A(false);
                brecVar.ah(bved.a);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a = brdrVarD.b().v();
    }

    public static int a() {
        String[] strArr;
        eieu eieuVarK = eiiy.k("UnreadMessagesCountQuery#getUnreadMessagesCount");
        try {
            String[] strArr2 = blmu.a;
            blmt blmtVar = new blmt();
            blmtVar.ap(new dqty("messages.read", 1, 0));
            blmtVar.ap(new dqty("participants.blocked", 1, 0));
            bvdk bvdkVar = bvdk.UNARCHIVED;
            blmtVar.ap(new dqty("conversations.archive_status", 1, Integer.valueOf(bvdkVar == null ? 0 : bvdkVar.h)));
            blmtVar.ap(new dqty("conversations.notification_enabled", 1, 1));
            int iIntValue = blmu.b().intValue();
            if (iIntValue < 30010) {
                dqru.x("is_hidden", iIntValue);
            }
            blmtVar.ap(new dqty("messages.is_hidden", 1, 0));
            blmtVar.ap(new dqpm("messages.message_status", 3, blmt.as(bved.a), true));
            Integer numB = blmu.b();
            if (numB.intValue() == Integer.MAX_VALUE) {
                strArr = blmu.a;
            } else {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                ekfwVar.h("messages._id");
                ekfwVar.h("messages.conversation_id");
                ekfwVar.h("messages.sender_id");
                if (numB.intValue() >= 54040) {
                    ekfwVar.h("messages.sender_send_destination");
                }
                if (numB.intValue() >= 59340) {
                    ekfwVar.h("messages.msisdn_receiving_rcs_message");
                }
                if (numB.intValue() >= 54040) {
                    ekfwVar.h("messages.receiving_network_country");
                }
                ekfwVar.h("messages.sent_timestamp");
                if (numB.intValue() >= 17030) {
                    ekfwVar.h("messages.queue_insert_timestamp");
                }
                ekfwVar.h("messages.received_timestamp");
                ekfwVar.h("messages.message_protocol");
                ekfwVar.h("messages.message_status");
                if (numB.intValue() >= 13020) {
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
                if (numB.intValue() >= 59890) {
                    ekfwVar.h("messages.rcs_expiry");
                }
                if (numB.intValue() >= 9030) {
                    ekfwVar.h("messages.mms_retrieve_text");
                }
                ekfwVar.h("messages.raw_status");
                ekfwVar.h("messages.self_id");
                if (numB.intValue() >= 60160) {
                    ekfwVar.h("messages.my_identity_foreign_key");
                }
                ekfwVar.h("messages.retry_start_timestamp");
                if (numB.intValue() >= 8500) {
                    ekfwVar.h("messages.cloud_sync_id");
                }
                if (numB.intValue() >= 41040) {
                    ekfwVar.h("messages.rcs_message_id_with_text_type");
                }
                if (numB.intValue() >= 29060) {
                    ekfwVar.h("messages.etouffee_status");
                }
                if (numB.intValue() >= 29090) {
                    ekfwVar.h("messages.verification_status");
                }
                if (numB.intValue() >= 39000) {
                    ekfwVar.h("messages.rcs_ui_status");
                }
                if (numB.intValue() >= 30010) {
                    ekfwVar.h("messages.is_hidden");
                }
                if (numB.intValue() >= 10002) {
                    ekfwVar.h("messages.rcs_remote_instance");
                }
                if (numB.intValue() >= 10004) {
                    ekfwVar.h("messages.rcs_file_transfer_session_id");
                }
                if (numB.intValue() >= 9000) {
                    ekfwVar.h("messages.sms_error_code");
                }
                if (numB.intValue() >= 9000) {
                    ekfwVar.h("messages.sms_error_desc_map_name");
                }
                if (numB.intValue() >= 9010) {
                    ekfwVar.h("messages.correlation_id");
                }
                if (numB.intValue() >= 31010) {
                    ekfwVar.h("messages.cms_id");
                }
                if (numB.intValue() >= 37040) {
                    ekfwVar.h("messages.cms_last_mod_seq");
                }
                if (numB.intValue() >= 19020) {
                    ekfwVar.h("messages.web_id");
                }
                if (numB.intValue() >= 29100) {
                    ekfwVar.h("messages.usage_stats_logging_id");
                }
                if (numB.intValue() >= 35030) {
                    ekfwVar.h("messages.send_counter");
                }
                if (numB.intValue() >= 35030) {
                    ekfwVar.h("messages.original_rcs_message_id");
                }
                if (numB.intValue() >= 60820) {
                    ekfwVar.h("messages.raw_rcs_message_to_send");
                }
                if (numB.intValue() >= 37020) {
                    ekfwVar.h("messages.custom_delivery_receipt_mime_type");
                }
                if (numB.intValue() >= 37020) {
                    ekfwVar.h("messages.custom_delivery_receipt_content");
                }
                if (numB.intValue() >= 37030) {
                    ekfwVar.h("messages.report_attempt_acounter");
                }
                if (numB.intValue() >= 45020) {
                    ekfwVar.h("messages.custom_headers");
                }
                if (numB.intValue() >= 46010) {
                    ekfwVar.h("messages.cms_correlation_id");
                }
                if (numB.intValue() >= 48030) {
                    ekfwVar.h("messages.group_private_participant");
                }
                if (numB.intValue() >= 48030) {
                    ekfwVar.h("messages.original_message_id");
                }
                if (numB.intValue() >= 60950) {
                    ekfwVar.h("messages.parent_message_id");
                }
                if (numB.intValue() >= 49060) {
                    ekfwVar.h("messages.awaiting_reverse_sync");
                }
                if (numB.intValue() >= 49060) {
                    ekfwVar.h("messages.old_sms_message_uri");
                }
                if (numB.intValue() >= 56000) {
                    ekfwVar.h("messages.draft_id");
                }
                if (numB.intValue() >= 58040) {
                    ekfwVar.h("messages.result_code");
                }
                if (numB.intValue() >= 58210) {
                    ekfwVar.h("messages.cms_life_cycle");
                }
                if (numB.intValue() >= 60750) {
                    ekfwVar.h("messages.mute_priority");
                }
                if (numB.intValue() >= 58710) {
                    ekfwVar.h("messages.fallback_reason");
                }
                if (numB.intValue() >= 58230) {
                    ekfwVar.h("messages.auto_retry_counter");
                }
                if (numB.intValue() >= 58280) {
                    ekfwVar.h("messages.can_revoke_before_delivered_with_rcs");
                }
                if (numB.intValue() >= 58680) {
                    ekfwVar.h("messages.trace_id");
                }
                if (numB.intValue() >= 58720) {
                    ekfwVar.h("messages.outgoing_delivery_report_status");
                }
                if (numB.intValue() >= 58720) {
                    ekfwVar.h("messages.outgoing_read_report_status");
                }
                if (numB.intValue() >= 59310) {
                    ekfwVar.h("messages.xms_transport");
                }
                if (numB.intValue() >= 59430) {
                    ekfwVar.h("messages.message_original_protocol");
                }
                if (numB.intValue() >= 59490) {
                    ekfwVar.h("messages.satellite_datagram_id");
                }
                if (numB.intValue() >= 60190) {
                    ekfwVar.h("messages.encryption_protocol");
                }
                if (numB.intValue() >= 60370) {
                    ekfwVar.h("messages.message_persistence_id");
                }
                ekfwVar.h("participants._id");
                if (numB.intValue() >= 59930) {
                    ekfwVar.h("participants.my_identity_token");
                }
                if (numB.intValue() >= 60160) {
                    ekfwVar.h("participants.my_identity_token_foreign_key");
                }
                ekfwVar.h("participants.sub_id");
                if (numB.intValue() >= 2000) {
                    ekfwVar.h("participants.sim_slot_id");
                }
                ekfwVar.h("participants.normalized_destination");
                ekfwVar.h("participants.send_destination");
                ekfwVar.h("participants.display_destination");
                if (numB.intValue() >= 54040) {
                    ekfwVar.h("participants.comparable_destination");
                }
                if (numB.intValue() >= 54040) {
                    ekfwVar.h("participants.country_code");
                }
                if (numB.intValue() >= 58090) {
                    ekfwVar.h("participants.recipient_id");
                }
                if (numB.intValue() >= 58090) {
                    ekfwVar.h("participants.recipient_canonical_address");
                }
                ekfwVar.h("participants.full_name");
                ekfwVar.h("participants.first_name");
                ekfwVar.h("participants.profile_photo_uri");
                if (numB.intValue() >= 59850) {
                    ekfwVar.h("participants.contact_photo_uri");
                }
                ekfwVar.h("participants.contact_id");
                ekfwVar.h("participants.lookup_key");
                ekfwVar.h("participants.color_palette_index");
                if (numB.intValue() >= 1000) {
                    ekfwVar.h("participants.color_type");
                }
                if (numB.intValue() >= 10027) {
                    ekfwVar.h("participants.extended_color");
                }
                ekfwVar.h("participants.blocked");
                if (numB.intValue() >= 2000) {
                    ekfwVar.h("participants.subscription_name");
                }
                if (numB.intValue() >= 2000) {
                    ekfwVar.h("participants.subscription_color");
                }
                if (numB.intValue() >= 4000) {
                    ekfwVar.h("participants.contact_destination");
                }
                if (numB.intValue() >= 12001) {
                    ekfwVar.h("participants.participant_type");
                }
                if (numB.intValue() >= 13050) {
                    ekfwVar.h("participants.video_reachability");
                }
                if (numB.intValue() >= 20060) {
                    ekfwVar.h("participants.alias");
                }
                if (numB.intValue() >= 24060) {
                    ekfwVar.h("participants.is_spam");
                }
                if (numB.intValue() >= 30000) {
                    ekfwVar.h("participants.is_spam_source");
                }
                if (numB.intValue() >= 31020) {
                    ekfwVar.h("participants.cms_id");
                }
                if (numB.intValue() >= 31030) {
                    ekfwVar.h("participants.latest_verification_status");
                }
                if (numB.intValue() >= 33000) {
                    ekfwVar.h("participants.profile_photo_blob_id");
                }
                if (numB.intValue() >= 33060) {
                    ekfwVar.h("participants.profile_photo_encryption_key");
                }
                if (numB.intValue() >= 35010) {
                    ekfwVar.h("participants.directory_id");
                }
                if (numB.intValue() >= 55010) {
                    ekfwVar.h("participants.is_check_constraint_enabled_via_phenotype");
                }
                if (numB.intValue() >= 55010) {
                    ekfwVar.h("participants.is_valid_phone_number_data");
                }
                if (numB.intValue() >= 58090) {
                    ekfwVar.h("participants.duplicate_of");
                }
                if (numB.intValue() >= 58210) {
                    ekfwVar.h("participants.cms_life_cycle");
                }
                if (numB.intValue() >= 58620) {
                    ekfwVar.h("participants.norm_ui_status");
                }
                if (numB.intValue() >= 59440) {
                    ekfwVar.h("participants.last_modified_by_key");
                }
                if (numB.intValue() >= 59550) {
                    ekfwVar.h("participants.name_source");
                }
                if (numB.intValue() >= 59550) {
                    ekfwVar.h("participants.photo_source");
                }
                if (numB.intValue() >= 60060) {
                    ekfwVar.h("participants.profile_photo_user_preference");
                }
                if (numB.intValue() >= 60070) {
                    ekfwVar.h("participants.contact_metadata");
                }
                if (numB.intValue() >= 60640) {
                    ekfwVar.h("participants.is_enterprise_contact");
                }
                ekfwVar.h("conversations._id");
                ekfwVar.h("conversations.sms_thread_id");
                ekfwVar.h("conversations.name");
                if (numB.intValue() >= 10012) {
                    ekfwVar.h("conversations.name_is_automatic");
                }
                if (numB.intValue() >= 59760) {
                    ekfwVar.h("conversations.subtitle");
                }
                ekfwVar.h("conversations.latest_message_id");
                ekfwVar.h("conversations.snippet_text");
                ekfwVar.h("conversations.subject_text");
                ekfwVar.h("conversations.preview_uri");
                ekfwVar.h("conversations.preview_content_type");
                ekfwVar.h("conversations.show_draft");
                ekfwVar.h("conversations.draft_snippet_text");
                ekfwVar.h("conversations.draft_subject_text");
                ekfwVar.h("conversations.draft_preview_uri");
                ekfwVar.h("conversations.draft_preview_content_type");
                if (numB.intValue() >= 29060) {
                    ekfwVar.h("conversations.etouffee_default");
                }
                ekfwVar.h("conversations.archive_status");
                ekfwVar.h("conversations.sort_timestamp");
                ekfwVar.h("conversations.last_read_timestamp");
                ekfwVar.h("conversations.icon");
                ekfwVar.h("conversations.participant_contact_id");
                if (numB.intValue() >= 58090) {
                    ekfwVar.h("conversations.normalized_participant_contact_id");
                }
                ekfwVar.h("conversations.participant_lookup_key");
                if (numB.intValue() >= 58090) {
                    ekfwVar.h("conversations.normalized_participant_lookup_key");
                }
                ekfwVar.h("conversations.participant_normalized_destination");
                if (numB.intValue() >= 58090) {
                    ekfwVar.h("conversations.participant_comparable_destination");
                }
                ekfwVar.h("conversations.current_self_id");
                if (numB.intValue() >= 60160) {
                    ekfwVar.h("conversations.current_my_identity_foreign_key");
                }
                if (numB.intValue() >= 60360) {
                    ekfwVar.h("conversations.destination_token");
                }
                ekfwVar.h("conversations.participant_count");
                ekfwVar.h("conversations.notification_enabled");
                ekfwVar.h("conversations.notification_sound_uri");
                ekfwVar.h("conversations.notification_vibration");
                ekfwVar.h("conversations.include_email_addr");
                ekfwVar.h("conversations.sms_service_center");
                if (numB.intValue() >= 8500) {
                    ekfwVar.h("conversations.participant_id_list");
                }
                if (numB.intValue() >= 58090) {
                    ekfwVar.h("conversations.normalized_participant_id_list");
                }
                if (numB.intValue() >= 8500) {
                    ekfwVar.h("conversations.source_type");
                }
                if (numB.intValue() >= 10000) {
                    ekfwVar.h("conversations.rcs_session_id");
                }
                if (numB.intValue() >= 10006) {
                    ekfwVar.h("conversations.join_state");
                }
                if (numB.intValue() >= 10007) {
                    ekfwVar.h("conversations.conv_type");
                }
                if (numB.intValue() >= 10016) {
                    ekfwVar.h("conversations.send_mode");
                }
                if (numB.intValue() >= 10018) {
                    ekfwVar.h("conversations.IS_ENTERPRISE");
                }
                if (numB.intValue() >= 12001) {
                    ekfwVar.h("conversations.has_ea2p_bot_recipient");
                }
                if (numB.intValue() >= 15000) {
                    ekfwVar.h("conversations.last_interactive_event_timestamp");
                }
                if (numB.intValue() >= 15010) {
                    ekfwVar.h("conversations.participant_display_destination");
                }
                if (numB.intValue() >= 58090) {
                    ekfwVar.h("conversations.normalized_participant_display_destination");
                }
                if (numB.intValue() >= 23000) {
                    ekfwVar.h("conversations.spam_warning_dismiss_status");
                }
                if (numB.intValue() >= 26020) {
                    ekfwVar.h("conversations.open_count");
                }
                if (numB.intValue() >= 28010) {
                    ekfwVar.h("conversations.last_logged_scooby_metadata_timestamp");
                }
                if (numB.intValue() >= 29020) {
                    ekfwVar.h("conversations.delete_timestamp");
                }
                if (numB.intValue() >= 32000) {
                    ekfwVar.h("conversations.cms_id");
                }
                if (numB.intValue() >= 40050) {
                    ekfwVar.h("conversations.rcs_group_id");
                }
                if (numB.intValue() >= 40050) {
                    ekfwVar.h("conversations.rcs_conference_uri");
                }
                if (numB.intValue() >= 58120) {
                    ekfwVar.h("conversations.tachygram_group_routing_info_token");
                }
                if (numB.intValue() >= 53030) {
                    ekfwVar.h("conversations.cms_most_recent_read_message_timestamp_ms");
                }
                if (numB.intValue() >= 46050) {
                    ekfwVar.h("conversations.rcs_subject_change_timestamp_ms");
                }
                if (numB.intValue() >= 48040) {
                    ekfwVar.h("conversations.rcs_session_allows_revocation");
                }
                if (numB.intValue() >= 49020) {
                    ekfwVar.h("conversations.rcs_group_capabilities");
                }
                if (numB.intValue() >= 49060) {
                    ekfwVar.h("conversations.awaiting_reverse_sync");
                }
                if (numB.intValue() >= 58090) {
                    ekfwVar.h("conversations.duplicate_of");
                }
                if (numB.intValue() >= 59130) {
                    ekfwVar.h("conversations.new_duplicate_of");
                }
                if (numB.intValue() >= 58140) {
                    ekfwVar.h("conversations.error_state");
                }
                if (numB.intValue() >= 58210) {
                    ekfwVar.h("conversations.cms_life_cycle");
                }
                if (numB.intValue() >= 58540) {
                    ekfwVar.h("conversations.rcs_group_self_msisdn");
                }
                if (numB.intValue() >= 58750) {
                    ekfwVar.h("conversations.recipient_offline_timestamp_ms");
                }
                if (numB.intValue() >= 58910) {
                    ekfwVar.h("conversations.rcs_group_last_sync_timestamp");
                }
                if (numB.intValue() >= 59210) {
                    ekfwVar.h("conversations.has_been_e2ee");
                }
                if (numB.intValue() >= 59220) {
                    ekfwVar.h("conversations.marked_as_unread");
                }
                if (numB.intValue() >= 59820) {
                    ekfwVar.h("conversations.custom_theme");
                }
                if (numB.intValue() >= 60050) {
                    ekfwVar.h("conversations.mms_group_upgrade_status");
                }
                if (numB.intValue() >= 60050) {
                    ekfwVar.h("conversations.mms_group_upgrade_retries");
                }
                if (numB.intValue() >= 60180) {
                    ekfwVar.h("conversations.encryption_protocol");
                }
                if (numB.intValue() >= 60210) {
                    ekfwVar.h("conversations.encryption_id");
                }
                if (numB.intValue() >= 60250) {
                    ekfwVar.h("conversations.cms_correlation_id");
                }
                if (numB.intValue() >= 60590) {
                    ekfwVar.h("conversations.rcs_group_icon_url");
                }
                if (numB.intValue() >= 60740) {
                    ekfwVar.h("conversations.unread_count");
                }
                strArr = (String[]) ekfwVar.g().toArray(new String[0]);
            }
            blmr blmrVar = new blmr(strArr);
            blmrVar.A("UnreadMessagesCountQuery#createQueryBuilder");
            blmrVar.k(new blms(blmtVar));
            int iH = blmrVar.b().h();
            eieuVarK.close();
            return iH;
        } finally {
        }
    }

    public static brdr b(ConversationIdType conversationIdType) {
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.O(false);
        brecVar.ah(bved.a);
        brecVar.m(conversationIdType);
        brecVar.A(false);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("UnreadMessagesCountQuery#createConversationQueryBuilder");
        brdrVarD.k(new brdv(brecVar));
        return brdrVarD;
    }
}
