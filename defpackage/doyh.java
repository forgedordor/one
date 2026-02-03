package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyh extends vo {
    public static final /* synthetic */ fdeh[] a;
    public final Context d;
    public final fdjx e;
    public final dngc f;
    public final Optional g;
    public final boolean h;
    public int i;
    public fdap l;
    public final int m;
    public doxc n;
    private final dnhb s;
    public final fdcz j = new doyf(0, this);
    public final fdcz k = new doyg(0, this);
    private final fctc t = fctd.a(new fdae() { // from class: doxs
        @Override // defpackage.fdae
        public final Object invoke() {
            Boolean bool = (Boolean) fdct.a(this.a.g, false);
            bool.booleanValue();
            return bool;
        }
    });
    private final fctc u = fctd.a(new fdae() { // from class: doxt
        @Override // defpackage.fdae
        public final Object invoke() {
            doyh doyhVar = this.a;
            return Integer.valueOf(doyhVar.d.getResources().getDimensionPixelSize(true != doyhVar.H() ? R.dimen.shortcut_spacing : R.dimen.shortcut_spacing_coolranch));
        }
    });
    public final fctc o = fctd.a(new fdae() { // from class: doxu
        @Override // defpackage.fdae
        public final Object invoke() {
            doyh doyhVar = this.a;
            return Integer.valueOf(doyhVar.d.getResources().getDimensionPixelSize(true != doyhVar.H() ? R.dimen.shortcut_icon_size : R.dimen.shortcut_icon_width_coolranch));
        }
    });
    private final fctc v = fctd.a(new fdae() { // from class: doxv
        @Override // defpackage.fdae
        public final Object invoke() {
            doyh doyhVar = this.a;
            return Integer.valueOf(doyhVar.F() + ((Number) doyhVar.o.a()).intValue() + doyhVar.F());
        }
    });
    public final fctc p = fctd.a(new fdae() { // from class: doxw
        @Override // defpackage.fdae
        public final Object invoke() {
            return Integer.valueOf(this.a.d.getResources().getDimensionPixelSize(R.dimen.shortcut_cell_height));
        }
    });
    public final fctc q = fctd.a(new fdae() { // from class: doxx
        @Override // defpackage.fdae
        public final Object invoke() {
            doyh doyhVar = this.a;
            return Integer.valueOf(doyhVar.F() + ((Number) doyhVar.p.a()).intValue() + doyhVar.F());
        }
    });
    public final fctc r = fctd.a(new fdae() { // from class: doxy
        @Override // defpackage.fdae
        public final Object invoke() {
            return Float.valueOf(this.a.d.getResources().getDimension(R.dimen.shortcut_title_max_font_size_coolranch));
        }
    });

    static {
        fdbv fdbvVar = new fdbv(doyh.class, "cellWidthPx", "getCellWidthPx()I", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar, new fdbv(doyh.class, "cellHeightPx", "getCellHeightPx()I", 0)};
    }

    public doyh(Context context, fdjx fdjxVar, dnhb dnhbVar, dngc dngcVar, Optional optional, doxc doxcVar, boolean z) {
        this.d = context;
        this.e = fdjxVar;
        this.s = dnhbVar;
        this.f = dngcVar;
        this.g = optional;
        this.h = z;
        this.m = fddu.g(doxcVar.a.size(), 7);
        this.n = doxcVar;
    }

    public final int F() {
        return ((Number) this.u.a()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(defpackage.doxa r5, android.view.View r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.doye
            if (r0 == 0) goto L13
            r0 = r7
            doye r0 = (defpackage.doye) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            doye r0 = new doye
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            doxa r5 = r0.e
            defpackage.fctl.b(r7)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r7)
            dnhb r7 = r4.s
            java.util.List r2 = r5.c
            r0.e = r5
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r7.b(r2, r0)
            if (r7 == r1) goto L56
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L53
            fdap r5 = r5.d
            r5.invoke(r6)
        L53:
            fctx r5 = defpackage.fctx.a
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doyh.G(doxa, android.view.View, fcxy):java.lang.Object");
    }

    public final boolean H() {
        return ((Boolean) this.t.a()).booleanValue();
    }

    @Override // defpackage.vo
    public final int a() {
        return this.n.a.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(true != H() ? R.layout.shortcut_item : R.layout.shortcut_item_coolranch, viewGroup, false);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.shortcut_icon);
        appCompatImageView.setBackgroundResource(R.drawable.shortcut_icon_shape);
        TextView textView = (TextView) viewInflate.findViewById(R.id.shortcut_title);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewInflate.findViewById(R.id.shortcut_badge_icon);
        viewInflate.getClass();
        appCompatImageView.getClass();
        textView.getClass();
        appCompatImageView2.getClass();
        return new doyd(this, viewInflate, appCompatImageView, textView, appCompatImageView2);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        View.OnClickListener onClickListener;
        final doyd doydVar = (doyd) wvVar;
        doydVar.getClass();
        final doxa doxaVar = (doxa) this.n.a.get(i);
        doxaVar.getClass();
        int i2 = doxaVar.a;
        View view = doydVar.s;
        view.setContentDescription(view.getResources().getString(i2));
        ley.p(view, new dphj(new fdap() { // from class: doxz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                lhg lhgVar = (lhg) obj;
                int i3 = doyd.x;
                lhgVar.getClass();
                lhgVar.M("button");
                return fctx.a;
            }
        }));
        List list = doxaVar.c;
        final doyh doyhVar = doydVar.w;
        if (list.isEmpty()) {
            final fdap fdapVar = doxaVar.d;
            onClickListener = new View.OnClickListener() { // from class: doya
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = doyd.x;
                    fdapVar.invoke(view2);
                }
            };
        } else {
            onClickListener = new View.OnClickListener() { // from class: doyb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    doyh doyhVar2 = this.a;
                    fdil.d(doyhVar2.e, null, null, new doyc(doyhVar2, doxaVar, doydVar, null), 3);
                }
            };
        }
        view.setOnClickListener(doyhVar.f.a("ShortcutsAdapter.ViewHolder#onClick", onClickListener));
        if (!doyhVar.H()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = ((Number) doyhVar.k.c(a[1])).intValue();
            view.setLayoutParams(layoutParams);
        }
        AppCompatImageView appCompatImageView = doydVar.t;
        dowz dowzVar = doxaVar.b;
        if (doyhVar.H()) {
            appCompatImageView.setImageResource(dowzVar.a);
            appCompatImageView.setBackgroundResource(R.drawable.shortcut_icon_background_coolranch);
            fdap fdapVar2 = doyhVar.l;
            if (fdapVar2 != null) {
                fdapVar2.invoke(appCompatImageView);
            }
        } else {
            appCompatImageView.setImageResource(dowzVar.a);
            dowy dowyVar = dowzVar.b;
            Context context = appCompatImageView.getContext();
            context.getClass();
            Drawable drawable = appCompatImageView.getDrawable();
            drawable.getClass();
            dowyVar.b.b(context, drawable);
            appCompatImageView.setBackgroundResource(R.drawable.shortcut_icon_shape);
            Context context2 = appCompatImageView.getContext();
            context2.getClass();
            Drawable background = appCompatImageView.getBackground();
            background.getClass();
            dowyVar.a.b(context2, background);
        }
        doydVar.v.setVisibility(8);
        TextView textView = doydVar.u;
        textView.setText(i2);
        if (doyhVar.H()) {
            textView.setTextSize(0, fddu.d(textView.getTextSize(), ((Number) doyhVar.r.a()).floatValue()));
        }
    }

    public final int l() {
        return ((Number) this.v.a()).intValue();
    }
}
