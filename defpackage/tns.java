package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tns extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cpyo cpyoVar = (cpyo) obj;
        int iOrdinal = cpyoVar.ordinal();
        if (iOrdinal == 0) {
            return cpyb.UNDEFINED;
        }
        if (iOrdinal == 1) {
            return cpyb.MULTI_DEVICE;
        }
        if (iOrdinal == 2) {
            return cpyb.BACKUP_AND_RESTORE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cpyoVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cpyb cpybVar = (cpyb) obj;
        int iOrdinal = cpybVar.ordinal();
        if (iOrdinal == 0) {
            return cpyo.CMS_FEATURE_UNDEFINED;
        }
        if (iOrdinal == 1) {
            return cpyo.CMS_FEATURE_MULTI_DEVICE;
        }
        if (iOrdinal == 2) {
            return cpyo.CMS_FEATURE_BACKUP_AND_RESTORE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cpybVar.toString()));
    }
}
