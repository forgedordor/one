package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwg {
    static void a(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    static void c(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    static void d(Notification.ProgressStyle progressStyle, List<kwh> list) {
        for (kwh kwhVar : list) {
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(kwhVar.a).setColor(kwhVar.c).setId(kwhVar.b));
        }
    }

    static void e(Notification.ProgressStyle progressStyle, List<kwi> list) {
        for (kwi kwiVar : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(kwiVar.a).setColor(kwiVar.c).setId(kwiVar.b));
        }
    }

    static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    static void h(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }
}
