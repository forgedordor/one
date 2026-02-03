package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elax {
    public static int a(List list, ekzq ekzqVar) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == ekzqVar) {
                return i;
            }
        }
        return -1;
    }
}
