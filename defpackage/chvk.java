package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chvk implements Supplier {
    public static final chvk a = new chvk();

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return new IllegalStateException("senderMessagingIdentity expected");
    }
}
