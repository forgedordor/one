package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atoh extends fcyz implements fdat {
    int a;
    final /* synthetic */ auip b;
    final /* synthetic */ atol c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atoh(auip auipVar, atol atolVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = auipVar;
        this.c = atolVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atoh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                auip auipVar = this.b;
                auim auimVar = (auim) evsn.parseFrom(auim.a, auipVar.e, evrr.a());
                auimVar.getClass();
                String str = this.d;
                auil auilVar = (auil) auimVar.toBuilder();
                auilVar.getClass();
                auilVar.copyOnWrite();
                auim auimVar2 = (auim) auilVar.instance;
                auimVar2.b |= 1;
                auimVar2.c = str;
                auim auimVarA = auin.a(auilVar);
                auio auioVar = (auio) auipVar.toBuilder();
                auioVar.getClass();
                auiq.b(auimVarA.toByteString(), auioVar);
                eiju eijuVarG = this.c.d.g(auiq.a(auioVar));
                eijuVarG.getClass();
                this.a = 1;
                obj = fdxs.c(eijuVarG, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            auis auisVar = (auis) obj;
            aubl aublVar = auisVar.c;
            if (aublVar == null) {
                aublVar = aubl.a;
            }
            aubk aubkVarB = aubk.b(aublVar.c);
            if (aubkVarB == null) {
                aubkVarB = aubk.UNKNOWN_STATUS;
            }
            if (aubkVarB != aubk.PENDING) {
                atol atolVar = this.c;
                String str2 = this.d;
                aubl aublVar2 = auisVar.c;
                if (aublVar2 == null) {
                    aublVar2 = aubl.a;
                }
                aublVar2.getClass();
                atolVar.a(str2, aublVar2);
            }
        } catch (Exception e) {
            ((ekrd) ((ekrd) atol.a.j()).g(e).h("com/google/android/apps/messaging/shared/chatapi/groups/UpdateGroupChatHandler$callChatApi$1", "invokeSuspend", 103, "UpdateGroupChatHandler.kt")).q("Failed to call Chat API to update group chat");
            atol atolVar2 = this.c;
            String str3 = this.d;
            aubg aubgVar = (aubg) aubl.a.createBuilder();
            aubgVar.getClass();
            aubm.b(aubk.FAILED_PERMANENTLY, aubgVar);
            atolVar2.a(str3, aubm.a(aubgVar));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atoh(this.b, this.c, this.d, fcxyVar);
    }
}
