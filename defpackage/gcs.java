package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcs extends fcyz implements fdau {
    /* synthetic */ long a;
    final /* synthetic */ gcw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcs(gcw gcwVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = gcwVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((ihs) obj2).a;
        gcs gcsVar = new gcs(this.b, (fcxy) obj3);
        gcsVar.a = j;
        return gcsVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        long j = this.a;
        gcw gcwVar = this.b;
        gcwVar.e = Float.intBitsToFloat((int) (j >> 32));
        gcwVar.f = Float.intBitsToFloat((int) (j & 4294967295L));
        return fctx.a;
    }
}
