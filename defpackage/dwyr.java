package defpackage;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwyr extends mj {
    public static final int d = new Random().nextInt();
    public Drawable e;
    private final boolean f;

    public dwyr(mr mrVar) {
        mb mbVar = new mb(new dwyp(mrVar));
        mbVar.a = new eoss(dvht.b().a);
        super(mbVar.a());
        this.e = null;
        this.f = true;
    }

    protected abstract wv F(ViewGroup viewGroup, int i);

    protected abstract void G(wv wvVar, int i);

    @Override // defpackage.mj
    public final void c(List list) {
        if (list == null || list.isEmpty()) {
            super.c(null);
            return;
        }
        synchronized (this) {
            if (this.f) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(null);
                list = arrayList;
            }
        }
        super.c(list);
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return b(i) == null ? d : l(i);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        if (i != d) {
            return new dwyq(F(viewGroup, i));
        }
        ImageView imageView = new ImageView(viewGroup.getContext());
        Drawable drawable = this.e;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int[] iArr = ley.a;
        imageView.setImportantForAccessibility(2);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView(imageView);
        int iA = dwyo.a(viewGroup.getContext(), 10.0f);
        linearLayout.setPadding(iA, iA, iA, iA);
        linearLayout.setLayoutParams(new wc(-1, -2));
        return new dwyq(linearLayout);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        wv wvVar2 = ((dwyq) wvVar).s;
        if (wvVar2 == null || b(i) == null) {
            return;
        }
        KeyEvent.Callback callback = wvVar2.a;
        if (callback instanceof dwyw) {
            ((dwyw) callback).c();
        }
        G(wvVar2, i);
    }

    protected int l(int i) {
        throw null;
    }
}
