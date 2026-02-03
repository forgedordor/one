package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class bzae {
    public static boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public static bmqz b(int i) {
        if (a(i, bzas.a(17))) {
            return bmqz.BACKUP_CREATE;
        }
        if (a(i, bzas.a(9))) {
            return bmqz.BACKUP_DELETE;
        }
        if (a(i, bzas.a(33))) {
            return bmqz.BACKUP_UPDATE;
        }
        if (a(i, bzas.a(5))) {
            return bmqz.BACKUP_UPDATE_RARE;
        }
        if (a(i, bzas.a(3))) {
            return bmqz.BACKUP_UPDATE_FREQUENT;
        }
        if (a(i, bzas.a(65))) {
            return bmqz.BACKUP_UPDATE_ADDITIONAL_FIELDS;
        }
        cqbd cqbdVarE = bzaf.b.e();
        cqbdVarE.I("Failed to parse OperationType from flags, returning unknown AbandonedAction");
        cqbdVarE.y("flags", i);
        cqbdVarE.r();
        return bmqz.BACKUP_UNKNOWN_OPERATION;
    }
}
