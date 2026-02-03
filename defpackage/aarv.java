package defpackage;

import android.os.Bundle;
import androidx.car.app.model.Alert;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarv implements aari {
    static final cczv a = cdag.e(cdag.b, "donation_recent_collector_max_message_count", 50);
    static final cczv b = cdag.e(cdag.b, "donation_recent_collector_max_conversation_count", Alert.DURATION_SHOW_INDEFINITELY);
    static final cczv c = cdag.e(cdag.b, "donation_recent_collector_max_messages_per_conversation", 10);
    static final cczv d = cdag.h(cdag.b, "donation_recent_collector_include_sent_messages", false);
    static final cczv e = cdag.h(cdag.b, "donation_recent_collector_include_long_code_messages", true);
    static final cczv f = cdag.h(cdag.b, "donation_recent_collector_include_group_conversations", false);
    static final cczi g = cdag.c(cdag.b, "donation_recent_collector_edit_distance_threshold", 0.0d);
    public static final /* synthetic */ int k = 0;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final eosc l;

    public aarv(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar) {
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.l = eoscVar;
    }

    @Override // defpackage.aari
    public final eiju a(final Bundle bundle) {
        return eijx.g(new Callable() { // from class: aart
            /* JADX WARN: Removed duplicated region for block: B:68:0x019c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0141 A[SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 678
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aart.call():java.lang.Object");
            }
        }, this.l);
    }
}
