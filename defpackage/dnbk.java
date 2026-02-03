package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbk extends ova {
    private final doma d;
    private final fdae e;
    private final fdap f;
    private final dmys g;
    private final dngn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnbk(doma domaVar, mr mrVar, fdae fdaeVar, fdap fdapVar, dmys dmysVar) {
        super(mrVar, fdzb.a, fdkq.a);
        fdjq fdjqVar = fdkq.a;
        this.d = domaVar;
        this.e = fdaeVar;
        this.f = fdapVar;
        this.g = dmysVar;
        this.h = new dngn(new dnbj(dmysVar.b()), new fdap() { // from class: dnbi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fctc fctcVar = dofn.a;
                dofn dofnVarA = dofm.a();
                if (true == zBooleanValue) {
                    dofnVarA = null;
                }
                return new dons(dofnVarA, (ImageView.ScaleType) null, 6);
            }
        });
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return i == 0 ? 4 : 5;
    }

    @Override // defpackage.vo
    public final /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.local_media_item, viewGroup, false);
        dons donsVar = (dons) this.h.a();
        doma domaVar = this.d;
        Activity activity = (Activity) domaVar.a.b();
        activity.getClass();
        donx donxVar = (donx) domaVar.b.b();
        Optional optional = (Optional) ((eyig) domaVar.c).a;
        dngc dngcVar = (dngc) domaVar.d.b();
        dngcVar.getClass();
        fdjx fdjxVar = (fdjx) domaVar.e.b();
        fdjxVar.getClass();
        viewInflate.getClass();
        donsVar.getClass();
        return new dolz(activity, donxVar, optional, dngcVar, fdjxVar, viewInflate, donsVar);
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [fdvc, java.lang.Object] */
    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) throws Resources.NotFoundException {
        Object objC;
        Object objC2;
        Object objD;
        Object objC3;
        String string;
        dolz dolzVar = (dolz) wvVar;
        dolzVar.getClass();
        oog oogVar = ((ova) this).a;
        try {
            fduf fdufVar = oogVar.d;
            do {
                objC2 = fdufVar.c();
                ((Boolean) objC2).booleanValue();
            } while (!fdufVar.g(objC2, true));
            oogVar.e = i;
            owg owgVar = (owg) oogVar.f.get();
            if (owgVar == null) {
                objD = oogVar.g.d(i);
            } else {
                if (i < 0 || i >= owgVar.f()) {
                    throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + owgVar.f());
                }
                int iE = i - owgVar.e();
                objD = (iE < 0 || iE >= owgVar.a()) ? null : owgVar.i(iE);
            }
            fduf fdufVar2 = oogVar.d;
            do {
                objC3 = fdufVar2.c();
                ((Boolean) objC3).booleanValue();
            } while (!fdufVar2.g(objC3, false));
            if (objD == null) {
                throw new IllegalStateException(a.g(i, "No item for bind position "));
            }
            dojv dojvVar = (dojv) objD;
            List list = (List) this.e.invoke().c();
            list.getClass();
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (dlth.a((dlti) it.next(), dojvVar)) {
                    break;
                } else {
                    i2++;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
            Resources resources = dolzVar.a.getContext().getResources();
            String string2 = resources.getString(dojvVar.l().b().a());
            string2.getClass();
            if (num == null) {
                string = resources.getString(R.string.gallery_item_content_description_unselected_state, string2, dngk.a(dojvVar.c()));
                string.getClass();
            } else {
                string = resources.getString(R.string.gallery_item_content_description_selected_state, string2, Integer.valueOf(num.intValue() + 1));
                string.getClass();
            }
            String str = string;
            dons donsVar = (dons) this.h.a();
            donsVar.getClass();
            dolzVar.x = donsVar;
            donr.G(dolzVar, dojvVar, this.f, null, num, str, 100);
            Size sizeA = this.g.a(dF(i));
            int width = sizeA != null ? sizeA.getWidth() : -1;
            int height = sizeA != null ? sizeA.getHeight() : -2;
            View view = dolzVar.a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = width;
            layoutParams.height = height;
            view.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            fduf fdufVar3 = oogVar.d;
            do {
                objC = fdufVar3.c();
                ((Boolean) objC).booleanValue();
            } while (!fdufVar3.g(objC, false));
            throw th;
        }
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void k(wv wvVar) {
        dolz dolzVar = (dolz) wvVar;
        dolzVar.getClass();
        View view = dolzVar.a;
        view.setContentDescription(null);
        dolzVar.u.a = false;
        if (dolzVar.x.c) {
            view.setOnTouchListener(null);
        }
        if (((donr) dolzVar).t.isDestroyed()) {
            return;
        }
        Context context = dolzVar.y;
        raw.c(context).k(dolzVar.v);
    }
}
