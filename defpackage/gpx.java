package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpx implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ fdat b;
    final /* synthetic */ boolean c;
    final /* synthetic */ gxi d;
    final /* synthetic */ kew e;
    final /* synthetic */ fdap f;
    final /* synthetic */ boolean g;
    final /* synthetic */ jyq h;
    final /* synthetic */ fae i;
    final /* synthetic */ fad j;
    final /* synthetic */ boolean k;
    final /* synthetic */ int l;
    final /* synthetic */ int m;
    final /* synthetic */ kfp n;
    final /* synthetic */ fdat o;
    final /* synthetic */ fdat p;
    final /* synthetic */ fdat q;
    final /* synthetic */ ikp r;
    final /* synthetic */ ebk s;

    public gpx(ics icsVar, fdat fdatVar, boolean z, gxi gxiVar, kew kewVar, fdap fdapVar, boolean z2, jyq jyqVar, fae faeVar, fad fadVar, boolean z3, int i, int i2, kfp kfpVar, ebk ebkVar, fdat fdatVar2, fdat fdatVar3, fdat fdatVar4, ikp ikpVar) {
        this.a = icsVar;
        this.b = fdatVar;
        this.c = z;
        this.d = gxiVar;
        this.e = kewVar;
        this.f = fdapVar;
        this.g = z2;
        this.h = jyqVar;
        this.i = faeVar;
        this.j = fadVar;
        this.k = z3;
        this.l = i;
        this.m = i2;
        this.n = kfpVar;
        this.s = ebkVar;
        this.o = fdatVar2;
        this.p = fdatVar3;
        this.q = fdatVar4;
        this.r = ikpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ics icsVarJ;
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVar = this.a;
            fdat fdatVar = this.b;
            if (fdatVar != null) {
                hmlVar.v(-1901539802);
                ico icoVar = ics.e;
                Object objF = hmlVar.f();
                if (objF == hmk.a) {
                    objF = new fdap() { // from class: gpu
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                icsVarJ = efy.j(jsh.c(icoVar, true, (fdap) objF), 0.0f, hlb.f(hmlVar), 0.0f, 0.0f, 13);
                hmlVar.o();
            } else {
                hmlVar.v(-1901156115);
                hmlVar.o();
                icsVarJ = ics.e;
            }
            ics icsVarA = icsVar.a(icsVarJ);
            boolean z = this.c;
            ics icsVarA2 = egq.a(hlb.a(icsVarA, z, hjw.b(R.string.default_error_message, hmlVar)), 280.0f, 56.0f);
            gxi gxiVar = this.d;
            ikt iktVar = new ikt(gxiVar.b(z));
            kew kewVar = this.e;
            fdap fdapVar = this.f;
            boolean z2 = this.g;
            jyq jyqVar = this.h;
            fae faeVar = this.i;
            fad fadVar = this.j;
            boolean z3 = this.k;
            int i2 = this.l;
            int i3 = this.m;
            kfp kfpVar = this.n;
            ebk ebkVar = this.s;
            ewj.d(kewVar, fdapVar, icsVarA2, z2, jyqVar, faeVar, fadVar, z3, i2, i3, kfpVar, null, ebkVar, iktVar, hxe.d(674541106, new gpw(kewVar, z2, z3, kfpVar, ebkVar, z, fdatVar, this.o, this.p, this.q, gxiVar, this.r), hmlVar), hmlVar, 0, 196608, 4096);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
