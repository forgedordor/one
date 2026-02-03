package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fazs implements fazr {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarA = new dzzf(dzyc.a("com.google.android.ims.library")).a();
        a = dzzfVarA.m("PhenotypeRcsFlags__bugle_max_typing_send_frequency_milliseconds", 4000L);
        b = dzzfVarA.m("PhenotypeRcsFlags__bugle_stopped_typing_send_timeout_milliseconds", 10000L);
        dzzfVarA.o("PhenotypeRcsFlags__save_all_logs", false);
    }

    @Override // defpackage.fazr
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fazr
    public final long b() {
        return ((Long) b.b()).longValue();
    }
}
