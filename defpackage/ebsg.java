package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebsg extends ebsm {
    public static final /* synthetic */ int a = 0;
    private final ekgb b;

    public ebsg(ekgb ekgbVar) {
        this.b = ekgbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebsm
    protected final boolean a(String str) {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                return false;
            }
            ebsi ebsiVar = (ebsi) ekgbVar.get(i);
            if (ebsiVar != null && ebsiVar.a.matcher(str).matches()) {
                return true;
            }
            i++;
        }
    }

    @Deprecated
    public ebsg(List list) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!ejwk.c(str)) {
                ejwi ejwiVarA = ebsi.a(str);
                if (ejwiVarA.g()) {
                    ekfwVar.h(ejwiVarA.c());
                }
            }
        }
        this.b = ekfwVar.g();
    }
}
