package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpim {
    public static /* synthetic */ cpin a(boolean z, String str, boolean z2, boolean z3, cryl crylVar, int i, int i2, int i3, int i4) {
        int i5 = (i4 & 256) != 0 ? 2 : i3;
        if (i5 == 0) {
            throw null;
        }
        return new cpin(z, str, (!((i4 & 8) == 0)) | z2, ((i4 & 16) == 0) & z3, (i4 & 32) != 0 ? null : crylVar, i, i2, i5, false, null);
    }
}
