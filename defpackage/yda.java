package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class yda extends fdbo implements fdap {
    public yda(Object obj) {
        super(1, obj, yek.class, "onMostRecentMessageDisplayedOrChanged", "onMostRecentMessageDisplayedOrChanged(Lcom/google/android/libraries/communications/ux/components/message/MessageUiData;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        dkfe dkfeVar = (dkfe) obj;
        dkfeVar.getClass();
        yek yekVar = (yek) this.g;
        zue zueVar = yekVar.U;
        ecem.c();
        boolean z = dkfeVar instanceof yki;
        if (z) {
            zueVar.b.L(((yki) dkfeVar).c, 1);
        }
        ekqg ekqgVarListIterator = ((ekph) yekVar.p).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            zol zolVar = (zol) ekqgVarListIterator.next();
            if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && z && (zolVar.a instanceof PenpalBotConversationId)) {
                yki ykiVar = (yki) dkfeVar;
                if (ykm.q(ykiVar.c)) {
                    synchronized (zolVar.c) {
                        if (zolVar.d.add(ykiVar.f)) {
                            fcsu fcsuVar = zolVar.b;
                            if (((agxz) fcsuVar.b()).c.get() > 0) {
                                AtomicInteger atomicInteger = ((agxz) fcsuVar.b()).c;
                                if (atomicInteger.get() > 0) {
                                    atomicInteger.decrementAndGet();
                                } else {
                                    ((ekrd) agxz.a.j().h("com/google/android/apps/messaging/penpal/telemetry/PenpalBotResponseTrackerImpl", "decrementPendingResponse", 38, "PenpalBotResponseTrackerImpl.kt")).q("No pending response to decrement.");
                                }
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return fctx.a;
    }
}
