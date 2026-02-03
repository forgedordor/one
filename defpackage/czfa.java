package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import com.google.android.apps.messaging.ui.mediaviewer.CameraMediaViewerCloseButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class czfa implements Consumer {
    public final /* synthetic */ czgf a;

    public /* synthetic */ czfa(czgf czgfVar) {
        this.a = czgfVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        czje czjeVar = (czje) obj;
        final Uri uriD = czjeVar.d();
        final String strE = czjeVar.e();
        final int iB = czjeVar.b();
        final int iA = czjeVar.a();
        final long jC = czjeVar.c();
        final czgf czgfVar = this.a;
        czez czezVar = czgfVar.T;
        if (!czezVar.aI()) {
            czgfVar.p = false;
            return;
        }
        if (le.m(strE)) {
            czgfVar.f.b(new dzfh("Image taken"));
            cpga.e(czezVar.B().getString(R.string.photo_taken), czgfVar.C);
        } else if (le.z(strE)) {
            if (jC < 200) {
                czgfVar.f(R.string.video_media_failure);
                return;
            } else {
                czgfVar.f.b(new dzfh("Video recorded"));
                cpga.e(czezVar.B().getString(R.string.video_taken), czgfVar.C);
            }
        }
        final boolean zU = czgfVar.g.u();
        final boolean z = czgfVar.o.a;
        final int iJ = czgf.j(czgfVar.O);
        final emrt emrtVarE = czgfVar.d.e(strE, iJ, zU, z, Long.valueOf(jC), 2);
        czgfVar.aa = new Runnable() { // from class: czfk
            @Override // java.lang.Runnable
            public final void run() {
                czgf czgfVar2 = czgfVar;
                czgfVar2.l.c(uriD, strE, iB, iA, jC, emrtVarE);
                czgfVar2.g.e();
                czgfVar2.m.run();
            }
        };
        czgfVar.Z = new Consumer() { // from class: czfm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                czgf czgfVar2 = czgfVar;
                Optional optional = (Optional) obj2;
                czgfVar2.l.c((Uri) optional.map(new Function() { // from class: czfi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ((MediaViewerItem) obj3).b();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(uriD), (String) optional.map(new Function() { // from class: czfj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ((MediaViewerItem) obj3).h();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(strE), iB, iA, jC, emrtVarE);
                czgfVar2.g.e();
                czgfVar2.m.run();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        };
        czgfVar.ac = new Runnable() { // from class: czfn
            @Override // java.lang.Runnable
            public final void run() {
                final czgf czgfVar2 = czgfVar;
                final Uri uri = uriD;
                auwa.a(new Runnable() { // from class: czfg
                    @Override // java.lang.Runnable
                    public final void run() {
                        bxlf.i(czgfVar2.T.z(), uri);
                    }
                }, czgfVar2.c);
                czgfVar2.w.setVisibility(0);
                czmk czmkVar = czgfVar2.Y;
                if (czmkVar != null) {
                    cg cgVar = new cg(czgfVar2.T.I());
                    cgVar.o(czmkVar);
                    cgVar.c();
                    czgfVar2.Y = null;
                }
                czgfVar2.g.k();
                czgfVar2.p = false;
                czgfVar2.g(1);
                dair.a(czgfVar2.v, new Runnable() { // from class: czfh
                    @Override // java.lang.Runnable
                    public final void run() {
                        CarouselRecyclerView carouselRecyclerView = czgfVar2.z;
                        czkx czkxVar = (czkx) carouselRecyclerView.n;
                        if (czkxVar != null) {
                            carouselRecyclerView.aj(czkxVar.e);
                        }
                    }
                });
            }
        };
        czgfVar.ab = new Runnable() { // from class: czfo
            @Override // java.lang.Runnable
            public final void run() {
                czgf czgfVar2 = czgfVar;
                aiqh aiqhVar = czgfVar2.e;
                final String str = strE;
                aiqhVar.e(str, iJ, zU, z, Long.valueOf(jC), 2);
                final cyzb cyzbVar = (cyzb) czgfVar2.l;
                final Uri uri = uriD;
                final Runnable runnable = new Runnable() { // from class: cyyy
                    @Override // java.lang.Runnable
                    public final void run() {
                        srv srvVarA = cyzbVar.d.a("Bugle.Async.BuglePhotoViewController.onOptionsItemSelected.Duration");
                        srvVarA.b(uri, str, null, null);
                        srvVarA.e(new Void[0]);
                    }
                };
                ((crmg) cyzbVar.c.b()).j(new crmf() { // from class: cyyz
                    @Override // defpackage.crmf
                    public final void b() {
                        runnable.run();
                    }

                    @Override // defpackage.crmf
                    public final /* synthetic */ boolean c() {
                        return true;
                    }

                    @Override // defpackage.crmf
                    public final /* synthetic */ void a() {
                    }
                });
            }
        };
        czgfVar.g(10);
        try {
            if (czgfVar.Y == null) {
                czne czneVar = new czne();
                czneVar.e = uriD;
                czneVar.g = strE;
                czmj czmjVarE = MediaViewerButton.e();
                czmjVarE.e(R.string.camera_attach_media);
                czmjVarE.d(R.drawable.quantum_ic_check_white_24);
                czmjVarE.b(R.string.camera_attach_media_description);
                czmjVarE.c(new MediaViewerPrimaryButtonEvent());
                czneVar.h = czmjVarE.a();
                czmj czmjVarE2 = MediaViewerButton.e();
                czmjVarE2.b(R.string.camera_save_media_description);
                czmjVarE2.d(R.drawable.quantum_ic_save_alt_white_24);
                czmjVarE2.c(new MediaViewerSaveButtonEvent());
                czneVar.i = new ArrayList(ekgb.r(czmjVarE2.a()));
                czmj czmjVarE3 = MediaViewerButton.e();
                czmjVarE3.b(R.string.discard);
                czmjVarE3.c(new CameraMediaViewerCloseButtonEvent());
                czneVar.j = czmjVarE3.a();
                czneVar.b(5);
                czneVar.l = 1;
                czneVar.m = ((Boolean) czns.b.e()).booleanValue();
                czmk czmkVarA = czneVar.a();
                cg cgVar = new cg(czezVar.I());
                cgVar.s(R.id.confirmation_container, czmkVarA);
                cgVar.c();
                czgfVar.Y = czmkVarA;
            }
            czgfVar.w.setVisibility(4);
        } catch (IllegalStateException e) {
            ((eksl) ((eksl) ((eksl) czgf.a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "onMediaReady", (char) 267, "CameraFragmentPeer.java")).q("onMediaReady MediaViewerFragment not added");
            czgfVar.f(R.string.camera_media_capture_failure);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
