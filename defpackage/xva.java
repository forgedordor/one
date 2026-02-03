package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xva implements djse, aalp {
    private static final dzfh a = new dzfh("GlideLoadLatency");
    private final dzuc b;
    private final ConcurrentHashMap c;

    public xva(dzuc dzucVar) {
        dzucVar.getClass();
        this.b = dzucVar;
        this.c = new ConcurrentHashMap();
    }

    @Override // defpackage.djse
    public final void b(rhs rhsVar, Object obj) {
        if (obj instanceof Uri) {
            ConcurrentHashMap concurrentHashMap = this.c;
            if (concurrentHashMap.containsKey(obj)) {
                this.b.f((dzub) concurrentHashMap.remove(obj), a, null, dzua.ERROR);
            }
        }
    }

    @Override // defpackage.djse
    public final void c(Uri uri) {
        if (uri != null) {
            this.c.put(uri, this.b.d());
        }
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        ConcurrentHashMap concurrentHashMap = this.c;
        for (Object obj : concurrentHashMap.values()) {
            obj.getClass();
            this.b.f((dzub) obj, a, null, dzua.CANCEL);
        }
        concurrentHashMap.clear();
    }

    @Override // defpackage.djse
    public final void d(Drawable drawable, Object obj) {
        if (obj instanceof Uri) {
            ConcurrentHashMap concurrentHashMap = this.c;
            if (concurrentHashMap.containsKey(obj)) {
                this.b.f((dzub) concurrentHashMap.remove(obj), a, null, dzua.SUCCESS);
            }
        }
    }

    @Override // defpackage.djse
    public final /* synthetic */ void a(Uri uri, int i, int i2) {
    }
}
