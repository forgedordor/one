package defpackage;

import android.util.LruCache;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwxs {
    private static WeakReference a = new WeakReference(null);

    public dwxs() {
        new LruCache(50);
    }

    public static synchronized void a() {
        if (((dwxs) a.get()) == null) {
            a = new WeakReference(new dwxs());
        }
    }
}
