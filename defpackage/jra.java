package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jra extends fcyz implements fdat {
    boolean a;
    int b;
    /* synthetic */ float c;
    final /* synthetic */ jrb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jra(jrb jrbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = jrbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jra) c(Float.valueOf(((Number) obj).floatValue()), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            z = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            float f = this.c;
            jsl jslVar = this.d.a;
            fdat fdatVarA = jrm.a(jslVar);
            if (fdatVarA == null) {
                itw.b("Required value was null.");
                throw new fcta();
            }
            boolean z2 = ((jry) jslVar.c.b(jte.u)).c;
            if (z2) {
                f = -f;
            }
            ihs ihsVar = new ihs((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.a = z2;
            this.b = 1;
            obj = fdatVarA.a(ihsVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            z = z2;
        }
        int i = (int) (4294967295L & ((ihs) obj).a);
        return new Float(z ? -Float.intBitsToFloat(i) : Float.intBitsToFloat(i));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        jra jraVar = new jra(this.d, fcxyVar);
        jraVar.c = ((Number) obj).floatValue();
        return jraVar;
    }
}
