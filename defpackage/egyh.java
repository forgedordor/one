package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egyh {
    public static final egyh a = new egyh(null, Instant.EPOCH, false);
    private final Object b;
    private final egyg c;

    private egyh(Object obj, Instant instant, boolean z) {
        this.b = obj;
        this.c = new egyg(instant, obj != null, z);
    }

    public static egyh a(Object obj, Instant instant) {
        obj.getClass();
        return new egyh(obj, instant, true);
    }

    public static egyh b(Object obj) {
        obj.getClass();
        return new egyh(obj, Instant.EPOCH, false);
    }

    public final Instant c() {
        ejwl.m(e(), "Cannot get timestamp for a CacheResult that does not have content");
        ejwl.m(f(), "Cannot get timestamp for an invalid CacheResult");
        return this.c.a;
    }

    public final Object d() {
        ejwl.m(e(), "Cannot get data for a CacheResult that does not have content");
        return this.b;
    }

    public final boolean e() {
        return this.c.b;
    }

    public final boolean f() {
        ejwl.m(e(), "Cannot call isValid() for a CacheResult that does not have content");
        return this.c.c;
    }

    public final String toString() {
        egyg egygVar = this.c;
        if (!egygVar.b) {
            return "CacheResult.cacheMiss";
        }
        if (!egygVar.c) {
            return "CacheResult.cacheInvalid{data=" + String.valueOf(this.b) + "}";
        }
        Object obj = this.b;
        Instant instant = egygVar.a;
        return "CacheResult.cacheHit{data=" + String.valueOf(obj) + ", timestamp=" + instant.toString() + "}";
    }
}
