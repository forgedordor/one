package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdb extends pca {
    private final pbx b;
    private final Runnable c;
    private final Runnable d;
    private final Runnable e;

    public pdb(pcw pcwVar, pbx pbxVar, Runnable runnable, pcq pcqVar, pcr pcrVar, Runnable runnable2, Runnable runnable3) {
        super(pcwVar);
        lcg.a(true);
        lcg.a(true);
        lcg.a(true);
        lcg.a(pcrVar != null);
        lcg.a(pcqVar != null);
        lcg.a(true);
        this.b = pbxVar;
        this.c = runnable;
        this.d = runnable2;
        this.e = runnable3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return pbz.d(motionEvent) && onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        pbw pbwVarA;
        pbx pbxVar = this.b;
        if (pbxVar.c(motionEvent) && (pbwVarA = pbxVar.a(motionEvent)) != null) {
            this.e.run();
            c(motionEvent);
            pcw pcwVar = this.a;
            if (pcwVar.l(((acwz) pbwVarA).a)) {
                return;
            }
            b(pbwVarA);
            if (pcwVar.j()) {
                this.c.run();
            }
            this.d.run();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        pbw pbwVarA = this.b.a(motionEvent);
        if (pbwVarA == null || !pbwVarA.c()) {
            return this.a.h();
        }
        pcw pcwVar = this.a;
        if (!pcwVar.i()) {
            return false;
        }
        c(motionEvent);
        String str = ((acwz) pbwVarA).a;
        if (pcwVar.l(str)) {
            pcwVar.m(str);
            return true;
        }
        b(pbwVarA);
        return true;
    }
}
