package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deyy implements dhem {
    private final Context a;
    private final dhes b;
    private final dexw c;

    public deyy(Context context, dhes dhesVar, dexw dexwVar) {
        this.a = context;
        this.b = dhesVar;
        this.c = dexwVar;
    }

    @Override // defpackage.dhem
    public final void a(ewke ewkeVar) throws PackageManager.NameNotFoundException {
        dhes dhesVar = this.b;
        dexw dexwVar = this.c;
        if (dexwVar.e(dhesVar.k())) {
            return;
        }
        Context context = this.a;
        emkm emkmVarA = dexwVar.a(context, emko.CARRIER_SERVICES_EVENT_SOURCE_COMMON);
        ewkq ewkqVar = (ewkq) ewkr.a.createBuilder();
        ewkqVar.copyOnWrite();
        ewkr ewkrVar = (ewkr) ewkqVar.instance;
        ewkeVar.getClass();
        ewkrVar.c = ewkeVar;
        ewkrVar.b = 2;
        ewkr ewkrVar2 = (ewkr) ewkqVar.build();
        emkmVarA.copyOnWrite();
        emkr emkrVar = (emkr) emkmVarA.instance;
        emkr emkrVar2 = emkr.a;
        ewkrVar2.getClass();
        emkrVar.f = ewkrVar2;
        emkrVar.e = 22;
        dexwVar.c(context, (emkr) emkmVarA.build(), ewqu.TELEPHONY_EVENT);
    }

    @Override // defpackage.dhem
    public final void b(ewkl ewklVar) throws PackageManager.NameNotFoundException {
        dhes dhesVar = this.b;
        dexw dexwVar = this.c;
        if (dexwVar.e(dhesVar.k())) {
            return;
        }
        Context context = this.a;
        emkm emkmVarA = dexwVar.a(context, emko.CARRIER_SERVICES_EVENT_SOURCE_COMMON);
        ewkq ewkqVar = (ewkq) ewkr.a.createBuilder();
        ewkqVar.copyOnWrite();
        ewkr ewkrVar = (ewkr) ewkqVar.instance;
        ewklVar.getClass();
        ewkrVar.c = ewklVar;
        ewkrVar.b = 1;
        ewkr ewkrVar2 = (ewkr) ewkqVar.build();
        emkmVarA.copyOnWrite();
        emkr emkrVar = (emkr) emkmVarA.instance;
        emkr emkrVar2 = emkr.a;
        ewkrVar2.getClass();
        emkrVar.f = ewkrVar2;
        emkrVar.e = 22;
        dexwVar.c(context, (emkr) emkmVarA.build(), ewqu.TELEPHONY_EVENT);
    }

    @Override // defpackage.dhem
    public final void c(ewkp ewkpVar) throws PackageManager.NameNotFoundException {
        dhes dhesVar = this.b;
        dexw dexwVar = this.c;
        if (dexwVar.e(dhesVar.k())) {
            return;
        }
        Context context = this.a;
        emkm emkmVarA = dexwVar.a(context, emko.CARRIER_SERVICES_EVENT_SOURCE_RCS);
        ewkq ewkqVar = (ewkq) ewkr.a.createBuilder();
        ewkqVar.copyOnWrite();
        ewkr ewkrVar = (ewkr) ewkqVar.instance;
        ewkpVar.getClass();
        ewkrVar.c = ewkpVar;
        ewkrVar.b = 4;
        ewkr ewkrVar2 = (ewkr) ewkqVar.build();
        emkmVarA.copyOnWrite();
        emkr emkrVar = (emkr) emkmVarA.instance;
        emkr emkrVar2 = emkr.a;
        ewkrVar2.getClass();
        emkrVar.f = ewkrVar2;
        emkrVar.e = 22;
        dexwVar.c(context, (emkr) emkmVarA.build(), ewqu.TELEPHONY_EVENT);
    }
}
