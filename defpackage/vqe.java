package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqe implements aalp {
    private final Conversation a;

    public vqe(Conversation conversation) {
        this.a = conversation;
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
