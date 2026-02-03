package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dg extends ct {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dg(defpackage.hi r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            r6.getClass()
            r5.<init>(r6)
            int r0 = r6.h
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L29
            if (r7 == 0) goto L22
            ea r7 = r6.a
            dv r0 = r7.T
            if (r0 != 0) goto L17
            goto L31
        L17:
            java.lang.Object r0 = r0.l
            java.lang.Object r1 = defpackage.ea.f
            if (r0 != r1) goto L3e
            java.lang.Object r0 = r7.W()
            goto L3e
        L22:
            ea r7 = r6.a
            java.lang.Object r0 = r7.V()
            goto L46
        L29:
            if (r7 == 0) goto L40
            ea r7 = r6.a
            dv r0 = r7.T
            if (r0 != 0) goto L33
        L31:
            r0 = r4
            goto L3e
        L33:
            java.lang.Object r0 = r0.j
            java.lang.Object r1 = defpackage.ea.f
            if (r0 != r1) goto L3e
            java.lang.Object r7 = r7.V()
            r0 = r7
        L3e:
            r2 = r3
            goto L46
        L40:
            ea r7 = r6.a
            java.lang.Object r0 = r7.W()
        L46:
            r5.b = r0
            r5.c = r3
            if (r8 == 0) goto L5d
            if (r2 == 0) goto L5d
            ea r6 = r6.a
            dv r6 = r6.T
            if (r6 != 0) goto L55
            goto L5d
        L55:
            java.lang.Object r6 = r6.m
            java.lang.Object r7 = defpackage.ea.f
            if (r6 != r7) goto L5c
            goto L5d
        L5c:
            r4 = r6
        L5d:
            r5.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg.<init>(hi, boolean, boolean):void");
    }

    private final gp d(Object obj) {
        if (obj == null) {
            return null;
        }
        gp gpVar = gh.a;
        if (obj instanceof Transition) {
            return gpVar;
        }
        gp gpVar2 = gh.b;
        if (gpVar2 != null && gpVar2.l(obj)) {
            return gpVar2;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final gp a() {
        Object obj = this.d;
        Object obj2 = this.b;
        gp gpVarD = d(obj2);
        gp gpVarD2 = d(obj);
        if (gpVarD == null || gpVarD2 == null || gpVarD == gpVarD2) {
            return gpVarD == null ? gpVarD2 : gpVarD;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.a + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj);
    }

    public final boolean c() {
        return this.d != null;
    }
}
