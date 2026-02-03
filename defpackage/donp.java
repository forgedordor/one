package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class donp extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ donr c;
    final /* synthetic */ fdap d;
    final /* synthetic */ fdap e;
    final /* synthetic */ donn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public donp(donr donrVar, fdap fdapVar, fdap fdapVar2, donn donnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = donrVar;
        this.d = fdapVar;
        this.e = fdapVar2;
        this.f = donnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((donp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.b != 0) {
                obj2 = this.a;
                fctl.b(obj);
            } else {
                fctl.b(obj);
                donr donrVar = this.c;
                fdap fdapVar = this.d;
                this.a = donrVar;
                this.b = 1;
                Object objInvoke = fdapVar.invoke(this);
                if (objInvoke == fcylVar) {
                    return fcylVar;
                }
                obj2 = donrVar;
                obj = objInvoke;
            }
            donr.G((donr) obj2, (dohs) obj, this.e, this.f, null, null, 112);
        } catch (Exception e) {
            ((ekrd) ((ekrd) donr.s.i()).g(e).h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$4", "invokeSuspend", 74, "MediaViewHolder.kt")).q("Unable to resolve media, showing error state");
            donr donrVar2 = this.c;
            raw.c(donrVar2.y).k(donrVar2.v);
            donrVar2.E();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new donp(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
