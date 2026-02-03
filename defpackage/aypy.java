package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface aypy extends ayms {
    Action a(MessageIdType messageIdType, String str, int i, int i2);

    Action b(int i, Uri uri, Bundle bundle);

    Action d(basd basdVar, int i, long j, long j2, Duration duration);

    Action e(basd basdVar, aubl aublVar, Instant instant, boolean z, elpg elpgVar, augm augmVar, enxu enxuVar);

    Action f(baro baroVar, int i, int i2);

    Action g(MessageIdType messageIdType, Uri uri, int i, int i2, int i3, int i4, String str, Boolean bool);

    Action h(MessageIdType messageIdType, basd basdVar, Uri uri, Uri uri2, int i, int i2, int i3, int i4, enxu enxuVar, elpf elpfVar);
}
