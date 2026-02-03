package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erfm {
    public static final /* synthetic */ int a = 0;
    private static final erwn b = erwn.b(new byte[0]);
    private final Map c;

    public erfm(Map map) {
        this.c = map;
    }

    public final Iterable a(byte[] bArr) {
        Map map = this.c;
        List list = (List) map.get(b);
        List list2 = bArr.length >= 5 ? (List) map.get(erwn.d(bArr, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new erfj(list2, list);
    }
}
