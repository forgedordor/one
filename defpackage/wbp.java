package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wbp extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ wbv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbp(wbv wbvVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = wbvVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wbp wbpVar = new wbp(this.c, (fcxy) obj3);
        wbpVar.a = (String) obj;
        wbpVar.b = (Integer) obj2;
        return wbpVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r2 = this.a;
        Object obj2 = this.b;
        djcv djcvVarA = this.c.a();
        dpfy dpfyVar = djcvVarA.a;
        String str = djcvVarA.c;
        int i = djcvVarA.e;
        boolean z = djcvVarA.f;
        djgx djgxVar = djcvVarA.g;
        djcu djcuVar = djcvVarA.h;
        r2.getClass();
        return new djcv(dpfyVar, r2, str, (Integer) obj2, i, z, djgxVar, djcuVar);
    }
}
