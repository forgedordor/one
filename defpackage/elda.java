package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
final class elda implements eldb {
    public static final elda a;
    private static final /* synthetic */ elda[] b;

    static {
        elda eldaVar = new elda();
        a = eldaVar;
        b = new elda[]{eldaVar};
    }

    private elda() {
    }

    public static elda[] values() {
        return (elda[]) b.clone();
    }

    @Override // defpackage.eldb
    public final /* synthetic */ long a(byte[] bArr, int i) {
        if (ordinal() == 0) {
            return eonh.c(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
        }
        throw null;
    }
}
