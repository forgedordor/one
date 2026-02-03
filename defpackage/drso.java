package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drso {
    private static volatile drso b;
    static final ekgb a = ekgb.w("⚕️", "♀️", "♂️", "♟️", "♾️", "⚧️");
    private static final ThreadLocal c = new drsn();

    private drso() {
    }

    public static drso a() {
        drso drsoVar;
        drso drsoVar2 = b;
        if (drsoVar2 != null) {
            return drsoVar2;
        }
        synchronized (drso.class) {
            drsoVar = b;
            if (drsoVar == null) {
                drsoVar = new drso();
                b = drsoVar;
            }
        }
        return drsoVar;
    }

    public static final boolean b(String str) {
        return ((drsm) c.get()).a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(java.lang.String r6, defpackage.drsj r7) {
        /*
            boolean r0 = r7.a()
            r1 = 0
            if (r0 == 0) goto L83
            boolean r0 = r7.a()
            if (r0 != 0) goto L12
            boolean r6 = b(r6)
            return r6
        L12:
            java.lang.ThreadLocal r0 = defpackage.drso.c
            java.lang.Object r0 = r0.get()
            drsm r0 = (defpackage.drsm) r0
            drsl r2 = defpackage.drsl.instance
            lok r2 = r2.a()
            if (r2 != 0) goto L27
            boolean r6 = r0.a(r6)
            return r6
        L27:
            java.lang.Integer r7 = r7.c
            if (r7 != 0) goto L49
            ekrg r7 = defpackage.drsl.a
            drub r0 = defpackage.drub.a
            ekrd r7 = r7.a(r0)
            r0 = 138(0x8a, float:1.93E-43)
            java.lang.String r3 = "EmojiCompatManager.java"
            java.lang.String r4 = "com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$CompatMetaData"
            java.lang.String r5 = "getMetaVersion"
            ekrw r7 = r7.h(r4, r5, r0, r3)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = "meta version is not set but getMetaVersion() is called."
            r7.q(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L4f
        L49:
            r7.intValue()
            r7 = 2147483647(0x7fffffff, float:NaN)
        L4f:
            boolean r0 = r2.g()
            java.lang.String r3 = "Not initialized yet"
            defpackage.lcg.d(r0, r3)
            java.lang.String r0 = "sequence cannot be null"
            defpackage.lcg.j(r6, r0)
            lod r0 = r2.e
            loo r0 = r0.a
            lol r6 = r0.a(r6)
            if (r6 == 0) goto L82
            plh r6 = r6.d()
            r0 = 10
            int r0 = r6.b(r0)
            if (r0 == 0) goto L7d
            java.nio.ByteBuffer r2 = r6.b
            int r6 = r6.a
            int r0 = r0 + r6
            short r6 = r2.getShort(r0)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            if (r6 > r7) goto L82
            r6 = 1
            return r6
        L82:
            return r1
        L83:
            boolean r7 = b(r6)
            if (r7 != 0) goto La1
            ekgb r7 = defpackage.drso.a
            boolean r7 = r7.contains(r6)
            r0 = 0
            if (r7 == 0) goto La0
            java.lang.String r7 = "️"
            java.lang.String r2 = ""
            java.lang.String r6 = r6.replace(r7, r2)
            boolean r7 = b(r6)
            if (r7 != 0) goto La1
        La0:
            r6 = r0
        La1:
            if (r6 != 0) goto La4
            return r1
        La4:
            boolean r6 = b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drso.c(java.lang.String, drsj):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ekgb d(ekgb ekgbVar, drsj drsjVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) ekgbVar.get(i2);
            if (c(str, drsjVar)) {
                ekfwVar.h(str);
            }
        }
        return ekfwVar.g();
    }
}
