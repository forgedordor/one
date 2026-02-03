package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxq {
    private static final List a;
    private static final int b;

    static {
        List listG = fcva.g(6, 2, 10, 8, 11, 7, 12);
        a = listG;
        b = listG.indexOf(2);
    }

    public static final int a(List list) {
        if (list.isEmpty()) {
            return 6;
        }
        List list2 = a;
        int iIndexOf = list2.indexOf(Integer.valueOf(((aobo) ((ResolvedRecipient) list.get(0)).m()).d));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIndexOf2 = list2.indexOf(Integer.valueOf(((aobo) ((ResolvedRecipient) it.next()).m()).d));
            if (iIndexOf2 <= 0) {
                return 6;
            }
            int i = b;
            if ((iIndexOf2 == i || iIndexOf == i) && iIndexOf != iIndexOf2) {
                return 6;
            }
            iIndexOf = Math.min(iIndexOf2, iIndexOf);
        }
        return ((Number) list2.get(iIndexOf)).intValue();
    }
}
