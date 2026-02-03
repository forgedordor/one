package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.TextualCardRootView;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dyhi extends dyfr {
    public final int A;
    public TextualCardRootView B;
    public ImageView C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public Chip H;
    public Chip I;
    public ImageView J;
    public ImageView K;
    public ImageView L;
    public TextView M;
    public TextView N;
    public ViewGroup O;
    public View.OnClickListener P;
    public View.OnClickListener Q;
    public boolean R;
    public boolean S;
    public boolean T;
    private ViewGroup U;
    private ViewGroup V;
    private View W;
    private View X;
    private ViewGroup Y;
    private boolean Z;
    private final int y;
    private final int z;

    public dyhi(ViewGroup viewGroup, Context context, dyyb dyybVar) {
        super(viewGroup, context, dyybVar);
        this.A = dypw.b(context, R.attr.ogIconColor);
        this.y = context.getResources().getDimensionPixelSize(R.dimen.account_menu_cards_vertical_spacing);
        this.z = context.getResources().getDimensionPixelSize(R.dimen.text_card_vertical_spacing_with_actions);
    }

    private final void G() {
        this.H.setClickable(false);
        this.H.setFocusable(false);
    }

    public static void N(TextView textView, dygj dygjVar) {
        String str = (String) dygjVar.a().f();
        textView.setText(dygjVar.b());
        textView.setContentDescription(str);
    }

    private static final void O(TextualCardRootView textualCardRootView, dygn dygnVar) {
        if (textualCardRootView != null) {
            textualCardRootView.c = dygnVar != null ? ejwi.j(dygnVar.w) : ejud.a;
        }
    }

    private static final void P(ViewGroup viewGroup, dygn dygnVar) {
        if (viewGroup != null) {
            viewGroup.setTag(R.id.og_card_highlight_id_tag, dygnVar != null ? (Integer) dygnVar.v.f() : null);
        }
    }

    protected View D(ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dyfr
    protected void E(lvj lvjVar) {
        this.B.gW(((dyfr) this).t);
        super.E(lvjVar);
        dygn dygnVar = (dygn) this.x;
        dygnVar.getClass();
        dygnVar.j.l(lvjVar);
        dygnVar.k.l(lvjVar);
        dygnVar.l.l(lvjVar);
        dygnVar.m.l(lvjVar);
        dygnVar.n.l(lvjVar);
        dygnVar.o.l(lvjVar);
        dygnVar.q.l(lvjVar);
        dygnVar.s.l(lvjVar);
        dygnVar.r.l(lvjVar);
        dygnVar.p.l(lvjVar);
        dygnVar.t.l(lvjVar);
        dygnVar.b.l(lvjVar);
        if (this.Z) {
            dygnVar.u.l(lvjVar);
        }
        if (dygnVar instanceof dygd) {
            ((dygd) dygnVar).f();
        }
        dygnVar.i();
    }

    @Override // defpackage.dyfr
    protected final void F(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.Y = viewGroup2;
        Context context = this.s;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.og_textual_card, viewGroup);
        this.B = (TextualCardRootView) viewInflate.findViewById(R.id.og_text_card_root);
        this.U = (ViewGroup) viewInflate.findViewById(R.id.og_full_text_card_root);
        this.V = (ViewGroup) viewInflate.findViewById(R.id.og_minimized_text_card_root);
        this.C = (ImageView) viewInflate.findViewById(R.id.og_text_card_icon);
        this.D = (ImageView) viewInflate.findViewById(R.id.og_minimized_text_card_icon);
        this.E = (TextView) viewInflate.findViewById(R.id.og_text_card_title);
        this.F = (TextView) viewInflate.findViewById(R.id.og_minimized_text_card_title);
        this.G = (TextView) viewInflate.findViewById(R.id.og_text_card_subtitle);
        this.H = (Chip) viewInflate.findViewById(R.id.og_text_card_action);
        this.W = viewInflate.findViewById(R.id.og_text_actions_top_margin);
        this.X = viewInflate.findViewById(R.id.og_text_cards_flow);
        this.I = (Chip) viewInflate.findViewById(R.id.og_text_card_secondary_action);
        this.J = (ImageView) viewInflate.findViewById(R.id.og_text_card_trail_image);
        this.K = (ImageView) viewInflate.findViewById(R.id.og_text_card_trail_title_image);
        this.L = (ImageView) viewInflate.findViewById(R.id.og_minimized_text_card_trail_title_image);
        this.M = (TextView) viewInflate.findViewById(R.id.og_text_card_trail_title_text);
        this.N = (TextView) viewInflate.findViewById(R.id.og_text_card_trail_caption_text);
        this.O = (ViewGroup) viewInflate.findViewById(R.id.og_text_card_custom_content);
        if (dyrb.a(context)) {
            G();
        }
        O(this.B, (dygn) this.x);
        P(viewGroup2, (dygn) this.x);
        this.Z = D(this.O) != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dyfr
    public void H(lvj lvjVar, dygn dygnVar) {
        super.H(lvjVar, dygnVar);
        boolean z = dygnVar instanceof dygd;
        this.R = z;
        P(this.Y, dygnVar);
        O(this.B, dygnVar);
        this.B.b(((dyfr) this).t);
        dygnVar.j.f(lvjVar, new lvz() { // from class: dyhb
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dyhi dyhiVar = this.a;
                Drawable drawableE = ((dyhk) obj).e(dyhiVar.s, dyhiVar.A);
                dyhiVar.C.setImageDrawable(drawableE);
                if (dyhiVar.R) {
                    dyhiVar.D.setImageDrawable(drawableE);
                }
            }
        });
        dygnVar.k.f(lvjVar, new lvz() { // from class: dyhf
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dyhi dyhiVar = this.a;
                dygj dygjVar = (dygj) obj;
                dyhi.N(dyhiVar.E, dygjVar);
                if (dyhiVar.R) {
                    dyhi.N(dyhiVar.F, dygjVar);
                }
            }
        });
        dygnVar.l.f(lvjVar, new lvz() { // from class: dyhg
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dyhi dyhiVar = this.a;
                ejwi ejwiVar = (ejwi) obj;
                dyhiVar.G.setVisibility(true != ejwiVar.g() ? 8 : 0);
                if (ejwiVar.g()) {
                    dyhiVar.G.setText((CharSequence) ejwiVar.c());
                }
            }
        });
        dygnVar.m.f(lvjVar, new lvz() { // from class: dyhh
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dyhi dyhiVar = this.a;
                ekgb ekgbVar = (ekgb) obj;
                dyhiVar.H.setVisibility(true != ekgbVar.isEmpty() ? 0 : 8);
                dyhiVar.B.a.a(ekgbVar);
                dyhiVar.K();
            }
        });
        dygnVar.n.f(lvjVar, new lvz() { // from class: dygt
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dyhi dyhiVar = this.a;
                dyhiVar.H.setTextColor(dyhiVar.I((ejwi) obj));
            }
        });
        dygnVar.o.f(lvjVar, new lvz() { // from class: dygu
            @Override // defpackage.lvz
            public final void a(Object obj) {
                View.OnClickListener onClickListener = (View.OnClickListener) ((ejwi) obj).f();
                dyhi dyhiVar = this.a;
                dyhiVar.Q = onClickListener;
                dyhiVar.J(dyhiVar.Q, dyhiVar.P);
            }
        });
        dygnVar.q.f(lvjVar, new lvz() { // from class: dygv
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                boolean z2 = !ekgbVar.isEmpty();
                dyhi dyhiVar = this.a;
                dyhiVar.T = z2;
                dyhiVar.B.b.a(ekgbVar);
                dyhiVar.M(dyhiVar.S);
            }
        });
        dygnVar.s.f(lvjVar, new lvz() { // from class: dygw
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dyhi dyhiVar = this.a;
                dyhiVar.I.setTextColor(dyhiVar.I((ejwi) obj));
            }
        });
        dygnVar.r.f(lvjVar, new lvz() { // from class: dygx
            @Override // defpackage.lvz
            public final void a(Object obj) {
                final ejwi ejwiVar = (ejwi) obj;
                boolean zG = ejwiVar.g();
                final dyhi dyhiVar = this.a;
                dyhiVar.S = zG;
                if (zG) {
                    dyhiVar.I.setOnClickListener(new View.OnClickListener() { // from class: dyha
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dsve dsveVar = new dsve(5);
                            dyhi dyhiVar2 = dyhiVar;
                            ((dyfr) dyhiVar2).t.f(dsveVar, dyhiVar2.I);
                            ((View.OnClickListener) ejwiVar.c()).onClick(view);
                        }
                    });
                } else {
                    dyhiVar.I.setOnClickListener(null);
                }
                dyhiVar.M(dyhiVar.S);
            }
        });
        dygnVar.p.f(lvjVar, new lvz() { // from class: dygy
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                boolean zG = ejwiVar.g();
                dyhi dyhiVar = this.a;
                if (!zG) {
                    dyhiVar.J.setVisibility(8);
                } else {
                    dyhiVar.J.setImageDrawable((Drawable) ejwiVar.c());
                    dyhiVar.J.setVisibility(0);
                }
            }
        });
        dygnVar.t.f(lvjVar, new lvz() { // from class: dyhc
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dyhi dyhiVar = this.a;
                ejwi ejwiVar = (ejwi) obj;
                dyhiVar.M.setVisibility(8);
                dyhiVar.N.setVisibility(8);
                TextView textView = ((Boolean) ejwiVar.b(new ejvr() { // from class: dygz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(((dygr) obj2).c());
                    }
                }).e(false)).booleanValue() ? dyhiVar.N : dyhiVar.M;
                if (!ejwiVar.g()) {
                    textView.setVisibility(8);
                    dyhiVar.K.setVisibility(8);
                    dyhiVar.L.setVisibility(8);
                    return;
                }
                dygr dygrVar = (dygr) ejwiVar.c();
                dygj dygjVar = (dygj) dygrVar.b().f();
                if (dygjVar != null) {
                    textView.setText(dygjVar.b());
                    textView.setContentDescription((CharSequence) dygjVar.a().f());
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                ImageView imageView = dyhiVar.K;
                ejwi ejwiVarA = dygrVar.a();
                int i = dyhiVar.A;
                dyhiVar.L(imageView, ejwiVarA, i);
                if (dyhiVar.R) {
                    dyhiVar.L(dyhiVar.L, dygrVar.a(), i);
                }
            }
        });
        if (this.Z) {
            dygnVar.u.f(lvjVar, new lvz() { // from class: dyhd
                @Override // defpackage.lvz
                public final void a(Object obj) {
                    this.a.O.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
                }
            });
        }
        dygnVar.b.f(lvjVar, new lvz() { // from class: dyhe
            @Override // defpackage.lvz
            public final void a(Object obj) {
                View.OnClickListener onClickListener = (View.OnClickListener) ((ejwi) obj).f();
                dyhi dyhiVar = this.a;
                dyhiVar.P = onClickListener;
                dyhiVar.J(dyhiVar.Q, dyhiVar.P);
            }
        });
        if (z) {
            ((dygd) dygnVar).e();
        } else {
            this.U.setVisibility(0);
            this.V.setVisibility(8);
            this.F.setVisibility(8);
        }
        dygnVar.h();
    }

    public final ColorStateList I(ejwi ejwiVar) {
        return ejwiVar.g() ? (ColorStateList) ejwiVar.c() : kxj.d(this.s, R.color.og_chip_assistive_text_color);
    }

    public final void J(final View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (onClickListener == null) {
            onClickListener = null;
            if (onClickListener2 != null && !dyrb.a(this.s)) {
                onClickListener = onClickListener2;
            }
        }
        if (onClickListener != null) {
            this.H.setOnClickListener(new View.OnClickListener() { // from class: dygs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dsve dsveVar = new dsve(5);
                    dyhi dyhiVar = this.a;
                    ((dyfr) dyhiVar).t.f(dsveVar, dyhiVar.H);
                    onClickListener.onClick(view);
                }
            });
        } else {
            G();
        }
    }

    public final void K() {
        int i = 0;
        if (this.H.getVisibility() == 8 && this.I.getVisibility() == 8) {
            i = 8;
        }
        this.X.setVisibility(i);
        this.W.setVisibility(i);
        ViewGroup viewGroup = this.U;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), this.U.getPaddingTop(), this.U.getPaddingRight(), i == 0 ? this.z : this.y);
    }

    public final void L(ImageView imageView, ejwi ejwiVar, int i) {
        imageView.setVisibility(true != ejwiVar.g() ? 8 : 0);
        if (ejwiVar.g()) {
            imageView.setImageDrawable(((dyhk) ejwiVar.c()).e(this.s, i));
            imageView.setContentDescription((CharSequence) ((dyfb) ejwiVar.c()).c.f());
        }
    }

    public final void M(boolean z) {
        if (this.T && z) {
            this.I.setVisibility(0);
        } else {
            this.I.setVisibility(8);
        }
        K();
    }
}
