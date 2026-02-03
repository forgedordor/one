package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aonl {
    public static final cczv a;
    public static final cczi b;
    public static final cczi c;
    public static final cczi d;
    public static final cczi e;
    public static final cczv f;
    public static final cczv g;
    public static final cczv h;
    public static final cczi i;
    public static final cczv j;

    static {
        cdag.m(cdag.b, "enable_audio_attachment_refactor", false);
        a = cdag.m(cdag.b, "enable_audio_quality_improvements", false);
        b = cdag.e(cdag.b, "improved_audio_limit_seconds", 120);
        c = cdag.e(cdag.b, "rcs_audio_limit_seconds", 600);
        d = cdag.e(cdag.b, "improved_audio_samples_per_second", 16000);
        e = cdag.e(cdag.b, "improved_audio_bits_per_second", 28000);
        f = cdag.m(cdag.b, "enable_multiplexed_metadata_validation", false);
        g = cdag.m(cdag.b, "enable_voice_moods", false);
        h = cdag.t(cdag.b, "voice_moods_config", aonn.a, new dzze() { // from class: aonk
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (aonn) evsn.parseFrom(aonn.a, bArr);
            }
        });
        i = cdag.j(cdag.b, "audio_level_poll_interval", 100);
        j = cdag.j(cdag.b, "voice_button_background_value", 0);
    }
}
