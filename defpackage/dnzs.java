package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnzs extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dnzt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnzs(dnzt dnztVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnztVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnzs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4 = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            dnzt dnztVar = this.c;
            obj2 = dnztVar.f;
            dnztVar.f = dnzo.a;
            if (!(obj2 instanceof dnzn)) {
                return null;
            }
            fdlr fdlrVar = ((dnzn) obj2).b;
            this.a = obj2;
            this.b = 1;
            if (fdlrVar.o(this) != obj4) {
            }
            return obj4;
        }
        if (i != 1) {
            obj3 = this.a;
            fctl.b(obj);
            dnzn dnznVar = (dnzn) obj3;
            dnznVar.c.close();
            ((ekrd) dnzt.a.h().h("com/google/android/libraries/compose/gif/encoder/GifRecorder$stopRecording$2", "invokeSuspend", 120, "GifRecorder.kt")).q("Finished GIF recording.");
            return dnznVar.a;
        }
        obj2 = this.a;
        fctl.b(obj);
        dnzt dnztVar2 = this.c;
        this.a = obj2;
        this.b = 2;
        dnzl dnzlVar = dnztVar2.d;
        Object objA = fdin.a(dnzlVar.b.hE(), new dnzi(dnzlVar, null), this);
        if (objA != obj4) {
            objA = fctx.a;
        }
        if (objA != obj4) {
            obj3 = obj2;
            dnzn dnznVar2 = (dnzn) obj3;
            dnznVar2.c.close();
            ((ekrd) dnzt.a.h().h("com/google/android/libraries/compose/gif/encoder/GifRecorder$stopRecording$2", "invokeSuspend", 120, "GifRecorder.kt")).q("Finished GIF recording.");
            return dnznVar2.a;
        }
        return obj4;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnzs(this.c, fcxyVar);
    }
}
