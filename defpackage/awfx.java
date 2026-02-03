package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class awfx implements egsc {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/conversation/match/logging/DeprecatedConversationMatchingLoggerWorker");
    final egsh a;
    final eosc b;

    public awfx(egsh egshVar, eosc eoscVar) {
        this.a = egshVar;
        this.b = eoscVar;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        ((ekrd) ((ekrd) c.h()).h("com/google/android/apps/messaging/shared/conversation/match/logging/DeprecatedConversationMatchingLoggerWorker", "startWork", 43, "DeprecatedConversationMatchingLoggerWorker.java")).q("ConversationMatchingLogger is deprecated. Cancelling future work.");
        return eiju.g(this.a.b(workerParameters.a)).h(new ejvr() { // from class: awfw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new qam();
            }
        }, this.b);
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
