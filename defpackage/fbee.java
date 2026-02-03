package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbee implements fbed {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        a = dzzfVarB.m("bitmap_download_connection_timeout_millis", 15000L);
        b = dzzfVarB.m("bitmap_download_read_timeout_millis", 30000L);
        c = dzzfVarB.m("maximum_avatar_dimension_pixels", 256L);
    }

    @Override // defpackage.fbed
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbed
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fbed
    public final long c() {
        return ((Long) c.b()).longValue();
    }
}
