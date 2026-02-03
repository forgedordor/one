package defpackage;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exlp implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    private float a = 0.0f;
    private float b = 0.0f;
    private float c = 0.0f;
    private final exlm d = new exlm();
    private final HashMap e = new HashMap();
    private final exll f = new exll();
    private int g = 1;
    private int h = 1;
    private final exlo i;

    public exlp(exlo exloVar) {
        this.i = exloVar;
    }

    private final exjh a(float f, float f2) {
        PointF pointF = new PointF(f, f2);
        b(pointF);
        return c(pointF);
    }

    private final void b(PointF pointF) {
        pointF.x /= this.g;
        pointF.y /= this.h;
    }

    private static final exjh c(PointF pointF) {
        exjg exjgVar = (exjg) exjh.a.createBuilder();
        double d = pointF.x;
        exjgVar.copyOnWrite();
        ((exjh) exjgVar.instance).b = d;
        double d2 = pointF.y;
        exjgVar.copyOnWrite();
        ((exjh) exjgVar.instance).c = d2;
        return (exjh) exjgVar.build();
    }

    private final void d(int i, MotionEvent motionEvent) {
        exmc exmcVar = (exmc) exmd.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        exmcVar.copyOnWrite();
        ((exmd) exmcVar.instance).g = micros;
        exmcVar.copyOnWrite();
        ((exmd) exmcVar.instance).f = exmg.a(i);
        exjh exjhVarA = a(motionEvent.getX(), motionEvent.getY());
        exmcVar.copyOnWrite();
        exmd exmdVar = (exmd) exmcVar.instance;
        exjhVarA.getClass();
        exmdVar.e = exjhVarA;
        exmdVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        exmcVar.copyOnWrite();
        ((exmd) exmcVar.instance).c = pointerCount;
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            exjh exjhVarA2 = a(motionEvent.getX(i2), motionEvent.getY(i2));
            exmcVar.copyOnWrite();
            exmd exmdVar2 = (exmd) exmcVar.instance;
            exjhVarA2.getClass();
            evtg evtgVar = exmdVar2.d;
            if (!evtgVar.c()) {
                exmdVar2.d = evsn.mutableCopy(evtgVar);
            }
            exmdVar2.d.add(exjhVarA2);
        }
        exlo exloVar = this.i;
        exma exmaVar = (exma) exmb.a.createBuilder();
        exmaVar.copyOnWrite();
        exmb exmbVar = (exmb) exmaVar.instance;
        exmd exmdVar3 = (exmd) exmcVar.build();
        exmdVar3.getClass();
        exmbVar.c = exmdVar3;
        exmbVar.b = 6;
        exloVar.a((exmb) exmaVar.build());
    }

    private final void e(int i, ScaleGestureDetector scaleGestureDetector) {
        if (i == 3) {
            this.a = scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan();
        } else {
            this.a += (scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan()) - 1.0f;
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
        exjh exjhVarA = a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        exlo exloVar = this.i;
        exma exmaVar = (exma) exmb.a.createBuilder();
        exmh exmhVar = (exmh) exmi.a.createBuilder();
        exmhVar.copyOnWrite();
        ((exmi) exmhVar.instance).f = exmg.a(i);
        double d = this.a;
        exmhVar.copyOnWrite();
        ((exmi) exmhVar.instance).c = d;
        exmhVar.copyOnWrite();
        ((exmi) exmhVar.instance).d = currentSpan;
        exmhVar.copyOnWrite();
        exmi exmiVar = (exmi) exmhVar.instance;
        exjhVarA.getClass();
        exmiVar.e = exjhVarA;
        exmiVar.b |= 1;
        long micros = TimeUnit.MILLISECONDS.toMicros(scaleGestureDetector.getEventTime());
        exmhVar.copyOnWrite();
        ((exmi) exmhVar.instance).g = micros;
        exmaVar.copyOnWrite();
        exmb exmbVar = (exmb) exmaVar.instance;
        exmi exmiVar2 = (exmi) exmhVar.build();
        exmiVar2.getClass();
        exmbVar.c = exmiVar2;
        exmbVar.b = 2;
        exloVar.a((exmb) exmaVar.build());
    }

    private final void f(int i, MotionEvent motionEvent, float f, float f2) {
        if (i == 3) {
            this.b = 0.0f;
            this.c = 0.0f;
        }
        this.b -= f;
        this.c -= f2;
        exme exmeVar = (exme) exmf.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        exmeVar.copyOnWrite();
        ((exmf) exmeVar.instance).g = micros;
        exmeVar.copyOnWrite();
        ((exmf) exmeVar.instance).f = exmg.a(i);
        PointF pointF = new PointF(this.b, this.c);
        b(pointF);
        PointF pointF2 = new PointF(0.0f, 0.0f);
        pointF.x -= pointF2.x;
        pointF.y -= pointF2.y;
        exjh exjhVarC = c(pointF);
        exmeVar.copyOnWrite();
        exmf exmfVar = (exmf) exmeVar.instance;
        exjhVarC.getClass();
        exmfVar.e = exjhVarC;
        exmfVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        exmeVar.copyOnWrite();
        ((exmf) exmeVar.instance).c = pointerCount;
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            exjh exjhVarA = a(motionEvent.getX(i2), motionEvent.getY(i2));
            exmeVar.copyOnWrite();
            exmf exmfVar2 = (exmf) exmeVar.instance;
            exjhVarA.getClass();
            evtg evtgVar = exmfVar2.d;
            if (!evtgVar.c()) {
                exmfVar2.d = evsn.mutableCopy(evtgVar);
            }
            exmfVar2.d.add(exjhVarA);
        }
        exlo exloVar = this.i;
        exma exmaVar = (exma) exmb.a.createBuilder();
        exmaVar.copyOnWrite();
        exmb exmbVar = (exmb) exmaVar.instance;
        exmf exmfVar3 = (exmf) exmeVar.build();
        exmfVar3.getClass();
        exmbVar.c = exmfVar3;
        exmbVar.b = 7;
        exloVar.a((exmb) exmaVar.build());
        if (i == 5) {
            this.b = 0.0f;
            this.c = 0.0f;
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        exly exlyVar = (exly) exlz.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        exlyVar.copyOnWrite();
        ((exlz) exlyVar.instance).f = micros;
        exjh exjhVarA = a(motionEvent.getX(), motionEvent.getY());
        exlyVar.copyOnWrite();
        exlz exlzVar = (exlz) exlyVar.instance;
        exjhVarA.getClass();
        exlzVar.e = exjhVarA;
        exlzVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        exlyVar.copyOnWrite();
        ((exlz) exlyVar.instance).c = pointerCount;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            exjh exjhVarA2 = a(motionEvent.getX(i), motionEvent.getY(i));
            exlyVar.copyOnWrite();
            exlz exlzVar2 = (exlz) exlyVar.instance;
            exjhVarA2.getClass();
            evtg evtgVar = exlzVar2.d;
            if (!evtgVar.c()) {
                exlzVar2.d = evsn.mutableCopy(evtgVar);
            }
            exlzVar2.d.add(exjhVarA2);
        }
        exlo exloVar = this.i;
        exma exmaVar = (exma) exmb.a.createBuilder();
        exmaVar.copyOnWrite();
        exmb exmbVar = (exmb) exmaVar.instance;
        exlz exlzVar3 = (exlz) exlyVar.build();
        exlzVar3.getClass();
        exmbVar.c = exlzVar3;
        exmbVar.b = 5;
        exloVar.a((exmb) exmaVar.build());
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent != null) {
            float fAbs = Math.abs(f2 != 0.0f ? f / f2 : f);
            float fAbs2 = Math.abs(f != 0.0f ? f2 / f : f2);
            if (fAbs > fAbs2) {
                i = f < 0.0f ? 4 : 3;
            } else if (fAbs < fAbs2) {
                i = f2 < 0.0f ? 6 : 5;
            }
            exml exmlVar = (exml) exmm.a.createBuilder();
            long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent2.getEventTime());
            exmlVar.copyOnWrite();
            ((exmm) exmlVar.instance).g = micros;
            exmlVar.copyOnWrite();
            ((exmm) exmlVar.instance).c = i - 2;
            exjh exjhVarA = a(motionEvent.getX(), motionEvent.getY());
            exmlVar.copyOnWrite();
            exmm exmmVar = (exmm) exmlVar.instance;
            exjhVarA.getClass();
            exmmVar.f = exjhVarA;
            exmmVar.b |= 1;
            int pointerCount = motionEvent.getPointerCount();
            exmlVar.copyOnWrite();
            ((exmm) exmlVar.instance).d = pointerCount;
            for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                exjh exjhVarA2 = a(motionEvent.getX(i2), motionEvent.getY(i2));
                exmlVar.copyOnWrite();
                exmm exmmVar2 = (exmm) exmlVar.instance;
                exjhVarA2.getClass();
                evtg evtgVar = exmmVar2.e;
                if (!evtgVar.c()) {
                    exmmVar2.e = evsn.mutableCopy(evtgVar);
                }
                exmmVar2.e.add(exjhVarA2);
            }
            exlo exloVar = this.i;
            exma exmaVar = (exma) exmb.a.createBuilder();
            exmaVar.copyOnWrite();
            exmb exmbVar = (exmb) exmaVar.instance;
            exmm exmmVar3 = (exmm) exmlVar.build();
            exmmVar3.getClass();
            exmbVar.c = exmmVar3;
            exmbVar.b = 1;
            exloVar.a((exmb) exmaVar.build());
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        exll exllVar = this.f;
        exllVar.a = true;
        exllVar.b = motionEvent.getActionIndex();
        d(3, motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        e(4, scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        e(3, scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        e(5, scaleGestureDetector);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent == null) {
            return false;
        }
        exlm exlmVar = this.d;
        if (exlmVar.a) {
            i = 4;
        } else {
            exlmVar.a = true;
            i = 3;
        }
        f(i, motionEvent2, f, f2);
        exlmVar.b = motionEvent;
        exlmVar.c = motionEvent2;
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        exmn exmnVar = (exmn) exmo.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        exmnVar.copyOnWrite();
        ((exmo) exmnVar.instance).f = micros;
        exjh exjhVarA = a(motionEvent.getX(), motionEvent.getY());
        exmnVar.copyOnWrite();
        exmo exmoVar = (exmo) exmnVar.instance;
        exjhVarA.getClass();
        exmoVar.e = exjhVarA;
        exmoVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        exmnVar.copyOnWrite();
        ((exmo) exmnVar.instance).c = pointerCount;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            exjh exjhVarA2 = a(motionEvent.getX(i), motionEvent.getY(i));
            exmnVar.copyOnWrite();
            exmo exmoVar2 = (exmo) exmnVar.instance;
            exjhVarA2.getClass();
            evtg evtgVar = exmoVar2.d;
            if (!evtgVar.c()) {
                exmoVar2.d = evsn.mutableCopy(evtgVar);
            }
            exmoVar2.d.add(exjhVarA2);
        }
        exlo exloVar = this.i;
        exma exmaVar = (exma) exmb.a.createBuilder();
        exmaVar.copyOnWrite();
        exmb exmbVar = (exmb) exmaVar.instance;
        exmo exmoVar3 = (exmo) exmnVar.build();
        exmoVar3.getClass();
        exmbVar.c = exmoVar3;
        exmbVar.b = 4;
        exloVar.a((exmb) exmaVar.build());
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int width = view.getWidth();
        int height = view.getHeight();
        this.g = width;
        this.h = height;
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 3;
        if (actionMasked == 0) {
            i = 3;
        } else {
            if (actionMasked == 1) {
                exlm exlmVar = this.d;
                if (exlmVar.a && motionEvent.getActionIndex() == exlmVar.c.getActionIndex()) {
                    exlmVar.c = motionEvent;
                    f(5, exlmVar.c, 0.0f, 0.0f);
                    exlmVar.a = false;
                }
                exll exllVar = this.f;
                if (exllVar.a && motionEvent.getActionIndex() == exllVar.b) {
                    d(5, motionEvent);
                    exllVar.a = false;
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return false;
                    }
                }
                i = 3;
            } else {
                exll exllVar2 = this.f;
                if (exllVar2.a && motionEvent.getActionIndex() == exllVar2.b) {
                    d(4, motionEvent);
                }
                i = 4;
            }
            i = 5;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(pointerId);
        exln exlnVar = (exln) map.get(numValueOf);
        if (i == 5) {
            map.remove(numValueOf);
            i2 = i;
        } else if (exlnVar != null) {
            if (i == 4) {
                if (Math.abs(x - exlnVar.a) < 1.0f && Math.abs(y - exlnVar.b) < 1.0f) {
                    return true;
                }
                i2 = 4;
            }
            exlnVar.a = x;
            exlnVar.b = y;
        } else {
            if (i == 4) {
                return false;
            }
            exlnVar = new exln();
            exlnVar.a = motionEvent.getX(actionIndex);
            exlnVar.b = motionEvent.getY(actionIndex);
            map.put(numValueOf, exlnVar);
        }
        exmp exmpVar = (exmp) exmq.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        exmpVar.copyOnWrite();
        ((exmq) exmpVar.instance).h = micros;
        exmpVar.copyOnWrite();
        ((exmq) exmpVar.instance).c = pointerId;
        exmpVar.copyOnWrite();
        ((exmq) exmpVar.instance).d = i2 - 2;
        float pressure = motionEvent.getPressure(actionIndex);
        exmpVar.copyOnWrite();
        ((exmq) exmpVar.instance).g = pressure;
        exjh exjhVarA = a(x, y);
        exmpVar.copyOnWrite();
        exmq exmqVar = (exmq) exmpVar.instance;
        exjhVarA.getClass();
        exmqVar.e = exjhVarA;
        exmqVar.b |= 1;
        if (exlnVar != null) {
            exjh exjhVarA2 = a(exlnVar.a, exlnVar.b);
            exmpVar.copyOnWrite();
            exmq exmqVar2 = (exmq) exmpVar.instance;
            exjhVarA2.getClass();
            exmqVar2.f = exjhVarA2;
            exmqVar2.b |= 2;
        }
        this.i.b((exmq) exmpVar.build());
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
