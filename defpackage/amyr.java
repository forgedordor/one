package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amyr extends fcyz implements fdat {
    int a;
    final /* synthetic */ amys b;
    final /* synthetic */ String c;
    final /* synthetic */ ajlt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amyr(amys amysVar, String str, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amysVar;
        this.c = str;
        this.d = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amyr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i != 0) {
            fctl.b(obj);
            if (i == 1) {
                this.b.d.ab();
            }
            return fctx.a;
        }
        fctl.b(obj);
        amys amysVar = this.b;
        String str = this.c;
        amgc amgcVar = (amgc) this.d.b();
        this.a = 2;
        obj = amysVar.c.b(str, amgcVar, this);
        if (obj == fcylVar) {
            return fcylVar;
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.d.ab();
        } else {
            ((ekrd) amys.a.j().h("com/google/android/apps/messaging/shared/api/messaging/message/emergency/DefaultEmergencyMessageTransformer$populateContent$2$1", "invokeSuspend", 50, "DefaultEmergencyMessageTransformer.kt")).q("Failed to update or insert questionnaire option");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amyr(this.b, this.c, this.d, fcxyVar);
    }
}
