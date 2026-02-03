package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kog {
    Object a;
    kok b;
    public kop c = new kop();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        kop kopVar = this.c;
        if (kopVar != null) {
            kopVar.b(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        kok kokVar = this.b;
        boolean z = kokVar != null && kokVar.b.g(obj);
        if (z) {
            e();
        }
        return z;
    }

    public final boolean c(Throwable th) {
        this.d = true;
        kok kokVar = this.b;
        boolean z = kokVar != null && kokVar.a(th);
        if (z) {
            e();
        }
        return z;
    }

    public final void d() {
        this.d = true;
        kok kokVar = this.b;
        if (kokVar == null || !kokVar.b.cancel(true)) {
            return;
        }
        e();
    }

    protected final void finalize() {
        kop kopVar;
        kok kokVar = this.b;
        if (kokVar != null && !kokVar.isDone()) {
            Object obj = this.a;
            Objects.toString(obj);
            kokVar.a(new koh("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (this.d || (kopVar = this.c) == null) {
            return;
        }
        kopVar.g(null);
    }
}
