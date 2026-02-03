package defpackage;

import androidx.compose.foundation.layout.WrapContentElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehz {
    public static final WrapContentElement a(final icc iccVar) {
        return new WrapContentElement(1, new fdat() { // from class: ehx
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return new kjb(iccVar.a(0, (int) (((kjg) obj).a & 4294967295L)) & 4294967295L);
            }
        }, iccVar);
    }

    public static final WrapContentElement b(final iby ibyVar) {
        return new WrapContentElement(3, new fdat() { // from class: ehy
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return new kjb(ibyVar.a(0L, ((kjg) obj).a, (kji) obj2));
            }
        }, ibyVar);
    }

    public static final WrapContentElement c(final ibx ibxVar) {
        return new WrapContentElement(2, new fdat() { // from class: ehw
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return new kjb(ibxVar.a(0, (int) (((kjg) obj).a >> 32), (kji) obj2) << 32);
            }
        }, ibxVar);
    }
}
