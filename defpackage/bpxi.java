package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpxi extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bpxh(this);
    }

    public final void b(MessageIdType messageIdType) {
        ap(new dqpj("link_preview.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }
}
