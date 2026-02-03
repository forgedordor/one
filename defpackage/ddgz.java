package defpackage;

import com.google.android.gms.inappreach.internal.IOnAccountMessagesListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddgz extends IOnAccountMessagesListener.Stub {
    final /* synthetic */ dcib a;

    public ddgz(dcib dcibVar) {
        this.a = dcibVar;
    }

    @Override // com.google.android.gms.inappreach.internal.IOnAccountMessagesListener
    public final void onAccountMessages(byte[] bArr) {
        this.a.b(new ddgy(bArr));
    }
}
