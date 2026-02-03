package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dron extends qya {
    private final dror a = null;
    private final long b = 0;

    public static final /* synthetic */ boolean a(Object obj) {
        if (!(obj instanceof dron)) {
            return false;
        }
        dron dronVar = (dron) obj;
        long j = dronVar.b;
        dror drorVar = dronVar.a;
        return Objects.equals(null, null);
    }

    public final boolean equals(Object obj) {
        return a(obj);
    }

    public final int hashCode() {
        return Objects.hashCode(null);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {null, 0L};
        String[] strArrSplit = "recentEmojiProvider;itemFetchingTimeoutMs".split(";");
        StringBuilder sb = new StringBuilder("dron[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
