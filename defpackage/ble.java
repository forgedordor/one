package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ble implements lvz {
    final AtomicBoolean a = new AtomicBoolean(true);
    final bll b;
    final Executor c;

    public ble(Executor executor, bll bllVar) {
        this.c = executor;
        this.b = bllVar;
    }

    @Override // defpackage.lvz
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final blf blfVar = (blf) obj;
        this.c.execute(new Runnable() { // from class: bld
            @Override // java.lang.Runnable
            public final void run() {
                ble bleVar = this.a;
                if (bleVar.a.get()) {
                    bleVar.b.b(blfVar.a);
                }
            }
        });
    }

    final void b() {
        this.a.set(false);
    }
}
