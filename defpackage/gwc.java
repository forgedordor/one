package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwc extends icr implements jcd {
    public hsf a;
    public int b;
    public dew c;
    private ddp d;
    private ddp e;
    private kir f;
    private kir g;

    public gwc(hsf hsfVar, int i, dew dewVar) {
        this.a = hsfVar;
        this.b = i;
        this.c = dewVar;
    }

    @Override // defpackage.jcd
    public final ixn b(final ixp ixpVar, ixk ixkVar, long j) {
        if (((List) this.a.a()).isEmpty()) {
            return ixpVar.ej(0, 0, fcvp.a, new fdap() { // from class: gvy
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return fctx.a;
                }
            });
        }
        float f = ((gwp) ((List) this.a.a()).get(this.b)).b;
        kir kirVar = this.g;
        if (kirVar != null) {
            ddp ddpVar = this.e;
            if (ddpVar == null) {
                ddpVar = new ddp(kirVar, diu.c, null, 12);
                this.e = ddpVar;
            }
            if (!kir.b(f, ((kir) ddpVar.c()).a)) {
                fdil.d(E(), null, null, new gwa(ddpVar, f, this, null), 3);
            }
        } else {
            this.g = new kir(f);
        }
        final float f2 = ((gwp) ((List) this.a.a()).get(this.b)).a;
        kir kirVar2 = this.f;
        if (kirVar2 != null) {
            ddp ddpVar2 = this.d;
            if (ddpVar2 == null) {
                ddpVar2 = new ddp(kirVar2, diu.c, null, 12);
                this.d = ddpVar2;
            }
            if (!kir.b(f2, ((kir) ddpVar2.c()).a)) {
                fdil.d(E(), null, null, new gwb(ddpVar2, f2, this, null), 3);
            }
        } else {
            this.f = new kir(f2);
        }
        if (ixpVar.q() == kji.a) {
            ddp ddpVar3 = this.d;
            if (ddpVar3 != null) {
                f2 = ((kir) ddpVar3.d()).a;
            }
        } else {
            ddp ddpVar4 = this.d;
            if (ddpVar4 != null) {
                f2 = ((kir) ddpVar4.d()).a;
            }
            f2 = -f2;
        }
        ddp ddpVar5 = this.e;
        if (ddpVar5 != null) {
            f = ((kir) ddpVar5.d()).a;
        }
        final iyl iylVarE = ixkVar.e(kil.m(j, ixpVar.ep(f), ixpVar.ep(f), 0, 0, 12));
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: gvz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((iyk) obj).s(iylVarE, ixpVar.ep(f2), 0, 0.0f);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }
}
