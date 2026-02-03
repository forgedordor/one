package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxtv extends fcyz implements fdau {
    final /* synthetic */ LoadMessagesReceiver a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxtv(LoadMessagesReceiver loadMessagesReceiver, long j, boolean z, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.a = loadMessagesReceiver;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new cxtv(this.a, this.b, this.c, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        LoadMessagesReceiver loadMessagesReceiver = this.a;
        long jA = ((cogw) loadMessagesReceiver.l().b()).a();
        ekrg ekrgVar = LoadMessagesReceiver.d;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleDiagnostics");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver$loadMessagesFromFile$4", "invokeSuspend", 164, "LoadMessagesReceiver.kt")).s("Completed in %d ms", jA - this.b);
        if (this.c) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleDiagnostics");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver$loadMessagesFromFile$4", "invokeSuspend", 166, "LoadMessagesReceiver.kt")).q("Requesting full blocking sync");
            ((cmqf) loadMessagesReceiver.g().b()).q(true);
            ((cmqf) loadMessagesReceiver.g().b()).k(enqq.FAKE_MESSAGE_GENERATOR);
        }
        return fctx.a;
    }
}
