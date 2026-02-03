package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlgk implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ float d;
    final /* synthetic */ ics e;
    final /* synthetic */ long f;
    final /* synthetic */ jyq g;
    final /* synthetic */ jyk h;
    final /* synthetic */ jyi i;
    final /* synthetic */ float j;
    final /* synthetic */ float k;
    final /* synthetic */ List l;
    final /* synthetic */ boolean m;
    final /* synthetic */ boolean n;
    final /* synthetic */ fdat o;
    final /* synthetic */ icc p;

    public dlgk(String str, String str2, String str3, float f, ics icsVar, long j, jyq jyqVar, jyk jykVar, jyi jyiVar, float f2, float f3, icc iccVar, List list, boolean z, boolean z2, fdat fdatVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = icsVar;
        this.f = j;
        this.g = jyqVar;
        this.h = jykVar;
        this.i = jyiVar;
        this.j = f2;
        this.k = f3;
        this.p = iccVar;
        this.l = list;
        this.m = z;
        this.n = z2;
        this.o = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlgq.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.p, this.l, this.m, this.n, this.o, hmlVar, 1073741824, 0);
        }
        return fctx.a;
    }
}
