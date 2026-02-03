package defpackage;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqq implements View.OnClickListener {
    public boolean a;
    final /* synthetic */ dyqs b;

    public dyqq(dyqs dyqsVar) {
        this.b = dyqsVar;
    }

    public final void a() {
        Runnable runnable = this.b.e;
        if (runnable != null) {
            runnable.run();
        }
        ecem.e(new Runnable() { // from class: dyqo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a = false;
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a) {
            return;
        }
        this.a = true;
        dyqs dyqsVar = this.b;
        Runnable runnable = dyqsVar.d;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = dyqsVar.c;
        if (runnable2 != null) {
            runnable2.run();
        }
        dypy dypyVar = (dypy) dyqsVar.b.e(new dypy() { // from class: dyqn
            @Override // defpackage.dypy
            public final ListenableFuture a() {
                return eork.i(true);
            }
        });
        view.getContext();
        eork.r(dypyVar.a(), new dyqp(this, view), kxj.e(view.getContext()));
    }
}
