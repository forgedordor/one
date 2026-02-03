package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgl implements Comparator, Serializable {
    private static final long serialVersionUID = 5305467873966684014L;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ffgp) obj).a.compareToIgnoreCase(((ffgp) obj2).a);
    }
}
