package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yot implements dlpo {
    public final /* synthetic */ you a;
    final /* synthetic */ Uri b;
    final /* synthetic */ sxq c;
    public final /* synthetic */ MessageId d;

    public yot(you youVar, Uri uri, sxq sxqVar, MessageId messageId) {
        this.a = youVar;
        this.b = uri;
        this.c = sxqVar;
        this.d = messageId;
    }

    @Override // defpackage.dlpo
    public final void a(boolean z) {
        Uri uri = this.b;
        Boolean boolValueOf = Boolean.valueOf(z);
        you youVar = this.a;
        youVar.i.put(uri, boolValueOf);
        this.c.a(z);
        if (!z) {
            ((ains) youVar.d.b()).c("Bugle.Vmt.HideTranscript.Click.Count");
        } else {
            ((ains) youVar.d.b()).c("Bugle.Vmt.ViewTranscript.Click.Count");
            auvw.k(youVar.g, null, null, new yos(youVar, null), 3);
        }
    }
}
