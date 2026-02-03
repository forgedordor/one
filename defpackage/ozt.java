package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozt extends vo implements oyz {
    public List a;
    private final PreferenceGroup d;
    private List e;
    private final List f;
    private final Runnable h = new ozq(this);
    private final Handler g = new Handler(Looper.getMainLooper());

    public ozt(PreferenceGroup preferenceGroup) {
        this.d = preferenceGroup;
        preferenceGroup.C = this;
        this.e = new ArrayList();
        this.a = new ArrayList();
        this.f = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            B(((PreferenceScreen) preferenceGroup).e);
        } else {
            B(true);
        }
        F();
    }

    private final List G(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            Preference preferenceO = preferenceGroup.o(i2);
            if (preferenceO.w) {
                if (!I(preferenceGroup) || i < preferenceGroup.d) {
                    arrayList.add(preferenceO);
                } else {
                    arrayList2.add(preferenceO);
                }
                if (preferenceO instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                    if (!preferenceGroup2.ad()) {
                        continue;
                    } else {
                        if (I(preferenceGroup) && I(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : G(preferenceGroup2)) {
                            if (!I(preferenceGroup) || i < preferenceGroup.d) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (I(preferenceGroup) && i > preferenceGroup.d) {
            oym oymVar = new oym(preferenceGroup.j, arrayList2, preferenceGroup.eT());
            oymVar.o = new ozr(this, preferenceGroup);
            arrayList.add(oymVar);
        }
        return arrayList;
    }

    private final void H(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceO = preferenceGroup.o(i);
            list.add(preferenceO);
            ozs ozsVar = new ozs(preferenceO);
            List list2 = this.f;
            if (!list2.contains(ozsVar)) {
                list2.add(ozsVar);
            }
            if (preferenceO instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                if (preferenceGroup2.ad()) {
                    H(list, preferenceGroup2);
                }
            }
            preferenceO.C = this;
        }
    }

    private static final boolean I(PreferenceGroup preferenceGroup) {
        return preferenceGroup.d != Integer.MAX_VALUE;
    }

    final void F() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).C = null;
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        this.e = arrayList;
        PreferenceGroup preferenceGroup = this.d;
        H(arrayList, preferenceGroup);
        this.a = G(preferenceGroup);
        ozy ozyVar = preferenceGroup.k;
        p();
        for (Preference preference : this.e) {
        }
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.oyz
    public final void b() {
        Handler handler = this.g;
        Runnable runnable = this.h;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        ozs ozsVar = new ozs(l(i));
        List list = this.f;
        int iIndexOf = list.indexOf(ozsVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = list.size();
        list.add(ozsVar);
        return size;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        ozs ozsVar = (ozs) this.f.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, pac.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = ku.a(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(ozsVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = ozsVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new pab(viewInflate);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        pab pabVar = (pab) wvVar;
        View view = pabVar.a;
        Preference preferenceL = l(i);
        Drawable background = view.getBackground();
        Drawable drawable = pabVar.s;
        if (background != drawable) {
            view.setBackground(drawable);
        }
        TextView textView = (TextView) pabVar.C(R.id.title);
        if (textView != null && pabVar.t != null && !textView.getTextColors().equals(pabVar.t)) {
            textView.setTextColor(pabVar.t);
        }
        preferenceL.a(pabVar);
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        if (this.b) {
            return l(i).eT();
        }
        return -1L;
    }

    public final Preference l(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.a.get(i);
    }
}
