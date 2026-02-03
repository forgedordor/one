package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uh {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(wj wjVar) {
        List list = this.l;
        if (list == null) {
            View viewC = wjVar.c(this.d);
            this.d += this.e;
            return viewC;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((wv) this.l.get(i)).a;
            wc wcVar = (wc) view.getLayoutParams();
            if (!wcVar.c() && this.d == wcVar.a()) {
                c(view);
                return view;
            }
        }
        return null;
    }

    public final void b() {
        c(null);
    }

    public final void c(View view) {
        int iA;
        int size = this.l.size();
        int i = 0;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        View view2 = null;
        while (true) {
            if (i >= size) {
                break;
            }
            View view3 = ((wv) this.l.get(i)).a;
            wc wcVar = (wc) view3.getLayoutParams();
            if (view3 != view && !wcVar.c() && (iA = (wcVar.a() - this.d) * this.e) >= 0 && iA < i2) {
                if (iA == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i2 = iA;
                }
            }
            i++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((wc) view2.getLayoutParams()).a();
        }
    }

    public final boolean d(ws wsVar) {
        int i = this.d;
        return i >= 0 && i < wsVar.a();
    }
}
