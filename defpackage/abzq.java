package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzq implements abzm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/gaia/autosignin/AutoSignInTooltipPresenterImpl");
    public final ea b;
    public final abzk c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public abzq(ea eaVar, abzk abzkVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = eaVar;
        this.c = abzkVar;
        this.f = fcsuVar;
        this.d = fcsuVar2;
        this.g = fcsuVar3;
        this.e = fcsuVar4;
    }

    @Override // defpackage.abzm
    public final ViewTreeObserver.OnGlobalLayoutListener a() {
        return new abzp(this);
    }

    @Override // defpackage.abzm
    public final void b() {
        ehbb ehbbVar = (ehbb) this.f.b();
        final fdap fdapVar = new fdap() { // from class: abzn
            /* JADX WARN: Removed duplicated region for block: B:127:0x0307  */
            /* JADX WARN: Type inference failed for: r8v11, types: [dymp] */
            @Override // defpackage.fdap
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r35) {
                /*
                    Method dump skipped, instructions count: 815
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.abzn.invoke(java.lang.Object):java.lang.Object");
            }
        };
        ehbbVar.g(R.id.auto_sign_in_local_subscription, this.c.g, new ehay() { // from class: abzo
            @Override // defpackage.ehay
            public final /* synthetic */ void a(Throwable th) {
                ehax.a(th);
            }

            @Override // defpackage.ehay
            public final void b(Object obj) {
                fdapVar.invoke(obj);
            }
        });
    }

    public final void c() {
        ((egzh) this.g.b()).a(eijx.e(null), abzk.b);
    }
}
