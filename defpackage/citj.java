package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class citj {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final eygg d;
    private final fcsu e;
    private final asrf f;

    public citj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eygg eyggVar, fcsu fcsuVar4, asrf asrfVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = eyggVar;
        this.e = fcsuVar4;
        this.f = asrfVar;
    }

    private final void c(elmc elmcVar, enyw enywVar) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.Y = enywVar.h;
        elpgVar.d |= 2097152;
        elpg elpgVar2 = (elpg) elofVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        elpgVar2.getClass();
        ellhVar.l = elpgVar2;
        ellhVar.b |= 4;
        ellf ellfVar = ellf.BUGLE_GROUP;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.j = ellfVar.f11do;
        ellhVar2.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar3 = (ellh) ellgVar.instance;
        elmcVar.getClass();
        ellhVar3.B = elmcVar;
        ellhVar3.b |= 4194304;
        aillVar.j(ellgVar);
    }

    private final ellv d() {
        ellv ellvVar = (ellv) elmc.b.createBuilder();
        ellvVar.copyOnWrite();
        elmc elmcVar = (elmc) ellvVar.instance;
        elmcVar.d = 12;
        elmcVar.c |= 1;
        elpy elpyVarA = ((aimw) this.d.b()).a(((chvg) this.c.b()).a(chvn.u));
        ellvVar.copyOnWrite();
        elmc elmcVar2 = (elmc) ellvVar.instance;
        elmcVar2.g = elpyVarA;
        elmcVar2.c |= 8;
        enwr enwrVarA = ((chzn) this.e.b()).a();
        ellvVar.copyOnWrite();
        elmc elmcVar3 = (elmc) ellvVar.instance;
        elmcVar3.h = enwrVarA.N;
        elmcVar3.c |= 16;
        return ellvVar;
    }

    public final void a(ConversationIdType conversationIdType, int i) {
        String strB = ejwk.b(((chwq) this.b.b()).o(conversationIdType));
        ellv ellvVarD = d();
        ellvVarD.copyOnWrite();
        elmc elmcVar = (elmc) ellvVarD.instance;
        evsy evsyVar = elmc.a;
        elmcVar.c |= 64;
        elmcVar.j = strB;
        ellvVarD.copyOnWrite();
        elmc elmcVar2 = (elmc) ellvVarD.instance;
        elmcVar2.e = 1;
        elmcVar2.c |= 2;
        engp engpVar = (engp) engs.a.createBuilder();
        engpVar.copyOnWrite();
        engs engsVar = (engs) engpVar.instance;
        engsVar.c = i - 1;
        engsVar.b |= 1;
        ellvVarD.copyOnWrite();
        elmc elmcVar3 = (elmc) ellvVarD.instance;
        engs engsVar2 = (engs) engpVar.build();
        engsVar2.getClass();
        elmcVar3.m = engsVar2;
        elmcVar3.c |= 8192;
        c((elmc) ellvVarD.build(), this.f.a());
    }

    public final void b(String str, int i) {
        ellv ellvVarD = d();
        ellvVarD.copyOnWrite();
        elmc elmcVar = (elmc) ellvVarD.instance;
        evsy evsyVar = elmc.a;
        elmcVar.c |= 64;
        elmcVar.j = str;
        ellvVarD.copyOnWrite();
        elmc elmcVar2 = (elmc) ellvVarD.instance;
        elmcVar2.e = 1;
        elmcVar2.c |= 2;
        engp engpVar = (engp) engs.a.createBuilder();
        engpVar.copyOnWrite();
        engs engsVar = (engs) engpVar.instance;
        engsVar.d = i - 1;
        engsVar.b |= 2;
        ellvVarD.copyOnWrite();
        elmc elmcVar3 = (elmc) ellvVarD.instance;
        engs engsVar2 = (engs) engpVar.build();
        engsVar2.getClass();
        elmcVar3.m = engsVar2;
        elmcVar3.c |= 8192;
        c((elmc) ellvVarD.build(), this.f.a());
    }
}
