package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
enum ebem implements ebrw {
    INIT,
    ACCEPTING,
    ACCEPTED,
    CONNECTING,
    CONNECTED,
    AUTHENTICATING,
    AUTHENTICATED,
    ACTIVE,
    CLOSING,
    CLOSED,
    FAILED;

    public static final ebrv l;
    public static final ebrv m;
    public static final ebrv n;
    public static final ebrv o;
    private static final ebrx q;

    static {
        ebem ebemVar = INIT;
        ebem ebemVar2 = ACCEPTING;
        ebem ebemVar3 = ACCEPTED;
        ebem ebemVar4 = CONNECTING;
        ebem ebemVar5 = CONNECTED;
        ebem ebemVar6 = AUTHENTICATING;
        ebem ebemVar7 = AUTHENTICATED;
        ebem ebemVar8 = ACTIVE;
        ebem ebemVar9 = CLOSING;
        ebem ebemVar10 = CLOSED;
        ebem ebemVar11 = FAILED;
        ebrx ebrxVar = new ebrx(ekgp.j(ekgp.l(SocketTimeoutException.class, ebemVar8)));
        q = ebrxVar;
        ekhy ekhyVar = new ekhy();
        ekhyVar.d(ebemVar, ebemVar4);
        ekhyVar.d(ebemVar4, ebemVar5, ebemVar9);
        ekhyVar.d(ebemVar5, ebemVar8, ebemVar9);
        ekhyVar.d(ebemVar8, ebemVar8, ebemVar9);
        ekhyVar.d(ebemVar9, ebemVar9, ebemVar10);
        l = new ebrv(ebemVar, ebemVar11, ekhyVar.a(), ekgp.l(ebemVar8, ebrxVar));
        ekhy ekhyVar2 = new ekhy();
        ekhyVar2.d(ebemVar, ebemVar2);
        ekhyVar2.d(ebemVar2, ebemVar2, ebemVar5, ebemVar9);
        ekhyVar2.d(ebemVar5, ebemVar8, ebemVar9);
        ekhyVar2.d(ebemVar8, ebemVar8, ebemVar9);
        ekhyVar2.d(ebemVar9, ebemVar9, ebemVar10);
        m = new ebrv(ebemVar, ebemVar11, ekhyVar2.a(), ekgp.l(ebemVar8, ebrxVar));
        ekhy ekhyVar3 = new ekhy();
        ekhyVar3.d(ebemVar, ebemVar3);
        ekhyVar3.d(ebemVar3, ebemVar8, ebemVar9);
        ekhyVar3.d(ebemVar8, ebemVar8, ebemVar9);
        ekhyVar3.d(ebemVar9, ebemVar9, ebemVar10);
        n = new ebrv(ebemVar, ebemVar11, ekhyVar3.a(), ekgp.l(ebemVar8, ebrxVar));
        ekhy ekhyVar4 = new ekhy();
        ekhyVar4.d(ebemVar, ebemVar4);
        ekhyVar4.d(ebemVar4, ebemVar5, ebemVar9);
        ekhyVar4.d(ebemVar5, ebemVar6, ebemVar9);
        ekhyVar4.d(ebemVar6, ebemVar7, ebemVar9);
        ekhyVar4.d(ebemVar7, ebemVar8, ebemVar9);
        ekhyVar4.d(ebemVar8, ebemVar8, ebemVar9);
        ekhyVar4.d(ebemVar9, ebemVar9, ebemVar10);
        o = new ebrv(ebemVar, ebemVar11, ekhyVar4.a(), ekgp.l(ebemVar8, ebrxVar));
        ekhy ekhyVar5 = new ekhy();
        ekhyVar5.d(ebemVar, ebemVar2);
        ekhyVar5.d(ebemVar2, ebemVar2, ebemVar5, ebemVar9);
        ekhyVar5.d(ebemVar5, ebemVar6, ebemVar9);
        ekhyVar5.d(ebemVar6, ebemVar7, ebemVar9);
        ekhyVar5.d(ebemVar7, ebemVar8, ebemVar9);
        ekhyVar5.d(ebemVar8, ebemVar8, ebemVar9);
        ekhyVar5.d(ebemVar9, ebemVar9, ebemVar10);
        new ebrv(ebemVar, ebemVar11, ekhyVar5.a(), ekgp.l(ebemVar8, ebrxVar));
        ekhy ekhyVar6 = new ekhy();
        ekhyVar6.d(ebemVar, ebemVar3);
        ekhyVar6.d(ebemVar3, ebemVar8, ebemVar9);
        ekhyVar6.d(ebemVar8, ebemVar8, ebemVar9);
        ekhyVar6.d(ebemVar9, ebemVar9, ebemVar10);
        new ebrv(ebemVar, ebemVar11, ekhyVar6.a(), ekgp.l(ebemVar8, ebrxVar));
    }
}
