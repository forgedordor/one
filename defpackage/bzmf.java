package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmf {
    public final bzmo a;
    public final fcyh b;
    public final fdjx c;

    public bzmf(bzmo bzmoVar, aurx aurxVar, fcyh fcyhVar, fdjx fdjxVar) {
        bzmoVar.getClass();
        aurxVar.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.a = bzmoVar;
        this.b = fcyhVar;
        this.c = fdjxVar;
    }

    public static final bmra a(byiv byivVar) {
        int i = byivVar.d;
        return i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 7 ? bmra.UNKNOWN_CMS_DATA_TYPE : byrx.d(byivVar.f) == 2 ? bmra.BACKUP_KEY_OBJECT : bmra.ENCRYPTION_KEY_OBJECT : bmra.MESSAGE_PART : bmra.PARTICIPANT : bmra.CONVERSATION : bmra.MESSAGE_OBJECT;
    }

    public static final bmqz b(byiv byivVar) {
        int i = byivVar.d;
        bmqz bmqzVarB = (i == 1 || i == 2 || i == 3) ? bzae.b(byivVar.f) : i != 5 ? i != 7 ? bmqz.BACKUP_UNKNOWN_OPERATION : byrx.e(byivVar.f) : byxz.c(byivVar.f);
        if (bmqzVarB == bmqz.BACKUP_CREATE) {
            return byivVar.g ? bmqz.INITIAL_BACKUP_CREATE : bmqz.INCREMENTAL_BACKUP_CREATE;
        }
        bmqzVarB.getClass();
        return bmqzVarB;
    }
}
