package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfiw implements cfjb {
    private static final eksp b = eksp.c("BugleGroupManagement");
    static final ejxr a = cdag.w(213466833, "send_mms_group_upgrade_capability_during_tachyon_registration");

    @Override // defpackage.cfjb
    public final eiju a(ezli ezliVar, alqm alqmVar, int i) {
        if (!((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            ((eksl) b.n().h("com/google/android/apps/messaging/shared/net/handler/decorators/MmsGroupUpgradeDecorator", "decorate", 40, "MmsGroupUpgradeDecorator.java")).q("Not sending the MMS group upgrade capability during Tachyon registration. Feature is disabled by Phenotype.");
            return eijx.e(ezliVar);
        }
        ((eksl) b.n().h("com/google/android/apps/messaging/shared/net/handler/decorators/MmsGroupUpgradeDecorator", "decorate", 49, "MmsGroupUpgradeDecorator.java")).q("Decorating Tachyon register data with the MMS group upgrade capability.");
        ezuu ezuuVar = ((ezlj) ezliVar.instance).l;
        if (ezuuVar == null) {
            ezuuVar = ezuu.a;
        }
        ezut ezutVar = (ezut) ezuuVar.toBuilder();
        ezutVar.a(cefn.MMS_GROUP_UPGRADE_METRICS_COLLECTION.h);
        ezuu ezuuVar2 = (ezuu) ezutVar.build();
        ezliVar.copyOnWrite();
        ezlj ezljVar = (ezlj) ezliVar.instance;
        ezuuVar2.getClass();
        ezljVar.l = ezuuVar2;
        ezljVar.b |= 8;
        return eijx.e(ezliVar);
    }
}
