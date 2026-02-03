package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbez implements fbey {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        a = dzzfVarB.o("enable_memory_recording", false);
        b = dzzfVarB.o("enable_timing", false);
    }

    @Override // defpackage.fbey
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fbey
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
