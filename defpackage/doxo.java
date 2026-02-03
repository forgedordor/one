package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxo extends doxb {
    public static final /* synthetic */ int ag = 0;
    public doyi a;
    private final dpxe ah;
    private final fctc ai;
    private final fctc aj;
    private final fctc ak;
    private final fctc al;
    private doxp am;
    public Optional b;
    public Optional c;
    public View d;
    public doxi e;

    public doxo() {
        super(Integer.valueOf(R.layout.shortcuts_screen));
        this.ah = dpxe.e;
        this.ai = fctd.a(new fdae() { // from class: doxe
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional = this.a.b;
                if (optional == null) {
                    fdbq.c("useUpdatedShortcutConfigurationOverride");
                    optional = null;
                }
                Boolean bool = (Boolean) fdct.a(optional, false);
                bool.booleanValue();
                return bool;
            }
        });
        this.aj = fctd.a(new fdae() { // from class: doxf
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional = this.a.c;
                if (optional == null) {
                    fdbq.c("useShortcutConfigurationFlow");
                    optional = null;
                }
                Boolean bool = (Boolean) fdct.a(optional, false);
                bool.booleanValue();
                return bool;
            }
        });
        this.ak = fctd.a(new fdae() { // from class: doxg
            @Override // defpackage.fdae
            public final Object invoke() {
                doxo doxoVar = this.a;
                return fdvf.a(doxoVar.r().a((doxc) doxoVar.bC(), doxoVar.bj()));
            }
        });
        this.al = fctd.a(new fdae() { // from class: doxh
            @Override // defpackage.fdae
            public final Object invoke() {
                doxo doxoVar = this.a;
                return doxoVar.r().a((doxc) doxoVar.bC(), doxoVar.bj());
            }
        });
    }

    public static final /* synthetic */ doxc e(doxo doxoVar) {
        return (doxc) doxoVar.bC();
    }

    public final fduf aW() {
        return (fduf) this.ak.a();
    }

    @Override // defpackage.dpxo
    protected final void aZ(final dpgl dpglVar) {
        if (bJ()) {
            doyh doyhVarF = f();
            doyhVarF.l = new fdap() { // from class: doxd
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ImageView imageView = (ImageView) obj;
                    int i = doxo.ag;
                    imageView.getClass();
                    Drawable drawable = imageView.getDrawable();
                    gda gdaVar = dpglVar.a;
                    drawable.setTint(ijg.b(gdaVar.q));
                    imageView.getBackground().setTint(ijg.b(gdaVar.p));
                    return fctx.a;
                }
            };
            doyhVarF.p();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ap(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r6.getClass()
            r5.d = r6
            android.os.Bundle r7 = r5.m
            r0 = 0
            if (r7 == 0) goto L24
            java.lang.String r1 = "auto_launch_shortcut"
            r2 = -1
            int r7 = r7.getInt(r1, r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r1 = r7.intValue()
            if (r1 != r2) goto L1c
            r7 = r0
        L1c:
            if (r7 == 0) goto L24
            doxp r1 = new doxp
            r1.<init>(r7)
            goto L25
        L24:
            r1 = r0
        L25:
            r5.am = r1
            r7 = 3
            if (r1 == 0) goto L70
            java.lang.Integer r1 = r1.a
            if (r1 == 0) goto L70
            int r1 = r1.intValue()
            dpim r2 = r5.bC()
            doxc r2 = (defpackage.doxc) r2
            java.util.List r2 = r2.a
            java.util.Iterator r2 = r2.iterator()
        L3e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r2.next()
            r4 = r3
            doxa r4 = (defpackage.doxa) r4
            int r4 = r4.a
            if (r4 != r1) goto L3e
            goto L51
        L50:
            r3 = r0
        L51:
            doxa r3 = (defpackage.doxa) r3
            if (r3 == 0) goto L62
            fdjx r1 = r5.bH()
            doxn r2 = new doxn
            r2.<init>(r5, r3, r0)
            defpackage.fdil.d(r1, r0, r0, r2, r7)
            goto L70
        L62:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Couldn't find a shortcut with label "
            java.lang.String r0 = "."
            java.lang.String r7 = defpackage.a.e(r1, r7, r0)
            r6.<init>(r7)
            throw r6
        L70:
            doxi r1 = new doxi
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r1.<init>(r6)
            r5.e = r1
            dpim r6 = r5.bC()
            doxc r6 = (defpackage.doxc) r6
            java.lang.Integer r6 = r6.b
            if (r6 == 0) goto La8
            int r6 = r6.intValue()
            doxi r1 = r5.e
            java.lang.String r2 = "views"
            if (r1 != 0) goto L91
            defpackage.fdbq.c(r2)
            r1 = r0
        L91:
            doxi r3 = r5.e
            if (r3 != 0) goto L99
            defpackage.fdbq.c(r2)
            r3 = r0
        L99:
            android.view.ViewGroup r1 = r1.a
            android.view.ViewGroup r2 = r3.a
            android.content.Context r2 = r2.getContext()
            android.graphics.drawable.Drawable r6 = defpackage.ku.a(r2, r6)
            r1.setBackground(r6)
        La8:
            fdjx r6 = r5.bH()
            doxm r1 = new doxm
            r1.<init>(r5, r0)
            defpackage.fdil.d(r6, r0, r0, r1, r7)
            boolean r6 = r5.bJ()
            if (r6 == 0) goto Lbd
            r5.bS()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doxo.ap(android.view.View, android.os.Bundle):void");
    }

    public final void bh(RecyclerView recyclerView, Size size, doxc doxcVar) {
        doyh doyhVarF = f();
        size.getClass();
        if (doyhVarF.h) {
            doyhVarF.n = doxcVar;
            doyhVarF.i = fddu.f(fddu.g(size.getWidth() / doyhVarF.l(), fddu.g(doyhVarF.n.a.size(), 7)), 1);
        } else {
            doyhVarF.i = fddu.f(fddu.g(size.getWidth() / doyhVarF.l(), doyhVarF.m), 1);
        }
        int iMax = Math.max(1, size.getWidth() / doyhVarF.i);
        fdcz fdczVar = doyhVarF.j;
        fdeh[] fdehVarArr = doyh.a;
        fdczVar.d(fdehVarArr[0], Integer.valueOf(iMax));
        Math.ceil(doyhVarF.a() / doyhVarF.i);
        doyhVarF.k.d(fdehVarArr[1], Integer.valueOf(((Number) doyhVarF.q.a()).intValue()));
        int i = f().i;
        wb wbVar = recyclerView.o;
        GridLayoutManager gridLayoutManager = wbVar instanceof GridLayoutManager ? (GridLayoutManager) wbVar : null;
        if (gridLayoutManager == null || gridLayoutManager.b != i) {
            recyclerView.getContext();
            recyclerView.ao(new GridLayoutManager(i));
        }
        if (bj() || !fdbq.f(recyclerView.n, f())) {
            recyclerView.al(f());
        }
        bL();
    }

    public final boolean bj() {
        return ((Boolean) this.aj.a()).booleanValue();
    }

    public final doyh f() {
        if (!gC() || bj()) {
            doyh doyhVar = (doyh) this.al.a();
            doyhVar.getClass();
            return doyhVar;
        }
        Object objC = aW().c();
        objC.getClass();
        return (doyh) objC;
    }

    @Override // defpackage.dpil
    public final /* bridge */ /* synthetic */ void gB(dpim dpimVar) {
        super.gB((doxc) dpimVar);
        if (bj()) {
            return;
        }
        aW().f(r().a((doxc) bC(), bj()));
    }

    @Override // defpackage.dpil
    public final boolean gC() {
        return ((Boolean) this.ai.a()).booleanValue();
    }

    public final doyi r() {
        doyi doyiVar = this.a;
        if (doyiVar != null) {
            return doyiVar;
        }
        fdbq.c("shortcutsAdapterFactory");
        return null;
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        doxi doxiVar = this.e;
        if (doxiVar != null) {
            return dpvu.a(doxiVar.b);
        }
        return null;
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.ah;
    }
}
