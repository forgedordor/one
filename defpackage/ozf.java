package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ozf extends dn implements DialogInterface.OnClickListener {
    private DialogPreference ag;
    private CharSequence ah;
    private CharSequence ai;
    private CharSequence aj;
    public int ak;
    private CharSequence al;
    private int am;
    private BitmapDrawable an;

    protected void aV(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.al;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void aW(boolean z);

    protected boolean aZ() {
        return false;
    }

    public final DialogPreference ba() {
        if (this.ag == null) {
            this.ag = (DialogPreference) ((oyf) E()).a(C().getString("key"));
        }
        return this.ag;
    }

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        this.ak = -2;
        iu iuVar = new iu(A());
        iuVar.setTitle(this.ah);
        iuVar.b(this.an);
        iuVar.g(this.ai, this);
        iuVar.f(this.aj, this);
        A();
        int i = this.am;
        View viewInflate = i != 0 ? K().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            aV(viewInflate);
            iuVar.setView(viewInflate);
        } else {
            iuVar.c(this.al);
        }
        eU(iuVar);
        iv ivVarCreate = iuVar.create();
        if (aZ()) {
            Window window = ivVarCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
                return ivVarCreate;
            }
            aX();
        }
        return ivVarCreate;
    }

    @Override // defpackage.dn, defpackage.ea
    public void h(Bundle bundle) {
        super.h(bundle);
        lvj lvjVarE = E();
        if (!(lvjVarE instanceof oyf)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        oyf oyfVar = (oyf) lvjVarE;
        String string = C().getString("key");
        if (bundle != null) {
            this.ah = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.ai = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.aj = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.al = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.am = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.an = new BitmapDrawable(B(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) oyfVar.a(string);
        this.ag = dialogPreference;
        this.ah = dialogPreference.a;
        this.ai = dialogPreference.d;
        this.aj = dialogPreference.e;
        this.al = dialogPreference.b;
        this.am = dialogPreference.f;
        Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.an = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.an = new BitmapDrawable(B(), bitmapCreateBitmap);
    }

    @Override // defpackage.dn, defpackage.ea
    public void k(Bundle bundle) {
        super.k(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ah);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ai);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.aj);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.al);
        bundle.putInt("PreferenceDialogFragment.layout", this.am);
        BitmapDrawable bitmapDrawable = this.an;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.ak = i;
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        aW(this.ak == -1);
    }

    protected void aX() {
    }

    protected void eU(iu iuVar) {
    }
}
