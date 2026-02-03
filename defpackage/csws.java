package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.gms.duokit.GenerateInviteLinkRequest;
import com.google.android.gms.duokit.GenerateInviteLinkResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csws extends fcyz implements fdat {
    int a;
    final /* synthetic */ cswx b;
    final /* synthetic */ ResolvedRecipient c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csws(fcxy fcxyVar, cswx cswxVar, ResolvedRecipient resolvedRecipient) {
        super(2, fcxyVar);
        this.b = cswxVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csws) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                GenerateInviteLinkRequest generateInviteLinkRequest = new GenerateInviteLinkRequest();
                cswx cswxVar = this.b;
                generateInviteLinkRequest.a = cswx.i(this.c);
                generateInviteLinkRequest.b = csyh.b.d;
                defn defnVarA = cswxVar.b.a(generateInviteLinkRequest);
                this.a = 1;
                obj = auwr.a(defnVarA, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return ((GenerateInviteLinkResponse) obj).a;
        } catch (Exception e) {
            ekrw ekrwVarJ = cswx.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/video/BugleVideoCalling2$generateDuoInviteLink$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 153, "BugleVideoCalling2.kt")).q("generateDuoInviteLink failed");
            return null;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csws cswsVar = new csws(fcxyVar, this.b, this.c);
        cswsVar.d = obj;
        return cswsVar;
    }
}
