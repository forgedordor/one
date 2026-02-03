package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface cdej {
    public static final cczv a = cdag.h(cdag.b, "enable_federated_analytics_logging", false);
    public static final cczv b = cdag.h(cdag.b, "enable_federated_analytics_suggestion_text_logging", false);
    public static final cczv c = cdag.f(cdag.b, "federated_analytics_logging_events_ttl_millis", TimeUnit.DAYS.toMillis(7));

    eiju a(emig emigVar, eyzv eyzvVar, int i, List list, int i2, MessageIdType messageIdType);

    eiju b(emig emigVar, elny elnyVar, int i, List list, MessageIdType messageIdType);

    eiju c(emig emigVar, int i, List list, ezac ezacVar, String str);

    eiju d(emig emigVar, elny elnyVar, int i, List list, MessageIdType messageIdType);
}
