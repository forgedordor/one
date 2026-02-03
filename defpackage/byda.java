package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class byda {
    public static long a(MessageCoreData messageCoreData, brdu brduVar, cqce cqceVar) {
        long jO = messageCoreData.o();
        try {
            return brduVar.c();
        } catch (RuntimeException e) {
            cqceVar.s("receivedTimestamp not in builder, using existing receivedTimestamp", e);
            return jO;
        }
    }
}
