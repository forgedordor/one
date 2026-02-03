package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.car.app.model.Alert;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import defpackage.aao$$ExternalSyntheticApiModelOutline0;
import defpackage.akc$$ExternalSyntheticApiModelOutline0;
import defpackage.ctk;
import defpackage.cuh;
import defpackage.cuu;
import defpackage.fcta;
import defpackage.fctg;
import defpackage.fcth;
import defpackage.fcva;
import defpackage.fcwm;
import defpackage.fcxm;
import defpackage.fcyh;
import defpackage.fdae;
import defpackage.fdap;
import defpackage.fdbq;
import defpackage.fdbt;
import defpackage.fdci;
import defpackage.fdjx;
import defpackage.fdjy;
import defpackage.fek;
import defpackage.ffm;
import defpackage.fge;
import defpackage.fgf;
import defpackage.fgh;
import defpackage.hnt;
import defpackage.hox;
import defpackage.hpl;
import defpackage.hqr;
import defpackage.hrp;
import defpackage.hsf;
import defpackage.hsi;
import defpackage.hum;
import defpackage.hxn;
import defpackage.hzf;
import defpackage.iao;
import defpackage.icn;
import defpackage.icr;
import defpackage.ics;
import defpackage.ida;
import defpackage.ide;
import defpackage.idh;
import defpackage.idm;
import defpackage.ido;
import defpackage.idp;
import defpackage.idu;
import defpackage.idz;
import defpackage.ied;
import defpackage.ifq;
import defpackage.ifw;
import defpackage.igd;
import defpackage.ige;
import defpackage.igk;
import defpackage.ihe;
import defpackage.ihf;
import defpackage.ihl;
import defpackage.ihu;
import defpackage.iic;
import defpackage.iie;
import defpackage.ijc;
import defpackage.iju;
import defpackage.ikh;
import defpackage.iqa;
import defpackage.iqc;
import defpackage.iqe;
import defpackage.iqf;
import defpackage.iqk;
import defpackage.iro;
import defpackage.irp;
import defpackage.isa;
import defpackage.ish;
import defpackage.isj;
import defpackage.isk;
import defpackage.itu;
import defpackage.itv;
import defpackage.itw;
import defpackage.ivq;
import defpackage.ivz;
import defpackage.iyv;
import defpackage.izz;
import defpackage.jbg;
import defpackage.jbi;
import defpackage.jbm;
import defpackage.jbu;
import defpackage.jcr;
import defpackage.jcu;
import defpackage.jcy;
import defpackage.jdn;
import defpackage.jdo;
import defpackage.jdy;
import defpackage.jee;
import defpackage.jfd;
import defpackage.jfe;
import defpackage.jfh;
import defpackage.jfr;
import defpackage.jgj;
import defpackage.jgt;
import defpackage.jgu;
import defpackage.jgv;
import defpackage.jhc;
import defpackage.jhd;
import defpackage.jhf;
import defpackage.jhg;
import defpackage.jhh;
import defpackage.jhi;
import defpackage.jhj;
import defpackage.jhk;
import defpackage.jhl;
import defpackage.jhm;
import defpackage.jhn;
import defpackage.jhp;
import defpackage.jhq;
import defpackage.jht;
import defpackage.jhu;
import defpackage.jhv;
import defpackage.jhw;
import defpackage.jhx;
import defpackage.jhy;
import defpackage.jhz;
import defpackage.jib;
import defpackage.jie;
import defpackage.jir;
import defpackage.jiw;
import defpackage.jix;
import defpackage.jiy;
import defpackage.jja;
import defpackage.jjb;
import defpackage.jjc;
import defpackage.jjd;
import defpackage.jjv;
import defpackage.jkb;
import defpackage.jkd;
import defpackage.jkq;
import defpackage.jkr;
import defpackage.jks;
import defpackage.jkt;
import defpackage.jku;
import defpackage.jla;
import defpackage.jlb;
import defpackage.jlc;
import defpackage.jld;
import defpackage.jmj;
import defpackage.jmq;
import defpackage.jmr;
import defpackage.jms;
import defpackage.jmu;
import defpackage.jng;
import defpackage.jnh;
import defpackage.jnl;
import defpackage.jno;
import defpackage.jnq;
import defpackage.jnv;
import defpackage.jou;
import defpackage.joy;
import defpackage.jpa;
import defpackage.jrb;
import defpackage.jrh;
import defpackage.jri;
import defpackage.jrj;
import defpackage.jrk;
import defpackage.jrl;
import defpackage.jrm;
import defpackage.jrn;
import defpackage.jrs;
import defpackage.jsa;
import defpackage.jsc;
import defpackage.jsd;
import defpackage.jse;
import defpackage.jsl;
import defpackage.jsm;
import defpackage.jsn;
import defpackage.jso;
import defpackage.jsp;
import defpackage.jte;
import defpackage.jua;
import defpackage.juo;
import defpackage.jyo;
import defpackage.kbi;
import defpackage.kbp;
import defpackage.kdw;
import defpackage.kdy;
import defpackage.kec;
import defpackage.ked;
import defpackage.keh;
import defpackage.kei;
import defpackage.keq;
import defpackage.kew;
import defpackage.key;
import defpackage.kfc;
import defpackage.kfh;
import defpackage.kfk;
import defpackage.kfs;
import defpackage.kfu;
import defpackage.kii;
import defpackage.kik;
import defpackage.kil;
import defpackage.kio;
import defpackage.kjb;
import defpackage.kjd;
import defpackage.kje;
import defpackage.kjg;
import defpackage.kji;
import defpackage.kjw;
import defpackage.kkt;
import defpackage.ley;
import defpackage.lhu;
import defpackage.lpz;
import defpackage.lun;
import defpackage.lvc;
import defpackage.lvj;
import defpackage.lxr;
import defpackage.pjb;
import defpackage.pje;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements jfh, iro, lun, jfd {
    public static Class a;
    public static Method b;
    public static Method c;
    public static final cuu d = new cuu((byte[]) null);
    public static Runnable e;
    public static Method f;
    public final jfr A;
    public boolean B;
    public jmq C;
    public final jdo D;
    public final float[] E;
    public final float[] F;
    public boolean G;
    public final hox H;
    public fdap I;
    public final key J;
    public final iqa K;
    public final iqe L;
    public final izz M;
    public MotionEvent N;
    public long O;
    public final jpa P;
    public final jhy Q;
    public boolean R;
    public final jrk S;
    public int T;
    public final jmj U;
    public final jjv V;
    public final jkd W;
    private boolean aA;
    private long aB;
    private final hsf aC;
    private final ViewTreeObserver.OnGlobalLayoutListener aD;
    private final ViewTreeObserver.OnScrollChangedListener aE;
    private final ViewTreeObserver.OnTouchModeChangeListener aF;
    private final kfh aG;
    private final AtomicReference aH;
    private final hox aI;
    private int aJ;
    private final hox aK;
    private final cuu aL;
    private float aM;
    private float aN;
    private final Runnable aO;
    private final fdae aP;
    private final jlb aQ;
    private boolean aR;
    public final jhv aa;
    public final iie ab;
    private long ac;
    private final boolean ad;
    private final hox ae;
    private View af;
    private final jrs ag;
    private final EmptySemanticsElement ah;
    private final AndroidComposeView$bringIntoViewNode$1 ai;
    private final ics aj;
    private final ics ak;
    private final ijc al;
    private final List am;
    private List an;
    private boolean ao;
    private boolean ap;
    private final irp aq;
    private final isk ar;
    private boolean as;
    private jkr at;
    private kil au;
    private boolean av;
    private long aw;
    private final int[] ax;
    private final float[] ay;
    private long az;
    public final jcu g;
    public final boolean h;
    public final ige i;
    public fcyh j;
    public final AndroidDragAndDropManager k;
    public final jno l;
    public final jou m;
    public final jcr n;
    public final cuh o;
    public final jua p;
    public final jso q;
    public final jir r;
    public final ied s;
    public final jgt t;
    public final idp u;
    public fdap v;
    public final ide w;
    public final idh x;
    public final jgv y;
    public final jgu z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1, ics] */
    public AndroidComposeView(Context context, fcyh fcyhVar) {
        super(context);
        this.ac = 9205357640488583168L;
        this.ad = true;
        this.g = new jcu(null == true ? 1 : 0);
        kio kioVarA = kii.a(context);
        hqr hqrVar = hqr.a;
        this.ae = new hpl(kioVarA, hqrVar);
        boolean z = false;
        boolean z2 = Build.VERSION.SDK_INT >= 35;
        this.h = z2;
        jrs jrsVar = new jrs();
        this.ag = jrsVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(jrsVar);
        this.ah = emptySemanticsElement;
        ?? r2 = new jdy<jla>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // defpackage.jdy
            public final /* bridge */ /* synthetic */ icr d() {
                return new jla(this.a);
            }

            @Override // defpackage.jdy
            public final /* bridge */ /* synthetic */ void e(icr icrVar) {
                ((jla) icrVar).a = this.a;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }
        };
        this.ai = r2;
        FocusOwnerImpl focusOwnerImpl = new FocusOwnerImpl(new jhj(this), new jhk(this), new jhl(this), new jhm(this), new jhn(this), new fdbt(this) { // from class: jho
            @Override // defpackage.fdbt, defpackage.fdee
            public final Object a() {
                return ((AndroidComposeView) this.g).m();
            }
        });
        this.i = focusOwnerImpl;
        this.j = fcyhVar;
        AndroidDragAndDropManager androidDragAndDropManager = new AndroidDragAndDropManager();
        this.k = androidDragAndDropManager;
        this.l = new jno();
        ics icsVarA = iqk.a(ics.e, new jht(this));
        this.aj = icsVarA;
        RotaryInputElement rotaryInputElement = new RotaryInputElement(jhz.a);
        this.ak = rotaryInputElement;
        this.al = new ijc();
        jkq jkqVar = new jkq(ViewConfiguration.get(context));
        this.m = jkqVar;
        new ivq();
        jcr jcrVar = new jcr(z, 3, null == true ? 1 : 0);
        jcrVar.h(iyv.a);
        jcrVar.ag(l());
        jcrVar.ah(jkqVar);
        jcrVar.i(icn.a(emptySemanticsElement, rotaryInputElement).a(icsVarA).a(focusOwnerImpl.f).a(androidDragAndDropManager.c).a(r2));
        this.n = jcrVar;
        cuh cuhVar = ctk.a;
        cuh cuhVar2 = new cuh((byte[]) null);
        this.o = cuhVar2;
        jua juaVar = new jua(null);
        this.p = juaVar;
        jso jsoVar = new jso(jcrVar, jrsVar, cuhVar2);
        this.q = jsoVar;
        jir jirVar = new jir(this);
        this.r = jirVar;
        ied iedVar = new ied(this, new jhg(this));
        this.s = iedVar;
        this.t = new jgt(context);
        this.ab = new iie(this);
        idp idpVar = new idp();
        this.u = idpVar;
        this.am = new ArrayList();
        this.aq = new irp();
        this.ar = new isk(jcrVar);
        this.v = jhf.a;
        this.w = new ide(this, idpVar);
        AutofillManager autofillManagerM139m = akc$$ExternalSyntheticApiModelOutline0.m139m(context.getSystemService(akc$$ExternalSyntheticApiModelOutline0.m143m()));
        if (autofillManagerM139m == null) {
            itw.b("Autofill service could not be located.");
            throw new fcta();
        }
        this.x = new idh(new idu(autofillManagerM139m), jsoVar, this, juaVar, context.getPackageName());
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        jgv jgvVar = new jgv((ClipboardManager) systemService);
        this.y = jgvVar;
        this.z = new jgu(jgvVar);
        this.A = new jfr(new jib(this));
        this.D = new jdo(jcrVar);
        this.aw = 9223372034707292159L;
        this.ax = new int[]{0, 0};
        float[] fArrF = iju.f();
        this.ay = fArrF;
        this.E = iju.f();
        this.F = iju.f();
        this.az = -1L;
        this.aB = 9187343241974906880L;
        this.G = true;
        hsi hsiVar = hsi.a;
        this.H = new hpl(null, hsiVar);
        jie jieVar = new jie(this);
        hxn hxnVar = hrp.a;
        this.aC = new hnt(jieVar, null);
        this.aD = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: jgw
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.N();
            }
        };
        this.aE = new ViewTreeObserver.OnScrollChangedListener() { // from class: jgx
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.a.N();
            }
        };
        this.aF = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: jgy
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z3) {
                this.a.L.a(true != z3 ? 2 : 1);
            }
        };
        kfh kfhVar = new kfh(this, this);
        this.aG = kfhVar;
        key keyVar = new key(kfhVar);
        this.J = keyVar;
        this.aH = new AtomicReference(null);
        this.U = new jmj(keyVar);
        this.V = new jjv();
        this.aI = new hpl(kbp.a(context), hqrVar);
        this.aJ = af(context.getResources().getConfiguration());
        kji kjiVarC = ifw.c(context.getResources().getConfiguration().getLayoutDirection());
        this.aK = new hpl(kjiVarC == null ? kji.a : kjiVarC, hsiVar);
        this.K = new iqc(this);
        this.L = new iqe(true != isInTouchMode() ? 2 : 1);
        this.M = new izz(this);
        this.W = new jkd(this);
        this.P = new jpa();
        this.aL = new cuu((byte[]) (null == true ? 1 : 0));
        this.Q = new jhy(this);
        this.aO = new Runnable() { // from class: jgz
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView androidComposeView = this.a;
                androidComposeView.R = false;
                MotionEvent motionEvent = androidComposeView.N;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.C(motionEvent);
            }
        };
        this.aP = new jhx(this);
        this.aQ = Build.VERSION.SDK_INT < 29 ? new jlc(fArrF) : new jld();
        addOnAttachStateChangeListener(iedVar);
        setWillNotDraw(false);
        setFocusable(true);
        jjc.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ley.p(this, jirVar);
        setOnDragListener(androidDragAndDropManager);
        jcrVar.H(this);
        if (Build.VERSION.SDK_INT >= 29) {
            jix.a.a(this);
        }
        if (z2) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, true);
            this.af = view;
            addView(view);
        }
        this.S = Build.VERSION.SDK_INT >= 31 ? new jrk() : null;
        this.aa = new jhv(this);
    }

    private final int U(MotionEvent motionEvent) {
        int actionMasked;
        removeCallbacks(this.Q);
        try {
            this.az = AnimationUtils.currentAnimationTimeMillis();
            aa();
            long jA = iju.a(this.E, (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX()) << 32));
            this.aB = (Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jA >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jA & 4294967295L))) & 4294967295L);
            boolean z = true;
            this.aA = true;
            q(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.N;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && ag(motionEvent, motionEvent2)) {
                    if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        this.ar.b();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        M(motionEvent2, 10, motionEvent2.getEventTime(), true);
                    }
                }
                int toolType = motionEvent.getToolType(0);
                if (!z2 && toolType == 3 && actionMasked2 != 3 && actionMasked2 != 9 && ad(motionEvent)) {
                    M(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.N;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.N;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.aq.b(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.N;
                        float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.N;
                        float y = motionEvent6 != null ? motionEvent6.getY() : Float.NaN;
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (x == x2 && y == y2) {
                            z = false;
                        }
                        MotionEvent motionEvent7 = this.N;
                        long eventTime = motionEvent7 != null ? motionEvent7.getEventTime() : -1L;
                        long eventTime2 = motionEvent.getEventTime();
                        if (z || eventTime != eventTime2) {
                            if (pointerId >= 0) {
                                this.aq.b(pointerId);
                            }
                            this.ar.a.a();
                        }
                    }
                }
                this.N = MotionEvent.obtainNoHistory(motionEvent);
                return C(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.aA = false;
        }
    }

    private final View V(int i, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (fdbq.f(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewV = V(i, viewGroup.getChildAt(i2));
                    if (viewV != null) {
                        return viewV;
                    }
                }
            }
        }
        return null;
    }

    private final void W(ViewGroup viewGroup) throws Throwable {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).s();
            } else if (childAt instanceof ViewGroup) {
                W((ViewGroup) childAt);
            }
        }
    }

    private final void X() {
        if (this.ap) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.ap = false;
        }
    }

    private final void Y(jcr jcrVar) {
        jcrVar.P();
        hum humVarQ = jcrVar.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            Y((jcr) objArr[i2]);
        }
    }

    private final void Z(jcr jcrVar) {
        this.D.j(jcrVar, false);
        hum humVarQ = jcrVar.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            Z((jcr) objArr[i2]);
        }
    }

    private final void aa() {
        float[] fArr = this.E;
        this.aQ.a(this, fArr);
        jnl.a(fArr, this.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ab(jcr jcrVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (jcrVar != null) {
            while (jcrVar != null && jcrVar.aD() == 1) {
                if (!this.av) {
                    jcr jcrVarS = jcrVar.s();
                    if (jcrVarS == null) {
                        break;
                    }
                    long j = jcrVarS.w().d;
                    if (kil.k(j) && kil.j(j)) {
                        break;
                    }
                }
                jcrVar = jcrVar.s();
            }
            if (jcrVar == this.n) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final void ac() {
        hox hoxVar = this.l.a;
        if (hoxVar != null) {
            hoxVar.b(new kjg(jks.b(this)));
        }
    }

    private final boolean ad(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= 0.0f && x <= ((float) getWidth()) && y >= 0.0f && y <= ((float) getHeight());
    }

    private final boolean ae(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.N) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private static final int af(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    private static final boolean ag(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private static final boolean ah(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !jnq.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private static final long ai(int i, int i2) {
        return i2 | (i << 32);
    }

    private static final long aj(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return ai(0, size);
        }
        if (mode == 0) {
            return ai(0, Alert.DURATION_SHOW_INDEFINITELY);
        }
        if (mode == 1073741824) {
            return ai(size, size);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.jfh
    public final boolean A() {
        return Build.VERSION.SDK_INT >= 30 ? jkt.a.a(this) : this.B;
    }

    @Override // defpackage.jfh
    public final void B() {
        this.ap = true;
    }

    public final int C(MotionEvent motionEvent) {
        Object obj;
        if (this.aR) {
            this.aR = false;
            jno.e(motionEvent.getMetaState());
        }
        irp irpVar = this.aq;
        ish ishVarA = irpVar.a(motionEvent, this);
        if (ishVarA == null) {
            this.ar.b();
            return 0;
        }
        List list = ishVarA.a;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((isj) obj).e) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        isj isjVar = (isj) obj;
        if (isjVar != null) {
            this.ac = isjVar.d;
        }
        int iA = this.ar.a(ishVarA, this, ad(motionEvent));
        ishVarA.b = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && (iA & 1) == 0) {
            irpVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iA;
    }

    public final ihu D() {
        if (isFocused()) {
            return this.i.c();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null) {
            return null;
        }
        return ifw.b(viewFindFocus, this);
    }

    public final jhd E() {
        return (jhd) this.aC.a();
    }

    public final jkr F() {
        if (this.at == null) {
            jkr jkrVar = new jkr(getContext());
            this.at = jkrVar;
            addView(jkrVar);
            requestLayout();
        }
        jkr jkrVar2 = this.at;
        jkrVar2.getClass();
        return jkrVar2;
    }

    public final void G(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iB;
        jir jirVar = this.r;
        if (fdbq.f(str, jirVar.y)) {
            int iB2 = jirVar.w.b(i);
            if (iB2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB2);
                return;
            }
            return;
        }
        if (!fdbq.f(str, jirVar.z) || (iB = jirVar.x.b(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iB);
    }

    public final void H() {
        Y(this.n);
    }

    public final void I(jfe jfeVar, boolean z) {
        if (!z) {
            if (this.ao) {
                return;
            }
            this.am.remove(jfeVar);
            List list = this.an;
            if (list != null) {
                list.remove(jfeVar);
                return;
            }
            return;
        }
        if (!this.ao) {
            this.am.add(jfeVar);
            return;
        }
        List arrayList = this.an;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.an = arrayList;
        }
        arrayList.add(jfeVar);
    }

    public final void J() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    public final void K() {
        if (this.aA) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.az) {
            this.az = jCurrentAnimationTimeMillis;
            aa();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.ax;
            view.getLocationOnScreen(iArr);
            float f2 = iArr[0];
            float f3 = iArr[1];
            view.getLocationInWindow(iArr);
            float f4 = iArr[0];
            float f5 = iArr[1];
            this.aB = (Float.floatToRawIntBits(f2 - f4) << 32) | (Float.floatToRawIntBits(f3 - f5) & 4294967295L);
        }
    }

    public final void L() {
        this.as = true;
    }

    public final void M(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f2 = pointerCoords.x;
            long jH = h((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jH >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jH & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        ish ishVarA = this.aq.a(motionEventObtain, this);
        ishVarA.getClass();
        this.ar.a(ishVarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            r12 = this;
            int[] r0 = r12.ax
            r12.getLocationOnScreen(r0)
            long r1 = r12.aw
            int r3 = defpackage.kjb.a(r1)
            int r1 = defpackage.kjb.b(r1)
            r2 = 0
            r4 = r0[r2]
            r5 = 1
            if (r3 != r4) goto L21
            r6 = r0[r5]
            if (r1 != r6) goto L21
            long r6 = r12.az
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L43
        L21:
            r0 = r0[r5]
            long r6 = (long) r4
            long r8 = (long) r0
            r0 = 32
            long r6 = r6 << r0
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r6 = r6 | r8
            r12.aw = r6
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r0) goto L43
            if (r1 == r0) goto L43
            jcr r0 = r12.n
            jcw r0 = r0.w
            jdv r0 = r0.o
            r0.u()
            r0 = r5
            goto L44
        L43:
            r0 = r2
        L44:
            r12.K()
            jua r1 = r12.p
            long r3 = r12.aw
            long r6 = r12.aB
            long r6 = defpackage.kjc.c(r6)
            float[] r8 = r12.E
            int r9 = defpackage.jub.a(r8)
            r9 = r9 & 2
            if (r9 == 0) goto L5c
            r8 = 0
        L5c:
            jud r9 = r1.b
            long r10 = r9.c
            boolean r10 = defpackage.kjb.f(r6, r10)
            if (r10 != 0) goto L6a
            r9.c = r6
            r6 = r5
            goto L6b
        L6a:
            r6 = r2
        L6b:
            long r10 = r9.d
            boolean r7 = defpackage.kjb.f(r3, r10)
            if (r7 != 0) goto L76
            r9.d = r3
            r6 = r5
        L76:
            if (r8 == 0) goto L7a
        L78:
            r2 = r5
            goto L81
        L7a:
            if (r6 != 0) goto L78
            boolean r3 = r1.c
            if (r3 == 0) goto L81
            goto L78
        L81:
            r1.c = r2
            jdo r2 = r12.D
            r2.b(r0)
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.N():void");
    }

    public final boolean Q(ifq ifqVar, ihu ihuVar) {
        Integer numD;
        if (isFocused() || hasFocus()) {
            return true;
        }
        int iIntValue = 130;
        if (ifqVar != null && (numD = ifw.d(ifqVar.a)) != null) {
            iIntValue = numD.intValue();
        }
        return super.requestFocus(iIntValue, ihuVar != null ? ikh.a(ihuVar) : null);
    }

    public final void R(jfe jfeVar) {
        if (this.C != null) {
            Method method = joy.a;
        }
        jpa jpaVar = this.P;
        jpaVar.a();
        jpaVar.a.n(new WeakReference(jfeVar, jpaVar.b));
        this.am.remove(jfeVar);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        jsc jscVarY;
        jrn jrnVar;
        idh idhVar = this.x;
        if (idhVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValueM140m = akc$$ExternalSyntheticApiModelOutline0.m140m(sparseArray.get(iKeyAt));
                if (autofillValueM140m.isText()) {
                    jse jseVar = (jse) idhVar.a.b.a(iKeyAt);
                    if (jseVar != null && (jscVarY = jseVar.y()) != null && (jrnVar = (jrn) jsd.a(jscVarY, jsa.g)) != null) {
                    }
                } else if (autofillValueM140m.isDate()) {
                    Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                } else if (autofillValueM140m.isList()) {
                    Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                } else if (autofillValueM140m.isToggle()) {
                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                }
            }
        }
        ide ideVar = this.w;
        if (ideVar != null) {
            Map map = ideVar.b.a;
            if (map.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValueM140m2 = akc$$ExternalSyntheticApiModelOutline0.m140m(sparseArray.get(iKeyAt2));
                if (autofillValueM140m2.isText()) {
                    autofillValueM140m2.getTextValue().toString();
                    if (((ido) map.get(Integer.valueOf(iKeyAt2))) != null) {
                        throw null;
                    }
                } else {
                    if (autofillValueM140m2.isDate()) {
                        throw new fcth("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValueM140m2.isList()) {
                        throw new fcth("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValueM140m2.isToggle()) {
                        throw new fcth("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.r.B(false, i, this.ac);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.r.B(true, i, this.ac);
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        if (Build.VERSION.SDK_INT < 30) {
            this.B = jhc.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            Y(this.n);
        }
        q(true);
        hzf.c();
        this.ao = true;
        iic iicVar = this.al.a;
        Canvas canvas2 = iicVar.a;
        iicVar.a = canvas;
        View view = null;
        this.n.L(iicVar, null);
        iicVar.a = canvas2;
        List list = this.am;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((jfe) list.get(i)).j();
            }
        }
        if (joy.d) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        list.clear();
        this.ao = false;
        List list2 = this.an;
        if (list2 != null) {
            list.addAll(list2);
            list2.clear();
        }
        if (this.h) {
            jku.a(this, this.aM);
            View view2 = this.af;
            if (view2 == null) {
                fdbq.c("frameRateCategoryView");
                view2 = null;
            }
            jku.a(view2, this.aN);
            if (!Float.isNaN(this.aN)) {
                View view3 = this.af;
                if (view3 == null) {
                    fdbq.c("frameRateCategoryView");
                    view3 = null;
                }
                view3.invalidate();
                View view4 = this.af;
                if (view4 == null) {
                    fdbq.c("frameRateCategoryView");
                } else {
                    view = view4;
                }
                drawChild(canvas, view, getDrawingTime());
            }
            this.aM = Float.NaN;
            this.aN = Float.NaN;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [icr] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [icr] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [hum] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [hum] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v15, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v16, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v20, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v21, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [hum] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [hum] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [hum] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        iqf iqfVar;
        int size;
        jee jeeVar;
        jbi jbiVarA;
        jee jeeVar2;
        itu ituVar;
        int size2;
        jee jeeVar3;
        icr icrVarA;
        jee jeeVar4;
        int i = 0;
        if (this.R) {
            Runnable runnable = this.aO;
            removeCallbacks(runnable);
            if (motionEvent.getActionMasked() == 8) {
                this.R = false;
            } else {
                runnable.run();
            }
        }
        if (ah(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (U(motionEvent) & 1) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f2 = -motionEvent.getAxisValue(26);
            getContext();
            float scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor() * f2;
            getContext();
            itv itvVar = new itv(scaledVerticalScrollFactor, f2 * viewConfiguration.getScaledHorizontalScrollFactor(), motionEvent.getEventTime(), motionEvent.getDeviceId());
            ige igeVar = this.i;
            jhq jhqVar = new jhq(this, motionEvent);
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) igeVar;
            if (focusOwnerImpl.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            FocusTargetNode focusTargetNodeH = focusOwnerImpl.h();
            if (focusTargetNodeH != null) {
                if (!focusTargetNodeH.s.C) {
                    itw.d("visitAncestors called on an unattached node");
                }
                icr icrVar = focusTargetNodeH.s;
                jcr jcrVarD = jbg.d(focusTargetNodeH);
                loop0: while (true) {
                    if (jcrVarD == null) {
                        icrVarA = null;
                        break;
                    }
                    if ((jcrVarD.v.f.u & 16384) != 0) {
                        while (icrVar != null) {
                            if ((icrVar.t & 16384) != 0) {
                                icrVarA = icrVar;
                                hum humVar = null;
                                while (icrVarA != null) {
                                    if (icrVarA instanceof itu) {
                                        break loop0;
                                    }
                                    if ((icrVarA.t & 16384) != 0 && (icrVarA instanceof jbi)) {
                                        int i2 = 0;
                                        for (icr icrVar2 = ((jbi) icrVarA).E; icrVar2 != null; icrVar2 = icrVar2.w) {
                                            if ((icrVar2.t & 16384) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    icrVarA = icrVar2;
                                                } else {
                                                    if (humVar == null) {
                                                        humVar = new hum(new icr[16]);
                                                    }
                                                    if (icrVarA != null) {
                                                        humVar.n(icrVarA);
                                                    }
                                                    humVar.n(icrVar2);
                                                    icrVarA = null;
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    icrVarA = jbg.a(humVar);
                                }
                            }
                            icrVar = icrVar.v;
                        }
                    }
                    jcrVarD = jcrVarD.s();
                    icrVar = (jcrVarD == null || (jeeVar4 = jcrVarD.v) == null) ? null : jeeVar4.e;
                }
                ituVar = (itu) icrVarA;
            } else {
                ituVar = null;
            }
            if (ituVar != null) {
                if (!ituVar.s.C) {
                    itw.d("visitAncestors called on an unattached node");
                }
                icr icrVar3 = ituVar.s.v;
                jcr jcrVarD2 = jbg.d(ituVar);
                ArrayList arrayList = null;
                while (jcrVarD2 != null) {
                    if ((jcrVarD2.v.f.u & 16384) != 0) {
                        while (icrVar3 != null) {
                            if ((icrVar3.t & 16384) != 0) {
                                icr icrVarA2 = icrVar3;
                                hum humVar2 = null;
                                while (icrVarA2 != null) {
                                    if (icrVarA2 instanceof itu) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(icrVarA2);
                                    } else if ((icrVarA2.t & 16384) != 0 && (icrVarA2 instanceof jbi)) {
                                        int i3 = 0;
                                        for (icr icrVar4 = ((jbi) icrVarA2).E; icrVar4 != null; icrVar4 = icrVar4.w) {
                                            if ((icrVar4.t & 16384) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    icrVarA2 = icrVar4;
                                                } else {
                                                    if (humVar2 == null) {
                                                        humVar2 = new hum(new icr[16]);
                                                    }
                                                    if (icrVarA2 != null) {
                                                        humVar2.n(icrVarA2);
                                                    }
                                                    humVar2.n(icrVar4);
                                                    icrVarA2 = null;
                                                }
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    icrVarA2 = jbg.a(humVar2);
                                }
                            }
                            icrVar3 = icrVar3.v;
                        }
                    }
                    jcrVarD2 = jcrVarD2.s();
                    icrVar3 = (jcrVarD2 == null || (jeeVar3 = jcrVarD2.v) == null) ? null : jeeVar3.e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i4 = size2 - 1;
                        if (i4 < 0) {
                            break;
                        }
                        size2 = i4;
                    }
                }
                icr icrVarA3 = ituVar.s;
                hum humVar3 = null;
                while (icrVarA3 != null) {
                    if (icrVarA3 instanceof itu) {
                    } else if ((icrVarA3.t & 16384) != 0 && (icrVarA3 instanceof jbi)) {
                        int i5 = 0;
                        for (icr icrVar5 = ((jbi) icrVarA3).E; icrVar5 != null; icrVar5 = icrVar5.w) {
                            if ((icrVar5.t & 16384) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    icrVarA3 = icrVar5;
                                } else {
                                    if (humVar3 == null) {
                                        humVar3 = new hum(new icr[16]);
                                    }
                                    if (icrVarA3 != null) {
                                        humVar3.n(icrVarA3);
                                    }
                                    humVar3.n(icrVar5);
                                    icrVarA3 = null;
                                }
                            }
                        }
                        if (i5 != 1) {
                        }
                    }
                    icrVarA3 = jbg.a(humVar3);
                }
                if (((Boolean) jhqVar.invoke()).booleanValue()) {
                    return true;
                }
                icr icrVarA4 = ituVar.s;
                hum humVar4 = null;
                while (icrVarA4 != null) {
                    if (icrVarA4 instanceof itu) {
                        ((itu) icrVarA4).a(itvVar);
                    } else if ((icrVarA4.t & 16384) != 0 && (icrVarA4 instanceof jbi)) {
                        int i6 = 0;
                        for (icr icrVar6 = ((jbi) icrVarA4).E; icrVar6 != null; icrVar6 = icrVar6.w) {
                            if ((icrVar6.t & 16384) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    icrVarA4 = icrVar6;
                                } else {
                                    if (humVar4 == null) {
                                        humVar4 = new hum(new icr[16]);
                                    }
                                    if (icrVarA4 != null) {
                                        humVar4.n(icrVarA4);
                                    }
                                    humVar4.n(icrVar6);
                                    icrVarA4 = null;
                                }
                            }
                        }
                        if (i6 != 1) {
                        }
                    }
                    icrVarA4 = jbg.a(humVar4);
                }
                if (arrayList != null) {
                    int size3 = arrayList.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        ((itu) arrayList.get(i7)).a(itvVar);
                    }
                }
            }
            return false;
        }
        if (!motionEvent.isFromSource(2)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Float.floatToRawIntBits(x);
            Float.floatToRawIntBits(y);
            motionEvent.getEventTime();
            motionEvent.getActionMasked();
            ige igeVar2 = this.i;
            jhh jhhVar = new jhh(this, motionEvent);
            FocusOwnerImpl focusOwnerImpl2 = (FocusOwnerImpl) igeVar2;
            if (focusOwnerImpl2.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
            } else {
                FocusTargetNode focusTargetNodeH2 = focusOwnerImpl2.h();
                if (focusTargetNodeH2 != null) {
                    if (!focusTargetNodeH2.s.C) {
                        itw.d("visitAncestors called on an unattached node");
                    }
                    icr icrVar7 = focusTargetNodeH2.s;
                    jcr jcrVarD3 = jbg.d(focusTargetNodeH2);
                    loop14: while (true) {
                        if (jcrVarD3 == null) {
                            jbiVarA = 0;
                            break;
                        }
                        if ((jcrVarD3.v.f.u & 2097152) != 0) {
                            while (icrVar7 != null) {
                                if ((icrVar7.t & 2097152) != 0) {
                                    ?? humVar5 = 0;
                                    jbiVarA = icrVar7;
                                    while (jbiVarA != 0) {
                                        if (jbiVarA instanceof iqf) {
                                            break loop14;
                                        }
                                        if ((jbiVarA.t & 2097152) != 0 && (jbiVarA instanceof jbi)) {
                                            icr icrVar8 = jbiVarA.E;
                                            int i8 = 0;
                                            jbiVarA = jbiVarA;
                                            humVar5 = humVar5;
                                            while (icrVar8 != null) {
                                                if ((icrVar8.t & 2097152) != 0) {
                                                    i8++;
                                                    humVar5 = humVar5;
                                                    if (i8 == 1) {
                                                        jbiVarA = icrVar8;
                                                    } else {
                                                        if (humVar5 == 0) {
                                                            humVar5 = new hum(new icr[16]);
                                                        }
                                                        if (jbiVarA != 0) {
                                                            humVar5.n(jbiVarA);
                                                        }
                                                        humVar5.n(icrVar8);
                                                        jbiVarA = 0;
                                                    }
                                                }
                                                icrVar8 = icrVar8.w;
                                                jbiVarA = jbiVarA;
                                                humVar5 = humVar5;
                                            }
                                            if (i8 != 1) {
                                            }
                                        }
                                        jbiVarA = jbg.a(humVar5);
                                    }
                                }
                                icrVar7 = icrVar7.v;
                            }
                        }
                        jcrVarD3 = jcrVarD3.s();
                        icrVar7 = (jcrVarD3 == null || (jeeVar2 = jcrVarD3.v) == null) ? null : jeeVar2.e;
                    }
                    iqfVar = (iqf) jbiVarA;
                } else {
                    iqfVar = null;
                }
                if (iqfVar != null) {
                    if (!iqfVar.D().C) {
                        itw.d("visitAncestors called on an unattached node");
                    }
                    icr icrVar9 = iqfVar.D().v;
                    jcr jcrVarD4 = jbg.d(iqfVar);
                    ArrayList arrayList2 = null;
                    while (jcrVarD4 != null) {
                        if ((jcrVarD4.v.f.u & 2097152) != 0) {
                            while (icrVar9 != null) {
                                if ((icrVar9.t & 2097152) != 0) {
                                    icr icrVarA5 = icrVar9;
                                    hum humVar6 = null;
                                    while (icrVarA5 != null) {
                                        if (icrVarA5 instanceof iqf) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(icrVarA5);
                                        } else {
                                            if ((icrVarA5.t & 2097152) != 0 && (icrVarA5 instanceof jbi)) {
                                                int i9 = i;
                                                for (icr icrVar10 = ((jbi) icrVarA5).E; icrVar10 != null; icrVar10 = icrVar10.w) {
                                                    if ((icrVar10.t & 2097152) != 0) {
                                                        i9++;
                                                        if (i9 == 1) {
                                                            icrVarA5 = icrVar10;
                                                        } else {
                                                            if (humVar6 == null) {
                                                                humVar6 = new hum(new icr[16]);
                                                            }
                                                            if (icrVarA5 != null) {
                                                                humVar6.n(icrVarA5);
                                                            }
                                                            humVar6.n(icrVar10);
                                                            icrVarA5 = null;
                                                        }
                                                    }
                                                }
                                                if (i9 != 1) {
                                                }
                                            }
                                            i = 0;
                                        }
                                        icrVarA5 = jbg.a(humVar6);
                                        i = 0;
                                    }
                                }
                                icrVar9 = icrVar9.v;
                                i = 0;
                            }
                        }
                        jcrVarD4 = jcrVarD4.s();
                        icrVar9 = (jcrVarD4 == null || (jeeVar = jcrVarD4.v) == null) ? null : jeeVar.e;
                        i = 0;
                    }
                    if (arrayList2 != null && arrayList2.size() - 1 >= 0) {
                        while (true) {
                            int i10 = size - 1;
                            if (((iqf) arrayList2.get(size)).b()) {
                                break;
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size = i10;
                        }
                    }
                    jbi jbiVarD = iqfVar.D();
                    ?? humVar7 = 0;
                    while (true) {
                        if (jbiVarD != 0) {
                            if (jbiVarD instanceof iqf) {
                                if (((iqf) jbiVarD).b()) {
                                    break;
                                }
                            } else if ((jbiVarD.t & 2097152) != 0 && (jbiVarD instanceof jbi)) {
                                icr icrVar11 = jbiVarD.E;
                                int i11 = 0;
                                jbiVarD = jbiVarD;
                                humVar7 = humVar7;
                                while (icrVar11 != null) {
                                    if ((icrVar11.t & 2097152) != 0) {
                                        i11++;
                                        humVar7 = humVar7;
                                        if (i11 == 1) {
                                            jbiVarD = icrVar11;
                                        } else {
                                            if (humVar7 == 0) {
                                                humVar7 = new hum(new icr[16]);
                                            }
                                            if (jbiVarD != 0) {
                                                humVar7.n(jbiVarD);
                                            }
                                            humVar7.n(icrVar11);
                                            jbiVarD = 0;
                                        }
                                    }
                                    icrVar11 = icrVar11.w;
                                    jbiVarD = jbiVarD;
                                    humVar7 = humVar7;
                                }
                                if (i11 != 1) {
                                }
                            }
                            jbiVarD = jbg.a(humVar7);
                        } else if (!((Boolean) jhhVar.invoke()).booleanValue()) {
                            jbi jbiVarD2 = iqfVar.D();
                            ?? humVar8 = 0;
                            while (true) {
                                if (jbiVarD2 != 0) {
                                    if (jbiVarD2 instanceof iqf) {
                                        if (((iqf) jbiVarD2).a()) {
                                            break;
                                        }
                                    } else if ((jbiVarD2.t & 2097152) != 0 && (jbiVarD2 instanceof jbi)) {
                                        icr icrVar12 = jbiVarD2.E;
                                        int i12 = 0;
                                        jbiVarD2 = jbiVarD2;
                                        humVar8 = humVar8;
                                        while (icrVar12 != null) {
                                            if ((icrVar12.t & 2097152) != 0) {
                                                i12++;
                                                humVar8 = humVar8;
                                                if (i12 == 1) {
                                                    jbiVarD2 = icrVar12;
                                                } else {
                                                    if (humVar8 == 0) {
                                                        humVar8 = new hum(new icr[16]);
                                                    }
                                                    if (jbiVarD2 != 0) {
                                                        humVar8.n(jbiVarD2);
                                                    }
                                                    humVar8.n(icrVar12);
                                                    jbiVarD2 = 0;
                                                }
                                            }
                                            icrVar12 = icrVar12.w;
                                            jbiVarD2 = jbiVarD2;
                                            humVar8 = humVar8;
                                        }
                                        if (i12 != 1) {
                                        }
                                    }
                                    jbiVarD2 = jbg.a(humVar8);
                                } else if (arrayList2 != null) {
                                    int size4 = arrayList2.size();
                                    for (int i13 = 0; i13 < size4; i13++) {
                                        if (!((iqf) arrayList2.get(i13)).a()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (this.R) {
            Runnable runnable = this.aO;
            removeCallbacks(runnable);
            runnable.run();
        }
        if (!ah(motionEvent) && isAttachedToWindow()) {
            jir jirVar = this.r;
            if (jirVar.F()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    AndroidComposeView androidComposeView = jirVar.b;
                    androidComposeView.q(true);
                    jbu jbuVar = new jbu();
                    androidComposeView.n.at((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), jbuVar, true);
                    for (int iE = fcva.e(jbuVar); iE >= 0; iE--) {
                        jcr jcrVarD = jbg.d(jbuVar.get(iE));
                        if (((kkt) androidComposeView.F().b.get(jcrVarD)) != null) {
                            break;
                        }
                        if (jcrVarD.v.j(8)) {
                            int iM = jirVar.m(jcrVarD.c);
                            jsl jslVarB = jsm.b(jcrVarD, false);
                            if (jsp.b(jslVarB) && !jslVarB.f().f(jte.z)) {
                                i = iM;
                                break;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    androidComposeView.F().dispatchGenericMotionEvent(motionEvent);
                    jirVar.A(i);
                } else if (action == 10) {
                    if (jirVar.c != Integer.MIN_VALUE) {
                        jirVar.A(Integer.MIN_VALUE);
                    } else {
                        jirVar.b.F().dispatchGenericMotionEvent(motionEvent);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && ad(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.N;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.N = MotionEvent.obtainNoHistory(motionEvent);
                    this.R = true;
                    postDelayed(this.aO, 8L);
                    return false;
                }
            } else if (!ae(motionEvent)) {
                return false;
            }
            if ((U(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return this.i.f(keyEvent, new jhi(this, keyEvent));
        }
        jno.e(keyEvent.getMetaState());
        return this.i.f(keyEvent, igd.a) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v11, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v12, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v13, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [icr] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [icr] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [icr] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [hum] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [hum] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEventPreIme(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            jiw.a.a(viewStructure, this);
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.R) {
            Runnable runnable = this.aO;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.N;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || ag(motionEvent, motionEvent2)) {
                runnable.run();
            } else {
                this.R = false;
            }
        }
        if (ah(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !ae(motionEvent))) {
            return false;
        }
        int iU = U(motionEvent);
        if ((iU & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iU & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return V(i, this);
            }
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        ihu ihuVarB;
        if (view == null || this.D.c) {
            return super.focusSearch(view, i);
        }
        jmr jmrVar = jmu.a;
        View viewA = jms.a().a(this, view, i);
        if (view != this || (ihuVarB = this.i.c()) == null) {
            ihuVarB = ifw.b(view, this);
        }
        ifq ifqVarA = ifw.a(i);
        int i2 = ifqVarA != null ? ifqVarA.a : 6;
        fdci fdciVar = new fdci();
        if (this.i.d(i2, ihuVarB, new jhp(fdciVar)) != null) {
            Object obj = fdciVar.a;
            if (obj != null) {
                if (viewA != null) {
                    if (igk.a(i2)) {
                        return super.focusSearch(view, i);
                    }
                    if (!ihl.c(ihf.c((FocusTargetNode) obj), ifw.b(viewA, this), ihuVarB, i2)) {
                    }
                }
                return this;
            }
            if (viewA != null) {
            }
            return viewA;
        }
        return view;
    }

    @Override // defpackage.iro
    public final void g(float[] fArr) {
        K();
        iju.e(fArr, this.E);
        jjd.b(fArr, Float.intBitsToFloat((int) (this.aB >> 32)), Float.intBitsToFloat((int) (this.aB & 4294967295L)), this.ay);
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        ihu ihuVarD = D();
        if (ihuVarD == null) {
            super.getFocusedRect(rect);
            return;
        }
        rect.left = Math.round(ihuVarD.b);
        rect.top = Math.round(ihuVarD.c);
        rect.right = Math.round(ihuVarD.d);
        rect.bottom = Math.round(ihuVarD.e);
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.itb
    public final long h(long j) {
        K();
        long jA = iju.a(this.E, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32)) + Float.intBitsToFloat((int) (this.aB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L)) + Float.intBitsToFloat((int) (this.aB & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // defpackage.itb
    public final long i(long j) {
        K();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.aB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.aB & 4294967295L));
        return iju.a(this.F, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // defpackage.jfh
    public final jfr j() {
        return this.A;
    }

    @Override // defpackage.jfh
    public final kbi k() {
        return (kbi) this.aI.a();
    }

    @Override // defpackage.jfh
    public final kio l() {
        return (kio) this.ae.a();
    }

    @Override // defpackage.jfh
    public final kji m() {
        return (kji) this.aK.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.jfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.fdat r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jic
            if (r0 == 0) goto L13
            r0 = r6
            jic r0 = (defpackage.jic) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jic r0 = new jic
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            defpackage.fctl.b(r6)
            goto L42
        L2f:
            defpackage.fctl.b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.aH
            jid r2 = new jid
            r2.<init>(r4)
            r0.c = r3
            java.lang.Object r5 = defpackage.ida.b(r6, r2, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            fcta r5 = new fcta
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.n(fdat, fcxy):java.lang.Object");
    }

    @Override // defpackage.jfh
    public final void o(jcr jcrVar, boolean z) {
        this.D.e(jcrVar, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        lvc lvcVarP;
        lvj lvjVar;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 30) {
            this.B = jhc.a();
        }
        if (Build.VERSION.SDK_INT > 28) {
            if (e == null) {
                Runnable runnable = new Runnable() { // from class: jhb
                    @Override // java.lang.Runnable
                    public final void run() {
                        cuu cuuVar = AndroidComposeView.d;
                        synchronized (cuuVar) {
                            int i = 0;
                            if (Build.VERSION.SDK_INT < 30) {
                                Object[] objArr = cuuVar.b;
                                int i2 = cuuVar.c;
                                while (i < i2) {
                                    AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i];
                                    boolean zA = androidComposeView.A();
                                    androidComposeView.B = jhc.a();
                                    if (zA != androidComposeView.A()) {
                                        androidComposeView.H();
                                    }
                                    i++;
                                }
                            } else {
                                Object[] objArr2 = cuuVar.b;
                                int i3 = cuuVar.c;
                                while (i < i3) {
                                    ((AndroidComposeView) objArr2[i]).H();
                                    i++;
                                }
                            }
                        }
                    }
                };
                e = runnable;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (a == null) {
                        a = Class.forName("android.os.SystemProperties");
                    }
                    if (c == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = a;
                        c = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = c;
                    if (method != null) {
                        method.invoke(null, runnable);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            cuu cuuVar = d;
            synchronized (cuuVar) {
                cuuVar.h(this);
            }
        }
        jno jnoVar = this.l;
        jnoVar.c(hasWindowFocus());
        jnoVar.b(new jhu(this));
        ac();
        jcr jcrVar = this.n;
        Z(jcrVar);
        Y(jcrVar);
        this.A.a.d();
        ide ideVar = this.w;
        if (ideVar != null) {
            ideVar.c.registerCallback(idm.a);
        }
        lvj lvjVarA = lxr.a(this);
        pjb pjbVarA = pje.a(this);
        jhd jhdVarE = E();
        if (jhdVarE == null || (lvjVarA != null && pjbVarA != null && (lvjVarA != (lvjVar = jhdVarE.a) || pjbVarA != lvjVar))) {
            if (lvjVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (pjbVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (jhdVarE != null && (lvcVarP = jhdVarE.a.P()) != null) {
                lvcVarP.d(this);
            }
            lvjVarA.P().c(this);
            jhd jhdVar = new jhd(lvjVarA, pjbVarA);
            this.H.b(jhdVar);
            fdap fdapVar = this.I;
            if (fdapVar != null) {
                fdapVar.invoke(jhdVar);
            }
            this.I = null;
        }
        this.L.a(true != isInTouchMode() ? 2 : 1);
        jhd jhdVarE2 = E();
        lvc lvcVarP2 = jhdVarE2 != null ? jhdVarE2.a.P() : null;
        if (lvcVarP2 == null) {
            itw.b("No lifecycle owner exists");
            throw new fcta();
        }
        lvcVarP2.c(this);
        lvcVarP2.c(this.s);
        getViewTreeObserver().addOnGlobalLayoutListener(this.aD);
        getViewTreeObserver().addOnScrollChangedListener(this.aE);
        getViewTreeObserver().addOnTouchModeChangeListener(this.aF);
        if (Build.VERSION.SDK_INT >= 31) {
            jja.a.b(this);
        }
        idh idhVar = this.x;
        if (idhVar != null) {
            ((FocusOwnerImpl) this.i).g.h(idhVar);
            this.q.c.h(idhVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        jkb jkbVar = (jkb) ida.a(this.aH);
        if (jkbVar == null) {
            return this.aG.b;
        }
        jnh jnhVar = (jnh) ida.a(jkbVar.d);
        return (jnhVar == null || jnhVar.e) ? false : true;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ae.b(kii.a(getContext()));
        ac();
        if (af(configuration) != this.aJ) {
            this.aJ = af(configuration);
            this.aI.b(kbp.a(getContext()));
        }
        this.v.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i2;
        jkb jkbVar = (jkb) ida.a(this.aH);
        int i3 = 0;
        if (jkbVar == null) {
            kfh kfhVar = this.aG;
            if (!kfhVar.b) {
                return null;
            }
            kdy kdyVar = kfhVar.f;
            kew kewVar = kfhVar.e;
            int i4 = kdyVar.f;
            if (kdw.b(i4, 1)) {
                if (kdyVar.b) {
                    i3 = 6;
                }
            } else if (kdw.b(i4, 0)) {
                i3 = 1;
            } else if (kdw.b(i4, 2)) {
                i3 = 2;
            } else if (kdw.b(i4, 6)) {
                i3 = 5;
            } else if (kdw.b(i4, 5)) {
                i3 = 7;
            } else if (kdw.b(i4, 3)) {
                i3 = 3;
            } else if (kdw.b(i4, 4)) {
                i3 = 4;
            } else {
                if (!kdw.b(i4, 7)) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i3 = 6;
            }
            editorInfo.imeOptions = i3;
            int i5 = kdyVar.e;
            if (ked.b(i5, 1)) {
                editorInfo.inputType = 1;
            } else if (ked.b(i5, 2)) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            } else if (ked.b(i5, 3)) {
                editorInfo.inputType = 2;
            } else if (ked.b(i5, 4)) {
                editorInfo.inputType = 3;
            } else if (ked.b(i5, 5)) {
                editorInfo.inputType = 17;
            } else if (ked.b(i5, 6)) {
                editorInfo.inputType = 33;
            } else if (ked.b(i5, 7)) {
                editorInfo.inputType = 129;
            } else if (ked.b(i5, 8)) {
                editorInfo.inputType = 18;
            } else {
                if (!ked.b(i5, 9)) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                editorInfo.inputType = 8194;
            }
            if (!kdyVar.b && kfk.a(editorInfo.inputType)) {
                editorInfo.inputType |= 131072;
                if (kdw.b(i4, 1)) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            if (kfk.a(editorInfo.inputType)) {
                int i6 = kdyVar.c;
                if (kec.b(i6, 1)) {
                    editorInfo.inputType |= 4096;
                } else if (kec.b(i6, 2)) {
                    editorInfo.inputType |= 8192;
                } else if (kec.b(i6, 3)) {
                    editorInfo.inputType |= 16384;
                }
                if (kdyVar.d) {
                    editorInfo.inputType |= 32768;
                }
            }
            long j = kewVar.c;
            editorInfo.initialSelStart = jyo.e(j);
            editorInfo.initialSelEnd = jyo.a(j);
            lhu.a(editorInfo, kewVar.a());
            editorInfo.imeOptions |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            if (lpz.h()) {
                lpz.c().g(editorInfo);
            }
            keq keqVar = new keq(kfhVar.e, new kfc(kfhVar), kfhVar.f.d);
            kfhVar.g.add(new WeakReference(keqVar));
            return keqVar;
        }
        jnh jnhVar = (jnh) ida.a(jkbVar.d);
        if (jnhVar == null) {
            return null;
        }
        synchronized (jnhVar.c) {
            if (jnhVar.e) {
                return null;
            }
            jnv jnvVar = jnhVar.a;
            String strA = ((fgf) jnvVar).g.a();
            long j2 = ((fgf) jnvVar).g.c;
            kdy kdyVar2 = ((fgf) jnvVar).h;
            int i7 = kdyVar2.f;
            if (kdw.b(i7, 1)) {
                i = kdyVar2.b ? 6 : 0;
            } else if (kdw.b(i7, 0)) {
                i = 1;
            } else if (kdw.b(i7, 2)) {
                i = 2;
            } else if (kdw.b(i7, 6)) {
                i = 5;
            } else if (kdw.b(i7, 5)) {
                i = 7;
            } else if (kdw.b(i7, 3)) {
                i = 3;
            } else if (kdw.b(i7, 4)) {
                i = 4;
            } else if (!kdw.b(i7, 7)) {
                throw new IllegalStateException("invalid ImeAction");
            }
            editorInfo.imeOptions = i;
            kfu kfuVar = kdyVar2.g;
            if (fdbq.f(kfuVar, kfu.a)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(fcva.p(kfuVar, 10));
                Iterator<E> it = kfuVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kfs) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
            int i8 = kdyVar2.e;
            if (ked.b(i8, 1)) {
                i2 = 1;
            } else if (ked.b(i8, 2)) {
                editorInfo.imeOptions |= Integer.MIN_VALUE;
                i2 = 1;
            } else if (ked.b(i8, 3)) {
                i2 = 2;
            } else if (ked.b(i8, 4)) {
                i2 = 3;
            } else if (ked.b(i8, 5)) {
                i2 = 17;
            } else if (ked.b(i8, 6)) {
                i2 = 33;
            } else if (ked.b(i8, 7)) {
                i2 = 129;
            } else if (ked.b(i8, 8)) {
                i2 = 18;
            } else {
                if (!ked.b(i8, 9)) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i2 = 8194;
            }
            editorInfo.inputType = i2;
            if (!kdyVar2.b && ffm.a(editorInfo.inputType)) {
                editorInfo.inputType |= 131072;
                if (kdw.b(i7, 1)) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            if (ffm.a(editorInfo.inputType)) {
                int i9 = kdyVar2.c;
                if (kec.b(i9, 1)) {
                    editorInfo.inputType |= 4096;
                } else if (kec.b(i9, 2)) {
                    editorInfo.inputType |= 8192;
                } else if (kec.b(i9, 3)) {
                    editorInfo.inputType |= 16384;
                }
                if (kdyVar2.d) {
                    editorInfo.inputType |= 32768;
                }
            }
            editorInfo.initialSelStart = jyo.e(j2);
            editorInfo.initialSelEnd = jyo.a(j2);
            lhu.a(editorInfo, strA);
            editorInfo.imeOptions |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            if (!fek.a || ked.b(i8, 7) || ked.b(i8, 8)) {
                lhu.b(editorInfo, false);
            } else {
                lhu.b(editorInfo, true);
                editorInfo.setSupportedHandwritingGestures(fcva.g(aao$$ExternalSyntheticApiModelOutline0.m$4(), aao$$ExternalSyntheticApiModelOutline0.m10m$1(), aao$$ExternalSyntheticApiModelOutline0.m$2(), aao$$ExternalSyntheticApiModelOutline0.m$3(), aao$$ExternalSyntheticApiModelOutline0.m$5(), aao$$ExternalSyntheticApiModelOutline0.m4m(), aao$$ExternalSyntheticApiModelOutline0.m$6()));
                editorInfo.setSupportedHandwritingGesturePreviews(fcwm.d(aao$$ExternalSyntheticApiModelOutline0.m$4(), aao$$ExternalSyntheticApiModelOutline0.m10m$1(), aao$$ExternalSyntheticApiModelOutline0.m$2(), aao$$ExternalSyntheticApiModelOutline0.m$3()));
            }
            if (lpz.h()) {
                lpz.c().g(editorInfo);
            }
            fgh fghVar = new fgh(((fgf) jnvVar).g, new fge((fgf) jnvVar), ((fgf) jnvVar).h.d, ((fgf) jnvVar).d, ((fgf) jnvVar).e, ((fgf) jnvVar).f);
            ((fgf) jnvVar).i.add(new WeakReference(fghVar));
            jng jngVar = new jng(jnhVar);
            InputConnection keiVar = Build.VERSION.SDK_INT >= 34 ? new kei(fghVar, jngVar) : new keh(fghVar, jngVar);
            jnhVar.d.n(new jgj(keiVar));
            return keiVar;
        }
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        jsl jslVar;
        for (long j : jArr) {
            ied iedVar = this.s;
            jsn jsnVar = (jsn) iedVar.g().a((int) j);
            if (jsnVar != null && (jslVar = jsnVar.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(iedVar.a.getAutofillId(), jslVar.e);
                List list = (List) jsd.a(jslVar.c, jte.A);
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new juo(kjw.d(list, "\n", null, 62))));
                    consumer.z(builder.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.h) {
            View view = this.af;
            if (view == null) {
                fdbq.c("frameRateCategoryView");
                view = null;
            }
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            cuu cuuVar = d;
            synchronized (cuuVar) {
                cuuVar.g(this);
            }
        }
        iao iaoVar = this.A.a;
        iaoVar.e();
        iaoVar.a();
        this.l.b(null);
        jhd jhdVarE = E();
        lvc lvcVarP = jhdVarE != null ? jhdVarE.a.P() : null;
        if (lvcVarP == null) {
            itw.b("No lifecycle owner exists");
            throw new fcta();
        }
        lvcVarP.d(this.s);
        lvcVarP.d(this);
        ide ideVar = this.w;
        if (ideVar != null) {
            ideVar.c.unregisterCallback(idm.a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.aD);
        getViewTreeObserver().removeOnScrollChangedListener(this.aE);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.aF);
        if (Build.VERSION.SDK_INT >= 31) {
            jja.a.a(this);
        }
        idh idhVar = this.x;
        if (idhVar != null) {
            this.q.c.g(idhVar);
            ((FocusOwnerImpl) this.i).g.g(idhVar);
        }
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        ihe.b(((FocusOwnerImpl) this.i).c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.az = 0L;
        this.D.i(this.aP);
        this.au = null;
        N();
        if (this.at != null) {
            F().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                Z(this.n);
            }
            long jAj = aj(i);
            long jAj2 = aj(i2);
            long jA = kik.a((int) (jAj >>> 32), (int) (jAj & 4294967295L), (int) (jAj2 >>> 32), (int) (4294967295L & jAj2));
            kil kilVar = this.au;
            if (kilVar == null) {
                this.au = new kil(jA);
                this.av = false;
            } else if (!kil.g(kilVar.a, jA)) {
                this.av = true;
            }
            jdo jdoVar = this.D;
            kil kilVar2 = jdoVar.h;
            if (kilVar2 == null || !kil.g(kilVar2.a, jA)) {
                if (jdoVar.c) {
                    itw.c("updateRootConstraints called while measuring");
                }
                jdoVar.h = new kil(jA);
                jcr jcrVar = jdoVar.a;
                if (jcrVar.j != null) {
                    jcrVar.U();
                }
                jcrVar.V();
                jdoVar.b.a(jcrVar, jcrVar.j != null);
            }
            jbm jbmVar = jdoVar.b;
            if (jbmVar.b()) {
                jcr jcrVar2 = jdoVar.a;
                if (!jcrVar2.d()) {
                    itw.c("performMeasureAndLayout called with unattached root");
                }
                if (!jcrVar2.f()) {
                    itw.c("performMeasureAndLayout called with unplaced root");
                }
                if (jdoVar.c) {
                    itw.c("performMeasureAndLayout called during measure layout");
                }
                if (jdoVar.h != null) {
                    jdoVar.c = true;
                    jdoVar.d = false;
                    try {
                        if (!jbmVar.a.d()) {
                            if (jcrVar2.j != null) {
                                jdoVar.g(jcrVar2, true);
                            } else {
                                jdoVar.f(jcrVar2);
                            }
                        }
                        jdoVar.g(jcrVar2, false);
                        jdoVar.c = false;
                        jdoVar.d = false;
                        jcy jcyVar = jdoVar.i;
                    } finally {
                    }
                }
            }
            jcr jcrVar3 = this.n;
            setMeasuredDimension(jcrVar3.o(), jcrVar3.m());
            if (this.at != null) {
                F().measure(View.MeasureSpec.makeMeasureSpec(jcrVar3.o(), 1073741824), View.MeasureSpec.makeMeasureSpec(jcrVar3.m(), 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            r11 = this;
            if (r12 == 0) goto Lf0
            idh r13 = r11.x
            r0 = 1
            if (r13 == 0) goto L99
            jso r1 = r13.a
            android.view.autofill.AutofillId r2 = r13.f
            java.lang.String r3 = r13.d
            jua r4 = r13.c
            jcr r1 = r1.a
            defpackage.idw.a(r12, r1, r2, r3, r4)
            cuu r1 = defpackage.cvi.a(r1, r12)
        L18:
            boolean r2 = r1.p()
            if (r2 == 0) goto L99
            int r2 = r1.c
            int r2 = r2 + (-1)
            java.lang.Object r2 = r1.a(r2)
            r2.getClass()
            android.view.ViewStructure r2 = (android.view.ViewStructure) r2
            int r5 = r1.c
            int r5 = r5 + (-1)
            java.lang.Object r5 = r1.a(r5)
            r5.getClass()
            jse r5 = (defpackage.jse) r5
            java.util.List r5 = r5.F()
            int r6 = r5.size()
            r7 = 0
        L41:
            if (r7 >= r6) goto L18
            java.lang.Object r8 = r5.get(r7)
            jse r8 = (defpackage.jse) r8
            boolean r9 = r8.e()
            if (r9 != 0) goto L96
            boolean r9 = r8.d()
            if (r9 == 0) goto L96
            boolean r9 = r8.f()
            if (r9 != 0) goto L5c
            goto L96
        L5c:
            jsc r9 = r8.y()
            if (r9 == 0) goto L90
            cuz r9 = r9.a
            jtn r10 = defpackage.jsa.g
            boolean r10 = r9.g(r10)
            if (r10 != 0) goto L7c
            jtn r10 = defpackage.jte.q
            boolean r10 = r9.g(r10)
            if (r10 != 0) goto L7c
            jtn r10 = defpackage.jte.r
            boolean r9 = r9.g(r10)
            if (r9 == 0) goto L90
        L7c:
            int r9 = r2.addChildCount(r0)
            android.view.ViewStructure r9 = r2.newChild(r9)
            android.view.autofill.AutofillId r10 = r13.f
            defpackage.idw.a(r9, r8, r10, r3, r4)
            r1.h(r8)
            r1.h(r9)
            goto L96
        L90:
            r1.h(r8)
            r1.h(r2)
        L96:
            int r7 = r7 + 1
            goto L41
        L99:
            ide r13 = r11.w
            if (r13 == 0) goto Lf0
            idp r1 = r13.b
            java.util.Map r1 = r1.a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto La8
            goto Lf0
        La8:
            int r2 = r1.size()
            int r2 = r12.addChildCount(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto Lbf
            goto Lf0
        Lbf:
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r1 = r1.getValue()
            ido r1 = (defpackage.ido) r1
            android.view.ViewStructure r12 = r12.newChild(r2)
            android.view.autofill.AutofillId r1 = r13.d
            defpackage.akc$$ExternalSyntheticApiModelOutline0.m(r12, r1, r3)
            android.view.View r13 = r13.a
            android.content.Context r13 = r13.getContext()
            java.lang.String r13 = r13.getPackageName()
            defpackage.idl.b(r12, r3, r13)
            defpackage.akc$$ExternalSyntheticApiModelOutline0.m(r12, r0)
            r12 = 0
            throw r12
        Lf0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        isa isaVar;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (isaVar = this.aa.b) == null) ? super.onResolvePointerIcon(motionEvent, i) : jjb.b(getContext(), isaVar);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.ad) {
            kji kjiVarC = ifw.c(i);
            if (kjiVarC == null) {
                kjiVarC = kji.a;
            }
            this.aK.b(kjiVarC);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        jrk jrkVar;
        if (Build.VERSION.SDK_INT >= 31 && (jrkVar = this.S) != null) {
            jso jsoVar = this.q;
            fcyh fcyhVar = this.j;
            hum humVar = new hum(new jrl[16]);
            jrm.b(jsoVar.a(), 0, new jrh(humVar));
            humVar.j(new fcxm(new fdap[]{jri.a, jrj.a}));
            int i = humVar.b;
            jrl jrlVar = (jrl) (i == 0 ? null : humVar.a[i - 1]);
            if (jrlVar != null) {
                fdjx fdjxVarB = fdjy.b(fcyhVar);
                jsl jslVar = jrlVar.a;
                kjd kjdVar = jrlVar.c;
                jrb jrbVar = new jrb(jslVar, kjdVar, fdjxVarB, jrkVar, this);
                ihu ihuVarE = ivz.e(jrlVar.d);
                long jD = kjdVar.d();
                ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(this, ikh.b(kje.b(ihuVarE)), new Point(kjb.a(jD), kjb.b(jD)), jrbVar);
                scrollCaptureTarget.setScrollBounds(ikh.b(kjdVar));
                consumer.z(scrollCaptureTarget);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(final LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        final ied iedVar = this.s;
        if (fdbq.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            idz.a(iedVar, longSparseArray);
        } else {
            iedVar.a.post(new Runnable() { // from class: idy
                @Override // java.lang.Runnable
                public final void run() {
                    idz.a(iedVar, longSparseArray);
                }
            });
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zA;
        this.l.c(z);
        this.aR = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || A() == (zA = jhc.a())) {
            return;
        }
        this.B = zA;
        H();
    }

    @Override // defpackage.jfh
    public final void p() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.T == 0) {
                jiy.a.a(this, true);
            }
            this.T++;
        }
    }

    @Override // defpackage.jfh
    public final void q(boolean z) {
        fdae fdaeVar;
        jdo jdoVar = this.D;
        if (jdoVar.h() || jdoVar.e.a.b != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    fdaeVar = this.aP;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                fdaeVar = null;
            }
            if (jdoVar.i(fdaeVar)) {
                requestLayout();
            }
            jdoVar.b(false);
            X();
            Trace.endSection();
        }
    }

    @Override // defpackage.jfh
    public final void r(jcr jcrVar, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            jdo jdoVar = this.D;
            if (!jcrVar.B) {
                jcr jcrVar2 = jdoVar.a;
                if (fdbq.f(jcrVar, jcrVar2)) {
                    itw.c("measureAndLayout called on root");
                }
                if (!jcrVar2.d()) {
                    itw.c("performMeasureAndLayout called with unattached root");
                }
                if (!jcrVar2.f()) {
                    itw.c("performMeasureAndLayout called with unplaced root");
                }
                if (jdoVar.c) {
                    itw.c("performMeasureAndLayout called during measure layout");
                }
                if (jdoVar.h != null) {
                    jdoVar.c = true;
                    jdoVar.d = false;
                    try {
                        jdoVar.b.d(jcrVar);
                        if ((jdo.l(jcrVar, new kil(j)) || jcrVar.al()) && fdbq.f(jcrVar.A(), true)) {
                            jcrVar.S();
                        }
                        jdoVar.d(jcrVar);
                        jdo.m(jcrVar, new kil(j));
                        if (jcrVar.ak() && jcrVar.f()) {
                            jcrVar.aa();
                            jdoVar.e.b(jcrVar);
                        }
                        jdoVar.c();
                        jdoVar.c = false;
                        jdoVar.d = false;
                        jcy jcyVar = jdoVar.i;
                    } finally {
                    }
                }
                jdoVar.a();
            }
            jdo jdoVar2 = this.D;
            if (!jdoVar2.h()) {
                jdoVar2.b(false);
                X();
            }
            this.p.a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        ige igeVar = this.i;
        if (((FocusOwnerImpl) igeVar).c.f().a()) {
            return super.requestFocus(i, rect);
        }
        ifq ifqVarA = ifw.a(i);
        int i2 = ifqVarA != null ? ifqVarA.a : 7;
        return fdbq.f(igeVar.d(i2, rect != null ? ikh.d(rect) : null, new jhw(i2)), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:20:0x0059, B:22:0x0073, B:25:0x008b, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00b9, B:40:0x00d3, B:42:0x00db, B:44:0x00eb, B:37:0x00c4, B:50:0x010e, B:52:0x0122, B:54:0x0128, B:58:0x0137, B:56:0x012d, B:59:0x013f), top: B:94:0x0059 }] */
    @Override // defpackage.jfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.s():void");
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.jfh
    public final void t(jcr jcrVar) {
        jir jirVar = this.r;
        jirVar.t = true;
        if (jirVar.D()) {
            jirVar.u(jcrVar);
        }
        ied iedVar = this.s;
        iedVar.b = true;
        if (iedVar.n()) {
            iedVar.j();
        }
    }

    @Override // defpackage.jfh
    public final void u(jcr jcrVar, boolean z, boolean z2, boolean z3) {
        jcr jcrVarS;
        jcr jcrVarS2;
        if (!z) {
            if (this.D.j(jcrVar, z2) && z3) {
                ab(jcrVar);
                return;
            }
            return;
        }
        jdo jdoVar = this.D;
        if (jcrVar.j == null) {
            itw.d("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iAC = jcrVar.aC();
        int i = iAC - 1;
        if (iAC == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                return;
            }
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new fctg();
                }
                if (!jcrVar.am() || z2) {
                    jcrVar.U();
                    jcrVar.V();
                    if (jcrVar.B) {
                        return;
                    }
                    if ((fdbq.f(jcrVar.A(), true) || jdo.n(jcrVar)) && ((jcrVarS = jcrVar.s()) == null || !jcrVarS.am())) {
                        jdoVar.b.a(jcrVar, true);
                    } else if ((jcrVar.f() || jdo.o(jcrVar)) && ((jcrVarS2 = jcrVar.s()) == null || !jcrVarS2.an())) {
                        jdoVar.b.a(jcrVar, false);
                    }
                    if (jdoVar.d || !z3) {
                        return;
                    }
                    ab(jcrVar);
                    return;
                }
                return;
            }
        }
        jdoVar.g.n(new jdn(jcrVar, true, z2));
        jcy jcyVar = jdoVar.i;
    }

    @Override // defpackage.jfh
    public final void v(jcr jcrVar, boolean z, boolean z2) {
        if (!z) {
            jdo jdoVar = this.D;
            int iAC = jcrVar.aC();
            int i = iAC - 1;
            if (iAC == 0) {
                throw null;
            }
            if (i == 0 || i == 1 || i == 2 || i == 3) {
                jcy jcyVar = jdoVar.i;
                return;
            }
            if (i != 4) {
                throw new fctg();
            }
            jcr jcrVarS = jcrVar.s();
            boolean z3 = jcrVarS == null || jcrVarS.f();
            if (!z2 && (jcrVar.an() || (jcrVar.ak() && jcrVar.f() == z3 && jcrVar.f() == jcrVar.ao()))) {
                jcy jcyVar2 = jdoVar.i;
                return;
            }
            jcrVar.T();
            if (!jcrVar.B && jcrVar.ao() && z3) {
                if ((jcrVarS == null || !jcrVarS.ak()) && (jcrVarS == null || !jcrVarS.an())) {
                    jdoVar.b.a(jcrVar, false);
                }
                if (jdoVar.d) {
                    return;
                }
                ab(null);
                return;
            }
            return;
        }
        jdo jdoVar2 = this.D;
        int iAC2 = jcrVar.aC();
        int i2 = iAC2 - 1;
        if (iAC2 == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new fctg();
                        }
                    }
                }
            }
            jcy jcyVar3 = jdoVar2.i;
            return;
        }
        if ((jcrVar.am() || jcrVar.al()) && !z2) {
            jcy jcyVar4 = jdoVar2.i;
            return;
        }
        jcrVar.w.e();
        jcrVar.T();
        if (jcrVar.B) {
            return;
        }
        jcr jcrVarS2 = jcrVar.s();
        if (fdbq.f(jcrVar.A(), true) && ((jcrVarS2 == null || !jcrVarS2.am()) && (jcrVarS2 == null || !jcrVarS2.al()))) {
            jdoVar2.b.a(jcrVar, true);
        } else if (jcrVar.f() && ((jcrVarS2 == null || !jcrVarS2.ak()) && (jcrVarS2 == null || !jcrVarS2.an()))) {
            jdoVar2.b.a(jcrVar, false);
        }
        if (jdoVar2.d) {
            return;
        }
        ab(null);
    }

    @Override // defpackage.jfh
    public final void w() {
        jir jirVar = this.r;
        jirVar.t = true;
        if (jirVar.D() && !jirVar.C) {
            jirVar.C = true;
            jirVar.h.post(jirVar.E);
        }
        ied iedVar = this.s;
        iedVar.b = true;
        if (!iedVar.n() || iedVar.f) {
            return;
        }
        iedVar.f = true;
        iedVar.c.post(iedVar.g);
    }

    @Override // defpackage.jfh
    public final void x(fdae fdaeVar) {
        cuu cuuVar = this.aL;
        if (cuuVar.n(fdaeVar)) {
            return;
        }
        cuuVar.h(fdaeVar);
    }

    @Override // defpackage.jfh
    public final void y(jcr jcrVar) {
        this.D.e.b(jcrVar);
        ab(null);
    }

    @Override // defpackage.jfh
    public final void z(float f2) {
        if (this.h) {
            if (f2 > 0.0f) {
                if (Float.isNaN(this.aM) || f2 > this.aM) {
                    this.aM = f2;
                    return;
                }
                return;
            }
            if (f2 < 0.0f) {
                if (Float.isNaN(this.aN) || f2 < this.aN) {
                    this.aN = f2;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
    }
}
