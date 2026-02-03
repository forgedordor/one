package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aofa {
    public static final SelfIdentityId a(String str, axcm axcmVar) {
        str.getClass();
        return new SelfIdentityIdImpl(str, Optional.of(axcmVar));
    }

    public static final SelfIdentityId b(String str) {
        str.getClass();
        return new SelfIdentityIdImpl(str, null, 2, null);
    }

    public static final SelfIdentityId c(String str) {
        if (str == null) {
            return null;
        }
        return b(str);
    }
}
