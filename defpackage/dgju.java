package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgju extends dexs implements dgjt {
    private static final dhip b = new dhip("DroidGuardLogger");
    private final Context c;
    private final dhjb d;

    public dgju(Context context, dfxx dfxxVar, dhes dhesVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emko.CARRIER_SERVICES_EVENT_SOURCE_RCS, eoscVar, dexwVar);
        this.c = context;
        this.d = new dhjb(dbyl.l(context, "CARRIER_SERVICES"));
    }

    @Override // defpackage.dgjt
    public final void a(ewcy ewcyVar, Optional optional) {
        emkm emkmVarK = K(this.c);
        if (emkmVarK == null) {
            dhja.h(b, "Could not create DroidGuard token creation event", new Object[0]);
            return;
        }
        ewfl ewflVar = (ewfl) ewfm.a.createBuilder();
        String str = (String) optional.orElse("unknown");
        ewflVar.copyOnWrite();
        ewfm ewfmVar = (ewfm) ewflVar.instance;
        str.getClass();
        ewfmVar.b |= 1;
        ewfmVar.c = str;
        ewflVar.copyOnWrite();
        ewfm ewfmVar2 = (ewfm) ewflVar.instance;
        ewcyVar.getClass();
        ewfmVar2.h = ewcyVar;
        ewfmVar2.b |= 16384;
        ewfm ewfmVar3 = (ewfm) ewflVar.build();
        emkmVarK.copyOnWrite();
        emkr emkrVar = (emkr) emkmVarK.instance;
        emkr emkrVar2 = emkr.a;
        ewfmVar3.getClass();
        emkrVar.f = ewfmVar3;
        emkrVar.e = 13;
        ((dbyk) this.d.a((emkr) emkmVarK.build()).get()).c();
    }
}
