package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qul {
    public final List a;
    public final qnm b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final qtj h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final qth p;
    public final qti q;
    public final qsz r;
    public final List s;
    public final boolean t;
    public final qtm u;
    public final qvg v;
    public final int w;
    public final int x;

    public qul(List list, qnm qnmVar, String str, long j, int i, long j2, String str2, List list2, qtj qtjVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, qth qthVar, qti qtiVar, List list3, int i5, qsz qszVar, boolean z, qtm qtmVar, qvg qvgVar) {
        this.a = list;
        this.b = qnmVar;
        this.c = str;
        this.d = j;
        this.w = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = qtjVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = qthVar;
        this.q = qtiVar;
        this.s = list3;
        this.x = i5;
        this.r = qszVar;
        this.t = z;
        this.u = qtmVar;
        this.v = qvgVar;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        qnm qnmVar = this.b;
        qul qulVarD = qnmVar.d(this.e);
        if (qulVarD != null) {
            sb.append("\t\tParents: ");
            sb.append(qulVarD.c);
            for (qul qulVarD2 = qnmVar.d(qulVarD.e); qulVarD2 != null; qulVarD2 = qnmVar.d(qulVarD2.e)) {
                sb.append("->");
                sb.append(qulVarD2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.g;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.i;
        if (i2 != 0 && (i = this.j) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.k)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
