package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lzn extends lzp {
    public volatile lzm a;
    private Executor j;
    private volatile lzm k;

    public lzn(Context context) {
        super(context);
    }

    public abstract Object a();

    protected Object b() {
        return a();
    }

    final void c(lzm lzmVar, Object obj) {
        e(obj);
        if (this.k == lzmVar) {
            if (this.h) {
                k();
            }
            SystemClock.uptimeMillis();
            this.k = null;
            d();
        }
    }

    final void d() {
        if (this.k != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.j == null) {
            this.j = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        lzm lzmVar = this.a;
        Executor executor = this.j;
        if (lzmVar.f == 1) {
            lzmVar.f = 2;
            executor.execute(lzmVar.c);
            return;
        }
        int i = lzmVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    @Override // defpackage.lzp
    protected final void f() {
        h();
        this.a = new lzm(this);
        d();
    }

    @Override // defpackage.lzp
    @Deprecated
    public final void g(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.b);
        printWriter.print(" mListener=");
        printWriter.println(this.i);
        if (this.d || this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.h);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            boolean z = this.a.a;
            printWriter.println(false);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            boolean z2 = this.k.a;
            printWriter.println(false);
        }
    }

    @Override // defpackage.lzp
    public final void h() {
        if (this.a != null) {
            if (!this.d) {
                k();
            }
            if (this.k != null) {
                boolean z = this.a.a;
            } else {
                boolean z2 = this.a.a;
                lzm lzmVar = this.a;
                lzmVar.d.set(true);
                if (lzmVar.c.cancel(false)) {
                    this.k = this.a;
                }
            }
            this.a = null;
        }
    }

    public void e(Object obj) {
    }
}
