package defpackage;

import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgf implements dzwn {
    private final fcsu a;
    private final fcsu b;
    private final Set c;

    public dzgf(fcsu fcsuVar, fcsu fcsuVar2, Set set) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = set;
    }

    private final String c(String str) {
        return ((SharedPreferences) this.b.b()).getString(d(str), null);
    }

    private static final String d(String str) {
        return "federatedLearningLastScheduledSession_".concat(str);
    }

    @Override // defpackage.dzwn
    public final dzwm a() {
        return new dzwm(-10);
    }

    @Override // defpackage.dzwn
    public final ListenableFuture b(feix feixVar) {
        dzfx dzfxVar = (dzfx) this.a.b();
        for (dzfw dzfwVar : this.c) {
            eygg eyggVar = dzfwVar.c;
            if (!((eyjv) eyggVar.b()).e) {
                ejwi ejwiVar = dzfwVar.b;
                if (((eyjv) eyggVar.b()).b) {
                    ekhx ekhxVarA = dzfwVar.a(feixVar);
                    if (!ekhxVarA.isEmpty()) {
                        List<evqs> listG = ekjz.g(ekhxVarA.g(), new ejvr() { // from class: dzge
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                return evqs.A((String) obj);
                            }
                        });
                        String strReplace = ((eyjv) eyggVar.b()).c.replace("%PACKAGE_NAME%", dzfwVar.d.getPackageName());
                        String str = dzfwVar.a;
                        String strReplace2 = strReplace.replace("%METRIC_NAME%", str);
                        dzfxVar.a(((eyjv) eyggVar.b()).d, listG);
                        dzfxVar.c(strReplace2);
                        String strC = c(str);
                        if (strC != null && !strReplace2.equals(strC)) {
                            dzfxVar.b(strC);
                            ((SharedPreferences) this.b.b()).edit().putString(d(str), strReplace2).commit();
                        }
                    }
                }
            }
            String strC2 = c(dzfwVar.a);
            if (strC2 != null) {
                dzfxVar.b(strC2);
            }
        }
        return eorv.a;
    }
}
