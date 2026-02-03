package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidr implements eigy, ebcd {
    private final eibe a;

    public eidr(eibe eibeVar) {
        this.a = eibeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void c(eiii eiiiVar, int i) {
        String strConcat;
        if ((eiiiVar.b & 32) != 0) {
            eice eiceVar = eiiiVar.i;
            if (eiceVar == null) {
                eiceVar = eice.a;
            }
            if ((eiceVar.b & 2) != 0) {
                Locale locale = Locale.US;
                String str = ((eies) eiiiVar.e.get(0)).c;
                eicb eicbVar = eiceVar.d;
                if (eicbVar == null) {
                    eicbVar = eicb.a;
                }
                Log.println(i, "trace_manager", String.format(locale, "Trace %s timed out before completion. %s spans remaining", str, Integer.valueOf(eicbVar.d)));
            }
            if ((eiceVar.b & 1) != 0) {
                Locale locale2 = Locale.US;
                String str2 = ((eies) eiiiVar.e.get(0)).c;
                eicd eicdVar = eiceVar.c;
                if (eicdVar == null) {
                    eicdVar = eicd.a;
                }
                Log.println(i, "trace_manager", String.format(locale2, "Trace %s tried to log too many spans. %s spans dropped", str2, Integer.valueOf(eicdVar.c)));
            }
        }
        ctz ctzVar = new ctz();
        Iterator<E> it = eiiiVar.e.iterator();
        while (it.hasNext()) {
            ctzVar.h(r5.d, (eies) it.next());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < ctzVar.b(); i2++) {
            eies eiesVar = (eies) ctzVar.e(i2);
            long j = eiesVar.d;
            String str3 = (eiesVar.b & 32) != 0 ? eiesVar.h + " ms" : "unfinished";
            while (true) {
                eies eiesVar2 = (eies) ctzVar.d(j);
                if (eiesVar2 == null) {
                    strConcat = "Orphaned Root > ".concat(str3);
                    break;
                }
                long j2 = eiesVar2.e;
                str3 = eiesVar2.c + " > " + str3;
                if (j2 == -1) {
                    strConcat = str3;
                    break;
                }
                j = j2;
            }
            arrayList.add(String.format(Locale.US, "%06d\t%s", Long.valueOf(eiesVar.f), strConcat));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Log.println(i, "trace_manager", (String) arrayList.get(i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebcd
    public final ListenableFuture a() {
        eibe eibeVar = this.a;
        if (eibeVar.a().isEmpty()) {
            return eorv.a;
        }
        if (Log.isLoggable("trace_manager", 4)) {
            Log.i("trace_manager", "The following traces were active when the app crashed:");
            ekqh it = ((ekgb) eibeVar.a()).iterator();
            int i = 0;
            while (it.hasNext()) {
                eiim eiimVar = (eiim) it.next();
                Log.println(4, "trace_manager", a.g(i, "Trace: "));
                c(eiimVar.c(), 4);
                i++;
            }
        }
        return eorv.a;
    }

    @Override // defpackage.eigy
    public final void b(eiii eiiiVar, SparseArray sparseArray) {
        if (Log.isLoggable("trace_manager", 2)) {
            c(eiiiVar, 2);
        }
    }
}
