package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjg implements vdy {
    public final ConversationId a;
    public final afzc b;
    public final Optional c;
    private final ahax d;
    private final fcsu e;
    private final fdpl f;
    private final Set g;

    public vjg(Context context, ConversationId conversationId, zqm zqmVar, afzc afzcVar, Optional optional, ahax ahaxVar, fcsu fcsuVar) {
        context.getClass();
        conversationId.getClass();
        zqmVar.getClass();
        afzcVar.getClass();
        ahaxVar.getClass();
        this.a = conversationId;
        this.b = afzcVar;
        this.c = optional;
        this.d = ahaxVar;
        this.e = fcsuVar;
        this.f = new vjf(zqmVar.a(), this, context);
        this.g = fcwm.b(zqx.b);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.f;
    }

    public final void c(final ajlt ajltVar) {
        ajltVar.getClass();
        if (!ajltVar.u()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (((Boolean) ((cczi) crtr.V.get()).e()).booleanValue()) {
            ((vjl) this.e.b()).a(ajltVar, new fdap() { // from class: vja
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ajlt ajltVar2 = (ajlt) obj;
                    ajltVar2.getClass();
                    this.a.b.h(new agcy(ajltVar2));
                    return fctx.a;
                }
            });
            return;
        }
        if (crtr.e()) {
            String strB = ajltVar.g().b();
            strB.getClass();
            if (fdgn.t(strB, "image")) {
                this.c.isPresent();
                if (((amvy) ajltVar.g()).h() != amvx.DISPLAY) {
                    this.d.e(new fdap() { // from class: vjb
                        /* JADX WARN: Type inference failed for: r1v1, types: [aaef, java.lang.Object] */
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            final ahat ahatVar = (ahat) obj;
                            ahatVar.getClass();
                            final vjg vjgVar = this.a;
                            ?? r1 = vjgVar.c.get();
                            fdae fdaeVar = new fdae() { // from class: viy
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ahatVar.a();
                                    return fctx.a;
                                }
                            };
                            final ajlt ajltVar2 = ajltVar;
                            return r1.a(fdaeVar, new fdae() { // from class: viz
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ahatVar.a();
                                    vjgVar.b.h(new agcy(ajltVar2));
                                    return fctx.a;
                                }
                            });
                        }
                    });
                    return;
                } else {
                    this.b.h(new agcy(ajltVar));
                    return;
                }
            }
        }
        this.b.h(new agcy(ajltVar));
    }
}
