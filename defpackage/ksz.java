package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksz {
    static int a;
    final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public ksz(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(kqe kqeVar, int i) {
        int iO;
        int iO2;
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            return 0;
        }
        ksa ksaVar = (ksa) ((krz) arrayList.get(0)).ae;
        kqeVar.k();
        ksaVar.a(kqeVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((krz) arrayList.get(i2)).a(kqeVar, false);
        }
        if (i == 0 && ksaVar.i > 0) {
            krw.a(ksaVar, kqeVar, arrayList, 0);
        }
        if (i == 1 && ksaVar.j > 0) {
            krw.a(ksaVar, kqeVar, arrayList, 1);
        }
        try {
            kqeVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new ksy((krz) arrayList.get(i3)));
        }
        if (i == 0) {
            iO = kqe.o(ksaVar.T);
            iO2 = kqe.o(ksaVar.V);
            kqeVar.k();
        } else {
            iO = kqe.o(ksaVar.U);
            iO2 = kqe.o(ksaVar.W);
            kqeVar.k();
        }
        return iO2 - iO;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                ksz kszVar = (ksz) arrayList.get(i);
                if (this.f == kszVar.c) {
                    c(this.d, kszVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, ksz kszVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            krz krzVar = (krz) arrayList.get(i2);
            kszVar.d(krzVar);
            if (i == 0) {
                krzVar.ay = kszVar.c;
            } else {
                krzVar.az = kszVar.c;
            }
        }
        this.f = kszVar.c;
    }

    public final boolean d(krz krzVar) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(krzVar)) {
            return false;
        }
        arrayList.add(krzVar);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both");
        sb.append(" [");
        sb.append(this.c);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            string = string + " " + ((krz) arrayList.get(i2)).as;
        }
        return string.concat(" >");
    }
}
