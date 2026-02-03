package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawg extends vo {
    private final Context a;
    private final List d;
    private final einm e;
    private final int f;

    public aawg(Context context, List list, einm einmVar) {
        this.a = context;
        this.d = list;
        this.e = einmVar;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorOnSurfaceVariant});
        this.f = typedArrayObtainStyledAttributes.getColor(0, -16777216);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.vo
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new aawf(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.datetime_picker_preset_item, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) throws Resources.NotFoundException {
        aawi aawiVar = (aawi) this.d.get(i);
        Context context = this.a;
        String string = context.getResources().getString(aawiVar.b().h, aawiVar.c());
        Drawable drawable = context.getDrawable(aawiVar.b().g);
        drawable.setTint(this.f);
        TextView textView = ((aawf) wvVar).s;
        textView.setText(string);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.e.b(textView, new aaxl(i));
    }
}
