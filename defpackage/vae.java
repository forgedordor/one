package defpackage;

import com.android.vcard.VCardConfig;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vae implements uzw {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fcsu f;

    public vae(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.e = fdjxVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.f = fcsuVar3;
        this.c = fcsuVar4;
        this.d = fcsuVar5;
    }

    public static final boolean o() {
        return ((Boolean) crbf.ba.e()).booleanValue() || ((Boolean) crbf.bd.e()).booleanValue();
    }

    private final void p(ellg ellgVar) {
        q(new vac(ellgVar, null));
    }

    private final void q(fdap fdapVar) {
        auvw.k(this.e, null, null, new vad(this, fdapVar, null), 3);
    }

    private static final void r(Throwable th, enst enstVar) {
        enstVar.copyOnWrite();
        ensx.a((ensx) enstVar.instance);
        Throwable cause = th.getCause();
        if (cause instanceof ejde) {
            ejde ejdeVar = (ejde) cause;
            Integer numB = ejdeVar.b();
            if (numB != null) {
                int iIntValue = numB.intValue();
                enstVar.copyOnWrite();
                ensx ensxVar = (ensx) enstVar.instance;
                ensxVar.b |= 16;
                ensxVar.f = iIntValue;
            }
            Integer numA = ejdeVar.a();
            if (numA != null) {
                int iIntValue2 = numA.intValue();
                enstVar.copyOnWrite();
                ensx ensxVar2 = (ensx) enstVar.instance;
                ensxVar2.b |= 32;
                ensxVar2.g = iIntValue2;
            }
        }
    }

    @Override // defpackage.uzw
    public final void a(int i) {
        auvw.k(this.e, null, null, new uzx(this, i, null), 3);
    }

    @Override // defpackage.uzw
    public final void b(Throwable th) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_ERROR;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        enst enstVar = (enst) ensx.a.createBuilder();
        enstVar.copyOnWrite();
        ensx ensxVar = (ensx) enstVar.instance;
        ensxVar.c = 2;
        ensxVar.b |= 1;
        fcsu fcsuVar = this.f;
        enstVar.copyOnWrite();
        ensx ensxVar2 = (ensx) enstVar.instance;
        ensxVar2.d = vaf.b(th) - 1;
        ensxVar2.b = 2 | ensxVar2.b;
        ensv ensvVarA = vaf.a(th);
        enstVar.copyOnWrite();
        ensx ensxVar3 = (ensx) enstVar.instance;
        ensxVar3.e = ensvVarA.m;
        ensxVar3.b |= 4;
        if (o()) {
            r(th, enstVar);
        }
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ensx ensxVar4 = (ensx) enstVar.build();
        ensxVar4.getClass();
        ellhVar2.bD = ensxVar4;
        ellhVar2.g |= 65536;
        p(ellgVar);
    }

    @Override // defpackage.uzw
    public final void c() {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_ERROR;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        enst enstVar = (enst) ensx.a.createBuilder();
        enstVar.copyOnWrite();
        ensx ensxVar = (ensx) enstVar.instance;
        ensxVar.c = 2;
        ensxVar.b |= 1;
        enstVar.copyOnWrite();
        ensx ensxVar2 = (ensx) enstVar.instance;
        ensxVar2.d = 1;
        ensxVar2.b |= 2;
        ensv ensvVar = ensv.MAGIC_COMPOSE_MAGIC_REWRITE_WITHOUT_DRAFT;
        enstVar.copyOnWrite();
        ensx ensxVar3 = (ensx) enstVar.instance;
        ensxVar3.e = ensvVar.m;
        ensxVar3.b |= 4;
        if (o()) {
            enstVar.copyOnWrite();
            ensx.a((ensx) enstVar.instance);
        }
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ensx ensxVar4 = (ensx) enstVar.build();
        ensxVar4.getClass();
        ellhVar2.bD = ensxVar4;
        ellhVar2.g |= 65536;
        p(ellgVar);
    }

    @Override // defpackage.uzw
    public final void d(Throwable th) {
        th.getClass();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_ERROR;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        enst enstVar = (enst) ensx.a.createBuilder();
        enstVar.copyOnWrite();
        ensx ensxVar = (ensx) enstVar.instance;
        ensxVar.c = 1;
        ensxVar.b = 1 | ensxVar.b;
        fcsu fcsuVar = this.f;
        enstVar.copyOnWrite();
        ensx ensxVar2 = (ensx) enstVar.instance;
        ensxVar2.d = vaf.b(th) - 1;
        ensxVar2.b |= 2;
        ensv ensvVarA = vaf.a(th);
        enstVar.copyOnWrite();
        ensx ensxVar3 = (ensx) enstVar.instance;
        ensxVar3.e = ensvVarA.m;
        ensxVar3.b |= 4;
        if (o()) {
            r(th, enstVar);
        }
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ensx ensxVar4 = (ensx) enstVar.build();
        ensxVar4.getClass();
        ellhVar2.bD = ensxVar4;
        ellhVar2.g |= 65536;
        p(ellgVar);
    }

    @Override // defpackage.uzw
    public final void e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        q(new uzy(z, this, o(), z2, z6, z3, z4, z5, z7, null));
    }

    @Override // defpackage.uzw
    public final void f(epiv epivVar) {
        q(new uzz(this, epivVar, null));
    }

    @Override // defpackage.uzw
    public final void g(boolean z) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_SETTING;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        entk entkVar = (entk) entm.a.createBuilder();
        entkVar.copyOnWrite();
        entm entmVar = (entm) entkVar.instance;
        entmVar.c = (true != z ? 3 : 2) - 1;
        entmVar.b |= 1;
        if (o()) {
            entkVar.copyOnWrite();
            entm entmVar2 = (entm) entkVar.instance;
            entmVar2.b |= 2;
            entmVar2.d = true;
        }
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        entm entmVar3 = (entm) entkVar.build();
        entmVar3.getClass();
        ellhVar2.bJ = entmVar3;
        ellhVar2.g |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        p(ellgVar);
    }

    @Override // defpackage.uzw
    public final void h() {
        auvw.k(this.e, null, null, new vaa(this, null), 3);
    }

    @Override // defpackage.uzw
    public final void i(String str) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_FEEDBACK;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        entb entbVar = (entb) entc.a.createBuilder();
        entbVar.copyOnWrite();
        entc entcVar = (entc) entbVar.instance;
        entcVar.c = 2;
        entcVar.b |= 1;
        ento entoVar = (ento) Map.EL.getOrDefault(((vao) this.b.b()).a, str, ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED);
        entbVar.copyOnWrite();
        entc entcVar2 = (entc) entbVar.instance;
        entcVar2.d = entoVar.i;
        entcVar2.b |= 2;
        entbVar.copyOnWrite();
        entc entcVar3 = (entc) entbVar.instance;
        entcVar3.e = 2;
        entcVar3.b |= 4;
        if (o()) {
            entbVar.copyOnWrite();
            entc.a((entc) entbVar.instance);
        }
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        entc entcVar4 = (entc) entbVar.build();
        entcVar4.getClass();
        ellhVar2.bz = entcVar4;
        ellhVar2.g |= 2048;
        p(ellgVar);
    }

    @Override // defpackage.uzw
    public final void j() {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_FEEDBACK;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        entb entbVar = (entb) entc.a.createBuilder();
        entbVar.copyOnWrite();
        entc entcVar = (entc) entbVar.instance;
        entcVar.c = 1;
        entcVar.b = 1 | entcVar.b;
        entbVar.copyOnWrite();
        entc entcVar2 = (entc) entbVar.instance;
        entcVar2.e = 2;
        entcVar2.b |= 4;
        if (o()) {
            entbVar.copyOnWrite();
            entc.a((entc) entbVar.instance);
        }
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        entc entcVar3 = (entc) entbVar.build();
        entcVar3.getClass();
        ellhVar2.bz = entcVar3;
        ellhVar2.g |= 2048;
        p(ellgVar);
    }

    @Override // defpackage.uzw
    public final void k(String str) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_FEEDBACK;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        entb entbVar = (entb) entc.a.createBuilder();
        entbVar.copyOnWrite();
        entc entcVar = (entc) entbVar.instance;
        entcVar.c = 2;
        entcVar.b |= 1;
        ento entoVar = (ento) Map.EL.getOrDefault(((vao) this.b.b()).a, str, ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED);
        entbVar.copyOnWrite();
        entc entcVar2 = (entc) entbVar.instance;
        entcVar2.d = entoVar.i;
        entcVar2.b |= 2;
        entbVar.copyOnWrite();
        entc entcVar3 = (entc) entbVar.instance;
        entcVar3.e = 1;
        entcVar3.b |= 4;
        if (o()) {
            entbVar.copyOnWrite();
            entc.a((entc) entbVar.instance);
        }
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        entc entcVar4 = (entc) entbVar.build();
        entcVar4.getClass();
        ellhVar2.bz = entcVar4;
        ellhVar2.g |= 2048;
        p(ellgVar);
    }

    @Override // defpackage.uzw
    public final void l() {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_FEEDBACK;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        entb entbVar = (entb) entc.a.createBuilder();
        entbVar.copyOnWrite();
        entc entcVar = (entc) entbVar.instance;
        entcVar.c = 1;
        entcVar.b |= 1;
        entbVar.copyOnWrite();
        entc entcVar2 = (entc) entbVar.instance;
        entcVar2.e = 1;
        entcVar2.b |= 4;
        if (o()) {
            entbVar.copyOnWrite();
            entc.a((entc) entbVar.instance);
        }
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        entc entcVar3 = (entc) entbVar.build();
        entcVar3.getClass();
        ellhVar2.bz = entcVar3;
        ellhVar2.g |= 2048;
        p(ellgVar);
    }

    @Override // defpackage.uzw
    public final void m(enta entaVar) {
        evsf builder = entaVar.toBuilder();
        ensy ensyVar = (ensy) builder;
        if (o()) {
            ensyVar.copyOnWrite();
            enta entaVar2 = (enta) ensyVar.instance;
            entaVar2.b |= 256;
            entaVar2.p = true;
        }
        builder.getClass();
        auvw.k(this.e, null, null, new vab(ensyVar, this, null), 3);
    }

    @Override // defpackage.uzw
    public final void n(int i) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_CONSENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ensm ensmVar = (ensm) enso.a.createBuilder();
        ensmVar.copyOnWrite();
        enso ensoVar = (enso) ensmVar.instance;
        ensoVar.c = i - 1;
        ensoVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enso ensoVar2 = (enso) ensmVar.build();
        ensoVar2.getClass();
        ellhVar2.bA = ensoVar2;
        ellhVar2.g |= 4096;
        p(ellgVar);
    }
}
