package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class byz implements AutoCloseable {
    public final bnu d = bnu.a();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicReference f = new AtomicReference(null);
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicReference h = new AtomicReference(new lbz() { // from class: byv
        @Override // defpackage.lbz
        public final void accept(Object obj) {
        }
    });
    private final AtomicBoolean a = new AtomicBoolean(false);
    public final blj i = new blj(false);

    public static byz g(bxm bxmVar, long j) {
        bwv bwvVar = new bwv(bxmVar.b, bxmVar.e, bxmVar.d, bxmVar.f, j);
        ((byz) bwvVar).a.set(false);
        return bwvVar;
    }

    private final void l(lbz lbzVar, Uri uri) {
        if (lbzVar == null) {
            throw new AssertionError(a.h(this, "Recording ", " has already been finalized"));
        }
        this.d.b();
        lbzVar.accept(uri);
    }

    public abstract long a();

    public abstract bxk b();

    public abstract lbz c();

    @Override // java.lang.AutoCloseable
    public final void close() {
        h(Uri.EMPTY);
    }

    public abstract Executor d();

    public abstract boolean e();

    public abstract void f();

    protected final void finalize() throws Throwable {
        try {
            this.d.d();
            lbz lbzVar = (lbz) this.h.getAndSet(null);
            if (lbzVar != null) {
                l(lbzVar, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    final void h(Uri uri) {
        if (this.e.get()) {
            l((lbz) this.h.getAndSet(null), uri);
        }
    }

    final void i(cav cavVar) {
        j(cavVar, true);
    }

    final void j(final cav cavVar, boolean z) {
        String str;
        bxk bxkVar = cavVar.c;
        if (!Objects.equals(bxkVar, b())) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + bxkVar + ", Expected: " + b() + "]");
        }
        if (z) {
            boolean z2 = cavVar instanceof caq;
            String strConcat = "Sending VideoRecordEvent ".concat(String.valueOf(cavVar.getClass().getSimpleName()));
            if (z2) {
                caq caqVar = (caq) cavVar;
                if (caqVar.a()) {
                    switch (caqVar.a) {
                        case 0:
                            str = "ERROR_NONE";
                            break;
                        case 1:
                            str = "ERROR_UNKNOWN";
                            break;
                        case 2:
                            str = "ERROR_FILE_SIZE_LIMIT_REACHED";
                            break;
                        case 3:
                            str = "ERROR_INSUFFICIENT_STORAGE";
                            break;
                        case 4:
                            str = "ERROR_SOURCE_INACTIVE";
                            break;
                        case 5:
                            str = "ERROR_INVALID_OUTPUT_OPTIONS";
                            break;
                        case 6:
                            str = "ERROR_ENCODING_FAILED";
                            break;
                        case 7:
                            str = "ERROR_RECORDER_ERROR";
                            break;
                        case 8:
                            str = "ERROR_NO_VALID_DATA";
                            break;
                        case 9:
                            str = "ERROR_DURATION_LIMIT_REACHED";
                            break;
                        default:
                            str = "ERROR_RECORDING_GARBAGE_COLLECTED";
                            break;
                    }
                    strConcat = strConcat.concat(String.valueOf(String.format(" [error: %s]", str)));
                }
            }
            bbs.a("Recorder", strConcat);
        }
        if ((cavVar instanceof cat) || (cavVar instanceof cas)) {
            this.i.e(true);
        } else if ((cavVar instanceof car) || (cavVar instanceof caq)) {
            this.i.e(false);
        }
        if (d() == null || c() == null) {
            return;
        }
        try {
            d().execute(new Runnable() { // from class: byu
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c().accept(cavVar);
                }
            });
        } catch (RejectedExecutionException e) {
            bbs.d("Recorder", "The callback executor is invalid.", e);
        }
    }

    final boolean k() {
        return this.a.get();
    }
}
