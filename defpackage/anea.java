package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anea {
    public static ajlq a(int i) {
        if (i != 1) {
            if (i == 2) {
                return ajlq.DELIVERED;
            }
            if (i != 4 && i != 5 && i != 6 && i != 7 && i != 10) {
                if (i == 11) {
                    return ajlq.SEEN;
                }
                if (i != 14 && i != 15) {
                    if (i != 20) {
                        return ajlq.ERROR;
                    }
                }
            }
            return ajlq.SENDING;
        }
        return ajlq.SENT;
    }
}
