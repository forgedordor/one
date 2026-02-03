package defpackage;

import androidx.window.extensions.embedding.ActivityStack;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class psh {
    public static final prw a(ActivityStack activityStack) {
        List activities = activityStack.getActivities();
        activities.getClass();
        return new prw(activities, activityStack.isEmpty(), null);
    }
}
