package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejsb implements evsy {
    @Override // defpackage.evsy
    public final /* bridge */ /* synthetic */ Object a(int i) {
        ejsv ejsvVar;
        switch (i) {
            case 0:
                ejsvVar = ejsv.OS;
                break;
            case 1:
                ejsvVar = ejsv.ARCH;
                break;
            case 2:
                ejsvVar = ejsv.BOARD_NAME;
                break;
            case 3:
                ejsvVar = ejsv.PRODUCT_NAME;
                break;
            case 4:
                ejsvVar = ejsv.SYSTEM_VERSION;
                break;
            case 5:
                ejsvVar = ejsv.CHANNEL;
                break;
            case 6:
            case 8:
            default:
                ejsvVar = null;
                break;
            case 7:
                ejsvVar = ejsv.BUILD_TYPE;
                break;
            case 9:
                ejsvVar = ejsv.EXPERIMENT_IDS;
                break;
            case 10:
                ejsvVar = ejsv.APP_VERSION;
                break;
        }
        return ejsvVar == null ? ejsv.UNRECOGNIZED : ejsvVar;
    }
}
