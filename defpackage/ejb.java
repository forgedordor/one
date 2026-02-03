package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejb {
    public static final int a(eja ejaVar) {
        List listI = ejaVar.i();
        int size = listI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((eji) listI.get(i2)).h;
        }
        return (i / listI.size()) + ejaVar.c();
    }
}
