package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzw extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bpzv(this);
    }

    public final void b(int i) {
        ap(new dqty("messages_annotations.annotation_type", 1, Integer.valueOf(i)));
    }

    public final void c() {
        ap(new dqty("messages_annotations.annotation_type", 2, 8));
    }

    public final void d(MessageIdType messageIdType) {
        int iIntValue = bpzx.c().intValue();
        if (iIntValue < 20040) {
            dqru.x("message_id", iIntValue);
        }
        ap(new dqpj("messages_annotations.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void e(dqxe dqxeVar) {
        int iIntValue = bpzx.c().intValue();
        if (iIntValue < 20040) {
            dqru.x("message_id", iIntValue);
        }
        ap(new dqpk("messages_annotations.message_id", 1, dqxeVar));
    }

    public final void f(dqxe dqxeVar) {
        int iIntValue = bpzx.c().intValue();
        if (iIntValue < 20040) {
            dqru.x("message_id", iIntValue);
        }
        ap(new dqpk("messages_annotations.message_id", 3, dqxeVar));
    }
}
