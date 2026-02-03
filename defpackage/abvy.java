package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvy implements cdej {
    private final eosc d;
    private final abwg e;

    public abvy(eosc eoscVar, abwg abwgVar) {
        this.d = eoscVar;
        this.e = abwgVar;
    }

    private static eyzv e(elny elnyVar) {
        int iOrdinal = elnyVar.ordinal();
        return iOrdinal != 2 ? (iOrdinal == 4 || iOrdinal == 6 || iOrdinal == 8) ? eyzv.NOTIFICATION_VIEW : eyzv.UNKNOWN_SOURCE : eyzv.CONVERSATION_VIEW;
    }

    @Override // defpackage.cdej
    public final eiju a(emig emigVar, eyzv eyzvVar, int i, List list, int i2, MessageIdType messageIdType) {
        return !((Boolean) a.e()).booleanValue() ? eijx.e(true) : this.e.a(elqn.P2P_SUGGESTION_CLICK, emigVar, ezac.UNKNOWN_REJECTION_REASON, eyzvVar, i, i2, list, messageIdType).h(new ejvr() { // from class: abvx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }, this.d);
    }

    @Override // defpackage.cdej
    public final eiju b(emig emigVar, elny elnyVar, int i, List list, MessageIdType messageIdType) {
        if (!((Boolean) a.e()).booleanValue()) {
            return eijx.e(true);
        }
        return this.e.a(elqn.P2P_SUGGESTION_RECEIVED_MESSAGE, emigVar, ezac.UNKNOWN_REJECTION_REASON, e(elnyVar), i, -1, list, messageIdType).h(new ejvr() { // from class: abvu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }, this.d);
    }

    @Override // defpackage.cdej
    public final eiju c(emig emigVar, int i, List list, ezac ezacVar, String str) {
        if (!((Boolean) a.e()).booleanValue()) {
            return eijx.e(true);
        }
        return this.e.a(elqn.P2P_SUGGESTION_REQUEST, emigVar, ezacVar, eyzv.UNKNOWN_SOURCE, i, -1, list, bary.b(str)).h(new ejvr() { // from class: abvv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }, this.d);
    }

    @Override // defpackage.cdej
    public final eiju d(emig emigVar, elny elnyVar, int i, List list, MessageIdType messageIdType) {
        if (!((Boolean) a.e()).booleanValue()) {
            return eijx.e(true);
        }
        return this.e.a(elqn.P2P_SUGGESTION_SENT_MESSAGE, emigVar, ezac.UNKNOWN_REJECTION_REASON, e(elnyVar), i, -1, list, messageIdType).h(new ejvr() { // from class: abvw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }, this.d);
    }
}
