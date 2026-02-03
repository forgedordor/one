package defpackage;

import android.content.Context;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nid extends nij implements mtj {
    public static final eknw a = eknw.d(new Comparator() { // from class: nhe
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            eknw eknwVar = nid.a;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final Object b;
    public final Context c;
    public nhs d;
    public nhw e;
    public mac f;

    public nid(Context context) {
        nhs nhsVar = nhs.F;
        this.b = new Object();
        this.c = context != null ? context.getApplicationContext() : null;
        if (nhsVar instanceof nhs) {
            this.d = nhsVar;
        } else {
            nhr nhrVar = new nhr(nhsVar);
            nhrVar.f(nhsVar);
            this.d = new nhs(nhrVar);
        }
        this.f = mac.a;
        if (this.d.Q && context == null) {
            mff.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static int a(mau mauVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(mauVar.d)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(mauVar.d);
        if (strF2 == null || strF == null) {
            return (z && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        return mgb.ai(strF2, "-")[0].equals(mgb.ai(strF, "-")[0]) ? 2 : 0;
    }

    public static int b(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static void p(ngo ngoVar, mcq mcqVar, Map map) {
        mcn mcnVar;
        for (int i = 0; i < ngoVar.b; i++) {
            mcn mcnVar2 = (mcn) mcqVar.D.get(ngoVar.b(i));
            if (mcnVar2 != null && ((mcnVar = (mcn) map.get(Integer.valueOf(mcnVar2.a()))) == null || (mcnVar.b.isEmpty() && !mcnVar2.b.isEmpty()))) {
                map.put(Integer.valueOf(mcnVar2.a()), mcnVar2);
            }
        }
    }

    private final void q(nhs nhsVar) {
        boolean zEquals;
        synchronized (this.b) {
            zEquals = this.d.equals(nhsVar);
            this.d = nhsVar;
        }
        if (zEquals) {
            return;
        }
        if (nhsVar.Q && this.c == null) {
            mff.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        o();
    }

    private static final Pair r(int i, nii niiVar, int[][][] iArr, nhy nhyVar, Comparator comparator) {
        RandomAccess randomAccessR;
        nii niiVar2 = niiVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < niiVar2.a) {
            if (i == niiVar2.a(i2)) {
                ngo ngoVarC = niiVar2.c(i2);
                for (int i3 = 0; i3 < ngoVarC.b; i3++) {
                    mcm mcmVarB = ngoVarC.b(i3);
                    List listA = nhyVar.a(i2, mcmVarB, iArr[i2][i3]);
                    int i4 = mcmVarB.a;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        nhz nhzVar = (nhz) listA.get(i5);
                        int iB = nhzVar.b();
                        if (!zArr[i5] && iB != 0) {
                            boolean z = true;
                            if (iB == 1) {
                                randomAccessR = ekgb.r(nhzVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nhzVar);
                                int i7 = i6;
                                while (i7 < i4) {
                                    boolean z2 = z;
                                    nhz nhzVar2 = (nhz) listA.get(i7);
                                    if (nhzVar2.b() == 2 && nhzVar.c(nhzVar2)) {
                                        arrayList2.add(nhzVar2);
                                        zArr[i7] = z2;
                                    }
                                    i7++;
                                    z = z2;
                                }
                                randomAccessR = arrayList2;
                            }
                            arrayList.add(randomAccessR);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            niiVar2 = niiVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((nhz) list.get(i8)).c;
        }
        nhz nhzVar3 = (nhz) list.get(0);
        return Pair.create(new nie(nhzVar3.b, iArr2), Integer.valueOf(nhzVar3.a));
    }

    @Override // defpackage.nim
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final nhs c() {
        nhs nhsVar;
        synchronized (this.b) {
            nhsVar = this.d;
        }
        return nhsVar;
    }

    public final void g() {
        boolean z;
        nhw nhwVar;
        synchronized (this.b) {
            z = false;
            if (this.d.Q && Build.VERSION.SDK_INT >= 32 && (nhwVar = this.e) != null && nhwVar.b) {
                z = true;
            }
        }
        if (z) {
            o();
        }
    }

    @Override // defpackage.nim
    public final void h() {
        nhw nhwVar;
        Spatializer spatializer;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        if (Build.VERSION.SDK_INT >= 32 && (nhwVar = this.e) != null && (spatializer = nhwVar.a) != null && (spatializer$OnSpatializerStateChangedListener = nhwVar.d) != null && (handler = nhwVar.c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            handler.removeCallbacksAndMessages(null);
        }
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.nim
    public final void i(mac macVar) {
        if (this.f.equals(macVar)) {
            return;
        }
        this.f = macVar;
        g();
    }

    @Override // defpackage.nim
    public final void j(mcq mcqVar) {
        if (mcqVar instanceof nhs) {
            q((nhs) mcqVar);
        }
        nhr nhrVar = new nhr(c());
        nhrVar.f(mcqVar);
        q(new nhs(nhrVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4 A[PHI: r16
      0x00f4: PHI (r16v14 int) = (r16v13 int), (r16v16 int), (r16v16 int), (r16v16 int), (r16v16 int) binds: [B:60:0x00f7, B:272:0x00f4, B:52:0x00da, B:54:0x00e8, B:55:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v24, types: [nhq] */
    /* JADX WARN: Type inference failed for: r13v5, types: [nie] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r6v0, types: [nie[]] */
    /* JADX WARN: Type inference failed for: r9v11, types: [nie] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [nhq] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    @Override // defpackage.nij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.util.Pair k(defpackage.nii r27, int[][][] r28, final int[] r29) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nid.k(nii, int[][][], int[]):android.util.Pair");
    }

    @Override // defpackage.nim
    public final mtj d() {
        return this;
    }

    @Override // defpackage.nim
    public final void l() {
    }
}
