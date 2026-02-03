package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.wearable.Asset;
import j$.util.Optional;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszv implements bajb {
    public final denz a;

    public cszv(denz denzVar) {
        this.a = denzVar;
        new HashMap();
    }

    @Override // defpackage.bajb
    public final boolean A() {
        throw null;
    }

    @Override // defpackage.bajb
    public final boolean B() {
        throw null;
    }

    public final ConversationIdType a() {
        return barn.b(cszr.a(this.a, "1"));
    }

    @Override // defpackage.bajb
    public final int b() {
        throw null;
    }

    public final void c(String str, Asset asset) {
        this.a.g("27".concat(String.valueOf(str)), asset);
    }

    public final void d(ConversationIdType conversationIdType) {
        this.a.n("1", conversationIdType.a());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cszv) {
            return this.a.equals(((cszv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bajb
    public final Optional k() {
        throw null;
    }

    @Override // defpackage.bajb
    public final String o() {
        throw null;
    }

    @Override // defpackage.bajb
    public final String q() {
        throw null;
    }

    @Override // defpackage.bajb
    public final boolean y() {
        throw null;
    }
}
