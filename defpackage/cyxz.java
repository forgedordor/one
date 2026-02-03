package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.Compose2oMessagePartDataConverter;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.FullscreenGalleryRecyclerView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ehol;
import java.io.File;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyxz extends czay implements ehlg, eyhx, ehlc, ehnw, eifl, einn {
    private cyye a;
    private boolean ah;
    private Context d;
    private final lvn e = new lvn(this);
    private final eino ag = new eino();

    @Deprecated
    public cyxz() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cyye.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            cyye cyyeVarH = H();
            View viewInflate = layoutInflater.inflate(R.layout.full_screen_gallery_fragment, viewGroup, false);
            FullscreenGalleryRecyclerView fullscreenGalleryRecyclerView = (FullscreenGalleryRecyclerView) viewInflate.findViewById(R.id.full_screen_gallery_recycler_view);
            if (fullscreenGalleryRecyclerView.ab == null) {
                fullscreenGalleryRecyclerView.getContext();
                fullscreenGalleryRecyclerView.ab = new GridLayoutManager(fullscreenGalleryRecyclerView.ac);
                fullscreenGalleryRecyclerView.ao(fullscreenGalleryRecyclerView.ab);
            }
            fullscreenGalleryRecyclerView.al(cyyeVarH.u);
            fullscreenGalleryRecyclerView.v(new cyzm(cyyeVarH.k.getResources().getDimensionPixelSize(R.dimen.full_screen_recycler_view_padding)));
            vv vvVar = fullscreenGalleryRecyclerView.E;
            if (vvVar instanceof xz) {
                ((xz) vvVar).u();
            }
            ((ehac) cyyeVarH.h.b()).a(((czbg) cyyeVarH.i.b()).a(), cyyeVarH.q);
            if (((Boolean) cyzf.a.e()).booleanValue()) {
                cyyeVarH.l.av(true);
            }
            if (viewInflate == null) {
                cyyv.a(this, H());
            }
            eidc.q();
            return viewInflate;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cyye H() {
        cyye cyyeVar = this.a;
        if (cyyeVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cyyeVar;
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x013b A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:3:0x0012, B:5:0x001e, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:15:0x0045, B:17:0x004f, B:19:0x0055, B:20:0x0063, B:24:0x00aa, B:26:0x00b0, B:28:0x00b4, B:30:0x00ba, B:32:0x00ce, B:33:0x0103, B:36:0x013b, B:38:0x0141, B:42:0x014f, B:43:0x0152, B:45:0x0158, B:46:0x015e, B:50:0x0165, B:52:0x016b, B:54:0x017d, B:56:0x018c, B:57:0x01c0, B:40:0x0147), top: B:67:0x0012, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f  */
    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void af(int r19, int r20, android.content.Intent r21) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyxz.af(int, int, android.content.Intent):void");
    }

    @Override // defpackage.czay, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.ecdo, defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        super.ah(menu, menuInflater);
        H().m.a();
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            einc.b(this).b = view;
            H();
            cyyv.a(this, H());
            bn(view, bundle);
            cyye cyyeVarH = H();
            fcsu fcsuVar = cyyeVarH.o;
            if (fcsuVar.b() == null || !((Boolean) cgwx.a.e()).booleanValue()) {
                cyyeVarH.a(new ejxr() { // from class: cyyd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return false;
                    }
                }, bundle);
            } else {
                ((ehac) cyyeVarH.h.b()).a(((egbf) fcsuVar.b()).a(cyyeVarH.n), new cyyp(cyyeVarH, bundle));
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

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ejwl.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.czay
    protected final /* bridge */ /* synthetic */ ehok b() {
        return new ehof(this, true);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [eieu] */
    @Override // defpackage.czay, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        Context context2;
        ahkn ahknVar;
        ahng ahngVar;
        eyik eyikVar;
        eyik eyikVar2;
        eyik eyikVar3;
        eyik eyikVar4;
        eyik eyikVar5;
        eyik eyikVar6;
        ea eaVar;
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/mediapicker/c2o/gallery/AccountFullscreenGalleryFragment", EnergyProfile.EVCONNECTOR_TYPE_OTHER, cyxz.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/mediapicker/c2o/gallery/AccountFullscreenGalleryFragment", 106, cyxz.class, "CreatePeer");
                        try {
                            context2 = (Context) ((ahhw) objBb).d.f.b();
                            ahknVar = ((ahhw) objBb).a;
                            ahngVar = ahknVar.b;
                            eyikVar = ahngVar.hh;
                            eyikVar2 = ((ahhw) objBb).dW;
                            eyikVar3 = ((ahhw) objBb).aE;
                            eyikVar4 = ((ahhw) objBb).g;
                            eyikVar5 = ((ahhw) objBb).dX;
                            eyikVar6 = ahknVar.aQ;
                            eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                        } catch (Throwable th) {
                            th = th;
                            context = eieuVarG2;
                        }
                        try {
                            if (!(eaVar instanceof cyxz)) {
                                throw new IllegalStateException(a.M(eaVar, cyye.class));
                            }
                            cyxz cyxzVar = (cyxz) eaVar;
                            efwo efwoVar = (efwo) ((ahhw) objBb).b.b.b();
                            eyik eyikVar7 = ahknVar.a.pG;
                            Bundle bundleA = ((ahhw) objBb).a();
                            evrr evrrVar = (evrr) ahngVar.gp.b();
                            ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            cyzl cyzlVar = (cyzl) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", cyzl.a, evrrVar);
                            cyzlVar.getClass();
                            this.a = new cyye(context2, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, cyxzVar, efwoVar, eyikVar7, cyzlVar);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            try {
                                context.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
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
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new ehol.a(layoutInflaterAO, this));
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
            cyye cyyeVarH = H();
            GalleryBrowserActivity galleryBrowserActivity = cyyeVarH.k;
            if (((cyvb) galleryBrowserActivity).n == null) {
                ((cyvb) galleryBrowserActivity).n = new AttachmentQueueState(new Compose2oMessagePartDataConverter());
            }
            cyyeVarH.b = new cyzt(cyyeVarH.l);
            cyyeVarH.c = new cyyt(cyyeVarH);
            ((cyvb) galleryBrowserActivity).n.h(new cyyr(cyyeVarH));
            ((cyvb) galleryBrowserActivity).n.b = new cyyq(cyyeVarH);
            if (bundle != null) {
                cyyeVarH.a = bundle.getBoolean("is_external_gallery_launched", false);
            }
            if (!((Boolean) cyzf.a.e()).booleanValue()) {
                cyyeVarH.c();
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
    public final void i() {
        eifp eifpVarB = this.c.b();
        try {
            aZ();
            if (this.Q == null) {
                this.ag.c();
            }
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

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ah = true;
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bk(bundle);
            cyye cyyeVarH = H();
            bundle.putBoolean("is_external_gallery_launched", cyyeVarH.a);
            czah czahVar = cyyeVarH.d;
            bundle.putParcelable("media_uri", czahVar.q);
            int i = czahVar.y;
            int i2 = -1;
            if (i != 0) {
                i2 = (-1) + i;
            }
            bundle.putInt("media_type", i2);
            String str = czahVar.r;
            if (str != null) {
                bundle.putString("media_content_type", str);
            }
            File file = czahVar.s;
            bundle.putString("media_file", file == null ? null : file.getAbsolutePath());
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

    @Override // defpackage.einn
    public final eine p(einb einbVar) {
        return this.ag.a(einbVar);
    }

    @Override // defpackage.einn
    public final void q(Class cls, eind eindVar) {
        this.ag.b(cls, eindVar);
    }

    @Override // defpackage.czay, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
