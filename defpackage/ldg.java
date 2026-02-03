package defpackage;

import android.content.res.ColorStateList;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldg {
    public static void a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof kzw) {
            ((kzw) menuItem).b(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void b(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof kzw) {
            ((kzw) menuItem).setIconTintList(colorStateList);
        } else {
            menuItem.setIconTintList(colorStateList);
        }
    }
}
