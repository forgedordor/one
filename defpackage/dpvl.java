package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvl extends wg {
    private final dpvv a;
    private final ekea b = new ekea(5);

    public dpvl(dpvv dpvvVar) {
        this.a = dpvvVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.b.add(new dpvk(System.currentTimeMillis(), i2));
        this.a.b(i2);
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
        float f;
        ekea ekeaVar = this.b;
        ekea ekeaVar2 = ekeaVar.size() > 1 ? ekeaVar : null;
        if (ekeaVar2 != null) {
            int i2 = 0;
            Iterator it = fcva.aH(ekeaVar2, 1, false, new fdap() { // from class: dpvj
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    List list = (List) obj;
                    list.getClass();
                    fcva.N(list).getClass();
                    Object objS = fcva.S(list);
                    objS.getClass();
                    dpvk dpvkVar = (dpvk) objS;
                    return Float.valueOf(dpvkVar.b / ((dpvkVar.a - ((dpvk) r0).a) / 1000.0f));
                }
            }).iterator();
            double dFloatValue = 0.0d;
            while (it.hasNext()) {
                dFloatValue += ((Number) it.next()).floatValue();
                i2++;
                if (i2 < 0) {
                    fcva.l();
                }
            }
            f = (float) (i2 == 0 ? Double.NaN : dFloatValue / i2);
        } else {
            f = 0.0f;
        }
        this.a.a(i, f);
        if (i == 0) {
            ekeaVar.clear();
        }
    }
}
