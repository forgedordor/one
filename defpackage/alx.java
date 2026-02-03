package defpackage;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alx extends bhr {
    final Set a = new HashSet();
    final Map b = new ArrayMap();

    @Override // defpackage.bhr
    public final void a(final int i) {
        for (final bhr bhrVar : this.a) {
            try {
                ((Executor) this.b.get(bhrVar)).execute(new Runnable() { // from class: alw
                    @Override // java.lang.Runnable
                    public final void run() {
                        bhrVar.a(i);
                    }
                });
            } catch (RejectedExecutionException e) {
                bbs.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
            }
        }
    }

    @Override // defpackage.bhr
    public final void b(final int i, final bib bibVar) {
        for (final bhr bhrVar : this.a) {
            try {
                ((Executor) this.b.get(bhrVar)).execute(new Runnable() { // from class: alv
                    @Override // java.lang.Runnable
                    public final void run() {
                        bhrVar.b(i, bibVar);
                    }
                });
            } catch (RejectedExecutionException e) {
                bbs.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
            }
        }
    }

    @Override // defpackage.bhr
    public final void c(final int i, final bhv bhvVar) {
        for (final bhr bhrVar : this.a) {
            try {
                ((Executor) this.b.get(bhrVar)).execute(new Runnable() { // from class: alu
                    @Override // java.lang.Runnable
                    public final void run() {
                        bhrVar.c(i, bhvVar);
                    }
                });
            } catch (RejectedExecutionException e) {
                bbs.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
            }
        }
    }
}
