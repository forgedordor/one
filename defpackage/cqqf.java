package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqqf {
    public static final long a = TimeUnit.MINUTES.toMillis(20);
    public static volatile ekgp b;
    public static volatile Bundle c;
    private static volatile ekgp d;

    public static ekgp a() {
        if (d != null) {
            return d;
        }
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("bugle_gservices_working", "bool");
        ekgiVar.i("bugle_logsaver", "bool");
        ekgiVar.i("bugle_max_resend_delay_in_millis", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        ekgiVar.i("bugle_mms_attachment_limit", "int");
        ekgiVar.i("bugle_rcs_attachment_limit", "int");
        ekgiVar.i("bugle_refresh_notification_backoff_duration_in_millis", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        ekgiVar.i("bugle_enable_analytics", "bool");
        ekgiVar.i("bugle_persistent_logsaver_rotation_set_size", "int");
        ekgiVar.i("bugle_persistent_logsaver_file_limit", "int");
        ekgiVar.i("bugle_min_phone_number_length_to_format", "int");
        ekgiVar.i("bugle_testing_simulation_session_id", "string");
        ekgiVar.i("device_country", "string");
        d = ekgiVar.c();
        return d;
    }

    public static String b(String str) {
        return (String) a().get(str);
    }

    public static boolean c(String str) {
        return c != null && c.containsKey(str);
    }
}
