package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elhb implements evsv {
    static final evsv a = new elhb();

    private elhb() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elhc elhcVar;
        switch (i) {
            case 0:
                elhcVar = elhc.UNKNOWN_BUGLE_CONTENT_TYPE;
                break;
            case 1:
                elhcVar = elhc.TEXT;
                break;
            case 2:
                elhcVar = elhc.IMAGE;
                break;
            case 3:
                elhcVar = elhc.VIDEO;
                break;
            case 4:
                elhcVar = elhc.AUDIO;
                break;
            case 5:
                elhcVar = elhc.VCARD;
                break;
            case 6:
                elhcVar = elhc.PDF;
                break;
            case 7:
                elhcVar = elhc.CALENDAR;
                break;
            case 8:
                elhcVar = elhc.DOC;
                break;
            case 9:
                elhcVar = elhc.PPT;
                break;
            case 10:
                elhcVar = elhc.XLS;
                break;
            case 11:
                elhcVar = elhc.TXT;
                break;
            case 12:
                elhcVar = elhc.HTML;
                break;
            case 13:
                elhcVar = elhc.COMPRESSED;
                break;
            case 14:
                elhcVar = elhc.APPLICATION;
                break;
            case 15:
                elhcVar = elhc.APPLICATION_XML;
                break;
            case 16:
                elhcVar = elhc.APPLICATION_RTF;
                break;
            case 17:
                elhcVar = elhc.APPLICATION_JSON;
                break;
            case 18:
                elhcVar = elhc.APPLICATION_BINARY;
                break;
            default:
                elhcVar = null;
                break;
        }
        return elhcVar != null;
    }
}
