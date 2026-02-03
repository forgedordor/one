package defpackage;

import android.provider.Telephony;
import android.util.LruCache;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecow extends LruCache {
    final /* synthetic */ ecox a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecow(ecox ecoxVar) {
        super(1024);
        this.a = ecoxVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        long orCreateThreadId;
        Set setSingleton = (Set) obj;
        boolean zIsEmpty = setSingleton.isEmpty();
        ecpl ecplVar = this.a.a;
        if (zIsEmpty) {
            setSingleton = Collections.singleton("ʼUNKNOWN_SENDER!ʼ");
        }
        try {
            orCreateThreadId = Telephony.Threads.getOrCreateThreadId(((ecpj) ecplVar).a, (Set<String>) setSingleton);
        } catch (RuntimeException unused) {
            orCreateThreadId = ((ecpj) ecplVar).b;
        }
        return Long.valueOf(orCreateThreadId);
    }
}
