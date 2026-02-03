package defpackage;

import android.content.res.Configuration;
import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daey {
    private final int a;
    private final daex[] b;

    public daey(int i, daex... daexVarArr) {
        this.a = i;
        this.b = daexVarArr;
    }

    public static boolean b(Configuration configuration) {
        return configuration.orientation == 2;
    }

    public final void a(Configuration configuration) {
        cvja cvjaVar;
        daew daewVar;
        int iF;
        int i;
        int i2;
        if (configuration != null) {
            daex[] daexVarArr = this.b;
            boolean zB = b(configuration);
            for (int i3 = 0; i3 < 2; i3++) {
                daex daexVar = daexVarArr[i3];
                vo voVar = daexVar.a;
                GridLayoutManager gridLayoutManager = daexVar.b;
                if (voVar instanceof cvja) {
                    cvja cvjaVar2 = (cvja) voVar;
                    cvjaVar = cvjaVar2;
                    voVar = cvjaVar2.a;
                } else {
                    cvjaVar = null;
                }
                if ((voVar instanceof daew) && gridLayoutManager.b != (iF = (daewVar = (daew) voVar).F(zB))) {
                    gridLayoutManager.r(iF);
                    if (daewVar.d != zB) {
                        daewVar.d = zB;
                        daewVar.p();
                    }
                    if (cvjaVar != null && (i = this.a) > 0 && (i2 = i * iF) != cvjaVar.d) {
                        cvjaVar.d = i2;
                        cvjaVar.a.p();
                    }
                }
            }
        }
    }
}
