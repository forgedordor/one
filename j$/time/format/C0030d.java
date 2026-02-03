package j$.time.format;

import java.util.ArrayList;

/* renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0030d implements InterfaceC0031e {
    public final InterfaceC0031e[] a;
    public final boolean b;

    public C0030d(ArrayList arrayList, boolean z) {
        this((InterfaceC0031e[]) arrayList.toArray(new InterfaceC0031e[arrayList.size()]), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    @Override // j$.time.format.InterfaceC0031e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(j$.time.format.x r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 1
            boolean r2 = r7.b
            if (r2 == 0) goto Le
            int r3 = r8.c
            int r3 = r3 + r1
            r8.c = r3
        Le:
            j$.time.format.e[] r3 = r7.a     // Catch: java.lang.Throwable -> L27
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L12:
            if (r5 >= r4) goto L2c
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.f(r8, r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L29
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r9 = r8.c
            int r9 = r9 - r1
            r8.c = r9
            return r1
        L27:
            r9 = move-exception
            goto L30
        L29:
            int r5 = r5 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r0 = r8.c
            int r0 = r0 - r1
            r8.c = r0
        L37:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C0030d.f(j$.time.format.x, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.InterfaceC0031e
    public final int j(v vVar, CharSequence charSequence, int i) {
        ArrayList arrayList = vVar.d;
        boolean z = this.b;
        InterfaceC0031e[] interfaceC0031eArr = this.a;
        int i2 = 0;
        if (!z) {
            int length = interfaceC0031eArr.length;
            while (i2 < length) {
                i = interfaceC0031eArr[i2].j(vVar, charSequence, i);
                if (i < 0) {
                    return i;
                }
                i2++;
            }
            return i;
        }
        B bC = vVar.c();
        bC.getClass();
        B b = new B();
        b.a.putAll(bC.a);
        b.b = bC.b;
        b.c = bC.c;
        b.d = bC.d;
        arrayList.add(b);
        int length2 = interfaceC0031eArr.length;
        int iJ = i;
        while (i2 < length2) {
            iJ = interfaceC0031eArr[i2].j(vVar, charSequence, iJ);
            if (iJ < 0) {
                arrayList.remove(arrayList.size() - 1);
                return i;
            }
            i2++;
        }
        arrayList.remove(arrayList.size() - 2);
        return iJ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC0031e[] interfaceC0031eArr = this.a;
        if (interfaceC0031eArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (InterfaceC0031e interfaceC0031e : interfaceC0031eArr) {
                sb.append(interfaceC0031e);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    public C0030d(InterfaceC0031e[] interfaceC0031eArr, boolean z) {
        this.a = interfaceC0031eArr;
        this.b = z;
    }
}
