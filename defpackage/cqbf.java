package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqbf extends HashSet {
    public cqbf() {
    }

    public final ConversationIdType a() {
        return (ConversationIdType) iterator().next();
    }

    public final String b() {
        return TextUtils.join("|", this);
    }

    public cqbf(Collection collection) {
        super(collection);
    }
}
