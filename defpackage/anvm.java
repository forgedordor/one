package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvm extends fcyz implements fdat {
    int a;
    final /* synthetic */ anvq b;
    final /* synthetic */ alqm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvm(fcxy fcxyVar, anvq anvqVar, alqm alqmVar) {
        super(2, fcxyVar);
        this.b = anvqVar;
        this.c = alqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anvm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dzub dzubVar;
        boolean zBooleanValue;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                dzubVar = (dzub) this.d;
                fctl.b(obj);
            } else {
                fctl.b(obj);
                anvq anvqVar = this.b;
                dzub dzubVarD = ((dzuc) anvqVar.c.b()).d();
                defn defnVarB = ((ddhv) anvqVar.b.b()).b(cdmm.a(this.c));
                this.d = dzubVarD;
                this.a = 1;
                obj = febo.a(defnVarB, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                dzubVar = dzubVarD;
            }
            Boolean bool = (Boolean) obj;
            zBooleanValue = bool.booleanValue();
            ((dzuc) this.b.c.b()).f(dzubVar, cdmd.a, null, dzua.SUCCESS);
            ekrw ekrwVarH = anvq.a.h();
            ekrwVarH.X(eksq.a, "BugleTrustedContacts");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.S, "RecipientTrustedContactsApiImpl");
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/kids/RecipientsTrustedContactsApiImpl$isDestinationInAllowlist$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 213, "RecipientsTrustedContactsApiImpl.kt")).t("Is number allowed by parents: %s", bool);
        } catch (Exception e) {
            ekrw ekrwVarJ = anvq.a.j();
            ekrwVarJ.X(eksq.a, "BugleTrustedContacts");
            ekrd ekrdVar2 = (ekrd) ((ekrd) ekrwVarJ).g(e);
            ekrdVar2.X(cqnc.S, "RecipientTrustedContactsApiImpl");
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/kids/RecipientsTrustedContactsApiImpl$isDestinationInAllowlist$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 220, "RecipientsTrustedContactsApiImpl.kt")).q("Exception thrown by the Family Link API when querying isAllowed");
        }
        boolean z = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        anvm anvmVar = new anvm(fcxyVar, this.b, this.c);
        anvmVar.d = obj;
        return anvmVar;
    }
}
