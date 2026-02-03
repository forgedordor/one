package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejci implements ejcf {
    private final Context a;
    private final fcsu b;

    public ejci(Context context, fcsu fcsuVar) {
        this.a = context;
        this.b = fcsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final evqe c(exte exteVar) {
        if (exteVar.b.size() != 1) {
            return null;
        }
        exst exstVar = (exst) exteVar.b.get(0);
        if (exstVar.b == 3) {
            return (evqe) exstVar.c;
        }
        return null;
    }

    public final exsv a() {
        exsv exsvVar = (exsv) this.b.b();
        fbnb fbnbVar = espr.a;
        esop esopVar = new esop();
        esopVar.b(new ekph("https://www.googleapis.com/auth/mdi.aratea"));
        return (exsv) ((exsv) ((exsv) exsvVar.n(fbnbVar, new esow(esopVar.c()))).n(estq.b, 8704)).k(10L, TimeUnit.SECONDS);
    }

    public final extc b(exsr exsrVar, int i) {
        extb extbVar = (extb) extc.a.createBuilder();
        extbVar.copyOnWrite();
        extc extcVar = (extc) extbVar.instance;
        exsrVar.getClass();
        evtg evtgVar = extcVar.e;
        if (!evtgVar.c()) {
            extcVar.e = evsn.mutableCopy(evtgVar);
        }
        extcVar.e.add(exsrVar);
        exsx exsxVar = (exsx) exsz.a.createBuilder();
        exsxVar.copyOnWrite();
        exsz exszVar = (exsz) exsxVar.instance;
        exszVar.c = 1;
        exszVar.b |= 1;
        exso exsoVar = (exso) exsp.a.createBuilder();
        String str = Build.MODEL;
        exsoVar.copyOnWrite();
        exsp exspVar = (exsp) exsoVar.instance;
        str.getClass();
        exspVar.b |= 8;
        exspVar.c = str;
        String lowerCase = this.a.getResources().getConfiguration().getLocales().get(0).getLanguage().toLowerCase(Locale.ROOT);
        exsoVar.copyOnWrite();
        exsp exspVar2 = (exsp) exsoVar.instance;
        lowerCase.getClass();
        exspVar2.b |= 16;
        exspVar2.d = lowerCase;
        exsxVar.copyOnWrite();
        exsz exszVar2 = (exsz) exsxVar.instance;
        exsp exspVar3 = (exsp) exsoVar.build();
        exspVar3.getClass();
        exszVar2.d = exspVar3;
        exszVar2.b |= 2;
        exsz exszVar3 = (exsz) exsxVar.build();
        extbVar.copyOnWrite();
        extc extcVar2 = (extc) extbVar.instance;
        exszVar3.getClass();
        extcVar2.d = exszVar3;
        extcVar2.b |= 2;
        extbVar.copyOnWrite();
        extc extcVar3 = (extc) extbVar.instance;
        extcVar3.c = i - 1;
        extcVar3.b |= 1;
        return (extc) extbVar.build();
    }
}
