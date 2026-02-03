package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ybs implements fdat {
    final /* synthetic */ yby a;
    final /* synthetic */ ics b;
    final /* synthetic */ igr c;
    final /* synthetic */ hsf d;

    public ybs(yby ybyVar, ics icsVar, igr igrVar, hsf hsfVar) {
        this.a = ybyVar;
        this.b = icsVar;
        this.c = igrVar;
        this.d = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            yby ybyVar = this.a;
            djcy djcyVar = ybyVar.a;
            djew djewVar = djcyVar.d;
            djew djewVarA = djew.a(djewVar, null, null, null, null, null, false, djev.a(djewVar.g, true, 1), 63);
            djcv djcvVar = djcyVar.a;
            djcr djcrVar = djcyVar.e;
            djdo.a(new djgb(new djcy(djcvVar, djcyVar.b, djcyVar.c, djewVarA, djcrVar, djcyVar.f, djcyVar.g), ybyVar.d, null, 3, ((Number) this.d.a()).floatValue(), false, ybyVar.e, 32), this.b, this.c, hmlVar, 0, 0);
        }
        return fctx.a;
    }
}
