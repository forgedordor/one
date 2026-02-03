package defpackage;

import android.content.Context;
import android.os.SystemClock;
import defpackage.cqdd;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqde extends cqdf {
    final /* synthetic */ cqdf a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqde(String str, cqdf cqdfVar, Context context) {
        super(str);
        this.a = cqdfVar;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            cqdf cqdfVar = this.a;
            cqdfVar.run();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            Map map = f;
            synchronized (map) {
                map.remove(cqdfVar);
            }
            cqdb cqdbVarCE = ((cqdd.a) ehli.a(this.b, cqdd.a.class)).cE();
            if (cqdbVarCE != null) {
                cqdbVarCE.h(this.h, jElapsedRealtime2, e);
            }
        } catch (IllegalStateException e) {
            ekrw ekrwVarJ = cqdf.g.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncRunnable$1", "run", 'U', "SafeAsyncRunnable.java")).q("Exception in SafeAsyncRunnable");
        }
    }
}
