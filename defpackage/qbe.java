package defpackage;

import android.os.Trace;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbe {
    public static final qba a(pzf pzfVar, final String str, final Executor executor, final fdae fdaeVar) {
        executor.getClass();
        final lvy lvyVar = new lvy(qba.b);
        return new qbb(kol.a(new koi() { // from class: qbc
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final String str2 = str;
                final fdae fdaeVar2 = fdaeVar;
                final lvy lvyVar2 = lvyVar;
                executor.execute(new Runnable() { // from class: qbd
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        kog kogVar2 = kogVar;
                        lvy lvyVar3 = lvyVar2;
                        fdae fdaeVar3 = fdaeVar2;
                        String str3 = str2;
                        boolean zC = plm.c();
                        if (zC) {
                            try {
                                plm.a(str3);
                            } finally {
                                if (zC) {
                                    Trace.endSection();
                                }
                            }
                        }
                        try {
                            fdaeVar3.invoke();
                            qay qayVar = qba.a;
                            lvyVar3.j(qayVar);
                            kogVar2.b(qayVar);
                        } catch (Throwable th) {
                            lvyVar3.j(new qaw(th));
                            kogVar2.c(th);
                        }
                    }
                });
                return fctx.a;
            }
        }));
    }
}
