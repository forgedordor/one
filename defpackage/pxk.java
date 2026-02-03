package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pxk implements pxi {
    @Override // defpackage.pxi
    public void a(Context context, Executor executor, final lbz lbzVar) {
        executor.execute(new Runnable() { // from class: pxj
            @Override // java.lang.Runnable
            public final void run() {
                lbzVar.accept(new pxc(fcvo.a));
            }
        });
    }

    @Override // defpackage.pxi
    public void b(lbz lbzVar) {
    }
}
