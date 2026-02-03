package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class botm extends dqsi {
    public static final String[] a = {"conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.subtitle", "conversations.latest_message_id", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.last_read_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.normalized_participant_contact_id", "conversations.participant_lookup_key", "conversations.normalized_participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_comparable_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.destination_token", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.sms_service_center", "conversations.participant_id_list", "conversations.normalized_participant_id_list", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.last_interactive_event_timestamp", "conversations.participant_display_destination", "conversations.normalized_participant_display_destination", "conversations.spam_warning_dismiss_status", "conversations.open_count", "conversations.last_logged_scooby_metadata_timestamp", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.tachygram_group_routing_info_token", "conversations.cms_most_recent_read_message_timestamp_ms", "conversations.rcs_subject_change_timestamp_ms", "conversations.rcs_session_allows_revocation", "conversations.rcs_group_capabilities", "conversations.awaiting_reverse_sync", "conversations.duplicate_of", "conversations.new_duplicate_of", "conversations.error_state", "conversations.cms_life_cycle", "conversations.rcs_group_self_msisdn", "conversations.recipient_offline_timestamp_ms", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "conversations.custom_theme", "conversations.mms_group_upgrade_status", "conversations.mms_group_upgrade_retries", "conversations.encryption_protocol", "conversations.encryption_id", "conversations.cms_correlation_id", "conversations.rcs_group_icon_url", "conversations.unread_count"};
    public static final ekgp b;
    public static final bopp c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversations.name_is_automatic", 10012);
        ekgiVar.i("conversations.subtitle", 59760);
        ekgiVar.i("conversations.etouffee_default", 29060);
        ekgiVar.i("conversations.normalized_participant_contact_id", 58090);
        ekgiVar.i("conversations.normalized_participant_lookup_key", 58090);
        ekgiVar.i("conversations.participant_comparable_destination", 58090);
        ekgiVar.i("conversations.current_my_identity_foreign_key", 60160);
        ekgiVar.i("conversations.destination_token", 60360);
        ekgiVar.i("conversations.participant_id_list", 8500);
        ekgiVar.i("conversations.normalized_participant_id_list", 58090);
        ekgiVar.i("conversations.source_type", 8500);
        ekgiVar.i("conversations.rcs_session_id", 10000);
        ekgiVar.i("conversations.join_state", 10006);
        ekgiVar.i("conversations.conv_type", 10007);
        ekgiVar.i("conversations.send_mode", 10016);
        ekgiVar.i("conversations.IS_ENTERPRISE", 10018);
        ekgiVar.i("conversations.has_ea2p_bot_recipient", 12001);
        ekgiVar.i("conversations.last_interactive_event_timestamp", 15000);
        ekgiVar.i("conversations.participant_display_destination", 15010);
        ekgiVar.i("conversations.normalized_participant_display_destination", 58090);
        ekgiVar.i("conversations.spam_warning_dismiss_status", 23000);
        ekgiVar.i("conversations.open_count", 26020);
        ekgiVar.i("conversations.last_logged_scooby_metadata_timestamp", 28010);
        ekgiVar.i("conversations.delete_timestamp", 29020);
        ekgiVar.i("conversations.cms_id", 32000);
        ekgiVar.i("conversations.rcs_group_id", 40050);
        ekgiVar.i("conversations.rcs_conference_uri", 40050);
        ekgiVar.i("conversations.tachygram_group_routing_info_token", 58120);
        ekgiVar.i("conversations.cms_most_recent_read_message_timestamp_ms", 53030);
        ekgiVar.i("conversations.rcs_subject_change_timestamp_ms", 46050);
        ekgiVar.i("conversations.rcs_session_allows_revocation", 48040);
        ekgiVar.i("conversations.rcs_group_capabilities", 49020);
        ekgiVar.i("conversations.awaiting_reverse_sync", 49060);
        ekgiVar.i("conversations.duplicate_of", 58090);
        ekgiVar.i("conversations.new_duplicate_of", 59130);
        ekgiVar.i("conversations.error_state", 58140);
        ekgiVar.i("conversations.cms_life_cycle", 58210);
        ekgiVar.i("conversations.rcs_group_self_msisdn", 58540);
        ekgiVar.i("conversations.recipient_offline_timestamp_ms", 58750);
        ekgiVar.i("conversations.rcs_group_last_sync_timestamp", 58910);
        ekgiVar.i("conversations.has_been_e2ee", 59210);
        ekgiVar.i("conversations.marked_as_unread", 59220);
        ekgiVar.i("conversations.custom_theme", 59820);
        ekgiVar.i("conversations.mms_group_upgrade_status", 60050);
        ekgiVar.i("conversations.mms_group_upgrade_retries", 60050);
        ekgiVar.i("conversations.encryption_protocol", 60180);
        ekgiVar.i("conversations.encryption_id", 60210);
        ekgiVar.i("conversations.cms_correlation_id", 60250);
        ekgiVar.i("conversations.rcs_group_icon_url", 60590);
        ekgiVar.i("conversations.unread_count", 60740);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("sms_thread_id", "index_conversations_sms_thread_id");
        ekgiVar2.i("archive_status", "index_conversations_archive_status");
        ekgiVar2.i("sort_timestamp", "index_conversations_sort_timestamp");
        ekgiVar2.i("participant_normalized_destination", "index_conversations_participant_normalized_destination");
        ekgiVar2.i("participant_comparable_destination", "index_conversations_participant_comparable_destination");
        ekgiVar2.i("current_my_identity_foreign_key", "index_conversations_current_my_identity_foreign_key");
        ekgiVar2.i("destination_token", "index_conversations_destination_token");
        ekgiVar2.i("normalized_participant_id_list", "index_conversations_normalized_participant_id_list");
        ekgiVar2.i("rcs_session_id", "index_conversations_rcs_session_id");
        ekgiVar2.i("delete_timestamp", "index_conversations_delete_timestamp");
        ekgiVar2.i("cms_id", "index_conversations_cms_id");
        ekgiVar2.i("rcs_group_id", "index_conversations_rcs_group_id");
        ekgiVar2.i("awaiting_reverse_sync", "index_conversations_awaiting_reverse_sync");
        ekgiVar2.i("duplicate_of", "index_conversations_duplicate_of");
        ekgiVar2.i("new_duplicate_of", "index_conversations_new_duplicate_of");
        ekgiVar2.i("marked_as_unread", "index_conversations_marked_as_unread");
        ekgiVar2.i("encryption_id", "index_conversations_encryption_id");
        ekgiVar2.i("cms_correlation_id", "index_conversations_cms_correlation_id");
        ekgiVar2.c();
        c = new bopp();
        d = new int[]{8500, 10000, 10006, 10007, 10012, 10016, 10018, 12001, 15000, 15010, 23000, 26020, 28010, 29020, 29060, 32000, 40050, 46050, 48040, 49020, 49060, 53030, 58090, 58120, 58140, 58210, 58370, 58390, 58540, 58750, 58910, 59130, 59180, 59210, 59220, 59260, 59760, 59810, 59820, 60050, 60160, 60180, 60210, 60250, 60310, 60360, 60590, 60740, 60830};
        e = new int[]{57040};
    }

    public static bojh a(String str) {
        botb botbVarE = e();
        botbVarE.A("conversations.queryOnCmsId");
        botbVarE.q();
        botl botlVar = new botl();
        botlVar.e(str);
        botbVarE.h(botlVar);
        return (bojh) dqru.c(botbVarE.b());
    }

    public static bojh b(ConversationIdType conversationIdType) {
        botb botbVarE = e();
        botbVarE.A("conversations.queryOnId");
        botbVarE.q();
        botl botlVar = new botl();
        botlVar.r(conversationIdType);
        botbVarE.h(botlVar);
        return (bojh) dqru.c(botbVarE.b());
    }

    public static bojh c(ConversationIdType conversationIdType) {
        return (bojh) k(conversationIdType, new Function() { // from class: boix
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bojh bojhVar = (bojh) obj;
                String[] strArr = botm.a;
                return bojhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static bojl d() {
        bojm bojmVar = new bojm();
        bojmVar.aF();
        return bojmVar;
    }

    public static final botb e() {
        String[] strArr;
        Integer numG = g();
        if (numG.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversations._id");
            ekfwVar.h("conversations.sms_thread_id");
            ekfwVar.h("conversations.name");
            if (numG.intValue() >= 10012) {
                ekfwVar.h("conversations.name_is_automatic");
            }
            if (numG.intValue() >= 59760) {
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
            if (numG.intValue() >= 29060) {
                ekfwVar.h("conversations.etouffee_default");
            }
            ekfwVar.h("conversations.archive_status");
            ekfwVar.h("conversations.sort_timestamp");
            ekfwVar.h("conversations.last_read_timestamp");
            ekfwVar.h("conversations.icon");
            ekfwVar.h("conversations.participant_contact_id");
            if (numG.intValue() >= 58090) {
                ekfwVar.h("conversations.normalized_participant_contact_id");
            }
            ekfwVar.h("conversations.participant_lookup_key");
            if (numG.intValue() >= 58090) {
                ekfwVar.h("conversations.normalized_participant_lookup_key");
            }
            ekfwVar.h("conversations.participant_normalized_destination");
            if (numG.intValue() >= 58090) {
                ekfwVar.h("conversations.participant_comparable_destination");
            }
            ekfwVar.h("conversations.current_self_id");
            if (numG.intValue() >= 60160) {
                ekfwVar.h("conversations.current_my_identity_foreign_key");
            }
            if (numG.intValue() >= 60360) {
                ekfwVar.h("conversations.destination_token");
            }
            ekfwVar.h("conversations.participant_count");
            ekfwVar.h("conversations.notification_enabled");
            ekfwVar.h("conversations.notification_sound_uri");
            ekfwVar.h("conversations.notification_vibration");
            ekfwVar.h("conversations.include_email_addr");
            ekfwVar.h("conversations.sms_service_center");
            if (numG.intValue() >= 8500) {
                ekfwVar.h("conversations.participant_id_list");
            }
            if (numG.intValue() >= 58090) {
                ekfwVar.h("conversations.normalized_participant_id_list");
            }
            if (numG.intValue() >= 8500) {
                ekfwVar.h("conversations.source_type");
            }
            if (numG.intValue() >= 10000) {
                ekfwVar.h("conversations.rcs_session_id");
            }
            if (numG.intValue() >= 10006) {
                ekfwVar.h("conversations.join_state");
            }
            if (numG.intValue() >= 10007) {
                ekfwVar.h("conversations.conv_type");
            }
            if (numG.intValue() >= 10016) {
                ekfwVar.h("conversations.send_mode");
            }
            if (numG.intValue() >= 10018) {
                ekfwVar.h("conversations.IS_ENTERPRISE");
            }
            if (numG.intValue() >= 12001) {
                ekfwVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (numG.intValue() >= 15000) {
                ekfwVar.h("conversations.last_interactive_event_timestamp");
            }
            if (numG.intValue() >= 15010) {
                ekfwVar.h("conversations.participant_display_destination");
            }
            if (numG.intValue() >= 58090) {
                ekfwVar.h("conversations.normalized_participant_display_destination");
            }
            if (numG.intValue() >= 23000) {
                ekfwVar.h("conversations.spam_warning_dismiss_status");
            }
            if (numG.intValue() >= 26020) {
                ekfwVar.h("conversations.open_count");
            }
            if (numG.intValue() >= 28010) {
                ekfwVar.h("conversations.last_logged_scooby_metadata_timestamp");
            }
            if (numG.intValue() >= 29020) {
                ekfwVar.h("conversations.delete_timestamp");
            }
            if (numG.intValue() >= 32000) {
                ekfwVar.h("conversations.cms_id");
            }
            if (numG.intValue() >= 40050) {
                ekfwVar.h("conversations.rcs_group_id");
            }
            if (numG.intValue() >= 40050) {
                ekfwVar.h("conversations.rcs_conference_uri");
            }
            if (numG.intValue() >= 58120) {
                ekfwVar.h("conversations.tachygram_group_routing_info_token");
            }
            if (numG.intValue() >= 53030) {
                ekfwVar.h("conversations.cms_most_recent_read_message_timestamp_ms");
            }
            if (numG.intValue() >= 46050) {
                ekfwVar.h("conversations.rcs_subject_change_timestamp_ms");
            }
            if (numG.intValue() >= 48040) {
                ekfwVar.h("conversations.rcs_session_allows_revocation");
            }
            if (numG.intValue() >= 49020) {
                ekfwVar.h("conversations.rcs_group_capabilities");
            }
            if (numG.intValue() >= 49060) {
                ekfwVar.h("conversations.awaiting_reverse_sync");
            }
            if (numG.intValue() >= 58090) {
                ekfwVar.h("conversations.duplicate_of");
            }
            if (numG.intValue() >= 59130) {
                ekfwVar.h("conversations.new_duplicate_of");
            }
            if (numG.intValue() >= 58140) {
                ekfwVar.h("conversations.error_state");
            }
            if (numG.intValue() >= 58210) {
                ekfwVar.h("conversations.cms_life_cycle");
            }
            if (numG.intValue() >= 58540) {
                ekfwVar.h("conversations.rcs_group_self_msisdn");
            }
            if (numG.intValue() >= 58750) {
                ekfwVar.h("conversations.recipient_offline_timestamp_ms");
            }
            if (numG.intValue() >= 58910) {
                ekfwVar.h("conversations.rcs_group_last_sync_timestamp");
            }
            if (numG.intValue() >= 59210) {
                ekfwVar.h("conversations.has_been_e2ee");
            }
            if (numG.intValue() >= 59220) {
                ekfwVar.h("conversations.marked_as_unread");
            }
            if (numG.intValue() >= 59820) {
                ekfwVar.h("conversations.custom_theme");
            }
            if (numG.intValue() >= 60050) {
                ekfwVar.h("conversations.mms_group_upgrade_status");
            }
            if (numG.intValue() >= 60050) {
                ekfwVar.h("conversations.mms_group_upgrade_retries");
            }
            if (numG.intValue() >= 60180) {
                ekfwVar.h("conversations.encryption_protocol");
            }
            if (numG.intValue() >= 60210) {
                ekfwVar.h("conversations.encryption_id");
            }
            if (numG.intValue() >= 60250) {
                ekfwVar.h("conversations.cms_correlation_id");
            }
            if (numG.intValue() >= 60590) {
                ekfwVar.h("conversations.rcs_group_icon_url");
            }
            if (numG.intValue() >= 60740) {
                ekfwVar.h("conversations.unread_count");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new botb(strArr);
    }

    public static dqsy f() {
        return dqru.e("$primary");
    }

    public static Integer g() {
        return Integer.valueOf(o().a());
    }

    public static Object h(String str, Function function, Supplier supplier) {
        bojh bojhVarA = a(str);
        return bojhVarA != null ? function.apply(bojhVarA) : supplier.get();
    }

    public static Object i(ConversationIdType conversationIdType, Function function, Supplier supplier) {
        bojh bojhVarB = b(conversationIdType);
        return bojhVarB != null ? function.apply(bojhVarB) : supplier.get();
    }

    public static Object j(ConversationIdType conversationIdType, Function function) {
        bojh bojhVarB = b(conversationIdType);
        if (bojhVarB != null) {
            return function.apply(bojhVarB);
        }
        return null;
    }

    public static Object k(ConversationIdType conversationIdType, Function function) {
        bojh bojhVarB = b(conversationIdType);
        if (bojhVarB != null) {
            return function.apply(bojhVarB);
        }
        throw new IllegalStateException("row not found");
    }

    public static String l(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_thread_id INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name_is_automatic INTEGER DEFAULT(1)");
        if (i >= 59760) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("subtitle TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_message_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("snippet_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subject_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("show_draft INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_snippet_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_subject_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_preview_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_preview_content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee_default INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("archive_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sort_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_read_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("icon TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_contact_id INT DEFAULT(-1)");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_contact_id INT DEFAULT(-1)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_lookup_key TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_lookup_key TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_normalized_destination TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("participant_comparable_destination TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("current_self_id TEXT");
        if (i >= 59810) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("current_my_identity TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("current_my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (i >= 60360) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("destination_token TEXT REFERENCES destinations(token) ON DELETE RESTRICT ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_count INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("notification_enabled INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("notification_sound_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("notification_vibration INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("include_email_addr INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_service_center TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id_list TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_id_list TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_session_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("join_state INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conv_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_mode INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("IS_ENTERPRISE INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("has_ea2p_bot_recipient INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_interactive_event_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_display_destination TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_display_destination TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("spam_warning_dismiss_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("open_count INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_logged_scooby_metadata_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("delete_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_conference_uri TEXT");
        if (i >= 58120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("tachygram_group_routing_info_token BLOB");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_most_recent_read_message_timestamp_ms INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_subject_change_timestamp_ms INTEGER DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_session_allows_revocation INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_capabilities INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("awaiting_reverse_sync INT DEFAULT(0)");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("duplicate_of INTEGER REFERENCES conversations(_id)  ");
        }
        if (i >= 59130) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("new_duplicate_of INTEGER REFERENCES conversations(_id) ON DELETE SET NULL ");
        }
        if (i >= 58140) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("error_state INT");
        }
        if (i >= 58210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_life_cycle INT DEFAULT(0)");
        }
        if (i >= 58540) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_group_self_msisdn TEXT");
        }
        if (i >= 58750) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("recipient_offline_timestamp_ms INTEGER DEFAULT(-1)");
        }
        if (i >= 58910) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_group_last_sync_timestamp INTEGER DEFAULT(-1)");
        }
        if (i >= 59210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("has_been_e2ee INT DEFAULT(0)");
        }
        if (i >= 59220) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("marked_as_unread INT DEFAULT(0)");
        }
        if (i >= 59820) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_theme BLOB");
        }
        if (i >= 60050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mms_group_upgrade_status INTEGER DEFAULT(0)");
        }
        if (i >= 60050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mms_group_upgrade_retries INTEGER DEFAULT(0)");
        }
        if (i >= 60180) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("encryption_protocol INTEGER DEFAULT(0)");
        }
        if (i >= 60210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("encryption_id TEXT");
        }
        if (i >= 60250) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_correlation_id TEXT");
        }
        if (i >= 60590) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_group_icon_url TEXT");
        }
        if (i >= 60740) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("unread_count INTEGER");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void m(ConversationIdType conversationIdType, Consumer consumer) {
        bojh bojhVarB = b(conversationIdType);
        if (bojhVarB != null) {
            consumer.accept(bojhVarB);
        }
    }

    static String[] n(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversations_sms_thread_id");
        arrayList.add("CREATE INDEX index_conversations_sms_thread_id ON conversations(sms_thread_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_archive_status");
        arrayList.add("CREATE INDEX index_conversations_archive_status ON conversations(archive_status);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_sort_timestamp");
        arrayList.add("CREATE INDEX index_conversations_sort_timestamp ON conversations(sort_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_rcs_session_id");
        arrayList.add("CREATE INDEX index_conversations_rcs_session_id ON conversations(rcs_session_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_delete_timestamp");
        arrayList.add("CREATE INDEX index_conversations_delete_timestamp ON conversations(delete_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_cms_id");
        arrayList.add("CREATE UNIQUE INDEX index_conversations_cms_id ON conversations(cms_id);");
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_participant_comparable_destination");
            arrayList.add("CREATE UNIQUE INDEX index_conversations_participant_comparable_destination ON conversations(participant_comparable_destination);");
        }
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_normalized_participant_id_list");
            arrayList.add("CREATE UNIQUE INDEX index_conversations_normalized_participant_id_list ON conversations(normalized_participant_id_list);");
        }
        if (i >= 58120) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_rcs_group_id");
            arrayList.add("CREATE INDEX index_conversations_rcs_group_id ON conversations(rcs_group_id) WHERE rcs_group_id NOT NULL;");
        }
        if (i >= 58370) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_awaiting_reverse_sync");
            arrayList.add("CREATE INDEX index_conversations_awaiting_reverse_sync ON conversations(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
        }
        if (i >= 58390) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_participant_normalized_destination");
            arrayList.add("CREATE INDEX index_conversations_participant_normalized_destination ON conversations(participant_normalized_destination);");
        }
        if (i >= 59180) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_duplicate_of");
            arrayList.add("CREATE INDEX index_conversations_duplicate_of ON conversations(duplicate_of) WHERE duplicate_of NOT NULL;");
        }
        if (i >= 59180) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_new_duplicate_of");
            arrayList.add("CREATE INDEX index_conversations_new_duplicate_of ON conversations(new_duplicate_of) WHERE new_duplicate_of NOT NULL;");
        }
        if (i >= 59260) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_marked_as_unread");
            arrayList.add("CREATE INDEX index_conversations_marked_as_unread ON conversations(marked_as_unread) WHERE marked_as_unread = 1;");
        }
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_current_my_identity_foreign_key");
            arrayList.add("CREATE INDEX index_conversations_current_my_identity_foreign_key ON conversations(current_my_identity_foreign_key);");
        }
        if (i >= 60310) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_cms_correlation_id");
            arrayList.add("CREATE UNIQUE INDEX index_conversations_cms_correlation_id ON conversations(cms_correlation_id);");
        }
        if (i >= 60360) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_destination_token");
            arrayList.add("CREATE INDEX index_conversations_destination_token ON conversations(destination_token);");
        }
        if (i >= 60830) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_encryption_id");
            arrayList.add("CREATE INDEX index_conversations_encryption_id ON conversations(encryption_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa o() {
        return f().M();
    }
}
