package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cznv extends cznz {
    public Uri a;
    public String b;
    public String c;
    public ConversationIdType d;
    public ConversationId e;
    public MessageIdType f;
    public MessageId g;
    private Uri h;
    private String i;

    public cznv() {
    }

    @Override // defpackage.cznz
    public final MediaViewerItem a() {
        String str;
        Uri uri = this.h;
        if (uri != null && (str = this.i) != null) {
            return new czny(uri, this.a, str, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == null) {
            sb.append(" uri");
        }
        if (this.i == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cznz
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.i = str;
    }

    @Override // defpackage.cznz
    public final void c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.h = uri;
    }

    public cznv(MediaViewerItem mediaViewerItem) {
        this.h = mediaViewerItem.b();
        this.a = mediaViewerItem.a();
        this.i = mediaViewerItem.h();
        this.b = mediaViewerItem.j();
        this.c = mediaViewerItem.i();
        this.d = mediaViewerItem.e();
        this.e = mediaViewerItem.d();
        this.f = mediaViewerItem.f();
        this.g = mediaViewerItem.c();
    }
}
