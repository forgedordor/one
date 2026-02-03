package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnwo extends dqpo {
    protected bnwo(dqpt dqptVar) {
        super(dqptVar);
    }

    @Override // defpackage.dqpo
    protected final /* bridge */ /* synthetic */ dqwl a() {
        String[] strArr;
        String[] strArr2 = bnxi.a;
        Integer numB = bnxi.b();
        if (numB.intValue() == Integer.MAX_VALUE) {
            strArr = bnxi.a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversation_labels._id");
            ekfwVar.h("conversation_labels.conversation_id");
            if (numB.intValue() >= 53020) {
                ekfwVar.h("conversation_labels.label");
            }
            ekfwVar.h("conversation_labels.message_id");
            if (numB.intValue() >= 53010) {
                ekfwVar.h("conversation_labels.snippet_text");
            }
            if (numB.intValue() >= 55040) {
                ekfwVar.h("conversation_labels.preview_uri");
            }
            if (numB.intValue() >= 55040) {
                ekfwVar.h("conversation_labels.preview_content_type");
            }
            if (numB.intValue() >= 57050) {
                ekfwVar.h("conversation_labels.message_status");
            }
            if (numB.intValue() >= 57050) {
                ekfwVar.h("conversation_labels.read");
            }
            if (numB.intValue() >= 57050) {
                ekfwVar.h("conversation_labels.received_timestamp");
            }
            if (numB.intValue() >= 57050) {
                ekfwVar.h("conversation_labels.message_protocol");
            }
            if (numB.intValue() >= 57050) {
                ekfwVar.h("conversation_labels.raw_telephony_status");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bnxh(strArr).b();
    }
}
