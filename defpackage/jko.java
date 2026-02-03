package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jko implements hoq {
    public final Choreographer a;
    private final jkj b;

    public jko(Choreographer choreographer, jkj jkjVar) {
        this.a = choreographer;
        this.b = jkjVar;
    }

    @Override // defpackage.hoq
    public final Object a(fdap fdapVar, fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        jkn jknVar = new jkn(fdiuVar, fdapVar);
        jkj jkjVar = this.b;
        Choreographer choreographer = jkjVar.c;
        if (fdbq.f(choreographer, this.a)) {
            synchronized (jkjVar.e) {
                jkjVar.f.add(jknVar);
                if (!jkjVar.h) {
                    jkjVar.h = true;
                    choreographer.postFrameCallback(jkjVar.i);
                }
            }
            fdiuVar.d(new jkl(jkjVar, jknVar));
        } else {
            this.a.postFrameCallback(jknVar);
            fdiuVar.d(new jkm(this, jknVar));
        }
        return fdiuVar.m();
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public final /* synthetic */ fcyg getKey() {
        return hoq.e;
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this, fcygVar);
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcye.d(this, fcyhVar);
    }
}
