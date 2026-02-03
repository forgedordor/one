package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnu {
    public static final Map a = new HashMap();
    private static final Set b = new HashSet();
    private static final byte[] c = {80, 75, 3, 4};

    public static qol a(Context context, String str) {
        return b(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static qol b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return f(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new qol((Throwable) e);
        }
    }

    public static qol c(InputStream inputStream, String str) throws IOException {
        try {
            fffv fffvVar = new fffv(fffk.b(inputStream));
            String[] strArr = qwn.a;
            return d(new qwo(fffvVar), str);
        } finally {
            qwz.f(inputStream);
        }
    }

    public static qol d(qwn qwnVar, String str) {
        return o(qwnVar, str, true);
    }

    public static qol e(Context context, int i, String str) {
        try {
            fffv fffvVar = new fffv(fffk.b(context.getResources().openRawResource(i)));
            return p(fffvVar).booleanValue() ? f(context, new ZipInputStream(new fffu(fffvVar)), str) : c(new fffu(fffvVar), str);
        } catch (Resources.NotFoundException e) {
            return new qol((Throwable) e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0262 A[Catch: all -> 0x02a5, TryCatch #1 {all -> 0x02a5, blocks: (B:2:0x0000, B:3:0x000a, B:6:0x0013, B:8:0x001f, B:54:0x011e, B:9:0x0024, B:11:0x0030, B:12:0x0035, B:14:0x0041, B:15:0x0059, B:18:0x0064, B:20:0x006c, B:22:0x0074, B:25:0x007e, B:27:0x0086, B:30:0x008f, B:31:0x0094, B:49:0x00e4, B:51:0x00ee, B:52:0x010b, B:48:0x00d7, B:53:0x010f, B:57:0x0126, B:58:0x0134, B:59:0x013c, B:61:0x0142, B:62:0x015b, B:64:0x0161, B:69:0x0173, B:70:0x0184, B:71:0x018c, B:73:0x0193, B:74:0x01a7, B:76:0x01ad, B:78:0x01bf, B:80:0x01cb, B:81:0x01eb, B:83:0x01f1, B:84:0x01fe, B:86:0x0204, B:89:0x0214, B:91:0x0229, B:94:0x0233, B:95:0x0240, B:97:0x0249, B:98:0x024f, B:99:0x025c, B:101:0x0262, B:103:0x0272, B:105:0x028d, B:106:0x0295, B:108:0x029c), top: B:116:0x0000, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qol f(android.content.Context r12, java.util.zip.ZipInputStream r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnu.f(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):qol");
    }

    public static qoo g(final String str, Callable callable) {
        final qnm qnmVar = str == null ? null : (qnm) qsv.a.b.c(str);
        if (qnmVar != null) {
            return new qoo(new Callable() { // from class: qnr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Map map = qnu.a;
                    return new qol(qnmVar);
                }
            });
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (qoo) map.get(str);
            }
        }
        qoo qooVar = new qoo(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qooVar.e(new qoh() { // from class: qns
                @Override // defpackage.qoh
                public final void a(Object obj) {
                    Map map2 = qnu.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        qnu.n();
                    }
                }
            });
            qooVar.d(new qoh() { // from class: qnt
                @Override // defpackage.qoh
                public final void a(Object obj) {
                    Map map2 = qnu.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        qnu.n();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = a;
                map2.put(str, qooVar);
                if (map2.size() == 1) {
                    n();
                }
            }
        }
        return qooVar;
    }

    public static qoo h(Context context, String str) {
        return i(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static qoo i(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return g(str2, new Callable() { // from class: qnq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qnu.b(applicationContext, str, str2);
            }
        });
    }

    public static qoo j(Context context, int i) {
        return k(context, i, m(context, i));
    }

    public static qoo k(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return g(str, new Callable() { // from class: qno
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = qnu.a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return qnu.e(context2, i, str);
            }
        });
    }

    public static qoo l(final Context context, final String str, final String str2) {
        return g(str2, new Callable() { // from class: qnn
            /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 636
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qnn.call():java.lang.Object");
            }
        });
    }

    public static String m(Context context, int i) {
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(i2 != 32 ? "_day_" : "_night_");
        sb.append(i);
        return sb.toString();
    }

    public static void n() {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((qop) arrayList.get(i)).a();
        }
    }

    private static qol o(qwn qwnVar, String str, boolean z) throws IOException {
        qol qolVar;
        HashMap map;
        ArrayList arrayList;
        float f;
        int i;
        float f2;
        HashMap map2;
        ArrayList arrayList2;
        int i2;
        int i3;
        int i4;
        float f3;
        try {
            try {
                qwl qwlVar = qvt.a;
                float fA = qwz.a();
                ctz ctzVar = new ctz();
                ArrayList arrayList3 = new ArrayList();
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                ArrayList arrayList4 = new ArrayList();
                cvx cvxVar = new cvx();
                qnm qnmVar = new qnm();
                qwnVar.i();
                float fA2 = 0.0f;
                int iB = 0;
                int iB2 = 0;
                float fA3 = 0.0f;
                float fA4 = 0.0f;
                while (qwnVar.o()) {
                    float f4 = fA;
                    switch (qwnVar.c(qvt.a)) {
                        case 0:
                            map = map5;
                            arrayList = arrayList4;
                            f = fA2;
                            i = iB2;
                            f2 = fA3;
                            iB = qwnVar.b();
                            fA = f4;
                            map5 = map;
                            fA2 = f;
                            fA3 = f2;
                            iB2 = i;
                            break;
                        case 1:
                            arrayList = arrayList4;
                            iB2 = qwnVar.b();
                            fA = f4;
                            map5 = map5;
                            fA2 = fA2;
                            fA3 = fA3;
                            break;
                        case 2:
                            arrayList = arrayList4;
                            i = iB2;
                            fA3 = (float) qwnVar.a();
                            fA = f4;
                            map5 = map5;
                            fA2 = fA2;
                            iB2 = i;
                            break;
                        case 3:
                            arrayList = arrayList4;
                            i = iB2;
                            f2 = fA3;
                            fA2 = ((float) qwnVar.a()) - 0.01f;
                            fA = f4;
                            map5 = map5;
                            fA3 = f2;
                            iB2 = i;
                            break;
                        case 4:
                            map = map5;
                            arrayList = arrayList4;
                            f = fA2;
                            i = iB2;
                            f2 = fA3;
                            fA4 = (float) qwnVar.a();
                            fA = f4;
                            map5 = map;
                            fA2 = f;
                            fA3 = f2;
                            iB2 = i;
                            break;
                        case 5:
                            map = map5;
                            arrayList = arrayList4;
                            f = fA2;
                            i = iB2;
                            f2 = fA3;
                            String[] strArrSplit = qwnVar.g().split("\\.");
                            int i5 = Integer.parseInt(strArrSplit[0]);
                            int i6 = Integer.parseInt(strArrSplit[1]);
                            int i7 = Integer.parseInt(strArrSplit[2]);
                            if (i5 < 4 || (i5 <= 4 && (i6 < 4 || (i6 <= 4 && i7 < 0)))) {
                                qnmVar.e("Lottie only supports bodymovin >= 4.4.0");
                            }
                            fA = f4;
                            map5 = map;
                            fA2 = f;
                            fA3 = f2;
                            iB2 = i;
                            break;
                        case 6:
                            map = map5;
                            arrayList = arrayList4;
                            f = fA2;
                            i = iB2;
                            f2 = fA3;
                            qwnVar.h();
                            int i8 = 0;
                            while (qwnVar.o()) {
                                qul qulVarA = qvs.a(qwnVar, qnmVar);
                                if (qulVarA.w == 3) {
                                    i8++;
                                }
                                arrayList3.add(qulVarA);
                                ctzVar.h(qulVarA.d, qulVarA);
                                if (i8 > 4) {
                                    qws.a("You have " + i8 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                                }
                            }
                            qwnVar.j();
                            fA = f4;
                            map5 = map;
                            fA2 = f;
                            fA3 = f2;
                            iB2 = i;
                            break;
                        case 7:
                            f = fA2;
                            int i9 = iB2;
                            f2 = fA3;
                            qwnVar.h();
                            while (qwnVar.o()) {
                                ArrayList arrayList5 = new ArrayList();
                                ctz ctzVar2 = new ctz();
                                qwnVar.i();
                                String strG = null;
                                String strG2 = null;
                                int iB3 = 0;
                                int iB4 = 0;
                                while (qwnVar.o()) {
                                    int iC = qwnVar.c(qvt.b);
                                    if (iC != 0) {
                                        i2 = i9;
                                        if (iC != 1) {
                                            if (iC == 2) {
                                                iB3 = qwnVar.b();
                                            } else if (iC == 3) {
                                                iB4 = qwnVar.b();
                                            } else if (iC != 4) {
                                                if (iC != 5) {
                                                    qwnVar.m();
                                                    qwnVar.n();
                                                } else {
                                                    qwnVar.g();
                                                }
                                                map2 = map5;
                                                arrayList2 = arrayList4;
                                            } else {
                                                strG = qwnVar.g();
                                            }
                                            i9 = i2;
                                        } else {
                                            qwnVar.h();
                                            while (qwnVar.o()) {
                                                qul qulVarA2 = qvs.a(qwnVar, qnmVar);
                                                ctzVar2.h(qulVarA2.d, qulVarA2);
                                                arrayList5.add(qulVarA2);
                                                map5 = map5;
                                                arrayList4 = arrayList4;
                                            }
                                            map2 = map5;
                                            arrayList2 = arrayList4;
                                            qwnVar.j();
                                        }
                                    } else {
                                        map2 = map5;
                                        arrayList2 = arrayList4;
                                        i2 = i9;
                                        strG2 = qwnVar.g();
                                    }
                                    map5 = map2;
                                    i9 = i2;
                                    arrayList4 = arrayList2;
                                }
                                HashMap map6 = map5;
                                ArrayList arrayList6 = arrayList4;
                                int i10 = i9;
                                qwnVar.k();
                                String str2 = strG;
                                if (str2 != null) {
                                    qog qogVar = new qog(iB3, iB4, strG2, str2);
                                    map4.put(qogVar.c, qogVar);
                                } else {
                                    map3.put(strG2, arrayList5);
                                }
                                map5 = map6;
                                i9 = i10;
                                arrayList4 = arrayList6;
                            }
                            map = map5;
                            arrayList = arrayList4;
                            i = i9;
                            qwnVar.j();
                            fA = f4;
                            map5 = map;
                            fA2 = f;
                            fA3 = f2;
                            iB2 = i;
                            break;
                        case 8:
                            f = fA2;
                            i3 = iB2;
                            f2 = fA3;
                            qwnVar.i();
                            while (qwnVar.o()) {
                                if (qwnVar.c(qvt.c) != 0) {
                                    qwnVar.m();
                                    qwnVar.n();
                                } else {
                                    qwnVar.h();
                                    while (qwnVar.o()) {
                                        qwl qwlVar2 = qvk.a;
                                        qwnVar.i();
                                        String strG3 = null;
                                        String strG4 = null;
                                        String strG5 = null;
                                        while (qwnVar.o()) {
                                            int iC2 = qwnVar.c(qvk.a);
                                            if (iC2 == 0) {
                                                strG3 = qwnVar.g();
                                            } else if (iC2 == 1) {
                                                strG4 = qwnVar.g();
                                            } else if (iC2 == 2) {
                                                strG5 = qwnVar.g();
                                            } else if (iC2 != 3) {
                                                qwnVar.m();
                                                qwnVar.n();
                                            } else {
                                                qwnVar.a();
                                            }
                                        }
                                        qwnVar.k();
                                        qsr qsrVar = new qsr(strG3, strG4, strG5);
                                        map5.put(qsrVar.b, qsrVar);
                                    }
                                    qwnVar.j();
                                }
                            }
                            qwnVar.k();
                            map = map5;
                            arrayList = arrayList4;
                            i = i3;
                            fA = f4;
                            map5 = map;
                            fA2 = f;
                            fA3 = f2;
                            iB2 = i;
                            break;
                        case 9:
                            f = fA2;
                            i3 = iB2;
                            f2 = fA3;
                            qwnVar.h();
                            while (qwnVar.o()) {
                                qwl qwlVar3 = qvj.a;
                                ArrayList arrayList7 = new ArrayList();
                                qwnVar.i();
                                double dA = 0.0d;
                                String strG6 = null;
                                String strG7 = null;
                                char cCharAt = 0;
                                while (qwnVar.o()) {
                                    int iC3 = qwnVar.c(qvj.a);
                                    if (iC3 == 0) {
                                        cCharAt = qwnVar.g().charAt(0);
                                    } else if (iC3 == 1) {
                                        qwnVar.a();
                                    } else if (iC3 == 2) {
                                        dA = qwnVar.a();
                                    } else if (iC3 == 3) {
                                        strG6 = qwnVar.g();
                                    } else if (iC3 == 4) {
                                        strG7 = qwnVar.g();
                                    } else if (iC3 != 5) {
                                        qwnVar.m();
                                        qwnVar.n();
                                    } else {
                                        qwnVar.i();
                                        while (qwnVar.o()) {
                                            if (qwnVar.c(qvj.b) != 0) {
                                                qwnVar.m();
                                                qwnVar.n();
                                            } else {
                                                qwnVar.h();
                                                while (qwnVar.o()) {
                                                    arrayList7.add((qua) qve.a(qwnVar, qnmVar));
                                                }
                                                qwnVar.j();
                                            }
                                        }
                                        qwnVar.k();
                                    }
                                }
                                qwnVar.k();
                                qss qssVar = new qss(arrayList7, cCharAt, dA, strG6, strG7);
                                cvxVar.f(qssVar.hashCode(), qssVar);
                            }
                            qwnVar.j();
                            map = map5;
                            arrayList = arrayList4;
                            i = i3;
                            fA = f4;
                            map5 = map;
                            fA2 = f;
                            fA3 = f2;
                            iB2 = i;
                            break;
                        case 10:
                            qwnVar.h();
                            while (qwnVar.o()) {
                                qwnVar.i();
                                String strG8 = null;
                                float fA5 = 0.0f;
                                float fA6 = 0.0f;
                                while (qwnVar.o()) {
                                    float f5 = fA2;
                                    int iC4 = qwnVar.c(qvt.d);
                                    if (iC4 != 0) {
                                        f3 = fA3;
                                        if (iC4 == 1) {
                                            i4 = iB2;
                                            fA6 = (float) qwnVar.a();
                                        } else if (iC4 != 2) {
                                            qwnVar.m();
                                            qwnVar.n();
                                            fA2 = f5;
                                            fA3 = f3;
                                        } else {
                                            i4 = iB2;
                                            fA5 = (float) qwnVar.a();
                                        }
                                    } else {
                                        i4 = iB2;
                                        f3 = fA3;
                                        strG8 = qwnVar.g();
                                    }
                                    iB2 = i4;
                                    fA2 = f5;
                                    fA3 = f3;
                                }
                                qwnVar.k();
                                arrayList4.add(new qsw(strG8, fA6, fA5));
                                iB2 = iB2;
                                fA2 = fA2;
                                fA3 = fA3;
                            }
                            f = fA2;
                            i3 = iB2;
                            f2 = fA3;
                            qwnVar.j();
                            map = map5;
                            arrayList = arrayList4;
                            i = i3;
                            fA = f4;
                            map5 = map;
                            fA2 = f;
                            fA3 = f2;
                            iB2 = i;
                            break;
                        default:
                            map = map5;
                            arrayList = arrayList4;
                            f = fA2;
                            i = iB2;
                            f2 = fA3;
                            qwnVar.m();
                            qwnVar.n();
                            fA = f4;
                            map5 = map;
                            fA2 = f;
                            fA3 = f2;
                            iB2 = i;
                            break;
                    }
                    arrayList4 = arrayList;
                }
                float f6 = fA;
                qnmVar.i = new Rect(0, 0, (int) (iB * f6), (int) (iB2 * f6));
                qnmVar.j = fA3;
                qnmVar.k = fA2;
                qnmVar.l = fA4;
                qnmVar.h = arrayList3;
                qnmVar.g = ctzVar;
                qnmVar.b = map3;
                qnmVar.c = map4;
                qnmVar.f = cvxVar;
                qnmVar.d = map5;
                qnmVar.e = arrayList4;
                if (str != null) {
                    qsv.a.a(str, qnmVar);
                }
                qolVar = new qol(qnmVar);
            } catch (Exception e) {
                qolVar = new qol((Throwable) e);
            }
            if (z) {
                qwz.f(qwnVar);
            }
            return qolVar;
        } catch (Throwable th) {
            if (z) {
                qwz.f(qwnVar);
            }
            throw th;
        }
    }

    private static Boolean p(fffb fffbVar) {
        try {
            fffv fffvVar = new fffv(new fffp(fffbVar));
            byte[] bArr = c;
            int length = bArr.length;
            for (int i = 0; i < 4; i++) {
                if (fffvVar.d() != bArr[i]) {
                    return false;
                }
            }
            fffvVar.close();
            return true;
        } catch (Exception unused) {
            int i2 = qws.a;
            return false;
        } catch (NoSuchMethodError unused2) {
            return false;
        }
    }
}
