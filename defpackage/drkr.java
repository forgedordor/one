package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drkr implements drln {
    private final AtomicInteger a = new AtomicInteger();
    private final drlm[] b = new drlm[30];
    private final Object c = new Object();
    private int d = 0;

    @Override // defpackage.drln
    public final drlm a(Runnable runnable) {
        String name;
        drlm drlmVar = new drlm();
        if (runnable instanceof drll) {
            name = runnable.toString();
        } else {
            Class<?> cls = runnable.getClass();
            String simpleName = cls.getSimpleName();
            name = TextUtils.isEmpty(simpleName) ? cls.getName() : simpleName;
        }
        drlmVar.a = name;
        synchronized (this.c) {
            drlm[] drlmVarArr = this.b;
            int i = this.d;
            drlmVarArr[i] = drlmVar;
            this.d = (i + 1) % 30;
        }
        return drlmVar;
    }

    @Override // defpackage.drln
    public final void b() {
        this.a.incrementAndGet();
    }

    @Override // defpackage.drln
    public final void c() {
        this.a.decrementAndGet();
    }
}
