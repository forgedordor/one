package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.transition.Slide;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnau extends dnba {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen");
    public Optional aA;
    public dmyt aB;
    public Optional aC;
    public Optional aD;
    public fcsu aE;
    private final dpxe aF;
    private final fctc aG;
    private final fctc aH;
    public ContentResolver ag;
    public dmbl ah;
    public dmzx ai;
    public boolean aj;
    public boolean ak;
    public final fctc al;
    public dnho am;
    public dmbd an;
    public dnhb ao;
    public dnbl ap;
    public Optional aq;
    public dnbs ar;
    public dpyj as;
    public dncb at;
    public Activity au;
    public Optional av;
    public Optional aw;
    public dolm ax;
    public dlvl ay;
    public fdjx az;
    public RecyclerView b;
    private final fctc ba;
    private boolean bb;
    private final fctc bc;
    private dnbo bd;
    private final fctc be;
    private dnbe bf;
    private dnbv bg;
    private dnbr bh;
    private final fctc bi;
    private final fctc bj;
    public View c;
    public FloatingActionButton d;
    public FloatingActionButton e;

    public dnau() {
        super(Integer.valueOf(R.layout.camera_gallery_screen_layout), new dmyw((dnbx) null, (dmiv) null, (fctc) null, false, false, false, false, 1023));
        this.aF = dpxe.a;
        this.aG = fctd.a(new fdae() { // from class: dmzr
            @Override // defpackage.fdae
            public final Object invoke() {
                dngy dngyVar = dngy.a;
                List list = (List) ((dmyw) this.a.bC()).f.a();
                list.getClass();
                if (Build.VERSION.SDK_INT <= 32) {
                    return fcva.b(dngy.c);
                }
                fcww fcwwVar = new fcww((byte[]) null);
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (fdbq.f(((dogj) it.next()).b(), doia.a)) {
                            fcwwVar.add(dngy.d);
                            break;
                        }
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (fdbq.f(((dogj) it2.next()).b(), doid.a)) {
                            fcwwVar.add(dngy.e);
                            break;
                        }
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (fdbq.f(((dogj) it3.next()).b(), doie.a)) {
                            fcwwVar.add(dngy.f);
                            break;
                        }
                    }
                }
                return fcva.a(fcwwVar);
            }
        });
        this.aH = fctd.a(new fdae() { // from class: dmzs
            @Override // defpackage.fdae
            public final Object invoke() {
                Slide slide = new Slide(80);
                dnau dnauVar = this.a;
                slide.setDuration(dnauVar.N().getContext().getResources().getInteger(R.integer.camera_gallery_fab_transition_duration));
                View view = dnauVar.c;
                if (view == null) {
                    fdbq.c("fabsContainer");
                    view = null;
                }
                slide.addTarget(view);
                return slide;
            }
        });
        this.ba = fctd.a(new fdae() { // from class: dmzt
            @Override // defpackage.fdae
            public final Object invoke() {
                return new dpxm(this.a.N());
            }
        });
        this.ai = dmzx.a;
        fdae fdaeVar = new fdae() { // from class: dmzu
            @Override // defpackage.fdae
            public final Object invoke() {
                dmbi dmbiVar = (dmbi) this.a.al.a();
                dmbiVar.getClass();
                return new dnaz(dmbiVar);
            }
        };
        int i = fdcj.a;
        this.bc = new lxf(new fdbi(dnay.class), new dnas(this), fdaeVar, new dnat(this));
        this.al = fctd.a(new fdae() { // from class: dmzv
            @Override // defpackage.fdae
            public final Object invoke() {
                dnau dnauVar = this.a;
                dmbd dmbdVar = dnauVar.an;
                if (dmbdVar == null) {
                    fdbq.c("galleryLoaderFactory");
                    dmbdVar = null;
                }
                return dmbdVar.a((dmyw) dnauVar.bC());
            }
        });
        fctd.a(new fdae() { // from class: dmzw
            @Override // defpackage.fdae
            public final Object invoke() {
                fcsu fcsuVar = this.a.aE;
                if (fcsuVar == null) {
                    fdbq.c("_attachmentResolverConfiguration");
                    fcsuVar = null;
                }
                Object objB = fcsuVar.b();
                objB.getClass();
                Optional optional = (Optional) objB;
                return (dluu) (optional.isPresent() ? optional.get() : new dluu(null));
            }
        });
        this.be = fctd.a(new fdae() { // from class: dmyy
            @Override // defpackage.fdae
            public final Object invoke() {
                dnau dnauVar = this.a;
                dmyt dmytVar = dnauVar.aB;
                if (dmytVar == null) {
                    fdbq.c("gridStateControllerFactory");
                    dmytVar = null;
                }
                dmyg dmygVarA = dnauVar.a();
                dmyw dmywVar = (dmyw) dnauVar.bC();
                Context context = (Context) dmytVar.a.b();
                context.getClass();
                dqav dqavVar = (dqav) dmytVar.b.b();
                dmywVar.getClass();
                return new dmys(context, dqavVar, dmygVarA, dmywVar);
            }
        });
        this.bi = fctd.a(new fdae() { // from class: dmyz
            @Override // defpackage.fdae
            public final Object invoke() {
                dmiv dmivVar = ((dmyw) this.a.bC()).e;
                dmiu dmiuVar = dmivVar != null ? dmivVar.a : null;
                dmir dmirVar = dmiuVar instanceof dmir ? (dmir) dmiuVar : null;
                if (dmirVar != null) {
                    return new dmyg(dmirVar);
                }
                return null;
            }
        });
        this.bj = fctd.a(new fdae() { // from class: dmza
            @Override // defpackage.fdae
            public final Object invoke() {
                final dnau dnauVar = this.a;
                dpyj dpyjVar = dnauVar.as;
                if (dpyjVar == null) {
                    fdbq.c("selectionFactory");
                    dpyjVar = null;
                }
                return new dpyi((ea) ((eyig) dpyjVar.a).a, ((dmyw) dnauVar.bC()).k, new fdae() { // from class: dmzk
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return dnauVar.aY();
                    }
                });
            }
        });
    }

    private final dpxm bn() {
        return (dpxm) this.ba.a();
    }

    private final void bo(List list) {
        fdil.d(bH(), null, null, new dnaa(list, this, null), 3);
    }

    public final dmyg a() {
        return (dmyg) this.bi.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aV(java.util.List r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dmzy
            if (r0 == 0) goto L13
            r0 = r8
            dmzy r0 = (defpackage.dmzy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dmzy r0 = new dmzy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r8)
            r8 = r7
            r7 = r0
            goto L57
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            fdjx r2 = r6.aX()
            fcyh r2 = r2.hE()
            dmzz r4 = new dmzz
            r5 = 0
            r4.<init>(r7, r6, r8, r5)
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r0 = defpackage.fdin.a(r2, r4, r0)
            if (r0 == r1) goto La1
        L57:
            int r0 = r7.size()
            int r1 = r8.size()
            int r0 = r0 - r1
            if (r0 <= 0) goto L9b
            int r7 = r7.size()
            android.content.Context r1 = r6.A()
            android.content.res.Resources r1 = r1.getResources()
            if (r0 != r3) goto L7a
            if (r7 != r3) goto L7a
            r7 = 2132084351(0x7f15067f, float:1.980887E38)
            java.lang.String r7 = r1.getString(r7)
            goto L8a
        L7a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r3 = 0
            r2[r3] = r7
            r7 = 2131951651(0x7f130023, float:1.9539723E38)
            java.lang.String r7 = r1.getQuantityString(r7, r0, r2)
        L8a:
            r7.getClass()
            eg r0 = r6.fg()
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            defpackage.dphh.a(r7, r0)
        L9b:
            r6.bo(r8)
            fctx r7 = defpackage.fctx.a
            return r7
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnau.aV(java.util.List, fcxy):java.lang.Object");
    }

    public final List aW() {
        return (List) this.aG.a();
    }

    public final fdjx aX() {
        fdjx fdjxVar = this.az;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        fdbq.c("localIoScope");
        return null;
    }

    public final fdvc aY() {
        dnho dnhoVar = null;
        if (((dmyw) bC()).i) {
            dnhq dnhqVar = ((dnhl) bG().invoke()).b;
            dnib dnibVar = dnhqVar instanceof dnib ? (dnib) dnhqVar : null;
            if (dnibVar != null) {
                return dnibVar.c();
            }
        }
        dnho dnhoVar2 = this.am;
        if (dnhoVar2 == null) {
            fdbq.c("attachmentsViewModel");
        } else {
            dnhoVar = dnhoVar2;
        }
        return dnhoVar.b;
    }

    @Override // defpackage.dpxo
    protected final void aZ(final dpgl dpglVar) {
        ((ekrd) a.e().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "applyHugoColors", 310, "CameraGalleryScreen.kt")).t("Applying HugoColors: %s", dpglVar);
        dnbv dnbvVar = this.bg;
        if (dnbvVar != null) {
            dnbvVar.d = new fdap() { // from class: dmzo
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    MaterialButton materialButton = (MaterialButton) obj;
                    ekrg ekrgVar = dnau.a;
                    materialButton.getClass();
                    int iB = ijg.b(dpglVar.a.a);
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
                    colorStateListValueOf.getClass();
                    materialButton.setTextColor(iB);
                    if (materialButton.c != colorStateListValueOf) {
                        materialButton.c = colorStateListValueOf;
                        materialButton.k(false);
                    }
                    materialButton.h(colorStateListValueOf);
                    return fctx.a;
                }
            };
            dnbvVar.p();
        }
        bn().b(dpglVar.l, dpglVar.m);
    }

    @Override // defpackage.ea
    public final void ao() {
        dmzx dmzxVar;
        super.ao();
        dmzx dmzxVarE = e();
        if (!bK() || dmzxVarE == (dmzxVar = dmzx.a) || dmzxVarE == this.ai) {
            return;
        }
        ((ekrd) a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "checkIfMediaPermissionsAreUpgraded", 364, "CameraGalleryScreen.kt")).D("Image/video permission changed from %s to %s, refreshing camera gallery screen.", this.ai, dmzxVarE);
        dmzx dmzxVar2 = this.ai;
        if (dmzxVar2 == dmzxVar) {
            be();
        } else if (dmzxVar2 == dmzx.b) {
            dmyg dmygVarA = a();
            if (dmygVarA != null) {
                dmygVarA.a(false, false);
            }
            dnbr dnbrVar = this.bh;
            if (dnbrVar != null) {
                dnbrVar.y(0);
            }
            dmbl dmblVar = this.ah;
            if (dmblVar == null) {
                fdbq.c("galleryMediaObserver");
                dmblVar = null;
            }
            dmblVar.onChange(true);
        }
        this.ai = dmzxVarE;
    }

    @Override // defpackage.ea
    public final void ap(final View view, Bundle bundle) {
        view.getClass();
        bA().f("CameraGalleryScreen#onViewCreated", new fdae() { // from class: dmzp
            @Override // defpackage.fdae
            public final Object invoke() {
                View view2 = view;
                ContentResolver contentResolver = view2.getContext().getContentResolver();
                final dnau dnauVar = this.a;
                dnauVar.ag = contentResolver;
                dnauVar.b = (RecyclerView) view2.findViewById(R.id.camera_gallery_recycler_view);
                Optional optional = dnauVar.aC;
                if (optional == null) {
                    fdbq.c("enableEdgeToEdge");
                    optional = null;
                }
                if (((Boolean) fdct.a(optional, false)).booleanValue()) {
                    RecyclerView recyclerView = dnauVar.b;
                    if (recyclerView == null) {
                        fdbq.c("recyclerView");
                        recyclerView = null;
                    }
                    View decorView = dnauVar.fg().getWindow().getDecorView();
                    decorView.getClass();
                    dphw.e(recyclerView, decorView);
                }
                dnauVar.c = view2.findViewById(R.id.camera_gallery_fabs_container);
                FloatingActionButton floatingActionButton = (FloatingActionButton) view2.findViewById(R.id.camera_gallery_system_gallery_picker_button);
                floatingActionButton.getClass();
                floatingActionButton.setVisibility(true != ((dmyw) dnauVar.bC()).d.c ? 8 : 0);
                Optional optional2 = dnauVar.av;
                if (optional2 == null) {
                    fdbq.c("systemPickerFabCreateListener");
                    optional2 = null;
                }
                final fdap fdapVar = new fdap() { // from class: dmzc
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dncd dncdVar = (dncd) obj;
                        ekrg ekrgVar = dnau.a;
                        dncdVar.getClass();
                        dncdVar.a();
                        return fctx.a;
                    }
                };
                optional2.ifPresent(new Consumer() { // from class: dmzd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ekrg ekrgVar = dnau.a;
                        fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                floatingActionButton.setOnClickListener(dnauVar.bA().a("CameraGalleryScreen.SystemPickerFab#onClick", new View.OnClickListener() { // from class: dmze
                    @Override // android.view.View.OnClickListener
                    public final void onClick(final View view3) {
                        dnau dnauVar2 = dnauVar;
                        Optional optional3 = dnauVar2.aw;
                        if (optional3 == null) {
                            fdbq.c("systemPickerFabClickListener");
                            optional3 = null;
                        }
                        final fdap fdapVar2 = new fdap() { // from class: dmzl
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                dncc dnccVar = (dncc) obj;
                                ekrg ekrgVar = dnau.a;
                                dnccVar.getClass();
                                view3.getClass();
                                dnccVar.a();
                                return fctx.a;
                            }
                        };
                        optional3.ifPresent(new Consumer() { // from class: dmzm
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                ekrg ekrgVar = dnau.a;
                                fdapVar2.invoke(obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        dnauVar2.bh();
                    }
                }));
                dnauVar.e = floatingActionButton;
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) view2.findViewById(R.id.camera_gallery_fullscreen_camera_button);
                floatingActionButton2.getClass();
                floatingActionButton2.setVisibility(((dmyw) dnauVar.bC()).e == null ? 8 : 0);
                if (floatingActionButton2.getVisibility() == 0) {
                    floatingActionButton2.setOnClickListener(dnauVar.bA().a("CameraGalleryScreen.CameraFab#onClick", new View.OnClickListener() { // from class: dmzf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            dmiv dmivVar = ((dmyw) dnauVar.bC()).e;
                            if (dmivVar == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            view3.getClass();
                            dmivVar.c.a(view3);
                        }
                    }));
                }
                dnauVar.d = floatingActionButton2;
                fdil.d(dnauVar.bH(), null, null, new dnaq(dnauVar, null), 3);
                dnauVar.ai = dnauVar.e();
                dnauVar.bL();
                return fctx.a;
            }
        });
        Optional optional = this.aD;
        View view2 = null;
        if (optional == null) {
            fdbq.c("reactionPickerSystemBarsBottomPadding");
            optional = null;
        }
        if (((Boolean) fdct.a(optional, false)).booleanValue()) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                fdbq.c("recyclerView");
                recyclerView = null;
            }
            final int paddingBottom = recyclerView.getPaddingBottom();
            View view3 = this.c;
            if (view3 == null) {
                fdbq.c("fabsContainer");
            } else {
                view2 = view3;
            }
            final int paddingBottom2 = view2.getPaddingBottom();
            ldn ldnVar = new ldn() { // from class: dmzq
                @Override // defpackage.ldn
                public final lgt ez(View view4, lgt lgtVar) {
                    view4.getClass();
                    dnau dnauVar = this.a;
                    kzc kzcVarF = lgtVar.f(647);
                    View view5 = dnauVar.c;
                    RecyclerView recyclerView2 = null;
                    if (view5 == null) {
                        fdbq.c("fabsContainer");
                        view5 = null;
                    }
                    int i = paddingBottom2;
                    int i2 = kzcVarF.e;
                    view5.setPadding(view5.getPaddingLeft(), view5.getPaddingTop(), view5.getPaddingRight(), i + i2);
                    RecyclerView recyclerView3 = dnauVar.b;
                    if (recyclerView3 == null) {
                        fdbq.c("recyclerView");
                    } else {
                        recyclerView2 = recyclerView3;
                    }
                    recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), i2 + paddingBottom);
                    return lgtVar;
                }
            };
            int[] iArr = ley.a;
            len.k(view, ldnVar);
        }
    }

    public final dmys b() {
        return (dmys) this.be.a();
    }

    public final void bc(dojw dojwVar) {
        bo(fcva.b(dojwVar));
    }

    public final void bd() {
        bn().a();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            fdbq.c("recyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        bk();
    }

    public final void be() {
        dnbo dnboVar;
        dnbv dnbvVar;
        RecyclerView recyclerView;
        dnbs dnbsVar = this.ar;
        dmbl dmblVar = null;
        if (dnbsVar == null) {
            fdbq.c("selectMediaPermissionRequestAdapterFactory");
            dnbsVar = null;
        }
        dnac dnacVar = new dnac(this);
        dnhb dnhbVar = (dnhb) dnbsVar.a.b();
        dnhbVar.getClass();
        this.bh = new dnbr(dnhbVar, dnacVar);
        bi(false);
        Optional optional = this.aA;
        if (optional == null) {
            fdbq.c("headerControllerOptional");
            optional = null;
        }
        ujf ujfVar = (ujf) fdct.b(optional);
        if (ujfVar != null) {
            dnboVar = new dnbo();
            fdil.d(lvk.a(this), null, null, new dnaf(dnboVar, ujfVar, this, null), 3);
        } else {
            dnboVar = null;
        }
        this.bd = dnboVar;
        Optional optional2 = this.aq;
        if (optional2 == null) {
            fdbq.c("cameraAdapterFactory");
            optional2 = null;
        }
        final fdap fdapVar = new fdap() { // from class: dmyx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnbf dnbfVar = (dnbf) obj;
                dnbfVar.getClass();
                dnau dnauVar = this.a;
                dmys dmysVarB = dnauVar.b();
                dmysVarB.getClass();
                dpim dpimVarBC = dnauVar.bC();
                dpimVarBC.getClass();
                dnag dnagVar = new dnag(dnauVar);
                dnah dnahVar = new dnah(dnauVar);
                dmiv dmivVar = ((dmyw) dpimVarBC).e;
                if (dmivVar != null) {
                    return new dnbe(dnbfVar.a, dnbfVar.b, dnbfVar.c, dmysVarB, dmivVar, dnagVar, dnahVar);
                }
                return null;
            }
        };
        Optional map = optional2.map(new Function() { // from class: dmzi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = dnau.a;
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        this.bf = (dnbe) fdct.b(map);
        if (((dmyw) bC()).d.d) {
            dmys dmysVarB = b();
            dmysVarB.getClass();
            dnbvVar = new dnbv(dmysVarB, new dnak(this), new dnal(this));
        } else {
            dnbvVar = null;
        }
        this.bg = dnbvVar;
        dnbl dnblVar = this.ap;
        if (dnblVar == null) {
            fdbq.c("galleryMediaAdapterFactory");
            dnblVar = null;
        }
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null) {
            fdbq.c("recyclerView");
            recyclerView2 = null;
        }
        dmbj dmbjVar = new dmbj(recyclerView2);
        fdae fdaeVar = new fdae() { // from class: dmzj
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.aY();
            }
        };
        dnab dnabVar = new dnab(this);
        dmys dmysVarB2 = b();
        doma domaVar = (doma) dnblVar.a.b();
        dmysVarB2.getClass();
        final dnbk dnbkVar = new dnbk(domaVar, dmbjVar, fdaeVar, dnabVar, dmysVarB2);
        RecyclerView recyclerView3 = this.b;
        if (recyclerView3 == null) {
            fdbq.c("recyclerView");
            recyclerView = null;
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.am(new dpyc());
        sn snVar = new sn();
        snVar.b();
        so soVarA = snVar.a();
        vo[] voVarArr = (vo[]) fcur.K(new vo[]{this.bd, this.bh, this.bf, this.bg, dnbkVar}).toArray(new vo[0]);
        recyclerView.al(new sp(soVarA, (vo[]) Arrays.copyOf(voVarArr, voVarArr.length)));
        dpyi dpyiVar = (dpyi) this.bj.a();
        recyclerView.getClass();
        if (!(recyclerView.E instanceof dpyc)) {
            throw new IllegalArgumentException("Expected RecyclerView to have an ItemAnimator that implements SelectionItemAnimator, consider using NoChangeAnimationDefaultItemAnimator.");
        }
        fdil.d(lvk.a(dpyiVar.a.Q()), null, null, new dpyh(dpyiVar, recyclerView, new fdae() { // from class: dpyd
            @Override // defpackage.fdae
            public final Object invoke() {
                oog oogVar = ((ova) dnbkVar).a;
                owg owgVar = (owg) oogVar.f.get();
                if (owgVar == null) {
                    return oogVar.g.b();
                }
                int iA = owgVar.a() - 1;
                ArrayList arrayList = new ArrayList();
                if (iA >= 0) {
                    int i = 0;
                    while (true) {
                        arrayList.add(owgVar.i(i));
                        if (i == iA) {
                            break;
                        }
                        i++;
                    }
                }
                return new oqx(owgVar.e(), owgVar.d(), arrayList);
            }
        }, dnbkVar, null), 3);
        fdil.d(lvk.a(Q()), null, null, new dnaj(recyclerView, this, null), 3);
        bd();
        fdil.d(lvk.a(this), null, null, new dnan(this, dnbkVar, null), 3);
        dnbkVar.F(new fdap() { // from class: dmzn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                opc opcVar = (opc) obj;
                opcVar.getClass();
                final dnau dnauVar = this.a;
                RecyclerView recyclerView4 = dnauVar.b;
                if (recyclerView4 == null) {
                    fdbq.c("recyclerView");
                    recyclerView4 = null;
                }
                vo voVar = recyclerView4.n;
                voVar.getClass();
                orp orpVar = opcVar.a;
                if (orpVar instanceof oro) {
                    if (voVar.a() == 0) {
                        ((ekrd) dnau.a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 638, "CameraGalleryScreen.kt")).q("No media or camera found, showing error screen");
                        dnauVar.bj(R.string.no_media_description, Integer.valueOf(R.string.no_media_caption), R.string.no_media_button, dnauVar.bA().a("CameraGalleryScreen.NoMediaSystemPickerButton#onClick", new View.OnClickListener() { // from class: dmzh
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                dnauVar.bh();
                            }
                        }));
                    } else {
                        ((ekrd) dnau.a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 649, "CameraGalleryScreen.kt")).q("Media or camera found, hiding error and showing media");
                        dnauVar.bd();
                    }
                } else if (orpVar instanceof orm) {
                    ((ekrd) ((ekrd) dnau.a.i()).g(((orm) orpVar).a).h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 654, "CameraGalleryScreen.kt")).q("Load state switched to error");
                } else {
                    ((ekrd) dnau.a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 655, "CameraGalleryScreen.kt")).t("Load state updated to: %s", orpVar);
                }
                return fctx.a;
            }
        });
        Handler handler = new Handler(Looper.getMainLooper());
        dmbn dmbnVarA = f().a();
        RecyclerView recyclerView4 = this.b;
        if (recyclerView4 == null) {
            fdbq.c("recyclerView");
            recyclerView4 = null;
        }
        this.ah = new dmbl(handler, dmbnVarA, dnbkVar, recyclerView4);
        ContentResolver contentResolver = this.ag;
        if (contentResolver == null) {
            fdbq.c("contentResolver");
            contentResolver = null;
        }
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        dmbl dmblVar2 = this.ah;
        if (dmblVar2 == null) {
            fdbq.c("galleryMediaObserver");
            dmblVar2 = null;
        }
        contentResolver.registerContentObserver(uri, true, dmblVar2);
        Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        dmbl dmblVar3 = this.ah;
        if (dmblVar3 == null) {
            fdbq.c("galleryMediaObserver");
        } else {
            dmblVar = dmblVar3;
        }
        contentResolver.registerContentObserver(uri2, true, dmblVar);
        this.bb = true;
        bS();
    }

    @Override // defpackage.dpxo
    public final void bf() {
        dnbe dnbeVar = this.bf;
        if (dnbeVar != null) {
            fdil.d(dnbeVar.a, null, null, new dnbc(dnbeVar, null), 3);
            if (dnbeVar.e.d) {
                dnbeVar.d.P().d(dnbeVar);
            }
        }
    }

    @Override // defpackage.dpxo
    public final void bg() {
        dnbe dnbeVar = this.bf;
        if (dnbeVar != null) {
            dmiz dmizVar = dnbeVar.f;
            if (dmizVar != null) {
                dnbeVar.l(dmizVar);
            }
            if (dnbeVar.e.d) {
                dnbeVar.d.P().c(dnbeVar);
            }
        }
    }

    public final void bh() {
        p().a();
    }

    public final void bi(boolean z) {
        dmyg dmygVarA = a();
        if (dmygVarA != null) {
            dnbr dnbrVar = this.bh;
            dmygVarA.a(z, dnbrVar != null ? dnbrVar.l() : false);
        }
        if (z && ((dmyw) bC()).g) {
            bP().b(true);
        }
    }

    public final void bj(int i, Integer num, int i2, View.OnClickListener onClickListener) {
        dpxm.c(bn(), null, Integer.valueOf(i), num, Integer.valueOf(i2), onClickListener, 1);
        RecyclerView recyclerView = this.b;
        View view = null;
        if (recyclerView == null) {
            fdbq.c("recyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        View view2 = this.c;
        if (view2 == null) {
            fdbq.c("fabsContainer");
        } else {
            view = view2;
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bk() {
        /*
            r7 = this;
            boolean r0 = r7.aj
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L19
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r7.e
            if (r0 != 0) goto L11
            java.lang.String r0 = "systemGalleryPickerFab"
            defpackage.fdbq.c(r0)
            r0 = r1
        L11:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r3
        L1a:
            boolean r4 = r7.ak
            if (r4 != 0) goto L30
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r7.d
            if (r4 != 0) goto L28
            java.lang.String r4 = "cameraFab"
            defpackage.fdbq.c(r4)
            r4 = r1
        L28:
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L30
            r4 = r2
            goto L31
        L30:
            r4 = r3
        L31:
            if (r0 != 0) goto L38
            if (r4 == 0) goto L36
            goto L38
        L36:
            r0 = r3
            goto L39
        L38:
            r0 = r2
        L39:
            android.view.View r4 = r7.c
            java.lang.String r5 = "fabsContainer"
            if (r4 != 0) goto L43
            defpackage.fdbq.c(r5)
            r4 = r1
        L43:
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L4b
            r4 = r3
            goto L4c
        L4b:
            r4 = r2
        L4c:
            if (r4 != r0) goto L4f
            return
        L4f:
            android.view.View r4 = r7.N()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            fctc r6 = r7.aH
            java.lang.Object r6 = r6.a()
            android.transition.Slide r6 = (android.transition.Slide) r6
            android.transition.TransitionManager.beginDelayedTransition(r4, r6)
            android.view.View r4 = r7.c
            if (r4 != 0) goto L68
            defpackage.fdbq.c(r5)
            goto L69
        L68:
            r1 = r4
        L69:
            if (r2 == r0) goto L6d
            r3 = 8
        L6d:
            r1.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnau.bk():void");
    }

    public final dmzx e() {
        return q().c(fcva.g(dngy.i, dngy.j)) ? dmzx.c : q().d(dngy.h) ? dmzx.b : dmzx.a;
    }

    public final dnay f() {
        return (dnay) this.bc.a();
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        dmiv dmivVar = ((dmyw) bC()).e;
        if (dmivVar != null) {
            dmivVar.c.b(new dnao(this));
        }
        dncb dncbVarP = p();
        Activity activity = this.au;
        if (activity == null) {
            fdbq.c("activity");
            activity = null;
        }
        dncb.c(dncbVarP, activity, ((dmyw) bC()).d, new adi() { // from class: dmzb
            @Override // defpackage.adi
            public final void a(Object obj) {
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    ((ekrd) dnau.a.h().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onCreate$lambda$13", 240, "CameraGalleryScreen.kt")).q("No gallery media was selected");
                } else {
                    dnau dnauVar = this.a;
                    fdil.d(dnauVar.bH(), null, null, new dnap(dnauVar, list, null), 3);
                }
            }
        });
    }

    @Override // defpackage.ea
    public final void i() {
        super.i();
        if (this.bb) {
            ContentResolver contentResolver = this.ag;
            dmbl dmblVar = null;
            if (contentResolver == null) {
                fdbq.c("contentResolver");
                contentResolver = null;
            }
            dmbl dmblVar2 = this.ah;
            if (dmblVar2 == null) {
                fdbq.c("galleryMediaObserver");
            } else {
                dmblVar = dmblVar2;
            }
            contentResolver.unregisterContentObserver(dmblVar);
            this.bb = false;
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        dmiv dmivVar = ((dmyw) bC()).e;
    }

    public final dncb p() {
        dncb dncbVar = this.at;
        if (dncbVar != null) {
            return dncbVar;
        }
        fdbq.c("systemContentPickerLauncher");
        return null;
    }

    public final dnhb q() {
        dnhb dnhbVar = this.ao;
        if (dnhbVar != null) {
            return dnhbVar;
        }
        fdbq.c("permissionsManager");
        return null;
    }

    public final dolm r() {
        dolm dolmVar = this.ax;
        if (dolmVar != null) {
            return dolmVar;
        }
        fdbq.c("localMediaResolver");
        return null;
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        RecyclerView recyclerView;
        View view = this.Q;
        if (view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.camera_gallery_recycler_view)) == null) {
            return null;
        }
        return dpvu.a(recyclerView);
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.aF;
    }
}
