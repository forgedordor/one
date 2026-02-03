package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agft implements afyw {
    private final Context a;

    public agft(Context context) {
        this.a = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        Context context = this.a;
        CharSequence text = context.getText(R.string.action_share);
        text.getClass();
        context.startActivity(Intent.createChooser(((agfs) afzvVar).a, text));
        return fctx.a;
    }
}
