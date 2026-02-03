package com.google.android.apps.messaging.voiceactions;

import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.auvw;
import defpackage.daoz;
import defpackage.dapa;
import defpackage.efre;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.fcsu;
import defpackage.fcyi;
import defpackage.fdjz;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BugleSearchActionVerificationClientService extends efre {
    private static final eksp c = eksp.c("BugleConversation");
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private boolean g = false;

    /* compiled from: PG */
    public interface a {
        dapa dg();

        fcsu gi();

        void iI();

        void iK();
    }

    private static void b(a aVar, Intent intent, int i, ConversationId conversationId, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        dapa dapaVarDg = aVar.dg();
        try {
            auvw.c(dapaVarDg.a, fcyi.a, fdjz.a, new daoz(dapaVarDg, i, intent, conversationId, str, z, z2, z3, z4, null)).get(10L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((eksl) ((eksl) ((eksl) c.j()).g(e)).h("com/google/android/apps/messaging/voiceactions/BugleSearchActionVerificationClientService", "handleIntent", 189, "BugleSearchActionVerificationClientService.java")).r("Blocked for more than %d seconds waiting for the voice action handler to complete.", 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[PHI: r9
      0x0082: PHI (r9v3 boolean) = (r9v2 boolean), (r9v4 boolean) binds: [B:33:0x007b, B:36:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[PHI: r13
      0x0089: PHI (r13v2 boolean) = (r13v1 boolean), (r13v3 boolean) binds: [B:37:0x0082, B:40:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    @Override // defpackage.efre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Intent r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.voiceactions.BugleSearchActionVerificationClientService.a(android.content.Intent, boolean):void");
    }
}
