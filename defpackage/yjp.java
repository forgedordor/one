package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjp extends LruCache {
    private final fdat a;

    public yjp(int i, fdat fdatVar) {
        super(i);
        this.a = fdatVar;
    }

    @Override // android.util.LruCache
    protected final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        this.a.a(obj, obj2);
    }
}
