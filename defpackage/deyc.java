package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deyc extends dexs {
    private final Context b;

    public deyc(Context context, dfxx dfxxVar, dhes dhesVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emko.CARRIER_SERVICES_EVENT_SOURCE_RCS, eoscVar, dexwVar);
        this.b = context;
    }

    public static ewku f(int i, String str, Optional optional) {
        final ewku ewkuVar = (ewku) ewkz.a.createBuilder();
        ewkuVar.copyOnWrite();
        ewkz ewkzVar = (ewkz) ewkuVar.instance;
        ewkzVar.c = i - 1;
        ewkzVar.b |= 1;
        ewkuVar.copyOnWrite();
        ewkz ewkzVar2 = (ewkz) ewkuVar.instance;
        str.getClass();
        ewkzVar2.b |= 32;
        ewkzVar2.h = str;
        optional.ifPresent(new Consumer() { // from class: deya
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ewku ewkuVar2 = ewkuVar;
                ewkuVar2.copyOnWrite();
                ewkz ewkzVar3 = (ewkz) ewkuVar2.instance;
                ewkz ewkzVar4 = ewkz.a;
                ewkzVar3.e = ((ewkt) obj).f;
                ewkzVar3.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ewkuVar;
    }

    public final deyb d(boolean z, String str) {
        return new deyb(this, str, true != z ? 4 : 5);
    }

    public final void e(ewku ewkuVar) {
        Context context = this.b;
        emkm emkmVarK = K(context);
        if (emkmVarK == null) {
            dhja.q("Unable to send :s/http/HTTP/ file transfer log. (event is null)", new Object[0]);
            return;
        }
        emkmVarK.copyOnWrite();
        emkr emkrVar = (emkr) emkmVarK.instance;
        ewkz ewkzVar = (ewkz) ewkuVar.build();
        emkr emkrVar2 = emkr.a;
        ewkzVar.getClass();
        emkrVar.f = ewkzVar;
        emkrVar.e = 37;
        M(context, (emkr) emkmVarK.build(), ewqu.FILE_TRANSFER_EVENT);
    }

    public final void g(int i, String str, int i2, Optional optional, final Optional optional2) {
        final ewku ewkuVarF = f(i, str, optional);
        ewkuVarF.copyOnWrite();
        ewkz ewkzVar = (ewkz) ewkuVarF.instance;
        ewkz ewkzVar2 = ewkz.a;
        ewkzVar.f = i2 - 1;
        ewkzVar.b |= 8;
        optional2.ifPresent(new Consumer() { // from class: dexz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ewkx ewkxVar = (ewkx) optional2.get();
                ewku ewkuVar = ewkuVarF;
                ewkuVar.copyOnWrite();
                ewkz ewkzVar3 = (ewkz) ewkuVar.instance;
                ewkz ewkzVar4 = ewkz.a;
                ewkzVar3.g = ewkxVar.n;
                ewkzVar3.b |= 16;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        e(ewkuVarF);
    }
}
