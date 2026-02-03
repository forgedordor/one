package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dubf {
    public final Context a;
    public final dugs b;
    public final dunz c;
    public final duoc d;
    public final durk e;
    public final ecev f;
    public final ejwi g;
    public final dtvq h;
    public final Executor i;
    public final dtpi j;
    public final duag k;

    public dubf(Context context, dugs dugsVar, dunz dunzVar, duoc duocVar, durk durkVar, duag duagVar, ecev ecevVar, ejwi ejwiVar, dtvq dtvqVar, Executor executor, dtpi dtpiVar) {
        this.a = context;
        this.b = dugsVar;
        this.c = dunzVar;
        this.d = duocVar;
        this.e = durkVar;
        this.k = duagVar;
        this.f = ecevVar;
        this.g = ejwiVar;
        this.h = dtvqVar;
        this.i = executor;
        this.j = dtpiVar;
    }

    public final int a(Uri uri, List list) {
        int iA;
        ecev ecevVar;
        try {
            ecevVar = this.f;
        } catch (IOException e) {
            e = e;
            iA = 0;
        }
        if (!ecevVar.h(uri)) {
            return 0;
        }
        iA = 0;
        for (Uri uri2 : ecevVar.b(uri)) {
            try {
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                                break;
                            }
                        } else if (ecevVar.i(uri2)) {
                            iA += a(uri2, list);
                        } else {
                            durt.c("%s: Deleted unaccounted file with uri %s!", "ExpirationHandler", uri2.getPath());
                            ecevVar.f(uri2);
                            iA++;
                        }
                    }
                } catch (IOException e2) {
                    this.e.l(1059);
                    durt.k(e2, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                }
            } catch (IOException e3) {
                e = e3;
                this.e.l(1059);
                durt.k(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                return iA;
            }
        }
        return iA;
    }
}
