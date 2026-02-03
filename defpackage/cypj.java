package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ditto.CameraSourcePreview;
import defpackage.eyhq;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cypj extends cyoz implements ehlg, eyhx, ehlc, ehnw, eifl {
    public final lvn a = new lvn(this);
    private boolean ag;
    private cypu d;
    private Context e;

    @Deprecated
    public cypj() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cypu.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            cypu cypuVarH = H();
            cyqh cyqhVar = cypuVarH.d;
            cqln cqlnVar = (cqln) cyqhVar.a.b();
            cqlnVar.getClass();
            ains ainsVar = (ains) cyqhVar.b.b();
            ainsVar.getClass();
            aipo aipoVar = (aipo) cyqhVar.c.b();
            aipoVar.getClass();
            fcsu fcsuVar = cyqhVar.d;
            eosc eoscVar = (eosc) cyqhVar.e.b();
            eoscVar.getClass();
            cypuVarH.k = new cyqg(cqlnVar, ainsVar, aipoVar, fcsuVar, eoscVar, cypuVarH);
            View viewInflate = layoutInflater.inflate(R.layout.mnext_qr_scanner_fragment, viewGroup, false);
            cypuVarH.p = (CameraSourcePreview) viewInflate.findViewById(R.id.camera_preview);
            cypuVarH.q = viewInflate.findViewById(R.id.qr_loading_overlay);
            TextView textView = (TextView) viewInflate.findViewById(R.id.qr_scanner_text_view);
            Activity activity = cypuVarH.i;
            textView.setText(Html.fromHtml(activity.getResources().getString(R.string.qr_code_scanner_hint_text, bvfd.i.e())));
            if (viewGroup != null) {
                viewGroup.setAccessibilityLiveRegion(1);
            } else {
                cpga.g(activity);
            }
            eidc.q();
            return viewInflate;
        } catch (Throwable th) {
            try {
                eidc.q();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.a;
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

    @Override // defpackage.cyoz, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            be();
            CameraSourcePreview cameraSourcePreview = H().p;
            dekh dekhVar = cameraSourcePreview.b;
            if (dekhVar != null) {
                dekhVar.b();
                cameraSourcePreview.d = false;
            }
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.c.b();
        try {
            bj();
            cypu cypuVarH = H();
            ((cyqg) cypuVarH.k).i();
            cypuVarH.e();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cyoz
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.e == null) {
            this.e = new ehnz(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cypu H() {
        cypu cypuVar = this.d;
        if (cypuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cypuVar;
    }

    @Override // defpackage.cyoz, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/ditto/QrScannerFragment", 85, cypj.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/ditto/QrScannerFragment", 90, cypj.class, "CreatePeer");
                        try {
                            ahkn ahknVar = ((ahib) objBb).a;
                            eyik eyikVar = ahknVar.b.oJ;
                            ahnh ahnhVar = ahknVar.a;
                            cyqh cyqhVar = new cyqh(eyikVar, ahnhVar.c, ahnhVar.us, ahnhVar.FP, ahknVar.p);
                            ahhk ahhkVar = ((ahib) objBb).c;
                            eyik eyikVar2 = ahhkVar.h;
                            cypi cypiVar = new cypi((Executor) ahknVar.p.b());
                            ehbb ehbbVar = (ehbb) ((ahib) objBb).f.b();
                            eigp eigpVar = (eigp) ahknVar.aI.b();
                            Activity activity = (Activity) ahhkVar.d.b();
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof cypj)) {
                                throw new IllegalStateException(a.M(eaVar, cypu.class));
                            }
                            this.d = new cypu(cyqhVar, eyikVar2, cypiVar, ehbbVar, eigpVar, activity, (cypj) eaVar);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.a));
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
        this.c.k();
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            final cypu cypuVarH = H();
            ehbb ehbbVar = cypuVarH.g;
            cypuVarH.s = ehbbVar.h(new ehay() { // from class: cypl
                @Override // defpackage.ehay
                public final /* synthetic */ void a(Throwable th) {
                    ehax.a(th);
                }

                @Override // defpackage.ehay
                public final void b(Object obj) {
                    cypu cypuVar = cypuVarH;
                    cypuVar.m = (dekh) obj;
                    cypuVar.e();
                }
            });
            ehbbVar.g(R.id.barcode_scanner_data_source_id, new cypf(cypuVarH.f), new ehay() { // from class: cypm
                @Override // defpackage.ehay
                public final /* synthetic */ void a(Throwable th) {
                    ehax.a(th);
                }

                @Override // defpackage.ehay
                public final void b(Object obj) {
                    cypu cypuVar = cypuVarH;
                    cypb cypbVar = (cypb) obj;
                    cypuVar.n = cypbVar;
                    if (cypuVar.o == null) {
                        cypuVar.o = new cypr(cypuVar);
                    }
                    cypuVar.a(true);
                    if (((Boolean) cypu.b.e()).booleanValue()) {
                        cypuVar.k.a((String) cypu.c.e());
                    } else {
                        ((crmg) cypuVar.e.b()).c(new cypo(cypuVar, cypbVar));
                    }
                }
            });
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

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            cypu cypuVarH = H();
            CameraSourcePreview cameraSourcePreview = cypuVarH.p;
            if (cameraSourcePreview != null && !cameraSourcePreview.f) {
                dekh dekhVar = cameraSourcePreview.b;
                if (dekhVar != null) {
                    dekhVar.a();
                    cameraSourcePreview.b = null;
                    cameraSourcePreview.d = false;
                    cameraSourcePreview.f = true;
                }
                cypuVarH.m = null;
            }
            this.ag = true;
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

    @Override // defpackage.cyoz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
