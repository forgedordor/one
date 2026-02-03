package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecoh implements ecoc {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.ecoc
    public final esxc a() {
        eswt eswtVar = (eswt) esww.a.createBuilder();
        for (int i = 0; i < this.b; i++) {
            eswu eswuVar = (eswu) eswv.a.createBuilder();
            double d = this.a[i];
            eswuVar.copyOnWrite();
            eswv eswvVar = (eswv) eswuVar.instance;
            eswvVar.b |= 1;
            eswvVar.c = d;
            eswuVar.copyOnWrite();
            eswv eswvVar2 = (eswv) eswuVar.instance;
            eswvVar2.b |= 2;
            eswvVar2.d = 1L;
            eswtVar.copyOnWrite();
            esww eswwVar = (esww) eswtVar.instance;
            eswv eswvVar3 = (eswv) eswuVar.build();
            eswvVar3.getClass();
            evtg evtgVar = eswwVar.b;
            if (!evtgVar.c()) {
                eswwVar.b = evsn.mutableCopy(evtgVar);
            }
            eswwVar.b.add(eswvVar3);
        }
        esxb esxbVar = (esxb) esxc.a.createBuilder();
        esxbVar.copyOnWrite();
        esxc esxcVar = (esxc) esxbVar.instance;
        esww eswwVar2 = (esww) eswtVar.build();
        eswwVar2.getClass();
        esxcVar.c = eswwVar2;
        esxcVar.b = 3;
        return (esxc) esxbVar.build();
    }

    @Override // defpackage.ecoc
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = 2147483639;
                if (i > 2147483639) {
                    i2 = Alert.DURATION_SHOW_INDEFINITELY;
                }
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
