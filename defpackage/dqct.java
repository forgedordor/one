package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqct {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri a(defpackage.dqcs r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L12
            dqck r2 = r2.e
            if (r2 != 0) goto L9
            dqck r2 = defpackage.dqck.a
        L9:
            if (r2 == 0) goto L12
            dqco r2 = r2.b
            if (r2 != 0) goto L13
            dqco r2 = defpackage.dqco.a
            goto L13
        L12:
            r2 = r0
        L13:
            if (r2 == 0) goto L20
            boolean r1 = i(r2)
            if (r1 == 0) goto L20
            android.net.Uri r2 = h(r2)
            return r2
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqct.a(dqcs):android.net.Uri");
    }

    public static final dlro b(dqcs dqcsVar, boolean z) {
        dlrg dlrgVar;
        Uri uriH = null;
        if (!d(dqcsVar)) {
            return null;
        }
        evtg evtgVar = dqcsVar.d;
        evtgVar.getClass();
        ArrayList<dqci> arrayList = new ArrayList();
        Iterator<E> it = evtgVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            dqci dqciVar = (dqci) next;
            dqciVar.getClass();
            dqco dqcoVar = dqciVar.b;
            if (dqcoVar == null) {
                dqcoVar = dqco.a;
            }
            dqcoVar.getClass();
            if (i(dqcoVar)) {
                int iA = dqcq.a(dqciVar.c);
                if (iA == 0) {
                    iA = 1;
                }
                if (iA != 2 && iA != 1) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        for (dqci dqciVar2 : arrayList) {
            dqciVar2.getClass();
            dqco dqcoVar2 = dqciVar2.b;
            if (dqcoVar2 == null) {
                dqcoVar2 = dqco.a;
            }
            dqcoVar2.getClass();
            String str = dqcoVar2.b;
            str.getClass();
            int iA2 = dqcp.a(dqcoVar2.c);
            if (iA2 == 0) {
                iA2 = 1;
            }
            djsq djsqVar = new djsq(str, g(iA2));
            int iA3 = dqcq.a(dqciVar2.c);
            if (iA3 == 0) {
                iA3 = 1;
            }
            int i = iA3 - 2;
            if (i == 1) {
                dlrgVar = dlrg.a;
            } else if (i == 2) {
                dlrgVar = dlrg.b;
            } else {
                if (i != 3) {
                    Objects.toString(dqcq.b(iA3));
                    throw new UnsupportedOperationException("Invalid position: ".concat(dqcq.b(iA3)));
                }
                dlrgVar = dlrg.c;
            }
            arrayList2.add(new dlrf(djsqVar, dlrgVar));
        }
        dqck dqckVar = dqcsVar.e;
        if (dqckVar == null) {
            dqckVar = dqck.a;
        }
        dqco dqcoVar3 = dqckVar.b;
        if (dqcoVar3 == null) {
            dqcoVar3 = dqco.a;
        }
        dqcoVar3.getClass();
        if (i(dqcoVar3)) {
            dqck dqckVar2 = dqcsVar.e;
            if (dqckVar2 == null) {
                dqckVar2 = dqck.a;
            }
            dqco dqcoVar4 = dqckVar2.b;
            if (dqcoVar4 == null) {
                dqcoVar4 = dqco.a;
            }
            dqcoVar4.getClass();
            uriH = h(dqcoVar4);
        }
        Uri uri = uriH;
        ekgb ekgbVarA = ekfv.a(arrayList2);
        dqck dqckVar3 = dqcsVar.e;
        if (dqckVar3 == null) {
            dqckVar3 = dqck.a;
        }
        dqcm dqcmVar = dqckVar3.c;
        if (dqcmVar == null) {
            dqcmVar = dqcm.a;
        }
        long j = dqcmVar.b;
        dqck dqckVar4 = dqcsVar.e;
        dqcm dqcmVar2 = (dqckVar4 == null ? dqck.a : dqckVar4).c;
        if (dqcmVar2 == null) {
            dqcmVar2 = dqcm.a;
        }
        long j2 = dqcmVar2.c;
        if (dqckVar4 == null) {
            dqckVar4 = dqck.a;
        }
        dqcm dqcmVar3 = dqckVar4.c;
        if (dqcmVar3 == null) {
            dqcmVar3 = dqcm.a;
        }
        float f = dqcmVar3.d;
        int iB = dqcv.b(dqcsVar.c);
        return new dlro(ekgbVarA, uri, j, j2, f, z, f(iB != 0 ? iB : 1), true);
    }

    public static final boolean c(dqbw dqbwVar) {
        dqcs dqcsVar;
        if (dqbwVar != null) {
            dqcsVar = dqbwVar.c;
            if (dqcsVar == null) {
                dqcsVar = dqcs.a;
            }
        } else {
            dqcsVar = null;
        }
        return d(dqcsVar);
    }

    public static final boolean d(dqcs dqcsVar) {
        int iB;
        int i;
        if (dqcsVar != null) {
            iB = dqcv.b(dqcsVar.c);
            if (iB == 0) {
                iB = 1;
            }
        } else {
            iB = 0;
        }
        return (iB == 0 || (i = iB + (-2)) == -1 || i == 0 || i == 1) ? false : true;
    }

    public static final int f(int i) {
        switch (i - 2) {
            case 2:
                return R.string.celebrate_mood_content_description;
            case 3:
                return R.string.love_mood_content_description;
            case 4:
                return R.string.laughing_mood_content_description;
            case 5:
                return R.string.sobbing_mood_content_description;
            case 6:
                return R.string.happy_mood_content_description;
            case 7:
                return R.string.angry_mood_content_description;
            case 8:
                return R.string.shocked_mood_content_description;
            case 9:
                return R.string.annoyed_mood_content_description;
            case 10:
                return R.string.sad_mood_content_description;
            default:
                return R.string.no_mood_content_description;
        }
    }

    public static final String g(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "animated_emoji";
        }
        if (i2 == 2) {
            return "voice_moods";
        }
        Objects.toString(dqcp.b(i));
        throw new IllegalArgumentException("Invalid file group: ".concat(dqcp.b(i)));
    }

    private static final Uri h(dqco dqcoVar) {
        Uri.Builder builderScheme = new Uri.Builder().scheme("mdd");
        int iA = dqcp.a(dqcoVar.c);
        if (iA == 0) {
            iA = 1;
        }
        return builderScheme.authority(g(iA)).appendPath(dqcoVar.b).build();
    }

    private static final boolean i(dqco dqcoVar) {
        int iA;
        String str = dqcoVar.b;
        str.getClass();
        if (fdgn.H(str)) {
            return false;
        }
        int i = dqcoVar.c;
        int iA2 = dqcp.a(i);
        return ((iA2 != 0 && iA2 == 2) || (iA = dqcp.a(i)) == 0 || iA == 1) ? false : true;
    }
}
