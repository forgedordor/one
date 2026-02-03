package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctim implements fdat {
    final /* synthetic */ ctiu a;

    public ctim(ctiu ctiuVar) {
        this.a = ctiuVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ctwo ctwoVar = (ctwo) this.a.a().b.b();
            boolean z = ctwoVar.a.b;
            cudh cudhVarA = ctwoVar.b.a();
            asdy asdyVar = ctwoVar.i;
            ctxd.d(new ctwr(z, cudhVarA, !asdyVar.a() ? ctwoVar.c.a() : null, asdyVar.a() ? ctwoVar.c.b() : null, ctwoVar.l.d, ctwoVar.d.a(), ctwoVar.f.c(), ctwoVar.j.b, ctwoVar.e.f(), ctwoVar.k.a, new ctwq(((asdu) ctwoVar.g.b()).a(), ctwoVar.h.a())), hmlVar, 0);
        }
        return fctx.a;
    }
}
