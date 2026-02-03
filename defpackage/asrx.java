package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asrx {
    public final asrf a;
    public final dghj b;
    public final fcsu c;
    private final fcsu d;

    public asrx(fcsu fcsuVar, asrf asrfVar, dghj dghjVar, fcsu fcsuVar2) {
        this.d = fcsuVar;
        this.a = asrfVar;
        this.b = dghjVar;
        this.c = fcsuVar2;
    }

    public final void a(basd basdVar, basd basdVar2) {
        elof elofVar = (elof) elpg.b.createBuilder();
        String strF = basdVar.f();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.c |= Integer.MIN_VALUE;
        elpgVar.H = strF;
        enyw enywVarA = this.a.a();
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.Y = enywVarA.h;
        elpgVar2.d |= 2097152;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.h = 5;
        elpgVar3.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.i = 12;
        elpgVar4.c |= 2;
        String strF2 = basdVar2.f();
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.d |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        elpgVar5.ae = strF2;
        d((elpg) elofVar.build());
    }

    public final void b(aufh aufhVar, enxu enxuVar) {
        elpg elpgVar = elpg.b;
        elof elofVar = (elof) elpgVar.createBuilder();
        String str = aufhVar.j;
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        str.getClass();
        elpgVar2.c |= Integer.MIN_VALUE;
        elpgVar2.H = str;
        elpg elpgVar3 = aufhVar.o;
        if (elpgVar3 != null) {
            elpgVar = elpgVar3;
        }
        enyw enywVarB = enyw.b(elpgVar.Y);
        if (enywVarB == null) {
            enywVarB = enyw.UNKNOWN_RCS_TYPE;
        }
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.Y = enywVarB.h;
        elpgVar4.d |= 2097152;
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.h = 8;
        elpgVar5.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elpgVar6.i = 15;
        elpgVar6.c |= 2;
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        enxuVar.getClass();
        elpgVar7.M = enxuVar;
        elpgVar7.d |= 1024;
        d((elpg) elofVar.build());
    }

    public final void c(aufh aufhVar) {
        e(aufhVar, enxk.CHAT_API_FAILED_PERMANENTLY, 10);
    }

    public final void d(elpg elpgVar) {
        aill aillVar = (aill) this.d.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpgVar.getClass();
        ellhVar2.l = elpgVar;
        ellhVar2.b |= 4;
        aillVar.j(ellgVar);
    }

    public final void e(aufh aufhVar, enxk enxkVar, int i) {
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxwVar.g = enxkVar.f;
        enxwVar.b |= 16;
        enxvVar.copyOnWrite();
        enxw enxwVar2 = (enxw) enxvVar.instance;
        enxwVar2.h = i - 1;
        enxwVar2.b |= 32;
        enxtVar.copyOnWrite();
        enxu enxuVar = (enxu) enxtVar.instance;
        enxw enxwVar3 = (enxw) enxvVar.build();
        enxwVar3.getClass();
        enxuVar.c = enxwVar3;
        enxuVar.b |= 1;
        b(aufhVar, (enxu) enxtVar.build());
    }
}
