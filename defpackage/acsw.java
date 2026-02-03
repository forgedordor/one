package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsw implements lun {
    public static final cczv a = cdag.m(cdag.b, "enable_fab_v2", false);
    public final eigp b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public View f;
    public ExtendedFloatingActionButton g;
    public int h;
    public boolean i;
    public final cpdt j;
    private final fcsu k;
    private final apuv l;
    private final eygg m;

    public acsw(fcsu fcsuVar, eigp eigpVar, apuv apuvVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eygg eyggVar, fcsu fcsuVar5) {
        fcsuVar.getClass();
        eigpVar.getClass();
        fcsuVar4.getClass();
        eyggVar.getClass();
        this.k = fcsuVar;
        this.b = eigpVar;
        this.l = apuvVar;
        this.c = fcsuVar2;
        this.d = fcsuVar4;
        this.m = eyggVar;
        this.e = fcsuVar5;
        this.j = new cpdt("migrate_start_chat_fab_to_compose", new acsu(apuvVar));
    }

    private final void j() {
        Optional optional = (Optional) this.m.b();
        final fdap fdapVar = new fdap() { // from class: acsj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                agwd agwdVar = (agwd) obj;
                cczv cczvVar = acsw.a;
                agwdVar.getClass();
                agwdVar.a();
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: acsk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cczv cczvVar = acsw.a;
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
        if (this.j.b()) {
            return;
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.r();
        }
        j();
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) throws IOException {
        i();
    }

    public final View g() {
        if (this.j.b()) {
            return null;
        }
        return this.g;
    }

    public final void h(final View view, ViewGroup viewGroup, final Runnable runnable, boolean z, final Runnable runnable2) throws Resources.NotFoundException, IOException {
        ExtendedFloatingActionButton extendedFloatingActionButton;
        ExtendedFloatingActionButton extendedFloatingActionButton2;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.fab_stub);
        eieu eieuVarH = eiiy.h("StartChatFabPresenter#replaceViewStubWithView");
        try {
            ViewParent parent = viewStub.getParent();
            parent.getClass();
            ViewGroup viewGroup2 = (ViewGroup) parent;
            int iIndexOfChild = viewGroup2.indexOfChild(viewStub);
            viewGroup2.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (layoutParams != null) {
                viewGroup2.addView(view, iIndexOfChild, layoutParams);
            } else {
                viewGroup2.addView(view, iIndexOfChild);
            }
            fczl.a(eieuVarH, null);
            this.f = view;
            this.g = (ExtendedFloatingActionButton) view.findViewById(R.id.start_chat_fab);
            Optional optional = (Optional) this.m.b();
            final fdap fdapVar = new fdap() { // from class: acsl
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    agwd agwdVar = (agwd) obj;
                    agwdVar.getClass();
                    agwdVar.b(view, runnable2, new acst(this));
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: acsm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cczv cczvVar = acsw.a;
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eieuVarH = eiiy.h("StartChatFabPresenter#BugleVeLogger#bind");
            try {
                ExtendedFloatingActionButton extendedFloatingActionButton3 = this.g;
                if (extendedFloatingActionButton3 != null) {
                    ((aisx) this.d.b()).a(extendedFloatingActionButton3, 184229);
                }
                fczl.a(eieuVarH, null);
                if (crtr.a() && (extendedFloatingActionButton2 = this.g) != null) {
                    final eigp eigpVar = this.b;
                    final View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: acsn
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            cczv cczvVar = acsw.a;
                            int action = motionEvent.getAction();
                            if (action != 0 && action != 1 && action != 2 && action != 3 && action != 11 && action != 12) {
                                return false;
                            }
                            cezn ceznVar = cezn.a;
                            motionEvent.getClass();
                            ceznVar.b(motionEvent);
                            return false;
                        }
                    };
                    extendedFloatingActionButton2.setOnTouchListener(new View.OnTouchListener() { // from class: eifw
                        public final /* synthetic */ String c = "";
                        public final /* synthetic */ String d = "";
                        public final /* synthetic */ String e = "startChatFab#onTouch";

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            int actionMasked = motionEvent.getActionMasked();
                            View.OnTouchListener onTouchListener2 = onTouchListener;
                            if (actionMasked == 3 && eidc.v()) {
                                return onTouchListener2.onTouch(view2, motionEvent);
                            }
                            String str = this.e;
                            String str2 = this.d;
                            eieh eiehVarC = eigpVar.c(str, this.c, str2, 0);
                            try {
                                boolean zOnTouch = onTouchListener2.onTouch(view2, motionEvent);
                                eiehVarC.close();
                                return zOnTouch;
                            } catch (Throwable th) {
                                try {
                                    eiehVarC.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    });
                }
                ExtendedFloatingActionButton extendedFloatingActionButton4 = this.g;
                if (extendedFloatingActionButton4 != null) {
                    extendedFloatingActionButton4.setOnClickListener(new eifs(this.b, "", "", 0, "startChatFab#onClick", new View.OnClickListener() { // from class: acso
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            acsw acswVar = this.a;
                            aisx aisxVar = (aisx) acswVar.d.b();
                            ExtendedFloatingActionButton extendedFloatingActionButton5 = acswVar.g;
                            extendedFloatingActionButton5.getClass();
                            aisxVar.c(extendedFloatingActionButton5);
                            runnable.run();
                        }
                    }));
                }
                if ((((Boolean) a.e()).booleanValue() || !z) && (extendedFloatingActionButton = this.g) != null) {
                    extendedFloatingActionButton.s();
                }
                i();
                if (this.i) {
                    View view2 = this.f;
                    if (view2 != null) {
                        acsx.a(view2, this.h, true);
                    }
                    this.i = false;
                }
            } finally {
            }
        } finally {
        }
    }

    public final void i() throws IOException {
        eieu eieuVarH = eiiy.h("StartChatFabPresenter#updateFabVisibility");
        try {
            if (((crmx) this.k.b()).G()) {
                ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
                if (extendedFloatingActionButton != null) {
                    extendedFloatingActionButton.v(0);
                }
                eygg eyggVar = this.m;
                if (((Optional) eyggVar.b()).isPresent() && ((agwd) ((Optional) eyggVar.b()).get()).g()) {
                    Optional optional = (Optional) eyggVar.b();
                    final fdap fdapVar = new fdap() { // from class: acsr
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            agwd agwdVar = (agwd) obj;
                            cczv cczvVar = acsw.a;
                            agwdVar.getClass();
                            agwdVar.e();
                            return fctx.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: acss
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            cczv cczvVar = acsw.a;
                            fdapVar.invoke(obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                fczl.a(eieuVarH, null);
            }
            ExtendedFloatingActionButton extendedFloatingActionButton2 = this.g;
            if (extendedFloatingActionButton2 != null) {
                extendedFloatingActionButton2.r();
            }
            j();
            fczl.a(eieuVarH, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
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
}
