package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ageh implements afyw {
    private final Context a;

    public ageh(Context context) {
        this.a = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        Intent intent = new Intent();
        intent.setAction("com.google.chat.smartmessaging.penpal.PHOTOBOOTH");
        intent.putExtra("imageUri", ((ageg) afzvVar).a);
        this.a.startActivity(intent);
        return fctx.a;
    }
}
