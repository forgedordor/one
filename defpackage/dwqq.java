package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwqq {
    INVALID(0),
    INCOMING_RECEIVED(1),
    INCOMING_READ(2),
    INCOMING_READ_RECEIPT_SENT(3),
    OUTGOING_PENDING_SEND(4),
    OUTGOING_SENDING(5),
    OUTGOING_FAILED_SEND(6),
    OUTGOING_SENT(7),
    OUTGOING_DELIVERED(8),
    OUTGOING_READ(9),
    OUTGOING_FAILED_TO_DELIVER(10),
    LOCAL(11);

    public static final ekgb m;
    public static final ekhx n;
    public static final Integer[] o;
    public final int p;

    static {
        dwqq dwqqVar = OUTGOING_PENDING_SEND;
        dwqq dwqqVar2 = OUTGOING_SENDING;
        dwqq dwqqVar3 = OUTGOING_FAILED_SEND;
        dwqq dwqqVar4 = OUTGOING_SENT;
        dwqq dwqqVar5 = OUTGOING_DELIVERED;
        dwqq dwqqVar6 = OUTGOING_READ;
        dwqq dwqqVar7 = OUTGOING_FAILED_TO_DELIVER;
        dwqq dwqqVar8 = LOCAL;
        m = ekgb.u(dwqqVar, dwqqVar2, dwqqVar3, dwqqVar4);
        n = ekhx.v(dwqqVar, dwqqVar2, dwqqVar3, dwqqVar4, dwqqVar5, dwqqVar6, dwqqVar7, dwqqVar8);
        o = new Integer[]{Integer.valueOf(dwqqVar.p), Integer.valueOf(dwqqVar2.p), Integer.valueOf(dwqqVar3.p), Integer.valueOf(dwqqVar8.p)};
    }

    dwqq(int i) {
        this.p = i;
    }

    public static dwqq a(final int i) {
        return (dwqq) ekeh.e(values()).a(new ejwm() { // from class: dwqp
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                dwqq dwqqVar = dwqq.INVALID;
                return ((dwqq) obj).p == i;
            }
        }).e(INVALID);
    }
}
