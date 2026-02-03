package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eedo {
    public static void a(eedk eedkVar, View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        eedkVar.setBounds(rect);
        eedkVar.f(view, null);
    }
}
