package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atya {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/incoming/MultiPartIncomingChatMessageProcessor");
    public final atyq b;
    public final atak c;
    public final atwc d;
    public final eosc e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    private final fcsu j;

    public atya(eosc eoscVar, atyq atyqVar, atak atakVar, atwc atwcVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.b = atyqVar;
        this.c = atakVar;
        this.d = atwcVar;
        this.e = eoscVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.j = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
    }

    public static enxu b(int i) {
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxk enxkVar = enxk.CHAT_API_FAILED_PERMANENTLY;
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxwVar.g = enxkVar.f;
        enxwVar.b |= 16;
        enxvVar.copyOnWrite();
        enxw enxwVar2 = (enxw) enxvVar.instance;
        enxwVar2.h = i - 1;
        enxwVar2.b |= 32;
        enxtVar.copyOnWrite();
        enxu enxuVar = (enxu) enxtVar.instance;
        enxw enxwVar3 = (enxw) enxvVar.build();
        enxwVar3.getClass();
        enxuVar.c = enxwVar3;
        enxuVar.b |= 1;
        return (enxu) enxtVar.build();
    }

    final eiju a(final aufl auflVar) {
        eieu eieuVarK = eiiy.k("MultiPartIncomingChatMessageProcessor#process");
        try {
            eieu eieuVarK2 = eiiy.k("MultiPartIncomingChatMessageProcessor#ensureProvisioningEngineIsInitialized");
            try {
                eiju eijuVarG = eiju.g(((dggw) this.j.b()).g());
                eieuVarK2.b(eijuVarG);
                eieuVarK2.close();
                eiju eijuVarI = eijuVarG.i(new eooz() { // from class: atxz
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0263  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x0294  */
                    @Override // defpackage.eooz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r20) {
                        /*
                            Method dump skipped, instructions count: 1265
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.atxz.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                }, this.e);
                eieuVarK.b(eijuVarI);
                eieuVarK.close();
                return eijuVarI;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
