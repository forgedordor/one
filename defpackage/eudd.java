package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eudd implements evsy {
    @Override // defpackage.evsy
    public final /* bridge */ /* synthetic */ Object a(int i) {
        eudg eudgVar;
        switch (i) {
            case 0:
                eudgVar = eudg.REQUEST_MASK_CONTAINER_UNKNOWN;
                break;
            case 1:
                eudgVar = eudg.PROFILE;
                break;
            case 2:
                eudgVar = eudg.CONTACT;
                break;
            case 3:
                eudgVar = eudg.CIRCLE;
                break;
            case 4:
                eudgVar = eudg.PLACE;
                break;
            case 5:
                eudgVar = eudg.ACCOUNT;
                break;
            case 6:
                eudgVar = eudg.EXTERNAL_ACCOUNT;
                break;
            case 7:
                eudgVar = eudg.DOMAIN_PROFILE;
                break;
            case 8:
                eudgVar = eudg.DOMAIN_CONTACT;
                break;
            case 9:
                eudgVar = eudg.DEVICE_CONTACT;
                break;
            case 10:
                eudgVar = eudg.GOOGLE_GROUP;
                break;
            case 11:
                eudgVar = eudg.AFFINITY;
                break;
            case 12:
            case 16:
            default:
                eudgVar = null;
                break;
            case 13:
                eudgVar = eudg.RAW_DEVICE_CONTACT;
                break;
            case 14:
                eudgVar = eudg.CONTACT_ANNOTATION;
                break;
            case 15:
                eudgVar = eudg.DELEGATED_CONTACT;
                break;
            case 17:
                eudgVar = eudg.CHAT_ROOM;
                break;
        }
        return eudgVar == null ? eudg.UNRECOGNIZED : eudgVar;
    }
}
