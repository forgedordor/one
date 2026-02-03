package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqt {
    public final auy a;
    public final awa b;
    public final boolean c;

    public aqt(auy auyVar) {
        this.a = auyVar;
        this.b = awa.b(auyVar);
        int[] iArr = (int[]) auyVar.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int i = 0;
            while (true) {
                if (i >= iArr.length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.c = z;
    }

    public static azv a(azv azvVar, Collection collection, Set set) {
        if (azvVar.h == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            azv azvVar2 = (azv) it.next();
            lcg.j(azvVar2, "Fully specified DynamicRange cannot be null.");
            int i = azvVar2.h;
            lcg.d(azvVar2.b(), "Fully specified DynamicRange must have fully defined encoding.");
            if (i != 1 && d(azvVar, azvVar2, set)) {
                return azvVar2;
            }
        }
        return null;
    }

    public static void b(Set set, azv azvVar, awa awaVar) {
        lcg.d(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set setB = awaVar.a.b(azvVar);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setB);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", azvVar, TextUtils.join("\n  ", setB), TextUtils.join("\n  ", hashSet)));
        }
    }

    public static boolean c(azv azvVar, azv azvVar2) {
        lcg.d(azvVar2.b(), "Fully specified range is not actually fully specified.");
        int i = azvVar.h;
        if (i == 2) {
            if (azvVar2.h == 1) {
                return false;
            }
            i = 2;
        }
        if (i != 2 && i != 0 && i != azvVar2.h) {
            return false;
        }
        int i2 = azvVar.i;
        return i2 == 0 || i2 == azvVar2.i;
    }

    public static boolean d(azv azvVar, azv azvVar2, Set set) {
        if (set.contains(azvVar2)) {
            return c(azvVar, azvVar2);
        }
        bbs.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", azvVar, azvVar2));
        return false;
    }
}
