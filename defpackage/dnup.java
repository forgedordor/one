package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnup extends adx {
    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        dnuq dnuqVar = (dnuq) obj;
        dnuqVar.getClass();
        Intent intent = new Intent();
        intent.setAction("com.google.chat.smartmessaging.penpal.EMOTIFY");
        intent.putExtra("image_uri", dnuqVar.a);
        intent.putExtra("small_segment_ratio", dnuqVar.b);
        intent.putExtra("enable_edge_to_edge", dnuqVar.c);
        return intent;
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (intent != null) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Uri) intent.getParcelableExtra("resultKey");
            }
        }
        return null;
    }
}
