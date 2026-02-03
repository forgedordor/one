package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxgi extends LruCache {
    private static final eksp b = eksp.c("BugleImage");
    public final String a;

    public bxgi(int i, String str) {
        super(i);
        this.a = str;
    }

    public synchronized bxgz a(String str, bxgz bxgzVar) {
        bxgzVar.p();
        return (bxgz) put(str, bxgzVar);
    }

    public final synchronized bxgz b(String str) {
        bxgz bxgzVar;
        bxgzVar = (bxgz) get(str);
        if (bxgzVar != null) {
            bxgzVar.p();
        }
        ekrw ekrwVarO = b.o();
        ekrwVarO.X(bxhf.d, this.a);
        ekrwVarO.X(bxhf.g, str);
        ekrwVarO.X(bxhf.e, Integer.valueOf(hitCount()));
        ekrwVarO.X(bxhf.f, Integer.valueOf(missCount()));
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/media/common/MediaCache", "fetchResourceFromCache", 84, "MediaCache.java")).q("Fetching resource from cache.");
        return bxgzVar;
    }

    public final synchronized void c() {
        try {
            evictAll();
        } catch (IllegalStateException e) {
            ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/media/common/MediaCache", "destroy", 56, "MediaCache.java")).o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.util.LruCache
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized void entryRemoved(boolean z, String str, bxgz bxgzVar, bxgz bxgzVar2) {
        bxgzVar.q();
    }

    public final synchronized void e(String str) {
        for (String str2 : snapshot().keySet()) {
            if (str2.startsWith(str)) {
                remove(str2);
            }
        }
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        int iA = ((bxgz) obj2).a() / 1024;
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
