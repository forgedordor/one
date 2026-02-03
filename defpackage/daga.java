package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daga {
    public final eg a;
    public final aijh b;
    public final fcsu c;
    public final int d;
    private final avmp e;
    private final tlt f;

    public daga(eg egVar, aijh aijhVar, avmp avmpVar, fcsu fcsuVar, tlt tltVar, int i) {
        this.a = egVar;
        this.b = aijhVar;
        this.e = avmpVar;
        this.c = fcsuVar;
        this.f = tltVar;
        this.d = i;
    }

    public final void a(String str, int i) {
        ((dabm) this.c.b()).a("Bugle.Search.Result.Copy.Clicked", this.d);
        eg egVar = this.a;
        ((ClipboardManager) egVar.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, str));
        if (Build.VERSION.SDK_INT <= 32) {
            Toast.makeText(egVar, egVar.getResources().getText(i), 0).show();
        }
    }

    public final void b(ConversationId conversationId, MessageIdType messageIdType) {
        ((dabm) this.c.b()).h(this.d);
        if (this.f.a) {
            this.e.u(this.a, conversationId, messageIdType, null);
        } else {
            this.e.w(this.a, conversationId, messageIdType, null, new batr(null), null, null, null);
        }
    }

    public final void c(String str) {
        ((dabm) this.c.b()).a("Bugle.Search.Result.Share.Clicked", this.d);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        eg egVar = this.a;
        egVar.startActivity(Intent.createChooser(intent, egVar.getResources().getText(R.string.action_share)));
    }
}
