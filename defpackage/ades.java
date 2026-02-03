package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ades extends fdcy {
    final /* synthetic */ adfc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ades(adfc adfcVar) {
        super(null);
        this.a = adfcVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        ViewGroup viewGroupA;
        adel adelVar = (adel) obj2;
        adel adelVar2 = (adel) obj;
        if (adelVar2 != null && (viewGroupA = this.a.a()) != null) {
            viewGroupA.removeView(adelVar2.c().f);
        }
        if (adelVar != null) {
            adfc adfcVar = this.a;
            ea eaVar = adfcVar.c;
            final LayoutInflater layoutInflaterFrom = LayoutInflater.from(eaVar.fg());
            layoutInflaterFrom.getClass();
            final ViewGroup viewGroupA2 = adfcVar.a();
            final boolean z = false;
            if (((Boolean) ujw.e.e()).booleanValue() && ((Boolean) ujw.i.e()).booleanValue()) {
                z = true;
            }
            adeo adeoVarC = adelVar.a != null ? adelVar.c() : adelVar.a(layoutInflaterFrom, viewGroupA2, z, new fdap() { // from class: adeg
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) throws Resources.NotFoundException {
                    ViewGroup viewGroup;
                    adeo adeoVar = (adeo) obj3;
                    adeoVar.getClass();
                    Context context = layoutInflaterFrom.getContext();
                    context.getClass();
                    TextView textView = adeoVar.i;
                    textView.setText(adel.f(context, R.string.google_photos_onboarding_text_body, R.string.google_photos_onboarding_text_body_photos_and_videos_xms));
                    if (!z && (viewGroup = viewGroupA2) != null && viewGroup.getResources().getConfiguration().orientation == 1) {
                        adfl.a(adeoVar.h);
                        adfl.a(textView);
                    }
                    return fctx.a;
                }
            });
            adeoVarC.getClass();
            adelVar.a = adeoVarC;
            if (viewGroupA2 != null) {
                viewGroupA2.addView(adelVar.c().f);
            }
            adelVar.b = adfcVar.h;
            adelVar.d(adfv.a);
            adelVar.c().g.setOnClickListener(new adet(adelVar, adfcVar));
            if (adelVar instanceof adek) {
                adek adekVar = (adek) adelVar;
                ((aden) adekVar.c()).a.setOnClickListener(new adeu(adfcVar, adelVar));
                ((aden) adekVar.c()).b.setOnClickListener(new adew(adelVar, adfcVar));
            } else if (adelVar instanceof adeh) {
                adeh adehVar = (adeh) adelVar;
                ((aden) adehVar.c()).a.setOnClickListener(new adex(adfcVar, adelVar));
                ((aden) adehVar.c()).b.setOnClickListener(new adez(adelVar, adfcVar));
            } else {
                if (!(adelVar instanceof adej)) {
                    throw new fctg();
                }
                ((adem) ((adej) adelVar).c()).a.setOnClickListener(new adfa(adelVar, adfcVar));
                auvw.k(lvk.a(eaVar), null, null, new adfb(adfcVar, adelVar, null), 3);
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
