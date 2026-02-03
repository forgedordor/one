package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkgb extends dqpo {
    protected bkgb(dqpt dqptVar) {
        super(dqptVar);
    }

    @Override // defpackage.dqpo
    protected final /* bridge */ /* synthetic */ dqwl a() {
        String[] strArr;
        String[] strArr2 = bkgf.a;
        Integer numB = bkgf.b();
        if (numB.intValue() == Integer.MAX_VALUE) {
            strArr = bkgf.a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("message_replies_view.message_id_message_replies");
            ekfwVar.h("message_replies_view._id_messages");
            ekfwVar.h("message_replies_view.received_timestamp_messages");
            ekfwVar.h("message_replies_view._id_participants");
            ekfwVar.h("message_replies_view.sub_id_participants");
            ekfwVar.h("message_replies_view.normalized_destination_participants");
            ekfwVar.h("message_replies_view.display_destination_participants");
            ekfwVar.h("message_replies_view.full_name_participants");
            ekfwVar.h("message_replies_view.first_name_participants");
            ekfwVar.h("message_replies_view._id_parts");
            ekfwVar.h("message_replies_view.text_parts");
            ekfwVar.h("message_replies_view.uri_parts");
            ekfwVar.h("message_replies_view.content_type_parts");
            if (numB.intValue() >= 26000) {
                ekfwVar.h("message_replies_view.file_name_parts");
            }
            if (numB.intValue() >= 26040) {
                ekfwVar.h("message_replies_view.duration_parts");
            }
            ekfwVar.h("message_replies_view.trigger_url_link_preview");
            ekfwVar.h("message_replies_view.expiration_time_millis_link_preview");
            ekfwVar.h("message_replies_view.link_title_link_preview");
            ekfwVar.h("message_replies_view.link_image_url_link_preview");
            if (numB.intValue() >= 22020) {
                ekfwVar.h("message_replies_view.link_preview_failed_link_preview");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bkge(strArr).b();
    }
}
