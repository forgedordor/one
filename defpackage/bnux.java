package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnux extends dqpo {
    protected bnux(dqpt dqptVar) {
        super(dqptVar);
    }

    @Override // defpackage.dqpo
    protected final /* bridge */ /* synthetic */ dqwl a() {
        String[] strArr;
        String[] strArr2 = bnvf.a;
        Integer numB = bnvf.b();
        if (numB.intValue() == Integer.MAX_VALUE) {
            strArr = bnvf.a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversation_image_parts_view.conversation_id_messages");
            ekfwVar.h("conversation_image_parts_view.received_timestamp_messages");
            ekfwVar.h("conversation_image_parts_view.status_messages");
            ekfwVar.h("conversation_image_parts_view.uri_parts");
            ekfwVar.h("conversation_image_parts_view.content_type_parts");
            if (numB.intValue() >= 10021) {
                ekfwVar.h("conversation_image_parts_view.original_uri_parts");
            }
            if (numB.intValue() >= 60240) {
                ekfwVar.h("conversation_image_parts_view.image_display_state_parts");
            }
            ekfwVar.h("conversation_image_parts_view.display_destination_participants");
            ekfwVar.h("conversation_image_parts_view.full_name_participants");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bnva(strArr).b();
    }
}
