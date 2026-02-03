package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avne implements avmr, cqci {
    public static final /* synthetic */ int b = 0;
    private final avmr d;
    private final cogw e;
    private final ejxr f = ejxx.a(new ejxr() { // from class: avnc
        @Override // defpackage.ejxr
        public final Object get() {
            int i = avne.b;
            return new LruCache(1000);
        }
    });
    static final cczi a = cdag.f(cdag.b, "conversation_thread_id_cache_expiry_ms", TimeUnit.SECONDS.toNanos(10));
    private static final Object c = new Object();

    public avne(avmr avmrVar, cogw cogwVar) {
        this.d = avmrVar;
        this.e = cogwVar;
    }

    private final cnqj c(ConversationIdType conversationIdType) {
        synchronized (c) {
            avnd avndVar = (avnd) ((LruCache) this.f.get()).get(conversationIdType);
            if (avndVar != null && this.e.b() <= avndVar.a) {
                return (cnqj) avndVar.b;
            }
            return null;
        }
    }

    private final void d(ConversationIdType conversationIdType, cnqj cnqjVar) {
        if (cnqjVar.c()) {
            synchronized (c) {
                ((LruCache) this.f.get()).put(conversationIdType, new avnd(this.e.b() + ((Long) a.e()).longValue(), cnqjVar));
            }
        }
    }

    @Override // defpackage.avmr
    public final cnqj a(ConversationIdType conversationIdType) {
        cnqj cnqjVarC = c(conversationIdType);
        if (cnqjVarC != null) {
            return cnqjVarC;
        }
        cnqj cnqjVarA = this.d.a(conversationIdType);
        d(conversationIdType, cnqjVarA);
        return cnqjVarA;
    }

    @Override // defpackage.avmr
    public final cnqj b(bojh bojhVar) {
        cnqj cnqjVarC = c(bojhVar.C());
        if (cnqjVarC != null) {
            return cnqjVarC;
        }
        cnqj cnqjVarB = this.d.b(bojhVar);
        d(bojhVar.C(), cnqjVarB);
        return cnqjVarB;
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        synchronized (c) {
            ((LruCache) this.f.get()).evictAll();
        }
    }
}
