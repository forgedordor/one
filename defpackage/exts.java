package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exts extends extv {
    public final ekih a;
    private final int b;

    public exts(ekih ekihVar) throws extl {
        ekihVar.getClass();
        this.a = ekihVar;
        ekqg ekqgVarListIterator = ekihVar.entrySet().listIterator();
        int i = 0;
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            int iB = ((extv) entry.getKey()).b();
            i = i < iB ? iB : i;
            int iB2 = ((extv) entry.getValue()).b();
            if (i < iB2) {
                i = iB2;
            }
        }
        int i2 = i + 1;
        this.b = i2;
        if (i2 > 8) {
            throw new extl("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.extv
    protected final int a() {
        return c((byte) -96);
    }

    @Override // defpackage.extv
    protected final int b() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iCompareTo;
        int size;
        int size2;
        extv extvVar = (extv) obj;
        if (a() != extvVar.a()) {
            size = a();
            size2 = extvVar.a();
        } else {
            ekih ekihVar = this.a;
            int size3 = ekihVar.size();
            ekih ekihVar2 = ((exts) extvVar).a;
            if (size3 == ekihVar2.size()) {
                ekqg ekqgVarListIterator = ekihVar.entrySet().listIterator();
                ekqg ekqgVarListIterator2 = ekihVar2.entrySet().listIterator();
                do {
                    if (!ekqgVarListIterator.hasNext() && !ekqgVarListIterator2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    Map.Entry entry2 = (Map.Entry) ekqgVarListIterator2.next();
                    int iCompareTo2 = ((extv) entry.getKey()).compareTo((extv) entry2.getKey());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                    iCompareTo = ((extv) entry.getValue()).compareTo((extv) entry2.getValue());
                } while (iCompareTo == 0);
                return iCompareTo;
            }
            size = ekihVar.size();
            size2 = ekihVar2.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ekmi.m(this.a, ((exts) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    public final String toString() throws IOException {
        ekih ekihVar = this.a;
        if (ekihVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ekqg ekqgVarListIterator = ekihVar.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            linkedHashMap.put(((extv) entry.getKey()).toString().replace("\n", "\n  "), ((extv) entry.getValue()).toString().replace("\n", "\n  "));
        }
        ejwb ejwbVar = new ejwb(new ejwc(",\n  "), " : ");
        StringBuilder sb = new StringBuilder("{\n  ");
        ejwbVar.b(sb, linkedHashMap.entrySet());
        sb.append("\n}");
        return sb.toString();
    }
}
