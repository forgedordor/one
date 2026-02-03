package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbc implements SensorEventListener {
    public static final cqce a = cqce.g("Bugle", "BugleAcceleratorSensorListener");
    public double b;
    public long c;
    public int d;
    public double e;
    public long f;
    public final Sensor g;
    public final SensorManager h;
    public ListenableFuture j;
    public final eosc k;
    private final cogw l;
    final Set i = new HashSet();
    private final float[] m = new float[3];
    private final abbg n = abbg.a();
    private final ArrayDeque o = new ArrayDeque();
    private long p = 0;

    public abbc(Context context, cogw cogwVar, eosc eoscVar) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.h = sensorManager;
        this.g = sensorManager.getDefaultSensor(1);
        this.l = cogwVar;
        this.k = eoscVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.m;
        float f = (fArr2[0] * 0.8f) + (fArr[0] * 0.19999999f);
        fArr2[0] = f;
        float f2 = (fArr2[1] * 0.8f) + (fArr[1] * 0.19999999f);
        fArr2[1] = f2;
        float f3 = (fArr2[2] * 0.8f) + (fArr[2] * 0.19999999f);
        fArr2[2] = f3;
        fArr[0] = fArr[0] - f;
        fArr[1] = fArr[1] - f2;
        fArr[2] = fArr[2] - f3;
        abbg abbgVar = this.n;
        abbgVar.b(fArr);
        if (abbgVar.b > this.b) {
            cogw cogwVar = this.l;
            long jA = cogwVar.a();
            abbh abbhVar = new abbh(abbg.a(), abbg.a());
            abbhVar.a.b(fArr);
            abbhVar.b.b(fArr2);
            abbhVar.c = jA;
            ArrayDeque arrayDeque = this.o;
            arrayDeque.add(abbhVar);
            long j = jA - this.c;
            while (!arrayDeque.isEmpty() && ((abbh) arrayDeque.getFirst()).c < j) {
                arrayDeque.removeFirst();
            }
            if (arrayDeque.size() >= this.d) {
                abbh abbhVar2 = (abbh) arrayDeque.getFirst();
                abbh abbhVar3 = (abbh) arrayDeque.getLast();
                abbg abbgVar2 = abbhVar2.b;
                abbg abbgVar3 = abbhVar3.b;
                float[] fArr3 = abbgVar2.a;
                float[] fArr4 = abbgVar3.a;
                boolean z = ((double) (((fArr3[0] * fArr4[0]) + (fArr3[1] * fArr4[1])) + (fArr3[2] * fArr4[2]))) / (abbgVar2.b * abbgVar3.b) < this.e;
                arrayDeque.clear();
                if (z) {
                    return;
                }
                long jA2 = cogwVar.a();
                if (this.p + this.f <= jA2) {
                    a.p("Shake detected");
                    Iterator it = this.i.iterator();
                    while (it.hasNext()) {
                        ((abbb) it.next()).g();
                    }
                    this.p = jA2;
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
