package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amii {
    public final coor a;
    public final fdjx b;
    public final LruCache c;
    public final LruCache d;
    public final LruCache e;

    public amii(coor coorVar, fdjx fdjxVar) {
        coorVar.getClass();
        fdjxVar.getClass();
        this.a = coorVar;
        this.b = fdjxVar;
        this.c = new LruCache(30);
        this.d = new LruCache(30);
        this.e = new LruCache(90);
    }

    public final void a(MessageId messageId) {
        if (this.d.get(messageId) == null) {
            LruCache lruCache = this.c;
            synchronized (lruCache) {
                if (lruCache.get(messageId) == null) {
                    lruCache.put(messageId, true);
                }
            }
        }
    }
}
