package defpackage;

import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class can {
    public final Executor a;
    public final Executor b;
    public cef c = null;
    public Surface d = null;
    public bdp e = null;
    public Executor f = null;
    public cee g = null;
    public int l = 1;
    public ListenableFuture h = new bql(new IllegalStateException("Cannot close the encoder before configuring."));
    public kog i = null;
    public ListenableFuture j = new bql(new IllegalStateException("Cannot close the encoder before configuring."));
    public kog k = null;

    public can(Executor executor, Executor executor2) {
        this.a = executor2;
        this.b = executor;
    }

    public final void a() {
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            b();
            return;
        }
        if (i2 == 2 || i2 == 3) {
            bbs.a("VideoEncoderSession", "closeInternal in " + ((Object) cam.a(this.l)) + " state");
            this.l = 3;
            return;
        }
        if (i2 == 4) {
            bbs.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + ((Object) cam.a(this.l)) + " is not handled");
    }

    final void b() {
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            this.l = 5;
            return;
        }
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("State " + ((Object) cam.a(this.l)) + " is not handled");
            }
            bbs.a("VideoEncoderSession", "terminateNow in " + ((Object) cam.a(this.l)) + ", No-op");
            return;
        }
        this.l = 5;
        this.k.b(this.c);
        this.e = null;
        if (this.c == null) {
            bbs.f("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.i.b(null);
            return;
        }
        cef cefVar = this.c;
        Objects.toString(cefVar);
        bbs.a("VideoEncoderSession", "VideoEncoder is releasing: ".concat(String.valueOf(cefVar)));
        this.c.b();
        ((cgh) this.c).i.b(new Runnable() { // from class: caf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i.b(null);
            }
        }, this.b);
        this.c = null;
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + j$.util.Objects.toString(this.e, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
