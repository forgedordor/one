package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypp {
    public static dypt a(final dyau dyauVar, final dxxj dxxjVar, Context context) {
        String str;
        View.OnClickListener onClickListener;
        if (!dypn.a(context)) {
            return null;
        }
        dypq dypqVar = new dypq();
        dypqVar.a(R.id.og_ai_not_set);
        dypqVar.c = -1;
        dypqVar.h = (byte) (dypqVar.h | 2);
        dypqVar.b(-1);
        dypqVar.a(R.id.og_ai_add_another_account);
        Drawable drawableA = ku.a(context, R.drawable.quantum_gm_ic_person_add_vd_theme_24);
        drawableA.getClass();
        dypqVar.b = drawableA;
        String string = context.getString(R.string.og_add_another_account);
        if (string == null) {
            throw new NullPointerException("Null label");
        }
        dypqVar.d = string;
        dypqVar.f = new View.OnClickListener() { // from class: dypo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxxjVar.a(view, dyauVar.a());
            }
        };
        dypqVar.b(90141);
        if ((dypqVar.h & 1) == 0) {
            throw new IllegalStateException("Property \"id\" has not been set");
        }
        ejwl.m(dypqVar.a != R.id.og_ai_not_set, "Did you forget to setId()?");
        if ((dypqVar.h & 4) == 0) {
            throw new IllegalStateException("Property \"veId\" has not been set");
        }
        ejwl.m(dypqVar.e != -1, "Did you forget to setVeId()?");
        if ((dypqVar.h & 2) == 0) {
            throw new IllegalStateException("Property \"iconResId\" has not been set");
        }
        int i = dypqVar.c;
        ejwl.m((i != -1) ^ (dypqVar.b != null), "Either icon id or icon drawable must be specified");
        if (dypqVar.h == 7 && (str = dypqVar.d) != null && (onClickListener = dypqVar.f) != null) {
            return new dypr(dypqVar.a, dypqVar.b, dypqVar.c, str, dypqVar.e, onClickListener, dypqVar.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & dypqVar.h) == 0) {
            sb.append(" id");
        }
        if ((dypqVar.h & 2) == 0) {
            sb.append(" iconResId");
        }
        if (dypqVar.d == null) {
            sb.append(" label");
        }
        if ((dypqVar.h & 4) == 0) {
            sb.append(" veId");
        }
        if (dypqVar.f == null) {
            sb.append(" onClickListener");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
