package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjh implements yit {
    public final fctc a;
    private final MessageId b;

    public yjh(MessageId messageId, fdae fdaeVar) {
        this.b = messageId;
        this.a = fctd.b(2, fdaeVar);
    }

    @Override // defpackage.yit
    public final MessageId a() {
        return this.b;
    }

    @Override // defpackage.yit
    public final auyl b() {
        return (auyl) this.a.a();
    }
}
