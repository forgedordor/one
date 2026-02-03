package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqih extends dqye {
    public bqih() {
        super("message_photos_sharing");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqig b() {
        ah();
        return new bqig(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(MessageIdType messageIdType) {
        String[] strArr = bqik.a;
        bqij bqijVar = new bqij();
        bqijVar.ap(new dqpj("message_photos_sharing.message_id", 1, Long.valueOf(bary.a(messageIdType))));
        aj(new bqii(bqijVar), "message_photos_sharing-buildAndUpdateForMessageId");
    }
}
