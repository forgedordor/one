package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crvx {
    public static final ejxr a;
    public static final ejxr b;
    public static final ejxr c;
    public static final cczi d;
    public static final cczi e;
    public static final ejxr f;
    public static final cczi g;
    public static final cczi h;
    public static final cczi i;
    public static final cczi j;
    public static final ejxr k;

    static {
        ejxr ejxrVarX = cdag.x("enable_chatbot_unsubscribe");
        ejxrVarX.getClass();
        a = ejxrVarX;
        ejxr ejxrVarX2 = cdag.x("enable_xms_chatbot_unsubscribe");
        ejxrVarX2.getClass();
        b = ejxrVarX2;
        ejxr ejxrVarX3 = cdag.x("enable_rbm_chatbot_unsubscribe");
        ejxrVarX3.getClass();
        c = ejxrVarX3;
        d = cdag.g(cdag.b, "report_spam_learn_more_url", "https://support.google.com/messages/?p=block_report_spam");
        e = cdag.g(cdag.b, "report_spam_learn_more_help_and_feedback_topic", "block_report_spam");
        ejxr ejxrVarX4 = cdag.x("enable_send_stop_start_keyword_messages");
        ejxrVarX4.getClass();
        f = ejxrVarX4;
        g = cdag.e(cdag.b, "chatbot_unsubscribe_toolstone_reappearance_messages", 3);
        h = cdag.e(cdag.b, "chatbot_unsubscribe_toolstone_reappearance_window_days", 7);
        i = cdag.h(cdag.b, "chatbot_unsubscribe_precheck_spam_report_checkbox", true);
        j = cdag.e(cdag.b, "chatbot_unsubscribe_num_messages_lookback_otp", 10);
        ejxr ejxrVarX5 = cdag.x("chatbot_unsubscribe_toolstone_allowed");
        ejxrVarX5.getClass();
        k = ejxrVarX5;
    }
}
