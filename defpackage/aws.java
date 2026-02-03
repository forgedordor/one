package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aws {
    public final awr a;

    public aws(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new awq(i, list, executor, stateCallback);
        } else {
            this.a = new awp(i, list, executor, stateCallback);
        }
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(aky$$ExternalSyntheticApiModelOutline0.m(((awg) it.next()).a.b()));
        }
        return arrayList;
    }

    public final CameraCaptureSession.StateCallback a() {
        return this.a.b();
    }

    public final List b() {
        return this.a.e();
    }

    public final Executor d() {
        return this.a.f();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aws) {
            return this.a.equals(((aws) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
