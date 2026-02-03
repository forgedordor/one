package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awq implements awr {
    private final List a;
    private final CameraCaptureSession.StateCallback b;
    private final Executor c;
    private final int d;
    private awf e = null;
    private CaptureRequest f = null;

    public awq(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.d = i;
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = stateCallback;
        this.c = executor;
    }

    @Override // defpackage.awr
    public final int a() {
        return this.d;
    }

    @Override // defpackage.awr
    public final CameraCaptureSession.StateCallback b() {
        return this.b;
    }

    @Override // defpackage.awr
    public final awf c() {
        return this.e;
    }

    @Override // defpackage.awr
    public final Object d() {
        return null;
    }

    @Override // defpackage.awr
    public final List e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof awq) {
            awq awqVar = (awq) obj;
            if (Objects.equals(this.e, awqVar.e) && this.d == awqVar.d) {
                List list = this.a;
                int size = list.size();
                List list2 = awqVar.a;
                if (size == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        if (!((awg) list.get(i)).equals(list2.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.awr
    public final Executor f() {
        return this.c;
    }

    @Override // defpackage.awr
    public final void g(awf awfVar) {
        if (this.d == 1) {
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }
        this.e = awfVar;
    }

    @Override // defpackage.awr
    public final void h(CaptureRequest captureRequest) {
        this.f = captureRequest;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        awf awfVar = this.e;
        int iHashCode2 = (awfVar == null ? 0 : awfVar.hashCode()) ^ ((iHashCode << 5) - iHashCode);
        return this.d ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
