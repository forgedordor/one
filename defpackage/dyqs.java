package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqs {
    public final View.OnClickListener a;
    public ejwi b = ejud.a;
    public Runnable c;
    public Runnable d;
    public Runnable e;

    public dyqs(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public final void a(final dyqr dyqrVar, final int i) {
        this.c = new Runnable() { // from class: dyqm
            @Override // java.lang.Runnable
            public final void run() {
                dyqr dyqrVar2 = dyqrVar;
                dywc dywcVar = dyqrVar2.a;
                Object objA = dyqrVar2.c.a();
                exbf exbfVar = (exbf) dyqrVar2.b.toBuilder();
                exbfVar.copyOnWrite();
                exbg exbgVar = (exbg) exbfVar.instance;
                exbgVar.c = i - 1;
                exbgVar.b |= 1;
                dywcVar.a(objA, (exbg) exbfVar.build());
            }
        };
    }
}
