package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deyt {
    private static final dfny a = dfod.a(164466999);
    private final Context b;
    private final dhes c;
    private final dexw d;

    public deyt(Context context, dhes dhesVar, dexw dexwVar) {
        this.b = context;
        this.c = dhesVar;
        this.d = dexwVar;
    }

    public final void a(int i) throws PackageManager.NameNotFoundException {
        dexw dexwVar = this.d;
        if (dexwVar.e(this.c.k())) {
            return;
        }
        eweh ewehVar = (eweh) ewej.a.createBuilder();
        ewehVar.copyOnWrite();
        ewej ewejVar = (ewej) ewehVar.instance;
        ewejVar.c = Integer.valueOf(i - 1);
        ewejVar.b = 1;
        if (((Boolean) a.a()).booleanValue()) {
            Context context = this.b;
            emkm emkmVarA = dexwVar.a(context, emko.CARRIER_SERVICES_EVENT_SOURCE_RCS);
            emkmVarA.copyOnWrite();
            emkr emkrVar = (emkr) emkmVarA.instance;
            ewej ewejVar2 = (ewej) ewehVar.build();
            emkr emkrVar2 = emkr.a;
            ewejVar2.getClass();
            emkrVar.f = ewejVar2;
            emkrVar.e = 38;
            dexwVar.c(context, (emkr) emkmVarA.build(), ewqu.JIBE_SERVICE_EVENT);
        }
    }
}
