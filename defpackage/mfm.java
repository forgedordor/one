package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfm {
    public final WeakReference a;
    final /* synthetic */ mfp b;
    private final Executor c;

    public mfm(mfp mfpVar, niv nivVar, Executor executor) {
        this.b = mfpVar;
        this.a = new WeakReference(nivVar);
        this.c = executor;
    }

    public final void a() {
        this.c.execute(new Runnable() { // from class: mfl
            @Override // java.lang.Runnable
            public final void run() {
                mfm mfmVar = this.a;
                niv nivVar = (niv) mfmVar.a.get();
                if (nivVar != null) {
                    nivVar.a.f(mfmVar.b.a());
                }
            }
        });
    }
}
