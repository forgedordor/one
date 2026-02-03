package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eobg implements evsv {
    static final evsv a = new eobg();

    private eobg() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        eobh eobhVar;
        switch (i) {
            case 0:
                eobhVar = eobh.UNKNOWN;
                break;
            case 1:
                eobhVar = eobh.BUCKET_ZERO;
                break;
            case 2:
                eobhVar = eobh.BUCKET_1_TO_2;
                break;
            case 3:
                eobhVar = eobh.BUCKET_2_TO_4;
                break;
            case 4:
                eobhVar = eobh.BUCKET_4_TO_8;
                break;
            case 5:
                eobhVar = eobh.BUCKET_8_TO_16;
                break;
            case 6:
                eobhVar = eobh.BUCKET_16_TO_32;
                break;
            case 7:
                eobhVar = eobh.BUCKET_32_TO_64;
                break;
            case 8:
                eobhVar = eobh.BUCKET_64_TO_128;
                break;
            case 9:
                eobhVar = eobh.BUCKET_128_TO_256;
                break;
            case 10:
                eobhVar = eobh.BUCKET_256_TO_512;
                break;
            case 11:
                eobhVar = eobh.BUCKET_512_TO_1024;
                break;
            case 12:
                eobhVar = eobh.BUCKET_1024_OR_MORE;
                break;
            default:
                eobhVar = null;
                break;
        }
        return eobhVar != null;
    }
}
