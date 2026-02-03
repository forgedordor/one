package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ajej extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        elpf elpfVar = (elpf) obj;
        switch (elpfVar) {
            case UNSPECIFIED:
                return bvec.UNKNOWN;
            case TELEPHONY:
                return bvec.TELEPHONY;
            case SLM:
                return bvec.SLM;
            case TELEPHONY_UNSPECIFIED:
                return bvec.TELEPHONY_UNSPECIFIED;
            case TELEPHONY_IMS:
                return bvec.TELEPHONY_IMS;
            case TELEPHONY_CARRIER_APP:
                return bvec.TELEPHONY_CARRIER_APP;
            case TRANSPORT_NOT_SELECTED:
                return bvec.TRANSPORT_NOT_SELECTED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(elpfVar.toString()));
        }
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        bvec bvecVar = (bvec) obj;
        switch (bvecVar) {
            case UNKNOWN:
                return elpf.UNSPECIFIED;
            case TELEPHONY:
                return elpf.TELEPHONY;
            case SLM:
                return elpf.SLM;
            case TELEPHONY_UNSPECIFIED:
                return elpf.TELEPHONY_UNSPECIFIED;
            case TELEPHONY_IMS:
                return elpf.TELEPHONY_IMS;
            case TELEPHONY_CARRIER_APP:
                return elpf.TELEPHONY_CARRIER_APP;
            case TRANSPORT_NOT_SELECTED:
                return elpf.TRANSPORT_NOT_SELECTED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(bvecVar.toString()));
        }
    }
}
