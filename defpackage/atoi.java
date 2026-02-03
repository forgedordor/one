package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atoi extends LruCache {
    public atoi() {
        super(32);
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        fdis fdisVar = (fdis) obj2;
        if (!z || fdisVar == null) {
            return;
        }
        fdisVar.w(fctl.a(new Exception("Too many ongoing requests")));
    }
}
