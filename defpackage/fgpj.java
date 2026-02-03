package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgpj implements fgqf, fgqd {
    public final fgqf[] a;
    public final fgqd[] b;
    private final int c;
    private final int d;

    public fgpj(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof fgpj) {
                e(arrayList, ((fgpj) obj).a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof fgpj) {
                e(arrayList2, ((fgpj) obj2).b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (arrayList.contains(null) || arrayList.isEmpty()) {
            this.a = null;
            this.c = 0;
        } else {
            int size2 = arrayList.size();
            this.a = new fgqf[size2];
            int iB = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                fgqf fgqfVar = (fgqf) arrayList.get(i2);
                iB += fgqfVar.b();
                this.a[i2] = fgqfVar;
            }
            this.c = iB;
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.b = null;
            this.d = 0;
            return;
        }
        int size3 = arrayList2.size();
        this.b = new fgqd[size3];
        int iA = 0;
        for (int i3 = 0; i3 < size3; i3++) {
            fgqd fgqdVar = (fgqd) arrayList2.get(i3);
            iA += fgqdVar.a();
            this.b[i3] = fgqdVar;
        }
        this.d = iA;
    }

    private static final void e(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.fgqd
    public final int a() {
        return this.d;
    }

    @Override // defpackage.fgqf
    public final int b() {
        return this.c;
    }

    @Override // defpackage.fgqd
    public final int c(fgpz fgpzVar, CharSequence charSequence, int i) {
        fgqd[] fgqdVarArr = this.b;
        if (fgqdVarArr == null) {
            throw new UnsupportedOperationException();
        }
        for (int i2 = 0; i2 < fgqdVarArr.length && i >= 0; i2++) {
            i = fgqdVarArr[i2].c(fgpzVar, charSequence, i);
        }
        return i;
    }

    @Override // defpackage.fgqf
    public final void d(Appendable appendable, long j, fgmq fgmqVar, int i, fgmz fgmzVar, Locale locale) {
        fgqf[] fgqfVarArr = this.a;
        if (fgqfVarArr == null) {
            throw new UnsupportedOperationException();
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        for (fgqf fgqfVar : fgqfVarArr) {
            fgqfVar.d(appendable, j, fgmqVar, i, fgmzVar, locale2);
        }
    }
}
