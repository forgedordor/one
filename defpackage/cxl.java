package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxl implements fdpm {
    final /* synthetic */ dhk a;
    final /* synthetic */ hsf b;
    final /* synthetic */ hps c;

    public cxl(hps hpsVar, dhk dhkVar, hsf hsfVar) {
        this.c = hpsVar;
        this.a = dhkVar;
        this.b = hsfVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        boolean zBooleanValue;
        if (((Boolean) obj).booleanValue()) {
            fdat fdatVar = (fdat) this.b.a();
            dhk dhkVar = this.a;
            zBooleanValue = ((Boolean) fdatVar.a(dhkVar.e(), dhkVar.f())).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.c.b(Boolean.valueOf(zBooleanValue));
        return fctx.a;
    }
}
