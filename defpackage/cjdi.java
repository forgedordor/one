package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdi {
    public static aubl a(cjjb cjjbVar) {
        aubk aubkVar;
        aubi aubiVar;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        int iA = cjhf.a(cjjbVar.c);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        if (i == 1) {
            aubkVar = aubk.OK;
        } else if (i != 2) {
            aubkVar = aubk.UNKNOWN_STATUS;
        } else {
            cjkk cjkkVar = cjjbVar.e;
            if (cjkkVar == null) {
                cjkkVar = cjkk.a;
            }
            int iA2 = cjkj.a(cjkkVar.c);
            aubkVar = (iA2 != 0 && iA2 == 2) ? aubk.FAILED_TRANSIENTLY : aubk.FAILED_PERMANENTLY;
        }
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        switch ((cjhd.a(cjjbVar.d) != 0 ? r5 : 1) - 1) {
            case 1:
                aubiVar = aubi.GROUP_TOO_FEW_PARTICIPANTS;
                break;
            case 2:
                aubiVar = aubi.GROUP_TOO_MANY_PARTICIPANTS;
                break;
            case 3:
            case 5:
                aubiVar = aubi.USER_NOT_A_GROUP_PARTICIPANT;
                break;
            case 4:
                aubiVar = aubi.GROUP_NOT_FOUND;
                break;
            case 6:
                aubiVar = aubi.LOW_PRIORITY_MESSAGE_REJECTED;
                break;
            case 7:
                aubiVar = aubi.TRANSPORT_INTERNAL_ERROR;
                break;
            default:
                aubiVar = aubi.UNKNOWN_CAUSE;
                break;
        }
        aubgVar.copyOnWrite();
        aubl aublVar2 = (aubl) aubgVar.instance;
        aublVar2.d = aubiVar.v;
        aublVar2.b |= 2;
        return (aubl) aubgVar.build();
    }
}
