package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bgve extends dqwl {
    public bgve(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bgvc(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = bgvl.a;
        HashMap map = new HashMap();
        map.put("reports_concat_view._id_read_reports", "read_reports._id");
        map.put("reports_concat_view.message_id_read_reports", "read_reports.message_id");
        map.put("reports_concat_view.participant_id_read_reports", "read_reports.participant_id");
        map.put("reports_concat_view.receive_time_read_reports", "read_reports.receive_time");
        map.put("reports_concat_view.read_time_read_reports", "read_reports.read_time");
        map.put("reports_concat_view.ftd_time_read_reports", "read_reports.ftd_time");
        map.put("reports_concat_view.read_reports__ROWID_read_reports", "read_reports.read_reports__ROWID");
        map.put("user_refs_concat_view.message_id_user_references", "user_references.message_id");
        map.put("user_refs_concat_view.participant_id_user_references", "user_references.participant_id");
        map.put("user_refs_concat_view.user_ref_datetime_user_references", "user_references.user_ref_datetime");
        map.put("user_refs_concat_view.user_references__ROWID_user_references", "user_references.user_references__ROWID");
        map.put("user_refs_concat_view.normalized_destination_participants", "participants.normalized_destination");
        map.put("user_refs_concat_view.color_palette_index_participants", "participants.color_palette_index");
        map.put("user_refs_concat_view.color_type_participants", "participants.color_type");
        map.put("user_refs_concat_view.extended_color_participants", "participants.extended_color");
        map.put("user_refs_concat_view.participants__ROWID_participants", "participants.participants__ROWID");
        map.put("message_replies_view.message_id_message_replies", "message_replies.message_id");
        map.put("message_replies_view._id_messages", "messages._id");
        map.put("message_replies_view.received_timestamp_messages", "messages.received_timestamp");
        map.put("message_replies_view._id_participants", "participants._id");
        map.put("message_replies_view.sub_id_participants", "participants.sub_id");
        map.put("message_replies_view.normalized_destination_participants", "participants.normalized_destination");
        map.put("message_replies_view.display_destination_participants", "participants.display_destination");
        map.put("message_replies_view.full_name_participants", "participants.full_name");
        map.put("message_replies_view.first_name_participants", "participants.first_name");
        map.put("message_replies_view._id_parts", "parts._id");
        map.put("message_replies_view.text_parts", "parts.text");
        map.put("message_replies_view.uri_parts", "parts.uri");
        map.put("message_replies_view.content_type_parts", "parts.content_type");
        map.put("message_replies_view.file_name_parts", "parts.file_name");
        map.put("message_replies_view.duration_parts", "parts.duration");
        map.put("message_replies_view.parts__ROWID_parts", "parts.parts__ROWID");
        map.put("message_replies_view.trigger_url_link_preview", "link_preview.trigger_url");
        map.put("message_replies_view.expiration_time_millis_link_preview", "link_preview.expiration_time_millis");
        map.put("message_replies_view.link_title_link_preview", "link_preview.link_title");
        map.put("message_replies_view.link_image_url_link_preview", "link_preview.link_image_url");
        map.put("message_replies_view.link_preview_failed_link_preview", "link_preview.link_preview_failed");
        return map;
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[]{"participants._id", "messages.sender_id", "link_preview.message_id", "messages._id", "verified_sms_senders.sender_id", "participants.normalized_destination", "verified_sms_brands.brand_id", "verified_sms_senders.brand_id", "conversations._id", "messages.conversation_id", "message_reactions.message_id", "messages._id", "file_transfer.message_id", "messages._id", "message_star.message_id", "messages._id", "message_photos_sharing.message_id", "messages._id", "vmt.part_id", "parts._id", "profiles_table.participant_id", "participants._id", "message_captions.message_id", "messages._id"};
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[]{"participants", "messages", "link_preview", "messages", "verified_sms_senders", "participants", "verified_sms_brands", "verified_sms_senders", "conversations", "messages", "message_reactions", "messages", "file_transfer", "messages", "message_star", "messages", "message_photos_sharing", "messages", "vmt", "parts", "profiles_table", "participants", "message_captions", "messages"};
    }
}
