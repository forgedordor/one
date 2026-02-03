package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezo {
    public static final void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            ebs.c(a.z(i2, i, "both minLines ", " and maxLines ", " must be greater than zero"));
        }
        if (i <= i2) {
            return;
        }
        ebs.c(a.s(i2, i, "minLines ", " must be less than or equal to maxLines "));
    }
}
