package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcjn extends dcjf {
    private boolean b;
    private ArrayList c;

    protected dcjn(DataHolder dataHolder) {
        super(dataHolder);
        this.b = false;
    }

    private final void a() {
        synchronized (this) {
            if (!this.b) {
                DataHolder dataHolder = this.a;
                dclh.m(dataHolder);
                int i = dataHolder.i;
                ArrayList arrayList = new ArrayList();
                this.c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    String strG = g();
                    String strC = dataHolder.c(strG, 0, dataHolder.b(0));
                    for (int i2 = 1; i2 < i; i2++) {
                        int iB = dataHolder.b(i2);
                        String strC2 = dataHolder.c(strG, i2, iB);
                        if (strC2 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + strG + ", at row: " + i2 + ", for window: " + iB);
                        }
                        if (!strC2.equals(strC)) {
                            this.c.add(Integer.valueOf(i2));
                            strC = strC2;
                        }
                    }
                }
                this.b = true;
            }
        }
    }

    @Override // defpackage.dcjf, defpackage.dcjh
    public final int c() {
        a();
        return this.c.size();
    }

    @Override // defpackage.dcjh
    public final Object d(int i) {
        int iIntValue;
        int iIntValue2;
        a();
        int iE = e(i);
        int i2 = 0;
        if (i >= 0 && i != this.c.size()) {
            if (i == this.c.size() - 1) {
                DataHolder dataHolder = this.a;
                dclh.m(dataHolder);
                iIntValue = dataHolder.i;
                iIntValue2 = ((Integer) this.c.get(i)).intValue();
            } else {
                iIntValue = ((Integer) this.c.get(i + 1)).intValue();
                iIntValue2 = ((Integer) this.c.get(i)).intValue();
            }
            i2 = iIntValue - iIntValue2;
            if (i2 == 1) {
                int iE2 = e(i);
                DataHolder dataHolder2 = this.a;
                dclh.m(dataHolder2);
                dataHolder2.b(iE2);
                i2 = 1;
            }
        }
        return f(iE, i2);
    }

    final int e(int i) {
        if (i < 0 || i >= this.c.size()) {
            throw new IllegalArgumentException(a.e(i, "Position ", " is out of bounds for this buffer"));
        }
        return ((Integer) this.c.get(i)).intValue();
    }

    protected abstract Object f(int i, int i2);

    protected abstract String g();
}
