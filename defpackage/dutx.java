package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dutx {
    public static long a(dtqy dtqyVar) {
        if (dtqyVar.m == 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(dtqyVar.m);
    }

    public static Uri b(Uri uri, dtqs dtqsVar) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (dtqsVar.p.isEmpty()) {
            String str = dtqsVar.d;
            builderBuildUpon.appendPath(str.substring(str.lastIndexOf("/") + 1));
        } else {
            for (String str2 : dtqsVar.p.split("/", -1)) {
                if (!str2.isEmpty()) {
                    builderBuildUpon.appendPath(str2);
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static Uri c(Context context, ejwi ejwiVar, dtqy dtqyVar) {
        String str = !dtqyVar.x.isEmpty() ? dtqyVar.x : dtqyVar.d;
        int iA = dtqw.a(dtqyVar.k);
        if (iA == 0) {
            iA = 1;
        }
        return duto.b(context, ejwiVar).buildUpon().appendPath(duto.f(iA)).build().buildUpon().appendPath(str).build();
    }

    public static dtqy d(dtqy dtqyVar, long j) {
        dtqu dtquVar = dtqyVar.c;
        if (dtquVar == null) {
            dtquVar = dtqu.a;
        }
        dtqt dtqtVar = (dtqt) dtquVar.toBuilder();
        dtqtVar.copyOnWrite();
        dtqu dtquVar2 = (dtqu) dtqtVar.instance;
        dtquVar2.b |= 1;
        dtquVar2.c = j;
        dtqu dtquVar3 = (dtqu) dtqtVar.build();
        dtqx dtqxVar = (dtqx) dtqyVar.toBuilder();
        dtqxVar.copyOnWrite();
        dtqy dtqyVar2 = (dtqy) dtqxVar.instance;
        dtquVar3.getClass();
        dtqyVar2.c = dtquVar3;
        dtqyVar2.b |= 1;
        return (dtqy) dtqxVar.build();
    }

    public static String e(dtqs dtqsVar) {
        return g(dtqsVar) ? dtqsVar.i : dtqsVar.g;
    }

    public static void f(Context context, ejwi ejwiVar, dtqy dtqyVar, ecev ecevVar) {
        Uri uriC = c(context, ejwiVar, dtqyVar);
        if (ecevVar.h(uriC)) {
            echi echiVar = new echi();
            echiVar.a = true;
        }
    }

    public static boolean g(dtqs dtqsVar) {
        if ((dtqsVar.b & 32) == 0) {
            return false;
        }
        exyx exyxVar = dtqsVar.h;
        if (exyxVar == null) {
            exyxVar = exyx.a;
        }
        Iterator<E> it = exyxVar.b.iterator();
        while (it.hasNext()) {
            if (((exyv) it.next()).b == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(String str, ekhx ekhxVar) {
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(58);
        ejwl.p(iIndexOf >= 0, "Invalid url: %s", str);
        String strSubstring = str.substring(0, iIndexOf);
        ekqg ekqgVarListIterator = ekhxVar.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            if (ejuf.e(strSubstring, (String) ekqgVarListIterator.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(dtqs dtqsVar) {
        return h(dtqsVar.d, new ekph("inlinefile"));
    }

    public static boolean j(dtqy dtqyVar) {
        if (!dtqyVar.o) {
            return false;
        }
        Iterator<E> it = dtqyVar.p.iterator();
        while (it.hasNext()) {
            int iA = dtqo.a(((dtqs) it.next()).m);
            if (iA != 0 && iA == 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(dtqs dtqsVar) {
        return h(dtqsVar.d, ekhx.r("file", "asset"));
    }

    public static boolean l(long j, duag duagVar) {
        return j <= duagVar.a();
    }
}
