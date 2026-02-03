package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addl {
    public final cpch a;
    public final eigp b;
    public Context c;
    public final CharSequence[] d;
    public int e;
    public iv f;

    public addl(cpch cpchVar, Context context, eigp eigpVar) {
        this.c = context;
        this.a = cpchVar;
        this.b = eigpVar;
        this.d = new CharSequence[]{context.getString(R.string.theme_setting_dialog_options_light_mode), context.getString(R.string.theme_setting_dialog_options_dark_mode), context.getString(R.string.theme_setting_dialog_options_system_default_mode)};
        int iA = cpchVar.a();
        this.e = iA != 1 ? iA != 2 ? 2 : 1 : 0;
    }
}
