package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvyr implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return fcxl.a(((ResolvedRecipient) obj).y(), ((ResolvedRecipient) obj2).y());
    }
}
