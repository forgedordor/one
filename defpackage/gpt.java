package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpt implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ gxi b;
    final /* synthetic */ String c;
    final /* synthetic */ fdap d;
    final /* synthetic */ boolean e;
    final /* synthetic */ jyq f;
    final /* synthetic */ fae g;
    final /* synthetic */ fad h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;
    final /* synthetic */ kfp k;
    final /* synthetic */ fdat l;
    final /* synthetic */ fdat m;
    final /* synthetic */ ikp n;
    final /* synthetic */ ebk o;

    public gpt(ics icsVar, gxi gxiVar, String str, fdap fdapVar, boolean z, jyq jyqVar, fae faeVar, fad fadVar, int i, int i2, kfp kfpVar, ebk ebkVar, fdat fdatVar, fdat fdatVar2, ikp ikpVar) {
        this.a = icsVar;
        this.b = gxiVar;
        this.c = str;
        this.d = fdapVar;
        this.e = z;
        this.f = jyqVar;
        this.g = faeVar;
        this.h = fadVar;
        this.i = i;
        this.j = i2;
        this.k = kfpVar;
        this.o = ebkVar;
        this.l = fdatVar;
        this.m = fdatVar2;
        this.n = ikpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVar = this.a;
            hmlVar.v(-903106918);
            hmlVar.o();
            ics icsVarA = egq.a(hlb.a(icsVar.a(ics.e), false, hjw.b(R.string.default_error_message, hmlVar)), 280.0f, 56.0f);
            gxi gxiVar = this.b;
            ikt iktVar = new ikt(gxiVar.b(false));
            String str = this.c;
            fdap fdapVar = this.d;
            boolean z = this.e;
            jyq jyqVar = this.f;
            fae faeVar = this.g;
            fad fadVar = this.h;
            int i2 = this.i;
            int i3 = this.j;
            kfp kfpVar = this.k;
            ebk ebkVar = this.o;
            ewj.c(str, fdapVar, icsVarA, z, jyqVar, faeVar, fadVar, false, i2, i3, kfpVar, null, ebkVar, iktVar, hxe.d(-1189274459, new gps(str, z, kfpVar, ebkVar, this.l, this.m, gxiVar, this.n), hmlVar), hmlVar, 0, 196608, 4096);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
