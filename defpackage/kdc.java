package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdc implements kal {
    public static final kdc a = new kdc();

    private kdc() {
    }

    @Override // defpackage.kal
    public final Typeface a(Context context, kam kamVar) {
        Objects.toString(kamVar);
        throw new IllegalStateException("GoogleFont only support async loading: ".concat(String.valueOf(kamVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // defpackage.kal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r15, defpackage.kam r16, defpackage.fcxy r17) {
        /*
            r14 = this;
            r0 = r16
            boolean r1 = r0 instanceof defpackage.kcz
            if (r1 == 0) goto L9b
            r1 = r0
            kcz r1 = (defpackage.kcz) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "name="
            r2.<init>(r3)
            java.lang.String r3 = r1.c
            r2.append(r3)
            java.lang.String r3 = "&weight="
            r2.append(r3)
            kcc r3 = r1.e
            int r4 = r3.i
            r2.append(r4)
            java.lang.String r4 = "&italic="
            r2.append(r4)
            int r4 = r1.f
            r4 = 0
            r5 = 1
            boolean r6 = defpackage.kbw.b(r4, r5)
            r2.append(r6)
            java.lang.String r6 = "&besteffort=true"
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            lat r6 = new lat
            kcx r1 = r1.d
            r6.<init>(r2)
            kcc r1 = defpackage.kcc.h
            int r1 = r3.compareTo(r1)
            if (r1 < 0) goto L4b
            r1 = r5
            goto L4c
        L4b:
            r1 = r4
        L4c:
            boolean r2 = defpackage.kbw.b(r4, r5)
            if (r2 == 0) goto L57
            if (r1 == 0) goto L56
            r4 = 3
            goto L5a
        L56:
            r1 = r4
        L57:
            if (r2 == 0) goto L5c
            r4 = 2
        L5a:
            r9 = r4
            goto L5f
        L5c:
            if (r1 == 0) goto L5a
            r9 = r5
        L5f:
            fdiu r1 = new fdiu
            fcxy r2 = defpackage.fcym.c(r17)
            r1.<init>(r2, r5)
            r1.B()
            kdb r13 = new kdb
            r13.<init>(r1, r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L7a
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L7a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L86
            android.os.Handler r0 = defpackage.abn$$ExternalSyntheticApiModelOutline0.m(r0)
            r12 = r0
            goto L8c
        L86:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r0)
            r12 = r2
        L8c:
            java.util.List r8 = defpackage.lbb.a(r6)
            r10 = 0
            r11 = 0
            r7 = r15
            defpackage.lbf.a(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r15 = r1.m()
            return r15
        L9b:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "Only GoogleFontImpl supported (actual "
            r15.<init>(r1)
            r15.append(r0)
            r0 = 41
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdc.b(android.content.Context, kam, fcxy):java.lang.Object");
    }
}
