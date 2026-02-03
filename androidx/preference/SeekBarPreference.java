package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.pab;
import defpackage.pac;
import defpackage.pad;
import defpackage.pae;
import defpackage.pag;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    private final boolean F;
    private final SeekBar.OnSeekBarChangeListener G;
    private final View.OnKeyListener H;
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public final boolean e;
    public final boolean f;
    private int g;
    private int h;
    private TextView i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.G = new pad(this);
        this.H = new pae(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pac.k, R.attr.seekBarPreferenceStyle, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.b;
        i = i < i2 ? i2 : i;
        if (i != this.g) {
            this.g = i;
            d();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(i3));
            d();
        }
        this.e = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.F = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void o(int i, boolean z) {
        int i2 = this.b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.a) {
            this.a = i;
            l(i);
            if (V() && i != p(~i)) {
                SharedPreferences.Editor editorB = this.k.b();
                editorB.putInt(this.s, i);
                super.O(editorB);
            }
            if (z) {
                d();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        super.a(pabVar);
        pabVar.a.setOnKeyListener(this.H);
        this.d = (SeekBar) pabVar.C(R.id.seekbar);
        TextView textView = (TextView) pabVar.C(R.id.seekbar_value);
        this.i = textView;
        if (this.F) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        SeekBar seekBar = this.d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.G);
        this.d.setMax(this.g - this.b);
        int i = this.h;
        if (i != 0) {
            this.d.setKeyProgressIncrement(i);
        } else {
            this.h = this.d.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        l(this.a);
        this.d.setEnabled(T());
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable parcelableE = super.e();
        if (this.v) {
            return parcelableE;
        }
        pag pagVar = new pag(parcelableE);
        pagVar.a = this.a;
        pagVar.b = this.b;
        pagVar.c = this.g;
        return pagVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(pag.class)) {
            super.g(parcelable);
            return;
        }
        pag pagVar = (pag) parcelable;
        super.g(pagVar.getSuperState());
        this.a = pagVar.a;
        this.b = pagVar.b;
        this.g = pagVar.c;
        d();
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        o(p(((Integer) obj).intValue()), true);
    }

    public final void k(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            if (Q(Integer.valueOf(progress))) {
                o(progress, false);
            } else {
                seekBar.setProgress(this.a - this.b);
                l(this.a);
            }
        }
    }

    public final void l(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }
}
