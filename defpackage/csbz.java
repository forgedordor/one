package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csbz extends ContentObserver {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ SelfIdentityId b;
    final /* synthetic */ String c;
    final /* synthetic */ csca d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csbz(csca cscaVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        super(null);
        this.a = conversationIdType;
        this.b = selfIdentityId;
        this.c = str;
        this.d = cscaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        csca cscaVar = this.d;
        synchronized (cscaVar.i) {
            if (cscaVar.f.f().toEpochMilli() - cscaVar.k >= TimeUnit.SECONDS.toMillis(((Integer) csca.a.e()).intValue())) {
                cscaVar.a(this);
                return;
            }
            if (uri != null && uri.getPathSegments().size() == bace.g(cscaVar.d).getPathSegments().size() + 2) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    return;
                }
                MessageCoreData messageCoreDataW = ((baxe) cscaVar.c.b()).w(bary.b(lastPathSegment));
                if (messageCoreDataW != null && messageCoreDataW.cK()) {
                    String strAs = messageCoreDataW.as();
                    if (strAs != null && cscaVar.l.matcher(strAs).find()) {
                        cscaVar.e.d(cscaVar.h.f(this.a, this.b, this.c), false, bvdk.SPAM_FOLDER).s();
                        if (!((Boolean) csca.b.e()).booleanValue()) {
                            cscaVar.g.c("Bugle.Spam.AutoReply.Counts");
                        }
                        cscaVar.a(this);
                        return;
                    }
                    cscaVar.a(this);
                }
            }
        }
    }
}
