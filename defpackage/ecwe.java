package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecwe extends fy {
    public final List a;
    public final ecpo b;
    private final Integer c;
    private ekgp d;

    public ecwe(fr frVar, expq expqVar, Integer num, boolean z, boolean z2, ecpo ecpoVar, int i) {
        super(frVar);
        ArrayList arrayList = new ArrayList(expqVar.g.size());
        for (exqd exqdVar : expqVar.g) {
            int iA = exqc.a(exqdVar.i);
            int i2 = (iA == 0 ? 1 : iA) - 2;
            if (i2 == 1) {
                arrayList.add(new ecuz(exqdVar));
            } else if (i2 == 2) {
                arrayList.add(new ecso(exqdVar));
            } else if (i2 == 3) {
                arrayList.add(new ecue(exqdVar));
            } else if (i2 == 4) {
                arrayList.add(new ectc(exqdVar));
            }
        }
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.c(fblk.b(ecrz.b))) {
            exoc exocVar = expqVar.d;
            arrayList.add(new ecwj(exocVar == null ? exoc.b : exocVar));
        } else if (ecpoVar == ecpo.CARD) {
            exoc exocVar2 = expqVar.d;
            arrayList.add(new ecwj(exocVar2 == null ? exoc.b : exocVar2));
        }
        this.a = arrayList;
        int i3 = 0;
        if (z && !arrayList.isEmpty()) {
            arrayList.remove(0);
            i--;
        }
        if (ecrz.a() && i > 0) {
            arrayList.subList(0, i).clear();
        }
        if (z2 && !arrayList.isEmpty()) {
            arrayList.subList(0, arrayList.size() - 1).clear();
        }
        ekgi ekgiVar = new ekgi();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i4 = ((ecvs) it.next()).b;
            if (i4 == 0) {
                throw null;
            }
            if (i4 != 5) {
                ekgiVar.i(Integer.valueOf(r9.a.e - 1), Integer.valueOf(i3));
                i3++;
            }
        }
        this.d = ekgiVar.c();
        if (this.a.isEmpty()) {
            throw new NullPointerException("Questions were missing!");
        }
        this.c = num;
        this.b = ecpoVar;
    }

    public static int m(ea eaVar) {
        Bundle bundle = eaVar.m;
        if (bundle != null) {
            return bundle.getInt("QuestionIndex", -1);
        }
        return -1;
    }

    @Override // defpackage.fy
    public final ea b(int i) {
        ea eaVarA = ((ecvs) this.a.get(i)).a(this.c, i);
        eaVarA.m.putInt("QuestionIndex", i);
        return eaVarA;
    }

    @Override // defpackage.pou
    public final int j() {
        return this.a.size();
    }

    public final int n(int i) {
        return ((Integer) this.d.get(Integer.valueOf(i))).intValue();
    }

    public final exqd o(int i) {
        return ((ecvs) this.a.get(i)).a;
    }
}
