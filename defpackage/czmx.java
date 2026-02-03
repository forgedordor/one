package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewPager;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerAddMoreButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerShareButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import com.google.android.material.button.MaterialButton;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmx implements cyqp, czlw {
    public static final cqce a = cqce.g("Bugle", "MediaViewerFragmentPeer");
    private static final ekrg an = ekrg.c("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer");
    public ImageView A;
    public TextView B;
    public View C;
    public cpdw D;
    public czlz E;
    public TextView F;
    public MaterialButton G;
    public final czmk H;
    public final einm I;
    public final Optional J;
    public Uri M;
    public MediaViewerItem N;
    public ea O;
    public boolean P;
    public boolean Q;
    public String R;
    public final daoe S;
    public final cyuq T;
    public int V;
    public long X;
    public cznq Y;
    public cznr Z;
    public final auvz ak;
    public final czoi al;
    public final czog am;
    private final srw ao;
    private final aiwg ap;
    private final aivw aq;
    private final aivm ar;
    private final aivs as;
    private final aivp at;
    private final Optional au;
    private final bxle av;
    public final daij b;
    public final cyqq c;
    public final ehac d;
    public final egpr e;
    public final avmp f;
    public final fcsu g;
    public final cqei h;
    public final aivz i;
    public final fcsu j;
    public final cogw k;
    public final fcsu l;
    public final tlt m;
    public final cssf n;
    public MediaViewerButton o;
    public ArrayList p;
    public MediaViewerButton q;
    public List r;
    public MediaViewerButton s;
    public ea t;
    public czpx u;
    public ViewGroup v;
    public TextView w;
    public TextView x;
    public TextView y;
    public LinearLayout z;
    public int K = -1;
    public boolean L = false;
    public final aw U = new aw();
    public boolean W = false;
    public boolean aa = false;
    public boolean ab = false;
    public boolean ac = false;
    public int ad = 0;
    public int ae = 0;
    public final egzv af = new egzv<List<MediaViewerItem>>() { // from class: czmx.2
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            czmx.a.r("Media Viewer data service failed ".concat(String.valueOf(th.getMessage())));
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) throws Resources.NotFoundException {
            List list = (List) obj;
            czmx czmxVar = czmx.this;
            if (czmxVar.E == null || list == null || list.isEmpty()) {
                return;
            }
            czmxVar.E.h = ekgb.n(list);
            czlz czlzVar = czmxVar.E;
            synchronized (czlzVar) {
                DataSetObserver dataSetObserver = czlzVar.g;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            }
            czlzVar.f.notifyChanged();
            czmx czmxVar2 = czmx.this;
            int size = czmxVar2.K;
            if (size == -1) {
                size = -1;
                for (int i = 0; i < list.size(); i++) {
                    MediaViewerItem mediaViewerItem = (MediaViewerItem) list.get(i);
                    if (mediaViewerItem != null && (czmxVar2.v(mediaViewerItem.b()) || czmxVar2.v(mediaViewerItem.a()))) {
                        czmxVar2.K = i;
                        size = i;
                    }
                }
            }
            if (size == -1) {
                fcsu fcsuVar = czmxVar2.j;
                ((ains) fcsuVar.b()).c("Bugle.Media.Viewer.Photo.Not.Found.Counts");
                if (list.isEmpty()) {
                    ((ains) fcsuVar.b()).c("Bugle.Media.Viewer.Loaded.With.Empty.Data.Counts");
                }
                size = -1;
            }
            if (size == -1) {
                cqbd cqbdVarE = czmx.a.e();
                cqbdVarE.I("MediaViewer failed to find media:");
                cqbdVarE.I(czmxVar2.M);
                cqbdVarE.I("in data.");
                cqbdVarE.L("count", list);
                cqbdVarE.r();
                size = !list.isEmpty() ? list.size() - 1 : -1;
            }
            if (size != -1) {
                ((MediaViewPager) czmxVar2.D.b()).l(size, false);
                if (size == 0) {
                    czmxVar2.l(0);
                }
                if (czmxVar2.W) {
                    long epochMilli = czmxVar2.k.f().toEpochMilli() - czmxVar2.X;
                    ejwl.a(epochMilli >= 0 && epochMilli <= 2147483647L);
                    czmxVar2.Z = new cznr((int) epochMilli, czmxVar2.K, list.size());
                    czmxVar2.W = false;
                    czmxVar2.i();
                }
            }
        }

        @Override // defpackage.egzv
        public final void hn() {
        }
    };
    public final egps ag = new egps<Uri, Uri>() { // from class: czmx.4
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            czmx czmxVar = czmx.this;
            czmxVar.B(3);
            czmxVar.p((Uri) obj2, czmxVar.N.h());
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            czmx czmxVar = czmx.this;
            czmxVar.B(2);
            ((cden) czmxVar.l.b()).b(th);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egps ah = new egps<Uri, Uri>() { // from class: czmx.5
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            czmx czmxVar = czmx.this;
            Uri uri = (Uri) obj2;
            czmxVar.B(5);
            czmxVar.A(4);
            BaseMediaViewerEvent baseMediaViewerEventD = ((MediaViewerButton) czmxVar.r.get(0)).d();
            boolean z = baseMediaViewerEventD instanceof MediaViewerAddMoreButtonEvent;
            BaseMediaViewerEvent baseMediaViewerEvent = baseMediaViewerEventD;
            if (z) {
                MediaViewerAddMoreButtonEvent mediaViewerAddMoreButtonEvent = (MediaViewerAddMoreButtonEvent) baseMediaViewerEventD;
                cznz cznzVarG = czmxVar.N.g();
                cznzVarG.c(uri);
                mediaViewerAddMoreButtonEvent.a = Optional.of(cznzVarG.a());
                baseMediaViewerEvent = mediaViewerAddMoreButtonEvent;
                if (czmxVar.aa) {
                    mediaViewerAddMoreButtonEvent.b = Optional.ofNullable(czmxVar.F.getText() == null ? null : czmxVar.F.getText().toString());
                    baseMediaViewerEvent = mediaViewerAddMoreButtonEvent;
                }
            }
            View view = czmxVar.H.Q;
            if (view != null) {
                einf.g(baseMediaViewerEvent, view);
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            czmx czmxVar = czmx.this;
            czmxVar.B(2);
            ((cden) czmxVar.l.b()).b(th);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egps ai = new egps<Uri, Uri>() { // from class: czmx.6
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            czmx czmxVar = czmx.this;
            Uri uri = (Uri) obj2;
            czmxVar.B(5);
            czmxVar.A(4);
            BaseMediaViewerEvent baseMediaViewerEvent = ((czlg) czmxVar.q).a;
            boolean z = baseMediaViewerEvent instanceof MediaViewerPrimaryButtonEvent;
            BaseMediaViewerEvent baseMediaViewerEvent2 = baseMediaViewerEvent;
            if (z) {
                MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) baseMediaViewerEvent;
                cznz cznzVarG = czmxVar.N.g();
                cznzVarG.c(uri);
                mediaViewerPrimaryButtonEvent.a = Optional.of(cznzVarG.a());
                baseMediaViewerEvent2 = mediaViewerPrimaryButtonEvent;
                if (czmxVar.aa) {
                    mediaViewerPrimaryButtonEvent.b = Optional.ofNullable(czmxVar.F.getText() == null ? null : czmxVar.F.getText().toString());
                    baseMediaViewerEvent2 = mediaViewerPrimaryButtonEvent;
                }
            }
            einf.g(baseMediaViewerEvent2, czmxVar.H.Q);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            czmx czmxVar = czmx.this;
            czmxVar.B(2);
            ((cden) czmxVar.l.b()).b(th);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egps aj = new egps<Uri, Uri>() { // from class: czmx.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) throws IOException {
            czmx czmxVar = czmx.this;
            Uri uri = (Uri) obj2;
            czmxVar.B(4);
            czmxVar.A(4);
            if (!czmxVar.N.b().equals((Uri) obj) || czmxVar.N == null || czmxVar.H.G() == null) {
                return;
            }
            czmxVar.u(uri, czmxVar.N.h());
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            czmx czmxVar = czmx.this;
            czmxVar.B(2);
            ((cden) czmxVar.l.b()).b(th);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public czmx(czmk czmkVar, einm einmVar, ehac ehacVar, egpr egprVar, czog czogVar, avmp avmpVar, fcsu fcsuVar, srw srwVar, cqei cqeiVar, aiwg aiwgVar, aivz aivzVar, aivw aivwVar, aivm aivmVar, aivs aivsVar, aivp aivpVar, fcsu fcsuVar2, cogw cogwVar, tlt tltVar, Optional optional, Optional optional2, fcsu fcsuVar3, auvz auvzVar, cssf cssfVar, daoe daoeVar, cyuq cyuqVar, czoi czoiVar, bxle bxleVar, fcsu fcsuVar4) {
        this.H = czmkVar;
        this.I = einmVar;
        this.d = ehacVar;
        this.e = egprVar;
        this.am = czogVar;
        this.f = avmpVar;
        this.g = fcsuVar;
        this.ao = srwVar;
        this.h = cqeiVar;
        this.ap = aiwgVar;
        this.i = aivzVar;
        this.aq = aivwVar;
        this.ar = aivmVar;
        this.as = aivsVar;
        this.at = aivpVar;
        this.j = fcsuVar2;
        this.k = cogwVar;
        this.au = optional;
        this.J = optional2;
        this.l = fcsuVar3;
        this.m = tltVar;
        this.ak = auvzVar;
        this.n = cssfVar;
        this.S = daoeVar;
        this.T = cyuqVar;
        this.al = czoiVar;
        this.av = bxleVar;
        if (craf.b && czmkVar.G() != null) {
            eg egVarG = czmkVar.G();
            egVarG.getClass();
            if (egVarG.getWindow() != null) {
                eg egVarG2 = czmkVar.G();
                egVarG2.getClass();
                if (egVarG2.getWindow().getAttributes() != null) {
                    eg egVarG3 = czmkVar.G();
                    egVarG3.getClass();
                    egVarG3.getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                }
            }
        }
        this.c = new cyqq(czmkVar);
        if (!((asgn) fcsuVar4.b()).a()) {
            eg egVarG4 = czmkVar.G();
            egVarG4.getClass();
            egVarG4.getWindow().setStatusBarColor(eehg.d(czmkVar.G(), R.attr.colorBackgroundDark, "MediaViewerFragmentPeer"));
        }
        this.b = new daij(czmkVar, czmkVar.a, eehg.d(czmkVar.G(), R.attr.colorBackgroundDark, "MediaViewerFragmentPeer"));
    }

    private static MediaViewerButton E() {
        czmj czmjVarE = MediaViewerButton.e();
        czmjVarE.e(R.string.camera_attach_media);
        czmjVarE.d(R.drawable.quantum_gm_ic_check_vd_theme_24);
        czmjVarE.b(R.string.camera_attach_media_to_draft_description);
        czmjVarE.c(new MediaViewerPrimaryButtonEvent());
        return czmjVarE.a();
    }

    private final emyn F(int i) {
        String strH = this.N.h();
        int i2 = this.Y.d;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        int i4 = 1;
        switch (i3) {
            case 4:
            case 5:
            case 6:
                i4 = 2;
                break;
        }
        empq empqVar = (empq) emqj.a.createBuilder();
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqjVar.b |= 8;
        emqjVar.g = strH;
        return aivt.a(i, i4, (emqj) empqVar.build(), D(i2, strH));
    }

    private final void G(String str) {
        if (this.y == null) {
            return;
        }
        if (this.aa && this.G == null) {
            return;
        }
        daji.a(this.aa ? this.G : this.y, (this.P && le.z(str)) ? R.dimen.media_viewer_primary_button_margin_bottom_with_video_palyer : this.aa ? R.dimen.direct_send_viewer_primary_button_margin_bottom : R.dimen.media_viewer_primary_button_margin_bottom);
    }

    private final void H(String str) {
        if (this.z == null) {
            return;
        }
        daji.a(this.z, (this.P && le.z(str)) ? R.dimen.media_viewer_secondary_button_margin_bottom_with_video_palyer : this.aa ? R.dimen.direct_send_viewer_secondary_button_margin_bottom : R.dimen.media_viewer_secondary_button_margin_bottom);
    }

    private static MediaViewerButton I(boolean z) {
        czmj czmjVarE = MediaViewerButton.e();
        czmjVarE.e(R.string.camera_send_media);
        czmjVarE.d(b(true, z));
        czmjVarE.b(a(true, z));
        czmjVarE.c(new MediaViewerPrimaryButtonEvent());
        return czmjVarE.a();
    }

    public static int a(boolean z, boolean z2) {
        return z ? z2 ? R.string.camera_send_encrypted_media_description : R.string.camera_send_media_description : R.string.camera_attach_media_to_draft_description;
    }

    public static int b(boolean z, boolean z2) {
        return z ? z2 ? R.drawable.ic_e2ee_send_icon : R.drawable.quantum_gm_ic_send_vd_theme_24 : R.drawable.quantum_gm_ic_check_vd_theme_24;
    }

    public static int z(Bundle bundle) {
        if (bundle == null || bundle.getInt("opening_source") == 0) {
            return 1;
        }
        return emyz.a(bundle.getInt("opening_source"));
    }

    public final void A(final int i) {
        if (this.Y == null || this.Z == null) {
            return;
        }
        aivp aivpVar = this.at;
        final emza emzaVarE = e();
        final emyn emynVarF = F(0);
        aivpVar.k(new Supplier() { // from class: aivn
            @Override // java.util.function.Supplier
            public final Object get() {
                emxw emxwVar = (emxw) emxy.a.createBuilder();
                emxwVar.copyOnWrite();
                emxy emxyVar = (emxy) emxwVar.instance;
                emza emzaVar = emzaVarE;
                emzaVar.getClass();
                emxyVar.c = emzaVar;
                emxyVar.b |= 1;
                emxwVar.copyOnWrite();
                emxy emxyVar2 = (emxy) emxwVar.instance;
                emyn emynVar = emynVarF;
                emynVar.getClass();
                emxyVar2.d = emynVar;
                emxyVar2.b |= 2;
                emxwVar.copyOnWrite();
                emxy emxyVar3 = (emxy) emxwVar.instance;
                emxyVar3.e = i - 1;
                emxyVar3.b |= 4;
                return (emxy) emxwVar.build();
            }
        });
    }

    public final void B(final int i) {
        final int i2;
        final int i3;
        if (this.Y == null || this.Z == null) {
            return;
        }
        ea eaVar = this.t;
        if (eaVar != null) {
            ebtg ebtgVar = ((czpe) eaVar).H().d;
            int i4 = ebtgVar.i;
            int i5 = ebtgVar.j;
            i3 = i5;
            i2 = i4 - i5;
        } else {
            i2 = 0;
            i3 = 0;
        }
        aivs aivsVar = this.as;
        final emza emzaVarE = e();
        final emyn emynVarF = F(0);
        aivsVar.k(new Supplier() { // from class: aivr
            @Override // java.util.function.Supplier
            public final Object get() {
                emxz emxzVar = (emxz) emyc.a.createBuilder();
                emxzVar.copyOnWrite();
                emyc emycVar = (emyc) emxzVar.instance;
                emza emzaVar = emzaVarE;
                emzaVar.getClass();
                emycVar.c = emzaVar;
                emycVar.b |= 1;
                emxzVar.copyOnWrite();
                emyc emycVar2 = (emyc) emxzVar.instance;
                emyn emynVar = emynVarF;
                emynVar.getClass();
                emycVar2.d = emynVar;
                emycVar2.b |= 2;
                emxzVar.copyOnWrite();
                emyc emycVar3 = (emyc) emxzVar.instance;
                emycVar3.e = i - 1;
                emycVar3.b |= 4;
                emxzVar.copyOnWrite();
                emyc emycVar4 = (emyc) emxzVar.instance;
                emycVar4.f = aivs.b(i2) - 1;
                emycVar4.b |= 8;
                emxzVar.copyOnWrite();
                emyc emycVar5 = (emyc) emxzVar.instance;
                emycVar5.g = aivs.b(i3) - 1;
                emycVar5.b |= 16;
                return (emyc) emxzVar.build();
            }
        });
    }

    public final void C(int i) {
        cznq cznqVar = this.Y;
        cznqVar.getClass();
        cznqVar.e = i;
    }

    public final boolean D(int i, String str) {
        boolean zBooleanValue;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                zBooleanValue = ((Boolean) czns.d.e()).booleanValue();
                break;
            case 2:
            case 3:
                zBooleanValue = ((Boolean) czns.f.e()).booleanValue();
                break;
            case 4:
                zBooleanValue = ((Boolean) czns.a.e()).booleanValue();
                break;
            case 5:
                zBooleanValue = ((Boolean) czns.e.e()).booleanValue();
                break;
            case 6:
                zBooleanValue = ((Boolean) czns.c.e()).booleanValue();
                break;
            default:
                return false;
        }
        if (!zBooleanValue) {
            return false;
        }
        this.au.isPresent();
        return (le.z(str) || le.j(str)) ? false : true;
    }

    public final View c() {
        return this.aa ? this.H.N().findViewById(R.id.media_viewer_action_bar_direct_send_viewer) : this.H.N().findViewById(R.id.media_viewer_action_bar);
    }

    public final MediaViewerButton d() {
        int i = this.V;
        if (i == 1) {
            if (this.ab) {
                this.ab = true;
                return I(this.ac);
            }
            if (this.aa) {
                return E();
            }
            czmj czmjVarE = MediaViewerButton.e();
            czmjVarE.e(R.string.camera_attach_media);
            czmjVarE.d(R.drawable.quantum_ic_check_white_24);
            czmjVarE.b(R.string.camera_attach_media_description);
            czmjVarE.c(new MediaViewerPrimaryButtonEvent());
            return czmjVarE.a();
        }
        if (i != 2) {
            return null;
        }
        if (this.ab) {
            this.ab = true;
            return I(this.ac);
        }
        if (this.aa) {
            return E();
        }
        czmj czmjVarE2 = MediaViewerButton.e();
        czmjVarE2.e(R.string.media_viewer_done_label);
        czmjVarE2.d(R.drawable.quantum_ic_check_white_24);
        czmjVarE2.b(R.string.media_viewer_done_label);
        czmjVarE2.c(new MediaViewerPrimaryButtonEvent());
        return czmjVarE2.a();
    }

    public final emza e() {
        int i = this.Y.d;
        cznr cznrVar = this.Z;
        return aiwd.a(i, cznrVar != null ? cznrVar.b : 0);
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        if (this.aa) {
            czmj czmjVarE = MediaViewerButton.e();
            czmjVarE.e(R.string.camera_add_more_media);
            czmjVarE.b(R.string.camera_add_more_media_description);
            czmjVarE.d(R.drawable.quantum_gm_ic_add_photo_alternate_vd_theme_24);
            czmjVarE.c(new MediaViewerAddMoreButtonEvent());
            arrayList.add(czmjVarE.a());
        } else {
            czmj czmjVarE2 = MediaViewerButton.e();
            czmjVarE2.b(R.string.media_viewer_save_media_description);
            czmjVarE2.d(R.drawable.quantum_ic_save_alt_white_24);
            czmjVarE2.c(new MediaViewerSaveButtonEvent());
            arrayList.add(czmjVarE2.a());
        }
        int i = this.V;
        if (i != 1 && i != 2) {
            if (i != 3) {
                arrayList.clear();
                return arrayList;
            }
            czmj czmjVarE3 = MediaViewerButton.e();
            czmjVarE3.b(R.string.media_viewer_share_media_description);
            czmjVarE3.d(R.drawable.quantum_gm_ic_share_white_24);
            czmjVarE3.c(new MediaViewerShareButtonEvent());
            arrayList.add(czmjVarE3.a());
        }
        return arrayList;
    }

    public final void g(egps egpsVar) {
        czpu czpuVarF = ((czpe) this.t).H();
        this.e.h(new egpq(czpuVarF.b.a(this.N.b(), czpuVarF.m)), new egpo(this.N.b()), egpsVar);
    }

    public final void h(int i) {
        if (this.Y == null || this.Z == null) {
            return;
        }
        this.aq.b(e(), F(i));
    }

    public final void i() {
        if (this.Y == null || this.Z == null) {
            return;
        }
        aiwg aiwgVar = this.ap;
        final emza emzaVarE = e();
        cznr cznrVar = this.Z;
        final int i = cznrVar.a;
        final int i2 = cznrVar.c;
        aiwgVar.k(new Supplier() { // from class: aiwe
            @Override // java.util.function.Supplier
            public final Object get() {
                emzb emzbVar = (emzb) emzc.a.createBuilder();
                emzbVar.copyOnWrite();
                emzc emzcVar = (emzc) emzbVar.instance;
                emza emzaVar = emzaVarE;
                emzaVar.getClass();
                emzcVar.c = emzaVar;
                emzcVar.b |= 1;
                emzbVar.copyOnWrite();
                emzc emzcVar2 = (emzc) emzbVar.instance;
                emzcVar2.b |= 2;
                emzcVar2.d = i;
                emzbVar.copyOnWrite();
                emzc emzcVar3 = (emzc) emzbVar.instance;
                emzcVar3.b |= 4;
                emzcVar3.e = i2;
                return (emzc) emzbVar.build();
            }
        });
    }

    public final void j() {
        if (x()) {
            g(this.ah);
            return;
        }
        if (this.t != null) {
            B(5);
            A(4);
        }
        czmk czmkVar = this.H;
        czmkVar.Q.getClass();
        if (!this.aa) {
            einf.g(((MediaViewerButton) this.p.get(0)).d(), czmkVar.Q);
            return;
        }
        MediaViewerAddMoreButtonEvent mediaViewerAddMoreButtonEvent = (MediaViewerAddMoreButtonEvent) ((MediaViewerButton) this.p.get(0)).d();
        mediaViewerAddMoreButtonEvent.b = Optional.ofNullable(this.F.getText() == null ? null : this.F.getText().toString());
        einf.g(mediaViewerAddMoreButtonEvent, czmkVar.Q);
    }

    public final void k() {
        int iA;
        ejwl.l(this.aa);
        ejwl.l(this.aa);
        View viewN = this.H.N();
        daoe daoeVar = this.S;
        int i = 0;
        int i2 = true != daoeVar.b ? 8 : 0;
        int i3 = true != daoeVar.b ? 0 : 8;
        viewN.findViewById(R.id.direct_send_done_button).setVisibility(i2);
        viewN.findViewById(R.id.media_overlay).setVisibility(i2);
        aw awVar = this.U;
        awVar.l(R.id.primary_button_icon, i2);
        awVar.l(R.id.primary_button, i3);
        awVar.l(R.id.secondary_button_container, i3);
        ejwl.l(this.aa);
        if (daoeVar.b && (iA = daoeVar.a()) > 0) {
            i = iA;
        }
        awVar.h(R.id.media_viewer_caption, 4, daoeVar.b ? i + this.ae : this.ad);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.v;
        constraintLayout.getClass();
        awVar.b(constraintLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i) {
        MediaViewerItem mediaViewerItem = (MediaViewerItem) this.E.h.get(i);
        this.N = mediaViewerItem;
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(this.n.d(mediaViewerItem.j()));
        }
        TextView textView2 = this.x;
        if (textView2 != null) {
            textView2.setText(mediaViewerItem.i());
        }
        this.O = this.E.b(i);
        h(i);
        cznq cznqVar = this.Y;
        if (D(cznqVar != null ? cznqVar.d : 1, this.N.h())) {
            r();
        } else {
            this.C.setVisibility(8);
        }
        String strH = this.N.h();
        G(strH);
        H(strH);
    }

    public final void m() {
        if (x()) {
            g(this.ai);
            return;
        }
        if (this.t != null) {
            B(5);
            A(4);
        }
        if (!this.aa) {
            einf.g(this.o.d(), this.H.Q);
            return;
        }
        MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) this.o.d();
        mediaViewerPrimaryButtonEvent.b = Optional.ofNullable(this.F.getText() == null ? null : this.F.getText().toString());
        einf.g(mediaViewerPrimaryButtonEvent, this.H.Q);
    }

    public final void n() {
        Optional optional = this.au;
        if (optional.isEmpty() || le.z(this.N.h())) {
            return;
        }
        if (this.E != null) {
            ((MediaViewPager) this.D.b()).v(false);
        }
        fr frVarI = this.H.I();
        optional.get();
        czpe czpeVar = new czpe();
        eyhj.e(czpeVar);
        this.t = czpeVar;
        cg cgVar = new cg(frVarI);
        cgVar.s(R.id.media_editor_container, this.t);
        cgVar.c();
        ea eaVar = this.O;
        if (eaVar instanceof czln) {
            czln czlnVar = (czln) eaVar;
            if (eaVar != null && eaVar.aF()) {
                ((czpe) this.t).H().a(czlnVar.H().a());
            }
        }
        this.C.setVisibility(8);
        c().setVisibility(8);
        this.c.h(this);
        if (this.Y == null || this.Z == null) {
            return;
        }
        aivm aivmVar = this.ar;
        final emza emzaVarE = e();
        final emyn emynVarF = F(0);
        aivmVar.k(new Supplier() { // from class: aivl
            @Override // java.util.function.Supplier
            public final Object get() {
                emxu emxuVar = (emxu) emxv.a.createBuilder();
                emxuVar.copyOnWrite();
                emxv emxvVar = (emxv) emxuVar.instance;
                emza emzaVar = emzaVarE;
                emzaVar.getClass();
                emxvVar.c = emzaVar;
                emxvVar.b |= 1;
                emxuVar.copyOnWrite();
                emxv emxvVar2 = (emxv) emxuVar.instance;
                emyn emynVar = emynVarF;
                emynVar.getClass();
                emxvVar2.d = emynVar;
                emxvVar2.b |= 2;
                return (emxv) emxuVar.build();
            }
        });
    }

    public final void o() {
        if (this.N == null) {
            return;
        }
        if (x()) {
            g(this.ag);
            return;
        }
        if (this.t != null) {
            B(3);
        }
        p(this.N.b(), this.N.h());
    }

    public final void p(Uri uri, String str) {
        if (this.H.G() != null) {
            srv srvVarA = this.ao.a("Bugle.Async.BuglePhotoViewController.onOptionsItemSelected.Duration");
            srvVarA.b(uri, str, null, null);
            srvVarA.e(new Void[0]);
        }
    }

    public final void q(View view, MediaViewerButton mediaViewerButton) {
        if (mediaViewerButton.a() != -1) {
            view.setContentDescription(this.H.Y(mediaViewerButton.a()));
        }
    }

    public final void r() {
        this.d.a(this.am.a(), new AnonymousClass3());
        this.q = d();
        this.r = f();
    }

    public final void s(MediaViewerButton mediaViewerButton) throws Resources.NotFoundException {
        if (!this.aa) {
            this.y.setAlpha(mediaViewerButton == null ? 0.0f : 1.0f);
        }
        if (!this.aa) {
            this.y.getLayoutParams().height = -2;
        }
        if (mediaViewerButton != null) {
            if (this.aa) {
                this.G.setText(mediaViewerButton.c());
                this.G.e(mediaViewerButton.b());
                q(this.G, mediaViewerButton);
                if (this.ab) {
                    this.G.setOnClickListener(new View.OnClickListener() { // from class: czmo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.m();
                        }
                    });
                } else {
                    this.G.setOnClickListener(new View.OnClickListener() { // from class: czmp
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.j();
                        }
                    });
                }
            } else {
                this.y.setText(mediaViewerButton.c());
                if (mediaViewerButton.b() != -1) {
                    TextView textView = this.y;
                    int iB = mediaViewerButton.b();
                    int dimensionPixelSize = this.H.B().getDimensionPixelSize(R.dimen.media_viewer_button_drawable_padding);
                    int layoutDirection = textView.getContext().getResources().getConfiguration().getLayoutDirection();
                    int i = layoutDirection == 1 ? 0 : iB;
                    if (layoutDirection != 1) {
                        iB = 0;
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, iB, 0);
                    textView.setCompoundDrawablePadding(dimensionPixelSize);
                }
                q(this.y, mediaViewerButton);
                this.y.setOnClickListener(new View.OnClickListener() { // from class: czmq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.m();
                    }
                });
            }
        }
        G(this.H.m.getString("content_type"));
        if (this.aa) {
            this.G.setAccessibilityDelegate(new cznf());
        } else {
            this.y.setAccessibilityDelegate(new cznf());
        }
    }

    public final void t(List list) {
        this.z.removeAllViews();
        if (list == null) {
            return;
        }
        ejwl.b(this.p.size() <= 2, "Media Viewer should not have  more than two secondary buttons.");
        czmk czmkVar = this.H;
        LayoutInflater layoutInflaterK = czmkVar.K();
        for (int i = 0; i < list.size(); i++) {
            MediaViewerButton mediaViewerButton = (MediaViewerButton) list.get(i);
            if (this.aa && mediaViewerButton.c() == R.string.camera_add_more_media) {
                MaterialButton materialButton = (MaterialButton) layoutInflaterK.inflate(R.layout.direct_send_viewer_add_more_button, (ViewGroup) this.z, false);
                this.z.addView(materialButton);
                ejwl.a(mediaViewerButton.b() != -1);
                q(materialButton, mediaViewerButton);
                materialButton.setText(mediaViewerButton.c());
                materialButton.e(mediaViewerButton.b());
                if (this.aa) {
                    daji.b(materialButton, R.dimen.direct_send_viewer_secondary_button_margin);
                }
                if (i == list.size() - 1) {
                    daji.c(materialButton);
                }
                materialButton.setOnClickListener(new View.OnClickListener() { // from class: czmt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.j();
                    }
                });
            } else {
                ImageView imageView = (ImageView) layoutInflaterK.inflate(R.layout.media_viewer_secondary_button, (ViewGroup) this.z, false);
                this.z.addView(imageView);
                ejwl.a(mediaViewerButton.b() != -1);
                imageView.setImageResource(mediaViewerButton.b());
                q(imageView, mediaViewerButton);
                daji.b(imageView, R.dimen.media_viewer_secondary_button_margin);
                if (i == list.size() - 1) {
                    daji.c(imageView);
                }
                this.I.b(imageView, mediaViewerButton.d());
            }
        }
        H(czmkVar.m.getString("content_type"));
    }

    public final void u(Uri uri, String str) throws IOException {
        eg egVarG;
        Intent intentH;
        if (this.N == null || (egVarG = this.H.G()) == null) {
            return;
        }
        Context applicationContext = egVarG.getApplicationContext();
        ekrg ekrgVar = cqmz.a;
        String canonicalPath = null;
        if (uri != null && cqmz.o(uri)) {
            canonicalPath = uri.getPath();
        }
        if (canonicalPath != null) {
            try {
                intentH = aijh.H(applicationContext, FileProvider.a(applicationContext, this.av.a, new File(canonicalPath)), str);
            } catch (IllegalArgumentException e) {
                try {
                    canonicalPath = new File(canonicalPath).getCanonicalPath();
                } catch (IOException e2) {
                    ekrw ekrwVarJ = an.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1845, "MediaViewerFragmentPeer.java")).t("Failed to get canonical path for file: %s", canonicalPath);
                }
                String absolutePath = applicationContext.getFilesDir().getAbsolutePath();
                try {
                    absolutePath = applicationContext.getFilesDir().getCanonicalPath();
                } catch (IOException e3) {
                    ekrw ekrwVarJ2 = an.j();
                    ekrwVarJ2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e3)).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1852, "MediaViewerFragmentPeer.java")).t("Failed to get canonical path for files dir: %s", absolutePath);
                }
                String absolutePath2 = applicationContext.getCacheDir().getAbsolutePath();
                try {
                    absolutePath2 = applicationContext.getCacheDir().getCanonicalPath();
                } catch (IOException e4) {
                    ekrw ekrwVarJ3 = an.j();
                    ekrwVarJ3.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ3).g(e4)).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1859, "MediaViewerFragmentPeer.java")).t("Failed to get canonical path for cache dir: %s", absolutePath2);
                }
                if (canonicalPath.startsWith(absolutePath)) {
                    ekrw ekrwVarJ4 = an.j();
                    ekrwVarJ4.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1863, "MediaViewerFragmentPeer.java")).q("File URI starts with files path.");
                    throw e;
                }
                if (canonicalPath.startsWith(absolutePath2)) {
                    ekrw ekrwVarJ5 = an.j();
                    ekrwVarJ5.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ5).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1865, "MediaViewerFragmentPeer.java")).q("File URI starts with cache path.");
                    throw e;
                }
                if (canonicalPath.startsWith("/storage/")) {
                    ekrw ekrwVarJ6 = an.j();
                    ekrwVarJ6.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ6).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1867, "MediaViewerFragmentPeer.java")).q("File URI starts with /storage/.");
                    throw e;
                }
                if (canonicalPath.startsWith("/cache/")) {
                    ekrw ekrwVarJ7 = an.j();
                    ekrwVarJ7.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ7).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1869, "MediaViewerFragmentPeer.java")).q("File URI starts with /cache/.");
                    throw e;
                }
                if (canonicalPath.startsWith("/data/")) {
                    ekrw ekrwVarJ8 = an.j();
                    ekrwVarJ8.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ8).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1871, "MediaViewerFragmentPeer.java")).q("File URI starts with /data/.");
                    throw e;
                }
                if (canonicalPath.startsWith("/mnt/")) {
                    ekrw ekrwVarJ9 = an.j();
                    ekrwVarJ9.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ9).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1873, "MediaViewerFragmentPeer.java")).q("File URI starts with /mnt/.");
                    throw e;
                }
                if (canonicalPath.startsWith("/sdcard/")) {
                    ekrw ekrwVarJ10 = an.j();
                    ekrwVarJ10.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ10).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1875, "MediaViewerFragmentPeer.java")).q("File URI starts with /sdcard/.");
                    throw e;
                }
                if (canonicalPath.startsWith("/tmp/")) {
                    ekrw ekrwVarJ11 = an.j();
                    ekrwVarJ11.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ11).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1877, "MediaViewerFragmentPeer.java")).q("File URI starts with /tmp/.");
                    throw e;
                }
                ekrw ekrwVarJ12 = an.j();
                ekrwVarJ12.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ12).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1879, "MediaViewerFragmentPeer.java")).q("File URI does not start with any standard paths.");
                throw e;
            }
        } else {
            intentH = aijh.H(applicationContext, uri, str);
        }
        egVarG.startActivity(Intent.createChooser(intentH, this.H.G().getResources().getText(R.string.action_share)));
    }

    public final boolean v(Uri uri) {
        return uri != null && uri.equals(this.M);
    }

    public final boolean w() {
        ea eaVar = this.t;
        if (eaVar == null) {
            return false;
        }
        czpu czpuVarF = ((czpe) eaVar).H();
        ebte ebteVar = czpuVarF.d.e;
        ebte ebteVar2 = ebte.a;
        if (ebteVar != ebteVar2) {
            czpuVarF.c.b().b(ebteVar2);
            return true;
        }
        if (czpuVarF.b()) {
            czpuVarF.g();
            return true;
        }
        einf.f(new czou(false), czpuVarF.a);
        return true;
    }

    public final boolean x() {
        ea eaVar = this.t;
        return eaVar != null && ((czpe) eaVar).H().b();
    }

    public final boolean y() {
        return x() ? this.q != null : this.o != null;
    }

    /* compiled from: PG */
    /* renamed from: czmx$3, reason: invalid class name */
    class AnonymousClass3 implements egzv<Boolean> {
        public AnonymousClass3() {
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                czmx.a.r("Media editor library failed to load.");
                return;
            }
            czmx czmxVar = czmx.this;
            czmxVar.C.setVisibility(true != czmxVar.aa ? 0 : 8);
            czmxVar.C.setOnClickListener(new View.OnClickListener() { // from class: cznc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czmx.this.n();
                }
            });
        }

        @Override // defpackage.egzv
        public final void hn() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
        }
    }
}
