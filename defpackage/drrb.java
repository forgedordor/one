package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drrb extends vo {
    public drrc a;
    public int d = -1;
    public final drqf e;
    private final ekgb f;
    private final ekgb g;
    private final LayoutInflater h;
    private final Context i;
    private final drjt j;
    private final int k;

    public drrb(Context context, ejwm ejwmVar, drqf drqfVar, ekgb ekgbVar, int i) throws Resources.NotFoundException {
        this.i = context;
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(R.array.emoji_categories_icons);
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
            ejwmVar.a(Integer.valueOf(i3));
            ekfwVar.h(Integer.valueOf(typedArrayObtainTypedArray.getResourceId(i3, 0)));
        }
        typedArrayObtainTypedArray.recycle();
        ekoe ekoeVar = (ekoe) ekgbVar;
        int i4 = ekoeVar.c;
        for (int i5 = 0; i5 < i4; i5++) {
            ekfwVar.h(Integer.valueOf(((droy) ekgbVar.get(i5)).a()));
        }
        this.f = ekfwVar.g();
        TypedArray typedArrayObtainTypedArray2 = context.getResources().obtainTypedArray(R.array.emoji_categories_content_desc);
        ekfw ekfwVar2 = new ekfw();
        for (int i6 = 0; i6 < typedArrayObtainTypedArray2.length(); i6++) {
            ejwmVar.a(Integer.valueOf(i6));
            ekfwVar2.h(context.getString(typedArrayObtainTypedArray2.getResourceId(i6, 0)));
        }
        typedArrayObtainTypedArray2.recycle();
        int i7 = ekoeVar.c;
        for (int i8 = 0; i8 < i7; i8++) {
            ekfwVar2.h(((droy) ekgbVar.get(i8)).b());
        }
        this.g = ekfwVar2.g();
        ekfw ekfwVar3 = new ekfw();
        int[] iArr = drmh.b;
        for (int i9 = 0; i9 < 10; i9++) {
            ejwmVar.a(Integer.valueOf(i9));
            ekfwVar3.h(context.getString(iArr[i9]));
        }
        int i10 = ekoeVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            ekfwVar3.h(((droy) ekgbVar.get(i11)).c());
        }
        ekfwVar3.g();
        this.e = drqfVar;
        this.j = drjt.a(context);
        this.k = i;
        this.a = new drqz();
        this.h = LayoutInflater.from(context);
    }

    @Override // defpackage.vo
    public final int a() {
        return ((ekoe) this.f).c;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new drra(this.h.inflate(1 != this.k ? R.layout.header_icon_text_holder : R.layout.header_icon_holder, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void k(wv wvVar) {
        drra drraVar = (drra) wvVar;
        drraVar.a.setOnClickListener(null);
        ImageView imageView = drraVar.u;
        imageView.setImageDrawable(null);
        imageView.setContentDescription(null);
        TextView textView = drraVar.t;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        drraVar.C(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void g(drra drraVar, final int i) {
        View view = drraVar.a;
        view.setOnClickListener(new View.OnClickListener() { // from class: drqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.e.a.e(i, 3);
            }
        });
        ImageView imageView = drraVar.u;
        imageView.setImageDrawable(this.i.getDrawable(((Integer) this.f.get(i)).intValue()));
        ekgb ekgbVar = this.g;
        drjt.e(imageView, (CharSequence) ekgbVar.get(i));
        TextView textView = drraVar.t;
        if (textView != null) {
            textView.setText((CharSequence) ekgbVar.get(i));
        }
        drrc drrcVar = this.a;
        View view2 = drraVar.s;
        drrcVar.a(view, imageView, view2, i == this.d);
        boolean z = i == this.d;
        this.a.a(view, imageView, view2, z);
        if (z) {
            this.j.c(imageView.getContentDescription());
        }
        drraVar.C(z);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void z(wv wvVar, int i, List list) {
        drra drraVar = (drra) wvVar;
        View view = drraVar.a;
        View viewFindViewById = view.findViewById(R.id.emoji_picker_header_underline);
        ImageView imageView = (ImageView) view.findViewById(R.id.emoji_picker_header_icon);
        for (Object obj : list) {
            if (obj instanceof Boolean) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.a.a(view, imageView, viewFindViewById, zBooleanValue);
                drraVar.C(zBooleanValue);
                return;
            }
        }
        g(drraVar, i);
    }
}
