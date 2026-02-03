package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefc extends lfs {
    private final View a;
    private int d;
    private int e;
    private final int[] f;

    public eefc(View view) {
        super(0);
        this.f = new int[2];
        this.a = view;
    }

    @Override // defpackage.lfs
    public final lfr b(lgb lgbVar, lfr lfrVar) {
        View view = this.a;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return lfrVar;
    }

    @Override // defpackage.lfs
    public final lgt c(lgt lgtVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((lgb) it.next()).b() & 8) != 0) {
                this.a.setTranslationY(eecd.b(this.e, 0, r0.a()));
                break;
            }
        }
        return lgtVar;
    }

    @Override // defpackage.lfs
    public final void d(lgb lgbVar) {
        this.a.setTranslationY(0.0f);
    }

    @Override // defpackage.lfs
    public final void e() {
        View view = this.a;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }
}
