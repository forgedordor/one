package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfak extends ArrayList {
    private static final long serialVersionUID = -2638269606726558526L;
    public dfae a;

    public dfak(dfae dfaeVar) {
        dfaeVar.getClass();
        this.a = dfaeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional a(String str, crmx crmxVar) {
        String strK = dhjv.k(str, crmxVar);
        int size = size();
        for (int i = 0; i < size; i++) {
            dfaj dfajVar = (dfaj) get(i);
            String str2 = dfajVar.g;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(strK) && str2.contains(strK)) {
                return Optional.of(dfajVar);
            }
        }
        return Optional.empty();
    }

    public final boolean b() {
        if (this.a != dfae.NONE) {
            return true;
        }
        dhja.q("Invalid user list. State is NONE.", new Object[0]);
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dfak)) {
            return false;
        }
        dfak dfakVar = (dfak) obj;
        if (this.a == dfakVar.a) {
            return super.equals(dfakVar);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "State: " + String.valueOf(this.a) + ", Elements: " + Arrays.toString(toArray());
    }
}
