package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkgf {
    public static final String[] a = {"message_replies_view.message_id_message_replies", "message_replies_view._id_messages", "message_replies_view.received_timestamp_messages", "message_replies_view._id_participants", "message_replies_view.sub_id_participants", "message_replies_view.normalized_destination_participants", "message_replies_view.display_destination_participants", "message_replies_view.full_name_participants", "message_replies_view.first_name_participants", "message_replies_view._id_parts", "message_replies_view.text_parts", "message_replies_view.uri_parts", "message_replies_view.content_type_parts", "message_replies_view.file_name_parts", "message_replies_view.duration_parts", "message_replies_view.parts__ROWID_parts", "message_replies_view.trigger_url_link_preview", "message_replies_view.expiration_time_millis_link_preview", "message_replies_view.link_title_link_preview", "message_replies_view.link_image_url_link_preview", "message_replies_view.link_preview_failed_link_preview"};
    public static final bkga b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_replies_view.file_name_parts", 26000);
        ekgiVar.i("message_replies_view.duration_parts", 26040);
        ekgiVar.i("message_replies_view.link_preview_failed_link_preview", 22020);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_null_message_id");
        ekgiVar2.c();
        b = new bkga();
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static Integer b() {
        return Integer.valueOf(c().a());
    }

    public static dqxa c() {
        return a().M();
    }
}
