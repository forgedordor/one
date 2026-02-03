package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzv implements nao {
    public final nak a;
    public nad b;
    public boolean c;
    final /* synthetic */ mzz d;

    public mzv(mzz mzzVar, nak nakVar) {
        this.d = mzzVar;
        this.a = nakVar;
    }

    @Override // defpackage.nao
    public final void a() {
        Handler handler = this.d.j;
        mee.f(handler);
        mgb.an(handler, new Runnable() { // from class: mzu
            @Override // java.lang.Runnable
            public final void run() {
                mzv mzvVar = this.a;
                if (mzvVar.c) {
                    return;
                }
                nad nadVar = mzvVar.b;
                if (nadVar != null) {
                    nadVar.j(mzvVar.a);
                }
                mzvVar.d.d.remove(mzvVar);
                mzvVar.c = true;
            }
        });
    }
}
