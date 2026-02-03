package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axn {
    public final List a = DesugarCollections.synchronizedList(new ArrayList());
    private final boolean b;

    public axn(boolean z) {
        this.b = z;
    }

    public final CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.b) {
            return captureCallback;
        }
        final axm axmVar = new axm();
        final ListenableFuture listenableFuture = axmVar.a;
        this.a.add(listenableFuture);
        Log.d("RequestMonitor", "RequestListener " + axmVar + " monitoring " + this);
        listenableFuture.b(new Runnable() { // from class: axj
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder("RequestListener ");
                sb.append(axmVar);
                sb.append(" done ");
                axn axnVar = this.a;
                sb.append(axnVar);
                Log.d("RequestMonitor", sb.toString());
                axnVar.a.remove(listenableFuture);
            }
        }, bpc.a());
        return new ano(Arrays.asList(axmVar, captureCallback));
    }

    public final ListenableFuture b() {
        List list = this.a;
        return list.isEmpty() ? bqk.b(null) : bqk.d(bqk.f(bqk.e(new ArrayList(list)), new akv() { // from class: axk
            @Override // defpackage.akv
            public final Object a(Object obj) {
                return null;
            }
        }, bpc.a()));
    }

    public final void c() {
        LinkedList linkedList = new LinkedList(this.a);
        while (!linkedList.isEmpty()) {
            ListenableFuture listenableFuture = (ListenableFuture) linkedList.poll();
            listenableFuture.getClass();
            listenableFuture.cancel(true);
        }
    }
}
