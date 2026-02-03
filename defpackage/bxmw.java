package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmw {
    public static final cczi a = cdag.h(cdag.b, "enable_rcs_video_compression", false);
    public static final cczi b = cdag.c(cdag.b, "mms_video_compression_fudge_factor", 0.9d);
    public static final cczi c = cdag.c(cdag.b, "video_transformer_fudge_factor", 0.9d);
    public static final cczi d;
    public static final cczi e;
    public static final cczi f;
    public static final cczi g;
    public static final cczi h;
    public static final cczi i;
    public static final cczi j;
    public static final cczi k;
    public static final cczi l;
    public static final cczi m;

    static {
        cdag.e(cdag.b, "low_budget_audio_compression_bitrate", 32768);
        cdag.e(cdag.b, "high_budget_audio_compression_bitrate", 131072);
        cdag.d(cdag.b, "mms_media_compress_ratio", 0.2f);
        d = cdag.f(cdag.b, "rcs_video_compression_size_cut", 31457280L);
        e = cdag.e(cdag.b, "video_compression_max_short_dim", 720);
        f = cdag.f(cdag.b, "video_compression_max_bitrate", 2500000L);
        g = cdag.g(cdag.b, "video_transformer_output_mime_type", "video/avc");
        h = cdag.e(cdag.b, "video_transformer_h264_profile", 8);
        i = cdag.e(cdag.b, "video_transformer_h264_level", 4096);
        j = cdag.e(cdag.b, "video_transformer_h265_profile", 1);
        k = cdag.e(cdag.b, "video_transformer_h265_level", 1024);
        l = cdag.f(cdag.b, "minimum_video_compression_bitrate", 200000L);
        m = cdag.f(cdag.b, "high_budget_media_compression_size_limit_byte", 10000000L);
        cdag.e(cdag.b, "high_budget_compression_bitrate_threshold", 1000000);
    }
}
