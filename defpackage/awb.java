package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awb implements avz {
    private final DynamicRangeProfiles a;

    public awb(Object obj) {
        this.a = ja$$ExternalSyntheticApiModelOutline0.m551m(obj);
    }

    private static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            azv azvVarA = avy.a(jLongValue);
            lcg.j(azvVarA, a.u(jLongValue, "Dynamic range profile cannot be converted to a DynamicRange object: "));
            hashSet.add(azvVarA);
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.avz
    public final DynamicRangeProfiles a() {
        return this.a;
    }

    @Override // defpackage.avz
    public final Set b(azv azvVar) {
        DynamicRangeProfiles dynamicRangeProfiles = this.a;
        Long lB = avy.b(azvVar, dynamicRangeProfiles);
        Objects.toString(azvVar);
        lcg.b(lB != null, "DynamicRange is not supported: ".concat(String.valueOf(azvVar)));
        return d(dynamicRangeProfiles.getProfileCaptureRequestConstraints(lB.longValue()));
    }

    @Override // defpackage.avz
    public final Set c() {
        return d(this.a.getSupportedProfiles());
    }
}
