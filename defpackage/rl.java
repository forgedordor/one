package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rl implements DialogInterface.OnClickListener, rt {
    iv a;
    final /* synthetic */ ru b;
    private ListAdapter c;
    private CharSequence d;

    public rl(ru ruVar) {
        this.b = ruVar;
    }

    @Override // defpackage.rt
    public final int a() {
        return 0;
    }

    @Override // defpackage.rt
    public final int b() {
        return 0;
    }

    @Override // defpackage.rt
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.rt
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.rt
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.rt
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rt
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rt
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rt
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.rt
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rt
    public final void k(int i, int i2) {
        if (this.c == null) {
            return;
        }
        ru ruVar = this.b;
        iu iuVar = new iu(ruVar.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            iuVar.setTitle(charSequence);
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = ruVar.getSelectedItemPosition();
        ir irVar = iuVar.a;
        irVar.s = listAdapter;
        irVar.t = this;
        irVar.y = selectedItemPosition;
        irVar.x = true;
        iv ivVarCreate = iuVar.create();
        this.a = ivVarCreate;
        ListView listViewD = ivVarCreate.d();
        listViewD.setTextDirection(i);
        listViewD.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.rt
    public final void m() {
        iv ivVar = this.a;
        if (ivVar != null) {
            ivVar.dismiss();
            this.a = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ru ruVar = this.b;
        ruVar.setSelection(i);
        if (ruVar.getOnItemClickListener() != null) {
            ruVar.performItemClick(null, i, this.c.getItemId(i));
        }
        m();
    }

    @Override // defpackage.rt
    public final boolean x() {
        iv ivVar = this.a;
        if (ivVar != null) {
            return ivVar.isShowing();
        }
        return false;
    }
}
