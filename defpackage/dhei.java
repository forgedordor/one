package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhei extends dheg<Void> {
    private final AtomicReference a = new AtomicReference();

    @Override // defpackage.dheg
    protected final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        if (intent == null) {
            dhja.q("Empty message received", new Object[0]);
            return;
        }
        if (!dhff.e(context, intent)) {
            dhja.q("Caller not trusted, dropping recurring-metrics-upload message: %s", intent);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            dhja.q("Empty action received", new Object[0]);
            return;
        }
        if (action.equals(RcsIntents.ACTION_RCS_RECURRING_METRICS_UPLOAD)) {
            dhja.c("Recurring Metrics Upload message received: %s", action);
            dheh dhehVar = (dheh) this.a.get();
            if (dhehVar != null) {
                try {
                    dhehVar.a();
                } catch (Exception e) {
                    dhja.s(e, "Unhandled Exception Uploading Metrics.", new Object[0]);
                }
            }
        }
    }
}
