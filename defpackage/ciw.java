package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ciw extends OrientationEventListener {
    final /* synthetic */ ciz a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciw(ciz cizVar, Context context) {
        super(context);
        this.a = cizVar;
        this.b = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ArrayList arrayList;
        if (i == -1) {
            return;
        }
        final int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
        if (this.b != i2) {
            this.b = i2;
            ciz cizVar = this.a;
            synchronized (cizVar.a) {
                arrayList = new ArrayList(cizVar.c.values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                final ciy ciyVar = (ciy) arrayList.get(i3);
                ciyVar.a.execute(new Runnable() { // from class: cix
                    @Override // java.lang.Runnable
                    public final void run() {
                        ciy ciyVar2 = ciyVar;
                        if (ciyVar2.b.get()) {
                            int i4 = i2;
                            chu chuVar = ciyVar2.c.a;
                            baj bajVar = chuVar.g;
                            if (bajVar.V(i4)) {
                                bajVar.m();
                            }
                            bbf bbfVar = chuVar.d;
                            int iC = bbfVar.C();
                            if (bbfVar.V(i4) && bbfVar.e != null) {
                                bbfVar.e = bsc.b(Math.abs(bnq.b(i4) - bnq.b(iC)), bbfVar.e);
                            }
                            cad cadVar = chuVar.h;
                            if (cadVar.V(i4)) {
                                cadVar.m();
                            }
                        }
                    }
                });
            }
        }
    }
}
