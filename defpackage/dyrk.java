package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.onegoogle.actions.SimpleActionView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyrk extends vo {
    private final Context a;
    private final ekgb d;
    private final dyyb e;
    private final int f;

    public dyrk(Context context, ekgb ekgbVar, dyyb dyybVar, int i) {
        context.getClass();
        this.a = context;
        this.d = ekgbVar;
        this.e = dyybVar;
        this.f = i;
    }

    @Override // defpackage.vo
    public final int a() {
        return ((ekoe) this.d).c;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        dypv dypvVar = new dypv(this.a, this.e, viewGroup);
        View view = dypvVar.a;
        int[] iArr = ley.a;
        int paddingStart = view.getPaddingStart();
        int i2 = this.f;
        view.setPaddingRelative(paddingStart + i2, view.getPaddingTop(), view.getPaddingEnd() + i2, view.getPaddingBottom());
        return dypvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        final dypv dypvVar = (dypv) wvVar;
        final dypt dyptVar = (dypt) this.d.get(i);
        SimpleActionView simpleActionView = dypvVar.w;
        simpleActionView.a = ejwi.j(Integer.valueOf(dyptVar.c()));
        simpleActionView.b(dypvVar.v);
        if (dyptVar.d() != null) {
            ImageView imageView = dypvVar.s;
            Drawable drawableD = dyptVar.d();
            dyqw.c(drawableD, dypvVar.u);
            imageView.setImageDrawable(drawableD);
        } else {
            ImageView imageView2 = dypvVar.s;
            imageView2.setImageDrawable(dyqw.a(imageView2.getContext(), dyptVar.a(), dypvVar.u));
        }
        dypvVar.t.setText(dyptVar.g());
        dypvVar.a.setOnClickListener(new View.OnClickListener() { // from class: dypu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dypvVar.v.f(new dsve(5), view);
                dyptVar.e().onClick(view);
            }
        });
    }

    @Override // defpackage.vo
    public final /* synthetic */ void k(wv wvVar) {
        dypv dypvVar = (dypv) wvVar;
        SimpleActionView simpleActionView = dypvVar.w;
        simpleActionView.gW(dypvVar.v);
        simpleActionView.a = ejud.a;
    }
}
