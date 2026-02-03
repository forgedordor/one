package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.base.task.TaskRunnerImpl;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzc extends TaskRunnerImpl implements ffyz {
    public ffzc(int i) {
        super(i, "UiThreadTaskRunner", 2);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    protected final void c() {
        ThreadUtils.a().post(this.d);
    }
}
