package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awp implements awr {
    private final SessionConfiguration a;
    private final List b;

    public awp(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        awg awgVar;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, aws.c(list), executor, stateCallback);
        this.a = sessionConfiguration;
        List outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList = new ArrayList(outputConfigurations.size());
        Iterator it = outputConfigurations.iterator();
        while (it.hasNext()) {
            OutputConfiguration outputConfigurationM = aky$$ExternalSyntheticApiModelOutline0.m(it.next());
            if (outputConfigurationM == null) {
                awgVar = null;
            } else {
                awgVar = new awg(Build.VERSION.SDK_INT >= 33 ? new awn(outputConfigurationM) : Build.VERSION.SDK_INT >= 28 ? new awm(new awl(outputConfigurationM)) : new awk(new awj(outputConfigurationM)));
            }
            arrayList.add(awgVar);
        }
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // defpackage.awr
    public final int a() {
        return this.a.getSessionType();
    }

    @Override // defpackage.awr
    public final CameraCaptureSession.StateCallback b() {
        return this.a.getStateCallback();
    }

    @Override // defpackage.awr
    public final awf c() {
        return awf.a(this.a.getInputConfiguration());
    }

    @Override // defpackage.awr
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.awr
    public final List e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awp) {
            return Objects.equals(this.a, ((awp) obj).a);
        }
        return false;
    }

    @Override // defpackage.awr
    public final Executor f() {
        return this.a.getExecutor();
    }

    @Override // defpackage.awr
    public final void g(awf awfVar) {
        this.a.setInputConfiguration((InputConfiguration) awfVar.b());
    }

    @Override // defpackage.awr
    public final void h(CaptureRequest captureRequest) {
        this.a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
