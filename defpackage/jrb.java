package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrb implements ScrollCaptureCallback {
    public final jsl a;
    public final jrg b;
    public final jrk c;
    private final kjd d;
    private final View e;
    private final fdjx f;

    public jrb(jsl jslVar, kjd kjdVar, fdjx fdjxVar, jrk jrkVar, View view) {
        this.a = jslVar;
        this.d = kjdVar;
        this.c = jrkVar;
        this.e = view;
        this.f = fdjy.d(fdjxVar, jre.a);
        this.b = new jrg(kjdVar.a(), new jra(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r11, defpackage.kjd r12, defpackage.fcxy r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrb.a(android.view.ScrollCaptureSession, kjd, fcxy):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        fdil.d(this.f, fdmk.a, null, new jqw(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final fdlr fdlrVarD = fdil.d(this.f, null, null, new jqx(this, scrollCaptureSession, rect, consumer, null), 3);
        fdlrVarD.hK(new jrd(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: jrc
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                fdlrVarD.t(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.z(ikh.b(this.d));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.b.b = 0.0f;
        this.c.a(true);
        runnable.run();
    }
}
