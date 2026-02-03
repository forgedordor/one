package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwwq {
    public final fcsu a;
    public final eygg b;
    public final fcsu c;
    public final fcsu d;
    public final AnonymousClass1 e;
    private final cwwm f;
    private final fcsu g;
    private final fcsu h;

    /* JADX WARN: Type inference failed for: r1v1, types: [cwwq$1] */
    public cwwq(cwwm cwwmVar, fcsu fcsuVar, eygg eyggVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        eyggVar.getClass();
        fcsuVar3.getClass();
        this.f = cwwmVar;
        this.a = fcsuVar;
        this.b = eyggVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.c = fcsuVar4;
        this.d = fcsuVar5;
        this.e = new egzv<abgx>() { // from class: cwwq.1
            @Override // defpackage.egzv
            public final void a(Throwable th) {
                th.getClass();
            }

            @Override // defpackage.egzv
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                abgx abgxVar = (abgx) obj;
                abgxVar.getClass();
                if (abgxVar != abgx.REMOTE) {
                    cwwq.this.b();
                    return;
                }
                final cwwq cwwqVar = cwwq.this;
                Optional optional = (Optional) cwwqVar.b.b();
                final fdap fdapVar = new fdap() { // from class: cwwn
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        abdk abdkVar = (abdk) obj2;
                        abdkVar.getClass();
                        abdkVar.d(cwwqVar.a().getIntent());
                        return fctx.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: cwwo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        fdapVar.invoke(obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                cwwqVar.a().finish();
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void hn() {
            }
        };
    }

    public final eg a() {
        return this.f.fg();
    }

    public final void b() {
        fcsu fcsuVar = this.g;
        if (((Optional) fcsuVar.b()).isPresent()) {
            IncomingDraft incomingDraftA = ((batn) this.h.b()).a(a().getIntent());
            if (incomingDraftA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ((aflz) ((Optional) fcsuVar.b()).get()).a(a(), null, incomingDraftA, envd.SHARE_INTENT);
            a().finish();
            return;
        }
        cwwe cwweVarAY = cwwe.aY();
        Bundle bundle = new Bundle(1);
        bundle.putInt("intent_source", envd.SHARE_INTENT.e);
        cwweVarAY.at(bundle);
        cwweVarAY.t(this.f.I(), "ShareIntentFragment");
    }
}
