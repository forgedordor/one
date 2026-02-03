package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;
import j$.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efvi {
    public final int a;
    final SparseArray b = new SparseArray();
    final List c = new ArrayList();
    final /* synthetic */ SpannedGridLayoutManager d;
    private final int[] e;
    private final wj f;

    public efvi(SpannedGridLayoutManager spannedGridLayoutManager, wj wjVar, int i) {
        this.d = spannedGridLayoutManager;
        this.e = new int[spannedGridLayoutManager.b.a];
        this.f = wjVar;
        this.a = i;
    }

    private final void g(int i, int i2) {
        List list = this.c;
        if (list.size() < i + 1) {
            list.add(Integer.valueOf(i2));
        }
    }

    private final void h() {
        efvj efvjVar;
        int[] iArr;
        int size = this.c.size();
        SparseArray sparseArray = this.b;
        int size2 = sparseArray.size();
        g(size, size2);
        int i = size2;
        int i2 = 0;
        while (i < this.a) {
            int iA = this.f.a(i);
            if (iA == -1) {
                int i3 = 0;
                while (true) {
                    SpannedGridLayoutManager spannedGridLayoutManager = this.d;
                    if (i3 >= spannedGridLayoutManager.as()) {
                        efvjVar = efvj.a;
                        break;
                    }
                    View viewAE = spannedGridLayoutManager.aE(i3);
                    if (i == SpannedGridLayoutManager.bu(viewAE)) {
                        efvf efvfVar = (efvf) viewAE.getLayoutParams();
                        efvjVar = new efvj(efvfVar.a, efvfVar.b);
                        break;
                    }
                    i3++;
                }
            } else {
                efvjVar = (efvj) Map.EL.getOrDefault(this.d.n.e, Integer.valueOf(iA), new efvj(2, 1));
            }
            SpannedGridLayoutManager spannedGridLayoutManager2 = this.d;
            int i4 = efvjVar.b;
            int i5 = spannedGridLayoutManager2.b.a;
            if (i4 > i5) {
                efvjVar.b = i5;
                i4 = i5;
            }
            if (i4 + i2 > i5) {
                size++;
                g(size, size2);
                i2 = 0;
            }
            while (true) {
                iArr = this.e;
                if (iArr[i2] <= size) {
                    break;
                }
                i2++;
                if (efvjVar.b + i2 > spannedGridLayoutManager2.b.a) {
                    size++;
                    g(size, size2);
                    i2 = 0;
                }
            }
            int i6 = efvjVar.c;
            sparseArray.put(i, new efve(size, i6, i2, efvjVar.b));
            int i7 = size + i6;
            for (int i8 = 0; i8 < efvjVar.b; i8++) {
                iArr[i2 + i8] = i7;
            }
            if (i6 > 1) {
                g(size + 1, size2);
            }
            i2 += efvjVar.b;
            i++;
            int i9 = iArr[0];
            for (int i10 = 1; i10 < spannedGridLayoutManager2.b.a; i10++) {
                if (i9 != iArr[i10]) {
                    break;
                }
            }
            return;
        }
    }

    private final void i(int i) {
        while (i >= this.c.size()) {
            SparseArray sparseArray = this.b;
            if (sparseArray.size() >= this.a) {
                return;
            } else {
                h();
            }
        }
    }

    public final int a(int i) {
        List list = this.c;
        if (i >= list.size()) {
            i(i);
        }
        if (list.isEmpty()) {
            return 0;
        }
        return ((Integer) list.get(i)).intValue();
    }

    public final int b(int i) {
        return (f(c(i)) ? a(r2) : this.a) - 1;
    }

    public final int c(int i) {
        int i2 = i + 1;
        int iA = a(i);
        while (f(i2) && a(i2) == iA) {
            i2++;
        }
        return i2;
    }

    public final int d(int i) {
        if (i < this.a) {
            return e(i).a;
        }
        return -1;
    }

    public final efve e(int i) {
        if (i >= this.a) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, "index: %d out of range.", Integer.valueOf(i)));
        }
        SparseArray sparseArray = this.b;
        if (i >= sparseArray.size()) {
            while (i >= sparseArray.size()) {
                h();
            }
        }
        return (efve) sparseArray.get(i);
    }

    public final boolean f(int i) {
        List list = this.c;
        if (i >= list.size()) {
            i(i);
        }
        return i >= 0 && i < list.size();
    }
}
