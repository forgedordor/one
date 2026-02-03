package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujw {
    public static final cczv a = cdag.m(cdag.b, "enable_compose_gifs_in_emotive_button", false);
    public static final cczv b = cdag.m(cdag.b, "enable_compose_stickers_in_emotive_button", false);
    public static final cczv c = cdag.m(cdag.b, "enable_gifs_stickers_shortcuts", false);
    public static final cczv d;
    public static final cczv e;
    public static final cczv f;
    public static final cczv g;
    public static final cczv h;
    public static final cczv i;
    public static final cczv j;
    public static final ejxr k;
    public static final ejxr l;
    public static final cczi m;
    private static final cczu n;

    static {
        cdag.m(cdag.b, "enable_compose_sending_webp_over_rcs", false);
        cdag.m(cdag.b, "enable_compose_shortcuts_screen", false);
        d = cdag.l(cdag.b, "emoji_preferences_strategy", dnlw.b.name());
        e = cdag.m(cdag.b, "enable_compose_camera_gallery_screen", false);
        cdag.m(cdag.b, "enable_compose_camera_in_gallery_screen", false);
        f = cdag.m(cdag.b, "force_mini_camera_simple_viewfinder", false);
        g = cdag.m(cdag.b, "expand_compose_camera_gallery_to_max_height_on_header", true);
        h = cdag.m(cdag.b, "enable_system_picker_tile_in_gallery_screen", false);
        i = cdag.m(cdag.b, "enable_compose_header_in_gallery_screen", false);
        j = cdag.m(cdag.b, "enable_compose_tracing", false);
        dzzf dzzfVar = cdag.b;
        final dtom dtomVar = dtom.a;
        dtomVar.getClass();
        n = cdag.r(dzzfVar, "emoji_search_manifest_file_flag", new ejxr() { // from class: ujv
            @Override // defpackage.ejxr
            public final Object get() {
                return dtomVar.toByteArray();
            }
        });
        cdag.v("enable_emotive_container_tooltip");
        k = cdag.w(220339402, "enable_catch_sticker_api_ioexception");
        cdag.h(cdag.b, "follow_keyboard_transient_heights_on_programmatical_close", true);
        l = cdag.x("enable_voice_input_redesign");
        m = cdag.e(cdag.b, "max_video_record_duration_seconds", 30);
    }

    public static dtom a() {
        try {
            return (dtom) evsn.parseFrom(dtom.a, (byte[]) n.e(), evrr.a());
        } catch (evtj unused) {
            return dtom.a;
        }
    }

    public static boolean b() {
        return ((Boolean) ccze.g.e()).booleanValue() && ((Boolean) ccze.ac.e()).booleanValue() && ((Boolean) a.e()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) ccze.g.e()).booleanValue() && ((Boolean) ccze.ac.e()).booleanValue() && ((Boolean) b.e()).booleanValue();
    }
}
