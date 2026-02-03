package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class thy extends fdbo implements fdat {
    public thy(Object obj) {
        super(2, obj, tib.class, "unblockAction", "unblockAction(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws IOException {
        String str = (String) obj;
        fdat fdatVar = (fdat) obj2;
        str.getClass();
        fdatVar.getClass();
        tib tibVar = (tib) this.g;
        eieh eiehVarA = tibVar.d.a("BlockedParticipantListItemUiAdapter#unblockAction");
        try {
            auvw.k(tibVar.e, null, null, new thz(tibVar, str, fdatVar, null), 3);
            fczl.a(eiehVarA, null);
            return fctx.a;
        } finally {
        }
    }
}
