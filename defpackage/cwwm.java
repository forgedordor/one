package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwwm extends cwvo implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cwwq b;
    private Context c;
    private final lvn d = new lvn(this);
    private boolean e;

    @Deprecated
    public cwwm() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cwwq.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x0005, B:5:0x001d, B:7:0x002f, B:9:0x003d, B:10:0x006b), top: B:19:0x0005 }] */
    @Override // defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            eics r0 = r2.a
            r0.k()
            r2.q(r3, r4, r5)     // Catch: java.lang.Throwable -> L73
            cwwq r4 = r2.H()     // Catch: java.lang.Throwable -> L73
            r3.getClass()     // Catch: java.lang.Throwable -> L73
            eygg r3 = r4.b     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = r3.b()     // Catch: java.lang.Throwable -> L73
            j$.util.Optional r5 = (j$.util.Optional) r5     // Catch: java.lang.Throwable -> L73
            boolean r5 = r5.isPresent()     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L6b
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L73
            j$.util.Optional r3 = (j$.util.Optional) r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L73
            abdk r3 = (defpackage.abdk) r3     // Catch: java.lang.Throwable -> L73
            boolean r3 = r3.m()     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L6b
            fcsu r3 = r4.c     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = r3.b()     // Catch: java.lang.Throwable -> L73
            j$.util.Optional r5 = (j$.util.Optional) r5     // Catch: java.lang.Throwable -> L73
            boolean r5 = r5.isPresent()     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L6b
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L73
            j$.util.Optional r3 = (j$.util.Optional) r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L73
            abgm r3 = (defpackage.abgm) r3     // Catch: java.lang.Throwable -> L73
            fcsu r5 = r4.d     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L73
            egyt r5 = (defpackage.egyt) r5     // Catch: java.lang.Throwable -> L73
            cwwp r0 = new cwwp     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "ditto_satellite_mode_key"
            egys r1 = new egys     // Catch: java.lang.Throwable -> L73
            r1.<init>(r5, r0, r3)     // Catch: java.lang.Throwable -> L73
            fcsu r3 = r4.a     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L73
            ehac r3 = (defpackage.ehac) r3     // Catch: java.lang.Throwable -> L73
            cwwq$1 r4 = r4.e     // Catch: java.lang.Throwable -> L73
            r3.a(r1, r4)     // Catch: java.lang.Throwable -> L73
            goto L6e
        L6b:
            r4.b()     // Catch: java.lang.Throwable -> L73
        L6e:
            defpackage.eidc.q()
            r3 = 0
            return r3
        L73:
            r3 = move-exception
            defpackage.eidc.q()     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r4 = move-exception
            r3.addSuppressed(r4)
        L7c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwwm.M(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.d;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.cwvo, defpackage.ea
    public final void ag(Activity activity) {
        this.a.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwvo
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.c == null) {
            this.c = new ehnz(this, super.z());
        }
        return this.c;
    }

    @Override // defpackage.ehno, defpackage.eifl
    public final eiik bf() {
        return this.a.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehno, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.a.e(eiikVar, z);
    }

    @Override // defpackage.ehno, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.a.b = eiikVar;
    }

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cwwq H() {
        cwwq cwwqVar = this.b;
        if (cwwqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cwwqVar;
    }

    @Override // defpackage.cwvo, defpackage.ehno, defpackage.ea
    public final void g(Context context) {
        this.a.k();
        try {
            if (this.e) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.b == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/conversationlist/ShareIntentTabletModeCheckFragment", 85, cwwm.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/conversationlist/ShareIntentTabletModeCheckFragment", 90, cwwm.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof cwwm)) {
                                throw new IllegalStateException(a.M(eaVar, cwwq.class));
                            }
                            cwwm cwwmVar = (cwwm) eaVar;
                            eyik eyikVar = ((ahib) objBb).k;
                            ahhk ahhkVar = ((ahib) objBb).c;
                            eygg eyggVarA = eyie.a(ahhkVar.aJ);
                            eyik eyikVar2 = ((ahib) objBb).bi;
                            ahkn ahknVar = ((ahib) objBb).a;
                            this.b = new cwwq(cwwmVar, eyikVar, eyggVarA, eyikVar2, ahknVar.b.fg, ahhkVar.aF, ahknVar.dj);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.a, this.d));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.a.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void j() {
        eifp eifpVarA = this.a.a();
        try {
            p();
            this.e = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwvo, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
