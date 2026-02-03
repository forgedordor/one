package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcc {
    public static final aubl a(MessagingResult messagingResult) {
        int iB;
        aubi aubiVar;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = messagingResult.equals(MessagingResult.d) ? aubk.OK : messagingResult.equals(MessagingResult.e) ? aubk.PENDING : (messagingResult.equals(MessagingResult.f) || (iB = messagingResult.b()) == 14 || iB == 15) ? aubk.FAILED_PERMANENTLY : aubk.FAILED_TRANSIENTLY;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        switch (messagingResult.a()) {
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
