package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krd {
    public static float a(krj krjVar, float f) {
        return krjVar.l.a(f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static defpackage.kre b(java.lang.String r6) {
        /*
            r0 = 0
            kre r1 = defpackage.kre.a(r0)
            int r2 = r6.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -1460244870: goto L2e;
                case -995424086: goto L24;
                case -895684237: goto L1a;
                case 3657802: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L38
        L10:
            java.lang.String r2 = "wrap"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L38
            r2 = r0
            goto L39
        L1a:
            java.lang.String r2 = "spread"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L38
            r2 = r4
            goto L39
        L24:
            java.lang.String r2 = "parent"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L38
            r2 = r3
            goto L39
        L2e:
            java.lang.String r2 = "preferWrap"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L38
            r2 = r5
            goto L39
        L38:
            r2 = -1
        L39:
            if (r2 == 0) goto L96
            if (r2 == r5) goto L8f
            if (r2 == r4) goto L88
            if (r2 == r3) goto L80
            java.lang.String r2 = "%"
            boolean r2 = r6.endsWith(r2)
            if (r2 == 0) goto L68
            r1 = 37
            int r1 = r6.indexOf(r1)
            java.lang.String r6 = r6.substring(r0, r1)
            float r6 = java.lang.Float.parseFloat(r6)
            r1 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r1
            kre r1 = new kre
            java.lang.Object r2 = defpackage.kre.e
            r1.<init>(r2)
            r1.i = r6
            r1.m = r5
            r1.h = r0
            return r1
        L68:
            java.lang.String r0 = ":"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L71
            return r1
        L71:
            kre r0 = new kre
            java.lang.Object r1 = defpackage.kre.f
            r0.<init>(r1)
            r0.k = r6
            java.lang.Object r6 = defpackage.kre.c
            r0.f(r6)
            return r0
        L80:
            kre r6 = new kre
            java.lang.Object r0 = defpackage.kre.d
            r6.<init>(r0)
            return r6
        L88:
            java.lang.Object r6 = defpackage.kre.c
            kre r6 = defpackage.kre.c(r6)
            return r6
        L8f:
            java.lang.Object r6 = defpackage.kre.b
            kre r6 = defpackage.kre.c(r6)
            return r6
        L96:
            kre r6 = new kre
            java.lang.Object r0 = defpackage.kre.b
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krd.b(java.lang.String):kre");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void c(defpackage.krj r22, defpackage.krb r23, defpackage.kqx r24, defpackage.kqt r25, java.lang.String r26) throws java.lang.NumberFormatException, defpackage.kqu {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krd.c(krj, krb, kqx, kqt, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(int r8, defpackage.krj r9, defpackage.krb r10, defpackage.kqn r11) {
        /*
            if (r8 != 0) goto L7
            krr r8 = r9.c()
            goto Lb
        L7:
            krs r8 = r9.d()
        Lb:
            r0 = 1
            kqp r1 = r11.h(r0)
            boolean r2 = r1 instanceof defpackage.kqn
            if (r2 == 0) goto Lc5
            kqn r1 = (defpackage.kqn) r1
            int r2 = r1.d()
            if (r2 <= 0) goto Lc5
            r2 = 0
            r3 = r2
        L1e:
            int r4 = r1.d()
            if (r3 >= r4) goto L32
            java.lang.String r4 = r1.m(r3)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r2] = r4
            r8.z(r5)
            int r3 = r3 + 1
            goto L1e
        L32:
            int r1 = r11.d()
            r3 = 2
            if (r1 <= r3) goto Lc5
            kqp r11 = r11.h(r3)
            boolean r1 = r11 instanceof defpackage.kqt
            if (r1 != 0) goto L43
            goto Lc5
        L43:
            kqt r11 = (defpackage.kqt) r11
            java.util.ArrayList r1 = r11.p()
            int r3 = r1.size()
            r4 = r2
        L4e:
            if (r4 >= r3) goto Lc5
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.hashCode()
            r7 = 109780401(0x68b1db1, float:5.2329616E-35)
            if (r6 == r7) goto L60
            goto Lbf
        L60:
            java.lang.String r6 = "style"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Lbf
            kqp r5 = r11.i(r5)
            boolean r6 = r5 instanceof defpackage.kqn
            if (r6 == 0) goto L84
            r6 = r5
            kqn r6 = (defpackage.kqn) r6
            int r7 = r6.d()
            if (r7 <= r0) goto L84
            java.lang.String r5 = r6.m(r2)
            float r6 = r6.a(r0)
            r8.ao = r6
            goto L88
        L84:
            java.lang.String r5 = r5.v()
        L88:
            int r6 = r5.hashCode()
            r7 = -995865480(0xffffffffc4a44c78, float:-1314.3896)
            if (r6 == r7) goto La1
            r7 = 1311368264(0x4e29e448, float:7.1257754E8)
            if (r6 == r7) goto L97
            goto Lab
        L97:
            java.lang.String r6 = "spread_inside"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lab
            r5 = r0
            goto Lac
        La1:
            java.lang.String r6 = "packed"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lab
            r5 = r2
            goto Lac
        Lab:
            r5 = -1
        Lac:
            if (r5 == 0) goto Lba
            if (r5 == r0) goto Lb5
            krh r5 = defpackage.krh.SPREAD
            r8.as = r5
            goto Lc2
        Lb5:
            krh r5 = defpackage.krh.SPREAD_INSIDE
            r8.as = r5
            goto Lc2
        Lba:
            krh r5 = defpackage.krh.PACKED
            r8.as = r5
            goto Lc2
        Lbf:
            e(r9, r10, r11, r8, r5)
        Lc2:
            int r4 = r4 + 1
            goto L4e
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krd.d(int, krj, krb, kqn):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(defpackage.krj r19, defpackage.krb r20, defpackage.kqt r21, defpackage.kqx r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krd.e(krj, krb, kqt, kqx, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.lang.String r19, defpackage.krj r20, java.lang.String r21, defpackage.krb r22, defpackage.kqt r23) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krd.f(java.lang.String, krj, java.lang.String, krb, kqt):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.String r16, defpackage.krj r17, java.lang.String r18, defpackage.krb r19, defpackage.kqt r20) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krd.g(java.lang.String, krj, java.lang.String, krb, kqt):void");
    }

    public static void h(int i, krj krjVar, kqn kqnVar) {
        kqt kqtVar;
        String strO;
        kqp kqpVarH = kqnVar.h(1);
        if ((kqpVarH instanceof kqt) && (strO = (kqtVar = (kqt) kqpVarH).o("id")) != null) {
            i(i, krjVar, strO, kqtVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(int r18, defpackage.krj r19, java.lang.String r20, defpackage.kqt r21) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krd.i(int, krj, java.lang.String, kqt):void");
    }

    public static void j(krj krjVar, krb krbVar, String str, kqt kqtVar) {
        kqx kqxVarB = krjVar.b(str);
        if (kqxVarB.ad == null) {
            kqxVarB.ad = new kre(kre.b);
        }
        if (kqxVarB.ae == null) {
            kqxVarB.ae = new kre(kre.b);
        }
        ArrayList arrayListP = kqtVar.p();
        int size = arrayListP.size();
        for (int i = 0; i < size; i++) {
            c(krjVar, krbVar, kqxVarB, kqtVar, (String) arrayListP.get(i));
        }
    }

    static kre k(kqt kqtVar, String str, krj krjVar, kpx kpxVar) throws kqu {
        kqp kqpVarI = kqtVar.i(str);
        boolean z = kqpVarI instanceof kqv;
        kre kreVarA = kre.a(0);
        if (z) {
            return b(kqpVarI.v());
        }
        if (kqpVarI instanceof kqr) {
            return kre.a(krjVar.a(Float.valueOf(kpxVar.a(kqtVar.b(str)))));
        }
        if (kqpVarI instanceof kqt) {
            kqt kqtVar2 = (kqt) kqpVarI;
            String strO = kqtVar2.o(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE);
            if (strO != null) {
                kreVarA = b(strO);
            }
            kqp kqpVarK = kqtVar2.k("min");
            if (kqpVarK != null) {
                if (kqpVarK instanceof kqr) {
                    kreVarA.e(krjVar.a(Float.valueOf(kpxVar.a(((kqr) kqpVarK).t()))));
                } else if (kqpVarK instanceof kqv) {
                    kreVarA.g = -2;
                }
            }
            kqp kqpVarK2 = kqtVar2.k("max");
            if (kqpVarK2 != null) {
                if (kqpVarK2 instanceof kqr) {
                    int iA = krjVar.a(Float.valueOf(kpxVar.a(((kqr) kqpVarK2).t())));
                    if (kreVarA.h >= 0) {
                        kreVarA.h = iA;
                        return kreVarA;
                    }
                } else if (kqpVarK2 instanceof kqv) {
                    Object obj = kre.b;
                    if (kreVarA.m) {
                        kreVarA.l = obj;
                        kreVarA.h = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                }
            }
        }
        return kreVarA;
    }
}
