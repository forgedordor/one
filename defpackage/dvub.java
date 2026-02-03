package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dvub extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        dvug dvugVar = (dvug) obj;
        dwpj dwpjVar = dwpj.UNKNOWN;
        int iOrdinal = dvugVar.ordinal();
        if (iOrdinal == 0) {
            return dwpj.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return dwpj.PHONE_NUMBER;
        }
        if (iOrdinal == 2) {
            return dwpj.EMAIL;
        }
        if (iOrdinal == 3) {
            return dwpj.HANDLER;
        }
        if (iOrdinal == 4) {
            return c();
        }
        if (iOrdinal == 5) {
            return dwpj.DEVICE_ID;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(dvugVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        dwpj dwpjVar = (dwpj) obj;
        int iOrdinal = dwpjVar.ordinal();
        if (iOrdinal == 0) {
            return dvug.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return dvug.PHONE_NUMBER;
        }
        if (iOrdinal == 2) {
            return dvug.EMAIL;
        }
        if (iOrdinal == 3) {
            return dvug.HANDLER;
        }
        if (iOrdinal == 4) {
            return dvug.DEVICE_ID;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(dwpjVar.toString()));
    }

    public abstract dwpj c();
}
