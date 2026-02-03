package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hko implements fdat {
    final /* synthetic */ jyq a;
    final /* synthetic */ jyq b;
    final /* synthetic */ hsf c;
    final /* synthetic */ hsf d;
    final /* synthetic */ boolean e;
    final /* synthetic */ hsf f;
    final /* synthetic */ fdau g;
    final /* synthetic */ hkt h;

    public hko(jyq jyqVar, jyq jyqVar2, hsf hsfVar, hsf hsfVar2, boolean z, hsf hsfVar3, fdau fdauVar, hkt hktVar) {
        this.a = jyqVar;
        this.b = jyqVar2;
        this.c = hsfVar;
        this.d = hsfVar2;
        this.e = z;
        this.f = hsfVar3;
        this.g = fdauVar;
        this.h = hktVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            jyq jyqVarA = jyr.a(this.a, this.b, ((Number) this.c.a()).floatValue());
            boolean z = this.e;
            hsf hsfVar = this.f;
            if (z) {
                jyqVarA = jyq.y(jyqVarA, ((ije) hsfVar.a()).i, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            }
            hlb.d(((ije) this.d.a()).i, jyqVarA, hxe.d(1157484991, new hkn(this.g, this.h), hmlVar), hmlVar, 384);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
