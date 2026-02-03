package defpackage;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
final class eonj implements Comparator {
    public static final eonj a;
    private static final /* synthetic */ eonj[] b;

    static {
        eonj eonjVar = new eonj();
        a = eonjVar;
        b = new eonj[]{eonjVar};
    }

    private eonj() {
    }

    public static eonj[] values() {
        return (eonj[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int iA = eoni.a(bArr[i]) - eoni.a(bArr2[i]);
            if (iA != 0) {
                return iA;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
