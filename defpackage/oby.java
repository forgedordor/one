package defpackage;

import android.content.Context;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.MediaMetricsManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oby implements AutoCloseable {
    public EditingSession a;
    private boolean b;

    public oby(Context context) {
        MediaMetricsManager mediaMetricsManagerM570m = kvh$$ExternalSyntheticApiModelOutline1.m570m(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM570m != null) {
            this.a = mediaMetricsManagerM570m.createEditingSession();
        }
    }

    public final void a(EditingEndedEvent editingEndedEvent) {
        EditingSession editingSession;
        if (this.b || (editingSession = this.a) == null) {
            return;
        }
        editingSession.reportEditingEndedEvent(editingEndedEvent);
        this.b = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        EditingSession editingSession = this.a;
        if (editingSession != null) {
            editingSession.close();
            this.a = null;
        }
    }
}
