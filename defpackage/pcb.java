package defpackage;

import android.util.Log;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcb extends pca {
    private final pbx b;
    private boolean c;
    private boolean d;

    public pcb(pcw pcwVar, pbx pbxVar, pcs pcsVar, pcr pcrVar) {
        super(pcwVar);
        lcg.a(true);
        lcg.a(pcsVar != null);
        lcg.a(pcrVar != null);
        this.b = pbxVar;
    }

    private final void d(pbw pbwVar, MotionEvent motionEvent) {
        if (pbz.f(motionEvent)) {
            b(pbwVar);
            return;
        }
        lcg.a(pbwVar != null);
        lcg.a(pca.a(pbwVar));
        this.a.h();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.c = false;
        pbx pbxVar = this.b;
        if (pbxVar.c(motionEvent) && !pbz.h(motionEvent)) {
            pbxVar.a(motionEvent);
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        pbw pbwVarA;
        if ((!pbz.a(motionEvent.getMetaState(), 2) || !pbz.g(motionEvent)) && !pbz.e(motionEvent, 2)) {
            return false;
        }
        this.d = true;
        pbx pbxVar = this.b;
        if (!pbxVar.c(motionEvent) || (pbwVarA = pbxVar.a(motionEvent)) == null) {
            return false;
        }
        pcw pcwVar = this.a;
        if (pcwVar.l(((acwz) pbwVarA).a)) {
            return false;
        }
        pcwVar.h();
        b(pbwVarA);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return (((motionEvent2.getToolType(0) == 1 && motionEvent2.getSource() == 8194) || motionEvent2.getToolType(0) == 3) && pbz.c(motionEvent2) && motionEvent2.getButtonState() == 0) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        pbw pbwVarA;
        if (this.c) {
            this.c = false;
            return false;
        }
        if (!this.a.i()) {
            pbx pbxVar = this.b;
            if (pbxVar.b(motionEvent) && !pbz.h(motionEvent) && (pbwVarA = pbxVar.a(motionEvent)) != null && pbwVarA.c()) {
                d(pbwVarA, motionEvent);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.d) {
            this.d = false;
            return false;
        }
        pbx pbxVar = this.b;
        if (!pbxVar.c(motionEvent)) {
            this.a.h();
            return false;
        }
        if (!pbz.h(motionEvent)) {
            pcw pcwVar = this.a;
            if (pcwVar.i()) {
                pbw pbwVarA = pbxVar.a(motionEvent);
                if (pcwVar.i()) {
                    lcg.a(pbwVarA != null);
                    c(motionEvent);
                    if (!pbz.f(motionEvent) && !this.a.l(((acwz) pbwVarA).a)) {
                        pcwVar.h();
                    }
                    String str = ((acwz) pbwVarA).a;
                    if (pcwVar.l(str)) {
                        pcwVar.m(str);
                    } else {
                        d(pbwVarA, motionEvent);
                    }
                } else {
                    Log.e("MouseInputHandler", "Call to onItemClick w/o selection.");
                }
                this.c = true;
                return true;
            }
        }
        return false;
    }
}
