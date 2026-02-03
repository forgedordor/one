package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbf {
    public static Typeface a(Context context, List list, int i, boolean z, int i2, Handler handler, lbe lbeVar) {
        lao laoVar = new lao(lbeVar, new lbi(handler));
        if (z) {
            if (list.size() > 1) {
                throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            lat latVar = (lat) list.get(0);
            ExecutorService executorService = lba.b;
            String strB = lba.b(lau.a(latVar), i);
            Typeface typeface = (Typeface) lba.a.c(strB);
            if (typeface != null) {
                laoVar.a(new laz(typeface));
                return typeface;
            }
            if (i2 == -1) {
                laz lazVarA = lba.a(strB, context, lau.a(latVar), i);
                laoVar.a(lazVarA);
                return lazVarA.a;
            }
            try {
                laz lazVar = (laz) lbl.a(lba.b, new lav(strB, context, latVar, i), i2);
                laoVar.a(lazVar);
                return lazVar.a;
            } catch (InterruptedException unused) {
                laoVar.a(new laz(-3));
                return null;
            }
        }
        String strB2 = lba.b(list, i);
        Typeface typeface2 = (Typeface) lba.a.c(strB2);
        if (typeface2 != null) {
            laoVar.a(new laz(typeface2));
            return typeface2;
        }
        law lawVar = new law(laoVar);
        synchronized (lba.c) {
            cvw cvwVar = lba.d;
            ArrayList arrayList = (ArrayList) cvwVar.get(strB2);
            if (arrayList != null) {
                arrayList.add(lawVar);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(lawVar);
            cvwVar.put(strB2, arrayList2);
            lax laxVar = new lax(strB2, context, list, i);
            lba.b.execute(new lbk(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), laxVar, new lay(strB2)));
            return null;
        }
    }

    public static Typeface b(Context context, lbd[] lbdVarArr) {
        return kzi.c(context, lbdVarArr, 0);
    }

    public static lbc c(Context context, lat latVar) {
        return las.a(context, lbb.a(latVar));
    }
}
