package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqa {
    private int a = -1;

    public final int a(ekgp ekgpVar, int i, int i2, exqd exqdVar) {
        if ((exqdVar.c == 6 ? (exqi) exqdVar.d : exqi.a).g.size() != 0) {
            Iterator<E> it = (exqdVar.c == 6 ? (exqi) exqdVar.d : exqi.a).g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                exqf exqfVar = (exqf) it.next();
                Iterator<E> it2 = exqfVar.b.iterator();
                while (it2.hasNext()) {
                    if (((Integer) it2.next()).intValue() == i2) {
                        exno exnoVar = exqfVar.c;
                        if (exnoVar == null) {
                            exnoVar = exno.a;
                        }
                        int iA = exnn.a(exnoVar.b);
                        if (iA == 0) {
                            iA = 1;
                        }
                        int i3 = iA - 2;
                        if (i3 == 2) {
                            exno exnoVar2 = exqfVar.c;
                            if (exnoVar2 == null) {
                                exnoVar2 = exno.a;
                            }
                            if (ekgpVar.containsKey(exnoVar2.c)) {
                                exno exnoVar3 = exqfVar.c;
                                if (exnoVar3 == null) {
                                    exnoVar3 = exno.a;
                                }
                                this.a = ((Integer) ekgpVar.get(exnoVar3.c)).intValue();
                            }
                        } else if (i3 == 3) {
                            this.a = i + 1;
                        }
                    }
                }
            }
        }
        return this.a;
    }
}
