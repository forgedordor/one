package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyfx extends vo implements dyhl {
    public ekgb d;
    private final Context e;
    private final dyau f;
    private final lvv g;
    private final dyqd h;
    private final dyyb i;
    private final dyhm j;
    private final lvz k;
    private final int l;
    private lvj m;
    private ekgb n;
    public final my a = new my(Integer.class, new dyft(this));
    private final dyay o = new dyfv(this);

    public dyfx(Context context, final dyau dyauVar, lvv lvvVar, dyqd dyqdVar, dyyb dyybVar, int i) {
        this.e = context;
        this.j = new dyhm(dymv.b(context), dybw.l(context) + i);
        this.f = dyauVar;
        this.g = lvvVar;
        int i2 = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        this.d = ekgbVar;
        this.h = dyqdVar;
        this.i = dyybVar;
        this.n = ekgbVar;
        this.l = i;
        this.k = new lvz() { // from class: dyfs
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ekgb ekgbVar2 = (ekgb) obj;
                ekgbVar2.getClass();
                dyfx dyfxVar = this.a;
                dyfxVar.d = ekgbVar2;
                dyfxVar.F(dyauVar.a());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void H(ekgb ekgbVar) {
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            ((dyfk) ekgbVar.get(i)).c(this.m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(Object obj) {
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVar = this.d;
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            dyfk dyfkVarA = ((dyfd) ekgbVar.get(i)).a().a(obj);
            if (dyfkVarA != null) {
                dyfkVarA.h = this.h;
                dyfkVarA.g();
                ekfwVar.h(dyfkVarA);
            }
        }
        ekgb ekgbVarG = ekfwVar.g();
        H(this.n);
        this.a.b();
        this.n = ekgbVarG;
        for (int i2 = 0; i2 < ((ekoe) ekgbVarG).c; i2++) {
            ((dyfk) ekgbVarG.get(i2)).b(this.m, new dyfw(this, i2));
        }
        p();
    }

    @Override // defpackage.dyhl
    public final int G(RecyclerView recyclerView, View view) {
        int iC = recyclerView.c(view);
        if (iC == -1) {
            return 1;
        }
        my myVar = this.a;
        ejwi ejwiVarL = l(((Integer) myVar.a(iC)).intValue());
        if (ejwiVarL.f() == dygk.ALWAYS_HIDE_DIVIDER_CARD || ejwiVarL.f() == dygk.COMMON_ACTION_CARD) {
            return 1;
        }
        if (iC <= 0 || !ejwiVarL.equals(l(((Integer) myVar.a(iC - 1)).intValue())) || !ejwiVarL.g()) {
            return 2;
        }
        int iOrdinal = ((dygk) ejwiVarL.c()).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        throw new RuntimeException(null, null);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final int dF(int i) {
        int i2;
        dyfk dyfkVar = (dyfk) this.n.get(((Integer) this.a.a(i)).intValue());
        if (dyfkVar instanceof dyfe) {
            i2 = 4;
        } else if ((dyfkVar instanceof dygi) || (dyfkVar instanceof dygf)) {
            i2 = 2;
        } else if (dyfkVar instanceof dyer) {
            i2 = 3;
        } else {
            if (!(dyfkVar instanceof dygn)) {
                throw new IllegalArgumentException("Unsupported card type");
            }
            i2 = 1;
        }
        return i2 - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.wv e(android.view.ViewGroup r7, int r8) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            r2 = 2
            r3 = 3
            int[] r0 = new int[]{r1, r2, r3, r0}
            r8 = r0[r8]
            int r0 = r8 + (-1)
            r4 = 0
            if (r8 == 0) goto L4e
            dyyb r8 = r6.i
            android.content.Context r5 = r6.e
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L27
            if (r0 == r2) goto L2d
            if (r0 != r3) goto L21
            dyff r0 = new dyff
            r0.<init>(r7, r5, r8)
            goto L32
        L21:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r4, r4)
            throw r7
        L27:
            dygg r0 = new dygg
            r0.<init>(r7, r5, r8)
            goto L32
        L2d:
            dyhi r0 = new dyhi
            r0.<init>(r7, r5, r8)
        L32:
            int r7 = r6.l
            int[] r8 = defpackage.ley.a
            com.google.android.libraries.onegoogle.accountmenu.cards.DynamicCardRootView r8 = r0.u
            int r1 = r8.getPaddingStart()
            int r1 = r1 + r7
            int r2 = r8.getPaddingTop()
            int r3 = r8.getPaddingEnd()
            int r3 = r3 + r7
            int r7 = r8.getPaddingBottom()
            r8.setPaddingRelative(r1, r2, r3, r7)
            return r0
        L4e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyfx.e(android.view.ViewGroup, int):wv");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final /* synthetic */ void g(wv wvVar, int i) {
        dyfr dyfrVar = (dyfr) wvVar;
        dyfrVar.H(this.m, (dyfk) this.n.get(((Integer) this.a.a(i)).intValue()));
        Integer num = (Integer) dyfrVar.a.getTag(R.id.og_card_highlight_id_tag);
        if (num != null) {
            num.intValue();
        }
    }

    @Override // defpackage.vo
    public final void gI(RecyclerView recyclerView) {
        recyclerView.v(this.j);
        this.m = fr.f(recyclerView);
        dyau dyauVar = this.f;
        dyay dyayVar = this.o;
        dyauVar.c(dyayVar);
        dyayVar.b(dyauVar.a());
        this.g.f(this.m, this.k);
    }

    @Override // defpackage.vo
    public final void h(RecyclerView recyclerView) {
        this.f.d(this.o);
        recyclerView.ad(this.j);
        this.g.k(this.k);
        H(this.n);
        this.a.b();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void k(wv wvVar) {
        ((dyfr) wvVar).E(this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ejwi l(int i) {
        dyfk dyfkVar = (dyfk) this.n.get(i);
        return dyfkVar instanceof dygn ? ((dygn) dyfkVar).x : ejud.a;
    }
}
