package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class extm extends extv {
    private final ekgb a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public extm(ekgb ekgbVar) throws extl {
        ekgbVar.getClass();
        this.a = ekgbVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            ekgb ekgbVar2 = this.a;
            if (i >= ((ekoe) ekgbVar2).c) {
                break;
            }
            int iB = ((extv) ekgbVar2.get(i)).b();
            if (i2 < iB) {
                i2 = iB;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 > 8) {
            throw new extl("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.extv
    protected final int a() {
        return c((byte) -128);
    }

    @Override // defpackage.extv
    protected final int b() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        extv extvVar = (extv) obj;
        if (a() != extvVar.a()) {
            return a() - extvVar.a();
        }
        ekgb ekgbVar = this.a;
        ekgb ekgbVar2 = ((extm) extvVar).a;
        int i = ((ekoe) ekgbVar2).c;
        int i2 = ((ekoe) ekgbVar).c;
        if (i2 != i) {
            return i2 - i;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int iCompareTo = ((extv) ekgbVar.get(i3)).compareTo((extv) ekgbVar2.get(i3));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ekjz.h(this.a, ((extm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        ekgb ekgbVar = this.a;
        if (ekgbVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int i = ((ekoe) ekgbVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(((extv) ekgbVar.get(i2)).toString().replace("\n", "\n  "));
        }
        ejwc ejwcVar = new ejwc(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        ejwcVar.i(sb, arrayList);
        sb.append("\n]");
        return sb.toString();
    }
}
