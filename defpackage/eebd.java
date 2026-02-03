package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eebd {
    public static qoo a(final eebe eebeVar, final LottieAnimationView lottieAnimationView, final boolean z, final eebh eebhVar) {
        qoo qooVarK = qnu.k(lottieAnimationView.getContext(), eebeVar.a(), null);
        qooVarK.e(new qoh() { // from class: eeaz
            @Override // defpackage.qoh
            public final void a(Object obj) {
                LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                lottieAnimationView2.h((qnm) obj);
                eebeVar.e(lottieAnimationView2, z, eebhVar);
            }
        });
        qooVarK.getClass();
        return qooVarK;
    }

    public static void b(eebe eebeVar, LottieAnimationView lottieAnimationView, boolean z, eebh eebhVar) {
        String str;
        for (eydq eydqVar : eebeVar.c()) {
            if (!z || (str = eydqVar.c) == null) {
                str = eydqVar.b;
            }
            Integer num = (Integer) eebhVar.a.get(str);
            if (num != null) {
                List list = eydqVar.a;
                final int iIntValue = num.intValue();
                String[] strArr = (String[]) list.toArray(new String[0]);
                qst qstVar = new qst((String[]) Arrays.copyOf(strArr, strArr.length));
                String str2 = eydqVar.d;
                if (fdbq.f(str2, eydr.a.g)) {
                    lottieAnimationView.b(qstVar, qok.b, new qxe() { // from class: eeba
                        @Override // defpackage.qxe
                        public final Object a() {
                            return Integer.valueOf(iIntValue);
                        }
                    });
                } else if (fdbq.f(str2, eydr.b.g)) {
                    lottieAnimationView.b(qstVar, qok.a, new qxe() { // from class: eebb
                        @Override // defpackage.qxe
                        public final Object a() {
                            return Integer.valueOf(iIntValue);
                        }
                    });
                } else if (fdbq.f(str2, eydr.c.g)) {
                    final qot qotVar = new qot(iIntValue);
                    lottieAnimationView.b(qstVar, qok.K, new qxe() { // from class: eebc
                        @Override // defpackage.qxe
                        public final Object a() {
                            return qotVar;
                        }
                    });
                }
            }
        }
    }

    public static eebh c(eebe eebeVar, Context context) {
        Set setD = eebeVar.d();
        if (setD.isEmpty()) {
            return eebg.c(context);
        }
        Map mapA = eebf.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            if (setD.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        eebh eebhVarA = eebg.a(context, linkedHashMap);
        Map mapB = eebf.b();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : mapB.entrySet()) {
            if (setD.contains((String) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return eebhVarA.a(eebg.b(context, linkedHashMap2));
    }

    public static void d(eebe eebeVar, LottieAnimationView lottieAnimationView, eebh eebhVar) {
        lottieAnimationView.getClass();
        eebeVar.b(lottieAnimationView, false, eebhVar);
    }

    public static void e(eebe eebeVar, LottieAnimationView lottieAnimationView, boolean z) {
        lottieAnimationView.getClass();
        Context context = lottieAnimationView.getContext();
        context.getClass();
        eebeVar.b(lottieAnimationView, z, eebeVar.f(context));
    }
}
