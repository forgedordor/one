package defpackage;

import com.google.android.apps.messaging.shared.fcm.impl.BugleFirebaseMessagingService;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cdcw extends FirebaseMessagingService implements eyhy {
    private volatile eyho a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final eyho ba() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new eyho(this);
                }
            }
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            Object objBb = bb();
            BugleFirebaseMessagingService bugleFirebaseMessagingService = (BugleFirebaseMessagingService) this;
            ekgi ekgiVarH = ekgp.h(6);
            ahij ahijVar = (ahij) objBb;
            ahkn ahknVar = ahijVar.b;
            ahng ahngVar = ahknVar.b;
            ekgiVarH.i("account_deleted", ahngVar.pz);
            ekgiVarH.i("", ahngVar.pA);
            ekgiVarH.i("check_tickle_connection", ahijVar.p);
            ekgiVarH.i("gnp_chime_message", ahngVar.pD);
            ekgiVarH.i("prewarm", ahngVar.pE);
            ekgiVarH.i("RCS_SERVICE_MESSAGE_PUSH", ahngVar.pF);
            bugleFirebaseMessagingService.a = ekgiVarH.c();
            ahnh ahnhVar = ahknVar.a;
            bugleFirebaseMessagingService.b = (ains) ahnhVar.c.b();
            bugleFirebaseMessagingService.c = (eigp) ahknVar.aI.b();
            bugleFirebaseMessagingService.d = ahnhVar.qr;
            bugleFirebaseMessagingService.e = ahnhVar.sh;
            bugleFirebaseMessagingService.f = ahnhVar.xO;
        }
        super.onCreate();
    }
}
