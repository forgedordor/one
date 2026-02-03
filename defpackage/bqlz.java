package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqlz extends dqye {
    public bqlz() {
        super("message_replies");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqly b() {
        ah();
        return new bqly(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(MessageIdType messageIdType) {
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            this.a.putNull("replied_to_message_id");
        } else {
            this.a.put("replied_to_message_id", Long.valueOf(bary.a(messageIdType)));
        }
    }
}
