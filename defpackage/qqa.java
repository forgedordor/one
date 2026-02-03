package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqa extends qqc {
    private final qtp e;

    public qqa(List list) {
        super(list);
        qtp qtpVar = (qtp) ((qxa) list.get(0)).b;
        int length = qtpVar != null ? qtpVar.b.length : 0;
        this.e = new qtp(new float[length], new int[length]);
    }

    @Override // defpackage.qpv
    public final /* bridge */ /* synthetic */ Object f(qxa qxaVar, float f) {
        qtp qtpVar = (qtp) qxaVar.b;
        qtp qtpVar2 = (qtp) qxaVar.c;
        int[] iArr = qtpVar.b;
        int length = iArr.length;
        int[] iArr2 = qtpVar2.b;
        int length2 = iArr2.length;
        if (length != length2) {
            throw new IllegalArgumentException(a.z(length2, length, "Cannot interpolate between gradients. Lengths vary (", " vs ", ")"));
        }
        for (int i = 0; i < iArr.length; i++) {
            qtp qtpVar3 = this.e;
            float f2 = qtpVar.a[i];
            float f3 = qtpVar2.a[i];
            PointF pointF = qwu.a;
            qtpVar3.a[i] = f2 + ((f3 - f2) * f);
            qtpVar3.b[i] = qwq.a(f, iArr[i], iArr2[i]);
        }
        return this.e;
    }
}
