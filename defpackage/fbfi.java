package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbfi implements fbfh {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        a = dzzfVarB.n("tachyon_host_name", "instantmessaging-pa.googleapis.com");
        b = dzzfVarB.m("tachyon_port_number", 443L);
    }

    @Override // defpackage.fbfh
    public final long a() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fbfh
    public final String b() {
        return (String) a.b();
    }
}
