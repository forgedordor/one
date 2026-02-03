package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhu {
    public static bhr a(bhr... bhrVarArr) {
        List listAsList = Arrays.asList(bhrVarArr);
        return listAsList.isEmpty() ? new bht() : listAsList.size() == 1 ? (bhr) listAsList.get(0) : new bhs(listAsList);
    }
}
