package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhu {
    public static final cloc a(int i) {
        cloc clocVar;
        switch (i - 2) {
            case 0:
                clocVar = cloc.SESSION_STATUS_UNKNOWN;
                break;
            case 1:
                clocVar = cloc.SESSION_STATUS_OFF;
                break;
            case 2:
                clocVar = cloc.SESSION_STATUS_DEMO;
                break;
            case 3:
                clocVar = cloc.SESSION_STATUS_NON_EMERGENCY;
                break;
            case 4:
                clocVar = cloc.SESSION_STATUS_EMERGENCY;
                break;
            case 5:
                clocVar = cloc.SESSION_STATUS_DISABLING;
                break;
            case 6:
                clocVar = cloc.SESSION_STATUS_ENDING_EMERGENCY;
                break;
            case 7:
                clocVar = cloc.SESSION_STATUS_NON_STARGATE_SESSION;
                break;
            default:
                clocVar = cloc.UNRECOGNIZED;
                break;
        }
        clocVar.getClass();
        return clocVar;
    }
}
