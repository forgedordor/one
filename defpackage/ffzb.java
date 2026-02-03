package defpackage;

import java.lang.ref.WeakReference;
import org.chromium.base.task.TaskRunnerImpl;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzb extends WeakReference {
    public final long a;

    public ffzb(TaskRunnerImpl taskRunnerImpl) {
        super(taskRunnerImpl, TaskRunnerImpl.a);
        this.a = taskRunnerImpl.c;
    }
}
