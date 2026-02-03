package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbw implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dax daxVar = (dax) obj;
        dax daxVar2 = (dax) obj2;
        return fcxl.a(Float.valueOf((daxVar.a() == 0.0f && (daxVar instanceof dbm) && ((dbm) daxVar).i == null) ? -1.0f : daxVar.a()), Float.valueOf((daxVar2.a() == 0.0f && (daxVar2 instanceof dbm) && ((dbm) daxVar2).i == null) ? -1.0f : daxVar2.a()));
    }
}
