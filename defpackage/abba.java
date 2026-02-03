package defpackage;

import android.hardware.Sensor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abba implements eora {
    final /* synthetic */ abbc a;

    public abba(abbc abbcVar) {
        this.a = abbcVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        abbc abbcVar = this.a;
        Sensor sensor = abbcVar.g;
        if (sensor != null) {
            abbcVar.h.registerListener(abbcVar, sensor, 2);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        abbc.a.r("Fail to get phenotype flag config");
    }
}
