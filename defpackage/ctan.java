package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctan {
    public static final cczv a = cdag.k(cdag.b, "conversation_page_loading_time_in_millis", 45000);
    public static final cczv b;
    public final fcsu c;
    public final damk d;
    private final fcsu e;

    static {
        cdag.j(cdag.b, "conversation_fetch_batch_size", 20);
        cdag.j(cdag.b, "conversation_load_page_size", 6);
        cdag.j(cdag.b, "conversation_load_initial_load_factor", 3);
        cdag.j(cdag.b, "conversation_load_timeout_seconds", 5);
        cdag.j(cdag.b, "conversation_updates_cache_timeout_millis", 5000);
        cdag.h(cdag.b, "enable_load_message_from_start", true);
        cdag.h(cdag.b, "enable_loading_state_view_metrics", true);
        cdag.m(cdag.b, "enable_single_inbox_v1_for_all", false);
        cdag.m(cdag.b, "log_conversation_list_load_latency", true);
        cdag.m(cdag.b, "show_watch_conversations_on_eos", true);
        cdag.m(cdag.b, "enable_app_interactive_log", true);
        b = cdag.m(cdag.b, "remove_invalid_delete_message", true);
        cdag.m(cdag.b, "enable_scroll_to_top_click_logging", true);
        cdag.m(cdag.b, "enable_app_prerequisites_dialog_logging", true);
    }

    public ctan(@aqcw fcsu fcsuVar, fcsu fcsuVar2, damk damkVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        damkVar.getClass();
        this.e = fcsuVar;
        this.c = fcsuVar2;
        this.d = damkVar;
    }

    public final Boolean a() {
        return (Boolean) this.e.b();
    }
}
