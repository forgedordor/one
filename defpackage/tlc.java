package defpackage;

import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tlc implements egps<tld, Void> {
    final /* synthetic */ BlockAndReportSpamCallbacks a;

    public tlc(BlockAndReportSpamCallbacks blockAndReportSpamCallbacks) {
        this.a = blockAndReportSpamCallbacks;
    }

    @Override // defpackage.egps
    public final /* synthetic */ void c(Object obj, Object obj2) {
        tld tldVar = (tld) obj;
        tiv tivVarG = tiw.g();
        ((tir) tivVarG).a = tldVar.g();
        BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatusB = tldVar.b();
        participantBlockAndSpamStatusB.getClass();
        boolean zC = participantBlockAndSpamStatusB.c();
        BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatusB2 = tldVar.b();
        participantBlockAndSpamStatusB2.getClass();
        boolean zD = participantBlockAndSpamStatusB2.d();
        tivVarG.g(tldVar.i(), zC);
        tivVarG.h(tldVar.j(), zD);
        tivVarG.b(tldVar.a());
        ((tix) this.a.c.b()).c(tivVarG.f(), true);
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
