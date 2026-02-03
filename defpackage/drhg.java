package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drhg {
    public final drhf a;
    public View b;
    public Context c;
    public drih d;
    public drhq e;
    public etdh f;
    public erxe g;
    public drgv h;
    public boolean j;
    public dria k;
    public String l;
    public boolean i = false;
    public boolean m = false;
    public boolean n = false;

    public drhg(drhf drhfVar) {
        this.a = drhfVar;
    }

    public static final void e(View view, String str) {
        ((TextView) view.findViewById(R.id.hats_lib_prompt_title_text)).setText(str);
    }

    public final void a() throws Resources.NotFoundException {
        int i;
        if (!this.n) {
            drgv drgvVar = this.h;
            Dialog dialog = drgvVar.b;
            boolean z = drgvVar.d;
            if (z) {
                i = -1;
            } else {
                drih drihVar = drgvVar.c;
                Context context = drihVar.a;
                if (drij.a(context).x < drihVar.b) {
                    i = drij.a(context).x;
                } else {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.hats_lib_prompt_max_width);
                    int iA = drihVar.a();
                    i = iA + iA + dimensionPixelSize;
                }
            }
            CardView cardView = drgvVar.a;
            cardView.d(z ? drgvVar.a().getDimension(R.dimen.hats_lib_prompt_banner_elevation_sheet) : drgvVar.a().getDimension(R.dimen.hats_lib_prompt_banner_elevation_card));
            float fGO = cardView.gO() * 1.5f;
            float fGO2 = cardView.gO();
            RectF rectFC = dialog != null ? drgvVar.c.c(z) : new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            if (dialog != null) {
                Window window = dialog.getWindow();
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.addFlags(32);
                window.clearFlags(2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.x = 0;
                attributes.y = 0;
                attributes.width = i;
                attributes.gravity = 85;
                window.setAttributes(attributes);
            }
            try {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cardView.getLayoutParams();
                marginLayoutParams.setMargins(Math.round(rectFC.left - fGO2), Math.round(rectFC.top - fGO), Math.round(rectFC.right - fGO2), Math.round(rectFC.bottom - fGO));
                drgvVar.a.setLayoutParams(marginLayoutParams);
            } catch (ClassCastException e) {
                throw new RuntimeException("HatsShowRequest.insertIntoParent can only be called with a ViewGroup whose LayoutParams extend MarginLayoutParams", e);
            }
        }
        this.n = true;
    }

    public final void b() {
        this.e.c("o");
        new drhs(this.f.h, drht.a(this.c)).a(this.e);
    }

    public final void c(Button button) {
        drij.c(this.b.findViewById(R.id.hats_lib_prompt_buttons), button, R.dimen.hats_lib_button_accessibility_padding, R.dimen.hats_lib_button_accessibility_padding);
    }
}
