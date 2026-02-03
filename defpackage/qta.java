package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qta extends qtl {
    public qta(List list) {
        float[] fArr;
        int length;
        float[] fArr2;
        int length2;
        for (int i = 0; i < list.size(); i++) {
            qxa qxaVar = (qxa) list.get(i);
            qtp qtpVar = (qtp) qxaVar.b;
            qtp qtpVar2 = (qtp) qxaVar.c;
            if (qtpVar != null && qtpVar2 != null && (length = (fArr = qtpVar.a).length) != (length2 = (fArr2 = qtpVar2.a).length)) {
                int i2 = length + length2;
                float[] fArr3 = new float[i2];
                System.arraycopy(fArr, 0, fArr3, 0, length);
                System.arraycopy(fArr2, 0, fArr3, length, length2);
                Arrays.sort(fArr3);
                float f = Float.NaN;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    float f2 = fArr3[i4];
                    if (f2 != f) {
                        fArr3[i3] = f2;
                        i3++;
                        f = fArr3[i4];
                    }
                }
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                qxaVar = new qxa(qtpVar.a(fArrCopyOfRange), qtpVar2.a(fArrCopyOfRange));
            }
            list.set(i, qxaVar);
        }
        super(list);
    }

    @Override // defpackage.qtk
    public final qpv a() {
        return new qqa(this.a);
    }
}
