package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvja extends vo {
    public final vo a;
    public int d;

    public cvja(vo voVar, int i) {
        this.a = voVar;
        this.d = i;
    }

    @Override // defpackage.vo
    public final void A(vq vqVar) {
        this.a.A(vqVar);
    }

    @Override // defpackage.vo
    public final void C(vq vqVar) {
        this.a.C(vqVar);
    }

    @Override // defpackage.vo
    public final int a() {
        return Math.min(this.d, this.a.a());
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return this.a.dF(i);
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        return this.a.e(viewGroup, i);
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        this.a.g(wvVar, i);
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return this.a.gH(i);
    }

    @Override // defpackage.vo
    public final void gI(RecyclerView recyclerView) {
        this.a.gI(recyclerView);
    }

    @Override // defpackage.vo
    public final void h(RecyclerView recyclerView) {
        this.a.h(recyclerView);
    }

    @Override // defpackage.vo
    public final void i(wv wvVar) {
        this.a.i(wvVar);
    }

    @Override // defpackage.vo
    public final void j(wv wvVar) {
        this.a.j(wvVar);
    }

    @Override // defpackage.vo
    public final void k(wv wvVar) {
        this.a.k(wvVar);
    }

    @Override // defpackage.vo
    public final void m(wv wvVar) {
        this.a.m(wvVar);
    }

    @Override // defpackage.vo
    public final void z(wv wvVar, int i, List list) {
        this.a.z(wvVar, i, list);
    }
}
