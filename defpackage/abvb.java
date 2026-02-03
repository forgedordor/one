package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abvb implements Runnable {
    final /* synthetic */ MessageIdType a;
    final /* synthetic */ abvc b;
    final /* synthetic */ String c;

    public abvb(MessageIdType messageIdType, abvc abvcVar, String str) {
        this.a = messageIdType;
        this.b = abvcVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bqkl.f(this.a, new abuz(this.b, this.c), abva.a);
    }
}
