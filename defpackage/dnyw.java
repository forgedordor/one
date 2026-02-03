package defpackage;

import android.app.Activity;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyw extends vo implements Iterable, fdcn {
    public final doim a;
    public final fdap d;
    public final fdap e;
    public List f = fcvo.a;
    public fdap g;
    private final dnxf h;
    private final dnxc i;
    private final dons j;
    private final fdae k;
    private final boolean l;

    public dnyw(dnxf dnxfVar, dnxc dnxcVar, Optional optional, dons donsVar, doim doimVar, fdae fdaeVar, fdap fdapVar, fdap fdapVar2) {
        this.h = dnxfVar;
        this.i = dnxcVar;
        this.j = donsVar;
        this.a = doimVar;
        this.k = fdaeVar;
        this.d = fdapVar;
        this.e = fdapVar2;
        this.l = ((Boolean) fdct.a(optional, false)).booleanValue();
    }

    @Override // defpackage.vo
    public final int a() {
        return this.l ? this.f.size() + 1 : this.f.size();
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return (this.l && i == 0) ? 0 : 1;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.emotify_button, viewGroup, false);
            dnxc dnxcVar = this.i;
            fdae fdaeVar = this.k;
            dnva dnvaVar = (dnva) dnxcVar.a.b();
            viewInflate.getClass();
            return new dnxb(dnvaVar, viewInflate, fdaeVar);
        }
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_sticker_list_item, viewGroup, false);
        dnxf dnxfVar = this.h;
        dons donsVar = this.j;
        Activity activity = (Activity) dnxfVar.a.b();
        activity.getClass();
        fdjx fdjxVar = (fdjx) dnxfVar.b.b();
        fdjxVar.getClass();
        donx donxVar = (donx) dnxfVar.c.b();
        dngc dngcVar = (dngc) dnxfVar.d.b();
        dngcVar.getClass();
        viewInflate2.getClass();
        return new dnxe(activity, fdjxVar, donxVar, dngcVar, viewInflate2, donsVar);
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        wvVar.getClass();
        if (!(wvVar instanceof dnxb)) {
            if (wvVar instanceof dnxe) {
                donr.H((donr) wvVar, new dnyv(this, this.l ? (dnwt) this.f.get(i - 1) : (dnwt) this.f.get(i), null), new fdap() { // from class: dnyt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dnvg dnvgVar = (dnvg) obj;
                        dnvgVar.getClass();
                        this.a.d.invoke(dnvgVar);
                        return fctx.a;
                    }
                }, new donn() { // from class: dnyu
                    @Override // defpackage.donn
                    public final boolean a(Object obj, PointF pointF) {
                        ((Boolean) this.a.e.invoke((dnvg) obj)).booleanValue();
                        return true;
                    }
                });
                return;
            }
            return;
        }
        final dnxb dnxbVar = (dnxb) wvVar;
        dnxbVar.s.a(dnxbVar.t, dnwy.c, new dnuz(0.0f, false));
        dnxbVar.a.setOnClickListener(new View.OnClickListener() { // from class: dnxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dnxbVar.s.b();
            }
        });
        fdap fdapVar = this.g;
        if (fdapVar != null) {
            fdapVar.invoke(wvVar.a);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<dnwt> iterator() {
        return this.f.iterator();
    }
}
