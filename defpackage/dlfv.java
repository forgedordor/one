package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlfv implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ ics b;
    final /* synthetic */ long c;
    final /* synthetic */ khk d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ jyq g;

    public dlfv(String str, ics icsVar, long j, khk khkVar, int i, int i2, jyq jyqVar) {
        this.a = str;
        this.b = icsVar;
        this.c = j;
        this.d = khkVar;
        this.e = i;
        this.f = i2;
        this.g = jyqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dthx.b(this.a, this.b, this.c, 0L, null, null, 0L, this.d, 0L, this.e, false, this.f, 0, null, this.g, hmlVar, 0, 0, 54776);
        }
        return fctx.a;
    }
}
