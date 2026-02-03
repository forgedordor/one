package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnqr extends vo implements dnkx {
    private static final ekrg n = ekrg.c("com/google/android/libraries/compose/emoji/ui/screen/adapter/EmojiAdapter");
    public final dnky a;
    public final dngc d;
    public final fdjx e;
    public dnov f;
    public dnsl g;
    public int h;
    public int j;
    public int k;
    private final dnth o;
    private int q;
    private final fctc p = fctd.a(new fdae() { // from class: dnqe
        @Override // defpackage.fdae
        public final Object invoke() {
            final dnqr dnqrVar = this.a;
            dndy dndyVar = new dndy() { // from class: dnqd
                @Override // defpackage.dndy
                public final boolean a(Object obj, int i, Object obj2) {
                    dnqo dnqoVar = (dnqo) obj;
                    fctx fctxVar = null;
                    dnql dnqlVar = dnqoVar instanceof dnql ? (dnql) dnqoVar : null;
                    if (dnqlVar != null) {
                        dnqu dnquVarI = dnqrVar.I(i);
                        dnquVarI.getClass();
                        dnqs dnqsVar = (dnqs) dnquVarI;
                        fdlr fdlrVar = dnqlVar.u;
                        if (fdlrVar != null) {
                            fdlrVar.t(null);
                        }
                        dnqr dnqrVar2 = dnqlVar.x;
                        dnqlVar.u = fdil.d(dnqrVar2.e, null, null, new dnqk(dnqrVar2, dnqsVar, dnqlVar, null), 3);
                        fctxVar = fctx.a;
                    }
                    return fctxVar != null;
                }
            };
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = fdcj.a;
            dndx.b(new fdbi(dnqn.class), dndyVar, linkedHashMap);
            return dndx.a(linkedHashMap);
        }
    });
    public List i = fcvo.a;
    public final fdat l = new fdat() { // from class: dnqf
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            dnql dnqlVar = (dnql) obj;
            dnmj dnmjVar = (dnmj) obj2;
            dnqlVar.getClass();
            dnmjVar.getClass();
            dnqr dnqrVar = this.a;
            if (dnqrVar.F().b) {
                return fdil.d(dnqrVar.e, null, null, new dnqq(dnqrVar, dnmjVar, dnqlVar, null), 3);
            }
            dnqrVar.J(dnqlVar);
            return fctx.a;
        }
    };
    public final fdat m = new fdat() { // from class: dnqg
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            dnql dnqlVar = (dnql) obj;
            dnmj dnmjVar = (dnmj) obj2;
            dnqlVar.getClass();
            dnmjVar.getClass();
            this.a.N(dnqlVar, dnmjVar, dnqlVar.s);
            return true;
        }
    };

    public dnqr(dnky dnkyVar, dngc dngcVar, fdjx fdjxVar, dnth dnthVar) {
        this.a = dnkyVar;
        this.d = dngcVar;
        this.e = fdjxVar;
        this.o = dnthVar;
    }

    public final dnov F() {
        dnov dnovVar = this.f;
        if (dnovVar != null) {
            return dnovVar;
        }
        fdbq.c("configuration");
        return null;
    }

    protected final dnqo G(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.standard_emoji_view_holder, viewGroup, false);
        viewInflate.getClass();
        return new dnql(this, viewInflate);
    }

    @Override // defpackage.vo
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public dnqo e(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return G(viewGroup);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.standard_emoji_header_holder, viewGroup, false);
        viewInflate.getClass();
        return new dnqm(viewInflate);
    }

    public dnqu I(int i) {
        return (dnqu) this.i.get(i);
    }

    public final void J(dnql dnqlVar) {
        dnug dnugVar = (dnug) dnqlVar.t.c();
        if (dnugVar == null) {
            ((ekrd) n.j().h("com/google/android/libraries/compose/emoji/ui/screen/adapter/EmojiAdapter", "handleDirectEmojiSelection", 182, "EmojiAdapter.kt")).t("Unable to find emoji for %s. Cannot invoke listener.", null);
            return;
        }
        dnsl dnslVar = this.g;
        if (dnslVar != null) {
            dnslVar.a().invoke(new dnnp(dnugVar.b, dnugVar.a, Integer.valueOf(dnqlVar.ft()), l(dnqlVar.ft()), false, 16));
        }
    }

    public final void K(dnov dnovVar) {
        dnovVar.getClass();
        this.f = dnovVar;
    }

    public final void L(List list) {
        list.getClass();
        this.i = list;
    }

    public void M(Context context, int i) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        this.q = resources.getDimensionPixelSize(R.dimen.emoji_gallery_padding);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.emoji_item_default_width);
        int i2 = this.q;
        int i3 = i - (i2 + i2);
        int iMax = Math.max(1, i3 / dimensionPixelSize);
        this.h = iMax;
        this.j = Math.max(1, i3 / iMax);
        if (this.k == 0) {
            this.k = context.getResources().getDimensionPixelSize(R.dimen.emoji_item_icon_padding);
        }
        p();
    }

    public final void N(final dnql dnqlVar, final dnmj dnmjVar, View view) {
        this.o.b(dnmjVar, view, F(), new fdap() { // from class: dnqc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnkf dnkfVar = (dnkf) obj;
                dnkfVar.getClass();
                dnqr dnqrVar = this;
                int iFs = dnqlVar.fs();
                dnqrVar.q(iFs);
                dnsl dnslVar = dnqrVar.g;
                if (dnslVar != null) {
                    dnslVar.a().invoke(new dnnp(dnmjVar, dnkfVar, Integer.valueOf(iFs), dnqrVar.l(iFs), true));
                }
                return fctx.a;
            }
        });
    }

    @Override // defpackage.vo
    public int a() {
        return this.i.size();
    }

    @Override // defpackage.dnkx
    public final void b() {
        fdil.d(this.e, null, null, new dnqp(this, null), 3);
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return I(i).b() - 1;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        dnqo dnqoVar = (dnqo) wvVar;
        dnqoVar.getClass();
        dnqoVar.C(I(i));
    }

    public abstract dnno l(int i);

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void z(wv wvVar, int i, List list) {
        dnqo dnqoVar = (dnqo) wvVar;
        dnqoVar.getClass();
        list.getClass();
        if (((dndz) this.p.a()).a(dnqoVar, i, list)) {
            return;
        }
        g(dnqoVar, i);
    }
}
