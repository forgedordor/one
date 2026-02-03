package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emq implements View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback, eqz, erc {
    public static long a;
    private final View b;
    private boolean d;
    private boolean g;
    private boolean h;
    private long i;
    private final PriorityQueue c = new PriorityQueue(11, new Comparator() { // from class: emo
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = ((erd) obj2).a;
            int i2 = ((erd) obj).a;
            long j = emq.a;
            return fdbq.a(i, i2);
        }
    });
    private final Choreographer e = Choreographer.getInstance();
    private final emp f = new emp();

    public emq(View view) {
        this.b = view;
        if (a == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            a = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    private final void e() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.post(this);
    }

    private final boolean f() {
        emp empVar = this.f;
        long jA = empVar.a();
        kjv.a("compose:lazy:prefetch:available_time_nanos", jA);
        if (jA <= 0) {
            return true;
        }
        PriorityQueue priorityQueue = this.c;
        Object objPeek = priorityQueue.peek();
        objPeek.getClass();
        if (((erd) objPeek).b.e(empVar)) {
            return true;
        }
        priorityQueue.poll();
        return false;
    }

    @Override // defpackage.erc
    public final void a(eqy eqyVar) {
        this.c.add(new erd(1, eqyVar));
        e();
    }

    @Override // defpackage.erc
    public final void b(eqy eqyVar) {
        this.c.add(new erd(0, eqyVar));
        e();
    }

    @Override // defpackage.eqz
    public final /* synthetic */ void c(eqy eqyVar) {
        a(eqyVar);
    }

    @Override // defpackage.erc
    public final boolean d() {
        return this.g;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.h) {
            this.i = j;
            this.b.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.h = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.b.removeCallbacks(this);
        this.e.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.c;
        if (!priorityQueue.isEmpty() && this.d && this.h) {
            View view = this.b;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                long jNanoTime = System.nanoTime();
                long j = a;
                this.g = jNanoTime > (j + j) + nanos;
                this.f.a = Math.max(this.i, nanos) + a;
                boolean zF = false;
                while (true) {
                    if (!priorityQueue.isEmpty()) {
                        if (zF) {
                            break;
                        }
                        if (this.g) {
                            Trace.beginSection("compose:lazy:prefetch:idle_frame");
                            try {
                                zF = f();
                            } finally {
                                Trace.endSection();
                            }
                        } else {
                            zF = f();
                        }
                    } else if (!zF) {
                        this.d = false;
                    }
                }
                this.e.postFrameCallback(this);
                kjv.a("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.d = false;
    }
}
