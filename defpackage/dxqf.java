package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxqf {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r0.c(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ekhx a(java.lang.String r8) throws java.lang.NumberFormatException {
        /*
            java.lang.String r0 = ","
            ejxk r0 = defpackage.ejxk.d(r0)
            java.lang.Iterable r8 = r0.g(r8)
            ekhv r0 = new ekhv
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L13:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1)
            dxwd[] r2 = defpackage.dxwd.values()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L2a:
            if (r5 >= r3) goto L39
            r6 = r2[r5]
            int r7 = r6.c
            if (r7 != r1) goto L36
            r0.c(r6)
            goto L13
        L36:
            int r5 = r5 + 1
            goto L2a
        L39:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            java.lang.String r0 = "Notification channel %d is not supported."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r8.<init>(r0)
            throw r8
        L4e:
            ekhx r8 = r0.g()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxqf.a(java.lang.String):ekhx");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String b(ekhx ekhxVar) {
        StringBuilder sb = new StringBuilder();
        ekgb ekgbVarG = ekhxVar.g();
        for (int i = 0; i < ekgbVarG.size(); i++) {
            sb.append(((dxwd) ekgbVarG.get(i)).c);
            if (i < ekhxVar.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static final int c(int i) {
        int[] iArrA = dxhg.a();
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArrA[i2];
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i) {
                return i3;
            }
        }
        throw new IllegalArgumentException(String.format("Account type %d is not supported.", Integer.valueOf(i)));
    }
}
