package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daor {
    public static final cczv a = cdag.h(cdag.b, "enable_external_video_trimmer", false);
    public static final cczv b;
    public static final cczv c;
    public static final cczv d;
    public static final cczi e;
    public static final cczi f;

    static {
        cdag.f(cdag.b, "trimming_threshold_ms", 30000L);
        b = cdag.e(cdag.b, "trimming_output_width", -1);
        c = cdag.e(cdag.b, "trimming_output_height", -1);
        d = cdag.e(cdag.b, "trimming_output_max_size", 4224);
        e = cdag.h(cdag.b, "video_trimmer_intent_logging", false);
        f = cdag.h(cdag.b, "video_trimmer_file_info_logging", false);
    }
}
