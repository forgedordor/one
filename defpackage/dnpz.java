package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.dnpz;
import defpackage.ws;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnpz extends dnqb {
    public static final /* synthetic */ int ar = 0;
    private static final ekrg as = ekrg.c("com/google/android/libraries/compose/emoji/ui/screen/EmojiScreen");
    public dnkh a;
    public dnqr ag;
    public ejwi ah;
    public dnsk ai;
    public dner aj;
    public dneq ak;
    public dnky al;
    public fdkf am;
    public GridLayoutManager an;
    public int ao;
    public final fdap ap;
    public dnph aq;
    private final dpxe at;
    private dpyb au;
    private final fctc av;
    private final fctc aw;
    private final dnpk ax;
    private final dnpo ay;
    public fdjx b;
    public dnth c;
    public dnqy d;
    public dnqz e;

    public dnpz() {
        super(new dnov(null, null, 255));
        this.at = dpxe.b;
        this.av = fctd.a(new fdae() { // from class: dnpe
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(this.a.B().getDimensionPixelSize(R.dimen.emoji_tab_height));
            }
        });
        this.aw = fctd.a(new fdae() { // from class: dnpf
            @Override // defpackage.fdae
            public final Object invoke() {
                return new dnpn(this.a);
            }
        });
        this.ap = new fdap() { // from class: dnpg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                dnqy dnqyVarP = this.a.p();
                ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new dnqs((dnmj) it.next(), 0));
                }
                dnqyVarP.r.d(dnqy.n[0], arrayList);
                return fctx.a;
            }
        };
        this.ax = new dnpk(this);
        this.ay = new dnpo(this);
    }

    static /* synthetic */ boolean bh(final dnpz dnpzVar) {
        return dnpzVar.bm(new fdae() { // from class: dnoz
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.bP().a();
            }
        });
    }

    private final void bk(boolean z) {
        dnph dnphVar = this.aq;
        dnph dnphVar2 = null;
        if (dnphVar == null) {
            fdbq.c("views");
            dnphVar = null;
        }
        RecyclerView recyclerView = dnphVar.a;
        int i = 0;
        if (z) {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ((Number) this.av.a()).intValue());
            recyclerView.y(this.ay);
        } else {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), 0);
            recyclerView.ah(this.ay);
            i = 8;
        }
        dnph dnphVar3 = this.aq;
        if (dnphVar3 == null) {
            fdbq.c("views");
        } else {
            dnphVar2 = dnphVar3;
        }
        dnphVar2.b.setVisibility(i);
        dnphVar2.c.setVisibility(i);
    }

    private final void bl() {
        p().g = f();
        q().g = f();
        final int iF = fddu.f(p().h, 1);
        final Context contextZ = z();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(iF, this, contextZ) { // from class: com.google.android.libraries.compose.emoji.ui.screen.EmojiScreen$initGridLayoutManager$gridManager$1
            final /* synthetic */ dnpz J;

            @Override // android.support.v7.widget.LinearLayoutManager
            protected final int N(ws wsVar) {
                wsVar.getClass();
                return 1000;
            }

            @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
            public final boolean af() {
                return !this.J.r().isShowing();
            }
        };
        gridLayoutManager.g = new dnpp(this);
        this.an = gridLayoutManager;
        dnph dnphVar = this.aq;
        if (dnphVar == null) {
            fdbq.c("views");
            dnphVar = null;
        }
        GridLayoutManager gridLayoutManager2 = this.an;
        if (gridLayoutManager2 == null) {
            fdbq.c("layoutManager");
            gridLayoutManager2 = null;
        }
        dnphVar.a.ao(gridLayoutManager2);
        dnph dnphVar2 = this.aq;
        if (dnphVar2 == null) {
            fdbq.c("views");
            dnphVar2 = null;
        }
        dphw.f(dnphVar2.a, R.id.proxy_screen_header);
        fdil.d(bH(), null, null, new dnpw(this, null), 3);
    }

    private final boolean bm(fdae fdaeVar) {
        dnqr dnqrVar;
        return (this.aZ == null || fdaeVar.invoke() == dpuv.b || (dnqrVar = this.ag) == null || !fdbq.f(dnqrVar, p())) ? false : true;
    }

    private static final void bn(TabLayout tabLayout, String str, Drawable drawable) {
        eeve eeveVarE = tabLayout.e();
        eeveVarE.d(str);
        eeveVarE.e(drawable);
        View childAt = eeveVarE.i.getChildAt(0);
        childAt.getClass();
        ImageView imageView = (ImageView) childAt;
        imageView.setImageTintList(kxj.d(imageView.getContext(), R.color.selectable_action_selector));
        tabLayout.g(eeveVarE);
    }

    private final void bo(TabLayout tabLayout) {
        fdil.d(bH(), null, null, new dnpy(this, tabLayout, null), 3);
    }

    public static final /* synthetic */ dnov e(dnpz dnpzVar) {
        return (dnov) dnpzVar.bC();
    }

    public final dneq a() {
        dneq dneqVar = this.ak;
        if (dneqVar != null) {
            return dneqVar;
        }
        fdbq.c("emojiUsageProcessor");
        return null;
    }

    @Override // defpackage.dpxs
    public final dpyb aV() {
        dpyb dpybVar = this.au;
        if (dpybVar != null) {
            return dpybVar;
        }
        ejwi ejwiVar = this.ah;
        if (ejwiVar != null) {
            final dnpj dnpjVar = new dnpj(this);
            this.au = (dpyb) ((ejwt) ejwiVar.b(new ejvr() { // from class: dnpc
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i = dnpz.ar;
                    return dnpjVar.invoke(obj);
                }
            })).a;
        }
        return this.au;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aW(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnpz.aW(fcxy):java.lang.Object");
    }

    public final void aY(int i) {
        int iO = p().O(i);
        GridLayoutManager gridLayoutManager = this.an;
        if (gridLayoutManager == null) {
            fdbq.c("layoutManager");
            gridLayoutManager = null;
        }
        gridLayoutManager.ab(iO, 0);
        if (i > 0) {
            bP().b(false);
        }
    }

    @Override // defpackage.dpxo
    protected final void aZ(dpgl dpglVar) {
        ((ekrd) as.e().h("com/google/android/libraries/compose/emoji/ui/screen/EmojiScreen", "applyHugoColors", 121, "EmojiScreen.kt")).t("Applying HugoColors: %s", dpglVar);
        dnph dnphVar = this.aq;
        if (dnphVar == null) {
            fdbq.c("views");
            dnphVar = null;
        }
        ColorStateList colorStateList = dpglVar.i;
        TabLayout tabLayout = dnphVar.c;
        tabLayout.r(colorStateList);
        tabLayout.setBackgroundColor(dpglVar.d);
        dnphVar.d.setImageTintList(dpglVar.o);
        dnphVar.e.setBackgroundColor(dpglVar.n);
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        p().K((dnov) bC());
        q().K((dnov) bC());
        this.aq = new dnph((ViewGroup) view);
        bS();
        bl();
        dnph dnphVar = this.aq;
        dnph dnphVar2 = null;
        if (dnphVar == null) {
            fdbq.c("views");
            dnphVar = null;
        }
        dnphVar.a.al(p());
        dnph dnphVar3 = this.aq;
        if (dnphVar3 == null) {
            fdbq.c("views");
            dnphVar3 = null;
        }
        dnphVar3.d.setVisibility(true != ((dnov) bC()).f ? 8 : 0);
        dnph dnphVar4 = this.aq;
        if (dnphVar4 == null) {
            fdbq.c("views");
        } else {
            dnphVar2 = dnphVar4;
        }
        dnphVar2.d.setOnClickListener(bA().a("EmojiScreen.backspace#onClick", new View.OnClickListener() { // from class: dnpb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                new dnpl(((dnhl) this.a.f().a.bG().invoke()).a).invoke();
            }
        }));
        bA().d("EmojiScreen#onViewCreated", new fdae() { // from class: dnpa
            @Override // defpackage.fdae
            public final Object invoke() {
                dnpz dnpzVar = this.a;
                return fdil.d(dnpzVar.bH(), null, null, new dnpu(dnpzVar, null), 3);
            }
        });
    }

    public final dnky b() {
        dnky dnkyVar = this.al;
        if (dnkyVar != null) {
            return dnkyVar;
        }
        fdbq.c("emojiPreferencesService");
        return null;
    }

    public final void bc(int i) {
        dnph dnphVar = this.aq;
        if (dnphVar == null) {
            fdbq.c("views");
            dnphVar = null;
        }
        eeve eeveVarD = dnphVar.c.d(i);
        if (eeveVarD != null) {
            this.ao = i;
            eeveVarD.a();
        }
    }

    public final void bd(dnqr dnqrVar) {
        dnph dnphVar = this.aq;
        if (dnphVar == null) {
            fdbq.c("views");
            dnphVar = null;
        }
        dnqr dnqrVar2 = this.ag;
        if (dnqrVar2 == null || !fdbq.f(dnqrVar, dnqrVar2)) {
            if (this.ag != null) {
                b().d(dnqrVar);
            }
            b().c(dnqrVar);
            this.ag = dnqrVar;
            if (dnqrVar == null) {
                fdbq.c("currentAdapter");
                dnqrVar = null;
            }
            dnphVar.a.al(dnqrVar);
            bk(bh(this));
        }
    }

    @Override // defpackage.dpxo
    public final void bg() {
        if (this.aq != null) {
            bk(bh(this));
        }
    }

    public final dnpn f() {
        return (dnpn) this.aw.a();
    }

    @Override // defpackage.dnqb, defpackage.dpil, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        dner dnerVar = this.aj;
        if (dnerVar == null) {
            fdbq.c("emojiUsageProcessorFactory");
            dnerVar = null;
        }
        this.ak = dnerVar.a(new dnfv(29));
        bA().d("EmojiScreen#onAttach", new fdae() { // from class: dnox
            @Override // defpackage.fdae
            public final Object invoke() {
                dnpz dnpzVar = this.a;
                fdjx fdjxVar = dnpzVar.b;
                if (fdjxVar == null) {
                    fdbq.c("cpuBoundScope");
                    fdjxVar = null;
                }
                dnpzVar.am = fdil.c(fdjxVar, null, new dnpq(dnpzVar, null), 3);
                return Boolean.valueOf(dnpzVar.a().d());
            }
        });
    }

    @Override // defpackage.dpil
    public final boolean gD() {
        boolean zIsShowing = r().isShowing();
        if (zIsShowing) {
            r().a();
        }
        return zIsShowing;
    }

    @Override // defpackage.dpxo
    public final void gx(final dpuv dpuvVar) {
        dpuvVar.getClass();
        if (this.aq != null) {
            bk(bm(new fdae() { // from class: dnpd
                @Override // defpackage.fdae
                public final Object invoke() {
                    int i = dnpz.ar;
                    return dpuvVar;
                }
            }));
        }
    }

    @Override // defpackage.ea
    public final void i() {
        super.i();
        dnph dnphVar = this.aq;
        dnqr dnqrVar = null;
        if (dnphVar != null) {
            dnphVar.a.C();
            dnph dnphVar2 = this.aq;
            if (dnphVar2 == null) {
                fdbq.c("views");
                dnphVar2 = null;
            }
            dnphVar2.c.E.clear();
        }
        if (this.ag != null) {
            dnky dnkyVarB = b();
            dnqr dnqrVar2 = this.ag;
            if (dnqrVar2 == null) {
                fdbq.c("currentAdapter");
            } else {
                dnqrVar = dnqrVar2;
            }
            dnkyVarB.d(dnqrVar);
        }
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        dnph dnphVar = this.aq;
        if (dnphVar != null) {
            bo(dnphVar.c);
            bl();
        }
        if (this.c == null || !r().isShowing()) {
            return;
        }
        r().a();
    }

    public final dnqy p() {
        dnqy dnqyVar = this.d;
        if (dnqyVar != null) {
            return dnqyVar;
        }
        fdbq.c("galleryAdapter");
        return null;
    }

    public final dnqz q() {
        dnqz dnqzVar = this.e;
        if (dnqzVar != null) {
            return dnqzVar;
        }
        fdbq.c("searchAdapter");
        return null;
    }

    public final dnth r() {
        dnth dnthVar = this.c;
        if (dnthVar != null) {
            return dnthVar;
        }
        fdbq.c("variantMenu");
        return null;
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        dnph dnphVar = this.aq;
        if (dnphVar != null) {
            return dpvu.a(dnphVar.a);
        }
        return null;
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.at;
    }
}
