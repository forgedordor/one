package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbsd implements fbsf {
    final int a;
    final fbsf[] b;
    private final int c;

    private fbsd(int i, fbsf[] fbsfVarArr, int i2) {
        this.a = i;
        this.b = fbsfVarArr;
        this.c = i2;
    }

    static fbsf d(fbsf fbsfVar, int i, fbsf fbsfVar2, int i2, int i3) {
        int iF = f(i, i3);
        int iF2 = f(i2, i3);
        if (iF == iF2) {
            fbsf fbsfVarD = d(fbsfVar, i, fbsfVar2, i2, i3 + 5);
            return new fbsd(iF, new fbsf[]{fbsfVarD}, ((fbsd) fbsfVarD).c);
        }
        int iG = g(i, i3);
        int iG2 = g(i2, i3);
        fbsf fbsfVar3 = iG > iG2 ? fbsfVar : fbsfVar2;
        if (iG > iG2) {
            fbsfVar = fbsfVar2;
        }
        return new fbsd(iF | iF2, new fbsf[]{fbsfVar, fbsfVar3}, fbsfVar.a() + fbsfVar3.a());
    }

    private final int e(int i) {
        return Integer.bitCount((i - 1) & this.a);
    }

    private static int f(int i, int i2) {
        return 1 << g(i, i2);
    }

    private static int g(int i, int i2) {
        return (i >>> i2) & 31;
    }

    @Override // defpackage.fbsf
    public final int a() {
        return this.c;
    }

    @Override // defpackage.fbsf
    public final fbsf b(Object obj, Object obj2, int i, int i2) {
        int i3 = this.a;
        int iF = f(i, i2);
        int iE = e(iF);
        if ((i3 & iF) != 0) {
            fbsf[] fbsfVarArr = this.b;
            fbsf[] fbsfVarArr2 = (fbsf[]) Arrays.copyOf(fbsfVarArr, fbsfVarArr.length);
            fbsf fbsfVarB = fbsfVarArr[iE].b(obj, obj2, i, i2 + 5);
            fbsfVarArr2[iE] = fbsfVarB;
            return new fbsd(i3, fbsfVarArr2, (this.c + fbsfVarB.a()) - fbsfVarArr[iE].a());
        }
        int i4 = i3 | iF;
        fbsf[] fbsfVarArr3 = this.b;
        int length = fbsfVarArr3.length;
        fbsf[] fbsfVarArr4 = new fbsf[length + 1];
        System.arraycopy(fbsfVarArr3, 0, fbsfVarArr4, 0, iE);
        fbsfVarArr4[iE] = new fbse(obj, obj2);
        System.arraycopy(fbsfVarArr3, iE, fbsfVarArr4, iE + 1, length - iE);
        return new fbsd(i4, fbsfVarArr4, this.c + 1);
    }

    @Override // defpackage.fbsf
    public final Object c(Object obj, int i, int i2) {
        int i3 = this.a;
        int iF = f(i, i2);
        if ((i3 & iF) == 0) {
            return null;
        }
        return this.b[e(iF)].c(obj, i, i2 + 5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.a)));
        for (fbsf fbsfVar : this.b) {
            sb.append(fbsfVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
