package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxt implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ boolean b;
    final /* synthetic */ gxi c;
    final /* synthetic */ kew d;
    final /* synthetic */ fdap e;
    final /* synthetic */ boolean f;
    final /* synthetic */ jyq g;
    final /* synthetic */ fae h;
    final /* synthetic */ fad i;
    final /* synthetic */ int j;
    final /* synthetic */ int k;
    final /* synthetic */ kfp l;
    final /* synthetic */ fdat m;
    final /* synthetic */ fdat n;
    final /* synthetic */ fdat o;
    final /* synthetic */ ikp p;
    final /* synthetic */ ebk q;

    public gxt(ics icsVar, boolean z, gxi gxiVar, kew kewVar, fdap fdapVar, boolean z2, jyq jyqVar, fae faeVar, fad fadVar, int i, int i2, kfp kfpVar, ebk ebkVar, fdat fdatVar, fdat fdatVar2, fdat fdatVar3, ikp ikpVar) {
        this.a = icsVar;
        this.b = z;
        this.c = gxiVar;
        this.d = kewVar;
        this.e = fdapVar;
        this.f = z2;
        this.g = jyqVar;
        this.h = faeVar;
        this.i = fadVar;
        this.j = i;
        this.k = i2;
        this.l = kfpVar;
        this.q = ebkVar;
        this.m = fdatVar;
        this.n = fdatVar2;
        this.o = fdatVar3;
        this.p = ikpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVar = this.a;
            boolean z = this.b;
            ics icsVarA = egq.a(hlb.a(icsVar, z, hjw.b(R.string.default_error_message, hmlVar)), 280.0f, 56.0f);
            gxi gxiVar = this.c;
            ikt iktVar = new ikt(gxiVar.b(z));
            kew kewVar = this.d;
            fdap fdapVar = this.e;
            boolean z2 = this.f;
            jyq jyqVar = this.g;
            fae faeVar = this.h;
            fad fadVar = this.i;
            int i2 = this.j;
            int i3 = this.k;
            kfp kfpVar = this.l;
            ebk ebkVar = this.q;
            ewj.d(kewVar, fdapVar, icsVarA, z2, jyqVar, faeVar, fadVar, true, i2, i3, kfpVar, null, ebkVar, iktVar, hxe.d(-609710734, new gxs(kewVar, z2, kfpVar, ebkVar, z, this.m, this.n, this.o, this.p, gxiVar), hmlVar), hmlVar, 0, 196608, 4096);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
